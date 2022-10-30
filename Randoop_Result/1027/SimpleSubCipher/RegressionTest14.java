package SimpleSubCipher;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14 {

    public static boolean debug = false;

    @Test
    public void test07001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07001");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\215}\215\215\215}\215\215NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\215}\215\215\215}\215\215!", "PRRRPRRR!!PRRRPRRR!!!!PRRRPRRR!!PRRRPRRR!!!!PRRRPRRR!!PRRRPRRR!!!!PRRRPRRR!!PRRRPRRR!!!!PRRRPRRR!!PRRRPRRR!!!!PRRRPRRR!!PRRRPRRR!!!!PRRRPRRR!!PRRRPRRR!!!!PRRRPRRR!!PRRRPRRR!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR\215}\215\215\215}\215\215!");
    }

    @Test
    public void test07002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07002");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("FFFFFFFF!!FFFFFFFF!!!", "nullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!!nullnullUUnullnullUU!!nullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUUnullnullUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test07003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07003");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200\300\300\300\300^\300\300\300\300\300\300\300\300\300\300\300\300^\300\300\300\300\300\300\300\300}~\200\200}~\200\200\300\300\300\300^\300\300\300\300\300\300\300\300\300\300\300\300^\300\300\300\300\300\300\300\300!", "!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242}~\200\200}~\200\200\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242!" + "'", str2, "}~\200\200}~\200\200\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242}~\200\200}~\200\200\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242!");
    }

    @Test
    public void test07004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07004");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0!!!", "\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\214\214!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test07005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07005");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull]]nullnull]]nullnullnullnullnullnullnullnullnullnull]]nullnull]]nullnullnullnullnullnullnullnull!", "\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\275!!!\275!!]]!\275!!!\275!!]]!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!]]!\275!!!\275!!]]!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!" + "'", str2, "!\275!!!\275!!]]!\275!!!\275!!]]!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!]]!\275!!!\275!!]]!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!");
    }

    @Test
    public void test07006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07006");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\253\254\256\256nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnullnullnull!", "\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340nullnullnullnullnullnullnullnull\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!" + "'", str2, "\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
    }

    @Test
    public void test07007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07007");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200LL~~}\200\200LL~~}\200\200\230\230LL~~}\200\200LL~~}\200\200\230\230~}\200\200~}\200\200LL~~}\200\200LL~~}\200\200\230\230LL~~}\200\200LL~~}\200\200\230\230~}\200\200~}\200\200LL~~}\200\200LL~~}\200\200\230\230LL~~}\200\200LL~~}\200\200\230\230~}\200\200~}\200\200LL~~}\200\200LL~~}\200\200\230\230LL~~}\200\200LL~~}\200\200\230\230~}\200\200~}\200\200LL~~}\200\200LL~~}\200\200\230\230LL~~}\200\200LL~~}\200\200\230\230~}\200\200~}\200\200LL~~}\200\200LL~~}\200\200\230\230LL~~}\200\200LL~~}\200\200\230\230~}\200\200~}\200\200LL~~}\200\200LL~~}\200\200\230\230LL~~}\200\200LL~~}\200\200\230\230~}\200\200~}\200\200LL~~}\200\200LL~~}\200\200\230\230LL~~}\200\200LL~~}\200\200\230\230!", "\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230!" + "'", str2, "~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230!");
    }

    @Test
    public void test07008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07008");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u016a\u016a\u016a\u016a\u016a\u016aLL!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07009");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300!", "\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!!\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test07010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07010");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253\u0346\u0348\u0348!", "!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253null!\253\253\u0346\u0348\u0348!");
    }

    @Test
    public void test07011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07011");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!\256N!NN\254\254\256N!NN\254\254!!\256N!NN\254\254\256N!NN\254\254!!\256N!NN\254\254\256N!NN\254\254!!\256N!NN\254\254\256N!NN\254\254!!\256N!NN\254\254\256N!NN\254\254!!\256N!NN\254\254\256N!NN\254\254!!\256N!NN\254\254\256N!NN\254\254!!\256N!NN\254\254\256N!NN\254\254!", "\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!" + "'", str2, "!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!!\256!!!!\254\254\256!!!!\254\254!");
    }

    @Test
    public void test07012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07012");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull}}\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull}}!", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}}!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}}!");
    }

    @Test
    public void test07013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07013");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af]]nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnull]]nullnull]]nullnull]]nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnull]]nullnull]]nullnull]]nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnull]]nullnull]]nullnull]]nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnull]]nullnull]]nullnull]]nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test07014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07014");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a!", "\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull!!\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull!!\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull!!\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull!!\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\204LNUU\204\204\204LNUU\204\204!!\204LNUU\204\204\204LNUU\204\204!!\204LNUU\204\204\204LNUU\204\204\204LNUU\204\204\204LNUU\204\204!!\204LNUU\204\204\204LNUU\204\204!!\204LNUU\204\204\204LNUU\204\204!" + "'", str2, "\204LNUU\204\204\204LNUU\204\204!!\204LNUU\204\204\204LNUU\204\204!!\204LNUU\204\204\204LNUU\204\204\204LNUU\204\204\204LNUU\204\204!!\204LNUU\204\204\204LNUU\204\204!!\204LNUU\204\204\204LNUU\204\204!");
    }

    @Test
    public void test07015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07015");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UU\227U!UUU!UUU!UU\227U!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UU\227U!UUU!UUU!UU\227U!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU\227U!UUU!UUU!UUU!UUU!UUU!UU!", "!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test07016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07016");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!", "}~\200\200}~\200\200ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL}~\200\200}~\200\200ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
    }

    @Test
    public void test07017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07017");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!", "\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0315~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!" + "'", str2, "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!");
    }

    @Test
    public void test07018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07018");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07019");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\225\225\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\225\225\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\225\225\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\225\225\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\225\225\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\225\225\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\225\225\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\275\276\u0111\u0112\u0114\u0114\u0111\u0112\u0114\u0114\225\225!", "\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\214\214\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\214\214\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\214\214\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\214\214\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\214\214\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\214\214\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\214\214\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225!" + "'", str2, "\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225\275\276nullnullnullnullnullnullnullnull\275\276nullnullnullnullnullnullnullnull\225\225!");
    }

    @Test
    public void test07020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07020");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!tt!", "FEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHH!!FEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHH!!FEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHH!!FEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHH!!FEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHHFEHH!FEHHFEHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!HHEE!!EE!!HHEE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!HHEE!!EE!!HHEE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!HHEE!!EE!!HHEE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!HHEE!!EE!!HHEE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!HHEE!!EE!!HHEE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!HHEE!!EE!!HHEE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!HHEE!!EE!!HHEE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!HHEE!!EE!!HH!" + "'", str2, "EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!HHEE!!EE!!HHEE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!HHEE!!EE!!HHEE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!HHEE!!EE!!HHEE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!HHEE!!EE!!HHEE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!HHEE!!EE!!HHEE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!HHEE!!EE!!HHEE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!HHEE!!EE!!HHEE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!HHEE!!EE!!HH!");
    }

    @Test
    public void test07021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07021");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!!", "`]```]``!!`]```]``!!`]```]```]```]``!!`]```]``!!`]```]``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]```]```]```]```]```]```]```]```]```]```]```]```!!!!]```]```]```]```]```]```]```]```]```]```]```]```!!!!!!]```]```]```]```]```]```]```]```]```]```]```]```!!!!]```]```]```]```]```]```]```]```]```]```]```]```!!!!!!]```]```]```]```]```]```]```]```]```]```]```]```!!!!]```]```]```]```]```]```]```]```]```]```]```]```!!!!!!]```]```]```]```]```]```]```]```]```]```]```]```!!!!]```]```]```]```]```]```]```]```]```]```]```]```!!!!!!]```]```]```]```]```]```]```]```]```]```]```]```!!!!]```]```]```]```]```]```]```]```]```]```]```]```!!!!!!]```]```]```]```]```]```]```]```]```]```]```]```!!!!]```]```]```]```]```]```]```]```]```]```]```]```!!!!!!]```]```]```]```]```]```]```]```]```]```]```]```!!!!]```]```]```]```]```]```]```]```]```]```]```]```!!!!!!]```]```]```]```]```]```]```]```]```]```]```]```!!!!]```]```]```]```]```]```]```]```]```]```]```]```!!!!!!!" + "'", str2, "]```]```]```]```]```]```]```]```]```]```]```]```!!!!]```]```]```]```]```]```]```]```]```]```]```]```!!!!!!]```]```]```]```]```]```]```]```]```]```]```]```!!!!]```]```]```]```]```]```]```]```]```]```]```]```!!!!!!]```]```]```]```]```]```]```]```]```]```]```]```!!!!]```]```]```]```]```]```]```]```]```]```]```]```!!!!!!]```]```]```]```]```]```]```]```]```]```]```]```!!!!]```]```]```]```]```]```]```]```]```]```]```]```!!!!!!]```]```]```]```]```]```]```]```]```]```]```]```!!!!]```]```]```]```]```]```]```]```]```]```]```]```!!!!!!]```]```]```]```]```]```]```]```]```]```]```]```!!!!]```]```]```]```]```]```]```]```]```]```]```]```!!!!!!]```]```]```]```]```]```]```]```]```]```]```]```!!!!]```]```]```]```]```]```]```]```]```]```]```]```!!!!!!]```]```]```]```]```]```]```]```]```]```]```]```!!!!]```]```]```]```]```]```]```]```]```]```]```]```!!!!!!!");
    }

    @Test
    public void test07022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07022");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e!", "NNLLNNLLNNLLNNLL\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07023");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368!!]]!", "N!!!N!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368!!]]!" + "'", str2, "\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368!!]]!");
    }

    @Test
    public void test07024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07024");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201!", "\275UNLLUNLLUNLL\276UNLL\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201!" + "'", str2, "\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201!");
    }

    @Test
    public void test07025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07025");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\u037e\u037e\u0348\u0346\u0346!", "LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u037e\u037e\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u037e\u037e\u0348\u0346\u0346!");
    }

    @Test
    public void test07026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07026");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200null!\340\340nullnull\340\340nullnull\340\340nullnull\340\340null!\340\340nullnull\340\340nullnull\340\340nullnull\340\340}~\200\200}~\200\200null!\340\340nullnull\340\340nullnull\340\340nullnull\340\340null!\340\340nullnull\340\340nullnull\340\340nullnull\340\340}~\200\200}~\200\200null!\340\340nullnull\340\340nullnull\340\340nullnull\340\340null!\340\340nullnull\340\340nullnull\340\340nullnull\340\340}~\200\200}~\200\200null!\340\340nullnull\340\340nullnull\340\340nullnull\340\340null!\340\340nullnull\340\340nullnull\340\340nullnull\340\340\u0348\u0346\u0346!", "!~TT!~TT!!!~TT!~TT!!!~TT!~TT!~TT!~TT!!!~TT!~TT!!!~TT!~TT!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200T!~~!nullnullT!~~T!~~nullnullT!~~T!~~nullnullT!~~T!~~nullnullT!~~!nullnullT!~~T!~~nullnullT!~~T!~~nullnullT!~~T!~~nullnull}~\200\200}~\200\200T!~~!nullnullT!~~T!~~nullnullT!~~T!~~nullnullT!~~T!~~nullnullT!~~!nullnullT!~~T!~~nullnullT!~~T!~~nullnullT!~~T!~~nullnull}~\200\200}~\200\200T!~~!nullnullT!~~T!~~nullnullT!~~T!~~nullnullT!~~T!~~nullnullT!~~!nullnullT!~~T!~~nullnullT!~~T!~~nullnullT!~~T!~~nullnull}~\200\200}~\200\200\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200T!~~!nullnullT!~~T!~~nullnullT!~~T!~~nullnullT!~~T!~~nullnullT!~~!nullnullT!~~T!~~nullnullT!~~T!~~nullnullT!~~T!~~nullnull}~\200\200}~\200\200T!~~!nullnullT!~~T!~~nullnullT!~~T!~~nullnullT!~~T!~~nullnullT!~~!nullnullT!~~T!~~nullnullT!~~T!~~nullnullT!~~T!~~nullnull}~\200\200}~\200\200T!~~!nullnullT!~~T!~~nullnullT!~~T!~~nullnullT!~~T!~~nullnullT!~~!nullnullT!~~T!~~nullnullT!~~T!~~nullnullT!~~T!~~nullnull}~\200\200}~\200\200\u0348\u0346\u0346!");
    }

    @Test
    public void test07027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07027");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!\275LLLLLLLLLLL!!!!\275LLLLLLLLLLL!!!!!!!", "!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!!" + "'", str2, "\275!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test07028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07028");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("efhhnullnullnullefhhnullnullnullefhhnullnullnullefhhnullnullnullefhhnullnullnullefhhnullnullnullefhhnullnullnullefhhnullnullnull!", "HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHFFFHHHFHHHFHHHHHFFFHHHFHHHFHHHHHFFFHHHFHHHFHHHHHFFFHHHFHHHFHHHHHFFFHHHFHHHFHHHHHFFFHHHFHHHFHHHHHFFFHHHFHHHFHHHHHFFFHHHFHHHFHHH!" + "'", str2, "HHFFFHHHFHHHFHHHHHFFFHHHFHHHFHHHHHFFFHHHFHHHFHHHHHFFFHHHFHHHFHHHHHFFFHHHFHHHFHHHHHFFFHHHFHHHFHHHHHFFFHHHFHHHFHHHHHFFFHHHFHHHFHHH!");
    }

    @Test
    public void test07029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07029");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]]!!]]!!\276]]]\276]]]]]!!]]!!\276]]]\276]]]]]!!]]!!\276]]]\276]]]]]!!]]!!\276]]]\276]]]]]!!]]!!\276]]]\276]]]]]!!]]!!\276]]]\276]]]]]!!]]!!\276]]]\276]]]]]!!]]!!\276]]]\276]]]!", "U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]!!]]!!\276]]]\276]]]]]!!]]!!\276]]]\276]]]]]!!]]!!\276]]]\276]]]]]!!]]!!\276]]]\276]]]]]!!]]!!\276]]]\276]]]]]!!]]!!\276]]]\276]]]]]!!]]!!\276]]]\276]]]]]!!]]!!\276]]]\276]]]!" + "'", str2, "]]!!]]!!\276]]]\276]]]]]!!]]!!\276]]]\276]]]]]!!]]!!\276]]]\276]]]]]!!]]!!\276]]]\276]]]]]!!]]!!\276]]]\276]]]]]!!]]!!\276]]]\276]]]]]!!]]!!\276]]]\276]]]]]!!]]!!\276]]]\276]]]!");
    }

    @Test
    public void test07030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07030");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275!U!!!U!!!U!!\276!U!!\275\275!", "\u023e\u023e\u023e\200\u023e\u023e\u023e]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!!!!!!!!!!!!\276!!!!\275\275!" + "'", str2, "\275!!!!!!!!!!!!\276!!!!\275\275!");
    }

    @Test
    public void test07031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07031");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!~~!!~~!!!!~~!!~~!!!!~~!!~~!!~~!!~~!!!!~~!!~~!!!!~~!!~~!", "UN\275\275UN\275\275LLUN\275\275UN\275\275LLUN\275\275UN\275\275LLUN\275\275UN\275\275LLUN\275\275UN\275\275LLUN\275\275UN\275\275LLUN\275\275UN\275\275LLUN\275\275UN\275\275LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~~!!~~!!!!~~!!~~!!!!~~!!~~!!~~!!~~!!!!~~!!~~!!!!~~!!~~!" + "'", str2, "!!~~!!~~!!!!~~!!~~!!!!~~!!~~!!~~!!~~!!!!~~!!~~!!!!~~!!~~!");
    }

    @Test
    public void test07032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07032");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("FEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHH!", "nullnullnullnullnullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnullnullnullnullnull\204\204nullnull\204\204!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!" + "'", str2, "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
    }

    @Test
    public void test07033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07033");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0!", "]]!!]]!!\276]]]\276]]]]]!!]]!!\276]]]\276]]]]]!!]]!!\276]]]\276]]]]]!!]]!!\276]]]\276]]]]]!!]]!!\276]]]\276]]]]]!!]]!!\276]]]\276]]]]]!!]]!!\276]]]\276]]]]]!!]]!!\276]]]\276]]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fanullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fanullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07034");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!", "unllunllunllunllunllunllunllunll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!" + "'", str2, "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!");
    }

    @Test
    public void test07035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07035");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN!", "\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUU!" + "'", str2, "LUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUU!");
    }

    @Test
    public void test07036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07036");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220!", "HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220!" + "'", str2, "\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220!");
    }

    @Test
    public void test07037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07037");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\352\351\354\354\352\351\354\354!", "LNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLLLNLLLNLLLLLNLLLNLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLLLNLLL!" + "'", str2, "NLLLNLLL!");
    }

    @Test
    public void test07038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07038");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c!", "UNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07039");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("PP!!PP!!!!PP!!PP!!!!PP!!PP!!!!PP!!PP!!!!PP!!PP!!!!PP!!PP!!!!PP!!PP!!!!PP!!PP!!!!!", "}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!" + "'", str2, "nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!");
    }

    @Test
    public void test07040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07040");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!null\270\270\270null\270\270\270!!null\270\270\270null\270\270\270!!null\270\270\270null\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!null\270\270\270null\270\270\270!!null\270\270\270null\270\270\270!!null\270\270\270null\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!null\270\270\270null\270\270\270!!null\270\270\270null\270\270\270!!null\270\270\270null\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!null\270\270\270null\270\270\270!!null\270\270\270null\270\270\270!!null\270\270\270null\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test07041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07041");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!", "LLUU!!!LLUU!!!LLUU!!!LLUU!!!LLUU!!!LLUU!!!LLUU!!!LLUU!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!" + "'", str2, "!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!");
    }

    @Test
    public void test07042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07042");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07043");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200!\254!!!\254!!!\254!!!\254!!^!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!^!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!}~\200\200}~\200\200!\254!!!\254!!!\254!!!\254!!^!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!^!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!", "\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\200\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200!\254!!!\254!!!\254!!!\254!!^!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!^!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!}~\200\200}~\200\200!\254!!!\254!!!\254!!!\254!!^!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!^!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!" + "'", str2, "}~\200\200}~\200\200!\254!!!\254!!!\254!!!\254!!^!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!^!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!}~\200\200}~\200\200!\254!!!\254!!!\254!!!\254!!^!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!^!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!");
    }

    @Test
    public void test07044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07044");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07045");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!!" + "'", str2, "~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!!");
    }

    @Test
    public void test07046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07046");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275UUU\275UUU\275UUU\275UUUUU\275\275UU\275\275UU\275\275UU\275\275\275UUU\275UUU\275UUU\275UUUUU\275\275UU\275\275!", "LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnull\275\275nullnull\275\275!" + "'", str2, "\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnull\275\275nullnull\275\275!");
    }

    @Test
    public void test07047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07047");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!!", "LIIILIII!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test07048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07048");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266!", "bnullnullnullbnullnullnullnullnullbnullnullnullbnullnullnullnullnull\225\225bnullnullnullbnullnullnullnullnullbnullnullnullbnullnullnullnullnull\225\225bnullnullnullbnullnullnullnullnullbnullnullnullbnullnullnullnullnull\225\225bnullnullnullbnullnullnullnullnullbnullnullnullbnullnullnullnullnull\225\225bnullnullnullbnullnullnullnullnullbnullnullnullbnullnullnullnullnull\225\225bnullnullnullbnullnullnullnullnullbnullnullnullbnullnullnullnullnull\225\225bnullnullnullbnullnullnullnullnullbnullnullnullbnullnullnullnullnull\225\225bnullnullnullbnullnullnullnullnullbnullnullnullbnullnullnullnullnull\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266!" + "'", str2, "nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266!");
    }

    @Test
    public void test07049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07049");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0146\u0146\u0146\u0146\u0146\u0146\u0146\u0146\u0346\u0348\u0348!", "\234!nullnull\234!nullnull!!\234!nullnull\234!nullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test07050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07050");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!", "UNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!" + "'", str2, "\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!");
    }

    @Test
    public void test07051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07051");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("HHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnull!", "FHEEFHEE!!FHEEFHEE!!FHEEFHEEFHEEFHEE!!FHEEFHEE!!FHEEFHEE!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "vvnullnullnullnullnullnullnullnullvvnullnullnullnullnullnullnullnullvvnullnullnullnullnullnullnullnullvvnullnullnullnullnullnullnullnullvvnullnullnullnullnullnullnullnullvvnullnullnullnullnullnullnullnullvvnullnullnullnullnullnullnullnullvvnullnullnullnullnullnullnullnull!" + "'", str2, "vvnullnullnullnullnullnullnullnullvvnullnullnullnullnullnullnullnullvvnullnullnullnullnullnullnullnullvvnullnullnullnullnullnullnullnullvvnullnullnullnullnullnullnullnullvvnullnullnullnullnullnullnullnullvvnullnullnullnullnullnullnullnullvvnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07052");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230!", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!" + "'", str2, "~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230~}\200\200~}\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\230\230!");
    }

    @Test
    public void test07053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07053");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225!", "~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276LUUULUUU\275\276LUUULUUU\225\225\275\276LUUULUUU\275\276LUUULUUU\225\225\275\276LUUULUUU\275\276LUUULUUU\225\225\275\276LUUULUUU\275\276LUUULUUU\225\225\275\276LUUULUUU\275\276LUUULUUU\225\225\275\276LUUULUUU\275\276LUUULUUU\225\225\275\276LUUULUUU\275\276LUUULUUU\225\225\275\276LUUULUUU\275\276LUUULUUU\225\225!" + "'", str2, "\275\276LUUULUUU\275\276LUUULUUU\225\225\275\276LUUULUUU\275\276LUUULUUU\225\225\275\276LUUULUUU\275\276LUUULUUU\225\225\275\276LUUULUUU\275\276LUUULUUU\225\225\275\276LUUULUUU\275\276LUUULUUU\225\225\275\276LUUULUUU\275\276LUUULUUU\225\225\275\276LUUULUUU\275\276LUUULUUU\225\225\275\276LUUULUUU\275\276LUUULUUU\225\225!");
    }

    @Test
    public void test07054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07054");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0!!!", "\260\260\u0108\u0108\260\260\u0108\u0108}}\260\260\u0108\u0108\260\260\u0108\u0108}}!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test07055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07055");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230~}\200\200~}\200\200nullnull~~}\200\200nullnull~~}\200\200\230\230nullnull~~}\200\200nullnull~~}\200\200\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07056");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\367!\372\372\367!\372\372!", "jghhjghh!!jghhjghh!!jghhjghhjghhjghh!!jghhjghh!!jghhjghh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\367!nullnull\367!nullnull!" + "'", str2, "\367!nullnull\367!nullnull!");
    }

    @Test
    public void test07057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07057");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("wxzzwxzz!!wxzzwxzz!!wxzzwxzzwxzzwxzz!!wxzzwxzz!!wxzzwxzz!", "\260\260nullnull\260\260nullnull}}\260\260nullnull\260\260nullnull}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\260uu\260\260uu!!\260\260uu\260\260uu!!\260\260uu\260\260uu\260\260uu\260\260uu!!\260\260uu\260\260uu!!\260\260uu\260\260uu!" + "'", str2, "\260\260uu\260\260uu!!\260\260uu\260\260uu!!\260\260uu\260\260uu\260\260uu\260\260uu!!\260\260uu\260\260uu!!\260\260uu\260\260uu!");
    }

    @Test
    public void test07058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07058");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!!``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!!``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!!``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!!``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07059");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LULLLULL!!LULLLULL!!LULLLULL!!LULLLULL!!LULLLULL!!LULLLULL!!LULLLULL!!LULLLULL!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test07060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07060");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]]]]]]]]!!]]]]]]]]!!]]]]]]]]]]]]]]]]!!]]]]]]]]!!]]]]]]]]!", "LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!!LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!!LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!!LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!!LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]]]]]]]!!]]]]]]]]!!]]]]]]]]]]]]]]]]!!]]]]]]]]!!]]]]]]]]!" + "'", str2, "]]]]]]]]!!]]]]]]]]!!]]]]]]]]]]]]]]]]!!]]]]]]]]!!]]]]]]]]!");
    }

    @Test
    public void test07061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07061");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\215}\215\215\215}\215\215\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\215}\215\215\215}\215\215!", "\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\215}\215\215\215}\215\215!");
    }

    @Test
    public void test07062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07062");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!", "]^``]^``!!]^``]^``!!]^``]^``]^``]^``!!]^``]^``!!]^``]^``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!" + "'", str2, "!!!");
    }

    @Test
    public void test07063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07063");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^!N]]!N]]N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^!N]]!N]]N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^!N]]!N]]N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^!N]]!N]]N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^!N]]!N]]N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^!N]]!N]]N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^!N]]!N]]N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^!N]]!N]]!", "\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^!null]]!null]]null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^!null]]!null]]null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^!null]]!null]]null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^!null]]!null]]null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^!null]]!null]]null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^!null]]!null]]null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^!null]]!null]]null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^!null]]!null]]!" + "'", str2, "null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^!null]]!null]]null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^!null]]!null]]null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^!null]]!null]]null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^!null]]!null]]null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^!null]]!null]]null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^!null]]!null]]null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^!null]]!null]]null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^!null]]!null]]!");
    }

    @Test
    public void test07064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07064");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275``uuuuuuuu``uuuuuuuu``uuuuuuuu\276``uuuuuuuu\275\275!", "nullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275``NNNNNNNN``NNNNNNNN``NNNNNNNN\276``NNNNNNNN\275\275!" + "'", str2, "\275``NNNNNNNN``NNNNNNNN``NNNNNNNN\276``NNNNNNNN\275\275!");
    }

    @Test
    public void test07065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07065");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!!", "nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200!!nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200!!nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200!!nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200!!nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200!!nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200!!nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200!!nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!" + "'", str2, "L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!");
    }

    @Test
    public void test07066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07066");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!", "~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]\225\230\230~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]\225\230\230~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]\225\230\230~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]\225\230\230\200}}`~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]\225\230\230~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]\225\230\230~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]\225\230\230~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!" + "'", str2, "!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!");
    }

    @Test
    public void test07067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07067");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\305\306\310\310\305\306\310\310!!\305\306\310\310\305\306\310\310!!!", "\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test07068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07068");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!", "NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230\200}}`NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!" + "'", str2, "}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!");
    }

    @Test
    public void test07069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07069");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLL!~~LLLL!~~LLLL!~~LLLL!~~LLLL!~~LLLL!~~LLLL!~~LLLL!~~LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!~~LLLL!~~LLLL!~~LLLL!~~LLLL!~~LLLL!~~LLLL!~~LLLL!~~LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLL!~~LLLL!~~LLLL!~~LLLL!~~LLLL!~~LLLL!~~LLLL!~~LLLL!~~LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!~~LLLL!~~LLLL!~~LLLL!~~LLLL!~~LLLL!~~LLLL!~~LLLL!~~LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test07070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07070");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348`\230\230\230\u0348\u0346\u0346!", "H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348`\230\230\230\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348`\230\230\230\u0348\u0346\u0346!");
    }

    @Test
    public void test07071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07071");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388\u0388!", "LLNNLLNNNNLLNNLLNNNN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tnullpptnullppnullnulltnullpptnullppnullnulltnullpptnullppnullnulltnullpptnullppnullnull!tnullppnullnull!tnullppnullnull!tnullppnullnull!tnullppnullnulltnullpptnullppnullnulltnullpptnullppnullnulltnullpptnullppnullnulltnullpptnullppnullnull!tnullppnullnull!tnullppnullnull!" + "'", str2, "tnullpptnullppnullnulltnullpptnullppnullnulltnullpptnullppnullnulltnullpptnullppnullnull!tnullppnullnull!tnullppnullnull!tnullppnullnull!tnullppnullnulltnullpptnullppnullnulltnullpptnullppnullnulltnullpptnullppnullnulltnullpptnullppnullnull!tnullppnullnull!tnullppnullnull!");
    }

    @Test
    public void test07072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07072");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull!!``nullnull``nullnull``nullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!``nullnull``nullnull``nullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!", "vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "VV!!VV!!!!``VV!!VV!!``VV!!VV!!``VV!!VV!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!``VV!!VV!!``VV!!VV!!``VV!!VV!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!!" + "'", str2, "VV!!VV!!!!``VV!!VV!!``VV!!VV!!``VV!!VV!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!``VV!!VV!!``VV!!VV!!``VV!!VV!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!!");
    }

    @Test
    public void test07073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07073");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u023e\u023e\u023e\200\u023e\u023e\u023e]]!", "\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02ee\u02eb\u02ec\u02ecnullnullnull\200\u02ee\u02eb\u02ec\u02ecnullnullnull]]!" + "'", str2, "\u02ee\u02eb\u02ec\u02ecnullnullnull\200\u02ee\u02eb\u02ec\u02ecnullnullnull]]!");
    }

    @Test
    public void test07074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07074");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!", "!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LNNNNN!LNNNNN!LNNNNN!LNNNNN!!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!" + "'", str2, "!LNNNNN!LNNNNN!LNNNNN!LNNNNN!!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!");
    }

    @Test
    public void test07075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07075");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LL!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test07076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07076");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnull]]!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLLUNLLUNLLUNLLUNLLUNLLUNLL\200}}`UNLLUNLLUNLLUNLLUNLLUNLLUNLL]]!" + "'", str2, "UNLLUNLLUNLLUNLLUNLLUNLLUNLL\200}}`UNLLUNLLUNLLUNLLUNLLUNLLUNLL]]!");
    }

    @Test
    public void test07077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07077");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!!", "\227nullnullnull\227nullnullnull\227nullnullnull\227nullnullnull\227nullnullnull\227nullnullnull\227nullnullnull\227nullnullnull!!\227nullnullnull\227nullnullnull\227nullnullnull\227nullnullnull\227nullnullnull\227nullnullnull\227nullnullnull\227nullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!!" + "'", str2, "\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!!");
    }

    @Test
    public void test07078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07078");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!nullnullnullnullnullnullnullnull!", "!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07079");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "ULLLULLLULLLULLL\200}}`ULLLULLLULLLULLL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test07080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07080");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLL]]!", "LLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLL]]!" + "'", str2, "LLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLL]]!");
    }

    @Test
    public void test07081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07081");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!~UU!~UU\220\220!~UU!~UU\220\220\220!~UU\220\220\220!~UU\220\220\220!~UU\220\220\220!~UU\220\220!~UU!~UU\220\220!~UU!~UU\220\220!", "\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~\307\307!~\307\307\220\220!~\307\307!~\307\307\220\220\220!~\307\307\220\220\220!~\307\307\220\220\220!~\307\307\220\220\220!~\307\307\220\220!~\307\307!~\307\307\220\220!~\307\307!~\307\307\220\220!" + "'", str2, "!~\307\307!~\307\307\220\220!~\307\307!~\307\307\220\220\220!~\307\307\220\220\220!~\307\307\220\220\220!~\307\307\220\220\220!~\307\307\220\220!~\307\307!~\307\307\220\220!~\307\307!~\307\307\220\220!");
    }

    @Test
    public void test07082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07082");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230\200}}`NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230]]!", "!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230\200}}`!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230]]!" + "'", str2, "!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230\200}}`!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230]]!");
    }

    @Test
    public void test07083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07083");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "!H!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07084");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400!!!", "\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254nullx]]nullx]]nullx]]nullx]]nullx]]nullx]]nullx]]nullx]]\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254nullx]]nullx]]nullx]]nullx]]nullx]]nullx]]nullx]]nullx]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test07085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07085");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null!ijllijllnull!ijllijllnull!ijllijllnull!ijllijllnull!ijllijllnull!ijllijllnull!ijllijllnull!ijllijll!", "\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216!" + "'", str2, "\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216!");
    }

    @Test
    public void test07086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07086");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200\300\300\300\300^\300\300\300\300\300\300\300\300\300\300\300\300^\300\300\300\300\300\300\300\300}~\200\200}~\200\200\300\300\300\300^\300\300\300\300\300\300\300\300\300\300\300\300^\300\300\300\300\300\300\300\300!", "\276\276!!nullnull\276\276nullnull\276\276nullnull\276\276\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!nullnull\276\276nullnull\276\276nullnull\276\276\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200nullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnull!" + "'", str2, "}~\200\200}~\200\200nullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07087");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275nullnull\200\200nullnull\200\200nullnull\200\200\276nullnull\200\200\275\275!", "\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276\336\266\266\276\336\266\266\200\200\276\336\266\266\276\336\266\266\200\200\276\336\266\266\276\336\266\266\200\200\276\276\336\266\266\276\336\266\266\200\200\275\275!" + "'", str2, "\275\276\336\266\266\276\336\266\266\200\200\276\336\266\266\276\336\266\266\200\200\276\336\266\266\276\336\266\266\200\200\276\276\336\266\266\276\336\266\266\200\200\275\275!");
    }

    @Test
    public void test07088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07088");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLUULLUU!" + "'", str2, "LLUULLUU!");
    }

    @Test
    public void test07089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07089");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7!", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\273\272\275\275\273\272\275\275\253\253\273\272\275\275\273\272\275\275\253\253\273\272\275\275\273\272\275\275\253\253\273\272\275\275\273\272\275\275\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\273\272\275\275\273\272\275\275\253\253\273\272\275\275\273\272\275\275\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07090");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test07091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07091");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0!!!```!", "\230!\225\225\230!\225\225LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\230!\225\225\230!\225\225LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\230!\225\225\230!\225\225LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\230!\225\225\230!\225\225LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\230!\225\225\230!\225\225LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\230!\225\225\230!\225\225LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\230!\225\225\230!\225\225LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\230!\225\225\230!\225\225LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0nullnull!!!```!" + "'", str2, "\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0nullnull!!!```!");
    }

    @Test
    public void test07092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07092");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNNNLNNNLLLLLLLLLLLLLLLLLNNNLNNN!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
    }

    @Test
    public void test07093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07093");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!!", "~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!!" + "'", str2, "\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!!");
    }

    @Test
    public void test07094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07094");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0150\u0150nullnullnull!", "]]]]]]]]!!]]]]]]]]!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null]!]]]!]]]!]]null]!]]]!]]]!]]!" + "'", str2, "null]!]]]!]]]!]]null]!]]]!]]]!]]!");
    }

    @Test
    public void test07095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07095");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7!", "!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07096");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07097");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225!", "`!!LL!!LL!!LL`!!LL!!LL!!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL\225\225LL\225\225LL\225\225LL\225\225LL\225\225LL\225\225LL\225\225LL\225\225!" + "'", str2, "LL\225\225LL\225\225LL\225\225LL\225\225LL\225\225LL\225\225LL\225\225LL\225\225!");
    }

    @Test
    public void test07098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07098");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u019e\u019c\u019c\u019e\u019c\u019c\u019e\u019c\u019c\u019e\u019c\u019c\u019e\u019c\u019c\u019e\u019c\u019c\u019e\u019c\u019c\u019e\u019c\u019c\u0346\u0348\u0348!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test07099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07099");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLUULLUU!", "\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348!" + "'", str2, "\u0348\u0348\u0348\u0348!");
    }

    @Test
    public void test07100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07100");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276!!!\276\276!!\276\276!!\276\276!!\276\276!!\276!!!\276\276!!\276\276!!!", "fehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!!!\276\276!!\276\276!!\276\276!!\276\276!!\276!!!\276\276!!\276\276!!!" + "'", str2, "\276!!!\276\276!!\276\276!!\276\276!!\276\276!!\276!!!\276\276!!\276\276!!!");
    }

    @Test
    public void test07101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07101");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "LUUULUUULUUULUUULUUULUUULUUULUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07102");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!", "!\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test07103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07103");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("XXUUXXUU!", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\200}}`NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07104");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("ab!", "LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!" + "'", str2, "nullnull!");
    }

    @Test
    public void test07105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07105");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL]]LL]]LLLLLLLLLL]]LL]]LLLLLLLL!", "\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull]]nullnull]]nullnullnullnullnullnullnullnullnullnull]]nullnull]]nullnullnullnullnullnullnullnull!" + "'", str2, "nullnull]]nullnull]]nullnullnullnullnullnullnullnullnullnull]]nullnull]]nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07106");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!", "\253\254\256\256~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200\253\254\256\256~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!" + "'", str2, "``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!");
    }

    @Test
    public void test07107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07107");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!~NN!~NN!~NN!~NN!~NN!~NN!~NN!~NN\276\276\266\266\276\276\266\266!~NN!~NN!~NN!~NN!~NN!~NN!~NN!~NN\276\276\266\266\276\276\266\266!~NN!~NN!~NN!~NN!~NN!~NN!~NN!~NN\276\276\266\266\276\276\266\266!~NN!~NN!~NN!~NN!~NN!~NN!~NN!~NN\276\276\266\266\276\276\266\266!~NN!~NN!~NN!~NN!~NN!~NN!~NN!~NN\276\276\266\266\276\276\266\266!~NN!~NN!~NN!~NN!~NN!~NN!~NN!~NN\276\276\266\266\276\276\266\266!~NN!~NN!~NN!~NN!~NN!~NN!~NN!~NN\276\276\266\266\276\276\266\266!~NN!~NN!~NN!~NN!~NN!~NN!~NN!~NN\276\276\266\266\276\276\266\266!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!" + "'", str2, "!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!");
    }

    @Test
    public void test07108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07108");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "UULLUULL!!!!UULLUULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test07109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07109");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("````````````````````````````````````````````````````````````````````````````````!", "null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212!!null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212!!null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212!!null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212!!null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````````````````````````````````````````````````````````````````````````````````!" + "'", str2, "````````````````````````````````````````````````````````````````````````````````!");
    }

    @Test
    public void test07110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07110");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242}~\200\200}~\200\200\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242!", "\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200nullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnull!" + "'", str2, "}~\200\200}~\200\200nullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07111");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]!", "nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]!" + "'", str2, "]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]!");
    }

    @Test
    public void test07112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07112");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!", "null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnullnull\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLL!" + "'", str2, "L\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLL!");
    }

    @Test
    public void test07113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07113");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!", "!\276!\340\340\276!\340\340\276!\340\340\276!\340\340!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!!!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!!!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!!!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!!!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!" + "'", str2, "!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!!!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!!!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!!!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!!!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!");
    }

    @Test
    public void test07114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07114");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07115");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276\276}~\200\200\276nullnull}~\200\200\276nullnull\276\276}~\200\200\276nullnull}~\200\200\276nullnull\276\276}~\200\200\276nullnull}~\200\200\276nullnull\276\276}~\200\200\276nullnull}~\200\200\276nullnull\276\276}~\200\200\276nullnull}~\200\200\276nullnull\276\276}~\200\200\276nullnull}~\200\200\276nullnull\276\276}~\200\200\276nullnull}~\200\200\276nullnull\276\276}~\200\200\276nullnull}~\200\200\276nullnull!", "\u0366\u0365\u0368\u0368!]!!!]!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276}~\200\200\276nullnullnullnullnullnullnullnull}~\200\200\276nullnullnullnullnullnullnullnull\276\276}~\200\200\276nullnullnullnullnullnullnullnull}~\200\200\276nullnullnullnullnullnullnullnull\276\276}~\200\200\276nullnullnullnullnullnullnullnull}~\200\200\276nullnullnullnullnullnullnullnull\276\276}~\200\200\276nullnullnullnullnullnullnullnull}~\200\200\276nullnullnullnullnullnullnullnull\276\276}~\200\200\276nullnullnullnullnullnullnullnull}~\200\200\276nullnullnullnullnullnullnullnull\276\276}~\200\200\276nullnullnullnullnullnullnullnull}~\200\200\276nullnullnullnullnullnullnullnull\276\276}~\200\200\276nullnullnullnullnullnullnullnull}~\200\200\276nullnullnullnullnullnullnullnull\276\276}~\200\200\276nullnullnullnullnullnullnullnull}~\200\200\276nullnullnullnullnullnullnullnull!" + "'", str2, "\276\276}~\200\200\276nullnullnullnullnullnullnullnull}~\200\200\276nullnullnullnullnullnullnullnull\276\276}~\200\200\276nullnullnullnullnullnullnullnull}~\200\200\276nullnullnullnullnullnullnullnull\276\276}~\200\200\276nullnullnullnullnullnullnullnull}~\200\200\276nullnullnullnullnullnullnullnull\276\276}~\200\200\276nullnullnullnullnullnullnullnull}~\200\200\276nullnullnullnullnullnullnullnull\276\276}~\200\200\276nullnullnullnullnullnullnullnull}~\200\200\276nullnullnullnullnullnullnullnull\276\276}~\200\200\276nullnullnullnullnullnullnullnull}~\200\200\276nullnullnullnullnullnullnullnull\276\276}~\200\200\276nullnullnullnullnullnullnullnull}~\200\200\276nullnullnullnullnullnullnullnull\276\276}~\200\200\276nullnullnullnullnullnullnullnull}~\200\200\276nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07116");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````!", "~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````!" + "'", str2, "\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````!");
    }

    @Test
    public void test07117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07117");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e!", "LL!!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull!" + "'", str2, "\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull!");
    }

    @Test
    public void test07118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07118");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\300\300\275\275\300\300\275\275\300\300\275\275\300\300\275\275\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\300\300\275\275\300\300\275\275!", "L!!!L!!!L!!!L!!!\200}}`L!!!L!!!L!!!L!!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnull\275\275nullnull\275\275!" + "'", str2, "\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnull\275\275nullnull\275\275nullnull\275\275nullnull\275\275\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnull\275\275nullnull\275\275!");
    }

    @Test
    public void test07119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07119");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\220xx\200}}`null\220xx]]!", "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLLL\220NN\200}}`NLLL\220NN]]!" + "'", str2, "NLLL\220NN\200}}`NLLL\220NN]]!");
    }

    @Test
    public void test07120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07120");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368nullnull\204\204nullnullnullnullnull\204\204nullnullnull!!nullnull\204\204nullnullnullnullnull\204\204nullnullnull!!nullnull\204\204nullnullnullnullnull\204\204nullnullnull!!nullnull\204\204nullnullnullnullnull\204\204\u0346\u0348\u0348!", "xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204\u0346\u0348\u0348!");
    }

    @Test
    public void test07121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07121");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("P!nullnullP!nullnull!!P!nullnullP!nullnull!!P!nullnullP!nullnullP!nullnullP!nullnull!!P!nullnullP!nullnull!!P!nullnullP!nullnull!", "nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L!UN``UN``L!UN``UN``!!L!UN``UN``L!UN``UN``!!L!UN``UN``L!UN``UN``L!UN``UN``L!UN``UN``!!L!UN``UN``L!UN``UN``!!L!UN``UN``L!UN``UN``!" + "'", str2, "L!UN``UN``L!UN``UN``!!L!UN``UN``L!UN``UN``!!L!UN``UN``L!UN``UN``L!UN``UN``L!UN``UN``!!L!UN``UN``L!UN``UN``!!L!UN``UN``L!UN``UN``!");
    }

    @Test
    public void test07122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07122");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\254\254\200NNN\200NNN\254\254\200NNN\200NNN\254\254\200NNN\200NNN\254\254\200NNN\200NNN\254\254\200NNN\200NNN\254\254\200NNN\200NNN\254\254\200NNN\200NNN\254\254\200NNN\200NNN!", "LNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNNLNNN!LNNNLNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\254\254\200LLL\200LLL\254\254\200LLL\200LLL\254\254\200LLL\200LLL\254\254\200LLL\200LLL\254\254\200LLL\200LLL\254\254\200LLL\200LLL\254\254\200LLL\200LLL\254\254\200LLL\200LLL!" + "'", str2, "\254\254\200LLL\200LLL\254\254\200LLL\200LLL\254\254\200LLL\200LLL\254\254\200LLL\200LLL\254\254\200LLL\200LLL\254\254\200LLL\200LLL\254\254\200LLL\200LLL\254\254\200LLL\200LLL!");
    }

    @Test
    public void test07123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07123");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\200}}`\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!]]!", "\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\200}}`\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!]]!" + "'", str2, "\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\200}}`\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!]]!");
    }

    @Test
    public void test07124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07124");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!", "UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!");
    }

    @Test
    public void test07125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07125");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340\u0348\u0346\u0346!", "!!!!null\270\270\270null\270\270\270!!null\270\270\270null\270\270\270!!null\270\270\270null\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!null\270\270\270null\270\270\270!!null\270\270\270null\270\270\270!!null\270\270\270null\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test07126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07126");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("v!nullnullv!nullnullv!nullnullv!nullnullv!nullnullv!nullnullv!nullnullv!nullnull!", "\u014e\u014e\u014e\u014e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!" + "'", str2, "null!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07127");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275UNLLUNLLUNLL\276UNLL\275\275!", "u!!!u!!!nullnullu!!!u!!!nullnull\225\225u!!!u!!!nullnullu!!!u!!!nullnull\225\225u!!!u!!!nullnullu!!!u!!!nullnull\225\225u!!!u!!!nullnullu!!!u!!!nullnull\225\225u!!!u!!!nullnullu!!!u!!!nullnull\225\225u!!!u!!!nullnullu!!!u!!!nullnull\225\225u!!!u!!!nullnullu!!!u!!!nullnull\225\225u!!!u!!!nullnullu!!!u!!!nullnull\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\276\u014c\u014b\u014e\u014e\275\275!" + "'", str2, "\275\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\276\u014c\u014b\u014e\u014e\275\275!");
    }

    @Test
    public void test07128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07128");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!", "\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126ULL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!" + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
    }

    @Test
    public void test07129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07129");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!!", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253FFFFFFFF\253\253FFFFFFFF\253\253FFFFFFFF\253\253FFFFFFFF\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253FFFFFFFF\253\253FFFFFFFF\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!!" + "'", str2, "~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!~}\200\200~}\200\200\276\276!!\276\276!!!");
    }

    @Test
    public void test07130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07130");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~null\200nullnullnull\200nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07131");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275L!]]L!]]L!]]\275L!]]L!]]L!]]!", "a]aaa]aa!!a]aaa]aa!!a]aaa]aaa]aaa]aa!!a]aaa]aa!!a]aaa]aa!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275]!]]]!]]]!]]\275]!]]]!]]]!]]!" + "'", str2, "\275]!]]]!]]]!]]\275]!]]]!]]]!]]!");
    }

    @Test
    public void test07132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07132");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("L!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LL!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100!" + "'", str2, "\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100!");
    }

    @Test
    public void test07133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07133");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!\200}}`!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!]]!", "\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\200\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\200}}`!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!]]!" + "'", str2, "!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\200}}`!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!]]!");
    }

    @Test
    public void test07134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07134");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\ua7ad\ua7ad\ua7ad\ua7ad\200\ua7ad\ua7ad\ua7ad\ua7ad]]!", "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\200}}`nullnullnullnull]]!" + "'", str2, "nullnullnullnull\200}}`nullnullnullnull]]!");
    }

    @Test
    public void test07135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07135");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0348\u0348\u01e0\u01e0\u01e0\u0348\u0348\u01e0\u01e0\u01e0\u0348\u0348\u01e0\u01e0\u01e0\u0348\u0348\u01e0\u01e0\u01e0\200\u0348\u0348\u01e0\u01e0\u01e0\u0348\u0348\u01e0\u01e0\u01e0\u0348\u0348\u01e0\u01e0\u01e0\u0348\u0348\u01e0\u01e0\u01e0]]!", "N!!!N!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~nullnullnull\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~nullnullnull]]!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~nullnullnull\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~nullnullnull]]!");
    }

    @Test
    public void test07136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07136");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!", "\275H!]]H!]]H!]]\275H!]]H!]]H!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!" + "'", str2, "!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!");
    }

    @Test
    public void test07137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07137");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!", "lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNNNNNNNNNN!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!" + "'", str2, "NNNNNNNNNNNNNNNN!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!");
    }

    @Test
    public void test07138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07138");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!", "nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!" + "'", str2, "!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!");
    }

    @Test
    public void test07139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07139");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0108!", "]U!!]U!!!!]U!!]U!!!!]U!!]U!!]U!!]U!!!!]U!!]U!!!!]U!!]U!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!" + "'", str2, "!null!");
    }

    @Test
    public void test07140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07140");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("H!!!H!!!H!!!H!!!H!!!H!!!H!!!H!!!!", "\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270\u01a6\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\270!!!\270!!!\270!!!\270!!!\270!!!\270!!!\270!!!\270!!!!" + "'", str2, "\270!!!\270!!!\270!!!\270!!!\270!!!\270!!!\270!!!\270!!!!");
    }

    @Test
    public void test07141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07141");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271~}}^\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271]]!", "nullvvvnullvvvnullvvvnullvvv\200}}`nullvvvnullvvvnullvvvnullvvv]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271~}}^\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271]]!" + "'", str2, "\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271~}}^\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271]]!");
    }

    @Test
    public void test07142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07142");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!", "NLLLNLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!enullhhnullnullnullenullhhnullnullnullenullhhnullnullnull!enullhhnullnullnullenullhhnullnullnullenullhhnullnullnull!enullhhnullnullnullenullhhnullnullnullenullhhnullnullnull!enullhhnullnullnullenullhhnullnullnullenullhhnullnullnull!enullhhnullnullnullenullhhnullnullnullenullhhnullnullnull!enullhhnullnullnullenullhhnullnullnullenullhhnullnullnull!enullhhnullnullnullenullhhnullnullnullenullhhnullnullnull!enullhhnullnullnullenullhhnullnullnullenullhhnullnullnull!enullhhnullnullnullenullhhnullnullnullenullhhnullnullnull!enullhhnullnullnullenullhhnullnullnullenullhhnullnullnull!enullhhnullnullnullenullhhnullnullnullenullhhnullnullnull!enullhhnullnullnullenullhhnullnullnullenullhhnullnullnull!enullhhnullnullnullenullhhnullnullnullenullhhnullnullnull!enullhhnullnullnullenullhhnullnullnullenullhhnullnullnull!" + "'", str2, "!enullhhnullnullnullenullhhnullnullnullenullhhnullnullnull!enullhhnullnullnullenullhhnullnullnullenullhhnullnullnull!enullhhnullnullnullenullhhnullnullnullenullhhnullnullnull!enullhhnullnullnullenullhhnullnullnullenullhhnullnullnull!enullhhnullnullnullenullhhnullnullnullenullhhnullnullnull!enullhhnullnullnullenullhhnullnullnullenullhhnullnullnull!enullhhnullnullnullenullhhnullnullnullenullhhnullnullnull!enullhhnullnullnullenullhhnullnullnullenullhhnullnullnull!enullhhnullnullnullenullhhnullnullnullenullhhnullnullnull!enullhhnullnullnullenullhhnullnullnullenullhhnullnullnull!enullhhnullnullnullenullhhnullnullnullenullhhnullnullnull!enullhhnullnullnullenullhhnullnullnullenullhhnullnullnull!enullhhnullnullnullenullhhnullnullnullenullhhnullnullnull!enullhhnullnullnullenullhhnullnullnullenullhhnullnullnull!");
    }

    @Test
    public void test07143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07143");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LL!", "OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RRR\275\275RRRRR\275\275RRRR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RRR\275\275RRRRR\275\275RRRR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RRR\275\275RRRRR\275\275RRRR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RRR\275\275RRRRR\275\275RRRR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RRR\275\275RRRRR\275\275RRRR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RRR\275\275RRRRR\275\275RRRR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RRR\275\275RRRRR\275\275RRRR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RRR\275\275RRRRR\275\275RR!" + "'", str2, "RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RRR\275\275RRRRR\275\275RRRR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RRR\275\275RRRRR\275\275RRRR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RRR\275\275RRRRR\275\275RRRR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RRR\275\275RRRRR\275\275RRRR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RRR\275\275RRRRR\275\275RRRR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RRR\275\275RRRRR\275\275RRRR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RRR\275\275RRRRR\275\275RRRR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RRR\275\275RRRRR\275\275RR!");
    }

    @Test
    public void test07144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07144");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\300\300\300\276\300\275\275!", "ppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnn!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275PPP\276P\275\275!" + "'", str2, "\275PPP\276P\275\275!");
    }

    @Test
    public void test07145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07145");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL]]LL]]LLLLLLLLLL]]LL]]LLLLLLLL!", "\u023d\u023e\u0240\u0240\u023d\u023e\u0240\u0240\u023d\u023e\u0240\u0240\u023d\u023e\u0240\u0240!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PP]]PP]]PPPPPPPPPP]]PP]]PPPPPPPP!" + "'", str2, "PP]]PP]]PPPPPPPPPP]]PP]]PPPPPPPP!");
    }

    @Test
    public void test07146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07146");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLUULLUU!", "!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLL!" + "'", str2, "LLLLLLLL!");
    }

    @Test
    public void test07147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07147");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07148");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!", "\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test07149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07149");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275!!!\275!!!\275!!!\275!!!\200}}`\275!!!\275!!!\275!!!\275!!!]]!", "^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!!!\275!!!\275!!!\275!!!\200}}`\275!!!\275!!!\275!!!\275!!!]]!" + "'", str2, "\275!!!\275!!!\275!!!\275!!!\200}}`\275!!!\275!!!\275!!!\275!!!]]!");
    }

    @Test
    public void test07150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07150");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]]\300\300]]\300\300!!]]\300\300]]\300\300!!]]\300\300]]\300\300]]\300\300]]\300\300!!]]\300\300]]\300\300!!]]\300\300]]\300\300!", "nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200!!nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200!!nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200!!nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200!!nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!" + "'", str2, "]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!");
    }

    @Test
    public void test07151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07151");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ijllijllijllijll!ill!ill!ill!illijllijllijllijll!ill!ill!", "!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!" + "'", str2, "!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!");
    }

    @Test
    public void test07152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07152");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```!", "\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\u0108\u0108\u0108!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108```!" + "'", str2, "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108```!");
    }

    @Test
    public void test07153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07153");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!", "\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!" + "'", str2, "null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!");
    }

    @Test
    public void test07154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07154");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275NULLNULLNULL\276NULL\275\275!", "\253\253\253\253\253\253\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnullnullnullnullnullnullnullnullnullnull\276nullnullnullnull\275\275!" + "'", str2, "\275nullnullnullnullnullnullnullnullnullnullnullnull\276nullnullnullnull\275\275!");
    }

    @Test
    public void test07155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07155");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200!\254!!!\254!!!\254!!!\254!!^!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!^!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!}~\200\200}~\200\200!\254!!!\254!!!\254!!!\254!!^!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!^!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!", "TQTTTQTT!!TQTTTQTT!!TQTTTQTT!!TQTTTQTT!!TQTTTQTT!!TQTTTQTT!!TQTTTQTT!!TQTTTQTT!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200!\254!!!\254!!!\254!!!\254!!^!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!^!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!}~\200\200}~\200\200!\254!!!\254!!!\254!!!\254!!^!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!^!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!" + "'", str2, "}~\200\200}~\200\200!\254!!!\254!!!\254!!!\254!!^!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!^!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!}~\200\200}~\200\200!\254!!!\254!!!\254!!!\254!!^!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!^!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!\254!!!");
    }

    @Test
    public void test07156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07156");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "]]\256\256]]\256\256!!]]\256\256]]\256\256!!]]\256\256]]\256\256]]\256\256]]\256\256!!]]\256\256]]\256\256!!]]\256\256]]\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07157");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128!!!!", "NN]]NN]]UNNNUNNNNN]]NN]]UNNNUNNN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!" + "'", str2, "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!");
    }

    @Test
    public void test07158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07158");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!", "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230!\225\225\230!\225\225^```^```^```^```^```^```^```^```\230!\225\225\230!\225\225^```^```^```^```^```^```^```^```\230!\225\225\230!\225\225^```^```^```^```^```^```^```^```\230!\225\225\230!\225\225^```^```^```^```^```^```^```^```\230!\225\225\230!\225\225^```^```^```^```^```^```^```^```\230!\225\225\230!\225\225^```^```^```^```^```^```^```^```\230!\225\225\230!\225\225^```^```^```^```^```^```^```^```\230!\225\225\230!\225\225^```^```^```^```^```^```^```^```!" + "'", str2, "\230!\225\225\230!\225\225^```^```^```^```^```^```^```^```\230!\225\225\230!\225\225^```^```^```^```^```^```^```^```\230!\225\225\230!\225\225^```^```^```^```^```^```^```^```\230!\225\225\230!\225\225^```^```^```^```^```^```^```^```\230!\225\225\230!\225\225^```^```^```^```^```^```^```^```\230!\225\225\230!\225\225^```^```^```^```^```^```^```^```\230!\225\225\230!\225\225^```^```^```^```^```^```^```^```\230!\225\225\230!\225\225^```^```^```^```^```^```^```^```!");
    }

    @Test
    public void test07159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07159");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0348\u0348\u01e0\u01e0\u01e0\u0348\u0348\u01e0\u01e0\u01e0\u0348\u0348\u01e0\u01e0\u01e0\u0348\u0348\u01e0\u01e0\u01e0\200\u0348\u0348\u01e0\u01e0\u01e0\u0348\u0348\u01e0\u01e0\u01e0\u0348\u0348\u01e0\u01e0\u01e0\u0348\u0348\u01e0\u01e0\u01e0]]!", "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~nullnullnull\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~nullnullnull]]!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~nullnullnull\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~nullnullnull]]!");
    }

    @Test
    public void test07160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07160");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d!", "UULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULLUULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull!" + "'", str2, "\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull!");
    }

    @Test
    public void test07161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07161");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!\200\200\u0346\u0348\u0348!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test07162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07162");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\253\254\256\256~`~~~`~~~`~~~`~~\253\254\256\256~`~~~`~~!", "\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256~`~~~`~~~`~~~`~~\253\254\256\256~`~~~`~~!" + "'", str2, "\253\254\256\256~`~~~`~~~`~~~`~~\253\254\256\256~`~~~`~~!");
    }

    @Test
    public void test07163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07163");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "RTTT\256\254\254RTTT\256\254\254!!RTTT\256\254\254RTTT\256\254\254!!RTTT\256\254\254RTTT\256\254\254!!RTTT\256\254\254RTTT\256\254\254!!RTTT\256\254\254RTTT\256\254\254!!RTTT\256\254\254RTTT\256\254\254!!RTTT\256\254\254RTTT\256\254\254!!RTTT\256\254\254RTTT\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07164");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\275``nullnull``nullnull``nullnull\276``nullnull\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test07165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07165");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("^```^```^```^```^```^```^```^```^```^```\253null\225\225\253null\225\225^```^```\253null\225\225\253null\225\225^```^```^```^```^```^```^```^```^```^```\253null\225\225\253null\225\225^```^```\253null\225\225\253null\225\225^```^```^```^```^```^```^```^```^```^```\253null\225\225\253null\225\225^```^```\253null\225\225\253null\225\225^```^```^```^```^```^```^```^```^```^```\253null\225\225\253null\225\225^```^```\253null\225\225\253null\225\225^```^```^```^```^```^```^```^```^```^```\253null\225\225\253null\225\225^```^```\253null\225\225\253null\225\225^```^```^```^```^```^```^```^```^```^```\253null\225\225\253null\225\225^```^```\253null\225\225\253null\225\225^```^```^```^```^```^```^```^```^```^```\253null\225\225\253null\225\225^```^```\253null\225\225\253null\225\225^```^```^```^```^```^```^```^```^```^```\253null\225\225\253null\225\225^```^```\253null\225\225\253null\225\225!", "L]LLL]LL!!L]LLL]LL!!L]LLL]LLL]LLL]LL!!L]LLL]LL!!L]LLL]LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```^```^```^```^```^```^```^```^```\253LL]]\225\225\253LL]]\225\225^```^```\253LL]]\225\225\253LL]]\225\225^```^```^```^```^```^```^```^```^```^```\253LL]]\225\225\253LL]]\225\225^```^```\253LL]]\225\225\253LL]]\225\225^```^```^```^```^```^```^```^```^```^```\253LL]]\225\225\253LL]]\225\225^```^```\253LL]]\225\225\253LL]]\225\225^```^```^```^```^```^```^```^```^```^```\253LL]]\225\225\253LL]]\225\225^```^```\253LL]]\225\225\253LL]]\225\225^```^```^```^```^```^```^```^```^```^```\253LL]]\225\225\253LL]]\225\225^```^```\253LL]]\225\225\253LL]]\225\225^```^```^```^```^```^```^```^```^```^```\253LL]]\225\225\253LL]]\225\225^```^```\253LL]]\225\225\253LL]]\225\225^```^```^```^```^```^```^```^```^```^```\253LL]]\225\225\253LL]]\225\225^```^```\253LL]]\225\225\253LL]]\225\225^```^```^```^```^```^```^```^```^```^```\253LL]]\225\225\253LL]]\225\225^```^```\253LL]]\225\225\253LL]]\225\225!" + "'", str2, "^```^```^```^```^```^```^```^```^```^```\253LL]]\225\225\253LL]]\225\225^```^```\253LL]]\225\225\253LL]]\225\225^```^```^```^```^```^```^```^```^```^```\253LL]]\225\225\253LL]]\225\225^```^```\253LL]]\225\225\253LL]]\225\225^```^```^```^```^```^```^```^```^```^```\253LL]]\225\225\253LL]]\225\225^```^```\253LL]]\225\225\253LL]]\225\225^```^```^```^```^```^```^```^```^```^```\253LL]]\225\225\253LL]]\225\225^```^```\253LL]]\225\225\253LL]]\225\225^```^```^```^```^```^```^```^```^```^```\253LL]]\225\225\253LL]]\225\225^```^```\253LL]]\225\225\253LL]]\225\225^```^```^```^```^```^```^```^```^```^```\253LL]]\225\225\253LL]]\225\225^```^```\253LL]]\225\225\253LL]]\225\225^```^```^```^```^```^```^```^```^```^```\253LL]]\225\225\253LL]]\225\225^```^```\253LL]]\225\225\253LL]]\225\225^```^```^```^```^```^```^```^```^```^```\253LL]]\225\225\253LL]]\225\225^```^```\253LL]]\225\225\253LL]]\225\225!");
    }

    @Test
    public void test07166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07166");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!", "nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!" + "'", str2, "!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!");
    }

    @Test
    public void test07167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07167");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\223]\223\223\223]\223\223!!\223]\223\223\223]\223\223!!\223]\223\223\223]\223\223\223]\223\223\223]\223\223!!\223]\223\223\223]\223\223!!\223]\223\223\223]\223\223!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test07168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07168");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!nullnullnullnullnullnull!!nullnull!!!!!!!!!", "I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!III!III!III!III!III!III!!!III!III!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!!!" + "'", str2, "!III!III!III!III!III!III!!!III!III!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!!!");
    }

    @Test
    public void test07169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07169");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230\200}}`L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]L]]]\225\230\230]]!", "`LLUULLUULLUU`LLUULLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]\225\230\230X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]\225\230\230X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]\225\230\230X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]\225\230\230\200}}`X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]\225\230\230X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]\225\230\230X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]\225\230\230X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]\225\230\230]]!" + "'", str2, "X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]\225\230\230X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]\225\230\230X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]\225\230\230X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]\225\230\230\200}}`X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]\225\230\230X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]\225\230\230X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]\225\230\230X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]X]]]\225\230\230]]!");
    }

    @Test
    public void test07170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07170");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!", "UULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188!" + "'", str2, "\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188!");
    }

    @Test
    public void test07171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07171");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!XWZZXWZZ!!!", "\276\276PPNNPPNNPPNNPPNN\276PPNNPPNNPPNNPPNNPPNNPPNN\276PPNNPPNN\276\276PPNNPPNNPPNNPPNN\276PPNNPPNNPPNNPPNNPPNNPPNN\276PPNNPPNN\276\276PPNNPPNNPPNNPPNN\276PPNNPPNNPPNNPPNNPPNNPPNN\276PPNNPPNN\276\276PPNNPPNNPPNNPPNN\276PPNNPPNNPPNNPPNNPPNNPPNN\276PPNNPPNN\276\276PPNNPPNNPPNNPPNN\276PPNNPPNNPPNNPPNNPPNNPPNN\276PPNNPPNN\276\276PPNNPPNNPPNNPPNN\276PPNNPPNNPPNNPPNNPPNNPPNN\276PPNNPPNN\276\276PPNNPPNNPPNNPPNN\276PPNNPPNNPPNNPPNNPPNNPPNN\276PPNNPPNN\276\276PPNNPPNNPPNNPPNN\276PPNNPPNNPPNNPPNNPPNNPPNN\276PPNNPPNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test07172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07172");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!", "U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!" + "'", str2, "!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!");
    }

    @Test
    public void test07173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07173");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU!!]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU!!]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU!!]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU!!]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU!", "\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull!!]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull!!]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull!!]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull!!]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull!" + "'", str2, "]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull!!]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull!!]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull!!]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull!!]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull!");
    }

    @Test
    public void test07174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07174");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276\276\275\275\275\275\276\276!", "~}\200\200~}\200\200HHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHH~}\200\200~}\200\200HHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHH~}\200\200~}\200\200HHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHH~}\200\200~}\200\200HHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHH~}\200\200~}\200\200HHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHH~}\200\200~}\200\200HHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHH~}\200\200~}\200\200HHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHH~}\200\200~}\200\200HHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276\275\275\275\275\276\276!" + "'", str2, "\276\276\275\275\275\275\276\276!");
    }

    @Test
    public void test07175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07175");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!~UU!~UU\220\220!~UU!~UU\220\220\220!~UU\220\220\220!~UU\220\220\220!~UU\220\220\220!~UU\220\220!~UU!~UU\220\220!~UU!~UU\220\220!", "~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL~}\200\200~}\200\200UNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULLUNLL!UNLLUNLLUNLL!UNLLUNLLNULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~LL!~LL\220\220!~LL!~LL\220\220\220!~LL\220\220\220!~LL\220\220\220!~LL\220\220\220!~LL\220\220!~LL!~LL\220\220!~LL!~LL\220\220!" + "'", str2, "!~LL!~LL\220\220!~LL!~LL\220\220\220!~LL\220\220\220!~LL\220\220\220!~LL\220\220\220!~LL\220\220!~LL!~LL\220\220!~LL!~LL\220\220!");
    }

    @Test
    public void test07176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07176");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!", "!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~]]!~]]!!!~]]!~]]!!!~]]!~]]!~]]!~]]!!!~]]!~]]!!!~]]!~]]!" + "'", str2, "!~]]!~]]!!!~]]!~]]!!!~]]!~]]!~]]!~]]!!!~]]!~]]!!!~]]!~]]!");
    }

    @Test
    public void test07177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07177");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276\276\276\276\365\366\370\370\365\366\370\370\365\366\370\370\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\365\366\370\370\365\366\370\370\365\366\370\370\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!", "~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276\276\276NLLLNLLLNLLL\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276NLLLNLLLNLLL\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!" + "'", str2, "\276\276\276\276NLLLNLLLNLLL\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276NLLLNLLLNLLL\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!");
    }

    @Test
    public void test07178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07178");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull``!nullnull``nullnull``nullnull``!nullnull``nullnull``nullnull``!nullnull``nullnull``nullnull``!nullnull``nullnull``nullnull``!nullnull``nullnull``nullnull``!nullnull``nullnull``nullnull``!nullnull``nullnull``nullnull``!nullnull``nullnull``!", "\u014f\u014f\u014f\u014f!uu!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u!!!u!!!``!u!!!u!!!``u!!!u!!!``u!!!u!!!``!u!!!u!!!``u!!!u!!!``u!!!u!!!``!u!!!u!!!``u!!!u!!!``u!!!u!!!``!u!!!u!!!``u!!!u!!!``u!!!u!!!``!u!!!u!!!``u!!!u!!!``u!!!u!!!``!u!!!u!!!``u!!!u!!!``u!!!u!!!``!u!!!u!!!``u!!!u!!!``u!!!u!!!``!u!!!u!!!``u!!!u!!!``!" + "'", str2, "u!!!u!!!``!u!!!u!!!``u!!!u!!!``u!!!u!!!``!u!!!u!!!``u!!!u!!!``u!!!u!!!``!u!!!u!!!``u!!!u!!!``u!!!u!!!``!u!!!u!!!``u!!!u!!!``u!!!u!!!``!u!!!u!!!``u!!!u!!!``u!!!u!!!``!u!!!u!!!``u!!!u!!!``u!!!u!!!``!u!!!u!!!``u!!!u!!!``u!!!u!!!``!u!!!u!!!``u!!!u!!!``!");
    }

    @Test
    public void test07179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07179");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200null^nullnullnull^nullnull}~\200\200}~\200\200null^nullnullnull^nullnull!", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200nullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnull!" + "'", str2, "}~\200\200}~\200\200nullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07180");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254!", "\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254!" + "'", str2, "\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254!");
    }

    @Test
    public void test07181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07181");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\260\260nullnull\260\260nullnull}}\260\260nullnull\260\260nullnull}}!", "nullnullnullnullnullnullnullnull!!BB!!BBnullnullnullnullnullnullnullnull!!BB!!BBnullnullnullnullnullnullnullnull!!BB!!BBnullnullnullnullnullnullnullnull!!BB!!BBnullnullnullnullnullnullnullnull!!BB!!BBnullnullnullnullnullnullnullnull!!BB!!BBnullnullnullnullnullnullnullnull!!BB!!BBnullnullnullnullnullnullnullnull!!BB!!BB!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\260\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\260\260\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198}}\260\260\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\260\260\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198}}!" + "'", str2, "\260\260\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\260\260\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198}}\260\260\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\260\260\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198}}!");
    }

    @Test
    public void test07182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07182");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!", "!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!" + "'", str2, "\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!");
    }

    @Test
    public void test07183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07183");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("L\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLL!", "``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!!``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!!``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!!``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!!``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLL!" + "'", str2, "L\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLL!");
    }

    @Test
    public void test07184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07184");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!~}}^``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!]]!", "\275UUU\275UUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!~}}^``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!]]!" + "'", str2, "``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!~}}^``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!]]!");
    }

    @Test
    public void test07185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07185");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!", "!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test07186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07186");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnull!!!nullnullnullnull!!!!", "l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}!!\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}!!\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}!!\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}!!\200null}}\200null}}\200null}}\200null}}!!!\200null}}\200null}}\200null}}\200null}}!!!\200null}}\200null}}\200null}}\200null}}!!!\200null}}\200null}}\200null}}\200null}}!!!\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}!!\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}!!\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}!!\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}!!\200null}}\200null}}\200null}}\200null}}!!!\200null}}\200null}}\200null}}\200null}}!!!!" + "'", str2, "\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}!!\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}!!\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}!!\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}!!\200null}}\200null}}\200null}}\200null}}!!!\200null}}\200null}}\200null}}\200null}}!!!\200null}}\200null}}\200null}}\200null}}!!!\200null}}\200null}}\200null}}\200null}}!!!\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}!!\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}!!\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}!!\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}!!\200null}}\200null}}\200null}}\200null}}!!!\200null}}\200null}}\200null}}\200null}}!!!!");
    }

    @Test
    public void test07187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07187");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de!", "^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07188");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "!nullnullnullnullnull\230\230nullnull\230\230nullnull\230\230nullnull\230\230!nullnullnullnullnull\230\230nullnull\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07189");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^~~~~~~~~LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^~~~~~~~~!!LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^~~~~~~~~LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^~~~~~~~~!!LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^~~~~~~~~LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^~~~~~~~~LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^~~~~~~~~LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^~~~~~~~~!!LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^~~~~~~~~LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^~~~~~~~~!!LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^~~~~~~~~LL^^LL^^LL^^LL^^LL^^LL^^LL^^LL^^~~~~~~~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07190");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\254\254\200LLL\200LLL\254\254\200LLL\200LLL\254\254\200LLL\200LLL\254\254\200LLL\200LLL\254\254\200LLL\200LLL\254\254\200LLL\200LLL\254\254\200LLL\200LLL\254\254\200LLL\200LLL!", "\275HHH\276H\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\254\254\200nullnullnull\200nullnullnull\254\254\200nullnullnull\200nullnullnull\254\254\200nullnullnull\200nullnullnull\254\254\200nullnullnull\200nullnullnull\254\254\200nullnullnull\200nullnullnull\254\254\200nullnullnull\200nullnullnull\254\254\200nullnullnull\200nullnullnull\254\254\200nullnullnull\200nullnullnull!" + "'", str2, "\254\254\200nullnullnull\200nullnullnull\254\254\200nullnullnull\200nullnullnull\254\254\200nullnullnull\200nullnullnull\254\254\200nullnullnull\200nullnullnull\254\254\200nullnullnull\200nullnullnull\254\254\200nullnullnull\200nullnullnull\254\254\200nullnullnull\200nullnullnull\254\254\200nullnullnull\200nullnullnull!");
    }

    @Test
    public void test07191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07191");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("fehhfehh!", "LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226!!LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07192");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\230\226\256!nullnull\256!nullnull\236\276\276\230\226\256!nullnull\256!nullnull\236\276\276!!\230\226\256!nullnull\256!nullnull\236\276\276\230\226\256!nullnull\256!nullnull\236\276\276!!\230\226\256!nullnull\256!nullnull\236\276\276\230\226\256!nullnull\256!nullnull\236\276\276\230\226\256!nullnull\256!nullnull\236\276\276\230\226\256!nullnull\256!nullnull\236\276\276!!\230\226\256!nullnull\256!nullnull\236\276\276\230\226\256!nullnull\256!nullnull\236\276\276!!\230\226\256!nullnull\256!nullnull\236\276\276\230\226\256!nullnull\256!nullnull\236\276\276!", "UNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNN!!UNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNN!!UNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNN!!UNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNN!!UNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276!!\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276!!\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276!!\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276!!\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276!" + "'", str2, "\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276!!\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276!!\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276!!\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276!!\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276!");
    }

    @Test
    public void test07193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07193");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!", "}~\200\200}~\200\200\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242}~\200\200}~\200\200\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07194");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}}}}}}}}!!!!}}}}}}}}!", "!!!!!!!!!!!!!!!!\200}}`!!!!!!!!!!!!!!!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}}}}}}}}!!!!}}}}}}}}!" + "'", str2, "}}}}}}}}!!!!}}}}}}}}!");
    }

    @Test
    public void test07195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07195");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0240\u0240!", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UU]]UU]]\276\276UU]]UU]]\276\276\253\253UU]]UU]]\276\276UU]]UU]]\276\276\253\253UU]]UU]]\276\276UU]]UU]]\276\276\253\253UU]]UU]]\276\276UU]]UU]]\276\276\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UU]]UU]]\276\276UU]]UU]]\276\276\253\253UU]]UU]]\276\276UU]]UU]]\276\276\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!" + "'", str2, "nullnull!");
    }

    @Test
    public void test07196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07196");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!", "ijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnullijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnull!!ijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnullijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnull!!ijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnullijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnullijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnullijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnull!!ijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnullijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnull!!ijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnullijll\220nullnull\200~~ijll\220nullnull\200~~ijll\220nullnullijll\220nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!" + "'", str2, "\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!");
    }

    @Test
    public void test07197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07197");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("N!LLL!LLL!LLLN!LLL!LLL!LLLN!LLL!LLL!LLLN!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLLN!LLL!LLL!LLLN!LLL!LLL!LLLN!LLL!LLL!LLLN!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!", "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da!" + "'", str2, "\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da!");
    }

    @Test
    public void test07198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07198");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!", "nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!!!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!!!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!!!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!!!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!" + "'", str2, "!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!!!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!!!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!!!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!!!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!");
    }

    @Test
    public void test07199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07199");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UNLLUNLL\253\253UNLLUNLL\253\253UNLLUNLL\253\253UNLLUNLL\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UNLLUNLL\253\253UNLLUNLL\253\253!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnull!!nullnull!!\253\253nullnull!!nullnull!!\253\253nullnull!!nullnull!!\253\253nullnull!!nullnull!!\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnull!!nullnull!!\253\253nullnull!!nullnull!!\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnull!!nullnull!!\253\253nullnull!!nullnull!!\253\253nullnull!!nullnull!!\253\253nullnull!!nullnull!!\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnull!!nullnull!!\253\253nullnull!!nullnull!!\253\253!");
    }

    @Test
    public void test07200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07200");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!III!III!III!III!III!III!!!III!III!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!III!III!III!III!III!III!!!III!III!!!!!!!!!", "\u0123\u0124\u0126\u0126\u0123\u0124\u0126\u0126nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!!!" + "'", str2, "!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!!!");
    }

    @Test
    public void test07201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07201");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e!", "null\225\230\230null\225\230\230null\225\230\230null\225\230\230\200}}`null\225\230\230null\225\230\230null\225\230\230null\225\230\230]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225nullnullnullnullnullnullnullnull!" + "'", str2, "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07202");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljjnullnulljj!", "\u0348null!!\200\u0348null!!]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnull!" + "'", str2, "mnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnullmnppmnppnullnull!");
    }

    @Test
    public void test07203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07203");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!!!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!!!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!!!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!!!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!U!!!U!!UU~!U!!!U!!UU!U!!!U!!UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07204");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!!", "nullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunll!!nullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunll!!nullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunll!!nullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunll!!nullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNLLNNLL!!!!NNNNNNLLNNLL!!!!!!NNNNNNLLNNLL!!!!NNNNNNLLNNLL!!!!!!NNNNNNLLNNLL!!!!NNNNNNLLNNLL!!!!!!NNNNNNLLNNLL!!!!NNNNNNLLNNLL!!!!!!NNNNNNLLNNLL!!!!NNNNNNLLNNLL!!!!!!NNNNNNLLNNLL!!!!NNNNNNLLNNLL!!!!!!NNNNNNLLNNLL!!!!NNNNNNLLNNLL!!!!!!NNNNNNLLNNLL!!!!NNNNNNLLNNLL!!!!!!!" + "'", str2, "NNNNNNLLNNLL!!!!NNNNNNLLNNLL!!!!!!NNNNNNLLNNLL!!!!NNNNNNLLNNLL!!!!!!NNNNNNLLNNLL!!!!NNNNNNLLNNLL!!!!!!NNNNNNLLNNLL!!!!NNNNNNLLNNLL!!!!!!NNNNNNLLNNLL!!!!NNNNNNLLNNLL!!!!!!NNNNNNLLNNLL!!!!NNNNNNLLNNLL!!!!!!NNNNNNLLNNLL!!!!NNNNNNLLNNLL!!!!!!NNNNNNLLNNLL!!!!NNNNNNLLNNLL!!!!!!!");
    }

    @Test
    public void test07205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07205");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!!", "\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276!!\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276!!\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276!!\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276!!\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276\230\226E\275!!BE\275!!E\275!!E\275!!BE\275!!E\275!!\236\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\275\275\275!!\275\275\275!\275\275\275!\275\275\275!!\275\275\275!\275\275\275!!!\275\275\275!!\275\275\275!\275\275\275!\275\275\275!!\275\275\275!\275\275\275!!!" + "'", str2, "!\275\275\275!!\275\275\275!\275\275\275!\275\275\275!!\275\275\275!\275\275\275!!!\275\275\275!!\275\275\275!\275\275\275!\275\275\275!!\275\275\275!\275\275\275!!!");
    }

    @Test
    public void test07206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07206");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLUULNUULNUULNUULLUULNUULNUULNUULLUULNUULNUULNUULLUULNUULNUULNUULLUULNUULNUULNUULLUULNUULNUULNUULLUULNUULNUULNUULLUULNUULNUULNUU!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0198\u0198\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0198\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0198\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0198\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0198\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0198\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0198\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0198\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196!" + "'", str2, "\u0198\u0198\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0198\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0198\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0198\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0198\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0198\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0198\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0198\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196\u0198\u0195\u0196\u0196!");
    }

    @Test
    public void test07207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07207");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300!", "\u0366\u0365\u0368\u0368L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253L!\253\253\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300!" + "'", str2, "\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300!");
    }

    @Test
    public void test07208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07208");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348!", "\230\226L!UUL!UU\236\276\276\230\226L!UUL!UU\236\276\276!!\230\226L!UUL!UU\236\276\276\230\226L!UUL!UU\236\276\276!!\230\226L!UUL!UU\236\276\276\230\226L!UUL!UU\236\276\276\230\226L!UUL!UU\236\276\276\230\226L!UUL!UU\236\276\276!!\230\226L!UUL!UU\236\276\276\230\226L!UUL!UU\236\276\276!!\230\226L!UUL!UU\236\276\276\230\226L!UUL!UU\236\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348!" + "'", str2, "\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348!");
    }

    @Test
    public void test07209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07209");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248!", "nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226!!nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226nullnull!!\230\226\226!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNnullnullnullnullnullnullnullnullLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNnullnullnullnullnullnullnullnullLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNnullnullnullnullnullnullnullnullLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNnullnullnullnullnullnullnullnullLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNnullnullnullnullnullnullnullnullLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNnullnullnullnullnullnullnullnullLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNnullnullnullnullnullnullnullnullLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNnullnullnullnullnullnullnullnull!" + "'", str2, "LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNnullnullnullnullnullnullnullnullLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNnullnullnullnullnullnullnullnullLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNnullnullnullnullnullnullnullnullLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNnullnullnullnullnullnullnullnullLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNnullnullnullnullnullnullnullnullLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNnullnullnullnullnullnullnullnullLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNnullnullnullnullnullnullnullnullLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07210");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\253\254\256\256\366\367\371\371\366\367\371\371\366\367\371\371\366\367\371\371\253\254\256\256\366\367\371\371\366\367\371\371!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256null\367nullnullnull\367nullnullnull\367nullnullnull\367nullnull\253\254\256\256null\367nullnullnull\367nullnull!" + "'", str2, "\253\254\256\256null\367nullnullnull\367nullnullnull\367nullnullnull\367nullnull\253\254\256\256null\367nullnullnull\367nullnull!");
    }

    @Test
    public void test07211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07211");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108!", "NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07212");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\253\253\253!\253\253\253!\253\253\253!\253\253\253\200}}`!\253\253\253!\253\253\253!\253\253\253!\253\253\253]]!", "~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\253\253!\253\253\253!\253\253\253!\253\253\253\200}}`!\253\253\253!\253\253\253!\253\253\253!\253\253\253]]!" + "'", str2, "!\253\253\253!\253\253\253!\253\253\253!\253\253\253\200}}`!\253\253\253!\253\253\253!\253\253\253!\253\253\253]]!");
    }

    @Test
    public void test07213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07213");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368nullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07214");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!!J\220II\200~~J\220II\200~~J\220IIJ\220IIJ\220II\200~~J\220II\200~~J\220IIJ\220II!", "\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!" + "'", str2, "null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!");
    }

    @Test
    public void test07215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07215");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321!", "`LLUULLUULLUU`LLUULLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull!" + "'", str2, "`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull!");
    }

    @Test
    public void test07216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07216");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200!~!!!!!^!~!!!!!!~!!!!!!~!!!!!^!~!!!!!!~!!!!!}~\200\200}~\200\200!~!!!!!^!~!!!!!!~!!!!!!~!!!!!^!~!!!!!!~!!!!!!", "\227nullnullnullnullnullnull\227nullnullnull\227nullnullnull\227nullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnull\227nullnullnull\227nullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200!~!!!!!^!~!!!!!!~!!!!!!~!!!!!^!~!!!!!!~!!!!!}~\200\200}~\200\200!~!!!!!^!~!!!!!!~!!!!!!~!!!!!^!~!!!!!!~!!!!!!" + "'", str2, "}~\200\200}~\200\200!~!!!!!^!~!!!!!!~!!!!!!~!!!!!^!~!!!!!!~!!!!!}~\200\200}~\200\200!~!!!!!^!~!!!!!!~!!!!!!~!!!!!^!~!!!!!!~!!!!!!");
    }

    @Test
    public void test07217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07217");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLUUUUULLUUUUUUULLUUUUULLUUUUUUULLUUUUULLUUUUUUULLUUUUULLUUUUUUULLUUUUULLUUUUUUULLUUUUULLUUUUUUULLUUUUULLUUUUUUULLUUUUULLUUUUUUU!", "\253\254\256\256~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200\253\254\256\256~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL~~~~~LL~~~~~~~LL~~~~~LL~~~~~~~LL~~~~~LL~~~~~~~LL~~~~~LL~~~~~~~LL~~~~~LL~~~~~~~LL~~~~~LL~~~~~~~LL~~~~~LL~~~~~~~LL~~~~~LL~~~~~~~!" + "'", str2, "LL~~~~~LL~~~~~~~LL~~~~~LL~~~~~~~LL~~~~~LL~~~~~~~LL~~~~~LL~~~~~~~LL~~~~~LL~~~~~~~LL~~~~~LL~~~~~~~LL~~~~~LL~~~~~~~LL~~~~~LL~~~~~~~!");
    }

    @Test
    public void test07218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07218");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test07219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07219");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\230\226L!UUL!UU\236\276\276\230\226L!UUL!UU\236\276\276!!\230\226L!UUL!UU\236\276\276\230\226L!UUL!UU\236\276\276!!\230\226L!UUL!UU\236\276\276\230\226L!UUL!UU\236\276\276\230\226L!UUL!UU\236\276\276\230\226L!UUL!UU\236\276\276!!\230\226L!UUL!UU\236\276\276\230\226L!UUL!UU\236\276\276!!\230\226L!UUL!UU\236\276\276\230\226L!UUL!UU\236\276\276!", "\u0366\u0365\u0368\u0368\u0123\u0124\u0126\u0126\213\213\213\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\226\u0346\u0346!nullnull\236\276\276\230\226\u0346\u0346!nullnull\236\276\276!!\230\226\u0346\u0346!nullnull\236\276\276\230\226\u0346\u0346!nullnull\236\276\276!!\230\226\u0346\u0346!nullnull\236\276\276\230\226\u0346\u0346!nullnull\236\276\276\230\226\u0346\u0346!nullnull\236\276\276\230\226\u0346\u0346!nullnull\236\276\276!!\230\226\u0346\u0346!nullnull\236\276\276\230\226\u0346\u0346!nullnull\236\276\276!!\230\226\u0346\u0346!nullnull\236\276\276\230\226\u0346\u0346!nullnull\236\276\276!" + "'", str2, "\230\226\u0346\u0346!nullnull\236\276\276\230\226\u0346\u0346!nullnull\236\276\276!!\230\226\u0346\u0346!nullnull\236\276\276\230\226\u0346\u0346!nullnull\236\276\276!!\230\226\u0346\u0346!nullnull\236\276\276\230\226\u0346\u0346!nullnull\236\276\276\230\226\u0346\u0346!nullnull\236\276\276\230\226\u0346\u0346!nullnull\236\276\276!!\230\226\u0346\u0346!nullnull\236\276\276\230\226\u0346\u0346!nullnull\236\276\276!!\230\226\u0346\u0346!nullnull\236\276\276\230\226\u0346\u0346!nullnull\236\276\276!");
    }

    @Test
    public void test07220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07220");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("HHHHHHHHHHHHHHHH\200}}`HHHHHHHHHHHHHHHH]]!", "LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test07221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07221");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e!", "NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull!" + "'", str2, "\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull!");
    }

    @Test
    public void test07222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07222");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07223");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NnullnullnullNnullnullnullNnullnullnullNnullnullnull\200}}`NnullnullnullNnullnullnullNnullnullnullNnullnullnull]]!", "LL!!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullffnullnullffnullnullffnullnullnullffnullnullffnullnullffnullnullnullffnullnullffnullnullffnullnullnullffnullnullffnullnullff\200}}`nullnullnullffnullnullffnullnullffnullnullnullffnullnullffnullnullffnullnullnullffnullnullffnullnullffnullnullnullffnullnullffnullnullff]]!" + "'", str2, "nullnullnullffnullnullffnullnullffnullnullnullffnullnullffnullnullffnullnullnullffnullnullffnullnullffnullnullnullffnullnullffnullnullff\200}}`nullnullnullffnullnullffnullnullffnullnullnullffnullnullffnullnullffnullnullnullffnullnullffnullnullffnullnullnullffnullnullffnullnullff]]!");
    }

    @Test
    public void test07224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07224");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL!", "\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull!" + "'", str2, "~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07225");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnull!", "UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e!" + "'", str2, "\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e!\275\275\u010a\u0109\u010e\u010e\u010a\u0109\u010e\u010e!");
    }

    @Test
    public void test07226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07226");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull\200}}`nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull]]!", "\275nullnullnull\276null\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!ll\276!ll\276!ll\276!ll!\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll!\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll!\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll!\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\200}}`\276!ll\276!ll\276!ll\276!ll!\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll!\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll!\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll!\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll]]!" + "'", str2, "\276!ll\276!ll\276!ll\276!ll!\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll!\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll!\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll!\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\200}}`\276!ll\276!ll\276!ll\276!ll!\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll!\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll!\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll!\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll]]!");
    }

    @Test
    public void test07227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07227");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4!!!", "\275!!!\275!!!\275!!!\275!!!!!\275\275!!\275\275!!\275\275!!\275\275\275!!!\275!!!\275!!!\275!!!!!\275\275!!\275\275!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test07228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07228");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\275!UUU!UUU!UUU\276!UUU\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07229");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNN!", "\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07230");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!", "\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031anullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!" + "'", str2, "}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!");
    }

    @Test
    public void test07231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07231");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\276!\225\225\276!\225\225\200\200\276!\225\225\276!\225\225\200\200\276!\225\225\276!\225\225\200\200\276\276!\225\225\276!\225\225\200\200\275\275!", "hhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276!\225\225\276!\225\225\200\200\276!\225\225\276!\225\225\200\200\276!\225\225\276!\225\225\200\200\276\276!\225\225\276!\225\225\200\200\275\275!" + "'", str2, "\275\276!\225\225\276!\225\225\200\200\276!\225\225\276!\225\225\200\200\276!\225\225\276!\225\225\200\200\276\276!\225\225\276!\225\225\200\200\275\275!");
    }

    @Test
    public void test07232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07232");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248!", "````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````\275````````````\275````````````\275````````````\275````````````\275````````````\275````````````\275````````````\275````````````````````````````````````````````\275````````````\275````````````\275````````````\275````````````\275````````````\275````````````\275````````````\275````````````````````````````````````````!" + "'", str2, "````\275````````````\275````````````\275````````````\275````````````\275````````````\275````````````\275````````````\275````````````````````````````````````````````\275````````````\275````````````\275````````````\275````````````\275````````````\275````````````\275````````````\275````````````````````````````````````````!");
    }

    @Test
    public void test07233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07233");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016eUU!!!!!!!", "NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "N````null```null``!!!!N````null```null``!!!!!!N````null```null``!!!!N````null```null``!!!!!!N````null```null``!!!!N````null```null``!!!!!!N````null```null``!!!!N````null```null``!!!!!!N````null```null``!!!!N````null```null``!!!!!!N````null```null``!!!!N````null```null``!!!!!!N````null```null``!!!!N````null```null``!!!!!!N````null```null``!!!!N````null```null``!!!!!!!" + "'", str2, "N````null```null``!!!!N````null```null``!!!!!!N````null```null``!!!!N````null```null``!!!!!!N````null```null``!!!!N````null```null``!!!!!!N````null```null``!!!!N````null```null``!!!!!!N````null```null``!!!!N````null```null``!!!!!!N````null```null``!!!!N````null```null``!!!!!!N````null```null``!!!!N````null```null``!!!!!!N````null```null``!!!!N````null```null``!!!!!!!");
    }

    @Test
    public void test07234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07234");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!", "\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!" + "'", str2, "\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!");
    }

    @Test
    public void test07235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07235");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test07236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07236");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]^``]^``!!]^``]^``!!]^``]^``]^``]^``!!]^``]^``!!]^``]^``!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]^``]^``!!]^``]^``!!]^``]^``]^``]^``!!]^``]^``!!]^``]^``!" + "'", str2, "]^``]^``!!]^``]^``!!]^``]^``]^``]^``!!]^``]^``!!]^``]^``!");
    }

    @Test
    public void test07237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07237");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test07238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07238");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("OOOOOOOO\214\214OOOOOOOO\214\214OOOOOOOO\214\214OOOOOOOO\214\214OOOOOOOO\214\214OOOOOOOO\214\214OOOOOOOO\214\214OOOOOOOO\214\214!", "\335\336\336\336\335\336\336\336!!\335\336\336\336\335\336\336\336!!\335\336\336\336\335\336\336\336!!\335\336\336\336\335\336\336\336!!\335\336\336\336\335\336\336\336!!\335\336\336\336\335\336\336\336!!\335\336\336\336\335\336\336\336!!\335\336\336\336\335\336\336\336!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\335\335\335\335\335\335\335\335\214\214\335\335\335\335\335\335\335\335\214\214\335\335\335\335\335\335\335\335\214\214\335\335\335\335\335\335\335\335\214\214\335\335\335\335\335\335\335\335\214\214\335\335\335\335\335\335\335\335\214\214\335\335\335\335\335\335\335\335\214\214\335\335\335\335\335\335\335\335\214\214!" + "'", str2, "\335\335\335\335\335\335\335\335\214\214\335\335\335\335\335\335\335\335\214\214\335\335\335\335\335\335\335\335\214\214\335\335\335\335\335\335\335\335\214\214\335\335\335\335\335\335\335\335\214\214\335\335\335\335\335\335\335\335\214\214\335\335\335\335\335\335\335\335\214\214\335\335\335\335\335\335\335\335\214\214!");
    }

    @Test
    public void test07239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07239");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\216\216\216!\216\216\216!", "\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\216\216\216!\216\216\216!" + "'", str2, "!\216\216\216!\216\216\216!");
    }

    @Test
    public void test07240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07240");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!~ULLLULLL!!!!~ULLLULLL!!!!!!~ULLLULLL!!!!~ULLLULLL!!!!!!~ULLLULLL!!!!~ULLLULLL!!!!~ULLLULLL!!!!~ULLLULLL!!!!!!~ULLLULLL!!!!~ULLLULLL!!!!!!~ULLLULLL!!!!~ULLLULLL!!!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!" + "'", str2, "!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test07241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07241");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\253\254\256\256L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\253\254\256\256L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!", "\u03dd\u03de\u03e0\u03e0nullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\253\254\256\256L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!" + "'", str2, "\253\254\256\256L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\253\254\256\256L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!");
    }

    @Test
    public void test07242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07242");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\275\u01ae\u01ad\u01b0\u01b0\u01ae\u01ad\u01b0\u01b0\u01ae\u01ad\u01b0\u01b0\276\u01ae\u01ad\u01b0\u01b0\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07243");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "}~\200\200}~\200\200UN!!!N!!!N!!!N!!^UN!!!N!!!N!!!N!!UN!!!N!!!N!!!N!!UN!!!N!!!N!!!N!!^UN!!!N!!!N!!!N!!UN!!!N!!!N!!!N!!}~\200\200}~\200\200UN!!!N!!!N!!!N!!^UN!!!N!!!N!!!N!!UN!!!N!!!N!!!N!!UN!!!N!!!N!!!N!!^UN!!!N!!!N!!!N!!UN!!!N!!!N!!!N!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07244");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}T!!!\200\200}T!!!\200\200}T!!!\200\200}T!!!\200\200T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~}T!!!\200\200}T!!!\200\200}T!!!\200\200}T!!!\200\200T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}null!!!\200\200}null!!!\200\200}null!!!\200\200}null!!!\200\200null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~}null!!!\200\200}null!!!\200\200}null!!!\200\200}null!!!\200\200null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~!" + "'", str2, "}null!!!\200\200}null!!!\200\200}null!!!\200\200}null!!!\200\200null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~}null!!!\200\200}null!!!\200\200}null!!!\200\200}null!!!\200\200null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~!");
    }

    @Test
    public void test07245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07245");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253FFFFFFFF\253\253FFFFFFFF\253\253FFFFFFFF\253\253FFFFFFFF\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253FFFFFFFF\253\253FFFFFFFF\253\253!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253!");
    }

    @Test
    public void test07246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07246");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "}~\200\200}~\200\200NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN}~\200\200}~\200\200NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0346\u0348\u0348!");
    }

    @Test
    public void test07247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07247");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a!", "nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aanullnull!" + "'", str2, "\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aa\u03a7\u03a8\u03aa\u03aanullnull!");
    }

    @Test
    public void test07248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07248");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!!", "!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test07249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07249");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07250");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("JLLL\200}}`JLLL]]!", "UNUNNNNUNUNNNN\225\225UNUNNNNUNUNNNN\225\225UNUNNNNUNUNNNN\225\225UNUNNNNUNUNNNN\225\225UNUNNNNUNUNNNN\225\225UNUNNNNUNUNNNN\225\225UNUNNNNUNUNNNN\225\225UNUNNNNUNUNNNN\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNNN\200}}`UNNN]]!" + "'", str2, "UNNN\200}}`UNNN]]!");
    }

    @Test
    public void test07251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07251");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullCCCnullCCCnullCCCnullCCC\200}}`nullCCCnullCCCnullCCCnullCCC]]!", "IJLLIJLL!!IJLLIJLL!!IJLLIJLLIJLLIJLL!!IJLLIJLL!!IJLLIJLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LIJJLLLLIJJLLLLIJJLLLLIJJLLL\200}}`LIJJLLLLIJJLLLLIJJLLLLIJJLLL]]!" + "'", str2, "LIJJLLLLIJJLLLLIJJLLLLIJJLLL\200}}`LIJJLLLLIJJLLLLIJJLLLLIJJLLL]]!");
    }

    @Test
    public void test07252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07252");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!~NN!~NN!~NN!~NN!~NN!~NN!~NN!~NN\276\276\266\266\276\276\266\266!~NN!~NN!~NN!~NN!~NN!~NN!~NN!~NN\276\276\266\266\276\276\266\266!~NN!~NN!~NN!~NN!~NN!~NN!~NN!~NN\276\276\266\266\276\276\266\266!~NN!~NN!~NN!~NN!~NN!~NN!~NN!~NN\276\276\266\266\276\276\266\266!~NN!~NN!~NN!~NN!~NN!~NN!~NN!~NN\276\276\266\266\276\276\266\266!~NN!~NN!~NN!~NN!~NN!~NN!~NN!~NN\276\276\266\266\276\276\266\266!~NN!~NN!~NN!~NN!~NN!~NN!~NN!~NN\276\276\266\266\276\276\266\266!~NN!~NN!~NN!~NN!~NN!~NN!~NN!~NN\276\276\266\266\276\276\266\266!", "\276\276\276\276\365\366\370\370\365\366\370\370\365\366\370\370\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\365\366\370\370\365\366\370\370\365\366\370\370\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!" + "'", str2, "!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!");
    }

    @Test
    public void test07253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07253");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07254");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnull~}}^nullnullnullnull]]!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}}^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}}^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test07255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07255");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("ULNNULNNULNNULNNULNNULNNULNNULNN!!ULNNULNNULNNULNNULNNULNNULNNULNN!!ULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNN!!ULNNULNNULNNULNNULNNULNNULNNULNN!!ULNNULNNULNNULNNULNNULNNULNNULNN!", "\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07256");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\276nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\275\275!", "\275UUU\275UUU\275UUU\275UUU\275UUU\275UUU\275UUU\275UUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275u\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uu\276u\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uu\275\275!" + "'", str2, "\275u\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uu\276u\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uuu\275uu\275\275!");
    }

    @Test
    public void test07257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07257");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```!", "~}\200\200~}\200\200\u01a0\u01a0nullnull\230\230\u01a0\u01a0nullnull\230\230~}\200\200~}\200\200\u01a0\u01a0nullnull\230\230\u01a0\u01a0nullnull\230\230~}\200\200~}\200\200\u01a0\u01a0nullnull\230\230\u01a0\u01a0nullnull\230\230~}\200\200~}\200\200\u01a0\u01a0nullnull\230\230\u01a0\u01a0nullnull\230\230~}\200\200~}\200\200\u01a0\u01a0nullnull\230\230\u01a0\u01a0nullnull\230\230~}\200\200~}\200\200\u01a0\u01a0nullnull\230\230\u01a0\u01a0nullnull\230\230~}\200\200~}\200\200\u01a0\u01a0nullnull\230\230\u01a0\u01a0nullnull\230\230~}\200\200~}\200\200\u01a0\u01a0nullnull\230\230\u01a0\u01a0nullnull\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```!" + "'", str2, "~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```!");
    }

    @Test
    public void test07258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07258");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "nullnullnullnullnullnullnullnull!!LL!!LLnullnullnullnullnullnullnullnull!!LL!!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!" + "'", str2, "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
    }

    @Test
    public void test07259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07259");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]]\256\256]]\256\256!!]]\256\256]]\256\256!!]]\256\256]]\256\256]]\256\256]]\256\256!!]]\256\256]]\256\256!!]]\256\256]]\256\256!", "\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126\u0126\u0126\200\u0126\u0126\200\u0126\u0126\u0126\u0126!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]\256\256]]\256\256!!]]\256\256]]\256\256!!]]\256\256]]\256\256]]\256\256]]\256\256!!]]\256\256]]\256\256!!]]\256\256]]\256\256!" + "'", str2, "]]\256\256]]\256\256!!]]\256\256]]\256\256!!]]\256\256]]\256\256]]\256\256]]\256\256!!]]\256\256]]\256\256!!]]\256\256]]\256\256!");
    }

    @Test
    public void test07260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07260");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "!~``!~``!!!~``!~``!!!~``!~``!~``!~``!!!~``!~``!!!~``!~``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07261");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LL!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016enullnullnull}~\200\200}~\200\200\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016enullnullnull}~\200\200}~\200\200\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016enullnullnull}~\200\200}~\200\200\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200!" + "'", str2, "\200\200!");
    }

    @Test
    public void test07262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07262");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200}}`\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200]]!", "~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200}}`\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200]]!" + "'", str2, "\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200}}`\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200]]!");
    }

    @Test
    public void test07263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07263");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320!", "LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320!" + "'", str2, "\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320!");
    }

    @Test
    public void test07264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07264");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("vvnullnullnullnullnullnullnullnullvvnullnullnullnullnullnullnullnullvvnullnullnullnullnullnullnullnullvvnullnullnullnullnullnullnullnullvvnullnullnullnullnullnullnullnullvvnullnullnullnullnullnullnullnullvvnullnullnullnullnullnullnullnullvvnullnullnullnullnullnullnullnull!", "!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!" + "'", str2, "!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!");
    }

    @Test
    public void test07265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07265");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]!!]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]!!]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]!!]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]!!]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]!", "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fanullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]!!]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]!!]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]!!]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]!!]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]!" + "'", str2, "]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]!!]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]!!]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]!!]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]!!]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]!");
    }

    @Test
    public void test07266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07266");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150]]!", "!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull~}}^!nullnullnull!nullnullnull!nullnullnull!nullnullnull]]!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull~}}^!nullnullnull!nullnullnull!nullnullnull!nullnullnull]]!");
    }

    @Test
    public void test07267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07267");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356!", "``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07268");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "ULLLULLLULLLULLLULLLULLLULLLULLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07269");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!", "}~\200\200}~\200\200!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull}~\200\200}~\200\200!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!" + "'", str2, "!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!");
    }

    @Test
    public void test07270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07270");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!!", "\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe\u01fc\u0200\u01fe\u01fe!!!```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!" + "'", str2, "nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!");
    }

    @Test
    public void test07271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07271");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "}L\200\200}L\200\200}L\200\200}L\200\200LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL}L\200\200}L\200\200}L\200\200}L\200\200LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07272");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("WZZZ\200}}`WZZZ]]!", "UNLLUNLLUNLLUNLLUNLLUNLLUNLL\200}}`UNLLUNLLUNLLUNLLUNLLUNLLUNLL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\200}}`nullnullnullnull]]!" + "'", str2, "nullnullnullnull\200}}`nullnullnullnull]]!");
    }

    @Test
    public void test07273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07273");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!!!!", "\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!!" + "'", str2, "NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!!");
    }

    @Test
    public void test07274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07274");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!!", "\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "SSSS!!!SSSS!!!SSSS!!!SSSS!!!SSSS!!!SSSS!!!SSSS!!!SSSS!!!!" + "'", str2, "SSSS!!!SSSS!!!SSSS!!!SSSS!!!SSSS!!!SSSS!!!SSSS!!!SSSS!!!!");
    }

    @Test
    public void test07275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07275");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUU!", "LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LUUULUUULLLLLLLLLUUULUUULLLLLLLLLUUULUUULLLLLLLLLUUULUUULLLLLLLLLUUULUUULLLLLLLLLUUULUUULLLLLLLLLUUULUUULLLLLLLLLUUULUUULLLLLLLL!" + "'", str2, "LUUULUUULLLLLLLLLUUULUUULLLLLLLLLUUULUUULLLLLLLLLUUULUUULLLLLLLLLUUULUUULLLLLLLLLUUULUUULLLLLLLLLUUULUUULLLLLLLLLUUULUUULLLLLLLL!");
    }

    @Test
    public void test07276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07276");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\253\254\256\256null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!\253\254\256\256null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!", "\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\253\254\256\256nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!" + "'", str2, "\253\254\256\256nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\253\254\256\256nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!");
    }

    @Test
    public void test07277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07277");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07278");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214!", "\275\u0108\u0108\u0108\275\u0108\u0108\u0108!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214!" + "'", str2, "\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\266\266!!\214\214!");
    }

    @Test
    public void test07279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07279");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07280");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NLLLNLLL]]NLLLNLLL]]NLLLNLLL]]NLLLNLLL]]~}}^NLLLNLLL]]NLLLNLLL]]NLLLNLLL]]NLLLNLLL]]]]!", "}~\200\200}~\200\200FULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULL}~\200\200}~\200\200FULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULLFULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ULLLULLL]]ULLLULLL]]ULLLULLL]]ULLLULLL]]~}}^ULLLULLL]]ULLLULLL]]ULLLULLL]]ULLLULLL]]]]!" + "'", str2, "ULLLULLL]]ULLLULLL]]ULLLULLL]]ULLLULLL]]~}}^ULLLULLL]]ULLLULLL]]ULLLULLL]]ULLLULLL]]]]!");
    }

    @Test
    public void test07281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07281");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246!!!", "\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!");
    }

    @Test
    public void test07282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07282");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!", "\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!" + "'", str2, "\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!");
    }

    @Test
    public void test07283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07283");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````!", "nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!nullnull!!nullnullnull\256\254\254nullnull!!nullnullnull\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN````!" + "'", str2, "LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN````!");
    }

    @Test
    public void test07284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07284");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07285");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!", "nullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRRnullnullRRnullnullRRRR!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~~~!U~~!U~~~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~~~!U~~!U~~~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~~~!U~~!U~~~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~~~!U~~!U~~~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~~~!U~~!U~~~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~~~!U~~!U~~~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~~~!U~~!U~~~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~~~!U~~!U~~~~!" + "'", str2, "!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~~~!U~~!U~~~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~~~!U~~!U~~~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~~~!U~~!U~~~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~~~!U~~!U~~~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~~~!U~~!U~~~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~~~!U~~!U~~~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~~~!U~~!U~~~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~~~!U~~!U~~~~!");
    }

    @Test
    public void test07286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07286");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200!", "]!\253\253]!\253\253!!]!\253\253]!\253\253!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200!" + "'", str2, "^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200!");
    }

    @Test
    public void test07287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07287");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126!", "\275!!!\275\275!!\275\275!!\275\275!!\275\275!!\275!!!\275\275!!\275\275!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07288");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL!", "\275\u010c\u010c\275\u010c\u010c!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07289");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!", "\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!" + "'", str2, "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!");
    }

    @Test
    public void test07290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07290");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\215}\215\215\215}\215\215A]]]A]]]A]]]A]]]\215}\215\215\215}\215\215!", "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215null]]]null]]]null]]]null]]]\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215null]]]null]]]null]]]null]]]\215}\215\215\215}\215\215!");
    }

    @Test
    public void test07291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07291");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!!!!" + "'", str2, "\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!!!!");
    }

    @Test
    public void test07292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07292");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``!", "!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!" + "'", str2, "!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!````!```!```!");
    }

    @Test
    public void test07293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07293");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035bnullnull!", "NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01b8\u01b8\u035b\u035b\u01b8\u01b8\u035b\u035b\u035b\u035b\u01b8\u01b8\u035b\u035b\u01b8\u01b8\u01b8\u01b8\u035b\u035b\u01b8\u01b8\u035b\u035b\u035b\u035b\u01b8\u01b8\u035b\u035b\u01b8\u01b8\u01b8\u01b8\u035b\u035b\u01b8\u01b8\u035b\u035b\u035b\u035b\u01b8\u01b8\u035b\u035b\u01b8\u01b8\u01b8\u01b8\u035b\u035b\u01b8\u01b8\u035b\u035b\u035b\u035b\u01b8\u01b8\u035b\u035b\u01b8\u01b8\u01b8\u01b8\u035b\u035b\u01b8\u01b8\u035b\u035b\u035b\u035b\u01b8\u01b8\u035b\u035b\u01b8\u01b8\u01b8\u01b8\u035b\u035b\u01b8\u01b8\u035b\u035b\u035b\u035b\u01b8\u01b8\u035b\u035b\u01b8\u01b8\u01b8\u01b8\u035b\u035b\u01b8\u01b8\u035b\u035b\u035b\u035b\u01b8\u01b8\u035b\u035b\u01b8\u01b8\u01b8\u01b8\u035b\u035b\u01b8\u01b8\u035b\u035b\u035b\u035b\u01b8\u01b8\u035b\u035b\u01b8\u01b8nullnullnull!" + "'", str2, "\u01b8\u01b8\u035b\u035b\u01b8\u01b8\u035b\u035b\u035b\u035b\u01b8\u01b8\u035b\u035b\u01b8\u01b8\u01b8\u01b8\u035b\u035b\u01b8\u01b8\u035b\u035b\u035b\u035b\u01b8\u01b8\u035b\u035b\u01b8\u01b8\u01b8\u01b8\u035b\u035b\u01b8\u01b8\u035b\u035b\u035b\u035b\u01b8\u01b8\u035b\u035b\u01b8\u01b8\u01b8\u01b8\u035b\u035b\u01b8\u01b8\u035b\u035b\u035b\u035b\u01b8\u01b8\u035b\u035b\u01b8\u01b8\u01b8\u01b8\u035b\u035b\u01b8\u01b8\u035b\u035b\u035b\u035b\u01b8\u01b8\u035b\u035b\u01b8\u01b8\u01b8\u01b8\u035b\u035b\u01b8\u01b8\u035b\u035b\u035b\u035b\u01b8\u01b8\u035b\u035b\u01b8\u01b8\u01b8\u01b8\u035b\u035b\u01b8\u01b8\u035b\u035b\u035b\u035b\u01b8\u01b8\u035b\u035b\u01b8\u01b8\u01b8\u01b8\u035b\u035b\u01b8\u01b8\u035b\u035b\u035b\u035b\u01b8\u01b8\u035b\u035b\u01b8\u01b8nullnullnull!");
    }

    @Test
    public void test07294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07294");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL~~~~~LL~~~~~~~LL~~~~~LL~~~~~~~LL~~~~~LL~~~~~~~LL~~~~~LL~~~~~~~LL~~~~~LL~~~~~~~LL~~~~~LL~~~~~~~LL~~~~~LL~~~~~~~LL~~~~~LL~~~~~~~!", "\253\254\256\256!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull~~~~~nullnull~~~~~~~nullnull~~~~~nullnull~~~~~~~nullnull~~~~~nullnull~~~~~~~nullnull~~~~~nullnull~~~~~~~nullnull~~~~~nullnull~~~~~~~nullnull~~~~~nullnull~~~~~~~nullnull~~~~~nullnull~~~~~~~nullnull~~~~~nullnull~~~~~~~!" + "'", str2, "nullnull~~~~~nullnull~~~~~~~nullnull~~~~~nullnull~~~~~~~nullnull~~~~~nullnull~~~~~~~nullnull~~~~~nullnull~~~~~~~nullnull~~~~~nullnull~~~~~~~nullnull~~~~~nullnull~~~~~~~nullnull~~~~~nullnull~~~~~~~nullnull~~~~~nullnull~~~~~~~!");
    }

    @Test
    public void test07295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07295");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254\u016e\u016e\u016e\u016eUU\256\254\254!!!", "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNUULNUULNUULNUU\256\254\254LNUULNUULNUULNUU\256\254\254!!LNUULNUULNUULNUU\256\254\254LNUULNUULNUULNUU\256\254\254!!LNUULNUULNUULNUU\256\254\254LNUULNUULNUULNUU\256\254\254!!LNUULNUULNUULNUU\256\254\254LNUULNUULNUULNUU\256\254\254!!LNUULNUULNUULNUU\256\254\254LNUULNUULNUULNUU\256\254\254!!LNUULNUULNUULNUU\256\254\254LNUULNUULNUULNUU\256\254\254!!LNUULNUULNUULNUU\256\254\254LNUULNUULNUULNUU\256\254\254!!LNUULNUULNUULNUU\256\254\254LNUULNUULNUULNUU\256\254\254!!!" + "'", str2, "LNUULNUULNUULNUU\256\254\254LNUULNUULNUULNUU\256\254\254!!LNUULNUULNUULNUU\256\254\254LNUULNUULNUULNUU\256\254\254!!LNUULNUULNUULNUU\256\254\254LNUULNUULNUULNUU\256\254\254!!LNUULNUULNUULNUU\256\254\254LNUULNUULNUULNUU\256\254\254!!LNUULNUULNUULNUU\256\254\254LNUULNUULNUULNUU\256\254\254!!LNUULNUULNUULNUU\256\254\254LNUULNUULNUULNUU\256\254\254!!LNUULNUULNUULNUU\256\254\254LNUULNUULNUULNUU\256\254\254!!LNUULNUULNUULNUU\256\254\254LNUULNUULNUULNUU\256\254\254!!!");
    }

    @Test
    public void test07296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07296");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!!\275!!!\275!!\275\275!\275!!!\275!!\275\275!\275!!!\275!!\275\275!\275!!!\275!!\275\275\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!!\275!!!\275!!\275\275!\275!!!\275!!\275\275!", "U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!!\275!!!\275!!\275\275!\275!!!\275!!\275\275!\275!!!\275!!\275\275!\275!!!\275!!\275\275\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!!\275!!!\275!!\275\275!\275!!!\275!!\275\275!" + "'", str2, "\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!!\275!!!\275!!\275\275!\275!!!\275!!\275\275!\275!!!\275!!\275\275!\275!!!\275!!\275\275\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!!\275!!!\275!!\275\275!\275!!!\275!!\275\275!");
    }

    @Test
    public void test07297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07297");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a!", "LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a!\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a!\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a!\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a!!!!!\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a!\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a!" + "'", str2, "!!!!!\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a!\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a!\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a!\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a!!!!!\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a!\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a\333null\330\330\u0318\u031a\u031a!");
    }

    @Test
    public void test07298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07298");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test07299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07299");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!!!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!!!", "\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254\u0200\u01fc\u01fcnullnullnull\256\254\254!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~U!UUU!UU!~U!UUU!UU!~U!UUU!UU!~U!UUU!UU!~U!UUU!UU!~U!UUU!UU!~U!UUU!UU!~U!UUU!UU!!!~U!UUU!UU!~U!UUU!UU!~U!UUU!UU!~U!UUU!UU!~U!UUU!UU!~U!UUU!UU!~U!UUU!UU!~U!UUU!UU!!!" + "'", str2, "!~U!UUU!UU!~U!UUU!UU!~U!UUU!UU!~U!UUU!UU!~U!UUU!UU!~U!UUU!UU!~U!UUU!UU!~U!UUU!UU!!!~U!UUU!UU!~U!UUU!UU!~U!UUU!UU!~U!UUU!UU!~U!UUU!UU!~U!UUU!UU!~U!UUU!UU!~U!UUU!UU!!!");
    }

    @Test
    public void test07300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07300");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366!", "!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366!" + "'", str2, "\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366!");
    }

    @Test
    public void test07301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07301");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225!", "\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320nullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276\u031d\u031dLL\275\276\u031d\u031dLL\225\225\275\276\u031d\u031dLL\275\276\u031d\u031dLL\225\225\275\276\u031d\u031dLL\275\276\u031d\u031dLL\225\225\275\276\u031d\u031dLL\275\276\u031d\u031dLL\225\225\275\276\u031d\u031dLL\275\276\u031d\u031dLL\225\225\275\276\u031d\u031dLL\275\276\u031d\u031dLL\225\225\275\276\u031d\u031dLL\275\276\u031d\u031dLL\225\225\275\276\u031d\u031dLL\275\276\u031d\u031dLL\225\225!" + "'", str2, "\275\276\u031d\u031dLL\275\276\u031d\u031dLL\225\225\275\276\u031d\u031dLL\275\276\u031d\u031dLL\225\225\275\276\u031d\u031dLL\275\276\u031d\u031dLL\225\225\275\276\u031d\u031dLL\275\276\u031d\u031dLL\225\225\275\276\u031d\u031dLL\275\276\u031d\u031dLL\225\225\275\276\u031d\u031dLL\275\276\u031d\u031dLL\225\225\275\276\u031d\u031dLL\275\276\u031d\u031dLL\225\225\275\276\u031d\u031dLL\275\276\u031d\u031dLL\225\225!");
    }

    @Test
    public void test07302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07302");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("SSSS!!!SSSS!!!SSSS!!!SSSS!!!SSSS!!!SSSS!!!SSSS!!!SSSS!!!!", "UUUUUUUUUUUUUUUU\200}}`UUUUUUUUUUUUUUUU]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!!" + "'", str2, "}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!!");
    }

    @Test
    public void test07303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07303");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]!", "\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]!" + "'", str2, "\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]!");
    }

    @Test
    public void test07304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07304");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("EEEEEEEEEEEEEEEE\254~\256\256\254~\256\256\254~\256\256\254~\256\256!", "nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200!!nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200!!nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200!!nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200!!nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200nullnullnullnullnullnullnullnull\200\200\200\200\200\200\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNNNNNNNNNN\254~\256\256\254~\256\256\254~\256\256\254~\256\256!" + "'", str2, "NNNNNNNNNNNNNNNN\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
    }

    @Test
    public void test07305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07305");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!" + "'", str2, "\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!\216\216~!!!~!!!!");
    }

    @Test
    public void test07306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07306");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180!", "LL!!\336`\336\336\336`\336\336\336`\336\336LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\336`\336\336\336`\336\336\336`\336\336LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07307");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll!", "\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull!" + "'", str2, "\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull!");
    }

    @Test
    public void test07308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07308");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}N\200\200}N\200\200}N\200\200}N\200\200ULLLULLLULLLULLL}N\200\200}N\200\200}N\200\200}N\200\200ULLLULLL!", "nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216!!nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216!!nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216!!nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216!!nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0223\200\200\u0223\200\200\u0223\200\200\u0223\200\200\u0224\u0226\u0226\u0226\u0224\u0226\u0226\u0226\u0224\u0226\u0226\u0226\u0224\u0226\u0226\u0226\u0223\200\200\u0223\200\200\u0223\200\200\u0223\200\200\u0224\u0226\u0226\u0226\u0224\u0226\u0226\u0226!" + "'", str2, "\u0223\200\200\u0223\200\200\u0223\200\200\u0223\200\200\u0224\u0226\u0226\u0226\u0224\u0226\u0226\u0226\u0224\u0226\u0226\u0226\u0224\u0226\u0226\u0226\u0223\200\200\u0223\200\200\u0223\200\200\u0223\200\200\u0224\u0226\u0226\u0226\u0224\u0226\u0226\u0226!");
    }

    @Test
    public void test07309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07309");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\253\256\256]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test07310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07310");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!", "\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\300\300\275\275\300\300\275\275\300\300\275\275\300\300\275\275\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\300\300\275\275\300\300\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!" + "'", str2, "\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!");
    }

    @Test
    public void test07311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07311");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275!UUU!UUU!UUU\276!UUU\275\275!", "NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230\200}}`NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!NNN!NNN!NNN\276!NNN\275\275!" + "'", str2, "\275!NNN!NNN!NNN\276!NNN\275\275!");
    }

    @Test
    public void test07312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07312");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!!", "\u0128\u0126\u0126\u0108\u0106\u0106!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!!" + "'", str2, "\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!!");
    }

    @Test
    public void test07313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07313");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be}~\200\200}~\200\200\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be!", "eeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeff!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull!" + "'", str2, "}~\200\200}~\200\200nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07314");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test07315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07315");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NN]]NN]]UNNNUNNNNN]]NN]]UNNNUNNN!", "FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!FEHHFEHH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull]]nullnull]]nullnullnullnullnullnullnullnullnullnull]]nullnull]]nullnullnullnullnullnullnullnull!" + "'", str2, "nullnull]]nullnull]]nullnullnullnullnullnullnullnullnullnull]]nullnull]]nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07316");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "!!!U!LLU!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test07317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07317");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!", "]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e!!!!!" + "'", str2, "\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e\u023e!!!!!");
    }

    @Test
    public void test07318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07318");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u011c\u011e\u011e\u0346\u0348\u0348!", "\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test07319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07319");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276\276nullnullnullnull\276nullnullnullnullnullnull\276nullnull\276\276nullnullnullnull\276nullnullnullnullnullnull\276nullnull\276\276nullnullnullnull\276nullnullnullnullnullnull\276nullnull\276\276nullnullnullnull\276nullnullnullnullnullnull\276nullnull\276\276nullnullnullnull\276nullnullnullnullnullnull\276nullnull\276\276nullnullnullnull\276nullnullnullnullnullnull\276nullnull\276\276nullnullnullnull\276nullnullnullnullnullnull\276nullnull\276\276nullnullnullnull\276nullnullnullnullnullnull\276nullnull!", "\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276\u016c\u016c\u016c\u016cLL\276\u016c\u016c\u016c\u016c\u016c\u016cLL\276\u016c\u016cLL\276\276\u016c\u016c\u016c\u016cLL\276\u016c\u016c\u016c\u016c\u016c\u016cLL\276\u016c\u016cLL\276\276\u016c\u016c\u016c\u016cLL\276\u016c\u016c\u016c\u016c\u016c\u016cLL\276\u016c\u016cLL\276\276\u016c\u016c\u016c\u016cLL\276\u016c\u016c\u016c\u016c\u016c\u016cLL\276\u016c\u016cLL\276\276\u016c\u016c\u016c\u016cLL\276\u016c\u016c\u016c\u016c\u016c\u016cLL\276\u016c\u016cLL\276\276\u016c\u016c\u016c\u016cLL\276\u016c\u016c\u016c\u016c\u016c\u016cLL\276\u016c\u016cLL\276\276\u016c\u016c\u016c\u016cLL\276\u016c\u016c\u016c\u016c\u016c\u016cLL\276\u016c\u016cLL\276\276\u016c\u016c\u016c\u016cLL\276\u016c\u016c\u016c\u016c\u016c\u016cLL\276\u016c\u016cLL!" + "'", str2, "\276\276\u016c\u016c\u016c\u016cLL\276\u016c\u016c\u016c\u016c\u016c\u016cLL\276\u016c\u016cLL\276\276\u016c\u016c\u016c\u016cLL\276\u016c\u016c\u016c\u016c\u016c\u016cLL\276\u016c\u016cLL\276\276\u016c\u016c\u016c\u016cLL\276\u016c\u016c\u016c\u016c\u016c\u016cLL\276\u016c\u016cLL\276\276\u016c\u016c\u016c\u016cLL\276\u016c\u016c\u016c\u016c\u016c\u016cLL\276\u016c\u016cLL\276\276\u016c\u016c\u016c\u016cLL\276\u016c\u016c\u016c\u016c\u016c\u016cLL\276\u016c\u016cLL\276\276\u016c\u016c\u016c\u016cLL\276\u016c\u016c\u016c\u016c\u016c\u016cLL\276\u016c\u016cLL\276\276\u016c\u016c\u016c\u016cLL\276\u016c\u016c\u016c\u016c\u016c\u016cLL\276\u016c\u016cLL\276\276\u016c\u016c\u016c\u016cLL\276\u016c\u016c\u016c\u016c\u016c\u016cLL\276\u016c\u016cLL!");
    }

    @Test
    public void test07320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07320");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!" + "'", str2, "!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!");
    }

    @Test
    public void test07321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07321");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("hfhhhfhh!!hfhhhfhh!!hfhhhfhhhfhhhfhh!!hfhhhfhh!!hfhhhfhh!", "nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LULLLULL!!LULLLULL!!LULLLULLLULLLULL!!LULLLULL!!LULLLULL!" + "'", str2, "LULLLULL!!LULLLULL!!LULLLULLLULLLULL!!LULLLULL!!LULLLULL!");
    }

    @Test
    public void test07322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07322");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!!", "\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028enullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!!" + "'", str2, "\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!!");
    }

    @Test
    public void test07323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07323");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!!\336\336\336\336\336\336\336\336!", "}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!}}}}}}}}!!}}}}}}}}!!}}}}}}}}!!}}}}}}}}!!}}}}}}}}!!}}}}}}}}!!}}}}}}}}!!}}}}}}}}!" + "'", str2, "!!}}}}}}}}!!}}}}}}}}!!}}}}}}}}!!}}}}}}}}!!}}}}}}}}!!}}}}}}}}!!}}}}}}}}!!}}}}}}}}!");
    }

    @Test
    public void test07324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07324");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!~lnulluulnulluu!~lnulluulnulluu!!!~lnulluulnulluu!~lnulluulnulluu!!!~lnulluulnulluu!~lnulluulnulluu!~lnulluulnulluu!~lnulluulnulluu!!!~lnulluulnulluu!~lnulluulnulluu!!!~lnulluulnulluu!~lnulluulnulluu!", "\u0346\u0348\u0348\u0348\210\205\206\206\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!!!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!!!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!!!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!!!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!" + "'", str2, "!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!!!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!!!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!!!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!!!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!");
    }

    @Test
    public void test07325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07325");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test07326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07326");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}UNLLUNLLUNLL~}}^}UNLLUNLLUNLL]]!", "nullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqll!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u023d\u0235\u0240\u0240\u023d\u0235\u0240\u0240\u023d\u0235\u0240\u0240\u023d\u0235\u0240\u0240\u023d\u0235\u0240\u0240\u023d\u0235\u0240\u0240]]!" + "'", str2, "\u023d\u0235\u0240\u0240\u023d\u0235\u0240\u0240\u023d\u0235\u0240\u0240\u023d\u0235\u0240\u0240\u023d\u0235\u0240\u0240\u023d\u0235\u0240\u0240]]!");
    }

    @Test
    public void test07327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07327");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}null\200\200}null\200\200}null\200\200}null\200\200L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~}null\200\200}null\200\200}null\200\200}null\200\200L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~!", "\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}\300!!!\200\200}\300!!!\200\200}\300!!!\200\200}\300!!!\200\200\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~}\300!!!\200\200}\300!!!\200\200}\300!!!\200\200}\300!!!\200\200\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~!" + "'", str2, "}\300!!!\200\200}\300!!!\200\200}\300!!!\200\200}\300!!!\200\200\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~}\300!!!\200\200}\300!!!\200\200}\300!!!\200\200}\300!!!\200\200\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~!");
    }

    @Test
    public void test07328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07328");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("TQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQ!", "!\253\256\256]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHH!" + "'", str2, "NHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHH!");
    }

    @Test
    public void test07329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07329");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254!!!", "!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LLLnullnullnull\256\254\254!LLLnullnullnull\256\254\254!!!LLLnullnullnull\256\254\254!LLLnullnullnull\256\254\254!!!LLLnullnullnull\256\254\254!LLLnullnullnull\256\254\254!!!LLLnullnullnull\256\254\254!LLLnullnullnull\256\254\254!!!LLLnullnullnull\256\254\254!LLLnullnullnull\256\254\254!!!LLLnullnullnull\256\254\254!LLLnullnullnull\256\254\254!!!LLLnullnullnull\256\254\254!LLLnullnullnull\256\254\254!!!LLLnullnullnull\256\254\254!LLLnullnullnull\256\254\254!!!" + "'", str2, "!LLLnullnullnull\256\254\254!LLLnullnullnull\256\254\254!!!LLLnullnullnull\256\254\254!LLLnullnullnull\256\254\254!!!LLLnullnullnull\256\254\254!LLLnullnullnull\256\254\254!!!LLLnullnullnull\256\254\254!LLLnullnullnull\256\254\254!!!LLLnullnullnull\256\254\254!LLLnullnullnull\256\254\254!!!LLLnullnullnull\256\254\254!LLLnullnullnull\256\254\254!!!LLLnullnullnull\256\254\254!LLLnullnullnull\256\254\254!!!LLLnullnullnull\256\254\254!LLLnullnullnull\256\254\254!!!");
    }

    @Test
    public void test07330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07330");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("lulllulllulllull!lulllulllulllulllulllulllulllulllulllulllulllull!lulllulllulllulllulllulllulllulllulllulllulllull!lulllulllulllulllulllulllulllulllulllulllulllull!lulllulllulllulllulllulllulllulllulllulllulllull!lulllulllulllulllulllulllulllulllulllulllulllull!lulllulllulllulllulllulllulllulllulllulllulllull!lulllulllulllulllulllulllulllulllulllulllulllull!lulllulllulllulllulllulllulllull!", "{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull!!nullnull!!{|~~{|~~nullnull!!nullnull!!{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull!!nullnull!!{|~~{|~~nullnull!!nullnull!!{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull!!nullnull!!{|~~{|~~nullnull!!nullnull!!{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull!!nullnull!!{|~~{|~~nullnull!!nullnull!!{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull!!nullnull!!{|~~{|~~nullnull!!nullnull!!{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull!!nullnull!!{|~~{|~~nullnull!!nullnull!!{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull!!nullnull!!{|~~{|~~nullnull!!nullnull!!{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull!!nullnull!!{|~~{|~~nullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U{UUU{UUU{UUU{UU!U{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UU!U{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UU!U{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UU!U{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UU!U{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UU!U{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UU!U{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UU!U{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UU!" + "'", str2, "U{UUU{UUU{UUU{UU!U{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UU!U{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UU!U{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UU!U{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UU!U{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UU!U{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UU!U{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UU!U{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UU!");
    }

    @Test
    public void test07331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07331");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("hHHHHhhHHHH!HHHHHHHHHHHHHHHHhHHHHhhHHHH!HHHHHHHHHHHHHHHH!!hHHHHhhHHHH!HHHHHHHHHHHHHHHHhHHHHhhHHHH!HHHHHHHHHHHHHHHH!!hHHHHhhHHHH!HHHHHHHHHHHHHHHHhHHHHhhHHHH!HHHHHHHHHHHHHHHH!!hHHHHhhHHHH!HHHHHHHHHHHHHHHHhHHHHhhHHHH!HHHHHHHHHHHHHHHH!!hHHHHhhHHHH!HHHHHHHHHHHHHHHHhHHHHhhHHHH!HHHHHHHHHHHHHHHH!!hHHHHhhHHHH!HHHHHHHHHHHHHHHHhHHHHhhHHHH!HHHHHHHHHHHHHHHH!!hHHHHhhHHHH!HHHHHHHHHHHHHHHHhHHHHhhHHHH!HHHHHHHHHHHHHHHH!!hHHHHhhHHHH!HHHHHHHHHHHHHHHHhHHHHhhHHHH!HHHHHHHHHHHHHHHH!!!", "\253\254\256\256L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\253\254\256\256L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test07332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07332");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull!!nullnull!!!", "LL\300\300LL\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test07333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07333");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!LL!!!LL!!LL!!!!!LL!!!LL!!LL!!!!!LL!!!LL!!LL!!!!!LL!!!LL!!LL!!!!!LL!!!LL!!LL!!!!!LL!!!LL!!LL!!!!!LL!!!LL!!LL!!!!!LL!!!LL!!LL!!!!", "\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170!!!!" + "'", str2, "\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170!!!!");
    }

    @Test
    public void test07334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07334");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108nullnull!", "NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NN!" + "'", str2, "NN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NN!!NN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NNNN!!NN!!NN!");
    }

    @Test
    public void test07335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07335");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!!\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!!\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!!\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!!\335\335\300\300~\335\335\300\300\335\335\300\300\335\335\300\300~\335\335\300\300\335\335\300\300!", "\276!!!\276\276!!\276\276!!\276\276!!\276\276!!\276!!!\276\276!!\276\276!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07336");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!", "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!" + "'", str2, "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!");
    }

    @Test
    public void test07337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07337");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!null\256\254\254null\256\254\254!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\256\256!!\256\256!!\256\256!!\256\256\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\256\256!!\256\256!!\256\256!!\256\256\u0346\u0348\u0348!");
    }

    @Test
    public void test07338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07338");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!~\200null~~\200null~~!~\200null~~\200null~~!!!~\200null~~\200null~~!~\200null~~\200null~~!!!~\200null~~\200null~~!~\200null~~\200null~~!~\200null~~\200null~~!~\200null~~\200null~~!!!~\200null~~\200null~~!~\200null~~\200null~~!!!~\200null~~\200null~~!~\200null~~\200null~~!", "!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN\200}}`!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~\200\u0264\u0262nullnull~~\200\u0264\u0262nullnull~~!~\200\u0264\u0262nullnull~~\200\u0264\u0262nullnull~~!!!~\200\u0264\u0262nullnull~~\200\u0264\u0262nullnull~~!~\200\u0264\u0262nullnull~~\200\u0264\u0262nullnull~~!!!~\200\u0264\u0262nullnull~~\200\u0264\u0262nullnull~~!~\200\u0264\u0262nullnull~~\200\u0264\u0262nullnull~~!~\200\u0264\u0262nullnull~~\200\u0264\u0262nullnull~~!~\200\u0264\u0262nullnull~~\200\u0264\u0262nullnull~~!!!~\200\u0264\u0262nullnull~~\200\u0264\u0262nullnull~~!~\200\u0264\u0262nullnull~~\200\u0264\u0262nullnull~~!!!~\200\u0264\u0262nullnull~~\200\u0264\u0262nullnull~~!~\200\u0264\u0262nullnull~~\200\u0264\u0262nullnull~~!" + "'", str2, "!~\200\u0264\u0262nullnull~~\200\u0264\u0262nullnull~~!~\200\u0264\u0262nullnull~~\200\u0264\u0262nullnull~~!!!~\200\u0264\u0262nullnull~~\200\u0264\u0262nullnull~~!~\200\u0264\u0262nullnull~~\200\u0264\u0262nullnull~~!!!~\200\u0264\u0262nullnull~~\200\u0264\u0262nullnull~~!~\200\u0264\u0262nullnull~~\200\u0264\u0262nullnull~~!~\200\u0264\u0262nullnull~~\200\u0264\u0262nullnull~~!~\200\u0264\u0262nullnull~~\200\u0264\u0262nullnull~~!!!~\200\u0264\u0262nullnull~~\200\u0264\u0262nullnull~~!~\200\u0264\u0262nullnull~~\200\u0264\u0262nullnull~~!!!~\200\u0264\u0262nullnull~~\200\u0264\u0262nullnull~~!~\200\u0264\u0262nullnull~~\200\u0264\u0262nullnull~~!");
    }

    @Test
    public void test07339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07339");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260!", "\u0346\u0348\u0348\u0348\u0248\u0246\u0246\u0246\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!\255\256\260\260\255\256\260\260nullnull!!nullnull!!\255\256\260\260\255\256\260\260nullnull!!nullnull!!\255\256\260\260\255\256\260\260nullnull!!nullnull!!\255\256\260\260\255\256\260\260nullnull!!nullnull!!\255\256\260\260\255\256\260\260nullnull!!nullnull!!\255\256\260\260\255\256\260\260nullnull!!nullnull!!\255\256\260\260\255\256\260\260nullnull!!nullnull!!\255\256\260\260\255\256\260\260!" + "'", str2, "nullnull!!nullnull!!\255\256\260\260\255\256\260\260nullnull!!nullnull!!\255\256\260\260\255\256\260\260nullnull!!nullnull!!\255\256\260\260\255\256\260\260nullnull!!nullnull!!\255\256\260\260\255\256\260\260nullnull!!nullnull!!\255\256\260\260\255\256\260\260nullnull!!nullnull!!\255\256\260\260\255\256\260\260nullnull!!nullnull!!\255\256\260\260\255\256\260\260nullnull!!nullnull!!\255\256\260\260\255\256\260\260!");
    }

    @Test
    public void test07340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07340");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!", "EEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEE!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!" + "'", str2, "EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!");
    }

    @Test
    public void test07341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07341");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275\275\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275\275!", "null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212!!null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212!!null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212!!null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212!!null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275\275!" + "'", str2, "\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275\275!");
    }

    @Test
    public void test07342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07342");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!!", "]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\273\273\273\273^```\270\270\273^```\270\270!!!!null\273\273\273\273^```\270\270\273^```\270\270!!!!!!null\273\273\273\273^```\270\270\273^```\270\270!!!!null\273\273\273\273^```\270\270\273^```\270\270!!!!!!null\273\273\273\273^```\270\270\273^```\270\270!!!!null\273\273\273\273^```\270\270\273^```\270\270!!!!!!null\273\273\273\273^```\270\270\273^```\270\270!!!!null\273\273\273\273^```\270\270\273^```\270\270!!!!!!null\273\273\273\273^```\270\270\273^```\270\270!!!!null\273\273\273\273^```\270\270\273^```\270\270!!!!!!null\273\273\273\273^```\270\270\273^```\270\270!!!!null\273\273\273\273^```\270\270\273^```\270\270!!!!!!null\273\273\273\273^```\270\270\273^```\270\270!!!!null\273\273\273\273^```\270\270\273^```\270\270!!!!!!null\273\273\273\273^```\270\270\273^```\270\270!!!!null\273\273\273\273^```\270\270\273^```\270\270!!!!!!!" + "'", str2, "null\273\273\273\273^```\270\270\273^```\270\270!!!!null\273\273\273\273^```\270\270\273^```\270\270!!!!!!null\273\273\273\273^```\270\270\273^```\270\270!!!!null\273\273\273\273^```\270\270\273^```\270\270!!!!!!null\273\273\273\273^```\270\270\273^```\270\270!!!!null\273\273\273\273^```\270\270\273^```\270\270!!!!!!null\273\273\273\273^```\270\270\273^```\270\270!!!!null\273\273\273\273^```\270\270\273^```\270\270!!!!!!null\273\273\273\273^```\270\270\273^```\270\270!!!!null\273\273\273\273^```\270\270\273^```\270\270!!!!!!null\273\273\273\273^```\270\270\273^```\270\270!!!!null\273\273\273\273^```\270\270\273^```\270\270!!!!!!null\273\273\273\273^```\270\270\273^```\270\270!!!!null\273\273\273\273^```\270\270\273^```\270\270!!!!!!null\273\273\273\273^```\270\270\273^```\270\270!!!!null\273\273\273\273^```\270\270\273^```\270\270!!!!!!!");
    }

    @Test
    public void test07343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07343");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("F!HHF!HHF!HHF!HHF!HHF!HHF!HHF!HH!", "\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!!\336\336LL\336\336LL!!\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL\336\336LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\336!LL\336!LL\336!LL\336!LL\336!LL\336!LL\336!LL\336!LL!" + "'", str2, "\336!LL\336!LL\336!LL\336!LL\336!LL\336!LL\336!LL\336!LL!");
    }

    @Test
    public void test07344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07344");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test07345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07345");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\253\254\256\256null\367nullnullnull\367nullnullnull\367nullnullnull\367nullnull\253\254\256\256null\367nullnullnull\367nullnull!", "\u023e\u023e\u023e\200\u023e\u023e\u023e]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256l!nn\367l!nnl!nnl!nn\367l!nnl!nnl!nn\367l!nnl!nnl!nn\367l!nnl!nn\253\254\256\256l!nn\367l!nnl!nnl!nn\367l!nnl!nn!" + "'", str2, "\253\254\256\256l!nn\367l!nnl!nnl!nn\367l!nnl!nnl!nn\367l!nnl!nnl!nn\367l!nnl!nn\253\254\256\256l!nn\367l!nnl!nnl!nn\367l!nnl!nn!");
    }

    @Test
    public void test07346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07346");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!", "FEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!" + "'", str2, "!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!");
    }

    @Test
    public void test07347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07347");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07348");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256!", "EEEEEEEE!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256!" + "'", str2, "~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256~}\200\200~}\200\200\253\254\256\256\253\254\256\256!");
    }

    @Test
    public void test07349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07349");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("`}hhhhhhhh`}hhhhhhhh`}hhhhhhhh`}hhhhhhhh`}hhhhhhhh!", "hnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ff!!hnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ff!!hnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ff!!hnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ff!!hnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffnull\253ffnull\253ff!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c!" + "'", str2, "\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c!");
    }

    @Test
    public void test07350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07350");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("EEEEEEEE!", "\266!!!\266!!!\266!!!\266!!!\200}}`\266!!!\266!!!\266!!!\266!!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07351");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214!", "\275```\275```\275```\275`````\275\275``\275\275``\275\275``\275\275\275```\275```\275```\275`````\275\275``\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````````\214\214````````\214\214````````\214\214````````\214\214````````\214\214````````\214\214````````\214\214````````\214\214!" + "'", str2, "````````\214\214````````\214\214````````\214\214````````\214\214````````\214\214````````\214\214````````\214\214````````\214\214!");
    }

    @Test
    public void test07352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07352");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\300\300\276\276\300\300\276\276}}\300\300\276\276\300\300\276\276}}!", "NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull\276\276nullnull\276\276}}nullnull\276\276nullnull\276\276}}!" + "'", str2, "nullnull\276\276nullnull\276\276}}nullnull\276\276nullnull\276\276}}!");
    }

    @Test
    public void test07353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07353");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!!", "!!~~!!~~!!!!~~!!~~!!!!~~!!~~!!~~!!~~!!!!~~!!~~!!!!~~!!~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!!" + "'", str2, "]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!!");
    }

    @Test
    public void test07354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07354");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!", "!!!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!" + "'", str2, "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!");
    }

    @Test
    public void test07355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07355");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c!", "ULLL!ULLLULLLULLL!ULLLULLLULLLULLLULLL!ULLLULLLULLL!ULLLULLLULLLULLLULLL!ULLLULLLULLL!ULLLULLLULLLULLLULLL!ULLLULLLULLL!ULLLULLLULLLULLLULLL!ULLLULLLULLL!ULLLULLLULLLULLLULLL!ULLLULLLULLL!ULLLULLLULLLULLLULLL!ULLLULLLULLL!ULLLULLLULLLULLLULLL!ULLLULLLULLL!ULLLULLLULLLULLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test07356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07356");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("FFFFFFFFFFFFFFFF\200}}`FFFFFFFFFFFFFFFF]]!", "NNLLLNLLLNLLLNNLLLNLLLNLLLNNLLLNLLLNLLLNNLLLNLLLNLLL\200}}`NNLLLNLLLNLLLNNLLLNLLLNLLLNNLLLNLLLNLLLNNLLLNLLLNLLL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNNNNNNNNNN\200}}`NNNNNNNNNNNNNNNN]]!" + "'", str2, "NNNNNNNNNNNNNNNN\200}}`NNNNNNNNNNNNNNNN]]!");
    }

    @Test
    public void test07357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07357");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!", "\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!" + "'", str2, "\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!");
    }

    @Test
    public void test07358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07358");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340nullnullnullnullnullnullnullnull\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340\340\275\340\340nullnullnullnullnullnullnullnull!", "`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!" + "'", str2, "L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!");
    }

    @Test
    public void test07359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07359");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\275\275\275\275\u0348\u0346\u0346!", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!NNN!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!NNN!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!NNN!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!NNN!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!NNN!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!NNN!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!NNN!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!NNN!NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\275\275\275\275\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\275\275\275\275\u0348\u0346\u0346!");
    }

    @Test
    public void test07360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07360");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!!", "\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!!" + "'", str2, "~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!!");
    }

    @Test
    public void test07361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07361");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!", "\u0366\u0365\u0368\u0368\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!" + "'", str2, "!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!");
    }

    @Test
    public void test07362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07362");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320!", "!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!!!!]!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320!" + "'", str2, "\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320!");
    }

    @Test
    public void test07363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07363");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!", "\276\276}~\200\200\276nullnullnullnullnullnullnullnull}~\200\200\276nullnullnullnullnullnullnullnull\276\276}~\200\200\276nullnullnullnullnullnullnullnull}~\200\200\276nullnullnullnullnullnullnullnull\276\276}~\200\200\276nullnullnullnullnullnullnullnull}~\200\200\276nullnullnullnullnullnullnullnull\276\276}~\200\200\276nullnullnullnullnullnullnullnull}~\200\200\276nullnullnullnullnullnullnullnull\276\276}~\200\200\276nullnullnullnullnullnullnullnull}~\200\200\276nullnullnullnullnullnullnullnull\276\276}~\200\200\276nullnullnullnullnullnullnullnull}~\200\200\276nullnullnullnullnullnullnullnull\276\276}~\200\200\276nullnullnullnullnullnullnullnull}~\200\200\276nullnullnullnullnullnullnullnull\276\276}~\200\200\276nullnullnullnullnullnullnullnull}~\200\200\276nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07364");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\236\240\240\240\u0346\u0348\u0348!", "!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\236\240\240\240\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\236\240\240\240\u0346\u0348\u0348!");
    }

    @Test
    public void test07365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07365");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!", "U\220!!\200~~U\220!!\200~~U\220!!U\220!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!U\220!!\200~~U\220!!\200~~U\220!!U\220!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!" + "'", str2, "!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!");
    }

    @Test
    public void test07366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07366");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!!\340\340nullnull\340\340nullnull!", "\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u0317\u031a\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u0317\u031a\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u0317\u031a\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u0317\u031a\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07367");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!HHHH!", "`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!````!" + "'", str2, "!````!");
    }

    @Test
    public void test07368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07368");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\u037b\u037c\u037e\u037e\u0348\u0346\u0346!", "\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u037e\u037e\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u037e\u037e\u0348\u0346\u0346!");
    }

    @Test
    public void test07369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07369");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUU!", "\275nullnull\230\230\u0366nullnull\230\230nullnull\230\230nullnull\230\230\u0366nullnull\230\230nullnull\230\230\200\200nullnull\230\230\u0366nullnull\230\230nullnull\230\230nullnull\230\230\u0366nullnull\230\230nullnull\230\230\200\200nullnull\230\230\u0366nullnull\230\230nullnull\230\230nullnull\230\230\u0366nullnull\230\230nullnull\230\230\200\200\276nullnull\230\230\u0366nullnull\230\230nullnull\230\230nullnull\230\230\u0366nullnull\230\230nullnull\230\230\200\200\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230!" + "'", str2, "U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230U\230\230\230!");
    }

    @Test
    public void test07370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07370");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!!!\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!!!]]!", "\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!!!\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!!!]]!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!!!\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!!!]]!");
    }

    @Test
    public void test07371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07371");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LULLLULL!!LULLLULL!!LULLLULL!!LULLLULL!!LULLLULL!!LULLLULL!!LULLLULL!!LULLLULL!!!", "HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200HHHHHHHH\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!!" + "'", str2, "HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!!");
    }

    @Test
    public void test07372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07372");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!", "TTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRR!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!" + "'", str2, "``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!");
    }

    @Test
    public void test07373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07373");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!!", "UUUUUUUUUUUUUUUUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUUUUUUUUUUUUUUUUUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\340nullnullnull\340nullnullnullnullnull\340nullnullnull\340nullnullnullnull!!null\340nullnullnull\340nullnullnullnullnull\340nullnullnull\340nullnullnullnull!!null\340nullnullnull\340nullnullnullnullnull\340nullnullnull\340nullnullnullnull!!null\340nullnullnull\340nullnullnullnullnull\340nullnullnull\340nullnullnullnull!!null\340nullnullnull\340nullnullnullnullnull\340nullnullnull\340nullnullnullnull!!null\340nullnullnull\340nullnullnullnullnull\340nullnullnull\340nullnullnullnull!!null\340nullnullnull\340nullnullnullnullnull\340nullnullnull\340nullnullnullnull!!null\340nullnullnull\340nullnullnullnullnull\340nullnullnull\340nullnullnullnull!!!" + "'", str2, "null\340nullnullnull\340nullnullnullnullnull\340nullnullnull\340nullnullnullnull!!null\340nullnullnull\340nullnullnullnullnull\340nullnullnull\340nullnullnullnull!!null\340nullnullnull\340nullnullnullnullnull\340nullnullnull\340nullnullnullnull!!null\340nullnullnull\340nullnullnullnullnull\340nullnullnull\340nullnullnullnull!!null\340nullnullnull\340nullnullnullnullnull\340nullnullnull\340nullnullnullnull!!null\340nullnullnull\340nullnullnullnullnull\340nullnullnull\340nullnullnullnull!!null\340nullnullnull\340nullnullnullnullnull\340nullnullnull\340nullnullnullnull!!null\340nullnullnull\340nullnullnullnullnull\340nullnullnull\340nullnullnullnull!!!");
    }

    @Test
    public void test07374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07374");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216!", "null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216!" + "'", str2, "\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216\220!\216\216!\220\220\216\216\220\220\216\216!");
    }

    @Test
    public void test07375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07375");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!}~\200\200}~\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!!NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!!NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!!NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!!NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!}~\200\200}~\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "}~\200\200}~\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!}~\200\200}~\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test07376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07376");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253!", "EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH\200}}`EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253!" + "'", str2, "\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253!");
    }

    @Test
    public void test07377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07377");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02faLNNNLNNNLNNN!", "\u0346\u0348\u0348\u0348\u037e\u037e\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02faLIIILIIILIII!" + "'", str2, "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02faLIIILIIILIII!");
    }

    @Test
    public void test07378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07378");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test07379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07379");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368!!]]!!]]\200\200\u0346\u0348\u0348!", "\260\260uu\260\260uu!!\260\260uu\260\260uu!!\260\260uu\260\260uu\260\260uu\260\260uu!!\260\260uu\260\260uu!!\260\260uu\260\260uu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368!!]]!!]]\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368!!]]!!]]\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test07380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07380");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc!", "!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!!!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!!!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!!!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!!!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!\276\276\276!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!" + "'", str2, "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!");
    }

    @Test
    public void test07381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07381");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031anullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test07382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07382");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("F]]]F]]]!", "!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]]]!]]]!" + "'", str2, "!]]]!]]]!");
    }

    @Test
    public void test07383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07383");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]!", "\u0366\u0365\u0368\u0368\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]!" + "'", str2, "\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]!");
    }

    @Test
    public void test07384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07384");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "!\216\216\216!\216\216\216!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07385");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a~~!", "LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~!" + "'", str2, "nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~!");
    }

    @Test
    public void test07386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07386");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test07387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07387");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!!", "!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!nn!!!!!nn!!!!!!!nn!!!!!nn!!!!!!!nn!!!!!nn!!!!!!!nn!!!!!nn!!!!!!!nn!!!!!nn!!!!!!!nn!!!!!nn!!!!!!!nn!!!!!nn!!!!!!!nn!!!!!nn!!!!!" + "'", str2, "!!!nn!!!!!nn!!!!!!!nn!!!!!nn!!!!!!!nn!!!!!nn!!!!!!!nn!!!!!nn!!!!!!!nn!!!!!nn!!!!!!!nn!!!!!nn!!!!!!!nn!!!!!nn!!!!!!!nn!!!!!nn!!!!!");
    }

    @Test
    public void test07388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07388");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!\200}}`!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!]]!", "!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!\200}}`!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!]]!" + "'", str2, "!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!\200}}`!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!]]!");
    }

    @Test
    public void test07389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07389");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!!]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!!]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!!]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!!]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!", "LLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200!!]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200!!]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200!!]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200!!]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200!" + "'", str2, "]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200!!]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200!!]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200!!]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200!!]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200!");
    }

    @Test
    public void test07390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07390");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("HH!!H~~HH!!H~~HH!!H~~HH!!H~~HH!!H~~HH!!H~~HH!!H~~HH!!H~~!", "\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU\276!UUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!null~~nullnull!!null~~nullnull!!null~~nullnull!!null~~nullnull!!null~~nullnull!!null~~nullnull!!null~~nullnull!!null~~!" + "'", str2, "nullnull!!null~~nullnull!!null~~nullnull!!null~~nullnull!!null~~nullnull!!null~~nullnull!!null~~nullnull!!null~~nullnull!!null~~!");
    }

    @Test
    public void test07391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07391");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNnullnullnullnullnullnullnullnullLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNnullnullnullnullnullnullnullnullLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNnullnullnullnullnullnullnullnullLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNnullnullnullnullnullnullnullnullLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNnullnullnullnullnullnullnullnullLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNnullnullnullnullnullnullnullnullLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNnullnullnullnullnullnullnullnullLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNnullnullnullnullnullnullnullnull!", "~}\200\200~}\200\200!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX~}\200\200~}\200\200!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX~}\200\200~}\200\200!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX~}\200\200~}\200\200!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX~}\200\200~}\200\200!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX~}\200\200~}\200\200!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX~}\200\200~}\200\200!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX~}\200\200~}\200\200!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "X!!!X!!!X!!!X!!!X!!!X!!!X!!!X!!!XWWWXWWWXWWWXWWWXWWWXWWWXWWWXWWWX!!!X!!!X!!!X!!!X!!!X!!!X!!!X!!!XWWWXWWWXWWWXWWWXWWWXWWWXWWWXWWWX!!!X!!!X!!!X!!!X!!!X!!!X!!!X!!!XWWWXWWWXWWWXWWWXWWWXWWWXWWWXWWWX!!!X!!!X!!!X!!!X!!!X!!!X!!!X!!!XWWWXWWWXWWWXWWWXWWWXWWWXWWWXWWWX!!!X!!!X!!!X!!!X!!!X!!!X!!!X!!!XWWWXWWWXWWWXWWWXWWWXWWWXWWWXWWWX!!!X!!!X!!!X!!!X!!!X!!!X!!!X!!!XWWWXWWWXWWWXWWWXWWWXWWWXWWWXWWWX!!!X!!!X!!!X!!!X!!!X!!!X!!!X!!!XWWWXWWWXWWWXWWWXWWWXWWWXWWWXWWWX!!!X!!!X!!!X!!!X!!!X!!!X!!!X!!!XWWWXWWWXWWWXWWWXWWWXWWWXWWWXWWW!" + "'", str2, "X!!!X!!!X!!!X!!!X!!!X!!!X!!!X!!!XWWWXWWWXWWWXWWWXWWWXWWWXWWWXWWWX!!!X!!!X!!!X!!!X!!!X!!!X!!!X!!!XWWWXWWWXWWWXWWWXWWWXWWWXWWWXWWWX!!!X!!!X!!!X!!!X!!!X!!!X!!!X!!!XWWWXWWWXWWWXWWWXWWWXWWWXWWWXWWWX!!!X!!!X!!!X!!!X!!!X!!!X!!!X!!!XWWWXWWWXWWWXWWWXWWWXWWWXWWWXWWWX!!!X!!!X!!!X!!!X!!!X!!!X!!!X!!!XWWWXWWWXWWWXWWWXWWWXWWWXWWWXWWWX!!!X!!!X!!!X!!!X!!!X!!!X!!!X!!!XWWWXWWWXWWWXWWWXWWWXWWWXWWWXWWWX!!!X!!!X!!!X!!!X!!!X!!!X!!!X!!!XWWWXWWWXWWWXWWWXWWWXWWWXWWWXWWWX!!!X!!!X!!!X!!!X!!!X!!!X!!!X!!!XWWWXWWWXWWWXWWWXWWWXWWWXWWWXWWW!");
    }

    @Test
    public void test07392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07392");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("L\335LLL\335LL!!L\335LLL\335LL!!L\335LLL\335LLL\335LLL\335LL!!L\335LLL\335LL!!L\335LLL\335LL!", "\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U\226UUU\226UU!!U\226UUU\226UU!!U\226UUU\226UUU\226UUU\226UU!!U\226UUU\226UU!!U\226UUU\226UU!" + "'", str2, "U\226UUU\226UU!!U\226UUU\226UU!!U\226UUU\226UUU\226UUU\226UU!!U\226UUU\226UU!!U\226UUU\226UU!");
    }

    @Test
    public void test07393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07393");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!", "`LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!`LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!" + "'", str2, "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!");
    }

    @Test
    public void test07394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07394");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("JL\225\225JL\225\225\225\225JL\225\225JL\225\225\225\225!!JL\225\225JL\225\225\225\225JL\225\225JL\225\225\225\225!!JL\225\225JL\225\225\225\225JL\225\225JL\225\225\225\225!!JL\225\225JL\225\225\225\225JL\225\225JL\225\225\225\225!!JL\225\225JL\225\225\225\225JL\225\225JL\225\225\225\225!!JL\225\225JL\225\225\225\225JL\225\225JL\225\225\225\225!!JL\225\225JL\225\225\225\225JL\225\225JL\225\225\225\225!!JL\225\225JL\225\225\225\225JL\225\225JL\225\225\225\225!!!", "\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull\225\225nullnull\225\225\225\225nullnull\225\225nullnull\225\225\225\225!!nullnull\225\225nullnull\225\225\225\225nullnull\225\225nullnull\225\225\225\225!!nullnull\225\225nullnull\225\225\225\225nullnull\225\225nullnull\225\225\225\225!!nullnull\225\225nullnull\225\225\225\225nullnull\225\225nullnull\225\225\225\225!!nullnull\225\225nullnull\225\225\225\225nullnull\225\225nullnull\225\225\225\225!!nullnull\225\225nullnull\225\225\225\225nullnull\225\225nullnull\225\225\225\225!!nullnull\225\225nullnull\225\225\225\225nullnull\225\225nullnull\225\225\225\225!!nullnull\225\225nullnull\225\225\225\225nullnull\225\225nullnull\225\225\225\225!!!" + "'", str2, "nullnull\225\225nullnull\225\225\225\225nullnull\225\225nullnull\225\225\225\225!!nullnull\225\225nullnull\225\225\225\225nullnull\225\225nullnull\225\225\225\225!!nullnull\225\225nullnull\225\225\225\225nullnull\225\225nullnull\225\225\225\225!!nullnull\225\225nullnull\225\225\225\225nullnull\225\225nullnull\225\225\225\225!!nullnull\225\225nullnull\225\225\225\225nullnull\225\225nullnull\225\225\225\225!!nullnull\225\225nullnull\225\225\225\225nullnull\225\225nullnull\225\225\225\225!!nullnull\225\225nullnull\225\225\225\225nullnull\225\225nullnull\225\225\225\225!!nullnull\225\225nullnull\225\225\225\225nullnull\225\225nullnull\225\225\225\225!!!");
    }

    @Test
    public void test07395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07395");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!", "\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!" + "'", str2, "!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!");
    }

    @Test
    public void test07396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07396");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\220~~null\220~~!!null\220~~null\220~~!!null\220~~null\220~~!!null\220~~null\220~~!!null\220~~null\220~~!!null\220~~null\220~~!!null\220~~null\220~~!!null\220~~null\220~~!!!" + "'", str2, "null\220~~null\220~~!!null\220~~null\220~~!!null\220~~null\220~~!!null\220~~null\220~~!!null\220~~null\220~~!!null\220~~null\220~~!!null\220~~null\220~~!!null\220~~null\220~~!!!");
    }

    @Test
    public void test07397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07397");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLL!", "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull\200}}`!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U!LLLLLU!LLLLLLLU!LLLLLU!LLLLLLLU!LLLLLU!LLLLLLLU!LLLLLU!LLLLLLLU!LLLLLU!LLLLLLLU!LLLLLU!LLLLLLLU!LLLLLU!LLLLLLLU!LLLLLU!LLLLLLL!" + "'", str2, "U!LLLLLU!LLLLLLLU!LLLLLU!LLLLLLLU!LLLLLU!LLLLLLLU!LLLLLU!LLLLLLLU!LLLLLU!LLLLLLLU!LLLLLU!LLLLLLLU!LLLLLU!LLLLLLLU!LLLLLU!LLLLLLL!");
    }

    @Test
    public void test07398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07398");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0\u01ae\u01b0\u01b0!", "^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX!!`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX!!`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX!!`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX!!`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX!" + "'", str2, "`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX!!`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX!!`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX!!`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX!!`!XX`!XX`!XX`!XX`!XX`!XX`!XX`!XX!");
    }

    @Test
    public void test07399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07399");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!", "\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!" + "'", str2, "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!");
    }

    @Test
    public void test07400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07400");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUUNUUU!", "\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276!!\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276!!\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276!!\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276!!\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276\230\226\256!NUNNNUNN\256!NUNNNUNN\236\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f!" + "'", str2, "\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f\u0171\u016f\u016f\u016f!");
    }

    @Test
    public void test07401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07401");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll\276!ll!", "OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull!" + "'", str2, "\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull!");
    }

    @Test
    public void test07402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07402");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u041c\u041e\u041b\u041b\u041c\u041e\u041b\u041b\u041c\u041e\u041b\u041b\u041c\u041e\u041b\u041b!!!", "~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test07403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07403");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnullnull\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!", "\u014b\u014c\u014e\u014e\u014b\u014c\u014e\u014e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07404");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\215}\215\215\215}\215\215\u014b\u014e\u014e\u014e\u014b\u014e\u014e\u014e\u014b\u014e\u014e\u014e\u014b\u014e\u014e\u014e\215}\215\215\215}\215\215!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\215}\215\215\215}\215\215!");
    }

    @Test
    public void test07405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07405");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNNNLNNNLNNNLNNN\200}}`LNNNLNNNLNNNLNNN]]!", "\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\200}}`\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254]]!" + "'", str2, "\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\200}}`\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254]]!");
    }

    @Test
    public void test07406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07406");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254!!NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254!!NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254!!NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254!!NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254!!NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254!!NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254!!NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254!!!", "llLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLLllLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254!!!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254!!!");
    }

    @Test
    public void test07407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07407");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!", "nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8!" + "'", str2, "\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8\u02f8!");
    }

    @Test
    public void test07408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07408");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XX!", "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368NULLNULL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UU!" + "'", str2, "UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UU!");
    }

    @Test
    public void test07409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07409");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull~~~~~nullnull~~~~~~~nullnull~~~~~nullnull~~~~~~~nullnull~~~~~nullnull~~~~~~~nullnull~~~~~nullnull~~~~~~~nullnull~~~~~nullnull~~~~~~~nullnull~~~~~nullnull~~~~~~~nullnull~~~~~nullnull~~~~~~~nullnull~~~~~nullnull~~~~~~~!", "LLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6~~~~~~~!" + "'", str2, "\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6~~~~~~~!");
    }

    @Test
    public void test07410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07410");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "NHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07411");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("``nullnull\200\200nullnull\200\200``nullnull\200\200nullnull\200\200``nullnull\200\200nullnull\200\200``nullnull\200\200nullnull\200\200``nullnull\200\200nullnull\200\200``nullnull\200\200nullnull\200\200``nullnull\200\200nullnull\200\200``nullnull\200\200nullnull\200\200!", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253````````\253\253````````\253\253````````\253\253````````\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253````````\253\253````````\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``\253```\253```\200\200\253```\253```\200\200``\253```\253```\200\200\253```\253```\200\200``\253```\253```\200\200\253```\253```\200\200``\253```\253```\200\200\253```\253```\200\200``\253```\253```\200\200\253```\253```\200\200``\253```\253```\200\200\253```\253```\200\200``\253```\253```\200\200\253```\253```\200\200``\253```\253```\200\200\253```\253```\200\200!" + "'", str2, "``\253```\253```\200\200\253```\253```\200\200``\253```\253```\200\200\253```\253```\200\200``\253```\253```\200\200\253```\253```\200\200``\253```\253```\200\200\253```\253```\200\200``\253```\253```\200\200\253```\253```\200\200``\253```\253```\200\200\253```\253```\200\200``\253```\253```\200\200\253```\253```\200\200``\253```\253```\200\200\253```\253```\200\200!");
    }

    @Test
    public void test07412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07412");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("u\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluu!", "NLLLNLLLNLLLNLLLNNNNNNNNNNNNNLLLNLLLNLLLNLLLNNNNNNNNNNNNNLLLNLLLNLLLNLLLNNNNNNNNNNNNNLLLNLLLNLLLNLLLNNNNNNNNNNNNNLLLNLLLNLLLNLLLNNNNNNNNNNNNNLLLNLLLNLLLNLLLNNNNNNNNNNNNNLLLNLLLNLLLNLLLNNNNNNNNNNNNNLLLNLLLNLLLNLLLNNNNNNNNNNNN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134nullnull!" + "'", str2, "\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134\u0134nullnull!");
    }

    @Test
    public void test07413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07413");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230\200}}`!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230]]!", "}~\200\200}~\200\200TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT}~\200\200}~\200\200TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230\200}}`!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230]]!" + "'", str2, "!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230\200}}`!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230]]!");
    }

    @Test
    public void test07414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07414");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!!", "PP!!PP!!!!PP!!PP!!!!PP!!PP!!!!PP!!PP!!!!PP!!PP!!!!PP!!PP!!!!PP!!PP!!!!PP!!PP!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!!!!" + "'", str2, "\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!!!!");
    }

    @Test
    public void test07415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07415");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL]]!", "\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300\300\336\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test07416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07416");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("``nullnull``nullnull!!``nullnull``nullnull!!!", "\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02af\u02b0\u02b2\u02b2\u02af\u02b0\u02b2\u02b2\u02af\u02b0\u02b2\u02b2\u02af\u02b0\u02b2\u02b2\u02af\u02b0\u02b2\u02b2\u02af\u02b0\u02b2\u02b2\u02af\u02b0\u02b2\u02b2\u02af\u02b0\u02b2\u02b2!!!" + "'", str2, "\u02af\u02b0\u02b2\u02b2\u02af\u02b0\u02b2\u02b2\u02af\u02b0\u02b2\u02b2\u02af\u02b0\u02b2\u02b2\u02af\u02b0\u02b2\u02b2\u02af\u02b0\u02b2\u02b2\u02af\u02b0\u02b2\u02b2\u02af\u02b0\u02b2\u02b2!!!");
    }

    @Test
    public void test07417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07417");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\u0366\u0365\u0368\u0368nullnullnullnull\213\213\213\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07418");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!", "HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!" + "'", str2, "}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!");
    }

    @Test
    public void test07419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07419");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016enullnullnull}~\200\200}~\200\200\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016enullnullnull}~\200\200}~\200\200\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016enullnullnull}~\200\200}~\200\200\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07420");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\300!!!\300!!!!", "\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!!!null!!!!" + "'", str2, "null!!!null!!!!");
    }

    @Test
    public void test07421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07421");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!", "nullnull]]nullnull]]LnullnullnullLnullnullnullnullnull]]nullnull]]LnullnullnullLnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231!!\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231!!\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231!!\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231!!\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231!" + "'", str2, "\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231!!\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231!!\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231!!\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231!!\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231!");
    }

    @Test
    public void test07422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07422");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!", "\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test07423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07423");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL!", "\u016e\u016e\u016e\u016e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u016e\u016e\u016e\u016e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276\u014e\u014eLUU\275\276\u014e\u014eLUU\275\276\u014e\u014eLUU\275\276\u014e\u014eLUU\275\276\u014e\u014eLUU\275\276\u014e\u014eLUU\275\276\u014e\u014eLUU\275\276\u014e\u014eLUU\275\276\u014e\u014eLUU\275\276\u014e\u014eLUU\275\276\u014e\u014eLUU\275\276\u014e\u014eLUU\275\276\u014e\u014eLUU\275\276\u014e\u014eLUU\275\276\u014e\u014eLUU\275\276\u014e\u014eLUU\275\276\u014e\u014eLUU\275\276\u014e\u014eLUU\275\276\u014e\u014eLUU\275\276\u014e\u014eLUU!" + "'", str2, "\275\276\u014e\u014eLUU\275\276\u014e\u014eLUU\275\276\u014e\u014eLUU\275\276\u014e\u014eLUU\275\276\u014e\u014eLUU\275\276\u014e\u014eLUU\275\276\u014e\u014eLUU\275\276\u014e\u014eLUU\275\276\u014e\u014eLUU\275\276\u014e\u014eLUU\275\276\u014e\u014eLUU\275\276\u014e\u014eLUU\275\276\u014e\u014eLUU\275\276\u014e\u014eLUU\275\276\u014e\u014eLUU\275\276\u014e\u014eLUU\275\276\u014e\u014eLUU\275\276\u014e\u014eLUU\275\276\u014e\u014eLUU\275\276\u014e\u014eLUU!");
    }

    @Test
    public void test07424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07424");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "N!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LL!!N!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LL!!N!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LL!!N!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LL!!N!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LL!" + "'", str2, "N!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LL!!N!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LL!!N!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LL!!N!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LL!!N!LLN!LLN!LLN!LLN!LLN!LLN!LLN!LL!");
    }

    @Test
    public void test07425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07425");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\200E\220\220\200E\220\220\200E\220\220\200E\220\220\200E\220\220\200E\220\220\200E\220\220\200E\220\220!", "LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220!" + "'", str2, "\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220!");
    }

    @Test
    public void test07426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07426");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\336\335\340\340\336\335\340\340!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07427");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("EHHHEHHHEHHHEHHHEHHHEHHHEHHHEHHH!", "TTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRR!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07428");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!", "U]UUU]UU!!U]UUU]UU!!U]UUU]UUU]UUU]UU!!U]UUU]UU!!U]UUU]UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test07429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07429");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!" + "'", str2, "!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!");
    }

    @Test
    public void test07430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07430");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b!", "\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!\226!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07431");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!\340\340!!\340\340!!!!!", "\u03c0\u03c0\u03be\u03be\u03c0\u03c0\u03be\u03be\u03c0\u03c0\u03be\u03be\u03c0\u03c0\u03be\u03be}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!" + "'", str2, "nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!");
    }

    @Test
    public void test07432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07432");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\254!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\254!" + "'", str2, "!\254!");
    }

    @Test
    public void test07433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07433");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UUUU\260\255\255\225\230\230UUUU\260\255\255\225\230\230UUUU\260\255\255\225\230\230UUUU\260\255\255\225\230\230\200}}`UUUU\260\255\255\225\230\230UUUU\260\255\255\225\230\230UUUU\260\255\255\225\230\230UUUU\260\255\255\225\230\230]]!", "\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017e\u019e\u019e\u019e\u019e\u017e\u017e\u017e\u017enullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u017d\u017d\u017d\u017d\260\255\255\225\230\230\u017d\u017d\u017d\u017d\260\255\255\225\230\230\u017d\u017d\u017d\u017d\260\255\255\225\230\230\u017d\u017d\u017d\u017d\260\255\255\225\230\230\200\u017d\u017d\u017d\u017d\260\255\255\225\230\230\u017d\u017d\u017d\u017d\260\255\255\225\230\230\u017d\u017d\u017d\u017d\260\255\255\225\230\230\u017d\u017d\u017d\u017d\260\255\255\225\230\230]]!" + "'", str2, "\u017d\u017d\u017d\u017d\260\255\255\225\230\230\u017d\u017d\u017d\u017d\260\255\255\225\230\230\u017d\u017d\u017d\u017d\260\255\255\225\230\230\u017d\u017d\u017d\u017d\260\255\255\225\230\230\200\u017d\u017d\u017d\u017d\260\255\255\225\230\230\u017d\u017d\u017d\u017d\260\255\255\225\230\230\u017d\u017d\u017d\u017d\260\255\255\225\230\230\u017d\u017d\u017d\u017d\260\255\255\225\230\230]]!");
    }

    @Test
    public void test07434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07434");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!", "\276!!!\276!!!\276!!!\276!!!\200}}`\276!!!\276!!!\276!!!\276!!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test07435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07435");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\275!!!\275!!!\204\204\275!!!\275!!!\275!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!\275!!!\275!!!\204\204\275!!!\275!!!\275\u0346\u0348\u0348!", "]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU!!]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU!!]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU!!]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU!!]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\275!!!\275!!!\204\204\275!!!\275!!!\275!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!\275!!!\275!!!\204\204\275!!!\275!!!\275\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\275!!!\275!!!\204\204\275!!!\275!!!\275!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!\275!!!\275!!!\204\204\275!!!\275!!!\275\u0346\u0348\u0348!");
    }

    @Test
    public void test07436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07436");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnull!", "\276}L\200\200\275\275\276}L\200\200\275\275L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200\276}L\200\200\275\275\276}L\200\200\275\275L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200\276}L\200\200\275\275\276}L\200\200\275\275L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200\276}L\200\200\275\275\276}L\200\200\275\275L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200\276}L\200\200\275\275\276}L\200\200\275\275L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200\276}L\200\200\275\275\276}L\200\200\275\275L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200\276}L\200\200\275\275\276}L\200\200\275\275L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200\276}L\200\200\275\275\276}L\200\200\275\275L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\275!!\200\275!!\200\275!!\200\275!!\200\275!!\200\275!!\200\275!!\200\275!!!" + "'", str2, "\200\275!!\200\275!!\200\275!!\200\275!!\200\275!!\200\275!!\200\275!!\200\275!!!");
    }

    @Test
    public void test07437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07437");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!", "\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test07438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07438");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnull!", "nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226!!nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226!!nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226!!nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226!!nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\226L\230\230\226L\230\230\226L\230\230\226L\230\230\226L\230\230!" + "'", str2, "\226L\230\230\226L\230\230\226L\230\230\226L\230\230\226L\230\230!");
    }

    @Test
    public void test07439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07439");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100!", "\u0366\u0365\u0368\u0368\u019e\u019c\u019c\u019e\u019c\u019c\u019e\u019c\u019c\u019e\u019c\u019c\u019e\u019c\u019c\u019e\u019c\u019c\u019e\u019c\u019c\u019e\u019c\u019c\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test07440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07440");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]!", "RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!RR!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]\220\220\216\216\220\220\216\216RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]\220\220\216\216\220\220\216\216RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]\220\220\216\216\220\220\216\216RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]\220\220\216\216\220\220\216\216RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]\220\220\216\216\220\220\216\216RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]\220\220\216\216\220\220\216\216RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]\220\220\216\216\220\220\216\216RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]!" + "'", str2, "\220\220\216\216\220\220\216\216RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]\220\220\216\216\220\220\216\216RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]\220\220\216\216\220\220\216\216RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]\220\220\216\216\220\220\216\216RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]\220\220\216\216\220\220\216\216RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]\220\220\216\216\220\220\216\216RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]\220\220\216\216\220\220\216\216RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]\220\220\216\216\220\220\216\216RR]]RR]]RR]]RR]]RR]]RR]]RR]]RR]]!");
    }

    @Test
    public void test07441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07441");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368AA!!AA!!\200\200\u0346\u0348\u0348!", "L\204LLL\204LLL\204LLL\204LLLLLLLLLLLLLLLLLLL\204LLL\204LLL\204LLL\204LLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368LL!!LL!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368LL!!LL!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test07442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07442");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!!", "\276\276}~\200\200\276nullnullnullnullnullnullnullnull}~\200\200\276nullnullnullnullnullnullnullnull\276\276}~\200\200\276nullnullnullnullnullnullnullnull}~\200\200\276nullnullnullnullnullnullnullnull\276\276}~\200\200\276nullnullnullnullnullnullnullnull}~\200\200\276nullnullnullnullnullnullnullnull\276\276}~\200\200\276nullnullnullnullnullnullnullnull}~\200\200\276nullnullnullnullnullnullnullnull\276\276}~\200\200\276nullnullnullnullnullnullnullnull}~\200\200\276nullnullnullnullnullnullnullnull\276\276}~\200\200\276nullnullnullnullnullnullnullnull}~\200\200\276nullnullnullnullnullnullnullnull\276\276}~\200\200\276nullnullnullnullnullnullnullnull}~\200\200\276nullnullnullnullnullnullnullnull\276\276}~\200\200\276nullnullnullnullnullnullnullnull}~\200\200\276nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UN\276\276UN\276\276!!\256\254\254UN\276\276UN\276\276!!\256\254\254!!UN\276\276UN\276\276!!\256\254\254UN\276\276UN\276\276!!\256\254\254!!UN\276\276UN\276\276!!\256\254\254UN\276\276UN\276\276!!\256\254\254!!UN\276\276UN\276\276!!\256\254\254UN\276\276UN\276\276!!\256\254\254!!UN\276\276UN\276\276!!\256\254\254UN\276\276UN\276\276!!\256\254\254!!UN\276\276UN\276\276!!\256\254\254UN\276\276UN\276\276!!\256\254\254!!UN\276\276UN\276\276!!\256\254\254UN\276\276UN\276\276!!\256\254\254!!UN\276\276UN\276\276!!\256\254\254UN\276\276UN\276\276!!\256\254\254!!!" + "'", str2, "UN\276\276UN\276\276!!\256\254\254UN\276\276UN\276\276!!\256\254\254!!UN\276\276UN\276\276!!\256\254\254UN\276\276UN\276\276!!\256\254\254!!UN\276\276UN\276\276!!\256\254\254UN\276\276UN\276\276!!\256\254\254!!UN\276\276UN\276\276!!\256\254\254UN\276\276UN\276\276!!\256\254\254!!UN\276\276UN\276\276!!\256\254\254UN\276\276UN\276\276!!\256\254\254!!UN\276\276UN\276\276!!\256\254\254UN\276\276UN\276\276!!\256\254\254!!UN\276\276UN\276\276!!\256\254\254UN\276\276UN\276\276!!\256\254\254!!UN\276\276UN\276\276!!\256\254\254UN\276\276UN\276\276!!\256\254\254!!!");
    }

    @Test
    public void test07443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07443");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull!", "\u0346\u0348\u0348\u0348\u037e\u037e\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~!" + "'", str2, "\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~!");
    }

    @Test
    public void test07444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07444");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!LLL!LLL!LLL!LLL!LLL!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
    }

    @Test
    public void test07445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07445");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\336\335\340\340nullnullnullnullnullnull\336\335\340\340nullnullnullnullnullnull\336\335\340\340nullnullnullnullnullnull\336\335\340\340nullnullnullnullnullnull!", "\275``uuuuuuuu``uuuuuuuu``uuuuuuuu\276``uuuuuuuu\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uu\275\275uu\275\275uu\275\275uu\275\275uu\275\275uu\275\275uu\275\275uu\275\275uu\275\275uu\275\275uu\275\275uu\275\275uu\275\275uu\275\275uu\275\275uu\275\275nullnullnullnulluu\275\275uu\275\275uu\275\275uu\275\275uu\275\275uu\275\275nullnullnullnulluu\275\275uu\275\275uu\275\275uu\275\275uu\275\275uu\275\275nullnullnullnulluu\275\275uu\275\275uu\275\275uu\275\275uu\275\275uu\275\275nullnullnullnulluu\275\275uu\275\275uu\275\275uu\275\275uu\275\275uu\275\275!" + "'", str2, "uu\275\275uu\275\275uu\275\275uu\275\275uu\275\275uu\275\275uu\275\275uu\275\275uu\275\275uu\275\275uu\275\275uu\275\275uu\275\275uu\275\275uu\275\275uu\275\275nullnullnullnulluu\275\275uu\275\275uu\275\275uu\275\275uu\275\275uu\275\275nullnullnullnulluu\275\275uu\275\275uu\275\275uu\275\275uu\275\275uu\275\275nullnullnullnulluu\275\275uu\275\275uu\275\275uu\275\275uu\275\275uu\275\275nullnullnullnulluu\275\275uu\275\275uu\275\275uu\275\275uu\275\275uu\275\275!");
    }

    @Test
    public void test07446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07446");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0106\u0106\u0106\u0106\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0106\u0106\u0106\u0106\u0128\u0126\u0126\u0128\u0126\u0126!", "\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u031e\u031e\u031e\u031e\u031e\u031e\u031e\u031eUNLLLUUUNLLLUU!" + "'", str2, "\u031e\u031e\u031e\u031e\u031e\u031e\u031e\u031eUNLLLUUUNLLLUU!");
    }

    @Test
    public void test07447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07447");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\214\214\214\214\214\214\214\214\214\214\214\214\275\214\214\214\214\214\214\214\214\214\214\214\214\275\214\214\214\214\214\214\214\214\214\214\214\214\275\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\275\275\214\214\214\214\214\214\214\214\275\275\214\214\214\214\214\214\214\214\275\275\214\214\214\214\214\214\214\214\275\275\275\214\214\214\214\214\214\214\214\214\214\214\214\275\214\214\214\214\214\214\214\214\214\214\214\214\275\214\214\214\214\214\214\214\214\214\214\214\214\275\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\275\275\214\214\214\214\214\214\214\214\275\275!", "\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\214\214\214\214\214\214\214\214\214\214\214\214\275\214\214\214\214\214\214\214\214\214\214\214\214\275\214\214\214\214\214\214\214\214\214\214\214\214\275\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\275\275\214\214\214\214\214\214\214\214\275\275\214\214\214\214\214\214\214\214\275\275\214\214\214\214\214\214\214\214\275\275\275\214\214\214\214\214\214\214\214\214\214\214\214\275\214\214\214\214\214\214\214\214\214\214\214\214\275\214\214\214\214\214\214\214\214\214\214\214\214\275\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\275\275\214\214\214\214\214\214\214\214\275\275!" + "'", str2, "\275\214\214\214\214\214\214\214\214\214\214\214\214\275\214\214\214\214\214\214\214\214\214\214\214\214\275\214\214\214\214\214\214\214\214\214\214\214\214\275\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\275\275\214\214\214\214\214\214\214\214\275\275\214\214\214\214\214\214\214\214\275\275\214\214\214\214\214\214\214\214\275\275\275\214\214\214\214\214\214\214\214\214\214\214\214\275\214\214\214\214\214\214\214\214\214\214\214\214\275\214\214\214\214\214\214\214\214\214\214\214\214\275\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\275\275\214\214\214\214\214\214\214\214\275\275!");
    }

    @Test
    public void test07448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07448");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("unllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnull!", "}~\200\200}~\200\200null^nullnullnull^nullnull}~\200\200}~\200\200null^nullnullnull^nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ULUUULUULUUULUUUULUUULUULUUULUUUULUUULUULUUULUUUULUUULUULUUULUUUULUUULUULUUULUUUULUUULUULUUULUUUULUUULUULUUULUUUULUUULUULUUULUUU!" + "'", str2, "ULUUULUULUUULUUUULUUULUULUUULUUUULUUULUULUUULUUUULUUULUULUUULUUUULUUULUULUUULUUUULUUULUULUUULUUUULUUULUULUUULUUUULUUULUULUUULUUU!");
    }

    @Test
    public void test07449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07449");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test07450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07450");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0317\u031a\u0317\u031a\u0317\u031a\u0317\u031anullnull!", "UNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u0317\u031a\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u0317\u031a\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u0317\u031a\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u0317\u031a\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0!" + "'", str2, "\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u0317\u031a\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u0317\u031a\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u0317\u031a\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u0317\u031a\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0!");
    }

    @Test
    public void test07451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07451");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull!", "\215}\215\215\215}\215\215L\270\270\270L\270\270\270L\270\270\270L\270\270\270\215}\215\215\215}\215\215!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`}\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270`}\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270`}\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270`}\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270`}\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270!" + "'", str2, "`}\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270`}\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270`}\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270`}\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270`}\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270!");
    }

    @Test
    public void test07452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07452");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!" + "'", str2, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
    }

    @Test
    public void test07453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07453");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248!", "\u0366\u0365\u0368\u0368\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u011anullnull\275\u011a\u011a\u011anullnull\275\u011a\u011a\u011anullnull\275\u011a\u011a\u011anullnull\275\u011a\u011a\u011anullnull\275\u011a\u011a\u011anullnull\275\u011a\u011a\u011anullnull\275\u011a\u011a\u011anullnull\275\u011a\u011a\u011anullnull\275\u011a\u011a\u011anullnull\275\u011a\u011a\u011anullnull\275\u011a\u011a\u011anullnull\275\u011a\u011a\u011anullnull\275\u011a\u011a\u011anullnull\275\u011a\u011a\u011anullnull\275\u011a\u011a\u011anullnull\275\u011a\u011anullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "\u011anullnull\275\u011a\u011a\u011anullnull\275\u011a\u011a\u011anullnull\275\u011a\u011a\u011anullnull\275\u011a\u011a\u011anullnull\275\u011a\u011a\u011anullnull\275\u011a\u011a\u011anullnull\275\u011a\u011a\u011anullnull\275\u011a\u011a\u011anullnull\275\u011a\u011a\u011anullnull\275\u011a\u011a\u011anullnull\275\u011a\u011a\u011anullnull\275\u011a\u011a\u011anullnull\275\u011a\u011a\u011anullnull\275\u011a\u011a\u011anullnull\275\u011a\u011a\u011anullnull\275\u011a\u011anullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07454");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320!", "\u0104\u0104!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320!" + "'", str2, "\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320!");
    }

    @Test
    public void test07455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07455");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!", "!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!" + "'", str2, "!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!");
    }

    @Test
    public void test07456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07456");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07457");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull\275\200nullnull!", "\275\275!!\275\275!!!!\275\275!!\275\275!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275!" + "'", str2, "\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275!");
    }

    @Test
    public void test07458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07458");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016eUU!!!!!!!", "\266!!!\266!!!\266!!!\266!!!\200}}`\266!!!\266!!!\266!!!\266!!!]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\266!!!!null\266\266!null\266\266!!!!\266!!!!null\266\266!null\266\266!!!!!!\266!!!!null\266\266!null\266\266!!!!\266!!!!null\266\266!null\266\266!!!!!!\266!!!!null\266\266!null\266\266!!!!\266!!!!null\266\266!null\266\266!!!!!!\266!!!!null\266\266!null\266\266!!!!\266!!!!null\266\266!null\266\266!!!!!!\266!!!!null\266\266!null\266\266!!!!\266!!!!null\266\266!null\266\266!!!!!!\266!!!!null\266\266!null\266\266!!!!\266!!!!null\266\266!null\266\266!!!!!!\266!!!!null\266\266!null\266\266!!!!\266!!!!null\266\266!null\266\266!!!!!!\266!!!!null\266\266!null\266\266!!!!\266!!!!null\266\266!null\266\266!!!!!!!" + "'", str2, "\266!!!!null\266\266!null\266\266!!!!\266!!!!null\266\266!null\266\266!!!!!!\266!!!!null\266\266!null\266\266!!!!\266!!!!null\266\266!null\266\266!!!!!!\266!!!!null\266\266!null\266\266!!!!\266!!!!null\266\266!null\266\266!!!!!!\266!!!!null\266\266!null\266\266!!!!\266!!!!null\266\266!null\266\266!!!!!!\266!!!!null\266\266!null\266\266!!!!\266!!!!null\266\266!null\266\266!!!!!!\266!!!!null\266\266!null\266\266!!!!\266!!!!null\266\266!null\266\266!!!!!!\266!!!!null\266\266!null\266\266!!!!\266!!!!null\266\266!null\266\266!!!!!!\266!!!!null\266\266!null\266\266!!!!\266!!!!null\266\266!null\266\266!!!!!!!");
    }

    @Test
    public void test07459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07459");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!HHHH!", "\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\300\300\300\300!" + "'", str2, "!\300\300\300\300!");
    }

    @Test
    public void test07460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07460");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u01de\u01db\u01db\u01db\u01de\u01db\u01db\u01db\u01de\u01db\u01db\u01db\u01de\u01db\u01db\u01db\u01de\u01db\u01db\u01db\u01de\u01db\u01db\u01db]]!", "!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}nullnullnullnullnullnullnullnullnullnullnullnull~}}^}nullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "}nullnullnullnullnullnullnullnullnullnullnullnull~}}^}nullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test07461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07461");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL!" + "'", str2, "!!!ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL!");
    }

    @Test
    public void test07462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07462");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU\275\200XUUUXUUU!", "\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!!" + "'", str2, "\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!\275\200!!!!!!!!!");
    }

    @Test
    public void test07463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07463");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276\u0170\u016c\u016e\u016e\276\276\276\u0170\u016c\u016e\u016e\276\276\276\276\276!", "\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276!" + "'", str2, "nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276nullnullnullnull\276\276\276nullnullnullnull\276\276\276\276\276!");
    }

    @Test
    public void test07464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07464");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN\200}}`NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07465");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!", "XXXXXXXXXXXXXXXX\200}}`XXXXXXXXXXXXXXXX]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!" + "'", str2, "!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!");
    }

    @Test
    public void test07466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07466");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("^```^```^```^```^```^```^```^```^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```^```^```^```^```^```^```^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```^```^```^```^```^```^```^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```^```^```^```^```^```^```^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```^```^```^```^```^```^```^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```^```^```^```^```^```^```^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```^```^```^```^```^```^```^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```^```^```^```^```^```^```^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```UUUUUUUU\225\225UUUUUUUU\225\225!", "\u020c\u020b\u020e\u020e\u020c\u020b\u020e\u020e\u020c\u020b\u020e\u020e\u020c\u020b\u020e\u020e\u020c\u020b\u020e\u020e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```^```^```^```^```^```^```^```^```!!!!!!!!\225\225!!!!!!!!\225\225^```^```!!!!!!!!\225\225!!!!!!!!\225\225^```^```^```^```^```^```^```^```^```^```!!!!!!!!\225\225!!!!!!!!\225\225^```^```!!!!!!!!\225\225!!!!!!!!\225\225^```^```^```^```^```^```^```^```^```^```!!!!!!!!\225\225!!!!!!!!\225\225^```^```!!!!!!!!\225\225!!!!!!!!\225\225^```^```^```^```^```^```^```^```^```^```!!!!!!!!\225\225!!!!!!!!\225\225^```^```!!!!!!!!\225\225!!!!!!!!\225\225^```^```^```^```^```^```^```^```^```^```!!!!!!!!\225\225!!!!!!!!\225\225^```^```!!!!!!!!\225\225!!!!!!!!\225\225^```^```^```^```^```^```^```^```^```^```!!!!!!!!\225\225!!!!!!!!\225\225^```^```!!!!!!!!\225\225!!!!!!!!\225\225^```^```^```^```^```^```^```^```^```^```!!!!!!!!\225\225!!!!!!!!\225\225^```^```!!!!!!!!\225\225!!!!!!!!\225\225^```^```^```^```^```^```^```^```^```^```!!!!!!!!\225\225!!!!!!!!\225\225^```^```!!!!!!!!\225\225!!!!!!!!\225\225!" + "'", str2, "^```^```^```^```^```^```^```^```^```^```!!!!!!!!\225\225!!!!!!!!\225\225^```^```!!!!!!!!\225\225!!!!!!!!\225\225^```^```^```^```^```^```^```^```^```^```!!!!!!!!\225\225!!!!!!!!\225\225^```^```!!!!!!!!\225\225!!!!!!!!\225\225^```^```^```^```^```^```^```^```^```^```!!!!!!!!\225\225!!!!!!!!\225\225^```^```!!!!!!!!\225\225!!!!!!!!\225\225^```^```^```^```^```^```^```^```^```^```!!!!!!!!\225\225!!!!!!!!\225\225^```^```!!!!!!!!\225\225!!!!!!!!\225\225^```^```^```^```^```^```^```^```^```^```!!!!!!!!\225\225!!!!!!!!\225\225^```^```!!!!!!!!\225\225!!!!!!!!\225\225^```^```^```^```^```^```^```^```^```^```!!!!!!!!\225\225!!!!!!!!\225\225^```^```!!!!!!!!\225\225!!!!!!!!\225\225^```^```^```^```^```^```^```^```^```^```!!!!!!!!\225\225!!!!!!!!\225\225^```^```!!!!!!!!\225\225!!!!!!!!\225\225^```^```^```^```^```^```^```^```^```^```!!!!!!!!\225\225!!!!!!!!\225\225^```^```!!!!!!!!\225\225!!!!!!!!\225\225!");
    }

    @Test
    public void test07467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07467");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!" + "'", str2, "!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!");
    }

    @Test
    public void test07468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07468");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8~~!", "\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016enullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~!");
    }

    @Test
    public void test07469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07469");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\260\260NN\260\260NN}}\260\260NN\260\260NN}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07470");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225!", "\u0346\u0348\u0348\u0348\u037e\u037e\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225!" + "'", str2, "\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225!");
    }

    @Test
    public void test07471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07471");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test07472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07472");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214!", "````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214!" + "'", str2, "\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214!");
    }

    @Test
    public void test07473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07473");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!" + "'", str2, "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!");
    }

    @Test
    public void test07474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07474");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!", "nullnullnullnull\200}}`nullnullnullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200unllunllunllunll}}\200unllunllunllunll}}\200unllunllunllunll}}\200unllunllunllunll}}\200unllunllunllunll}}\200unllunllunllunll}}\200unllunllunllunll}}\200unllunllunllunll}}\200unllunllunllunll}}\200unllunllunllunll}}\200unllunllunllunll}}\200unllunllunllunll}}\200unllunllunllunll}}\200unllunllunllunll}}\200unllunllunllunll}}\200unllunllunllunll}}``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!" + "'", str2, "\200unllunllunllunll}}\200unllunllunllunll}}\200unllunllunllunll}}\200unllunllunllunll}}\200unllunllunllunll}}\200unllunllunllunll}}\200unllunllunllunll}}\200unllunllunllunll}}\200unllunllunllunll}}\200unllunllunllunll}}\200unllunllunllunll}}\200unllunllunllunll}}\200unllunllunllunll}}\200unllunllunllunll}}\200unllunllunllunll}}\200unllunllunllunll}}``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!");
    }

    @Test
    public void test07475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07475");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]\220\220\216\216\220\220\216\216LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]!", "u!!!u!!!``!u!!!u!!!``u!!!u!!!``u!!!u!!!``!u!!!u!!!``u!!!u!!!``u!!!u!!!``!u!!!u!!!``u!!!u!!!``u!!!u!!!``!u!!!u!!!``u!!!u!!!``u!!!u!!!``!u!!!u!!!``u!!!u!!!``u!!!u!!!``!u!!!u!!!``u!!!u!!!``u!!!u!!!``!u!!!u!!!``u!!!u!!!``u!!!u!!!``!u!!!u!!!``u!!!u!!!``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]!" + "'", str2, "\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]!");
    }

    @Test
    public void test07476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07476");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!", "null\254\256\256null\254\256\256nullnullnullnullnullnullnullnullnull\254\256\256null\254\256\256nullnullnullnullnullnullnullnullnull\254\256\256null\254\256\256nullnullnullnullnullnullnullnullnull\254\256\256null\254\256\256nullnullnullnullnullnullnullnullnull\254\256\256null\254\256\256nullnullnullnullnullnullnullnullnull\254\256\256null\254\256\256nullnullnullnullnullnullnullnullnull\254\256\256null\254\256\256nullnullnullnullnullnullnullnullnull\254\256\256null\254\256\256nullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01ad\u01b0\u01b0\u01b0\u0348\u0348\u01ad\u01b0\u01b0\u01b0\u0348\u0348\u01ad\u01b0\u01b0\u01b0\u0348\u0348\u01ad\u01b0\u01b0\u01b0\u0348\u0348\u01ad\u01b0\u01b0\u01b0\u0348\u0348\u01ad\u01b0\u01b0\u01b0\u0348\u0348\u01ad\u01b0\u01b0\u01b0\u0348\u0348\u01ad\u01b0\u01b0\u01b0\u0348\u0348\u01ad\u01b0\u01b0\u01b0\u0348\u0348\u01ad\u01b0\u01b0\u01b0\u0348\u0348\u01ad\u01b0\u01b0\u01b0\u0348\u0348\u01ad\u01b0\u01b0\u01b0\u0348\u0348!" + "'", str2, "\u01ad\u01b0\u01b0\u01b0\u0348\u0348\u01ad\u01b0\u01b0\u01b0\u0348\u0348\u01ad\u01b0\u01b0\u01b0\u0348\u0348\u01ad\u01b0\u01b0\u01b0\u0348\u0348\u01ad\u01b0\u01b0\u01b0\u0348\u0348\u01ad\u01b0\u01b0\u01b0\u0348\u0348\u01ad\u01b0\u01b0\u01b0\u0348\u0348\u01ad\u01b0\u01b0\u01b0\u0348\u0348\u01ad\u01b0\u01b0\u01b0\u0348\u0348\u01ad\u01b0\u01b0\u01b0\u0348\u0348\u01ad\u01b0\u01b0\u01b0\u0348\u0348\u01ad\u01b0\u01b0\u01b0\u0348\u0348!");
    }

    @Test
    public void test07477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07477");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\200\200\u0346\u0348\u0348!", "\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\200\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnull\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnull\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test07478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07478");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("lluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUU!", "\276\276\300\300\276\276\300\300!!\276\276\300\300\276\276\300\300!!\276\276\300\300\276\276\300\300\276\276\300\300\276\276\300\300!!\276\276\300\300\276\276\300\300!!\276\276\300\300\276\276\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!" + "'", str2, "\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!");
    }

    @Test
    public void test07479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07479");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\270!!!\270!!!\270!!!\270!!!\270!!!\270!!!\270!!!\270!!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\270!!!\270!!!\270!!!\270!!!\270!!!\270!!!\270!!!\270!!!!" + "'", str2, "\270!!!\270!!!\270!!!\270!!!\270!!!\270!!!\270!!!\270!!!!");
    }

    @Test
    public void test07480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07480");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NLLLNULLNULLNULLNULLNLLLNULLNULL!", "!LNNNNN!LNNNNN!LNNNNN!LNNNNN!!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!LNNNNN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02e8\u02e3\u02e3\u02e3\u02e8\u02e3\u02e3\u02e8\u02e3\u02e3\u02e8\u02e3\u02e3\u02e8\u02e3\u02e3\u02e8\u02e3\u02e3\u02e3\u02e8\u02e3\u02e3\u02e8\u02e3\u02e3!" + "'", str2, "\u02e8\u02e3\u02e3\u02e3\u02e8\u02e3\u02e3\u02e8\u02e3\u02e3\u02e8\u02e3\u02e3\u02e8\u02e3\u02e3\u02e8\u02e3\u02e3\u02e3\u02e8\u02e3\u02e3\u02e8\u02e3\u02e3!");
    }

    @Test
    public void test07481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07481");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nulloprr!", "!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u028d\u028e\u0290\u0290nullnullnullnull!" + "'", str2, "\u028d\u028e\u0290\u0290nullnullnullnull!");
    }

    @Test
    public void test07482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07482");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275``\230\230\230\230\230\230\230\230``\230\230\230\230\230\230\230\230``\230\230\230\230\230\230\230\230\276``\230\230\230\230\230\230\230\230\275\275!", "!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275``\230\230\230\230\230\230\230\230``\230\230\230\230\230\230\230\230``\230\230\230\230\230\230\230\230\276``\230\230\230\230\230\230\230\230\275\275!" + "'", str2, "\275``\230\230\230\230\230\230\230\230``\230\230\230\230\230\230\230\230``\230\230\230\230\230\230\230\230\276``\230\230\230\230\230\230\230\230\275\275!");
    }

    @Test
    public void test07483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07483");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\200\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0]]!", "u}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}ll}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200u}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}ll}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test07484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07484");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!~UU!!!!~UU!!!!!!~UU!!!!~UU!!!!!!~UU!!!!~UU!!!!~UU!!!!~UU!!!!!!~UU!!!!~UU!!!!!!~UU!!!!~UU!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~nullnull!!!!~nullnull!!!!!!~nullnull!!!!~nullnull!!!!!!~nullnull!!!!~nullnull!!!!~nullnull!!!!~nullnull!!!!!!~nullnull!!!!~nullnull!!!!!!~nullnull!!!!~nullnull!!!" + "'", str2, "!!~nullnull!!!!~nullnull!!!!!!~nullnull!!!!~nullnull!!!!!!~nullnull!!!!~nullnull!!!!~nullnull!!!!~nullnull!!!!!!~nullnull!!!!~nullnull!!!!!!~nullnull!!!!~nullnull!!!");
    }

    @Test
    public void test07485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07485");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!!" + "'", str2, "`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!!");
    }

    @Test
    public void test07486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07486");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("````````````````````````````````!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200\u014e\u014e\u014e\u014e!!!!!!!!!!!!!!}~\200\200}~\200\200\u014e\u014e\u014e\u014e!!!!!!!!!!!!!!}~\200\200}~\200\200\u014e\u014e\u014e\u014e!!!!!!!!!!!!!!}~\200\200}~\200\200\u014e\u014e\u014e\u014e\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````````````````````````````````!" + "'", str2, "````````````````````````````````!");
    }

    @Test
    public void test07487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07487");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!", "HH!!H~~HH!!H~~HH!!H~~HH!!H~~HH!!H~~HH!!H~~HH!!H~~HH!!H~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!" + "'", str2, "!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!!\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~\230\226~~!");
    }

    @Test
    public void test07488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07488");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!", "!!!!NN!!NN!!NN!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!NN!!NN!!NN!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test07489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07489");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!", "ULLLULLL!!ULLLULLL!!ULLLULLL!!ULLLULLL!!ULLLULLL!!ULLLULLL!!ULLLULLL!!ULLLULLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!L!\200\200L!\200\200L!\200\200L!\200\200!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!!!" + "'", str2, "!L!\200\200L!\200\200L!\200\200L!\200\200!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!L!\200\200L!\200\200L!\200\200L!\200\200!!!!!");
    }

    @Test
    public void test07490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07490");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("P!nullnullP!nullnull!!P!nullnullP!nullnull!!P!nullnullP!nullnullP!nullnullP!nullnull!!P!nullnullP!nullnull!!P!nullnullP!nullnull!", "\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!!" + "'", str2, "!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!!");
    }

    @Test
    public void test07491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07491");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07492");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!", "\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\255\255\255\u0348\u0348!\255\255\255\u0348\u0348!!!\255\255\255\u0348\u0348!\255\255\255\u0348\u0348!!!\255\255\255\u0348\u0348!\255\255\255\u0348\u0348!\255\255\255\u0348\u0348!\255\255\255\u0348\u0348!!!\255\255\255\u0348\u0348!\255\255\255\u0348\u0348!!!\255\255\255\u0348\u0348!\255\255\255\u0348\u0348!" + "'", str2, "!\255\255\255\u0348\u0348!\255\255\255\u0348\u0348!!!\255\255\255\u0348\u0348!\255\255\255\u0348\u0348!!!\255\255\255\u0348\u0348!\255\255\255\u0348\u0348!\255\255\255\u0348\u0348!\255\255\255\u0348\u0348!!!\255\255\255\u0348\u0348!\255\255\255\u0348\u0348!!!\255\255\255\u0348\u0348!\255\255\255\u0348\u0348!");
    }

    @Test
    public void test07493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07493");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!", "\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!" + "'", str2, "\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!!\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214!");
    }

    @Test
    public void test07494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07494");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("L~UUL~UU!!L~UUL~UU!!L~UUL~UUL~UUL~UU!!L~UUL~UU!!L~UUL~UU!", "\u0366\u0365\u0368\u0368nullnull\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L~JJL~JJ!!L~JJL~JJ!!L~JJL~JJL~JJL~JJ!!L~JJL~JJ!!L~JJL~JJ!" + "'", str2, "L~JJL~JJ!!L~JJL~JJ!!L~JJL~JJL~JJL~JJ!!L~JJL~JJ!!L~JJL~JJ!");
    }

    @Test
    public void test07495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07495");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "!~nullnull!~nullnull\220\220!~nullnull!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220!~nullnull!~nullnull\220\220!~nullnull!~nullnull\220\220!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352!!\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352!!\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352!!\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352!!\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352!!\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352!!\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352!!\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352!!\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352\347\350\352\352!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test07496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07496");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253EEEEEEEE\253\253EEEEEEEE\253\253EEEEEEEE\253\253EEEEEEEE\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253EEEEEEEE\253\253EEEEEEEE\253\253!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253!");
    }

    @Test
    public void test07497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07497");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}nullnullnull~}}^}nullnullnull]]!", "]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL!!]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL!!]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL!!]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL!!]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL]nullLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8]]!" + "'", str2, "\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8\u01b3\u01b4\u01b8\u01b8]]!");
    }

    @Test
    public void test07498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07498");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\230\226NULLNULL\236\276\276\230\226NULLNULL\236\276\276!!\230\226NULLNULL\236\276\276\230\226NULLNULL\236\276\276!!\230\226NULLNULL\236\276\276\230\226NULLNULL\236\276\276\230\226NULLNULL\236\276\276\230\226NULLNULL\236\276\276!!\230\226NULLNULL\236\276\276\230\226NULLNULL\236\276\276!!\230\226NULLNULL\236\276\276\230\226NULLNULL\236\276\276!", "nullnull\336\336nullnull\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\226OPRROPRR\236\276\276\230\226OPRROPRR\236\276\276!!\230\226OPRROPRR\236\276\276\230\226OPRROPRR\236\276\276!!\230\226OPRROPRR\236\276\276\230\226OPRROPRR\236\276\276\230\226OPRROPRR\236\276\276\230\226OPRROPRR\236\276\276!!\230\226OPRROPRR\236\276\276\230\226OPRROPRR\236\276\276!!\230\226OPRROPRR\236\276\276\230\226OPRROPRR\236\276\276!" + "'", str2, "\230\226OPRROPRR\236\276\276\230\226OPRROPRR\236\276\276!!\230\226OPRROPRR\236\276\276\230\226OPRROPRR\236\276\276!!\230\226OPRROPRR\236\276\276\230\226OPRROPRR\236\276\276\230\226OPRROPRR\236\276\276\230\226OPRROPRR\236\276\276!!\230\226OPRROPRR\236\276\276\230\226OPRROPRR\236\276\276!!\230\226OPRROPRR\236\276\276\230\226OPRROPRR\236\276\276!");
    }

    @Test
    public void test07499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07499");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!!!!!!!", "\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!!" + "'", str2, "nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!!!");
    }

    @Test
    public void test07500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07500");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!!!!]!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }
}
