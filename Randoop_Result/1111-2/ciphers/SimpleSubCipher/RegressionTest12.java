package ciphers.SimpleSubCipher;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

    public static boolean debug = false;

    @Test
    public void test06001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06001");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!!!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!!!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!!!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!!!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!", "\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\200}}`\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~\200\276\276\276\276~~\200\276\276\276\276~~!~\200\276\276\276\276~~\200\276\276\276\276~~!!!~\200\276\276\276\276~~\200\276\276\276\276~~!~\200\276\276\276\276~~\200\276\276\276\276~~!!!~\200\276\276\276\276~~\200\276\276\276\276~~!~\200\276\276\276\276~~\200\276\276\276\276~~!~\200\276\276\276\276~~\200\276\276\276\276~~!~\200\276\276\276\276~~\200\276\276\276\276~~!!!~\200\276\276\276\276~~\200\276\276\276\276~~!~\200\276\276\276\276~~\200\276\276\276\276~~!!!~\200\276\276\276\276~~\200\276\276\276\276~~!~\200\276\276\276\276~~\200\276\276\276\276~~!" + "'", str2, "!~\200\276\276\276\276~~\200\276\276\276\276~~!~\200\276\276\276\276~~\200\276\276\276\276~~!!!~\200\276\276\276\276~~\200\276\276\276\276~~!~\200\276\276\276\276~~\200\276\276\276\276~~!!!~\200\276\276\276\276~~\200\276\276\276\276~~!~\200\276\276\276\276~~\200\276\276\276\276~~!~\200\276\276\276\276~~\200\276\276\276\276~~!~\200\276\276\276\276~~\200\276\276\276\276~~!!!~\200\276\276\276\276~~\200\276\276\276\276~~!~\200\276\276\276\276~~\200\276\276\276\276~~!!!~\200\276\276\276\276~~\200\276\276\276\276~~!~\200\276\276\276\276~~\200\276\276\276\276~~!");
    }

    @Test
    public void test06002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06002");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NNNNNNNNNNNNNNNN\200}}`NNNNNNNNNNNNNNNN]]!", "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\200}}`\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214]]!" + "'", str2, "\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\200}}`\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214]]!");
    }

    @Test
    public void test06003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06003");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!", "]]]]]]]]!!]]]]]]]]!!]]]]]]]]]]]]]]]]!!]]]]]]]]!!]]]]]]]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test06004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06004");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275nullnullnullnullnullnullnullnullnullnullnullnull\276nullnullnullnull\275\275!", "nullnullnullnullnullnullnullnullnullnull\340\340nullnull\340\340nullnullnullnullnullnullnullnullnullnull\340\340nullnull\340\340nullnullnullnullnullnullnullnullnullnull\340\340nullnull\340\340nullnullnullnullnullnullnullnullnullnull\340\340nullnull\340\340nullnullnullnullnullnullnullnullnullnull\340\340nullnull\340\340nullnullnullnullnullnullnullnullnullnull\340\340nullnull\340\340nullnullnullnullnullnullnullnullnullnull\340\340nullnull\340\340nullnullnullnullnullnullnullnullnullnull\340\340nullnull\340\340!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU\276LNUULNUULNUULNUU\275\275!" + "'", str2, "\275LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU\276LNUULNUULNUULNUU\275\275!");
    }

    @Test
    public void test06005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06005");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!LLLLLLLLLLLLLLLL!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06006");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200!U!!!!!^!U!!!!!!U!!!!!!U!!!!!^!U!!!!!!U!!!!!}~\200\200}~\200\200!U!!!!!^!U!!!!!!U!!!!!!U!!!!!^!U!!!!!!U!!!!!!", "]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200!]!!!!!^!]!!!!!!]!!!!!!]!!!!!^!]!!!!!!]!!!!!}~\200\200}~\200\200!]!!!!!^!]!!!!!!]!!!!!!]!!!!!^!]!!!!!!]!!!!!!" + "'", str2, "}~\200\200}~\200\200!]!!!!!^!]!!!!!!]!!!!!!]!!!!!^!]!!!!!!]!!!!!}~\200\200}~\200\200!]!!!!!^!]!!!!!!]!!!!!!]!!!!!^!]!!!!!!]!!!!!!");
    }

    @Test
    public void test06007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06007");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU\276LNUULNUULNUULNUU\275\275!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\276nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\275\275!" + "'", str2, "\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\276nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\275\275!");
    }

    @Test
    public void test06008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06008");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "\255\256\260\260\236\276\276\255\256\260\260\236\276\276!!\255\256\260\260\236\276\276\255\256\260\260\236\276\276!!\255\256\260\260\236\276\276\255\256\260\260\236\276\276\255\256\260\260\236\276\276\255\256\260\260\236\276\276!!\255\256\260\260\236\276\276\255\256\260\260\236\276\276!!\255\256\260\260\236\276\276\255\256\260\260\236\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06009");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnull}~\200\200}~\200\200nullnull}~\200\200}~\200\200nullnull}~\200\200}~\200\200\u0348\u0346\u0346!", "H!!!H!!!H!!!H!!!H!!!H!!!H!!!H!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull}~\200\200}~\200\200\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull}~\200\200}~\200\200\u0348\u0346\u0346!");
    }

    @Test
    public void test06010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06010");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225!", "\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\200}}`\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225!" + "'", str2, "\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225!");
    }

    @Test
    public void test06011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06011");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\225\230\230null\225\230\230null\225\230\230null\225\230\230\200}}`null\225\230\230null\225\230\230null\225\230\230null\225\230\230]]!", "}~\200\200}~\200\200LUUULUUULUUULUUULUUULUUULUUULUUU}~\200\200}~\200\200LUUULUUULUUULUUULUUULUUULUUULUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\260\255\255\225\230\230null\260\255\255\225\230\230null\260\255\255\225\230\230null\260\255\255\225\230\230\200}}`null\260\255\255\225\230\230null\260\255\255\225\230\230null\260\255\255\225\230\230null\260\255\255\225\230\230]]!" + "'", str2, "null\260\255\255\225\230\230null\260\255\255\225\230\230null\260\255\255\225\230\230null\260\255\255\225\230\230\200}}`null\260\255\255\225\230\230null\260\255\255\225\230\230null\260\255\255\225\230\230null\260\255\255\225\230\230]]!");
    }

    @Test
    public void test06012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06012");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("RTTT\256\254\254RTTT\256\254\254!!RTTT\256\254\254RTTT\256\254\254!!RTTT\256\254\254RTTT\256\254\254!!RTTT\256\254\254RTTT\256\254\254!!RTTT\256\254\254RTTT\256\254\254!!RTTT\256\254\254RTTT\256\254\254!!RTTT\256\254\254RTTT\256\254\254!!RTTT\256\254\254RTTT\256\254\254!!!", "!!nullnull!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!nullnull!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!!" + "'", str2, "nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!!");
    }

    @Test
    public void test06013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06013");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!", "!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!" + "'", str2, "\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!");
    }

    @Test
    public void test06014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06014");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!", "\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204\200}}`\201\204\204\204\201\204\204\204\201\204\204\204\201\204\204\204]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!" + "'", str2, "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!");
    }

    @Test
    public void test06015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06015");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULL!", "efhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnull!!efhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnull!!efhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnull!!efhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnull!!efhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348!" + "'", str2, "\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348!");
    }

    @Test
    public void test06016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06016");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("`}UU`}UU`}UU`}UU`}UU!", "\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316!!\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316!!\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316!!\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316!!\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`}nullnull`}nullnull`}nullnull`}nullnull`}nullnull!" + "'", str2, "`}nullnull`}nullnull`}nullnull`}nullnull`}nullnull!");
    }

    @Test
    public void test06017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06017");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!", "nullnullnullnull\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!!" + "'", str2, "mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!!");
    }

    @Test
    public void test06018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06018");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!", "!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LL!!LLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LL!!LLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LL!!LLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LL!!LLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LL!" + "'", str2, "LLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LL!!LLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LL!!LLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LL!!LLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LL!!LLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LL!");
    }

    @Test
    public void test06019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06019");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226!!UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226!!nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226!!!" + "'", str2, "nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226!!nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226!!!");
    }

    @Test
    public void test06020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06020");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!", "NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!" + "'", str2, "!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!");
    }

    @Test
    public void test06021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06021");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u016e\u0170\u0170\u0170\u016c\u016c\u016c\u016c\u016e\u0170\u0170\u0170\u016c\u016cLL!", "\215}\215\215\215}\215\215\u017d\u0180\u0180\u0180\u017d\u0180\u0180\u0180\u017d\u0180\u0180\u0180\u017d\u0180\u0180\u0180\215}\215\215\215}\215\215!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u017d\u0243\u0243\u017d\u0243\u0243\u017d\u0243\u0243\u017d\u0243\u0243\u017d\u0243\u0243\u017d\u0243\u0243!" + "'", str2, "\u017d\u0243\u0243\u017d\u0243\u0243\u017d\u0243\u0243\u017d\u0243\u0243\u017d\u0243\u0243\u017d\u0243\u0243!");
    }

    @Test
    public void test06022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06022");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275``\230\230\230\230\230\230\230\230``\230\230\230\230\230\230\230\230``\230\230\230\230\230\230\230\230\276``\230\230\230\230\230\230\230\230\275\275!", "\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!\216\216N!!!N!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275``\230\230\230\230\230\230\230\230``\230\230\230\230\230\230\230\230``\230\230\230\230\230\230\230\230\276``\230\230\230\230\230\230\230\230\275\275!" + "'", str2, "\275``\230\230\230\230\230\230\230\230``\230\230\230\230\230\230\230\230``\230\230\230\230\230\230\230\230\276``\230\230\230\230\230\230\230\230\275\275!");
    }

    @Test
    public void test06023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06023");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275NNN\275NNN!", "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\u03e6\u03e6\u03e6\275\u03e6\u03e6\u03e6!" + "'", str2, "\275\u03e6\u03e6\u03e6\275\u03e6\u03e6\u03e6!");
    }

    @Test
    public void test06024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06024");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0129\u0129\u0129\u0129\u0146\u0147\u0149\u0149\u0146\u0147\u0149\u0149\u0146\u0147\u0149\u0149\u0146\u0147\u0149\u0149\u0129\u0129\u0129\u0129\u0146\u0147\u0149\u0149\u0146\u0147\u0149\u0149!", "\u0317\u031a\u0317\u031a\u0317\u031a\u0317\u031anullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06025");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300!", "``JJ``JJ!!``JJ``JJ!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06026");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("`!!nullnull!!nullnull!!nullnull`!!nullnull!!nullnull!!nullnull!", "\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`!!UN\336\336UN\336\336!!UN\336\336UN\336\336!!UN\336\336UN\336\336`!!UN\336\336UN\336\336!!UN\336\336UN\336\336!!UN\336\336UN\336\336!" + "'", str2, "`!!UN\336\336UN\336\336!!UN\336\336UN\336\336!!UN\336\336UN\336\336`!!UN\336\336UN\336\336!!UN\336\336UN\336\336!!UN\336\336UN\336\336!");
    }

    @Test
    public void test06027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06027");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\276L\225\225\276L\225\225\200\200\276L\225\225\276L\225\225\200\200\276L\225\225\276L\225\225\200\200\276\276L\225\225\276L\225\225\200\200\275\275!", "NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276\u02fa\225\225\276\u02fa\225\225\200\200\276\u02fa\225\225\276\u02fa\225\225\200\200\276\u02fa\225\225\276\u02fa\225\225\200\200\276\276\u02fa\225\225\276\u02fa\225\225\200\200\275\275!" + "'", str2, "\275\276\u02fa\225\225\276\u02fa\225\225\200\200\276\u02fa\225\225\276\u02fa\225\225\200\200\276\u02fa\225\225\276\u02fa\225\225\200\200\276\276\u02fa\225\225\276\u02fa\225\225\200\200\275\275!");
    }

    @Test
    public void test06028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06028");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```!", "nullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```!" + "'", str2, "OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```!");
    }

    @Test
    public void test06029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06029");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\253\254\256\256null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!\253\254\256\256null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!", "EEEEEEEE!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\253\254\256\256nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!" + "'", str2, "\253\254\256\256nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\253\254\256\256nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!");
    }

    @Test
    public void test06030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06030");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!", "hfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnullhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnullhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnullhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnullhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnullhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnullhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnullhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!" + "'", str2, "!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!");
    }

    @Test
    public void test06031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06031");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!", "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230\200}}`UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!" + "'", str2, "!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!");
    }

    @Test
    public void test06032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06032");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("HH!!HH!!HHHH!!HH!!HH!", "}~\200\200}~\200\200LUELLUELLUELL^LUELLUELLUELLLUELLUELLUELLLUELLUELLUELL^LUELLUELLUELLLUELLUELLUELL}~\200\200}~\200\200LUELLUELLUELL^LUELLUELLUELLLUELLUELLUELLLUELLUELLUELL^LUELLUELLUELLLUELLUELLUELL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull!" + "'", str2, "nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test06033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06033");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLLLLLLL!!LLLLLLLL!!!", "]]\300\300]]\300\300!!]]\300\300]]\300\300!!]]\300\300]]\300\300]]\300\300]]\300\300!!]]\300\300]]\300\300!!]]\300\300]]\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]]]]]]]!!]]]]]]]]!!!" + "'", str2, "]]]]]]]]!!]]]]]]]]!!!");
    }

    @Test
    public void test06034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06034");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}!\200\200}!\200\200}!\200\200}!\200\200\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215}!\200\200}!\200\200}!\200\200}!\200\200\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215!", "!null!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}!\200\200}!\200\200}!\200\200}!\200\200\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215}!\200\200}!\200\200}!\200\200}!\200\200\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215!" + "'", str2, "}!\200\200}!\200\200}!\200\200}!\200\200\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215}!\200\200}!\200\200}!\200\200}!\200\200\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215\230C\215\215!");
    }

    @Test
    public void test06035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06035");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!", "!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]\220!!\200~~]\220!!\200~~]\220!!]\220!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!!" + "'", str2, "]\220!!\200~~]\220!!\200~~]\220!!]\220!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!!");
    }

    @Test
    public void test06036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06036");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NLLLNLLL]]NLLLNLLL]]NLLLNLLL]]NLLLNLLL]]~}}^NLLLNLLL]]NLLLNLLL]]NLLLNLLL]]NLLLNLLL]]]]!", "}H\200\200}H\200\200}H\200\200}H\200\200!HHH!HHH!HHH!HHH}H\200\200}H\200\200}H\200\200}H\200\200!HHH!HHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H\200\200\200H\200\200\200]]H\200\200\200H\200\200\200]]H\200\200\200H\200\200\200]]H\200\200\200H\200\200\200]]~}}^H\200\200\200H\200\200\200]]H\200\200\200H\200\200\200]]H\200\200\200H\200\200\200]]H\200\200\200H\200\200\200]]]]!" + "'", str2, "H\200\200\200H\200\200\200]]H\200\200\200H\200\200\200]]H\200\200\200H\200\200\200]]H\200\200\200H\200\200\200]]~}}^H\200\200\200H\200\200\200]]H\200\200\200H\200\200\200]]H\200\200\200H\200\200\200]]H\200\200\200H\200\200\200]]]]!");
    }

    @Test
    public void test06037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06037");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnull!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06038");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]]!!]]!!!!]]!!]]!!!!]]!!]]!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!", "}~\200\200}~\200\200LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU}~\200\200}~\200\200LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]!!]]!!!!]]!!]]!!!!]]!!]]!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!" + "'", str2, "]]!!]]!!!!]]!!]]!!!!]]!!]]!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!");
    }

    @Test
    public void test06039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06039");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06040");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]!" + "'", str2, "\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]!");
    }

    @Test
    public void test06041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06041");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014c\u016e\u016c\u016c\u016e\u016c\u016c\u014c\u016e\u016c\u016c\u016e\u016c\u016c\u014c\u016e\u016c\u016c\u016e\u016c\u016c\u014c\u016e\u016c\u016c\u016e\u016c\u016c\u014c\u016e\u016c\u016c\u016e\u016c\u016c!", "HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullHH!!nullnullnullHH!!nullnull!nullnullHH!!nullnullnullHH!!nullnull!nullnullHH!!nullnullnullHH!!nullnull!nullnullHH!!nullnullnullHH!!nullnull!nullnullHH!!nullnullnullHH!!nullnull!" + "'", str2, "!nullnullHH!!nullnullnullHH!!nullnull!nullnullHH!!nullnullnullHH!!nullnull!nullnullHH!!nullnullnullHH!!nullnull!nullnullHH!!nullnullnullHH!!nullnull!nullnullHH!!nullnullnullHH!!nullnull!");
    }

    @Test
    public void test06042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06042");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335}~\200\200}~\200\200!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335!", "\u0366\u0365\u0368\u0368\214\214!!\214\214!!\214\214!!\214\214\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull}~\200\200}~\200\200!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!" + "'", str2, "}~\200\200}~\200\200!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull}~\200\200}~\200\200!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
    }

    @Test
    public void test06043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06043");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366!", "!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366!" + "'", str2, "\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366!");
    }

    @Test
    public void test06044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06044");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0200\u0200\u01fb\u01fc\u01fe\u01fe\u01fb\u01fc\u01fe\u01fe\u01fb\u01fc\u01fe\u01fe\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u01fb\u01fc\u01fe\u01fe\u01fb\u01fc\u01fe\u01fe\u01fb\u01fc\u01fe\u01fe\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200!!!", "\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016enullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test06045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06045");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06046");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275HHH\276H\275\275!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnull\276null\275\275!" + "'", str2, "\275nullnullnull\276null\275\275!");
    }

    @Test
    public void test06047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06047");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200\276\271\271\271^\276\271\271\271\276\271\271\271\276\271\271\271^\276\271\271\271\276\271\271\271}~\200\200}~\200\200\276\271\271\271^\276\271\271\271\276\271\271\271\276\271\271\271^\276\271\271\271\276\271\271\271!", "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200\276\271\271\271^\276\271\271\271\276\271\271\271\276\271\271\271^\276\271\271\271\276\271\271\271}~\200\200}~\200\200\276\271\271\271^\276\271\271\271\276\271\271\271\276\271\271\271^\276\271\271\271\276\271\271\271!" + "'", str2, "}~\200\200}~\200\200\276\271\271\271^\276\271\271\271\276\271\271\271\276\271\271\271^\276\271\271\271\276\271\271\271}~\200\200}~\200\200\276\271\271\271^\276\271\271\271\276\271\271\271\276\271\271\271^\276\271\271\271\276\271\271\271!");
    }

    @Test
    public void test06048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06048");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("X!UUX!UUX!UUX!UUX!UUX!UUX!UUX!UU!", "]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]!" + "'", str2, "]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]!");
    }

    @Test
    public void test06049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06049");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH!!\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH!!\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH!!\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH!!\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06050");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("XXXXXXXX!!XXXXXXXX!!XXXXXXXXXXXXXXXX!!XXXXXXXX!!XXXXXXXX!", "UULLUULL!!UULLUULL!!UULLUULLUULLUULL!!UULLUULL!!UULLUULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06051");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!!", "LLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!!" + "'", str2, "LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!!");
    }

    @Test
    public void test06052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06052");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt!", "qrttqrttqrttqrttqrtt!!!qrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrtt!!!qrttqrttqrttqrttqrttqrttqrttqrtt!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316!" + "'", str2, "\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316!");
    }

    @Test
    public void test06053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06053");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!!", "!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!" + "'", str2, "!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!");
    }

    @Test
    public void test06054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06054");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200nullLLNNLLNNLLNN^nullLLNNLLNNLLNNnullLLNNLLNNLLNNnullLLNNLLNNLLNN^nullLLNNLLNNLLNNnullLLNNLLNNLLNN}~\200\200}~\200\200nullLLNNLLNNLLNN^nullLLNNLLNNLLNNnullLLNNLLNNLLNNnullLLNNLLNNLLNN^nullLLNNLLNNLLNNnullLLNNLLNNLLNN!", "N~LLN~LL!!N~LLN~LL!!N~LLN~LLN~LLN~LL!!N~LLN~LL!!N~LLN~LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200\225null\230\230xxuuxxuuxxuu^\225null\230\230xxuuxxuuxxuu\225null\230\230xxuuxxuuxxuu\225null\230\230xxuuxxuuxxuu^\225null\230\230xxuuxxuuxxuu\225null\230\230xxuuxxuuxxuu}~\200\200}~\200\200\225null\230\230xxuuxxuuxxuu^\225null\230\230xxuuxxuuxxuu\225null\230\230xxuuxxuuxxuu\225null\230\230xxuuxxuuxxuu^\225null\230\230xxuuxxuuxxuu\225null\230\230xxuuxxuuxxuu!" + "'", str2, "}~\200\200}~\200\200\225null\230\230xxuuxxuuxxuu^\225null\230\230xxuuxxuuxxuu\225null\230\230xxuuxxuuxxuu\225null\230\230xxuuxxuuxxuu^\225null\230\230xxuuxxuuxxuu\225null\230\230xxuuxxuuxxuu}~\200\200}~\200\200\225null\230\230xxuuxxuuxxuu^\225null\230\230xxuuxxuuxxuu\225null\230\230xxuuxxuuxxuu\225null\230\230xxuuxxuuxxuu^\225null\230\230xxuuxxuuxxuu\225null\230\230xxuuxxuuxxuu!");
    }

    @Test
    public void test06055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06055");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]\220!!\200~~]\220!!\200~~]\220!!]\220!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200u!llnullnullnullu!llnullnullnull}~\200\200}~\200\200u!llnullnullnullu!llnullnullnull}~\200\200}~\200\200u!llnullnullnullu!llnullnullnull}~\200\200}~\200\200\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]\220!!\200~~]\220!!\200~~]\220!!]\220!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!!" + "'", str2, "]\220!!\200~~]\220!!\200~~]\220!!]\220!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!!");
    }

    @Test
    public void test06056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06056");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276\276\275\275\275\275\276\276!", "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276\275\275\275\275\276\276!" + "'", str2, "\276\276\275\275\275\275\276\276!");
    }

    @Test
    public void test06057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06057");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0289\u028a\u028c\u028c!", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnull!" + "'", str2, "!nullnullnullnull!");
    }

    @Test
    public void test06058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06058");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "LNUULNUULNUULNUULNUULNUULNUULNUU!!LNUULNUULNUULNUULNUULNUULNUULNUU!!LNUULNUULNUULNUULNUULNUULNUULNUU!!LNUULNUULNUULNUULNUULNUULNUULNUU!!LNUULNUULNUULNUULNUULNUULNUULNUU!!LNUULNUULNUULNUULNUULNUULNUULNUU!!LNUULNUULNUULNUULNUULNUULNUULNUU!!LNUULNUULNUULNUULNUULNUULNUULNUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test06059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06059");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06060");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnullnull\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!", "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200\200~~~}\200\200\200~~~}\200\200~}\200\200~}\200\200\200~~~}\200\200\200~~~}\200\200~}\200\200!!~}\200\200\200~~~}\200\200\200~~~}\200\200~}\200\200~}\200\200\200~~~}\200\200\200~~~}\200\200~}\200\200!!~}\200\200\200~~~}\200\200\200~~~}\200\200~}\200\200~}\200\200\200~~~}\200\200\200~~~}\200\200~}\200\200~}\200\200\200~~~}\200\200\200~~~}\200\200~}\200\200~}\200\200\200~~~}\200\200\200~~~}\200\200~}\200\200!!~}\200\200\200~~~}\200\200\200~~~}\200\200~}\200\200~}\200\200\200~~~}\200\200\200~~~}\200\200~}\200\200!!~}\200\200\200~~~}\200\200\200~~~}\200\200~}\200\200~}\200\200\200~~~}\200\200\200~~~}\200\200~}\200\200!" + "'", str2, "~}\200\200\200~~~}\200\200\200~~~}\200\200~}\200\200~}\200\200\200~~~}\200\200\200~~~}\200\200~}\200\200!!~}\200\200\200~~~}\200\200\200~~~}\200\200~}\200\200~}\200\200\200~~~}\200\200\200~~~}\200\200~}\200\200!!~}\200\200\200~~~}\200\200\200~~~}\200\200~}\200\200~}\200\200\200~~~}\200\200\200~~~}\200\200~}\200\200~}\200\200\200~~~}\200\200\200~~~}\200\200~}\200\200~}\200\200\200~~~}\200\200\200~~~}\200\200~}\200\200!!~}\200\200\200~~~}\200\200\200~~~}\200\200~}\200\200~}\200\200\200~~~}\200\200\200~~~}\200\200~}\200\200!!~}\200\200\200~~~}\200\200\200~~~}\200\200~}\200\200~}\200\200\200~~~}\200\200\200~~~}\200\200~}\200\200!");
    }

    @Test
    public void test06061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06061");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!\215\216\230\230null!!!null!!!null!!!!", "\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126nullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e!!!\215\216\230\230\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e!!!\215\216\230\230\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e!!!\215\216\230\230\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e!!!\215\216\230\230\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e!!!\215\216\230\230\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e!!!\215\216\230\230\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e!!!\215\216\230\230\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e!!!!" + "'", str2, "\215\216\230\230\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e!!!\215\216\230\230\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e!!!\215\216\230\230\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e!!!\215\216\230\230\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e!!!\215\216\230\230\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e!!!\215\216\230\230\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e!!!\215\216\230\230\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e!!!\215\216\230\230\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e!!!!");
    }

    @Test
    public void test06062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06062");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```!", "!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!" + "'", str2, "!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!");
    }

    @Test
    public void test06063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06063");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200!", "}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnull}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnull}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200!" + "'", str2, "null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnull}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnull}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200}null\200\200!");
    }

    @Test
    public void test06064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06064");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "efhhnullnullnullefhhnullnullnullefhhnullnullnullefhhnullnullnullefhhnullnullnullefhhnullnullnullefhhnullnullnullefhhnullnullnull!" + "'", str2, "efhhnullnullnullefhhnullnullnullefhhnullnullnullefhhnullnullnullefhhnullnullnullefhhnullnullnullefhhnullnullnullefhhnullnullnull!");
    }

    @Test
    public void test06065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06065");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!nullnull!", "!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!U!LLU!LL!" + "'", str2, "!!!U!LLU!LL!");
    }

    @Test
    public void test06066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06066");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!", "NLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!!" + "'", str2, "\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!!");
    }

    @Test
    public void test06067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06067");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!~TT!~TT!!!~TT!~TT!!!~TT!~TT!~TT!~TT!!!~TT!~TT!!!~TT!~TT!", "LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!" + "'", str2, "!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!");
    }

    @Test
    public void test06068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06068");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014e\u014e\u014e\u014e!!!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!!");
    }

    @Test
    public void test06069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06069");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUU!", "\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06070");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUU!", "\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256\254\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06071");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull}~\200\200}~\200\200\u0348\u0346\u0346!", "\u0366\u0365\u0368\u0368!!]]!!]]\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200\u0348\u0346\u0346!");
    }

    @Test
    public void test06072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06072");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\215\216\230\230\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e!!!\215\216\230\230\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e!!!\215\216\230\230\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e!!!\215\216\230\230\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e!!!\215\216\230\230\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e!!!\215\216\230\230\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e!!!\215\216\230\230\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e!!!\215\216\230\230\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e!!!!", "\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!" + "'", str2, "\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!");
    }

    @Test
    public void test06073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06073");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\253\256\256\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "LLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test06074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06074");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!\200}}`!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!]]!", "JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!\200}}`!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!]]!" + "'", str2, "!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!\200}}`!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!]]!");
    }

    @Test
    public void test06075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06075");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275!\276\276\275!\276\276!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!\276\276\275!\276\276!" + "'", str2, "\275!\276\276\275!\276\276!");
    }

    @Test
    public void test06076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06076");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420\u043d\u043e\u0440\u0440\u0420\u0420!!!", "\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test06077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06077");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!!", "\215}\215\215\215}\215\215nullnullnullnull\215}\215\215\215}\215\215!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "VVXXVVXX!!VVXXVVXX!!VVXXVVXX!!VVXXVVXX!!VVXXVVXX!!VVXXVVXX!!VVXXVVXX!!VVXXVVXX!!!" + "'", str2, "VVXXVVXX!!VVXXVVXX!!VVXXVVXX!!VVXXVVXX!!VVXXVVXX!!VVXXVVXX!!VVXXVVXX!!VVXXVVXX!!!");
    }

    @Test
    public void test06078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06078");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull!", "UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU!" + "'", str2, "\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU!");
    }

    @Test
    public void test06079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06079");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7!", "nullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXX!!nullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXX!!nullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXX!!nullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXX!!nullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06080");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!!", "\u0366\u0365\u0368\u0368\u0220\u021d\u021d\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!!" + "'", str2, "}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270}^\270\270!!!");
    }

    @Test
    public void test06081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06081");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368LL!!LL!!\200\200\u0346\u0348\u0348!", "\326\325\330\330\325\326\330\330!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368nullnull!!nullnull!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368nullnull!!nullnull!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test06082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06082");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull!!nullnull!!!", "``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!!``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!!``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!!``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!!``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test06083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06083");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "}}}}}}}}!!!!}}}}}}}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test06084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06084");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull!!\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull!!\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull!!\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull!!\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!" + "'", str2, "\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
    }

    @Test
    public void test06085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06085");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06086");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnull!", "nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!!nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!!nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!!nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!!nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ULLL!ULLLULLLULLL!ULLLULLLULLLULLLULLL!ULLLULLLULLL!ULLLULLLULLLULLLULLL!ULLLULLLULLL!ULLLULLLULLLULLLULLL!ULLLULLLULLL!ULLLULLLULLLULLLULLL!ULLLULLLULLL!ULLLULLLULLLULLLULLL!ULLLULLLULLL!ULLLULLLULLLULLLULLL!ULLLULLLULLL!ULLLULLLULLLULLLULLL!ULLLULLLULLL!ULLLULLLULLLULLL!" + "'", str2, "ULLL!ULLLULLLULLL!ULLLULLLULLLULLLULLL!ULLLULLLULLL!ULLLULLLULLLULLLULLL!ULLLULLLULLL!ULLLULLLULLLULLLULLL!ULLLULLLULLL!ULLLULLLULLLULLLULLL!ULLLULLLULLL!ULLLULLLULLLULLLULLL!ULLLULLLULLL!ULLLULLLULLLULLLULLL!ULLLULLLULLL!ULLLULLLULLLULLLULLL!ULLLULLLULLL!ULLLULLLULLLULLL!");
    }

    @Test
    public void test06087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06087");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "UU!!````````````UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!````````````UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06088");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\275\u03e6\u03e6\u03e6\275\u03e6\u03e6\u03e6!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06089");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!", "!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06090");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NNUUNNUU!!NNUUNNUU!!NNUUNNUUNNUUNNUU!!NNUUNNUU!!NNUUNNUU!", "}L\200\200}L\200\200}L\200\200}L\200\200LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU}L\200\200}L\200\200}L\200\200}L\200\200LNUULNUULNUULNUULNUULNUULNUULNUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276\300\300\276\276\300\300!!\276\276\300\300\276\276\300\300!!\276\276\300\300\276\276\300\300\276\276\300\300\276\276\300\300!!\276\276\300\300\276\276\300\300!!\276\276\300\300\276\276\300\300!" + "'", str2, "\276\276\300\300\276\276\300\300!!\276\276\300\300\276\276\300\300!!\276\276\300\300\276\276\300\300\276\276\300\300\276\276\300\300!!\276\276\300\300\276\276\300\300!!\276\276\300\300\276\276\300\300!");
    }

    @Test
    public void test06091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06091");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("u}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}ll}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200u}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}ll}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200!", "`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u016e}nullnull\275\u016e\u016e\u016e}nullnull\275\u016e\u016e\u016e}nullnull\275\u016e\u016e\u016e}nullnull\275\u016e\u016e\u016e}nullnull\275\u016e\u016e\u016e}nullnull\275\u016e\u016e\u016e}nullnull\275\u016e\u016e\u016e}nullnull\275\u016e\u016e\u016e}nullnull\200\200\u016e}nullnull\200\200\u016e}nullnull\200\200\u016e}nullnull\200\200\u016e}nullnull\200\200\u016e}nullnull\200\200\u016e}nullnull\200\200\u016e}nullnull\200\200\u016e}nullnull\275\u016e\u016e\u016e}nullnull\275\u016e\u016e\u016e}nullnull\275\u016e\u016e\u016e}nullnull\275\u016e\u016e\u016e}nullnull\275\u016e\u016e\u016e}nullnull\275\u016e\u016e\u016e}nullnull\275\u016e\u016e\u016e}nullnull\275\u016e\u016e\u016e}nullnull\200\200\u016e}nullnull\200\200\u016e}nullnull\200\200\u016e}nullnull\200\200\u016e}nullnull\200\200\u016e}nullnull\200\200\u016e}nullnull\200\200\u016e}nullnull\200\200!" + "'", str2, "\u016e}nullnull\275\u016e\u016e\u016e}nullnull\275\u016e\u016e\u016e}nullnull\275\u016e\u016e\u016e}nullnull\275\u016e\u016e\u016e}nullnull\275\u016e\u016e\u016e}nullnull\275\u016e\u016e\u016e}nullnull\275\u016e\u016e\u016e}nullnull\275\u016e\u016e\u016e}nullnull\200\200\u016e}nullnull\200\200\u016e}nullnull\200\200\u016e}nullnull\200\200\u016e}nullnull\200\200\u016e}nullnull\200\200\u016e}nullnull\200\200\u016e}nullnull\200\200\u016e}nullnull\275\u016e\u016e\u016e}nullnull\275\u016e\u016e\u016e}nullnull\275\u016e\u016e\u016e}nullnull\275\u016e\u016e\u016e}nullnull\275\u016e\u016e\u016e}nullnull\275\u016e\u016e\u016e}nullnull\275\u016e\u016e\u016e}nullnull\275\u016e\u016e\u016e}nullnull\200\200\u016e}nullnull\200\200\u016e}nullnull\200\200\u016e}nullnull\200\200\u016e}nullnull\200\200\u016e}nullnull\200\200\u016e}nullnull\200\200\u016e}nullnull\200\200!");
    }

    @Test
    public void test06092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06092");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!", "!!~LNUULNUU!!!!~LNUULNUU!!!!!!~LNUULNUU!!!!~LNUULNUU!!!!!!~LNUULNUU!!!!~LNUULNUU!!!!~LNUULNUU!!!!~LNUULNUU!!!!!!~LNUULNUU!!!!~LNUULNUU!!!!!!~LNUULNUU!!!!~LNUULNUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
    }

    @Test
    public void test06093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06093");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx\230!\225\225\230!\225\225xx!", "LL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull!" + "'", str2, "\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull!");
    }

    @Test
    public void test06094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06094");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!!" + "'", str2, "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!!");
    }

    @Test
    public void test06095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06095");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!", "````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!");
    }

    @Test
    public void test06096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06096");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!", "!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!" + "'", str2, "!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!");
    }

    @Test
    public void test06097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06097");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\275!!\275\275!!!!\275\275!!\275\275!!!!!", "\u0348null!!\200\u0348null!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275!!\275\275!!!!\275\275!!\275\275!!!!!" + "'", str2, "\275\275!!\275\275!!!!\275\275!!\275\275!!!!!");
    }

    @Test
    public void test06098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06098");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0!", "NUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06099");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!", "!l!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
    }

    @Test
    public void test06100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06100");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!UUUUUUUUUUUUUUUU!", "nullnull\214\214nullnull\214\214!!nullnull\214\214nullnull\214\214!!nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214!!nullnull\214\214nullnull\214\214!!nullnull\214\214nullnull\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\274\274\274\274\274\274\274\274\274\274\274\274\274\274\274\274!" + "'", str2, "!\274\274\274\274\274\274\274\274\274\274\274\274\274\274\274\274!");
    }

    @Test
    public void test06101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06101");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!!!", "\275LLL\275LLL\275LLL\275LLLLL\275\275LL\275\275LL\275\275LL\275\275\275LLL\275LLL\275LLL\275LLLLL\275\275LL\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!!!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!!!" + "'", str2, "!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!!!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!!!");
    }

    @Test
    public void test06102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06102");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("``JJ``JJ!!``JJ``JJ!!!", "\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035bnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``nullnull``nullnull!!``nullnull``nullnull!!!" + "'", str2, "``nullnull``nullnull!!``nullnull``nullnull!!!");
    }

    @Test
    public void test06103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06103");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u019d\u01a0\u019d\u019d\200\u019d\u01a0\u019d\u019d\200\u019d\u01a0\u019d\u019d\200\u019d\u01a0\u019d\u019d\200\u019d\u01a0\u019d\u019d\200\u019d\u01a0\u019d\u019d\200\u019d\u01a0\u019d\u019d\200\u019d\u01a0\u019d\u019d\200}}!", "NNLLLLNN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}!" + "'", str2, "nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}!");
    }

    @Test
    public void test06104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06104");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnull\276\276nullnull\276\276\253\253nullnull\276\276nullnull\276\276\253\253nullnull\276\276nullnull\276\276\253\253nullnull\276\276nullnull\276\276\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnull\276\276nullnull\276\276\253\253nullnull\276\276nullnull\276\276\253\253!", "\u029e\u0346\u0346\ua7b0!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\276\276nullnullnullnullnullnullnullnull\276\276\253\253nullnullnullnullnullnullnullnull\276\276nullnullnullnullnullnullnullnull\276\276\253\253nullnullnullnullnullnullnullnull\276\276nullnullnullnullnullnullnullnull\276\276\253\253nullnullnullnullnullnullnullnull\276\276nullnullnullnullnullnullnullnull\276\276\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\276\276nullnullnullnullnullnullnullnull\276\276\253\253nullnullnullnullnullnullnullnull\276\276nullnullnullnullnullnullnullnull\276\276\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\276\276nullnullnullnullnullnullnullnull\276\276\253\253nullnullnullnullnullnullnullnull\276\276nullnullnullnullnullnullnullnull\276\276\253\253nullnullnullnullnullnullnullnull\276\276nullnullnullnullnullnullnullnull\276\276\253\253nullnullnullnullnullnullnullnull\276\276nullnullnullnullnullnullnullnull\276\276\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\276\276nullnullnullnullnullnullnullnull\276\276\253\253nullnullnullnullnullnullnullnull\276\276nullnullnullnullnullnullnullnull\276\276\253\253!");
    }

    @Test
    public void test06105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06105");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("unllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunll!", "\u0366\u0365\u0368\u0368\336\336!!\336\336!!!!\336\336!!\336\336!!!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test06106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06106");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!", "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test06107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06107");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200!!NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200!!NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200!!NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200!!NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200!", "nullvvvnullvvvnullvvvnullvvv\200}}`nullvvvnullvvvnullvvvnullvvv]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "vyyyvyyyvyyyvyyyvyyyvyyyvyyyvyyy\200\200\200\200\200\200\200\200vyyyvyyyvyyyvyyyvyyyvyyyvyyyvyyy\200\200\200\200\200\200\200\200!!vyyyvyyyvyyyvyyyvyyyvyyyvyyyvyyy\200\200\200\200\200\200\200\200vyyyvyyyvyyyvyyyvyyyvyyyvyyyvyyy\200\200\200\200\200\200\200\200!!vyyyvyyyvyyyvyyyvyyyvyyyvyyyvyyy\200\200\200\200\200\200\200\200vyyyvyyyvyyyvyyyvyyyvyyyvyyyvyyy\200\200\200\200\200\200\200\200vyyyvyyyvyyyvyyyvyyyvyyyvyyyvyyy\200\200\200\200\200\200\200\200vyyyvyyyvyyyvyyyvyyyvyyyvyyyvyyy\200\200\200\200\200\200\200\200!!vyyyvyyyvyyyvyyyvyyyvyyyvyyyvyyy\200\200\200\200\200\200\200\200vyyyvyyyvyyyvyyyvyyyvyyyvyyyvyyy\200\200\200\200\200\200\200\200!!vyyyvyyyvyyyvyyyvyyyvyyyvyyyvyyy\200\200\200\200\200\200\200\200vyyyvyyyvyyyvyyyvyyyvyyyvyyyvyyy\200\200\200\200\200\200\200\200!" + "'", str2, "vyyyvyyyvyyyvyyyvyyyvyyyvyyyvyyy\200\200\200\200\200\200\200\200vyyyvyyyvyyyvyyyvyyyvyyyvyyyvyyy\200\200\200\200\200\200\200\200!!vyyyvyyyvyyyvyyyvyyyvyyyvyyyvyyy\200\200\200\200\200\200\200\200vyyyvyyyvyyyvyyyvyyyvyyyvyyyvyyy\200\200\200\200\200\200\200\200!!vyyyvyyyvyyyvyyyvyyyvyyyvyyyvyyy\200\200\200\200\200\200\200\200vyyyvyyyvyyyvyyyvyyyvyyyvyyyvyyy\200\200\200\200\200\200\200\200vyyyvyyyvyyyvyyyvyyyvyyyvyyyvyyy\200\200\200\200\200\200\200\200vyyyvyyyvyyyvyyyvyyyvyyyvyyyvyyy\200\200\200\200\200\200\200\200!!vyyyvyyyvyyyvyyyvyyyvyyyvyyyvyyy\200\200\200\200\200\200\200\200vyyyvyyyvyyyvyyyvyyyvyyyvyyyvyyy\200\200\200\200\200\200\200\200!!vyyyvyyyvyyyvyyyvyyyvyyyvyyyvyyy\200\200\200\200\200\200\200\200vyyyvyyyvyyyvyyyvyyyvyyyvyyyvyyy\200\200\200\200\200\200\200\200!");
    }

    @Test
    public void test06108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06108");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]!\253\253]!\253\253!!]!\253\253]!\253\253!!!", "unllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!\253\253]!\253\253!!]!\253\253]!\253\253!!!" + "'", str2, "]!\253\253]!\253\253!!]!\253\253]!\253\253!!!");
    }

    @Test
    public void test06109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06109");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u0346\u0348\u0348!", "LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226!!LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368nullnull\226\226nullnull\226\226\204\204nullnull\226\226nullnull\226\226nullnull\226\226nullnull\226\226nullnull\226\226\204\204nullnull\226\226nullnull\226\226nullnull\226\226!!nullnull\226\226nullnull\226\226\204\204nullnull\226\226nullnull\226\226nullnull\226\226nullnull\226\226nullnull\226\226\204\204nullnull\226\226nullnull\226\226nullnull\226\226!!nullnull\226\226nullnull\226\226\204\204nullnull\226\226nullnull\226\226nullnull\226\226nullnull\226\226nullnull\226\226\204\204nullnull\226\226nullnull\226\226nullnull\226\226!!nullnull\226\226nullnull\226\226\204\204nullnull\226\226nullnull\226\226nullnull\226\226nullnull\226\226nullnull\226\226\204\204nullnull\226\226nullnull\226\226nullnull\226\226\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368nullnull\226\226nullnull\226\226\204\204nullnull\226\226nullnull\226\226nullnull\226\226nullnull\226\226nullnull\226\226\204\204nullnull\226\226nullnull\226\226nullnull\226\226!!nullnull\226\226nullnull\226\226\204\204nullnull\226\226nullnull\226\226nullnull\226\226nullnull\226\226nullnull\226\226\204\204nullnull\226\226nullnull\226\226nullnull\226\226!!nullnull\226\226nullnull\226\226\204\204nullnull\226\226nullnull\226\226nullnull\226\226nullnull\226\226nullnull\226\226\204\204nullnull\226\226nullnull\226\226nullnull\226\226!!nullnull\226\226nullnull\226\226\204\204nullnull\226\226nullnull\226\226nullnull\226\226nullnull\226\226nullnull\226\226\204\204nullnull\226\226nullnull\226\226nullnull\226\226\u0346\u0348\u0348!");
    }

    @Test
    public void test06110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06110");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!", "!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!" + "'", str2, "!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!");
    }

    @Test
    public void test06111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06111");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\351\354\354\354\351\354\354\354\351\354\354\354\351\354\354\354\200}}`\351\354\354\354\351\354\354\354\351\354\354\354\351\354\354\354]]!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\200\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e]]!" + "'", str2, "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\200\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e]]!");
    }

    @Test
    public void test06112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06112");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!L!", "\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!" + "'", str2, "!null!");
    }

    @Test
    public void test06113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06113");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UUUUUUUUUUUUUUUU\200}}`UUUUUUUUUUUUUUUU]]!", "\u0346\u0348\u0348\u0348\234\235\237\237\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test06114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06114");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~!!\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~!!\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~!!\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~!!\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~!", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~!!\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~!!\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~!!\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~!!\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~!" + "'", str2, "\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~!!\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~!!\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~!!\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~!!\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~\200\220~~\200~~\200\220~~\200~~\200\220~~\200\220~~!");
    }

    @Test
    public void test06115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06115");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```!", "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```!" + "'", str2, "LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```!");
    }

    @Test
    public void test06116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06116");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143!!!", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "X!!!X!!!!!X!!!X!!!!!X!!!X!!!!!X!!!X!!!!!X!!!X!!!!!X!!!X!!!!!X!!!X!!!!!X!!!X!!!!!!" + "'", str2, "X!!!X!!!!!X!!!X!!!!!X!!!X!!!!!X!!!X!!!!!X!!!X!!!!!X!!!X!!!!!X!!!X!!!!!X!!!X!!!!!!");
    }

    @Test
    public void test06117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06117");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!", "LLLLLUUULUUULUUULUUULLLLLUUULUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!" + "'", str2, "\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!!\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!");
    }

    @Test
    public void test06118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06118");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06119");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull!" + "'", str2, "~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test06120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06120");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230\200}}`L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test06121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06121");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!", "null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!!" + "'", str2, "nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!!");
    }

    @Test
    public void test06122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06122");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0143\u0145\u0145\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0143\u0145\u0145\u0145\u0143\u0145\u0143!!!", "JLLLJLLLJLLLJLLLJLLLJLLLJLLLJLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnullnull!!nullnull!!nullnull!!nullnull!!null!nullnullnullnull!!nullnull!!!" + "'", str2, "null!nullnullnullnull!!nullnull!!nullnull!!nullnull!!null!nullnullnullnull!!nullnull!!!");
    }

    @Test
    public void test06123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06123");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!!", "\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test06124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06124");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170!", "\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06125");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0240\u0240\u023e\u023e\u0346\u0348\u0348!", "}~\200\200}~\200\200ULLL^ULLLULLLULLL^ULLLULLL}~\200\200}~\200\200ULLL^ULLLULLLULLL^ULLLULLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test06126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06126");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "UUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test06127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06127");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180!", "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06128");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214!", "\215}\215\215\215}\215\215ULLLULLLULLLULLL\215}\215\215\215}\215\215!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\214\214LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\214\214LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\214\214LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\214\214LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\214\214LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\214\214LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\214\214LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\214\214!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\214\214LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\214\214LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\214\214LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\214\214LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\214\214LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\214\214LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\214\214LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\214\214!");
    }

    @Test
    public void test06129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06129");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u014e\u014b\u014b\u014b\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u014e\u014b\u014b\u014b\u0348\u0346\u0346!");
    }

    @Test
    public void test06130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06130");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240!", "OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06131");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368LL!!LL!!\200\200\u0346\u0348\u0348!", "LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368AA!!AA!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368AA!!AA!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test06132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06132");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!~}}^``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!]]!", "\215\215\215\215\215\215\215\215!!\215\215\215\215\215\215\215\215!!\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215\215!!\215\215\215\215\215\215\215\215!!\215\215\215\215\215\215\215\215!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!~}}^``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!]]!" + "'", str2, "``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!~}}^``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!]]!");
    }

    @Test
    public void test06133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06133");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LNLLLNLL!!LNLLLNLL!!LNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!", "lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!lLLLLLLLLLLL!!!!lLLLLLLLLLLL!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a!" + "'", str2, "\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a!");
    }

    @Test
    public void test06134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06134");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06135");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLL!!!!!!!", "\275nullnullnull\276null\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!!" + "'", str2, "RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!!");
    }

    @Test
    public void test06136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06136");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e\u0180\u017e\u017e!", "L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!" + "'", str2, "!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!");
    }

    @Test
    public void test06137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06137");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06138");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}!", "\253\254\256\256nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}!" + "'", str2, "~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}!");
    }

    @Test
    public void test06139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06139");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnull~~~~~~~~nullnullnullnullnullnullnullnull~~~~~~~~!!nullnullnullnullnullnullnullnull~~~~~~~~nullnullnullnullnullnullnullnull~~~~~~~~!!nullnullnullnullnullnullnullnull~~~~~~~~nullnullnullnullnullnullnullnull~~~~~~~~nullnullnullnullnullnullnullnull~~~~~~~~nullnullnullnullnullnullnullnull~~~~~~~~!!nullnullnullnullnullnullnullnull~~~~~~~~nullnullnullnullnullnullnullnull~~~~~~~~!!nullnullnullnullnullnullnullnull~~~~~~~~nullnullnullnullnullnullnullnull~~~~~~~~!", "}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^~~~~~~~~LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^~~~~~~~~!!LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^~~~~~~~~LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^~~~~~~~~!!LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^~~~~~~~~LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^~~~~~~~~LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^~~~~~~~~LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^~~~~~~~~!!LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^~~~~~~~~LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^~~~~~~~~!!LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^~~~~~~~~LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^~~~~~~~~!" + "'", str2, "LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^~~~~~~~~LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^~~~~~~~~!!LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^~~~~~~~~LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^~~~~~~~~!!LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^~~~~~~~~LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^~~~~~~~~LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^~~~~~~~~LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^~~~~~~~~!!LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^~~~~~~~~LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^~~~~~~~~!!LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^~~~~~~~~LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^~~~~~~~~!");
    }

    @Test
    public void test06140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06140");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!!", "UNLLUNLLUNLLUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!!!!" + "'", str2, "NNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNN!!!!!!!");
    }

    @Test
    public void test06141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06141");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS!!!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL!!]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL!!]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL!!]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL!!]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL!!]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL!!]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL!!]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL!!!" + "'", str2, "]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL!!]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL!!]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL!!]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL!!]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL!!]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL!!]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL!!]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL!!!");
    }

    @Test
    public void test06142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06142");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("JLLL\200}}`JLLL]]!", "\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u023e\u023e\u023e\200\u023e\u023e\u023e]]!" + "'", str2, "\u023e\u023e\u023e\200\u023e\u023e\u023e]]!");
    }

    @Test
    public void test06143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06143");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8nullnullnullnullnullnullnullnull!", "nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8ULLLULLLULLLULLLULLLULLLULLLULLL!" + "'", str2, "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8ULLLULLLULLLULLLULLLULLLULLLULLL!");
    }

    @Test
    public void test06144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06144");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce\200\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce]]!", "\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test06145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06145");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!", "hnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ff!!hnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ff!!hnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ff!!hnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ff!!hnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ff!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!" + "'", str2, "\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!");
    }

    @Test
    public void test06146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06146");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("xxxxxxxxxxxxxxxxnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullxxxxxxxxxxxxxxxxnullnullnullnullnullnullnullnull!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321!");
    }

    @Test
    public void test06147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06147");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368nullnull\226\226nullnull\226\226\204\204nullnull\226\226nullnull\226\226nullnull\226\226nullnull\226\226nullnull\226\226\204\204nullnull\226\226nullnull\226\226nullnull\226\226!!nullnull\226\226nullnull\226\226\204\204nullnull\226\226nullnull\226\226nullnull\226\226nullnull\226\226nullnull\226\226\204\204nullnull\226\226nullnull\226\226nullnull\226\226!!nullnull\226\226nullnull\226\226\204\204nullnull\226\226nullnull\226\226nullnull\226\226nullnull\226\226nullnull\226\226\204\204nullnull\226\226nullnull\226\226nullnull\226\226!!nullnull\226\226nullnull\226\226\204\204nullnull\226\226nullnull\226\226nullnull\226\226nullnull\226\226nullnull\226\226\204\204nullnull\226\226nullnull\226\226nullnull\226\226\u0346\u0348\u0348!", "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226!!ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226!!ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226!!ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226!!ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226!!ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226!!ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226\u0346\u0348\u0348!");
    }

    @Test
    public void test06148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06148");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL\276!LL!", "||||||||!!||||||||!!||||||||!!||||||||!!||||!!!||||!!!||||!!!||||!!!||||||||!!||||||||!!||||||||!!||||||||!!||||!!!||||!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull!" + "'", str2, "\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull!");
    }

    @Test
    public void test06149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06149");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180!", "~}\200\200~}\200\200UNLLUNLLuuUNLLUNLLuu~}\200\200~}\200\200UNLLUNLLuuUNLLUNLLuu~}\200\200~}\200\200UNLLUNLLuuUNLLUNLLuu~}\200\200~}\200\200UNLLUNLLuuUNLLUNLLuu~}\200\200~}\200\200UNLLUNLLuuUNLLUNLLuu~}\200\200~}\200\200UNLLUNLLuuUNLLUNLLuu~}\200\200~}\200\200UNLLUNLLuuUNLLUNLLuu~}\200\200~}\200\200UNLLUNLLuuUNLLUNLLuu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06150");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u026c\u026c\u026a\u026a\u026c\u026c\u026a\u026a\u026c\u026c\u026a\u026a\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026a\u026a\u026c\u026c\u026a\u026a\u026c\u026c\u026a\u026a\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c!!!", "NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test06151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06151");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u0346\u0348\u0348!");
    }

    @Test
    public void test06152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06152");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06153");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull!", "]]HH]]HH!!]]HH]]HH!!]]HH]]HH]]HH]]HH!!]]HH]]HH!!]]HH]]HH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230!\225\225\230!\225\225nullnullnullnullnullnullnullnull\230!\225\225\230!\225\225nullnullnullnullnullnullnullnull\230!\225\225\230!\225\225nullnullnullnullnullnullnullnull\230!\225\225\230!\225\225nullnullnullnullnullnullnullnull\230!\225\225\230!\225\225nullnullnullnullnullnullnullnull\230!\225\225\230!\225\225nullnullnullnullnullnullnullnull\230!\225\225\230!\225\225nullnullnullnullnullnullnullnull\230!\225\225\230!\225\225nullnullnullnullnullnullnullnull!" + "'", str2, "\230!\225\225\230!\225\225nullnullnullnullnullnullnullnull\230!\225\225\230!\225\225nullnullnullnullnullnullnullnull\230!\225\225\230!\225\225nullnullnullnullnullnullnullnull\230!\225\225\230!\225\225nullnullnullnullnullnullnullnull\230!\225\225\230!\225\225nullnullnullnullnullnullnullnull\230!\225\225\230!\225\225nullnullnullnullnullnullnullnull\230!\225\225\230!\225\225nullnullnullnullnullnullnullnull\230!\225\225\230!\225\225nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06154");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aanullnull!" + "'", str2, "\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aanullnull!");
    }

    @Test
    public void test06155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06155");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016enullnullnull}~\200\200}~\200\200\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016enullnullnull}~\200\200}~\200\200\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016enullnullnull}~\200\200}~\200\200\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u0348\u0346\u0346!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200\u014e\u014e\u014e\u014e!!!!!!!!!!!!!!}~\200\200}~\200\200\u014e\u014e\u014e\u014e!!!!!!!!!!!!!!}~\200\200}~\200\200\u014e\u014e\u014e\u014e!!!!!!!!!!!!!!}~\200\200}~\200\200\u014e\u014e\u014e\u014e\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200\u014e\u014e\u014e\u014e!!!!!!!!!!!!!!}~\200\200}~\200\200\u014e\u014e\u014e\u014e!!!!!!!!!!!!!!}~\200\200}~\200\200\u014e\u014e\u014e\u014e!!!!!!!!!!!!!!}~\200\200}~\200\200\u014e\u014e\u014e\u014e\u0348\u0346\u0346!");
    }

    @Test
    public void test06156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06156");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HHHH!!!HH!!HHHH!!HH!!HH!!!HH!!HHHH!!HH!!!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HHHH!!!HH!!HHHH!!HH!!HH!!!HH!!HHHH!!HH!!!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HHHH!!!HH!!HHHH!!HH!!HH!!!HH!!HHHH!!HH!!!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HHHH!!!HH!!HHHH!!HH!!HH!!!HH!!HHHH!!HH!!!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HHHH!!!HH!!HHHH!!HH!!HH!!!HH!!HHHH!!HH!!!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HHHH!!!HH!!HHHH!!HH!!HH!!!HH!!HHHH!!HH!!!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HHHH!!!HH!!HHHH!!HH!!HH!!!HH!!HHHH!!HH!!!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HH!HH!!HHHH!!!HH!!HHHH!!HH!!HH!!!HH!!HHHH!!HH!!!", "`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test06157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06157");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\336\335\340\340nullnullnullnullnullnull\336\335\340\340nullnullnullnullnullnull\336\335\340\340nullnullnullnullnullnull\336\335\340\340nullnullnullnullnullnull!", "\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\216\254\254nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\216\254\254nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\216\254\254nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\216\254\254nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\216\254\254nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\216\254\254nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\216\254\254nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\216\254\254nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06158");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!", "!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!" + "'", str2, "L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!");
    }

    @Test
    public void test06159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06159");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}]}}}]}}!!}]}}}]}}!!}]}}}]}}}]}}}]}}!!}]}}}]}}!!}]}}}]}}!", "mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}]}}}]}}!!}]}}}]}}!!}]}}}]}}}]}}}]}}!!}]}}}]}}!!}]}}}]}}!" + "'", str2, "}]}}}]}}!!}]}}}]}}!!}]}}}]}}}]}}}]}}!!}]}}}]}}!!}]}}}]}}!");
    }

    @Test
    public void test06160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06160");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("fehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehh!", "Lu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!llLu!llu!llu!ll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LL!" + "'", str2, "L!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LL!");
    }

    @Test
    public void test06161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06161");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("bnullnullnullbnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullbnullnullnullbnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnull!", "!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LUNLLUNLLUNLLLUNLLUNLLUNLLLUNLLUNLLUNLLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLLUNLLUNLLUNLLLUNLLUNLLUNLLLUNLLUNLLUNLLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!" + "'", str2, "LUNLLUNLLUNLLLUNLLUNLLUNLLLUNLLUNLLUNLLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLLUNLLUNLLUNLLLUNLLUNLLUNLLLUNLLUNLLUNLLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
    }

    @Test
    public void test06162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06162");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("``!!``!!!", "!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!!``!!!" + "'", str2, "``!!``!!!");
    }

    @Test
    public void test06163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06163");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\236\276\276null\236\276\276!!null\236\276\276null\236\276\276!!null\236\276\276null\236\276\276null\236\276\276null\236\276\276!!null\236\276\276null\236\276\276!!null\236\276\276null\236\276\276!", "nullnullnullnull\256nullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLLL\236\276\276NLLL\236\276\276!!NLLL\236\276\276NLLL\236\276\276!!NLLL\236\276\276NLLL\236\276\276NLLL\236\276\276NLLL\236\276\276!!NLLL\236\276\276NLLL\236\276\276!!NLLL\236\276\276NLLL\236\276\276!" + "'", str2, "NLLL\236\276\276NLLL\236\276\276!!NLLL\236\276\276NLLL\236\276\276!!NLLL\236\276\276NLLL\236\276\276NLLL\236\276\276NLLL\236\276\276!!NLLL\236\276\276NLLL\236\276\276!!NLLL\236\276\276NLLL\236\276\276!");
    }

    @Test
    public void test06164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06164");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUU!", "nullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLLLNLLLNLLLNLLLNNNNNNNNNNNNNLLLNLLLNLLLNLLLNNNNNNNNNNNNNLLLNLLLNLLLNLLLNNNNNNNNNNNNNLLLNLLLNLLLNLLLNNNNNNNNNNNNNLLLNLLLNLLLNLLLNNNNNNNNNNNNNLLLNLLLNLLLNLLLNNNNNNNNNNNNNLLLNLLLNLLLNLLLNNNNNNNNNNNNNLLLNLLLNLLLNLLLNNNNNNNNNNNN!" + "'", str2, "NLLLNLLLNLLLNLLLNNNNNNNNNNNNNLLLNLLLNLLLNLLLNNNNNNNNNNNNNLLLNLLLNLLLNLLLNNNNNNNNNNNNNLLLNLLLNLLLNLLLNNNNNNNNNNNNNLLLNLLLNLLLNLLLNNNNNNNNNNNNNLLLNLLLNLLLNLLLNNNNNNNNNNNNNLLLNLLLNLLLNLLLNNNNNNNNNNNNNLLLNLLLNLLLNLLLNNNNNNNNNNNN!");
    }

    @Test
    public void test06165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06165");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de!!!", "nullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test06166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06166");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("AA]]AA]]nullnullAA]]AA]]nullnull!", "\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a!" + "'", str2, "\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a!");
    }

    @Test
    public void test06167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06167");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!!", "FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull!!}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull!!}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull!!}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull!!}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull!!}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull!!}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull!!}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull!!!" + "'", str2, "}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull!!}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull!!}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull!!}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull!!}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull!!}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull!!}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull!!}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull}^nullnull!!!");
    }

    @Test
    public void test06168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06168");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\u0366\u0365\u0368\u0368\u0167\u0168\u016a\u016a\u0167\u0168\u016a\u016a\u0167\u0168\u016a\u016a\u0167\u0168\u016a\u016a\u0167\u0168\u016a\u016a\u0167\u0168\u016a\u016a\u0167\u0168\u016a\u016a\u0167\u0168\u016a\u016a\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06169");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NLLLNLLLLLNLLLNLLLLL!!NLLLNLLLLLNLLLNLLLLL!!NLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLL!!NLLLNLLLLLNLLLNLLLLL!!NLLLNLLLLLNLLLNLLLLL!", "}~\200\200}~\200\200LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL}~\200\200}~\200\200LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150!" + "'", str2, "\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150!");
    }

    @Test
    public void test06170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06170");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0368\u0368\u0368\u0368!!!", "ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0368\u0368\u0368!!!" + "'", str2, "\u0368\u0368\u0368\u0368!!!");
    }

    @Test
    public void test06171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06171");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\u0366\u0365\u0368\u0368ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226!!ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226!!ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226!!ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test06172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06172");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!LUU!LUU!LUU!LUU!UUU!UUU!UUU!UUU!LUU!LUU!LUU!LUU!UUU!UUU!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
    }

    @Test
    public void test06173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06173");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!U\270\270\270U\270\270\270!!U\270\270\270U\270\270\270!!U\270\270\270U\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!U\270\270\270U\270\270\270!!U\270\270\270U\270\270\270!!U\270\270\270U\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!null\270\270\270null\270\270\270!!null\270\270\270null\270\270\270!!null\270\270\270null\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!null\270\270\270null\270\270\270!!null\270\270\270null\270\270\270!!null\270\270\270null\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!null\270\270\270null\270\270\270!!null\270\270\270null\270\270\270!!null\270\270\270null\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!null\270\270\270null\270\270\270!!null\270\270\270null\270\270\270!!null\270\270\270null\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test06174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06174");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368N!!!N!!!\200\200\u0346\u0348\u0348!", "E\220UU\200~~E\220UU\200~~E\220UUE\220UUE\220UU\200~~E\220UU\200~~E\220UUE\220UU!!E\220UU\200~~E\220UU\200~~E\220UUE\220UUE\220UU\200~~E\220UU\200~~E\220UUE\220UU!!E\220UU\200~~E\220UU\200~~E\220UUE\220UUE\220UU\200~~E\220UU\200~~E\220UUE\220UUE\220UU\200~~E\220UU\200~~E\220UUE\220UUE\220UU\200~~E\220UU\200~~E\220UUE\220UU!!E\220UU\200~~E\220UU\200~~E\220UUE\220UUE\220UU\200~~E\220UU\200~~E\220UUE\220UU!!E\220UU\200~~E\220UU\200~~E\220UUE\220UUE\220UU\200~~E\220UU\200~~E\220UUE\220UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368null!!!null!!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368null!!!null!!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test06175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06175");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!", "nullnull!!nullnull!!]nullnullnull]nullnullnullnullnull!!nullnull!!]nullnullnull]nullnullnullnullnull!!nullnull!!]nullnullnull]nullnullnullnullnull!!nullnull!!]nullnullnull]nullnullnullnullnull!!nullnull!!]nullnullnull]nullnullnullnullnull!!nullnull!!]nullnullnull]nullnullnullnullnull!!nullnull!!]nullnullnull]nullnullnullnullnull!!nullnull!!]nullnullnull]nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test06176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06176");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276\u0260\275\u0260\275\u0260\275\u0260\275\u0260\275\u0260\275\u0260\275\u0260\275!!\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276\u0260\275\u0260\275\u0260\275\u0260\275\u0260\275\u0260\275\u0260\275\u0260\275!!!" + "'", str2, "\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276\u0260\275\u0260\275\u0260\275\u0260\275\u0260\275\u0260\275\u0260\275\u0260\275!!\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276\u0260\275\u0260\275\u0260\275\u0260\275\u0260\275\u0260\275\u0260\275\u0260\275!!!");
    }

    @Test
    public void test06177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06177");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!", "\275nullnullnullnullnullnullnullnullnullnullnullnull\276nullnullnullnull\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
    }

    @Test
    public void test06178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06178");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LnullLLLnullLL!!LnullLLLnullLL!!LnullLLLnullLLLnullLLLnullLL!!LnullLLLnullLL!!LnullLLLnullLL!", "]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\300\335\336\340\340\300\300\300\335\336\340\340\300\300!!\300\335\336\340\340\300\300\300\335\336\340\340\300\300!!\300\335\336\340\340\300\300\300\335\336\340\340\300\300\300\335\336\340\340\300\300\300\335\336\340\340\300\300!!\300\335\336\340\340\300\300\300\335\336\340\340\300\300!!\300\335\336\340\340\300\300\300\335\336\340\340\300\300!" + "'", str2, "\300\335\336\340\340\300\300\300\335\336\340\340\300\300!!\300\335\336\340\340\300\300\300\335\336\340\340\300\300!!\300\335\336\340\340\300\300\300\335\336\340\340\300\300\300\335\336\340\340\300\300\300\335\336\340\340\300\300!!\300\335\336\340\340\300\300\300\335\336\340\340\300\300!!\300\335\336\340\340\300\300\300\335\336\340\340\300\300!");
    }

    @Test
    public void test06179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06179");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06180");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8nullnullnullnullnullnullnullnull!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200\u0126\u0128\u0128\u0126\u0128\u0128}~\200\200}~\200\200\u0126\u0128\u0128\u0126\u0128\u0128}~\200\200}~\200\200\u0126\u0128\u0128\u0126\u0128\u0128}~\200\200}~\200\200\u0126\u0128\u0128\u0126\u0128\u0128\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271!" + "'", str2, "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271!");
    }

    @Test
    public void test06181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06181");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("WZZZ\200}}`WZZZ]]!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\200}}`nullnullnullnull]]!" + "'", str2, "nullnullnullnull\200}}`nullnullnullnull]]!");
    }

    @Test
    public void test06182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06182");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!\230null\226\226nullnullnullnullnullnull\230null\226\226nullnullnullnullnullnull!!!", "}~\200\200}~\200\200\u0170\u0170\u0170\u0170\u0170\u0170nullnullnull}~\200\200}~\200\200\u0170\u0170\u0170\u0170\u0170\u0170nullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230ULLL\226\226ULLLULLLULLLULLLULLLULLL\230ULLL\226\226ULLLULLLULLLULLLULLLULLL!!\230ULLL\226\226ULLLULLLULLLULLLULLLULLL\230ULLL\226\226ULLLULLLULLLULLLULLLULLL!!\230ULLL\226\226ULLLULLLULLLULLLULLLULLL\230ULLL\226\226ULLLULLLULLLULLLULLLULLL!!\230ULLL\226\226ULLLULLLULLLULLLULLLULLL\230ULLL\226\226ULLLULLLULLLULLLULLLULLL!!\230ULLL\226\226ULLLULLLULLLULLLULLLULLL\230ULLL\226\226ULLLULLLULLLULLLULLLULLL!!\230ULLL\226\226ULLLULLLULLLULLLULLLULLL\230ULLL\226\226ULLLULLLULLLULLLULLLULLL!!\230ULLL\226\226ULLLULLLULLLULLLULLLULLL\230ULLL\226\226ULLLULLLULLLULLLULLLULLL!!\230ULLL\226\226ULLLULLLULLLULLLULLLULLL\230ULLL\226\226ULLLULLLULLLULLLULLLULLL!!!" + "'", str2, "\230ULLL\226\226ULLLULLLULLLULLLULLLULLL\230ULLL\226\226ULLLULLLULLLULLLULLLULLL!!\230ULLL\226\226ULLLULLLULLLULLLULLLULLL\230ULLL\226\226ULLLULLLULLLULLLULLLULLL!!\230ULLL\226\226ULLLULLLULLLULLLULLLULLL\230ULLL\226\226ULLLULLLULLLULLLULLLULLL!!\230ULLL\226\226ULLLULLLULLLULLLULLLULLL\230ULLL\226\226ULLLULLLULLLULLLULLLULLL!!\230ULLL\226\226ULLLULLLULLLULLLULLLULLL\230ULLL\226\226ULLLULLLULLLULLLULLLULLL!!\230ULLL\226\226ULLLULLLULLLULLLULLLULLL\230ULLL\226\226ULLLULLLULLLULLLULLLULLL!!\230ULLL\226\226ULLLULLLULLLULLLULLLULLL\230ULLL\226\226ULLLULLLULLLULLLULLLULLL!!\230ULLL\226\226ULLLULLLULLLULLLULLLULLL\230ULLL\226\226ULLLULLLULLLULLLULLLULLL!!!");
    }

    @Test
    public void test06183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06183");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254!!!", "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!!" + "'", str2, "nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!!");
    }

    @Test
    public void test06184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06184");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "ulllulll!!ulllulllulllulllulllulllulllulll!!ulllulllulllulllulllulll!!ulllulll!!ulllulllulllulllulllulllulllulll!!ulllulllulllulllulllulll!!ulllulll!!ulllulllulllulllulllulllulllulll!!ulllulllulllulllulllulll!!ulllulll!!ulllulllulllulllulllulllulllulll!!ulllulllulllulllulllulll!!ulllulll!!ulllulllulllulllulllulllulllulll!!ulllulllulllulllulllulll!!ulllulll!!ulllulllulllulllulllulllulllulll!!ulllulllulllulllulllulll!!ulllulll!!ulllulllulllulllulllulllulllulll!!ulllulllulllulllulllulll!!ulllulll!!ulllulllulllulllulllulllulllulll!!ulllulllulllulllulllulll!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test06185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06185");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242!!!", "UNLLnllUNLLnllUNLLnllUNLLnllUNLLnllUNLLnllUNLLnllUNLLnll!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test06186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06186");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!TTTTTTTT!!TTTTTTTT!!!!TTTTTTTT!!TTTTTTTT!!!!TTTTTTTT!!TTTTTTTT!!!!TTTTTTTT!!TTTTTTTT!!!!TTTTTTTT!!TTTTTTTT!!!!TTTTTTTT!!TTTTTTTT!!!!TTTTTTTT!!TTTTTTTT!!!!TTTTTTTT!!TTTTTTTT!" + "'", str2, "!!!!TTTTTTTT!!TTTTTTTT!!!!TTTTTTTT!!TTTTTTTT!!!!TTTTTTTT!!TTTTTTTT!!!!TTTTTTTT!!TTTTTTTT!!!!TTTTTTTT!!TTTTTTTT!!!!TTTTTTTT!!TTTTTTTT!!!!TTTTTTTT!!TTTTTTTT!!!!TTTTTTTT!!TTTTTTTT!");
    }

    @Test
    public void test06187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06187");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!", "!~!!!~!!\220\220!~!!!~!!\220\220\220!~!!\220\220\220!~!!\220\220\220!~!!\220\220\220!~!!\220\220!~!!!~!!\220\220!~!!!~!!\220\220!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06188");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!!" + "'", str2, "LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!!");
    }

    @Test
    public void test06189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06189");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null!nullnullnullnull!!nullnull!!nullnull!!nullnull!!null!nullnullnullnull!!nullnull!!!", "!null\230nullnullnull\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!!null\230nullnullnull\230nullnull!!null\230nullnullnull\230nullnull!!null\230nullnullnull\230nullnull!!null\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!!null\230nullnullnull\230nullnull!!null\230nullnullnull\230nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230LLL!\230LLL\230LLL\230LLL\230LLL!!\230LLL\230LLL!!\230LLL\230LLL!!\230LLL\230LLL!!\230LLL!\230LLL\230LLL\230LLL\230LLL!!\230LLL\230LLL!!!" + "'", str2, "\230LLL!\230LLL\230LLL\230LLL\230LLL!!\230LLL\230LLL!!\230LLL\230LLL!!\230LLL\230LLL!!\230LLL!\230LLL\230LLL\230LLL\230LLL!!\230LLL\230LLL!!!");
    }

    @Test
    public void test06190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06190");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\270U\270\270\270U\270\270!!\270U\270\270\270U\270\270!!\270U\270\270\270U\270\270!!\270U\270\270\270U\270\270!!\270U\270\270\270U\270\270!!\270U\270\270\270U\270\270!!\270U\270\270\270U\270\270!!\270U\270\270\270U\270\270!!!", "L\204LLL\204LLL\204LLL\204LLLLLLLLLLLLLLLLLLL\204LLL\204LLL\204LLL\204LLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\270null\270\270\270null\270\270!!\270null\270\270\270null\270\270!!\270null\270\270\270null\270\270!!\270null\270\270\270null\270\270!!\270null\270\270\270null\270\270!!\270null\270\270\270null\270\270!!\270null\270\270\270null\270\270!!\270null\270\270\270null\270\270!!!" + "'", str2, "\270null\270\270\270null\270\270!!\270null\270\270\270null\270\270!!\270null\270\270\270null\270\270!!\270null\270\270\270null\270\270!!\270null\270\270\270null\270\270!!\270null\270\270\270null\270\270!!\270null\270\270\270null\270\270!!\270null\270\270\270null\270\270!!!");
    }

    @Test
    public void test06191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06191");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225!", "!\253\256\256\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225!" + "'", str2, "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225!");
    }

    @Test
    public void test06192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06192");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnulljjnullnulljj!!nullnulljjnullnulljj!!nullnulljjnullnulljjnullnulljjnullnulljj!!nullnulljjnullnulljj!!nullnulljjnullnulljj!", "EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEE!" + "'", str2, "EEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEE!");
    }

    @Test
    public void test06193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06193");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!", "!eeeeeeeeeeeeeeee!!!eeeeeeeeeeeeeeee!!!!!eeeeeeeeeeeeeeee!!!eeeeeeeeeeeeeeee!!!!!eeeeeeeeeeeeeeee!!!eeeeeeeeeeeeeeee!!!eeeeeeeeeeeeeeee!!!eeeeeeeeeeeeeeee!!!!!eeeeeeeeeeeeeeee!!!eeeeeeeeeeeeeeee!!!!!eeeeeeeeeeeeeeee!!!eeeeeeeeeeeeeeee!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!" + "'", str2, "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!");
    }

    @Test
    public void test06194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06194");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!", "!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!" + "'", str2, "}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!");
    }

    @Test
    public void test06195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06195");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!", "\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a!" + "'", str2, "\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a!");
    }

    @Test
    public void test06196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06196");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("llLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLLllLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLL!", "nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae!" + "'", str2, "\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae!");
    }

    @Test
    public void test06197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06197");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLL!", "!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test06198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06198");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!!", "!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test06199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06199");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u041c\u041e\u041b\u041b\u041c\u041e\u041b\u041b\u041c\u041e\u041b\u041b\u041c\u041e\u041b\u041b!!!", "!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!!!L\253\253!L\253\253!!!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!L\253\253!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test06200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06200");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NNUUNNUU!!NNUUNNUU!!NNUUNNUUNNUUNNUU!!NNUUNNUU!!NNUUNNUU!", "\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06201");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214!", "!\253\256\256\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214!" + "'", str2, "\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214!");
    }

    @Test
    public void test06202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06202");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("IJLLIJLL!!IJLLIJLL!!IJLLIJLLIJLLIJLL!!IJLLIJLL!!IJLLIJLL!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06203");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016enullnullnullnullnullnullnullnull!", "LNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NNLNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NN!!LNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NNLNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NN!!LNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NNLNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NNLNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NNLNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NN!!LNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NNLNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NN!!LNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NNLNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNLLLNLLN~~~N~~~N~~~N~~~N~~~N~~~N~~~N~~~LNLLLNLLN~~~N~~~N~~~N~~~N~~~N~~~N~~~N~~~LNLLLNLLN~~~N~~~N~~~N~~~N~~~N~~~N~~~N~~~LNLLLNLLN~~~N~~~N~~~N~~~N~~~N~~~N~~~N~~~LNLLLNLLN~~~N~~~N~~~N~~~N~~~N~~~N~~~N~~~LNLLLNLLN~~~N~~~N~~~N~~~N~~~N~~~N~~~N~~~LNLLLNLLN~~~N~~~N~~~N~~~N~~~N~~~N~~~N~~~LNLLLNLLN~~~N~~~N~~~N~~~N~~~N~~~N~~~N~~~!" + "'", str2, "LNLLLNLLN~~~N~~~N~~~N~~~N~~~N~~~N~~~N~~~LNLLLNLLN~~~N~~~N~~~N~~~N~~~N~~~N~~~N~~~LNLLLNLLN~~~N~~~N~~~N~~~N~~~N~~~N~~~N~~~LNLLLNLLN~~~N~~~N~~~N~~~N~~~N~~~N~~~N~~~LNLLLNLLN~~~N~~~N~~~N~~~N~~~N~~~N~~~N~~~LNLLLNLLN~~~N~~~N~~~N~~~N~~~N~~~N~~~N~~~LNLLLNLLN~~~N~~~N~~~N~~~N~~~N~~~N~~~N~~~LNLLLNLLN~~~N~~~N~~~N~~~N~~~N~~~N~~~N~~~!");
    }

    @Test
    public void test06204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06204");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NLLLNULLNULLNULLNULLNLLLNULLNULL!", "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null^^^nullnull^^nullnull^^nullnull^^nullnull^^null^^^nullnull^^nullnull^^!" + "'", str2, "null^^^nullnull^^nullnull^^nullnull^^nullnull^^null^^^nullnull^^nullnull^^!");
    }

    @Test
    public void test06205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06205");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a!!!", "~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test06206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06206");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200\u0348\u0346\u0346!", "NNNNNNNNNNNNNNNN\200}}`NNNNNNNNNNNNNNNN]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200\u0348\u0346\u0346!");
    }

    @Test
    public void test06207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06207");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!!", "\u01c8\u01c5\u01c5\u01c5\u01c8\u01c5\u01c5\u01c5!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test06208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06208");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06209");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LL!!````````````LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!````````````LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!", "\u0366\u0365\u0368\u0368null\213\213\213\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!" + "'", str2, "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!");
    }

    @Test
    public void test06210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06210");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!" + "'", str2, "!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!");
    }

    @Test
    public void test06211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06211");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("ULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLL!", "nullnulljjnullnulljj!!nullnulljjnullnulljj!!nullnulljjnullnulljjnullnulljjnullnulljj!!nullnulljjnullnulljj!!nullnulljjnullnulljj!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276!" + "'", str2, "\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276!");
    }

    @Test
    public void test06212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06212");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225!", "NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\225\225\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\225\225\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\225\225\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\225\225\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\225\225\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\225\225\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\225\225\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\225\225!" + "'", str2, "\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\225\225\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\225\225\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\225\225\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\225\225\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\225\225\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\225\225\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\225\225\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\225\225!");
    }

    @Test
    public void test06213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06213");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!", "\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06214");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!U\270\270\270U\270\270\270!!U\270\270\270U\270\270\270!!U\270\270\270U\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!U\270\270\270U\270\270\270!!U\270\270\270U\270\270\270!!U\270\270\270U\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test06215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06215");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("HFFFHFFF!", "\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06216");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\276!\225\225\276!\225\225\200\200\276!\225\225\276!\225\225\200\200\276!\225\225\276!\225\225\200\200\276\276!\225\225\276!\225\225\200\200\275\275!", "!\253\256\256\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276!\225\225\276!\225\225\200\200\276!\225\225\276!\225\225\200\200\276!\225\225\276!\225\225\200\200\276\276!\225\225\276!\225\225\200\200\275\275!" + "'", str2, "\275\276!\225\225\276!\225\225\200\200\276!\225\225\276!\225\225\200\200\276!\225\225\276!\225\225\200\200\276\276!\225\225\276!\225\225\200\200\275\275!");
    }

    @Test
    public void test06217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06217");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0170\u0170\u0346\u0348\u0348!", "LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u019e\u019c\u019c\u019e\u019c\u019c\u019e\u019c\u019c\u019e\u019c\u019c\u019e\u019c\u019c\u019e\u019c\u019c\u019e\u019c\u019c\u019e\u019c\u019c\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u019e\u019c\u019c\u019e\u019c\u019c\u019e\u019c\u019c\u019e\u019c\u019c\u019e\u019c\u019c\u019e\u019c\u019c\u019e\u019c\u019c\u019e\u019c\u019c\u0346\u0348\u0348!");
    }

    @Test
    public void test06218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06218");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230\200}}`L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230]]!", "\276X\266\266~XX\276X\266\266~XX!!\276X\266\266~XX\276X\266\266~XX!!\276X\266\266~XX\276X\266\266~XX\276X\266\266~XX\276X\266\266~XX!!\276X\266\266~XX\276X\266\266~XX!!\276X\266\266~XX\276X\266\266~XX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]\225\230\230~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]\225\230\230~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]\225\230\230~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]\225\230\230\200}}`~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]\225\230\230~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]\225\230\230~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]\225\230\230~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]\225\230\230]]!" + "'", str2, "~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]\225\230\230~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]\225\230\230~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]\225\230\230~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]\225\230\230\200}}`~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]\225\230\230~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]\225\230\230~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]\225\230\230~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]\225\230\230]]!");
    }

    @Test
    public void test06219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06219");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UULLUULLUULLUULLUULL!", "]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276\300\300\276\276\300\300\276\276\300\300\276\276\300\300\276\276\300\300!" + "'", str2, "\276\276\300\300\276\276\300\300\276\276\300\300\276\276\300\300\276\276\300\300!");
    }

    @Test
    public void test06220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06220");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\260\260nullnull\260\260nullnull}}\260\260nullnull\260\260nullnull}}!", "nullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljj!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\260ULLLULLL\260\260ULLLULLL}}\260\260ULLLULLL\260\260ULLLULLL}}!" + "'", str2, "\260\260ULLLULLL\260\260ULLLULLL}}\260\260ULLLULLL\260\260ULLLULLL}}!");
    }

    @Test
    public void test06221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06221");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\200\200\230\230\200\200\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06222");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!!", "FF]]FF]]FF]]FF]]~}}^FF]]FF]]FF]]FF]]]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!!" + "'", str2, "\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!!");
    }

    @Test
    public void test06223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06223");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```!", "!!!!!!!!!!!!!!!!\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!" + "'", str2, "!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!");
    }

    @Test
    public void test06224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06224");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "LNUULNUU!!LNUULNUU!!LNUULNUULNUULNUU!!LNUULNUU!!LNUULNUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test06225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06225");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]`^^]`^^!", "``!!``!!``!!``!!``!!``!!``!!``!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]`^^]`^^!" + "'", str2, "]`^^]`^^!");
    }

    @Test
    public void test06226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06226");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL!", "``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!!``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!!``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!!``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!!``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull!" + "'", str2, "\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull!");
    }

    @Test
    public void test06227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06227");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullqnullnullnullqnullnull}~\200\200}~\200\200nullqnullnullnullqnullnull}~\200\200}~\200\200nullqnullnullnullqnullnull}~\200\200}~\200\200\u0348\u0346\u0346!", "LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200UL``LUL``UL``UL``LUL``UL``}~\200\200}~\200\200UL``LUL``UL``UL``LUL``UL``}~\200\200}~\200\200UL``LUL``UL``UL``LUL``UL``}~\200\200}~\200\200\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200UL``LUL``UL``UL``LUL``UL``}~\200\200}~\200\200UL``LUL``UL``UL``LUL``UL``}~\200\200}~\200\200UL``LUL``UL``UL``LUL``UL``}~\200\200}~\200\200\u0348\u0346\u0346!");
    }

    @Test
    public void test06228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06228");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NNLLLLNN!", "\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06229");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!" + "'", str2, "\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!");
    }

    @Test
    public void test06230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06230");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("F!HHF!HHF!HHF!HHF!HHF!HHF!HHF!HH!", "!~UU!~UU!~UU!~UU!~UU!~UU!~UU!~UU!!!~UU!~UU!~UU!~UU!~UU!~UU!~UU!~UU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test06231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06231");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\300\300!!\300\300!!\300\300!!\300\300\u0346\u0348\u0348!", "\u0420\u0420\u0420\u0420!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test06232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06232");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL!!\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL!!\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL!!\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL!!\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL!!\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL!!\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL!!\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL!!!", "\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!!" + "'", str2, "L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!!");
    }

    @Test
    public void test06233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06233");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NLLLL]NNL]NNL]NNL]NNNLLLL]NNL]NN!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnullnullnull\214nullnullnullnullnullnullnullnullnullnullnullnull\214nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull\214nullnullnullnullnullnullnullnullnullnullnullnull\214nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull\214nullnullnullnullnullnullnullnullnullnullnullnull\214nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull\214nullnullnullnullnullnullnullnullnullnullnullnull\214\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U\200\200\200\200]UU\200]UU\200]UU\200]UUU\200\200\200\200]UU\200]UU!" + "'", str2, "U\200\200\200\200]UU\200]UU\200]UU\200]UUU\200\200\200\200]UU\200]UU!");
    }

    @Test
    public void test06234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06234");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!!", "NNKKNNKKNNKKNNKKNNKKNNKKNNKKNNKK\214\214NNKKNNKKNNKKNNKKNNKKNNKKNNKKNNKK\214\214NNKKNNKKNNKKNNKKNNKKNNKKNNKKNNKK\214\214NNKKNNKKNNKKNNKKNNKKNNKKNNKKNNKK\214\214NNKKNNKKNNKKNNKKNNKKNNKKNNKKNNKK\214\214NNKKNNKKNNKKNNKKNNKKNNKKNNKKNNKK\214\214NNKKNNKKNNKKNNKKNNKKNNKKNNKKNNKK\214\214NNKKNNKKNNKKNNKKNNKKNNKKNNKKNNKK\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!!" + "'", str2, "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!!");
    }

    @Test
    public void test06235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06235");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\253\256\256]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "nullnullnullnullnullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnullnullnullnullnull\204\204nullnull\204\204!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test06236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06236");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\335\336\340\340nullnullnull\335\336\340\340nullnullnull!!\335\336\340\340nullnullnull\335\336\340\340nullnullnull!!\335\336\340\340nullnullnull\335\336\340\340nullnullnull!!\335\336\340\340nullnullnull\335\336\340\340\u0346\u0348\u0348!", "\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368!U\276\276\230U\215\215\230U\215\215\230U\215\215!U\276\276\230U\215\215\230U\215\215\230U\215\215!!!U\276\276\230U\215\215\230U\215\215\230U\215\215!U\276\276\230U\215\215\230U\215\215\230U\215\215!!!U\276\276\230U\215\215\230U\215\215\230U\215\215!U\276\276\230U\215\215\230U\215\215\230U\215\215!!!U\276\276\230U\215\215\230U\215\215\230U\215\215!U\276\276\230U\215\215\230U\215\215\230U\215\215\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368!U\276\276\230U\215\215\230U\215\215\230U\215\215!U\276\276\230U\215\215\230U\215\215\230U\215\215!!!U\276\276\230U\215\215\230U\215\215\230U\215\215!U\276\276\230U\215\215\230U\215\215\230U\215\215!!!U\276\276\230U\215\215\230U\215\215\230U\215\215!U\276\276\230U\215\215\230U\215\215\230U\215\215!!!U\276\276\230U\215\215\230U\215\215\230U\215\215!U\276\276\230U\215\215\230U\215\215\230U\215\215\u0346\u0348\u0348!");
    }

    @Test
    public void test06237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06237");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220\335\335\336\336\213\220\220!", "LIIILIII!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220!" + "'", str2, "nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220!");
    }

    @Test
    public void test06238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06238");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253uruuuruu\253\253uruuuruu\253\253uruuuruu\253\253uruuuruu\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253uruuuruu\253\253uruuuruu\253\253!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\342null\342\342\342null\342\342\253\253\342null\342\342\342null\342\342\253\253\342null\342\342\342null\342\342\253\253\342null\342\342\342null\342\342\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\342null\342\342\342null\342\342\253\253\342null\342\342\342null\342\342\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\342null\342\342\342null\342\342\253\253\342null\342\342\342null\342\342\253\253\342null\342\342\342null\342\342\253\253\342null\342\342\342null\342\342\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\342null\342\342\342null\342\342\253\253\342null\342\342\342null\342\342\253\253!");
    }

    @Test
    public void test06239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06239");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!", "]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!" + "'", str2, "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
    }

    @Test
    public void test06240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06240");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!oprroprroprroprr!", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06241");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u0346\u0348\u0348!", "U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test06242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06242");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e!", "\215}\215\215\215}\215\215A]]]A]]]A]]]A]]]\215}\215\215\215}\215\215!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06243");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN!", "\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU!" + "'", str2, "^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU!");
    }

    @Test
    public void test06244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06244");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259\u0259!", "\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!" + "'", str2, "!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!");
    }

    @Test
    public void test06245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06245");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test06246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06246");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!!" + "'", str2, "NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!!");
    }

    @Test
    public void test06247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06247");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u03c0\u03c0\u03c0\u03c0!!\200\200\u0346\u0348\u0348!", "\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\200}}`\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368nullnull!!nullnull!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368nullnull!!nullnull!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test06248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06248");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!", "\u0368\u0368\u0368\u0368!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!" + "'", str2, "null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!");
    }

    @Test
    public void test06249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06249");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!!!nullnullnull!nullnullnull!", "LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a!" + "'", str2, "\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a!");
    }

    @Test
    public void test06250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06250");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254!!!", "\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!\275XXXXXXXXXXX!!!!\275XXXXXXXXXXX!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "XXXXnullnullnull\256\254\254XXXXnullnullnull\256\254\254!!XXXXnullnullnull\256\254\254XXXXnullnullnull\256\254\254!!XXXXnullnullnull\256\254\254XXXXnullnullnull\256\254\254!!XXXXnullnullnull\256\254\254XXXXnullnullnull\256\254\254!!XXXXnullnullnull\256\254\254XXXXnullnullnull\256\254\254!!XXXXnullnullnull\256\254\254XXXXnullnullnull\256\254\254!!XXXXnullnullnull\256\254\254XXXXnullnullnull\256\254\254!!XXXXnullnullnull\256\254\254XXXXnullnullnull\256\254\254!!!" + "'", str2, "XXXXnullnullnull\256\254\254XXXXnullnullnull\256\254\254!!XXXXnullnullnull\256\254\254XXXXnullnullnull\256\254\254!!XXXXnullnullnull\256\254\254XXXXnullnullnull\256\254\254!!XXXXnullnullnull\256\254\254XXXXnullnullnull\256\254\254!!XXXXnullnullnull\256\254\254XXXXnullnullnull\256\254\254!!XXXXnullnullnull\256\254\254XXXXnullnullnull\256\254\254!!XXXXnullnullnull\256\254\254XXXXnullnullnull\256\254\254!!XXXXnullnullnull\256\254\254XXXXnullnullnull\256\254\254!!!");
    }

    @Test
    public void test06251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06251");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276\276nullnull\276\276nullnull!", "\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276nullnullnullnullnullnullnullnull\276\276nullnullnullnullnullnullnullnull!" + "'", str2, "\276\276nullnullnullnullnullnullnullnull\276\276nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06252");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!]]nullnull!!nullnull!!]]nullnull!!nullnull!!]]nullnull!!nullnull!!]]]nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!]]nullnull!!nullnull!!]]!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368!!]]!" + "'", str2, "\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368!!]]!");
    }

    @Test
    public void test06253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06253");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!", "!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!" + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
    }

    @Test
    public void test06254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06254");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!", "P!RRP!RRP!RRP!RRP!RRP!RRP!RRP!RR!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test06255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06255");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\215}\215\215\215}\215\215nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\215}\215\215\215}\215\215!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\215}\215\215\215}\215\215!");
    }

    @Test
    public void test06256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06256");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0!!!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test06257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06257");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!", "null!!!null!!!!null!!!null!!null!!!null!!!!null!!!null!!null!!!null!!!!null!!!null!!null!!!null!!!!null!!!null!!null!!!null!!!!null!!!null!!null!!!null!!!!null!!!null!!null!!!null!!!!null!!!null!!null!!!null!!!!null!!!null!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!" + "'", str2, "\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!");
    }

    @Test
    public void test06258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06258");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200nullnullnullnullnullnullnullnull!", "JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}null\200\200}null\200\200}null\200\200}null\200\200\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e}null\200\200}null\200\200}null\200\200}null\200\200\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e!" + "'", str2, "}null\200\200}null\200\200}null\200\200}null\200\200\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e}null\200\200}null\200\200}null\200\200}null\200\200\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e!");
    }

    @Test
    public void test06259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06259");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("JILLJILLJILLJILLJILLJILLJILLJILL!", "\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06260");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!", "\276\276nullnull\276\276nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!u!\276\276u!\276\276!!u!\276\276u!\276\276!!!!u!\276\276u!\276\276!!u!\276\276u!\276\276!!!!u!\276\276u!\276\276!!u!\276\276u!\276\276!!!!u!\276\276u!\276\276!!u!\276\276u!\276\276!!!!u!\276\276u!\276\276!!u!\276\276u!\276\276!!!!u!\276\276u!\276\276!!u!\276\276u!\276\276!!!!u!\276\276u!\276\276!!u!\276\276u!\276\276!!!!u!\276\276u!\276\276!!u!\276\276u!\276\276!!!" + "'", str2, "!!u!\276\276u!\276\276!!u!\276\276u!\276\276!!!!u!\276\276u!\276\276!!u!\276\276u!\276\276!!!!u!\276\276u!\276\276!!u!\276\276u!\276\276!!!!u!\276\276u!\276\276!!u!\276\276u!\276\276!!!!u!\276\276u!\276\276!!u!\276\276u!\276\276!!!!u!\276\276u!\276\276!!u!\276\276u!\276\276!!!!u!\276\276u!\276\276!!u!\276\276u!\276\276!!!!u!\276\276u!\276\276!!u!\276\276u!\276\276!!!");
    }

    @Test
    public void test06261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06261");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u017e\u017e\u017e\u017e\u017e\u017e!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06262");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!", "\275UNLLUNLLUNLL\276UNLL\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!" + "'", str2, "!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!");
    }

    @Test
    public void test06263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06263");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275UNLLUNLLUNLL\276UNLL\275\275!", "\336UUUUnull!!Unull!!!!!!\336UUUUnull!!Unull!!!!!!!!\336UUUUnull!!Unull!!!!!!\336UUUUnull!!Unull!!!!!!!!\336UUUUnull!!Unull!!!!!!\336UUUUnull!!Unull!!!!!!!!\336UUUUnull!!Unull!!!!!!\336UUUUnull!!Unull!!!!!!!!\336UUUUnull!!Unull!!!!!!\336UUUUnull!!Unull!!!!!!!!\336UUUUnull!!Unull!!!!!!\336UUUUnull!!Unull!!!!!!!!\336UUUUnull!!Unull!!!!!!\336UUUUnull!!Unull!!!!!!!!\336UUUUnull!!Unull!!!!!!\336UUUUnull!!Unull!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!UUU!UUU!UUU\276!UUU\275\275!" + "'", str2, "\275!UUU!UUU!UUU\276!UUU\275\275!");
    }

    @Test
    public void test06264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06264");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!", "!~LL!~LL!!!~LL!~LL!!!~LL!~LL!~LL!~LL!!!~LL!~LL!!!~LL!~LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!" + "'", str2, "!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!");
    }

    @Test
    public void test06265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06265");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\253\254\256\256LNUULNUULNUULNUU\253\254\256\256LNUULNUU!", "~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\230\230\u0106\u0106\u0106\u0106\u0106\u0106\230\230~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\230\230\u0106\u0106\u0106\u0106\u0106\u0106\230\230~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\230\230\u0106\u0106\u0106\u0106\u0106\u0106\230\230~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\230\230\u0106\u0106\u0106\u0106\u0106\u0106\230\230~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\230\230\u0106\u0106\u0106\u0106\u0106\u0106\230\230~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\230\230\u0106\u0106\u0106\u0106\u0106\u0106\230\230~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\230\230\u0106\u0106\u0106\u0106\u0106\u0106\230\230~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\230\230\u0106\u0106\u0106\u0106\u0106\u0106\230\230!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256\u017b\u0178\u0179\u0179\u017b\u0178\u0179\u0179\u017b\u0178\u0179\u0179\u017b\u0178\u0179\u0179\253\254\256\256\u017b\u0178\u0179\u0179\u017b\u0178\u0179\u0179!" + "'", str2, "\253\254\256\256\u017b\u0178\u0179\u0179\u017b\u0178\u0179\u0179\u017b\u0178\u0179\u0179\u017b\u0178\u0179\u0179\253\254\256\256\u017b\u0178\u0179\u0179\u017b\u0178\u0179\u0179!");
    }

    @Test
    public void test06266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06266");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!", "null\200}}`null]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnullL\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnull!!L\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnullL\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnull!!L\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnullL\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnullL\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnullL\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnull!!L\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnullL\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnull!!L\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnullL\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnull!" + "'", str2, "L\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnullL\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnull!!L\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnullL\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnull!!L\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnullL\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnullL\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnullL\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnull!!L\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnullL\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnull!!L\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnullL\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnull!");
    }

    @Test
    public void test06267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06267");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275``UU``UU``UU\276``UU\275\275!", "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\u0104\u0104\u0104\u0104\u0104\u0104\276\u0104\u0104\275\275!" + "'", str2, "\275\u0104\u0104\u0104\u0104\u0104\u0104\276\u0104\u0104\275\275!");
    }

    @Test
    public void test06268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06268");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NL!!NL!!!", "\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250!!!\250!!!!" + "'", str2, "\250!!!\250!!!!");
    }

    @Test
    public void test06269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06269");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull!", "!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````!" + "'", str2, "\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````\276!````````!");
    }

    @Test
    public void test06270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06270");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fanullnullnullnullnullnullnullnullnullnullnullnull!", "!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u02fa\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u02fa\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u02fa\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u02fa\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0nullnull!" + "'", str2, "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u02fa\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u02fa\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u02fa\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u02fa\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0nullnull!");
    }

    @Test
    public void test06271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06271");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!", "nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test06272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06272");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!", "L~UUL~UU!!L~UUL~UU!!L~UUL~UUL~UUL~UU!!L~UUL~UU!!L~UUL~UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test06273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06273");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200UUUU\214UUUUUUUUUUUU\214UUUUUUUU}~\200\200}~\200\200UUUU\214UUUUUUUUUUUU\214UUUUUUUU}~\200\200}~\200\200UUUU\214UUUUUUUUUUUU\214UUUUUUUU}~\200\200}~\200\200UUUU\214UUUUUUUUUUUU\214\u0348\u0346\u0346!", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnullnullnull\214nullnullnullnullnullnullnullnullnullnullnullnull\214nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull\214nullnullnullnullnullnullnullnullnullnullnullnull\214nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull\214nullnullnullnullnullnullnullnullnullnullnullnull\214nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull\214nullnullnullnullnullnullnullnullnullnullnullnull\214\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnullnullnull\214nullnullnullnullnullnullnullnullnullnullnullnull\214nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull\214nullnullnullnullnullnullnullnullnullnullnullnull\214nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull\214nullnullnullnullnullnullnullnullnullnullnullnull\214nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull\214nullnullnullnullnullnullnullnullnullnullnullnull\214\u0348\u0346\u0346!");
    }

    @Test
    public void test06274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06274");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull!!!!nullnull!", "!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06275");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e!", "HHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06276");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256!!]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256!!]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256!!]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256!!]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256!", "F]]]F]]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256!!]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256!!]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256!!]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256!!]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256!" + "'", str2, "]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256!!]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256!!]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256!!]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256!!]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256!");
    }

    @Test
    public void test06277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06277");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!!", "\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test06278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06278");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]]!!]]!!}}]]!!]]!!}}!", "`\253!!!\253!!!\253!!!`\253!!!\253!!!\253!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]!!]]!!}}]]!!]]!!}}!" + "'", str2, "]]!!]]!!}}]]!!]]!!}}!");
    }

    @Test
    public void test06279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06279");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u016e\u016e\u016e\u016e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u016e\u016e\u016e\u016e!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test06280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06280");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("JLLL\200}}`JLLL]]!", "\336\300\300\300\300\336\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\200}}`nullnullnullnull]]!" + "'", str2, "nullnullnullnull\200}}`nullnullnullnull]]!");
    }

    @Test
    public void test06281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06281");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016e\u016c\u016enullnull!", "\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276\u0260\275\u0260\275\u0260\275\u0260\275\u0260\275\u0260\275\u0260\275\u0260\275!!\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276\u0260\275\u0260\275\u0260\275\u0260\275\u0260\275\u0260\275\u0260\275\u0260\275!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!!" + "'", str2, "!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!nullnull\275\u0193!!\275\u0193!!!");
    }

    @Test
    public void test06282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06282");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!", "\275``UU``UU``UU\276``UU\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnull!" + "'", str2, "RRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnull!");
    }

    @Test
    public void test06283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06283");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\220xx\200}}`null\220xx]]!", "~}\200\200~}\200\200LL~~}\200\200LL~~}\200\200\230\230LL~~}\200\200LL~~}\200\200\230\230~}\200\200~}\200\200LL~~}\200\200LL~~}\200\200\230\230LL~~}\200\200LL~~}\200\200\230\230~}\200\200~}\200\200LL~~}\200\200LL~~}\200\200\230\230LL~~}\200\200LL~~}\200\200\230\230~}\200\200~}\200\200LL~~}\200\200LL~~}\200\200\230\230LL~~}\200\200LL~~}\200\200\230\230~}\200\200~}\200\200LL~~}\200\200LL~~}\200\200\230\230LL~~}\200\200LL~~}\200\200\230\230~}\200\200~}\200\200LL~~}\200\200LL~~}\200\200\230\230LL~~}\200\200LL~~}\200\200\230\230~}\200\200~}\200\200LL~~}\200\200LL~~}\200\200\230\230LL~~}\200\200LL~~}\200\200\230\230~}\200\200~}\200\200LL~~}\200\200LL~~}\200\200\230\230LL~~}\200\200LL~~}\200\200\230\230!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0199\u0199\220nullnull\200\u0199\u0199\220nullnull]]!" + "'", str2, "\u0199\u0199\220nullnull\200\u0199\u0199\220nullnull]]!");
    }

    @Test
    public void test06284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06284");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\351\351\352\352\351\351\352\352!!\351\351\352\352\351\351\352\352!!\351\351\352\352\351\351\352\352\351\351\352\352\351\351\352\352!!\351\351\352\352\351\351\352\352!!\351\351\352\352\351\351\352\352!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06285");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01de\u01de!", "nullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLUUUUULLUUUUUUULLUUUUULLUUUUUUULLUUUUULLUUUUUUULLUUUUULLUUUUUUULLUUUUULLUUUUUUULLUUUUULLUUUUUUULLUUUUULLUUUUUUULLUUUUULLUUUUUUU!" + "'", str2, "LLUUUUULLUUUUUUULLUUUUULLUUUUUUULLUUUUULLUUUUUUULLUUUUULLUUUUUUULLUUUUULLUUUUUUULLUUUUULLUUUUUUULLUUUUULLUUUUUUULLUUUUULLUUUUUUU!");
    }

    @Test
    public void test06286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06286");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!", "\275LLL\276L\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test06287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06287");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "}~\200\200}~\200\200\300\300\300\300^\300\300\300\300\300\300\300\300\300\300\300\300^\300\300\300\300\300\300\300\300}~\200\200}~\200\200\300\300\300\300^\300\300\300\300\300\300\300\300\300\300\300\300^\300\300\300\300\300\300\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test06288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06288");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]!", "!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]!" + "'", str2, "]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]!");
    }

    @Test
    public void test06289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06289");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!", "nullnullnullnullnullnullnullnull~~~~~~~~nullnullnullnullnullnullnullnull~~~~~~~~!!nullnullnullnullnullnullnullnull~~~~~~~~nullnullnullnullnullnullnullnull~~~~~~~~!!nullnullnullnullnullnullnullnull~~~~~~~~nullnullnullnullnullnullnullnull~~~~~~~~nullnullnullnullnullnullnullnull~~~~~~~~nullnullnullnullnullnullnullnull~~~~~~~~!!nullnullnullnullnullnullnullnull~~~~~~~~nullnullnullnullnullnullnullnull~~~~~~~~!!nullnullnullnullnullnullnullnull~~~~~~~~nullnullnullnullnullnullnullnull~~~~~~~~!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u021e\u021e\u021e\u021e\u021e\u021e\u021e\u021e!!!" + "'", str2, "\u021e\u021e\u021e\u021e\u021e\u021e\u021e\u021e!!!");
    }

    @Test
    public void test06290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06290");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230!" + "'", str2, "~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230~}\200\200~}\200\200!!``!!``!!``!!``!!``!!``!!``!!``\230\230!!``!!``!!``!!``!!``!!``!!``!!``\230\230!");
    }

    @Test
    public void test06291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06291");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("fehhfehhfehhfehhfehhfehhfehhfehh!", "\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108!" + "'", str2, "\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108!");
    }

    @Test
    public void test06292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06292");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06293");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264!", "\u032d\200\200\u032d\200\200\u032d\200\200\u032d\200\200\u032e\u0330\u0330\u0330\u032e\u0330\u0330\u0330\u032e\u0330\u0330\u0330\u032e\u0330\u0330\u0330\u032d\200\200\u032d\200\200\u032d\200\200\u032d\200\200\u032e\u0330\u0330\u0330\u032e\u0330\u0330\u0330!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06294");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200LL!!LL!!LLLL!!LL!!LL~}\200\200~}\200\200LL!!LL!!LLLL!!LL!!LL~}\200\200~}\200\200LL!!LL!!LLLL!!LL!!LL~}\200\200~}\200\200LL!!LL!!LLLL!!LL!!LL~}\200\200~}\200\200LL!!LL!!LLLL!!LL!!LL~}\200\200~}\200\200LL!!LL!!LLLL!!LL!!LL~}\200\200~}\200\200LL!!LL!!LLLL!!LL!!LL~}\200\200~}\200\200LL!!LL!!LLLL!!LL!!LL!", "HFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFF!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull!" + "'", str2, "~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test06295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06295");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0!", "nullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fanullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fanullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06296");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!", "\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a~~!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test06297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06297");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\253\254\256\256LNUULNUULNUULNUU\253\254\256\256LNUULNUU!", "`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256~`~~~`~~~`~~~`~~\253\254\256\256~`~~~`~~!" + "'", str2, "\253\254\256\256~`~~~`~~~`~~~`~~\253\254\256\256~`~~~`~~!");
    }

    @Test
    public void test06298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06298");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("EEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EE!!EEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EE!!EEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EE!!EEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EE!!EEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EE!", "nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnullnullnullnullnull\336\336nullnull\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!" + "'", str2, "NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!");
    }

    @Test
    public void test06299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06299");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200!", "\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LULLLULL\200\200LULLLULL\200\200LULLLULL\200\200LULLLULL\200\200LULLLULL\200\200LULLLULL\200\200LULLLULL\200\200LULLLULL\200\200!" + "'", str2, "LULLLULL\200\200LULLLULL\200\200LULLLULL\200\200LULLLULL\200\200LULLLULL\200\200LULLLULL\200\200LULLLULL\200\200LULLLULL\200\200!");
    }

    @Test
    public void test06300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06300");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u01de\u01db\u01db\u01db\u01de\u01db\u01db\u01db\u01de\u01db\u01db\u01db\u01de\u01db\u01db\u01db\u01de\u01db\u01db\u01db\u01de\u01db\u01db\u01db]]!", "^```^```^```^```^```^```^```^```^```^```nullnull\225\225nullnull\225\225^```^```nullnull\225\225nullnull\225\225^```^```^```^```^```^```^```^```^```^```nullnull\225\225nullnull\225\225^```^```nullnull\225\225nullnull\225\225^```^```^```^```^```^```^```^```^```^```nullnull\225\225nullnull\225\225^```^```nullnull\225\225nullnull\225\225^```^```^```^```^```^```^```^```^```^```nullnull\225\225nullnull\225\225^```^```nullnull\225\225nullnull\225\225^```^```^```^```^```^```^```^```^```^```nullnull\225\225nullnull\225\225^```^```nullnull\225\225nullnull\225\225^```^```^```^```^```^```^```^```^```^```nullnull\225\225nullnull\225\225^```^```nullnull\225\225nullnull\225\225^```^```^```^```^```^```^```^```^```^```nullnull\225\225nullnull\225\225^```^```nullnull\225\225nullnull\225\225^```^```^```^```^```^```^```^```^```^```nullnull\225\225nullnull\225\225^```^```nullnull\225\225nullnull\225\225!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}nullnullnullnullnullnullnullnullnullnullnullnull~}}^}nullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "}nullnullnullnullnullnullnullnullnullnullnullnull~}}^}nullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test06301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06301");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225!", "UNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNN!!UNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNN!!UNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNN!!UNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNN!!UNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNUNNNNUNUNNNN\225\225UNUNNNNUNUNNNN\225\225UNUNNNNUNUNNNN\225\225UNUNNNNUNUNNNN\225\225UNUNNNNUNUNNNN\225\225UNUNNNNUNUNNNN\225\225UNUNNNNUNUNNNN\225\225UNUNNNNUNUNNNN\225\225!" + "'", str2, "UNUNNNNUNUNNNN\225\225UNUNNNNUNUNNNN\225\225UNUNNNNUNUNNNN\225\225UNUNNNNUNUNNNN\225\225UNUNNNNUNUNNNN\225\225UNUNNNNUNUNNNN\225\225UNUNNNNUNUNNNN\225\225UNUNNNNUNUNNNN\225\225!");
    }

    @Test
    public void test06302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06302");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214!", "!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214!");
    }

    @Test
    public void test06303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06303");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!}~\200\200}~\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "FEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!}~\200\200}~\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "}~\200\200}~\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!}~\200\200}~\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test06304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06304");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!!!", "\352\356\356\356\352\356\356\356\352\356\356\356\352\356\356\356\200}}`\352\356\356\356\352\356\356\356\352\356\356\356\352\356\356\356]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!!!" + "'", str2, "\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!!!");
    }

    @Test
    public void test06305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06305");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06306");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test06307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06307");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!", "\275L!]]L!]]L!]]\275L!]]L!]]L!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]!!]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]!!]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]!!]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]!!]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]!" + "'", str2, "]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]!!]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]!!]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]!!]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]!!]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]!");
    }

    @Test
    public void test06308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06308");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\300\300!!\300\300!!\300\300!!\300\300\u0346\u0348\u0348!", "XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test06309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06309");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276\276\300\300\276\276\300\300!!\276\276\300\300\276\276\300\300!!\276\276\300\300\276\276\300\300\276\276\300\300\276\276\300\300!!\276\276\300\300\276\276\300\300!!\276\276\300\300\276\276\300\300!", "NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276nullnull\276\276nullnull!!\276\276nullnull\276\276nullnull!!\276\276nullnull\276\276nullnull\276\276nullnull\276\276nullnull!!\276\276nullnull\276\276nullnull!!\276\276nullnull\276\276nullnull!" + "'", str2, "\276\276nullnull\276\276nullnull!!\276\276nullnull\276\276nullnull!!\276\276nullnull\276\276nullnull\276\276nullnull\276\276nullnull!!\276\276nullnull\276\276nullnull!!\276\276nullnull\276\276nullnull!");
    }

    @Test
    public void test06310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06310");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("`\253!!!\253!!!\253!!!`\253!!!\253!!!\253!!!!", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`\253!!!\253!!!\253!!!`\253!!!\253!!!\253!!!!" + "'", str2, "`\253!!!\253!!!\253!!!`\253!!!\253!!!\253!!!!");
    }

    @Test
    public void test06311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06311");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248!", "~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!" + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
    }

    @Test
    public void test06312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06312");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!", "]\220!!\200~~]\220!!\200~~]\220!!]\220!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!]\220!!\200~~]\220!!\200~~]\220!!]\220!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!" + "'", str2, "!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!");
    }

    @Test
    public void test06313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06313");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN``NN!", "nullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUU!!nullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUU!!nullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUU!!nullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUU!!nullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU``UU!" + "'", str2, "``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU``UU!");
    }

    @Test
    public void test06314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06314");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\215}\215\215\215}\215\215L\270\270\270L\270\270\270L\270\270\270L\270\270\270\215}\215\215\215}\215\215!", "\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull\275nullnullnull\275nullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215L\270\270\270L\270\270\270L\270\270\270L\270\270\270\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215L\270\270\270L\270\270\270L\270\270\270L\270\270\270\215}\215\215\215}\215\215!");
    }

    @Test
    public void test06315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06315");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06316");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!}~\200\200}~\200\200]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!!" + "'", str2, "}~\200\200}~\200\200]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!}~\200\200}~\200\200]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!!");
    }

    @Test
    public void test06317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06317");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull!", "WXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXWXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "XW\275\275XW\275\275!" + "'", str2, "XW\275\275XW\275\275!");
    }

    @Test
    public void test06318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06318");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014enullnull!", "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031anullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e!" + "'", str2, "\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e!");
    }

    @Test
    public void test06319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06319");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NnullnullnullNnullnullnullNnullnullnullNnullnullnull\200}}`NnullnullnullNnullnullnullNnullnullnullNnullnullnull]]!", "nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ULLUULLUULLUUULLUULLUULLUUULLUULLUULLUUULLUULLUULLUU\200}}`ULLUULLUULLUUULLUULLUULLUUULLUULLUULLUUULLUULLUULLUU]]!" + "'", str2, "ULLUULLUULLUUULLUULLUULLUUULLUULLUULLUUULLUULLUULLUU\200}}`ULLUULLUULLUUULLUULLUULLUUULLUULLUULLUUULLUULLUULLUU]]!");
    }

    @Test
    public void test06320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06320");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test06321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06321");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH!", "HH!!HH!!HHHH!!HH!!HH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "T!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TT!" + "'", str2, "T!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TT!");
    }

    @Test
    public void test06322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06322");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```!", "W!XXW!XXW!XXW!XX\200}}`W!XXW!XXW!XXW!XX]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```!" + "'", str2, "nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```!");
    }

    @Test
    public void test06323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06323");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216!", "\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216!" + "'", str2, "\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216!");
    }

    @Test
    public void test06324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06324");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0262\u0264\u0264\u0262\u0264\u0264\u0262\u0264\u0264\u0262\u0264\u0264\u0262\u0264\u0264\u0262\u0264\u0264\u0262\u0264\u0264\u0262\u0264\u0264\u0262\u0264\u0264\u0262\u0264\u0264\u0262\u0264\u0264\u0262\u0264\u0264!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnullnull~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnull!" + "'", str2, "null~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnullnull~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnull!");
    }

    @Test
    public void test06325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06325");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL\200}}`NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL]]!", "\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN\200}}`NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN]]!" + "'", str2, "NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN\200}}`NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN]]!");
    }

    @Test
    public void test06326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06326");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\260\255\255\225\230\230null\260\255\255\225\230\230null\260\255\255\225\230\230null\260\255\255\225\230\230\200}}`null\260\255\255\225\230\230null\260\255\255\225\230\230null\260\255\255\225\230\230null\260\255\255\225\230\230]]!", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuu\260\255\255\225\230\230uuuu\260\255\255\225\230\230uuuu\260\255\255\225\230\230uuuu\260\255\255\225\230\230\200}}`uuuu\260\255\255\225\230\230uuuu\260\255\255\225\230\230uuuu\260\255\255\225\230\230uuuu\260\255\255\225\230\230]]!" + "'", str2, "uuuu\260\255\255\225\230\230uuuu\260\255\255\225\230\230uuuu\260\255\255\225\230\230uuuu\260\255\255\225\230\230\200}}`uuuu\260\255\255\225\230\230uuuu\260\255\255\225\230\230uuuu\260\255\255\225\230\230uuuu\260\255\255\225\230\230]]!");
    }

    @Test
    public void test06327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06327");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!eeeeeeeeeeeeeeee!!!eeeeeeeeeeeeeeee!!!!!eeeeeeeeeeeeeeee!!!eeeeeeeeeeeeeeee!!!!!eeeeeeeeeeeeeeee!!!eeeeeeeeeeeeeeee!!!eeeeeeeeeeeeeeee!!!eeeeeeeeeeeeeeee!!!!!eeeeeeeeeeeeeeee!!!eeeeeeeeeeeeeeee!!!!!eeeeeeeeeeeeeeee!!!eeeeeeeeeeeeeeee!!!", "\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128nullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!NNNNNNNNNNNNNNNN!!!NNNNNNNNNNNNNNNN!!!!!NNNNNNNNNNNNNNNN!!!NNNNNNNNNNNNNNNN!!!!!NNNNNNNNNNNNNNNN!!!NNNNNNNNNNNNNNNN!!!NNNNNNNNNNNNNNNN!!!NNNNNNNNNNNNNNNN!!!!!NNNNNNNNNNNNNNNN!!!NNNNNNNNNNNNNNNN!!!!!NNNNNNNNNNNNNNNN!!!NNNNNNNNNNNNNNNN!!!" + "'", str2, "!NNNNNNNNNNNNNNNN!!!NNNNNNNNNNNNNNNN!!!!!NNNNNNNNNNNNNNNN!!!NNNNNNNNNNNNNNNN!!!!!NNNNNNNNNNNNNNNN!!!NNNNNNNNNNNNNNNN!!!NNNNNNNNNNNNNNNN!!!NNNNNNNNNNNNNNNN!!!!!NNNNNNNNNNNNNNNN!!!NNNNNNNNNNNNNNNN!!!!!NNNNNNNNNNNNNNNN!!!NNNNNNNNNNNNNNNN!!!");
    }

    @Test
    public void test06328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06328");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\276N\225\225\276N\225\225\200\200\276N\225\225\276N\225\225\200\200\276N\225\225\276N\225\225\200\200\276\276N\225\225\276N\225\225\200\200\275\275!", "\u0225\u0228\u0228\u0228\200\u0225\u0228\u0228\u0228]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276]\225\225\276]\225\225\200\200\276]\225\225\276]\225\225\200\200\276]\225\225\276]\225\225\200\200\276\276]\225\225\276]\225\225\200\200\275\275!" + "'", str2, "\275\276]\225\225\276]\225\225\200\200\276]\225\225\276]\225\225\200\200\276]\225\225\276]\225\225\200\200\276\276]\225\225\276]\225\225\200\200\275\275!");
    }

    @Test
    public void test06329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06329");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!" + "'", str2, "!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!");
    }

    @Test
    public void test06330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06330");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("`UNUUUNUUUNUU`UNUUUNUUUNUU!", "\u0366\u0365\u0368\u0368\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`LNLLLNLLLNLL`LNLLLNLLLNLL!" + "'", str2, "`LNLLLNLLLNLL`LNLLLNLLLNLL!");
    }

    @Test
    public void test06331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06331");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!", "JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!" + "'", str2, "\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
    }

    @Test
    public void test06332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06332");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a!!!", "EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test06333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06333");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!", "null!nullnull!!!null!nullnull!!!null!nullnull!!!null!nullnull!!!null!nullnull!!!null!nullnull!!!null!nullnull!!!null!nullnull!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test06334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06334");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull]]nullnull]]nullnull]]nullnull]]~}}^nullnull]]nullnull]]nullnull]]nullnull]]]]!", "\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]~}}^nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]]]!" + "'", str2, "nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]~}}^nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]]]!");
    }

    @Test
    public void test06335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06335");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u02a0\u0295\u0298\u0298\u02a0\u0295\u0298\u0298\u02a0\u0295\u0298\u0298\u02a0\u0295\u0298\u0298\u02a0\u0295\u0298\u0298\u02a0\u0295\u0298\u0298\u02a0\u0295\u0298\u0298\u02a0\u0295\u0298\u0298!", "\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06336");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200LL!!LL!!LLLL!!LL!!LL~}\200\200~}\200\200LL!!LL!!LLLL!!LL!!LL~}\200\200~}\200\200LL!!LL!!LLLL!!LL!!LL~}\200\200~}\200\200LL!!LL!!LLLL!!LL!!LL~}\200\200~}\200\200LL!!LL!!LLLL!!LL!!LL~}\200\200~}\200\200LL!!LL!!LLLL!!LL!!LL~}\200\200~}\200\200LL!!LL!!LLLL!!LL!!LL~}\200\200~}\200\200LL!!LL!!LLLL!!LL!!LL!", "U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]\225\230\230U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]\225\230\230U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]\225\230\230U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]\225\230\230\200}}`U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]\225\230\230U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]\225\230\230U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]\225\230\230U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]U]]]\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull!" + "'", str2, "~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test06337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06337");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108!", "null!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FFnull!FF!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLLUNLL!" + "'", str2, "UNLLUNLL!");
    }

    @Test
    public void test06338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06338");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u016e\u0170\u0170\u0170\u016c\u016c\u016c\u016c\u016e\u0170\u0170\u0170\u016c\u016cLL!", "!X!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06339");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "LLUUUULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06340");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321!", "nullnull\200\200!nullnull\200\200nullnull\200\200nullnull\200\200!nullnull\200\200nullnull\200\200nullnull\200\200!nullnull\200\200nullnull\200\200nullnull\200\200!nullnull\200\200nullnull\200\200nullnull\200\200!nullnull\200\200nullnull\200\200nullnull\200\200!nullnull\200\200nullnull\200\200nullnull\200\200!nullnull\200\200nullnull\200\200nullnull\200\200!nullnull\200\200nullnull\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUUL\200\200LNUUL\200\200LNUUL\200\200LNUUL\200\200LNUUL\200\200LNUUL\200\200LNUUL\200\200LNUUL\200\200LNUUL\200\200LNUUL\200\200LNUUL\200\200LNUUL\200\200LNUUL\200\200LNUUL\200\200LNUUL\200\200LNUUL\200\200LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUUL\200\200LNUUL\200\200LNUUL\200\200LNUUL\200\200LNUUL\200\200LNUUL\200\200LNUUL\200\200LNUUL\200\200!" + "'", str2, "LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUUL\200\200LNUUL\200\200LNUUL\200\200LNUUL\200\200LNUUL\200\200LNUUL\200\200LNUUL\200\200LNUUL\200\200LNUUL\200\200LNUUL\200\200LNUUL\200\200LNUUL\200\200LNUUL\200\200LNUUL\200\200LNUUL\200\200LNUUL\200\200LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUUL\200\200LNUUL\200\200LNUUL\200\200LNUUL\200\200LNUUL\200\200LNUUL\200\200LNUUL\200\200LNUUL\200\200!");
    }

    @Test
    public void test06341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06341");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\200}}`\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test06342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06342");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]]!!]]!!!!]]!!]]!!!!]]!!]]!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!", "\275\u0366\u0366nullnull\200\200\u0366\u0366nullnull\200\200\u0366\u0366nullnull\200\200\276\u0366\u0366nullnull\200\200\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]!!]]!!!!]]!!]]!!!!]]!!]]!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!" + "'", str2, "]]!!]]!!!!]]!!]]!!!!]]!!]]!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!");
    }

    @Test
    public void test06343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06343");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0243\u0243\u0243\u0243\u0243\u0243~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!", "\275NLUUNLUUNLUU\275NLUUNLUUNLUU\275NLUUNLUUNLUU\275NLUUNLUUNLUUNLUUNLUU\275\275NLUUNLUU\275\275NLUUNLUU\275\275NLUUNLUU\275\275\275NLUUNLUUNLUU\275NLUUNLUUNLUU\275NLUUNLUUNLUU\275NLUUNLUUNLUUNLUUNLUU\275\275NLUUNLUU\275\275!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~!!null~~~null~~~null~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!null~~~null~~~null~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!" + "'", str2, "~~!!null~~~null~~~null~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!null~~~null~~~null~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!");
    }

    @Test
    public void test06344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06344");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200UL``LUL``UL``UL``LUL``UL``}~\200\200}~\200\200UL``LUL``UL``UL``LUL``UL``}~\200\200}~\200\200UL``LUL``UL``UL``LUL``UL``}~\200\200}~\200\200\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!" + "'", str2, "]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!");
    }

    @Test
    public void test06345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06345");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368nullnullnullnull!!!" + "'", str2, "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368nullnullnullnull!!!");
    }

    @Test
    public void test06346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06346");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\274\274\274\274\274\274\274\274\274\274\274\274\274\274\274\274!", "\u0366\u0365\u0368\u0368\u0123\u0124\u0126\u0126\213\213\213\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\274\274\274\274\274\274\274\274\274\274\274\274\274\274\274\274!" + "'", str2, "!\274\274\274\274\274\274\274\274\274\274\274\274\274\274\274\274!");
    }

    @Test
    public void test06347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06347");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8!", "~~!!nullnullnullnull~~~nullnullnullnull~~~nullnullnullnull~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!nullnullnullnull~~~nullnullnullnull~~~nullnullnullnull~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test06348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06348");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test06349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06349");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06350");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8ULLLULLLULLLULLLULLLULLLULLLULLL!", "NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06351");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnull\276\276nullnull\276\276\253\253nullnull\276\276nullnull\276\276\253\253nullnull\276\276nullnull\276\276\253\253nullnull\276\276nullnull\276\276\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnull\276\276nullnull\276\276\253\253nullnull\276\276nullnull\276\276\253\253!", "]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU!!]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU!!]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU!!]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU!!]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UU]]UU]]\276\276UU]]UU]]\276\276\253\253UU]]UU]]\276\276UU]]UU]]\276\276\253\253UU]]UU]]\276\276UU]]UU]]\276\276\253\253UU]]UU]]\276\276UU]]UU]]\276\276\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UU]]UU]]\276\276UU]]UU]]\276\276\253\253UU]]UU]]\276\276UU]]UU]]\276\276\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UU]]UU]]\276\276UU]]UU]]\276\276\253\253UU]]UU]]\276\276UU]]UU]]\276\276\253\253UU]]UU]]\276\276UU]]UU]]\276\276\253\253UU]]UU]]\276\276UU]]UU]]\276\276\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UU]]UU]]\276\276UU]]UU]]\276\276\253\253UU]]UU]]\276\276UU]]UU]]\276\276\253\253!");
    }

    @Test
    public void test06352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06352");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\275}~\200\200}~\200\200}~\200\200\276}~\200\200\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06353");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06354");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]!", "\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]!" + "'", str2, "\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]!");
    }

    @Test
    public void test06355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06355");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "JLLLJLLLJLLLJLLLJLLLJLLLJLLLJLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06356");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!" + "'", str2, "\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!");
    }

    @Test
    public void test06357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06357");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!!", "xxvvxxvvxxvvxxvv!xxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvv!xxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvv!xxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvv!xxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvv!xxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvv!xxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvv!xxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvv!xxvvxxvvxxvvxxvvxxvvxxvvxxvvxxvv!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!!!XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!!!XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!!!XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!!!XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!!!XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!!!XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!!!XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!!!!" + "'", str2, "XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!!!XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!!!XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!!!XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!!!XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!!!XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!!!XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!!!XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!!!!");
    }

    @Test
    public void test06358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06358");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "nullnull!!``nullnull``nullnull``nullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!``nullnull``nullnull``nullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06359");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\225\225\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\225\225\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\225\225\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\225\225\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\225\225\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\225\225\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\225\225\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\225\225!", "nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLLLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLL\225\225LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLLLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLL\225\225LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLLLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLL\225\225LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLLLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLL\225\225LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLLLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLL\225\225LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLLLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLL\225\225LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLLLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLL\225\225LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLLLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLL\225\225!" + "'", str2, "LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLLLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLL\225\225LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLLLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLL\225\225LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLLLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLL\225\225LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLLLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLL\225\225LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLLLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLL\225\225LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLLLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLL\225\225LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLLLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLL\225\225LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLLLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLL\225\225!");
    }

    @Test
    public void test06360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06360");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("FHHHnullnullnullnullFHHHnullnull!", "\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200null!nullnullnullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ULLL!LLL!LLL!LLL!LLLULLL!LLL!LLL!" + "'", str2, "ULLL!LLL!LLL!LLL!LLLULLL!LLL!LLL!");
    }

    @Test
    public void test06361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06361");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("EHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHHEHHHEHHHHH!", "\253\254\256\256````````````````\253\254\256\256````````!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````````````````````````````````````````````````````````````````````````````````!" + "'", str2, "````````````````````````````````````````````````````````````````````````````````!");
    }

    @Test
    public void test06362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06362");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\200~~~\200~~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test06363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06363");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0106\u0106\u0106\u0106\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0106\u0106\u0106\u0106\u0128\u0126\u0126\u0128\u0126\u0126!", "!!!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!!!nullnullnull!nullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullUN!!nullnullnullUN!!nullnullnullUN!!nullnullnullUN!!nullnullnullnullnullnullnullUN!!nullnullnullUN!!nullnullnull!" + "'", str2, "nullnullnullnullUN!!nullnullnullUN!!nullnullnullUN!!nullnullnullUN!!nullnullnullnullnullnullnullUN!!nullnullnullUN!!nullnullnull!");
    }

    @Test
    public void test06364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06364");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255!", "nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255!" + "'", str2, "\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255!");
    }

    @Test
    public void test06365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06365");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!", "LNLLLNLL!!LNLLLNLL!!LNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test06366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06366");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\u0348\u0346\u0346!", "nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test06367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06367");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!", "\u0346\u0348\u0348\u0348\226\226\226\226\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!!");
    }

    @Test
    public void test06368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06368");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214!", "llllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLL\214\214LLLLLLLL\214\214LLLLLLLL\214\214LLLLLLLL\214\214LLLLLLLL\214\214LLLLLLLL\214\214LLLLLLLL\214\214LLLLLLLL\214\214!" + "'", str2, "LLLLLLLL\214\214LLLLLLLL\214\214LLLLLLLL\214\214LLLLLLLL\214\214LLLLLLLL\214\214LLLLLLLL\214\214LLLLLLLL\214\214LLLLLLLL\214\214!");
    }

    @Test
    public void test06369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06369");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226!!\254~\256\256\254~\256\256\254~\256\256\254~\256\256!", "\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!\254~\256\256\254~\256\256\254~\256\256\254~\256\256!" + "'", str2, "null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
    }

    @Test
    public void test06370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06370");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!", "LUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLLLUNNLUNNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!" + "'", str2, "NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!");
    }

    @Test
    public void test06371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06371");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200nullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnull!", "\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368!!]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368}~\200\200}~\200\200\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368!" + "'", str2, "}~\200\200}~\200\200\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368}~\200\200}~\200\200\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368!");
    }

    @Test
    public void test06372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06372");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullN!!!nullnullnullN!!!nullnull!", "]^``]^``!!]^``]^``!!]^``]^``]^``]^``!!]^``]^``!!]^``]^``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06373");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLL!", "^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226^```^```^```^```^```^```^```^```^```^```\230\225\226\226\230\225\226\226^```^```\230\225\226\226\230\225\226\226!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^^``^^``^^``^^``^^^````^^^````^^^````^^``^^``^^``^^``^^^````^^^````^^^````^^``^^``^^``^^``^^^````^^^````^^^````^^``^^``^^``^^``^^^````^^^````^^^````^^``^^``^^``^^``^^^````^^^````^^^````^^``^^``^^``^^``^^^````^^^````^^^````^^``^^``^^``^^``^^^````^^^````^^^````^^``^^``^^``^^``^^^````^^^````^^^````!" + "'", str2, "^^``^^``^^``^^``^^^````^^^````^^^````^^``^^``^^``^^``^^^````^^^````^^^````^^``^^``^^``^^``^^^````^^^````^^^````^^``^^``^^``^^``^^^````^^^````^^^````^^``^^``^^``^^``^^^````^^^````^^^````^^``^^``^^``^^``^^^````^^^````^^^````^^``^^``^^``^^``^^^````^^^````^^^````^^``^^``^^``^^``^^^````^^^````^^^````!");
    }

    @Test
    public void test06374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06374");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276!!!\276\276!!\276\276!!\276\276!!\276\276!!\276!!!\276\276!!\276\276!!!", "!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!!!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!~null\325\326\330\330nullnullnull\325\326\330\330nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!!!\276\276!!\276\276!!\276\276!!\276\276!!\276!!!\276\276!!\276\276!!!" + "'", str2, "\276!!!\276\276!!\276\276!!\276\276!!\276\276!!\276!!!\276\276!!\276\276!!!");
    }

    @Test
    public void test06375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06375");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200!", "}~\200\200}~\200\200\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be}~\200\200}~\200\200\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200!" + "'", str2, "~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200!");
    }

    @Test
    public void test06376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06376");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("RRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnull!", "!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LL!" + "'", str2, "LL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LL!");
    }

    @Test
    public void test06377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06377");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\253!");
    }

    @Test
    public void test06378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06378");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]!", "\u0366\u0365\u0368\u0368!U\276\276\230U\215\215\230U\215\215\230U\215\215!U\276\276\230U\215\215\230U\215\215\230U\215\215!!!U\276\276\230U\215\215\230U\215\215\230U\215\215!U\276\276\230U\215\215\230U\215\215\230U\215\215!!!U\276\276\230U\215\215\230U\215\215\230U\215\215!U\276\276\230U\215\215\230U\215\215\230U\215\215!!!U\276\276\230U\215\215\230U\215\215\230U\215\215!U\276\276\230U\215\215\230U\215\215\230U\215\215\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366]]!" + "'", str2, "\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366]]!");
    }

    @Test
    public void test06379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06379");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!ijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll!", "UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!!UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!!UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!!UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!!UNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUUUNLLUNLLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!" + "'", str2, "!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
    }

    @Test
    public void test06380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06380");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200!", "`LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!`LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200!" + "'", str2, "}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200!");
    }

    @Test
    public void test06381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06381");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("porrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporr!", "\u0366\u0365\u0368\u0368ULLLULLL!!ULLLULLL!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "lulllulllulllull!lulllulllulllulllulllulllulllulllulllulllulllull!lulllulllulllulllulllulllulllulllulllulllulllull!lulllulllulllulllulllulllulllulllulllulllulllull!lulllulllulllulllulllulllulllulllulllulllulllull!lulllulllulllulllulllulllulllulllulllulllulllull!lulllulllulllulllulllulllulllulllulllulllulllull!lulllulllulllulllulllulllulllulllulllulllulllull!lulllulllulllulllulllulllulllull!" + "'", str2, "lulllulllulllull!lulllulllulllulllulllulllulllulllulllulllulllull!lulllulllulllulllulllulllulllulllulllulllulllull!lulllulllulllulllulllulllulllulllulllulllulllull!lulllulllulllulllulllulllulllulllulllulllulllull!lulllulllulllulllulllulllulllulllulllulllulllull!lulllulllulllulllulllulllulllulllulllulllulllull!lulllulllulllulllulllulllulllulllulllulllulllull!lulllulllulllulllulllulllulllull!");
    }

    @Test
    public void test06382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06382");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HH!!H~~HH!!H~~HH!!H~~HH!!H~~HH!!H~~HH!!H~~HH!!H~~HH!!H~~!", "}~\200\200}~\200\200\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!}~\200\200}~\200\200\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200!!\200~~\200\200!!\200~~\200\200!!\200~~\200\200!!\200~~\200\200!!\200~~\200\200!!\200~~\200\200!!\200~~\200\200!!\200~~!" + "'", str2, "\200\200!!\200~~\200\200!!\200~~\200\200!!\200~~\200\200!!\200~~\200\200!!\200~~\200\200!!\200~~\200\200!!\200~~\200\200!!\200~~!");
    }

    @Test
    public void test06383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06383");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\276!", "llLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLLllLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\276!" + "'", str2, "!\276!");
    }

    @Test
    public void test06384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06384");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360!", "]]]]]]]]!!]]]]]]]]!!]]]]]]]]]]]]]]]]!!]]]]]]]]!!]]]]]]]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06385");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0346\u0346\u0346!", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346\u0346\u0346!" + "'", str2, "\u0346\u0346\u0346\u0346!");
    }

    @Test
    public void test06386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06386");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!", "\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346!" + "'", str2, "\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346\346!");
    }

    @Test
    public void test06387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06387");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullff!" + "'", str2, "hnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullff!");
    }

    @Test
    public void test06388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06388");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullUNLL!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02eb\u02ec\u02ee\u02ee\u02cc\u02cb\u02ce\u02ce!" + "'", str2, "\u02eb\u02ec\u02ee\u02ee\u02cc\u02cb\u02ce\u02ce!");
    }

    @Test
    public void test06389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06389");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]!!}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]!!}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]!!}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]!!}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]!!}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]!!}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]!!}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]!!!", "\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]!!}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]!!}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]!!}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]!!}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]!!}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]!!}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]!!}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]!!!" + "'", str2, "}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]!!}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]!!}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]!!}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]!!}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]!!}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]!!}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]!!}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]!!!");
    }

    @Test
    public void test06390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06390");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]!", "XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]\220\220\216\216\220\220\216\216WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]\220\220\216\216\220\220\216\216WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]\220\220\216\216\220\220\216\216WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]\220\220\216\216\220\220\216\216WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]\220\220\216\216\220\220\216\216WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]\220\220\216\216\220\220\216\216WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]\220\220\216\216\220\220\216\216WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]!" + "'", str2, "\220\220\216\216\220\220\216\216WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]\220\220\216\216\220\220\216\216WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]\220\220\216\216\220\220\216\216WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]\220\220\216\216\220\220\216\216WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]\220\220\216\216\220\220\216\216WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]\220\220\216\216\220\220\216\216WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]\220\220\216\216\220\220\216\216WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]\220\220\216\216\220\220\216\216WW]]WW]]WW]]WW]]WW]]WW]]WW]]WW]]!");
    }

    @Test
    public void test06391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06391");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214!", "~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214!" + "'", str2, "\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214\213\216\214\214!");
    }

    @Test
    public void test06392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06392");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~!", "HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!~~HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!~~HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!~~HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!~~HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!~~HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!~~HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!~~HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!~~!" + "'", str2, "HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!~~HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!~~HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!~~HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!~~HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!~~HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!~~HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!~~HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!~~!");
    }

    @Test
    public void test06393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06393");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200!", "nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200!" + "'", str2, "~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200!");
    }

    @Test
    public void test06394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06394");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\215}\215\215\215}\215\215ULLLULLLULLLULLL\215}\215\215\215}\215\215!", "]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215]]]]]]]]]]]]]]]]\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215]]]]]]]]]]]]]]]]\215}\215\215\215}\215\215!");
    }

    @Test
    public void test06395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06395");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214\300\300\335\335\300\300\335\335\214\214!", "\u0346\u0348\u0348\u0348\225\226\230\230\225\226\230\230\225\226\230\230\225\226\230\230\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214!" + "'", str2, "nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214!");
    }

    @Test
    public void test06396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06396");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NLLLNLLLLLNLLLNLLLLL!!NLLLNLLLLLNLLLNLLLLL!!NLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLL!!NLLLNLLLLLNLLLNLLLLL!!NLLLNLLLLLNLLLNLLLLL!", "NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108!" + "'", str2, "\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108!");
    }

    @Test
    public void test06397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06397");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347\345\345\347\347!", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253EEEEEEEE\253\253EEEEEEEE\253\253EEEEEEEE\253\253EEEEEEEE\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253EEEEEEEE\253\253EEEEEEEE\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06398");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```!" + "'", str2, "LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```!");
    }

    @Test
    public void test06399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06399");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!", "\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271\276\276\271\271!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
    }

    @Test
    public void test06400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06400");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u016e\u016e\u016e\u016e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u016e\u016e\u016e\u016e!", "\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014f\u014d\u0151\u0151\u014f\u014d\u0151\u0151\u014f\u014d\u0151\u0151\u014f\u014d\u0151\u0151\u014f\u014d\u0151\u0151\u014f\u014d\u0151\u0151\u014f\u014d\u0151\u0151\u014f\u014d\u0151\u0151\u014f\u014d\u0151\u0151\u014f\u014d\u0151\u0151\u014f\u014d\u0151\u0151\u014f\u014d\u0151\u0151nullnull!" + "'", str2, "\u014f\u014d\u0151\u0151\u014f\u014d\u0151\u0151\u014f\u014d\u0151\u0151\u014f\u014d\u0151\u0151\u014f\u014d\u0151\u0151\u014f\u014d\u0151\u0151\u014f\u014d\u0151\u0151\u014f\u014d\u0151\u0151\u014f\u014d\u0151\u0151\u014f\u014d\u0151\u0151\u014f\u014d\u0151\u0151\u014f\u014d\u0151\u0151nullnull!");
    }

    @Test
    public void test06401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06401");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU!!U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU!!!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!!");
    }

    @Test
    public void test06402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06402");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLL!", "LLUU!!!LLUU!!!LLUU!!!LLUU!!!LLUU!!!LLUU!!!LLUU!!!LLUU!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test06403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06403");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!", "~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!" + "'", str2, "!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!");
    }

    @Test
    public void test06404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06404");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU!", "\275null\276\276\275null\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!" + "'", str2, "\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!");
    }

    @Test
    public void test06405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06405");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "nullnulljjnullnulljj!!nullnulljjnullnulljj!!nullnulljjnullnulljjnullnulljjnullnulljj!!nullnulljjnullnulljj!!nullnulljjnullnulljj!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\333\334\336\336\u0348\u0346\u0346!");
    }

    @Test
    public void test06406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06406");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\276\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\276\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\276\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\276\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee!", "\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\276\u02eb\u02ebnullnullnull\276\u02eb\u02ebnullnullnull\276\u02eb\u02ebnullnullnull\276\u02eb\u02ebnullnullnull!" + "'", str2, "!\276\u02eb\u02ebnullnullnull\276\u02eb\u02ebnullnullnull\276\u02eb\u02ebnullnullnull\276\u02eb\u02ebnullnullnull!");
    }

    @Test
    public void test06407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06407");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253````````\253\253````````\253\253````````\253\253````````\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253````````\253\253````````\253\253!", "llLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLLllLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253````````\253\253````````\253\253````````\253\253````````\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253````````\253\253````````\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253````````\253\253````````\253\253````````\253\253````````\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253````````\253\253````````\253\253!");
    }

    @Test
    public void test06408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06408");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("N!LLN!LL!", "\275\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\275\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\u010c\u010c\275\u010c\u010c!" + "'", str2, "\275\u010c\u010c\275\u010c\u010c!");
    }

    @Test
    public void test06409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06409");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125nullnull!", "\u032d\200\200\u032d\200\200\u032d\200\200\u032d\200\200\u032e\u0330\u0330\u0330\u032e\u0330\u0330\u0330\u032e\u0330\u0330\u0330\u032e\u0330\u0330\u0330\u032d\200\200\u032d\200\200\u032d\200\200\u032d\200\200\u032e\u0330\u0330\u0330\u032e\u0330\u0330\u0330!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06410");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("T!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TT!", "\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011anullnullnull!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LL!" + "'", str2, "L!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LL!");
    }

    @Test
    public void test06411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06411");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d!", "\u0346\u0348\u0348\u0348\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06412");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("lluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUU!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06413");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200NN~~}\200\200NN~~}\200\200\230\230NN~~}\200\200NN~~}\200\200\230\230~}\200\200~}\200\200NN~~}\200\200NN~~}\200\200\230\230NN~~}\200\200NN~~}\200\200\230\230~}\200\200~}\200\200NN~~}\200\200NN~~}\200\200\230\230NN~~}\200\200NN~~}\200\200\230\230~}\200\200~}\200\200NN~~}\200\200NN~~}\200\200\230\230NN~~}\200\200NN~~}\200\200\230\230~}\200\200~}\200\200NN~~}\200\200NN~~}\200\200\230\230NN~~}\200\200NN~~}\200\200\230\230~}\200\200~}\200\200NN~~}\200\200NN~~}\200\200\230\230NN~~}\200\200NN~~}\200\200\230\230~}\200\200~}\200\200NN~~}\200\200NN~~}\200\200\230\230NN~~}\200\200NN~~}\200\200\230\230~}\200\200~}\200\200NN~~}\200\200NN~~}\200\200\230\230NN~~}\200\200NN~~}\200\200\230\230!", "P!RRP!RRP!RRP!RRP!RRP!RRP!RRP!RR!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230!" + "'", str2, "~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230!");
    }

    @Test
    public void test06414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06414");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LNLLLNLL\253\253LNLLLNLL\253\253LNLLLNLL\253\253LNLLLNLL\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LNLLLNLL\253\253LNLLLNLL\253\253!", "\253\254\256\256\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!\253\254\256\256\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253!!!!!!!!\253\253!!!!!!!!\253\253!!!!!!!!\253\253!!!!!!!!\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253!!!!!!!!\253\253!!!!!!!!\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253!!!!!!!!\253\253!!!!!!!!\253\253!!!!!!!!\253\253!!!!!!!!\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253!!!!!!!!\253\253!!!!!!!!\253\253!");
    }

    @Test
    public void test06415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06415");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275!!!\275!!!\275!!!\275!!!\200}}`\275!!!\275!!!\275!!!\275!!!]]!", "nullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!!!\275!!!\275!!!\275!!!\200}}`\275!!!\275!!!\275!!!\275!!!]]!" + "'", str2, "\275!!!\275!!!\275!!!\275!!!\200}}`\275!!!\275!!!\275!!!\275!!!]]!");
    }

    @Test
    public void test06416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06416");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("W!XXW!XXW!XXW!XX\200}}`W!XXW!XXW!XXW!XX]]!", "]nullnullnullnullnull]]nullnull]]nullnull]]nullnull]]]nullnullnullnullnull]]nullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!NN]!NN]!NN]!NN\200}}`]!NN]!NN]!NN]!NN]]!" + "'", str2, "]!NN]!NN]!NN]!NN\200}}`]!NN]!NN]!NN]!NN]]!");
    }

    @Test
    public void test06417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06417");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\215\220\220\220\216\220\215\215!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\220\220\220\216\220\215\215!" + "'", str2, "\215\220\220\220\216\220\215\215!");
    }

    @Test
    public void test06418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06418");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\351\354\354\354\351\354\354\354\351\354\354\354\351\354\354\354\200}}`\351\354\354\354\351\354\354\354\351\354\354\354\351\354\354\354]]!", "XXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test06419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06419");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!", "!\253\256\256\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!" + "'", str2, "!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!");
    }

    @Test
    public void test06420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06420");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL!", "UU!!````````````UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!````````````UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull!" + "'", str2, "~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06421");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!!LIJJLIJJ!!LIJJLIJJ!!LIJJLIJJ!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!LIJJLIJJ!!LIJJLIJJ!!LIJJLIJJ!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test06422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06422");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull!!``nullnull``nullnull``nullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!``nullnull``nullnull``nullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullheenullhee!!``nullheenullhee``nullheenullhee``nullheenullheenullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!``nullheenullhee``nullheenullhee``nullheenullheenullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!!" + "'", str2, "nullheenullhee!!``nullheenullhee``nullheenullhee``nullheenullheenullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!``nullheenullhee``nullheenullhee``nullheenullheenullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!!");
    }

    @Test
    public void test06423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06423");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("x~nullnullx~nullnull!!x~nullnullx~nullnull!!x~nullnullx~nullnullx~nullnullx~nullnull!!x~nullnullx~nullnull!!x~nullnullx~nullnull!", "FHHHnullnullnullnullFHHHnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h~ufllufllh~ufllufll!!h~ufllufllh~ufllufll!!h~ufllufllh~ufllufllh~ufllufllh~ufllufll!!h~ufllufllh~ufllufll!!h~ufllufllh~ufllufll!" + "'", str2, "h~ufllufllh~ufllufll!!h~ufllufllh~ufllufll!!h~ufllufllh~ufllufllh~ufllufllh~ufllufll!!h~ufllufllh~ufllufll!!h~ufllufllh~ufllufll!");
    }

    @Test
    public void test06424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06424");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!", "!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!" + "'", str2, "L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!");
    }

    @Test
    public void test06425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06425");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!\200\200\u0346\u0348\u0348!", "nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test06426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06426");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``!", "LL``LL``LL``LL``LL``LL``LL``LL``!!LL``LL``LL``LL``LL``LL``LL``LL``!!LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``!!LL``LL``LL``LL``LL``LL``LL``LL``!!LL``LL``LL``LL``LL``LL``LL``LL``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``!" + "'", str2, "~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``!");
    }

    @Test
    public void test06427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06427");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}null\200\200}null\200\200}null\200\200}null\200\200L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~}null\200\200}null\200\200}null\200\200}null\200\200L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~!", "!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}T!!!\200\200}T!!!\200\200}T!!!\200\200}T!!!\200\200T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~}T!!!\200\200}T!!!\200\200}T!!!\200\200}T!!!\200\200T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~!" + "'", str2, "}T!!!\200\200}T!!!\200\200}T!!!\200\200}T!!!\200\200T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~}T!!!\200\200}T!!!\200\200}T!!!\200\200}T!!!\200\200T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~!");
    }

    @Test
    public void test06428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06428");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248\u0245\u023d\u0248\u0248!", "LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06429");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhh!", "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!ULL!ULLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!ULL!ULLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!ULL!ULLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!ULL!ULLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!ULL!ULLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!ULL!ULLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!ULL!ULLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!ULL!ULL!" + "'", str2, "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!ULL!ULLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!ULL!ULLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!ULL!ULLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!ULL!ULLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!ULL!ULLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!ULL!ULLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!ULL!ULLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!ULL!ULL!");
    }

    @Test
    public void test06430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06430");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014e\u014e\u014e\u014e\u014e\u014e!!!", "\261\262\264\264!\214!!!\214!!!!!!\261\262\264\264!\214!!!\214!!!!!!!!\261\262\264\264!\214!!!\214!!!!!!\261\262\264\264!\214!!!\214!!!!!!!!\261\262\264\264!\214!!!\214!!!!!!\261\262\264\264!\214!!!\214!!!!!!!!\261\262\264\264!\214!!!\214!!!!!!\261\262\264\264!\214!!!\214!!!!!!!!\261\262\264\264!\214!!!\214!!!!!!\261\262\264\264!\214!!!\214!!!!!!!!\261\262\264\264!\214!!!\214!!!!!!\261\262\264\264!\214!!!\214!!!!!!!!\261\262\264\264!\214!!!\214!!!!!!\261\262\264\264!\214!!!\214!!!!!!!!\261\262\264\264!\214!!!\214!!!!!!\261\262\264\264!\214!!!\214!!!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnullnull!!!!nullnullnull!!!" + "'", str2, "!!nullnullnull!!!!nullnullnull!!!");
    }

    @Test
    public void test06431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06431");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!", "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!" + "'", str2, "\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!");
    }

    @Test
    public void test06432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06432");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]!" + "'", str2, "]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]!");
    }

    @Test
    public void test06433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06433");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NLLLNLLLNLLLNLLL\200}}`NLLLNLLLNLLLNLLL]]!", "qrttqrttqrttqrttqrtt!!!qrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrtt!!!qrttqrttqrttqrttqrttqrttqrttqrtt!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test06434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06434");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]nullnullnullnullnull]]nullnull]]nullnull]]nullnull]]]nullnullnullnullnull]]nullnull]]!", "NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]LNLLLNLLLNLLLNLLLNLL]]LNLLLNLL]]LNLLLNLL]]LNLLLNLL]]]LNLLLNLLLNLLLNLLLNLL]]LNLLLNLL]]!" + "'", str2, "]LNLLLNLLLNLLLNLLLNLL]]LNLLLNLL]]LNLLLNLL]]LNLLLNLL]]]LNLLLNLLLNLLLNLLLNLL]]LNLLLNLL]]!");
    }

    @Test
    public void test06435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06435");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!!!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!!!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200null!\340\340nullnull\340\340nullnull\340\340nullnull\340\340null!\340\340nullnull\340\340nullnull\340\340nullnull\340\340}~\200\200}~\200\200null!\340\340nullnull\340\340nullnull\340\340nullnull\340\340null!\340\340nullnull\340\340nullnull\340\340nullnull\340\340}~\200\200}~\200\200null!\340\340nullnull\340\340nullnull\340\340nullnull\340\340null!\340\340nullnull\340\340nullnull\340\340nullnull\340\340}~\200\200}~\200\200null!\340\340nullnull\340\340nullnull\340\340nullnull\340\340null!\340\340nullnull\340\340nullnull\340\340nullnull\340\340\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!!" + "'", str2, "!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!!");
    }

    @Test
    public void test06436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06436");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("``!!``!!!", "}~\200\200}~\200\200LUUULUUULUUULUUULUUULUUULUUULUUU}~\200\200}~\200\200LUUULUUULUUULUUULUUULUUULUUULUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!!``!!!" + "'", str2, "``!!``!!!");
    }

    @Test
    public void test06437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06437");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!", "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!" + "'", str2, "}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!");
    }

    @Test
    public void test06438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06438");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!" + "'", str2, "UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!");
    }

    @Test
    public void test06439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06439");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!", "\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!!\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!!\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!!\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!!\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull\270\270nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248!" + "'", str2, "\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248!");
    }

    @Test
    public void test06440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06440");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL!", "AA]]AA]]nullnullAA]]AA]]nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230AULLAULLAULL\215\216\230\230AULLAULLAULL\215\216\230\230AULLAULLAULL\215\216\230\230AULLAULLAULL\215\216\230\230AULLAULLAULL\215\216\230\230AULLAULLAULL\215\216\230\230AULLAULLAULL\215\216\230\230AULLAULLAULL!" + "'", str2, "\215\216\230\230AULLAULLAULL\215\216\230\230AULLAULLAULL\215\216\230\230AULLAULLAULL\215\216\230\230AULLAULLAULL\215\216\230\230AULLAULLAULL\215\216\230\230AULLAULLAULL\215\216\230\230AULLAULLAULL\215\216\230\230AULLAULLAULL!");
    }

    @Test
    public void test06441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06441");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNN!", "LL!!\336`\336\336\336`\336\336\336`\336\336LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\336`\336\336\336`\336\336\336`\336\336LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````!" + "'", str2, "LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````!");
    }

    @Test
    public void test06442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06442");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test06443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06443");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!", "\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06444");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "}~\200\200}~\200\200TTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRR}~\200\200}~\200\200TTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRR!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test06445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06445");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!!", "\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0\u01b0!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!!");
    }

    @Test
    public void test06446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06446");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll!", "!!!lll!lll!lll!lll!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276nullnullrr\275\275\276nullnullrr\275\275null!rrnull!rrnull!rrnull!rrnull!rrnull!rrnull!rrnull!rr\276nullnullrr\275\275\276nullnullrr\275\275null!rrnull!rrnull!rrnull!rrnull!rrnull!rrnull!rrnull!rr\276nullnullrr\275\275\276nullnullrr\275\275null!rrnull!rrnull!rrnull!rrnull!rrnull!rrnull!rrnull!rr\276nullnullrr\275\275\276nullnullrr\275\275null!rrnull!rrnull!rrnull!rrnull!rrnull!rrnull!rrnull!rr\276nullnullrr\275\275\276nullnullrr\275\275null!rrnull!rrnull!rrnull!rrnull!rrnull!rrnull!rrnull!rr\276nullnullrr\275\275\276nullnullrr\275\275null!rrnull!rrnull!rrnull!rrnull!rrnull!rrnull!rrnull!rr\276nullnullrr\275\275\276nullnullrr\275\275null!rrnull!rrnull!rrnull!rrnull!rrnull!rrnull!rrnull!rr\276nullnullrr\275\275\276nullnullrr\275\275null!rrnull!rrnull!rrnull!rrnull!rrnull!rrnull!rrnull!rr!" + "'", str2, "\276nullnullrr\275\275\276nullnullrr\275\275null!rrnull!rrnull!rrnull!rrnull!rrnull!rrnull!rrnull!rr\276nullnullrr\275\275\276nullnullrr\275\275null!rrnull!rrnull!rrnull!rrnull!rrnull!rrnull!rrnull!rr\276nullnullrr\275\275\276nullnullrr\275\275null!rrnull!rrnull!rrnull!rrnull!rrnull!rrnull!rrnull!rr\276nullnullrr\275\275\276nullnullrr\275\275null!rrnull!rrnull!rrnull!rrnull!rrnull!rrnull!rrnull!rr\276nullnullrr\275\275\276nullnullrr\275\275null!rrnull!rrnull!rrnull!rrnull!rrnull!rrnull!rrnull!rr\276nullnullrr\275\275\276nullnullrr\275\275null!rrnull!rrnull!rrnull!rrnull!rrnull!rrnull!rrnull!rr\276nullnullrr\275\275\276nullnullrr\275\275null!rrnull!rrnull!rrnull!rrnull!rrnull!rrnull!rrnull!rr\276nullnullrr\275\275\276nullnullrr\275\275null!rrnull!rrnull!rrnull!rrnull!rrnull!rrnull!rrnull!rr!");
    }

    @Test
    public void test06447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06447");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\300\276\276\275\300\276\276!", "\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275null\276\276\275null\276\276!" + "'", str2, "\275null\276\276\275null\276\276!");
    }

    @Test
    public void test06448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06448");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!", "\230!\225\225\230!\225\225nullnullnullnullnullnullnullnull\230!\225\225\230!\225\225nullnullnullnullnullnullnullnull\230!\225\225\230!\225\225nullnullnullnullnullnullnullnull\230!\225\225\230!\225\225nullnullnullnullnullnullnullnull\230!\225\225\230!\225\225nullnullnullnullnullnullnullnull\230!\225\225\230!\225\225nullnullnullnullnullnullnullnull\230!\225\225\230!\225\225nullnullnullnullnullnullnullnull\230!\225\225\230!\225\225nullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0!!!" + "'", str2, "\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0!!!");
    }

    @Test
    public void test06449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06449");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0123\u0124\u0126\u0126\213\213\213\u0346\u0348\u0348!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u014e\u014e!!\213\213\213\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u014e\u014e!!\213\213\213\u0346\u0348\u0348!");
    }

    @Test
    public void test06450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06450");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0!!!", "\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\325nullnullnull\325nullnullnull\275\275\325nullnullnull\325nullnullnull\275\275\325nullnullnull\325nullnullnull\275\275\325nullnullnull\325nullnullnull\275\275\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\325nullnullnull\325nullnullnull\275\275\325nullnullnull\325nullnullnull\275\275!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!NULLNULL!!NULLNULL!!!!NULLNULL!!NULLNULL!!!!NULLNULL!!NULLNULL!!!!NULLNULL!!NULLNULL!!!!NULLNULL!!NULLNULL!!!!NULLNULL!!NULLNULL!!!!NULLNULL!!NULLNULL!!!!NULLNULL!!NULLNULL!!!" + "'", str2, "!!NULLNULL!!NULLNULL!!!!NULLNULL!!NULLNULL!!!!NULLNULL!!NULLNULL!!!!NULLNULL!!NULLNULL!!!!NULLNULL!!NULLNULL!!!!NULLNULL!!NULLNULL!!!!NULLNULL!!NULLNULL!!!!NULLNULL!!NULLNULL!!!");
    }

    @Test
    public void test06451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06451");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254!!!", "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ULLLULL\256\254\254ULLLULL\256\254\254!!ULLLULL\256\254\254ULLLULL\256\254\254!!ULLLULL\256\254\254ULLLULL\256\254\254!!ULLLULL\256\254\254ULLLULL\256\254\254!!ULLLULL\256\254\254ULLLULL\256\254\254!!ULLLULL\256\254\254ULLLULL\256\254\254!!ULLLULL\256\254\254ULLLULL\256\254\254!!ULLLULL\256\254\254ULLLULL\256\254\254!!!" + "'", str2, "ULLLULL\256\254\254ULLLULL\256\254\254!!ULLLULL\256\254\254ULLLULL\256\254\254!!ULLLULL\256\254\254ULLLULL\256\254\254!!ULLLULL\256\254\254ULLLULL\256\254\254!!ULLLULL\256\254\254ULLLULL\256\254\254!!ULLLULL\256\254\254ULLLULL\256\254\254!!ULLLULL\256\254\254ULLLULL\256\254\254!!ULLLULL\256\254\254ULLLULL\256\254\254!!!");
    }

    @Test
    public void test06452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06452");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UNLLUNLL!", "}~\200\200}~\200\200\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338}~\200\200}~\200\200\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108!" + "'", str2, "\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108!");
    }

    @Test
    public void test06453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06453");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\230LLL!\230LLL\230LLL\230LLL\230LLL!!\230LLL\230LLL!!\230LLL\230LLL!!\230LLL\230LLL!!\230LLL!\230LLL\230LLL\230LLL\230LLL!!\230LLL\230LLL!!!", "nullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230LLL!\230LLL\230LLL\230LLL\230LLL!!\230LLL\230LLL!!\230LLL\230LLL!!\230LLL\230LLL!!\230LLL!\230LLL\230LLL\230LLL\230LLL!!\230LLL\230LLL!!!" + "'", str2, "\230LLL!\230LLL\230LLL\230LLL\230LLL!!\230LLL\230LLL!!\230LLL\230LLL!!\230LLL\230LLL!!\230LLL!\230LLL\230LLL\230LLL\230LLL!!\230LLL\230LLL!!!");
    }

    @Test
    public void test06454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06454");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200nulllulllulllull^nulllulllulllullnulllulllulllullnulllulllulllull^nulllulllulllullnulllulllulllull}~\200\200}~\200\200nulllulllulllull^nulllulllulllullnulllulllulllullnulllulllulllull^nulllulllulllullnulllulllulllull!", "nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200UN!!!N!!!N!!!N!!^UN!!!N!!!N!!!N!!UN!!!N!!!N!!!N!!UN!!!N!!!N!!!N!!^UN!!!N!!!N!!!N!!UN!!!N!!!N!!!N!!}~\200\200}~\200\200UN!!!N!!!N!!!N!!^UN!!!N!!!N!!!N!!UN!!!N!!!N!!!N!!UN!!!N!!!N!!!N!!^UN!!!N!!!N!!!N!!UN!!!N!!!N!!!N!!!" + "'", str2, "}~\200\200}~\200\200UN!!!N!!!N!!!N!!^UN!!!N!!!N!!!N!!UN!!!N!!!N!!!N!!UN!!!N!!!N!!!N!!^UN!!!N!!!N!!!N!!UN!!!N!!!N!!!N!!}~\200\200}~\200\200UN!!!N!!!N!!!N!!^UN!!!N!!!N!!!N!!UN!!!N!!!N!!!N!!UN!!!N!!!N!!!N!!^UN!!!N!!!N!!!N!!UN!!!N!!!N!!!N!!!");
    }

    @Test
    public void test06455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06455");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LNNNLNNN!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06456");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```!", "!\274\274\274\274\274\274\274\274\274\274\274\274\274\274\274\274!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```!" + "'", str2, "^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```!");
    }

    @Test
    public void test06457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06457");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275UUU\275UUU!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnull\275nullnullnull!" + "'", str2, "\275nullnullnull\275nullnullnull!");
    }

    @Test
    public void test06458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06458");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee!" + "'", str2, "\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee!");
    }

    @Test
    public void test06459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06459");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!!NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!!NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!!NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!!NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!", "!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!LL!!!!!LL!!!!LL!!LL!!!LL!!!!!LL!!!!LL!!LL!!!!!LL!!!!!LL!!!!LL!!LL!!!LL!!!!!LL!!!!LL!!LL!!!!!LL!!!!!LL!!!!LL!!LL!!!LL!!!!!LL!!!!LL!!LL!!!LL!!!!!LL!!!!LL!!LL!!!LL!!!!!LL!!!!LL!!LL!!!!!LL!!!!!LL!!!!LL!!LL!!!LL!!!!!LL!!!!LL!!LL!!!!!LL!!!!!LL!!!!LL!!LL!!!LL!!!!!LL!!!!LL!!LL!" + "'", str2, "!!!LL!!!!!LL!!!!LL!!LL!!!LL!!!!!LL!!!!LL!!LL!!!!!LL!!!!!LL!!!!LL!!LL!!!LL!!!!!LL!!!!LL!!LL!!!!!LL!!!!!LL!!!!LL!!LL!!!LL!!!!!LL!!!!LL!!LL!!!LL!!!!!LL!!!!LL!!LL!!!LL!!!!!LL!!!!LL!!LL!!!!!LL!!!!!LL!!!!LL!!LL!!!LL!!!!!LL!!!!LL!!LL!!!!!LL!!!!!LL!!!!LL!!LL!!!LL!!!!!LL!!!!LL!!LL!");
    }

    @Test
    public void test06460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06460");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275LLL\275LLL\275LLL\275LLLLL\275\275LL\275\275LL\275\275LL\275\275\275LLL\275LLL\275LLL\275LLLLL\275\275LL\275\275!", "!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\344\344\344\275\344\344\344\275\344\344\344\275\344\344\344\344\344\275\275\344\344\275\275\344\344\275\275\344\344\275\275\275\344\344\344\275\344\344\344\275\344\344\344\275\344\344\344\344\344\275\275\344\344\275\275!" + "'", str2, "\275\344\344\344\275\344\344\344\275\344\344\344\275\344\344\344\344\344\275\275\344\344\275\275\344\344\275\275\344\344\275\275\275\344\344\344\275\344\344\344\275\344\344\344\275\344\344\344\344\344\275\275\344\344\275\275!");
    }

    @Test
    public void test06461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06461");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\230\226nullnull\236\276\276\230\226nullnull\236\276\276!!\230\226nullnull\236\276\276\230\226nullnull\236\276\276!!\230\226nullnull\236\276\276\230\226nullnull\236\276\276\230\226nullnull\236\276\276\230\226nullnull\236\276\276!!\230\226nullnull\236\276\276\230\226nullnull\236\276\276!!\230\226nullnull\236\276\276\230\226nullnull\236\276\276!", "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!ULL!ULLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!ULL!ULLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!ULL!ULLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!ULL!ULLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!ULL!ULLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!ULL!ULLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!ULL!ULLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!ULL!ULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\226NULLNULL\236\276\276\230\226NULLNULL\236\276\276!!\230\226NULLNULL\236\276\276\230\226NULLNULL\236\276\276!!\230\226NULLNULL\236\276\276\230\226NULLNULL\236\276\276\230\226NULLNULL\236\276\276\230\226NULLNULL\236\276\276!!\230\226NULLNULL\236\276\276\230\226NULLNULL\236\276\276!!\230\226NULLNULL\236\276\276\230\226NULLNULL\236\276\276!" + "'", str2, "\230\226NULLNULL\236\276\276\230\226NULLNULL\236\276\276!!\230\226NULLNULL\236\276\276\230\226NULLNULL\236\276\276!!\230\226NULLNULL\236\276\276\230\226NULLNULL\236\276\276\230\226NULLNULL\236\276\276\230\226NULLNULL\236\276\276!!\230\226NULLNULL\236\276\276\230\226NULLNULL\236\276\276!!\230\226NULLNULL\236\276\276\230\226NULLNULL\236\276\276!");
    }

    @Test
    public void test06462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06462");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348!", "\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348!" + "'", str2, "\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348!");
    }

    @Test
    public void test06463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06463");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!!", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!~XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!~XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!~XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!~XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!~XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!~XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!~XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!!~XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!~XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!~XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!~XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!~XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!~XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!~XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!~XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!!" + "'", str2, "!~XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!~XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!~XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!~XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!~XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!~XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!~XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!~XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!!~XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!~XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!~XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!~XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!~XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!~XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!~XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!~XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!!");
    }

    @Test
    public void test06464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06464");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!" + "'", str2, "!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!");
    }

    @Test
    public void test06465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06465");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200nullnull}~\200\200}~\200\200nullnull!", "!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200\u02b1\u02b2\u02b4\u02b4\u02b1\u02b2\u02b4\u02b4}~\200\200}~\200\200\u02b1\u02b2\u02b4\u02b4\u02b1\u02b2\u02b4\u02b4!" + "'", str2, "}~\200\200}~\200\200\u02b1\u02b2\u02b4\u02b4\u02b1\u02b2\u02b4\u02b4}~\200\200}~\200\200\u02b1\u02b2\u02b4\u02b4\u02b1\u02b2\u02b4\u02b4!");
    }

    @Test
    public void test06466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06466");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!", "null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u011d\u011d\u011a\u011a\u011d\u011d\u011a\u011a\u011d\u011d\u011a\u011a\u011d\u011d\u011a\u011a\u011d\u011d\u011a\u011a\u011d\u011d\u011a\u011a\u011d\u011d\u011a\u011a\u011d\u011d\u011a\u011a!" + "'", str2, "\u011d\u011d\u011a\u011a\u011d\u011d\u011a\u011a\u011d\u011d\u011a\u011a\u011d\u011d\u011a\u011a\u011d\u011d\u011a\u011a\u011d\u011d\u011a\u011a\u011d\u011d\u011a\u011a\u011d\u011d\u011a\u011a!");
    }

    @Test
    public void test06467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06467");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!ll!", "\300!\276\276\300!\276\276\300!\276\276\300!\276\276\300!\276\276\300!\276\276\300!\276\276\300!\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!\276\276!" + "'", str2, "!!!\276\276!");
    }

    @Test
    public void test06468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06468");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335!", "}}}}}}}}!!!!}}}}}}}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06469");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!!", "nullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnullnullnullnullnullnullnullnullnullnull\230nullnullnull\230nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!!" + "'", str2, "`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!!");
    }

    @Test
    public void test06470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06470");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NLLLULNN!", "!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06471");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368N!!!N!!!\200\200\u0346\u0348\u0348!", "N!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNNN!NLLNN!NLLN!NLLNNN!NLLNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368N!!!N!!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368N!!!N!!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test06472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06472");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!", "\u0346\u0348\u0348\u0348\u031a\u031a\u0318\u0318\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!" + "'", str2, "`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!");
    }

    @Test
    public void test06473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06473");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!!", "~\200}}~\200}}~\200}}~\200\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c~\200}}~\200}}~\200}}~\200\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!!" + "'", str2, "\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!!");
    }

    @Test
    public void test06474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06474");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull!", "NN]]NN]]UNNNUNNNNN]]NN]]UNNNUNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``nnnnnnnn``nnnnnnnn``nnnnnnnn``nnnnnnnn``nnnnnnnn``nnnnnnnn``nnnnnnnn``nnnnnnnn!" + "'", str2, "``nnnnnnnn``nnnnnnnn``nnnnnnnn``nnnnnnnn``nnnnnnnn``nnnnnnnn``nnnnnnnn``nnnnnnnn!");
    }

    @Test
    public void test06475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06475");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!!!", "LJ\225\225LJ\225\225LJ\225\225LJ\225\225LJ\225\225LJ\225\225LJ\225\225LJ\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!!!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!!!" + "'", str2, "!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!!!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!!!");
    }

    @Test
    public void test06476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06476");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!!", "~}\200\200~}\200\200\u01a0\u01a0nullnull\230\230\u01a0\u01a0nullnull\230\230~}\200\200~}\200\200\u01a0\u01a0nullnull\230\230\u01a0\u01a0nullnull\230\230~}\200\200~}\200\200\u01a0\u01a0nullnull\230\230\u01a0\u01a0nullnull\230\230~}\200\200~}\200\200\u01a0\u01a0nullnull\230\230\u01a0\u01a0nullnull\230\230~}\200\200~}\200\200\u01a0\u01a0nullnull\230\230\u01a0\u01a0nullnull\230\230~}\200\200~}\200\200\u01a0\u01a0nullnull\230\230\u01a0\u01a0nullnull\230\230~}\200\200~}\200\200\u01a0\u01a0nullnull\230\230\u01a0\u01a0nullnull\230\230~}\200\200~}\200\200\u01a0\u01a0nullnull\230\230\u01a0\u01a0nullnull\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!!" + "'", str2, "nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!!");
    }

    @Test
    public void test06477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06477");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!", "ffff\236\276\276ffff\236\276\276!!ffff\236\276\276ffff\236\276\276!!ffff\236\276\276ffff\236\276\276ffff\236\276\276ffff\236\276\276!!ffff\236\276\276ffff\236\276\276!!ffff\236\276\276ffff\236\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!!" + "'", str2, "\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!!");
    }

    @Test
    public void test06478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06478");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143!!!", "hgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjjhgjj!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test06479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06479");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("hhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHH!", "\275!JLL!JLL!JLL\275!JLL!JLL!JLL\275!JLL!JLL!JLL\275!JLL!JLL!JLL!JLL!JLL\275\275!JLL!JLL\275\275!JLL!JLL\275\275!JLL!JLL\275\275\275!JLL!JLL!JLL\275!JLL!JLL!JLL\275!JLL!JLL!JLL\275!JLL!JLL!JLL!JLL!JLL\275\275!JLL!JLL\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275\275\275\275\275\275\275LLLLLLLL\275\275\275\275\275\275\275\275LLLLLLLL\275\275\275\275\275\275\275\275LLLLLLLL\275\275\275\275\275\275\275\275LLLLLLLL\275\275\275\275\275\275\275\275LLLLLLLL\275\275\275\275\275\275\275\275LLLLLLLL\275\275\275\275\275\275\275\275LLLLLLLL\275\275\275\275\275\275\275\275LLLLLLLL!" + "'", str2, "\275\275\275\275\275\275\275\275LLLLLLLL\275\275\275\275\275\275\275\275LLLLLLLL\275\275\275\275\275\275\275\275LLLLLLLL\275\275\275\275\275\275\275\275LLLLLLLL\275\275\275\275\275\275\275\275LLLLLLLL\275\275\275\275\275\275\275\275LLLLLLLL\275\275\275\275\275\275\275\275LLLLLLLL\275\275\275\275\275\275\275\275LLLLLLLL!");
    }

    @Test
    public void test06480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06480");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200}~\200\200}~\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200!", "FFFFFFFFFFFFFFFF\200}}`FFFFFFFFFFFFFFFF]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200}~\200\200}~\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200!" + "'", str2, "}~\200\200}~\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200}~\200\200}~\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200!");
    }

    @Test
    public void test06481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06481");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~~!!U~~~U~~~U~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!U~~~U~~~U~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!", "!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~!!null~~~null~~~null~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!null~~~null~~~null~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!" + "'", str2, "~~!!null~~~null~~~null~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!null~~~null~~~null~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!");
    }

    @Test
    public void test06482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06482");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262!", "\u026c\u026c\u026a\u026a\u026c\u026c\u026a\u026a\u026c\u026c\u026a\u026a\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026a\u026a\u026c\u026c\u026a\u026a\u026c\u026c\u026a\u026a\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c\u026c!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06483");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!", "]!!\275\275\275!!!!\275\275\275!!!!\275\275\275!!!!\275\275\275!!!!\275\275\275!!]]!!\275\275\275!!!!\275\275\275!!]]!!\275\275\275!!!!\275\275\275!!]]!!\275\275\275!!!!\275\275\275!!]]]!!\275\275\275!!!!\275\275\275!!!!\275\275\275!!!!\275\275\275!!!!\275\275\275!!]]!!\275\275\275!!!!\275\275\275!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!" + "'", str2, "!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!");
    }

    @Test
    public void test06484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06484");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\316\316\316\316\236\276\276\316\316\316\316\236\276\276!!\316\316\316\316\236\276\276\316\316\316\316\236\276\276!!\316\316\316\316\236\276\276\316\316\316\316\236\276\276\316\316\316\316\236\276\276\316\316\316\316\236\276\276!!\316\316\316\316\236\276\276\316\316\316\316\236\276\276!!\316\316\316\316\236\276\276\316\316\316\316\236\276\276!", "!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUU\236\276\276UUUU\236\276\276!!UUUU\236\276\276UUUU\236\276\276!!UUUU\236\276\276UUUU\236\276\276UUUU\236\276\276UUUU\236\276\276!!UUUU\236\276\276UUUU\236\276\276!!UUUU\236\276\276UUUU\236\276\276!" + "'", str2, "UUUU\236\276\276UUUU\236\276\276!!UUUU\236\276\276UUUU\236\276\276!!UUUU\236\276\276UUUU\236\276\276UUUU\236\276\276UUUU\236\276\276!!UUUU\236\276\276UUUU\236\276\276!!UUUU\236\276\276UUUU\236\276\276!");
    }

    @Test
    public void test06485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06485");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200UN!!!N!!!N!!!N!!^UN!!!N!!!N!!!N!!UN!!!N!!!N!!!N!!UN!!!N!!!N!!!N!!^UN!!!N!!!N!!!N!!UN!!!N!!!N!!!N!!}~\200\200}~\200\200UN!!!N!!!N!!!N!!^UN!!!N!!!N!!!N!!UN!!!N!!!N!!!N!!UN!!!N!!!N!!!N!!^UN!!!N!!!N!!!N!!UN!!!N!!!N!!!N!!!", "\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200!\254!!!\254!!!\254!!!\254!!^!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!^!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!}~\200\200}~\200\200!\254!!!\254!!!\254!!!\254!!^!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!^!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!" + "'", str2, "}~\200\200}~\200\200!\254!!!\254!!!\254!!!\254!!^!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!^!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!}~\200\200}~\200\200!\254!!!\254!!!\254!!!\254!!^!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!^!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!");
    }

    @Test
    public void test06486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06486");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0146\u0146\u0146\u0146\u0146\u0146\u0146\u0146\u0346\u0348\u0348!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test06487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06487");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!", "LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!" + "'", str2, "!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!");
    }

    @Test
    public void test06488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06488");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~~!!nullnullnullnull~~~nullnullnullnull~~~nullnullnullnull~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!nullnullnullnull~~~nullnullnullnull~~~nullnullnullnull~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!", "LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```LLUULLUULLUULLUU```!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!" + "'", str2, "\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!");
    }

    @Test
    public void test06489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06489");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test06490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06490");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\352\356\356\356\352\356\356\356\352\356\356\356\352\356\356\356\200}}`\352\356\356\356\352\356\356\356\352\356\356\356\352\356\356\356]]!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test06491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06491");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!l!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\244!" + "'", str2, "!\244!");
    }

    @Test
    public void test06492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06492");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLL!!NNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLL!!NNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLL!!NNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLL!!NNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLL!", "`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUU!!UU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUU!!UU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUU!!UU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUU!!UU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUU!" + "'", str2, "UU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUU!!UU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUU!!UU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUU!!UU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUU!!UU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUU!");
    }

    @Test
    public void test06493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06493");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\227nullnullnullnullnullnull\227nullnullnull\227nullnullnull\227nullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnull\227nullnullnull\227nullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull!", "!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UU\227U!UUU!UUU!UU\227U!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UU\227U!UUU!UUU!UU\227U!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU!" + "'", str2, "\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UU\227U!UUU!UUU!UU\227U!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UU\227U!UUU!UUU!UU\227U!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU!");
    }

    @Test
    public void test06494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06494");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ab!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014e\u014e!" + "'", str2, "\u014e\u014e!");
    }

    @Test
    public void test06495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06495");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~!!\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~!!\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~!!\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~!!\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~!", "!ULL!ULL!ULL!ULL!ULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~!!\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~!!\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~!!\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~!!\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~!" + "'", str2, "\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~!!\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~!!\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~!!\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~!!\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~\216\216R~~~R~~~!");
    }

    @Test
    public void test06496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06496");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UU]]UU]]UU]]UU]]~}}^UU]]UU]]UU]]UU]]]]!", "\200\200!!\200\200!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull]]nullnull]]nullnull]]nullnull]]~}}^nullnull]]nullnull]]nullnull]]nullnull]]]]!" + "'", str2, "nullnull]]nullnull]]nullnull]]nullnull]]~}}^nullnull]]nullnull]]nullnull]]nullnull]]]]!");
    }

    @Test
    public void test06497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06497");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullZWXXZWXXZWXXZWXXnullnullnullnullZWXXZWXX!", "LL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLL!!!L!!!L!!!L!!!LLLLLLLLLLLLLLLLL!!!L!!!!" + "'", str2, "LLLLLLLLLLLLLLLLL!!!L!!!L!!!L!!!LLLLLLLLLLLLLLLLL!!!L!!!!");
    }

    @Test
    public void test06498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06498");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031anullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031anullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06499");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!", "!!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!");
    }

    @Test
    public void test06500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06500");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368!", "!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368!" + "'", str2, "\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368!");
    }
}
