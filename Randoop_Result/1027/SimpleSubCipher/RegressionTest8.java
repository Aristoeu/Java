package SimpleSubCipher;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test04001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04001");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u029e\u0346\u0346\ua7b0!!!", "nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346null!!!" + "'", str2, "\u0346\u0346null!!!");
    }

    @Test
    public void test04002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04002");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!" + "'", str2, "\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!");
    }

    @Test
    public void test04003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04003");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL!", "\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016enullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108!" + "'", str2, "\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108!");
    }

    @Test
    public void test04004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04004");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\351\351\352\352\351\351\352\352!!\351\351\352\352\351\351\352\352!!\351\351\352\352\351\351\352\352\351\351\352\352\351\351\352\352!!\351\351\352\352\351\351\352\352!!\351\351\352\352\351\351\352\352!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04005");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\u0366\u0365\u0368\u0368\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04006");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\200}}`!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!]]!", "\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\200}}`!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!]]!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\200}}`!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!]]!");
    }

    @Test
    public void test04007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04007");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368LLLLLLLL!", "XXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxx!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368XXXXXXXX!" + "'", str2, "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368XXXXXXXX!");
    }

    @Test
    public void test04008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04008");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\351\354\354\354\351\354\354\354\351\354\354\354\351\354\354\354\200}}`\351\354\354\354\351\354\354\354\351\354\354\354\351\354\354\354]]!", "\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test04009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04009");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LULLLULL!!LULLLULL!!LULLLULLLULLLULL!!LULLLULL!!LULLLULL!", "!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test04010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04010");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\276!", "\253\253\253\253\253\253\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\276!" + "'", str2, "!\276!");
    }

    @Test
    public void test04011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04011");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "\253\254\256\256nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!" + "'", str2, "~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
    }

    @Test
    public void test04012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04012");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170!", "!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!!oprroprroprroprroprroprroprroprr!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!oprroprroprroprr!" + "'", str2, "!oprroprroprroprr!");
    }

    @Test
    public void test04013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04013");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u041b\u041c\u041c\u041c\u0346\u0348\u0348!", "\253\253\253\253\253\253\253\253!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test04014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04014");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull!", "\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~!" + "'", str2, "\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~!");
    }

    @Test
    public void test04015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04015");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull!!nullnull!!]nullnullnull]nullnullnullnullnull!!nullnull!!]nullnullnull]nullnullnullnullnull!!nullnull!!]nullnullnull]nullnullnullnullnull!!nullnull!!]nullnullnull]nullnullnullnullnull!!nullnull!!]nullnullnull]nullnullnullnullnull!!nullnull!!]nullnullnull]nullnullnullnullnull!!nullnull!!]nullnullnull]nullnullnullnullnull!!nullnull!!]nullnullnull]nullnullnull!", "l!nnl!nnnullnulll!nnl!nnnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200!" + "'", str2, "}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200!");
    }

    @Test
    public void test04016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04016");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "}~\200\200}~\200\200LUELLUELLUELL^LUELLUELLUELLLUELLUELLUELLLUELLUELLUELL^LUELLUELLUELLLUELLUELLUELL}~\200\200}~\200\200LUELLUELLUELL^LUELLUELLUELLLUELLUELLUELLLUELLUELLUELL^LUELLUELLUELLLUELLUELLUELL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ELLLELLLELLLELLLELLLELLLELLLELLLELLLELLLELLLELLLELLLELLL!" + "'", str2, "ELLLELLLELLLELLLELLLELLLELLLELLLELLLELLLELLLELLLELLLELLL!");
    }

    @Test
    public void test04017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04017");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NN!!NN!!!", "\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!LL!!!" + "'", str2, "LL!!LL!!!");
    }

    @Test
    public void test04018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04018");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!", "\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!" + "'", str2, "null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!");
    }

    @Test
    public void test04019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04019");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!!", "NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test04020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04020");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("qrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnull!", "UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN!" + "'", str2, "\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN!");
    }

    @Test
    public void test04021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04021");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e!", "!\253\256\256\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04022");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b!!!", "L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!!");
    }

    @Test
    public void test04023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04023");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348!", "LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348!" + "'", str2, "\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348!");
    }

    @Test
    public void test04024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04024");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HFFFHFFF!", "\u0346\u0346null!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346!!!!" + "'", str2, "\u0346\u0346!!!!");
    }

    @Test
    public void test04025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04025");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!", "TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!ttTT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!ttTT!!TT!!tt!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!" + "'", str2, "!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!");
    }

    @Test
    public void test04026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04026");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0262\214\214\u0264\u0264\u0262\u0262\u0262\214\214!", "`ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL`ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214!");
    }

    @Test
    public void test04027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04027");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326!", "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368LLLLLLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276L\266\266~LL\276L\266\266~LL!!\276L\266\266~LL\276L\266\266~LL!!\276L\266\266~LL\276L\266\266~LL\276L\266\266~LL\276L\266\266~LL!!\276L\266\266~LL\276L\266\266~LL!!\276L\266\266~LL\276L\266\266~LL!" + "'", str2, "\276L\266\266~LL\276L\266\266~LL!!\276L\266\266~LL\276L\266\266~LL!!\276L\266\266~LL\276L\266\266~LL\276L\266\266~LL\276L\266\266~LL!!\276L\266\266~LL\276L\266\266~LL!!\276L\266\266~LL\276L\266\266~LL!");
    }

    @Test
    public void test04028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04028");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200\300\335\335\335\214\300\335\335\335\300\335\335\335\300\335\335\335\214\300\335\335\335\300\335\335\335}~\200\200}~\200\200\300\335\335\335\214\300\335\335\335\300\335\335\335\300\335\335\335\214\300\335\335\335\300\335\335\335}~\200\200}~\200\200\300\335\335\335\214\300\335\335\335\300\335\335\335\300\335\335\335\214\300\335\335\335\300\335\335\335}~\200\200}~\200\200\300\335\335\335\214\300\335\335\335\300\335\335\335\300\335\335\335\214\300\335\335\335\300\335\335\335\u0348\u0346\u0346!", "UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200UUUU\214UUUUUUUUUUUU\214UUUUUUUU}~\200\200}~\200\200UUUU\214UUUUUUUUUUUU\214UUUUUUUU}~\200\200}~\200\200UUUU\214UUUUUUUUUUUU\214UUUUUUUU}~\200\200}~\200\200UUUU\214UUUUUUUUUUUU\214\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200UUUU\214UUUUUUUUUUUU\214UUUUUUUU}~\200\200}~\200\200UUUU\214UUUUUUUUUUUU\214UUUUUUUU}~\200\200}~\200\200UUUU\214UUUUUUUUUUUU\214UUUUUUUU}~\200\200}~\200\200UUUU\214UUUUUUUUUUUU\214\u0348\u0346\u0346!");
    }

    @Test
    public void test04029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04029");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("llllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLL!", "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201!" + "'", str2, "\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201!");
    }

    @Test
    public void test04030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04030");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214!", "\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214!" + "'", str2, "\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214!");
    }

    @Test
    public void test04031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04031");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```!", "P\220NN\200}}`P\220NN]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````!" + "'", str2, "````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````!");
    }

    @Test
    public void test04032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04032");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!", "nullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de!" + "'", str2, "\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de!");
    }

    @Test
    public void test04033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04033");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("llllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLL!", "hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04034");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200}}`\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230]]!", "PRRRPRRR!!PRRRPRRR!!!!PRRRPRRR!!PRRRPRRR!!!!PRRRPRRR!!PRRRPRRR!!!!PRRRPRRR!!PRRRPRRR!!!!PRRRPRRR!!PRRRPRRR!!!!PRRRPRRR!!PRRRPRRR!!!!PRRRPRRR!!PRRRPRRR!!!!PRRRPRRR!!PRRRPRRR!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200}}`\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230]]!" + "'", str2, "\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200}}`\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230]]!");
    }

    @Test
    public void test04035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04035");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\226\230\230nullnullnullnull\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230nullnullnullnull\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230!", "nullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhh!!nullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhh!!nullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhh!!nullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhh!!nullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLUU\226\230\230LLUULLUULLUULLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUULLUULLUULLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230!" + "'", str2, "LLUU\226\230\230LLUULLUULLUULLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUULLUULLUULLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230!");
    }

    @Test
    public void test04036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04036");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!", "LL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!" + "'", str2, "!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!");
    }

    @Test
    public void test04037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04037");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d!", "]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04038");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull!", "\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04039");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u0346\u0348\u0348!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test04040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04040");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440nullnull!", "\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220\220!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04041");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!", "null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test04042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04042");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]\300\300\300\300\300]]\300\300]]\300\300]]\300\300]]]\300\300\300\300\300]]\300\300]]!", "LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]nullnullnullnullnull]]nullnull]]nullnull]]nullnull]]]nullnullnullnullnull]]nullnull]]!" + "'", str2, "]nullnullnullnullnull]]nullnull]]nullnull]]nullnull]]]nullnullnullnullnull]]nullnull]]!");
    }

    @Test
    public void test04043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04043");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!", "FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test04044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04044");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!", "\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test04045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04045");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("EEEEEEEEEEEEEEEE\200}}`EEEEEEEEEEEEEEEE]]!", "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUUUNLLUNLLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test04046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04046");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!!", "]U!!]U!!!!]U!!]U!!!!]U!!]U!!]U!!]U!!!!]U!!]U!!!!]U!!]U!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!" + "'", str2, "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!");
    }

    @Test
    public void test04047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04047");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!", "~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!" + "'", str2, "}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!");
    }

    @Test
    public void test04048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04048");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
    }

    @Test
    public void test04049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04049");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\275\275\275\275\u0346\u0348\u0348!", "nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\275\275\275\275\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\275\275\275\275\u0346\u0348\u0348!");
    }

    @Test
    public void test04050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04050");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!!!!!!!!!!!!!\254~\256\256\254~\256\256\254~\256\256\254~\256\256!", "\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dcnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!\254~\256\256\254~\256\256\254~\256\256\254~\256\256!" + "'", str2, "!!!!!!!!!!!!!!!!\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
    }

    @Test
    public void test04051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04051");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("`ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL`ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL!", "\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\200\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04052");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!", "\276\276!!\276\276!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!" + "'", str2, "!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!");
    }

    @Test
    public void test04053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04053");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "WXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXWXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XX!" + "'", str2, "WXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXWXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXWXXX\275WXXXWXXXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XX!");
    }

    @Test
    public void test04054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04054");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e!!!", "\u0366\u0365\u0368\u0368\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test04055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04055");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300!", "nullnull]]nullnull]]nullnullnullnullnullnullnullnullnullnull]]nullnull]]nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04056");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246!!!```!", "ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll\200}}`ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```!" + "'", str2, "nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```!");
    }

    @Test
    public void test04057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04057");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368!!\216\216\u0346\u0348\u0348!", "\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368!!\216\216\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368!!\216\216\u0346\u0348\u0348!");
    }

    @Test
    public void test04058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04058");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u0348\u0346\u0346!", "nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u0348\u0346\u0346!");
    }

    @Test
    public void test04059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04059");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]]\220\220]]\220\220!!]]\220\220]]\220\220!!]]\220\220]]\220\220]]\220\220]]\220\220!!]]\220\220]]\220\220!!]]\220\220]]\220\220!", "~~!!U~~~U~~~U~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!U~~~U~~~U~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]\220\220]]\220\220!!]]\220\220]]\220\220!!]]\220\220]]\220\220]]\220\220]]\220\220!!]]\220\220]]\220\220!!]]\220\220]]\220\220!" + "'", str2, "]]\220\220]]\220\220!!]]\220\220]]\220\220!!]]\220\220]]\220\220]]\220\220]]\220\220!!]]\220\220]]\220\220!!]]\220\220]]\220\220!");
    }

    @Test
    public void test04060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04060");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!~LL!~LL!!!~LL!~LL!!!~LL!~LL!~LL!~LL!!!~LL!~LL!!!~LL!~LL!", "!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~!!!~!!!!!~!!!~!!!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!" + "'", str2, "!~!!!~!!!!!~!!!~!!!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!");
    }

    @Test
    public void test04061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04061");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "}~\200\200}~\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL}~\200\200}~\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04062");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!", "`nullnullnull`nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!" + "'", str2, "!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!");
    }

    @Test
    public void test04063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04063");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\253\254\256\256nullnullnullnull\253\254\256\256nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04064");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```!", "\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043bnullnullnullnullnullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```!" + "'", str2, "UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```!");
    }

    @Test
    public void test04065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04065");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256!", "null!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256!" + "'", str2, "UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256!");
    }

    @Test
    public void test04066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04066");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!" + "'", str2, "\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!");
    }

    @Test
    public void test04067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04067");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\253\256\256]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX]!\225\225\225XX!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test04068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04068");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!", "nullnullnullnull\260null\255\255\260null\255\255!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUU\200}}`LUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUU]]!" + "'", str2, "LUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUU\200}}`LUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUU]]!");
    }

    @Test
    public void test04069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04069");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!", "nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnull\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!" + "'", str2, "!!!");
    }

    @Test
    public void test04070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04070");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368!", "!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368!" + "'", str2, "\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368!");
    }

    @Test
    public void test04071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04071");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("hhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHH!", "\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04072");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368!", "HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368!" + "'", str2, "\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368!");
    }

    @Test
    public void test04073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04073");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("HFFFHFFF!", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04074");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!" + "'", str2, "!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!");
    }

    @Test
    public void test04075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04075");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!~~!!~~!!!!~~!!~~!!!!~~!!~~!!~~!!~~!!!!~~!!~~!!!!~~!!~~!", "nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~~!!~~!!!!~~!!~~!!!!~~!!~~!!~~!!~~!!!!~~!!~~!!!!~~!!~~!" + "'", str2, "!!~~!!~~!!!!~~!!~~!!!!~~!!~~!!~~!!~~!!!!~~!!~~!!!!~~!!~~!");
    }

    @Test
    public void test04076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04076");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226!!LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226LLLL\230\226\226!!!", "!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN\200}}`!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226!!NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226!!!" + "'", str2, "NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226!!NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226!!!");
    }

    @Test
    public void test04077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04077");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]]!!]]!!!!]]!!]]!!!!]]!!]]!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!", "nullUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]!!]]!!!!]]!!]]!!!!]]!!]]!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!" + "'", str2, "]]!!]]!!!!]]!!]]!!!!]]!!]]!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!");
    }

    @Test
    public void test04078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04078");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!!", "\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!!" + "'", str2, "~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!!");
    }

    @Test
    public void test04079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04079");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]`^^]`^^!", "\276L\266\266~LL\276L\266\266~LL!!\276L\266\266~LL\276L\266\266~LL!!\276L\266\266~LL\276L\266\266~LL\276L\266\266~LL\276L\266\266~LL!!\276L\266\266~LL\276L\266\266~LL!!\276L\266\266~LL\276L\266\266~LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]`^^]`^^!" + "'", str2, "]`^^]`^^!");
    }

    @Test
    public void test04080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04080");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226!!]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226!!!", "nullnullLULLLULLLULLLULLnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226!!]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226!!!" + "'", str2, "]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226!!]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226]^``\230\226\226!!!");
    }

    @Test
    public void test04081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04081");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!}!!!}!!!!!}!!!}!!!!!}!!!}!!!}!!!}!!!!!}!!!}!!!!!}!!!}!!!", "LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!}!!!}!!!!!}!!!}!!!!!}!!!}!!!}!!!}!!!!!}!!!}!!!!!}!!!}!!!" + "'", str2, "!}!!!}!!!!!}!!!}!!!!!}!!!}!!!}!!!}!!!!!}!!!}!!!!!}!!!}!!!");
    }

    @Test
    public void test04082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04082");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!" + "'", str2, "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!");
    }

    @Test
    public void test04083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04083");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\275\275\275null\275\275\275!!null\275\275\275null\275\275\275!!null\275\275\275null\275\275\275null\275\275\275null\275\275\275!!null\275\275\275null\275\275\275!!null\275\275\275null\275\275\275!", "LLUU!!!LLUU!!!LLUU!!!LLUU!!!LLUU!!!LLUU!!!LLUU!!!LLUU!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\225\223\223\275\275\275null\225\223\223\275\275\275!!null\225\223\223\275\275\275null\225\223\223\275\275\275!!null\225\223\223\275\275\275null\225\223\223\275\275\275null\225\223\223\275\275\275null\225\223\223\275\275\275!!null\225\223\223\275\275\275null\225\223\223\275\275\275!!null\225\223\223\275\275\275null\225\223\223\275\275\275!" + "'", str2, "null\225\223\223\275\275\275null\225\223\223\275\275\275!!null\225\223\223\275\275\275null\225\223\223\275\275\275!!null\225\223\223\275\275\275null\225\223\223\275\275\275null\225\223\223\275\275\275null\225\223\223\275\275\275!!null\225\223\223\275\275\275null\225\223\223\275\275\275!!null\225\223\223\275\275\275null\225\223\223\275\275\275!");
    }

    @Test
    public void test04084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04084");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u019d\u0198\u0198\u0346\u0348\u0348!", "\275XXX\275XXX!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test04085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04085");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170!", "NULLLNUULNUULNUULNUUNULLLNUULNUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~\200}}~\200}}~\200}}~\200}}nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~\200}}~\200}}~\200}}~\200}}nullnullnullnullnullnullnullnull!" + "'", str2, "~\200}}~\200}}~\200}}~\200}}nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~\200}}~\200}}~\200}}~\200}}nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04086");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!", "nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!" + "'", str2, "!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!");
    }

    @Test
    public void test04087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04087");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!", "!\253\256\256\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!" + "'", str2, "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!");
    }

    @Test
    public void test04088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04088");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!", "nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!" + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
    }

    @Test
    public void test04089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04089");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0348l!!\200\u0348l!!]]!", "HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348null!!\200\u0348null!!]]!" + "'", str2, "\u0348null!!\200\u0348null!!]]!");
    }

    @Test
    public void test04090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04090");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200\215\215\215\215\215\215\215\215}~\200\200}~\200\200\215\215\215\215\215\215\215\215!", "~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200\215\215\215\215\215\215\215\215}~\200\200}~\200\200\215\215\215\215\215\215\215\215!" + "'", str2, "}~\200\200}~\200\200\215\215\215\215\215\215\215\215}~\200\200}~\200\200\215\215\215\215\215\215\215\215!");
    }

    @Test
    public void test04091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04091");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e~}\200\200~}\200\200\u014e\u014e\u014e\u014e!", "\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNnullnullLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNnullnull~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNnullnullLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNnullnull~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNnullnullLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNnullnull~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNnullnullLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNnullnull~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNnullnullLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNnullnull~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNnullnullLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNnullnull~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNnullnullLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNnullnull~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNnullnullLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNnullnull!" + "'", str2, "~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNnullnullLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNnullnull~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNnullnullLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNnullnull~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNnullnullLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNnullnull~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNnullnullLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNnullnull~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNnullnullLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNnullnull~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNnullnullLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNnullnull~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNnullnullLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNnullnull~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNnullnullLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNnullnull!");
    }

    @Test
    public void test04092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04092");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!", "\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035bnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!" + "'", str2, "}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!");
    }

    @Test
    public void test04093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04093");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\245\245\245\245\u0346\u0348\u0348!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\245\245\245\245\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\245\245\245\245\u0346\u0348\u0348!");
    }

    @Test
    public void test04094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04094");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("hnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!", "HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!" + "'", str2, "!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!");
    }

    @Test
    public void test04095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04095");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("llLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLLllLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLL!", "\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!" + "'", str2, "!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!");
    }

    @Test
    public void test04096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04096");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214!" + "'", str2, "LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214!");
    }

    @Test
    public void test04097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04097");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "NULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04098");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0126\u0128\u0128\u0126\u0128\u0128!", "\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0104\u0104!LL!!!" + "'", str2, "\u0104\u0104!LL!!!");
    }

    @Test
    public void test04099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04099");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!", "\275\300\276\276\275\300\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04100");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!!", "\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!!" + "'", str2, "\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!!");
    }

    @Test
    public void test04101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04101");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NNNNNNNNNNNNNNNN\200}}`NNNNNNNNNNNNNNNN]]!", "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLL]]!" + "'", str2, "LLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLL]]!");
    }

    @Test
    public void test04102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04102");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NULLLNUULNUULNUULNUUNULLLNUULNUU!", "]!null!!!null!!!null!!!null!!!null!!]]!null!!!null!!]]!null!!!null!!]]!null!!!null!!]]]!null!!!null!!!null!!!null!!!null!!]]!null!!!null!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\305\306\310\310\310\305\306\306\310\305\306\306\310\305\306\306\310\305\306\306\305\306\310\310\310\305\306\306\310\305\306\306!" + "'", str2, "\305\306\310\310\310\305\306\306\310\305\306\306\310\305\306\306\310\305\306\306\305\306\310\310\310\305\306\306\310\305\306\306!");
    }

    @Test
    public void test04103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04103");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("FF]]FF]]FF]]FF]]~}}^FF]]FF]]FF]]FF]]]]!", "porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200!!porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200!!porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200!!porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200!!porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200porrporrporrporrporrporrporrporr\200\200\200\200\200\200\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OO]]OO]]OO]]OO]]~}}^OO]]OO]]OO]]OO]]]]!" + "'", str2, "OO]]OO]]OO]]OO]]~}}^OO]]OO]]OO]]OO]]]]!");
    }

    @Test
    public void test04104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04104");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0107\u0105\u0109\u0109\u0107\u0105\u0109\u0109!", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04105");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!" + "'", str2, "]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!");
    }

    @Test
    public void test04106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04106");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226!!null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226!!!", "\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226!!nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226!!!" + "'", str2, "nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226!!nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226nullnullnullnull\230\226\226!!!");
    }

    @Test
    public void test04107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04107");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL!", "NLLLULNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF!" + "'", str2, "~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF!");
    }

    @Test
    public void test04108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04108");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\200~~~\200~~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04109");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\254~\256\256\254~\256\256\254~\256\256\254~\256\256!", "LIIILIII!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnullee\254~\256\256\254~\256\256\254~\256\256\254~\256\256!" + "'", str2, "nullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnullee\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
    }

    @Test
    public void test04110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04110");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\300\335\335\335\u0346\u0348\u0348!", "!!!ll!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test04111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04111");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\253\256\256\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "TTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRR!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271\266rtrr\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test04112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04112");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!", "^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226^```^```^```^```^```^```^```^```^```^```\230UELL\226\226\230UELL\226\226^```^```\230UELL\226\226\230UELL\226\226!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!" + "'", str2, "!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!");
    }

    @Test
    public void test04113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04113");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!!", "NULLNULL!!NULLNULL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!!" + "'", str2, "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!!");
    }

    @Test
    public void test04114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04114");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214!", "P!nullnullP!nullnull!!P!nullnullP!nullnull!!P!nullnullP!nullnullP!nullnullP!nullnull!!P!nullnullP!nullnull!!P!nullnullP!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214!" + "'", str2, "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214!");
    }

    @Test
    public void test04115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04115");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!!RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!!RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!!RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!!RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!", "NN]]NN]]UNNNUNNNNN]]NN]]UNNNUNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!" + "'", str2, "NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!");
    }

    @Test
    public void test04116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04116");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04117");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NULLNULLNULLNULLNULL!", "\u0366\u0365\u0368\u0368UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0144\u0143\u0146\u0146\u0144\u0143\u0146\u0146\u0144\u0143\u0146\u0146\u0144\u0143\u0146\u0146\u0144\u0143\u0146\u0146!" + "'", str2, "\u0144\u0143\u0146\u0146\u0144\u0143\u0146\u0146\u0144\u0143\u0146\u0146\u0144\u0143\u0146\u0146\u0144\u0143\u0146\u0146!");
    }

    @Test
    public void test04118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04118");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ijllnullnullnullijllnullnullnullijllnullnullnullijllnullnullnullijllnullnullnullijllnullnullnullijllnullnullnullijllnullnullnull!", "\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226!" + "'", str2, "\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226\225\230\226\226\230\225\226\226\230\225\226\226\230\225\226\226!");
    }

    @Test
    public void test04119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04119");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256!", "\246\246!!\246\246!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256!" + "'", str2, "\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256!");
    }

    @Test
    public void test04120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04120");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!", "~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02a0\u0295\u0298\u0298\u02a0\u0295\u0298\u0298\u02a0\u0295\u0298\u0298\u02a0\u0295\u0298\u0298\u02a0\u0295\u0298\u0298\u02a0\u0295\u0298\u0298\u02a0\u0295\u0298\u0298\u02a0\u0295\u0298\u0298!" + "'", str2, "\u02a0\u0295\u0298\u0298\u02a0\u0295\u0298\u0298\u02a0\u0295\u0298\u0298\u02a0\u0295\u0298\u0298\u02a0\u0295\u0298\u0298\u02a0\u0295\u0298\u0298\u02a0\u0295\u0298\u0298\u02a0\u0295\u0298\u0298!");
    }

    @Test
    public void test04121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04121");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u01c8\u01c5\u01c5\u01c5\u01c8\u01c5\u01c5\u01c5!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04122");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnull}~\200\200}~\200\200nullnull}~\200\200}~\200\200nullnull}~\200\200}~\200\200\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!!" + "'", str2, "\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!\275\275\275\275\275\275\275\275!!!");
    }

    @Test
    public void test04123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04123");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LULLLULL!!LULLLULL!!LULLLULLLULLLULL!!LULLLULL!!LULLLULL!", "\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037enullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNN!!NNNNNNNN!!NNNNNNNNNNNNNNNN!!NNNNNNNN!!NNNNNNNN!" + "'", str2, "NNNNNNNN!!NNNNNNNN!!NNNNNNNNNNNNNNNN!!NNNNNNNN!!NNNNNNNN!");
    }

    @Test
    public void test04124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04124");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275nullnullnull\275nullnullnull!", "!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275H!]]H!]]H!]]\275H!]]H!]]H!]]!" + "'", str2, "\275H!]]H!]]H!]]\275H!]]H!]]H!]]!");
    }

    @Test
    public void test04125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04125");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04126");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u03c0\u03c0\u03c0\u03c0!!\200\200\u0346\u0348\u0348!", "LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368nullnull!!nullnull!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368nullnull!!nullnull!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test04127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04127");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test04128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04128");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!ffFF!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LLUU!" + "'", str2, "!LLUU!");
    }

    @Test
    public void test04129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04129");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368nullnull\204\204nullnullnullnullnull\204\204nullnullnull!!nullnull\204\204nullnullnullnullnull\204\204nullnullnull!!nullnull\204\204nullnullnullnullnull\204\204nullnullnull!!nullnull\204\204nullnullnullnullnull\204\204\u0346\u0348\u0348!", "!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\275!!!\275!!!\204\204\275!!!\275!!!\275!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!\275!!!\275!!!\204\204\275!!!\275!!!\275\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\275!!!\275!!!\204\204\275!!!\275!!!\275!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!\275!!!\275!!!\204\204\275!!!\275!!!\275\u0346\u0348\u0348!");
    }

    @Test
    public void test04130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04130");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NLLLNLLL!", "!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\300\300\300\275\300\300\300!" + "'", str2, "\275\300\300\300\275\300\300\300!");
    }

    @Test
    public void test04131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04131");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UNLLUNLL\253\253UNLLUNLL\253\253UNLLUNLL\253\253UNLLUNLL\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UNLLUNLL\253\253UNLLUNLL\253\253!", "`R!RRRRRR!RRRRRR!RRRRR`R!RRRRRR!RRRRRR!RRRRR!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253!");
    }

    @Test
    public void test04132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04132");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN\200}}`!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN]]!", "\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108nullnull!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!\200}}`!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!]]!" + "'", str2, "!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!\200}}`!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!]]!");
    }

    @Test
    public void test04133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04133");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnull\253\253nullnull\253\253!", "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253!");
    }

    @Test
    public void test04134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04134");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0\u019e\u019d\u01a0\u01a0!!!", "\276\276NN\276\276NNNN\276\276NN\276\276\276\276NN\276\276NNNN\276\276NN\276\276\276\276NN\276\276NNNN\276\276NN\276\276\276\276NN\276\276NNNN\276\276NN\276\276\276\276NN\276\276NNNN\276\276NN\276\276\276\276NN\276\276NNNN\276\276NN\276\276\276\276NN\276\276NNNN\276\276NN\276\276\276\276NN\276\276NNNN\276\276NN\276\276!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test04135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04135");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("`!!LL!!LL!!LL`!!LL!!LL!!LL!", "HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`!!nullnull!!nullnull!!nullnull`!!nullnull!!nullnull!!nullnull!" + "'", str2, "`!!nullnull!!nullnull!!nullnull`!!nullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test04136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04136");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126!", "NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!!NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!!NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!!NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!!NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLUUL!NLLUU!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLUUL!NLLUU!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLUUL!NLLUU!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLUUL!NLLUU!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLUUL!NLLUU!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLUUL!NLLUU!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLUUL!NLLUU!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLUUL!NLLUU!" + "'", str2, "!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLUUL!NLLUU!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLUUL!NLLUU!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLUUL!NLLUU!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLUUL!NLLUU!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLUUL!NLLUU!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLUUL!NLLUU!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLUUL!NLLUU!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLUUL!NLLUU!");
    }

    @Test
    public void test04137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04137");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\u0366\u0365\u0368\u0368\300\335\335\335\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04138");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0346!!!!", "!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346!!!!" + "'", str2, "\u0346\u0346!!!!");
    }

    @Test
    public void test04139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04139");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("xxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!xxuuxxuuxxuuxxuuxxuuxxuuxxuuxxuu!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test04140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04140");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "!]!!!]!!!!!]!!!]!!!!!]!!!]!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04141");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!\300\300!!\300\300!!\300\300!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\300\300!!\300\300!!\300\300!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!nullnull!!nullnull!!nullnull!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!nullnull!!nullnull!!nullnull!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!nullnull!!nullnull!!nullnull!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!nullnull!!nullnull!!nullnull!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test04142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04142");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!\200}}`!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!]]!", "FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\200}}`!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!]]!" + "'", str2, "!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\200}}`!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!]]!");
    }

    @Test
    public void test04143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04143");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NNNNNNNN!!NNNNNNNN!!NNNNNNNNNNNNNNNN!!NNNNNNNN!!NNNNNNNN!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04144");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("efhhefhhefhhefhhefhhefhhefhhefhh!", "\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04145");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLL!", "LL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLL!" + "'", str2, "LLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test04146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04146");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!", "EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!" + "'", str2, "]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!!]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]]]]]]]]]}}]]}}]]!");
    }

    @Test
    public void test04147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04147");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("XXXXXXXX!!XXXXXXXX!!XXXXXXXXXXXXXXXX!!XXXXXXXX!!XXXXXXXX!", "LNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNNLNUULNUUNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUU!!UUUUUUUU!!UUUUUUUUUUUUUUUU!!UUUUUUUU!!UUUUUUUU!" + "'", str2, "UUUUUUUU!!UUUUUUUU!!UUUUUUUUUUUUUUUU!!UUUUUUUU!!UUUUUUUU!");
    }

    @Test
    public void test04148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04148");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!" + "'", str2, "!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!");
    }

    @Test
    public void test04149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04149");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!", "\u023d\u023e\u0240\u0240\u023d\u023e\u0240\u0240\u023d\u023e\u0240\u0240\u023d\u023e\u0240\u0240!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!!" + "'", str2, "PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!!");
    }

    @Test
    public void test04150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04150");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("T!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TT!", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH!" + "'", str2, "H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH!");
    }

    @Test
    public void test04151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04151");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253!", "\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031anullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253!" + "'", str2, "\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253!");
    }

    @Test
    public void test04152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04152");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!!", "!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]\200}}`!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test04153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04153");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUU!!nullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUU!!nullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUU!!nullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUU!!nullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUU!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNN!!UNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNN!!UNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNN!!UNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNN!!UNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNN!" + "'", str2, "UNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNN!!UNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNN!!UNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNN!!UNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNN!!UNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNN!");
    }

    @Test
    public void test04154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04154");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226!!LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226LNUULNUULNUULNUU\230\226\226!!!", "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LLL!LLL!LLL!LLL\230\226\226!LLL!LLL!LLL!LLL\230\226\226!LLL!LLL!LLL!LLL\230\226\226!LLL!LLL!LLL!LLL\230\226\226!LLL!LLL!LLL!LLL\230\226\226!LLL!LLL!LLL!LLL\230\226\226!LLL!LLL!LLL!LLL\230\226\226!LLL!LLL!LLL!LLL\230\226\226!!!LLL!LLL!LLL!LLL\230\226\226!LLL!LLL!LLL!LLL\230\226\226!LLL!LLL!LLL!LLL\230\226\226!LLL!LLL!LLL!LLL\230\226\226!LLL!LLL!LLL!LLL\230\226\226!LLL!LLL!LLL!LLL\230\226\226!LLL!LLL!LLL!LLL\230\226\226!LLL!LLL!LLL!LLL\230\226\226!!!" + "'", str2, "!LLL!LLL!LLL!LLL\230\226\226!LLL!LLL!LLL!LLL\230\226\226!LLL!LLL!LLL!LLL\230\226\226!LLL!LLL!LLL!LLL\230\226\226!LLL!LLL!LLL!LLL\230\226\226!LLL!LLL!LLL!LLL\230\226\226!LLL!LLL!LLL!LLL\230\226\226!LLL!LLL!LLL!LLL\230\226\226!!!LLL!LLL!LLL!LLL\230\226\226!LLL!LLL!LLL!LLL\230\226\226!LLL!LLL!LLL!LLL\230\226\226!LLL!LLL!LLL!LLL\230\226\226!LLL!LLL!LLL!LLL\230\226\226!LLL!LLL!LLL!LLL\230\226\226!LLL!LLL!LLL!LLL\230\226\226!LLL!LLL!LLL!LLL\230\226\226!!!");
    }

    @Test
    public void test04155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04155");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!", "ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214ijllijllijllijllijllijllijllijll\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!III!III!!!III!III!!!III!III!III!III!III!III!III!III!III!III!!!III!III!!!III!III!III!III!III!III!III!III!III!III!!!III!III!!!III!III!III!III!III!III!III!III!III!III!!!III!III!!!III!III!III!III!III!III!III!III!III!III!!!III!III!!!III!III!III!III!III!III!III!III!III!III!!!III!III!!!III!III!III!III!III!III!III!III!III!III!!!III!III!!!III!III!III!III!III!III!III!III!III!III!!!III!III!!!III!III!III!III!III!III!III!III!" + "'", str2, "!III!III!!!III!III!!!III!III!III!III!III!III!III!III!III!III!!!III!III!!!III!III!III!III!III!III!III!III!III!III!!!III!III!!!III!III!III!III!III!III!III!III!III!III!!!III!III!!!III!III!III!III!III!III!III!III!III!III!!!III!III!!!III!III!III!III!III!III!III!III!III!III!!!III!III!!!III!III!III!III!III!III!III!III!III!III!!!III!III!!!III!III!III!III!III!III!III!III!III!III!!!III!III!!!III!III!III!III!III!III!III!III!");
    }

    @Test
    public void test04156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04156");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null!nullnullnull!nullnullnull!nullnullnull!nullnull\200}}`null!nullnullnull!nullnullnull!nullnullnull!nullnull]]!", "~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull~}\200\200~}\200\200\375!\376\376\375!\376\376nullnull\375!\376\376\375!\376\376nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\200\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0]]!" + "'", str2, "\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\200\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0]]!");
    }

    @Test
    public void test04157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04157");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!~LL!~LL!!!~LL!~LL!!!~LL!~LL!~LL!~LL!!!~LL!~LL!!!~LL!~LL!", "````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!````````````````````````````````````````````````!!!!````````````````````````````````````````````````!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~``!~``!!!~``!~``!!!~``!~``!~``!~``!!!~``!~``!!!~``!~``!" + "'", str2, "!~``!~``!!!~``!~``!!!~``!~``!~``!~``!!!~``!~``!!!~``!~``!");
    }

    @Test
    public void test04158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04158");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400\u0400!!!", "NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test04159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04159");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u02a0\u0295\u0298\u0298\u02a0\u0295\u0298\u0298\u02a0\u0295\u0298\u0298\u02a0\u0295\u0298\u0298\u02a0\u0295\u0298\u0298\u02a0\u0295\u0298\u0298\u02a0\u0295\u0298\u0298\u02a0\u0295\u0298\u0298!", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnull\253\253nullnull\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04160");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\253\254\256\256nullnullnullnull\253\254\256\256nullnull!", "\253\254\256\256!JJJ!JJJ!JJJ!JJJ\253\254\256\256!JJJ!JJJ!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnullnullnull!" + "'", str2, "\253\254\256\256nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04161");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8nullnullnullnullnullnullnullnull!", "\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245!" + "'", str2, "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245!");
    }

    @Test
    public void test04162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04162");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!", "FH!!FH!!FH!!FH!!FH!!FH!!FH!!FH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!" + "'", str2, "\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!!\200\200\200\200\u0348\u0348\200\200\200\200\u0348\u0348!");
    }

    @Test
    public void test04163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04163");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04164");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!!");
    }

    @Test
    public void test04165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04165");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264!", "\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04166");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("ijllijllijllijll!ill!ill!ill!illijllijllijllijll!ill!ill!", "\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnull!nullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnull!nullnullnull!");
    }

    @Test
    public void test04167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04167");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!", "EEEEEEEE!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test04168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04168");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]\256!\254\254\256!\254\254\256!\254\254\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]]\256!\254\254\256!\254\254\256!\254\254\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]!", "UULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULLUULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]\256!\254\254\256!\254\254\256!\254\254\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]]\256!\254\254\256!\254\254\256!\254\254\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]!" + "'", str2, "]\256!\254\254\256!\254\254\256!\254\254\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]]\256!\254\254\256!\254\254\256!\254\254\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]!");
    }

    @Test
    public void test04169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04169");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UNLLUNLL\253\253UNLLUNLL\253\253UNLLUNLL\253\253UNLLUNLL\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UNLLUNLL\253\253UNLLUNLL\253\253!", "}~\200\200}~\200\200\u0170\u0170\u0170\u0170\u0170\u0170nullnullnull}~\200\200}~\200\200\u0170\u0170\u0170\u0170\u0170\u0170nullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LNLLLNLL\253\253LNLLLNLL\253\253LNLLLNLL\253\253LNLLLNLL\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LNLLLNLL\253\253LNLLLNLL\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LNLLLNLL\253\253LNLLLNLL\253\253LNLLLNLL\253\253LNLLLNLL\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LNLLLNLL\253\253LNLLLNLL\253\253!");
    }

    @Test
    public void test04170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04170");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\253\256\256\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!RRRRRRRRRRRRRRRRRRRRRRRR!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test04171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04171");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\215}\215\215\215}\215\215NLLLNLLLNLLLNLLL\215}\215\215\215}\215\215!", "]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215A]]]A]]]A]]]A]]]\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215A]]]A]]]A]]]A]]]\215}\215\215\215}\215\215!");
    }

    @Test
    public void test04172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04172");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180\u017e\u0180\u0180\u0180!", "t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test04173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04173");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("U!LLU!LL!!U!LLU!LL!!!", "UUU!!UUUUU!!UU!!UUU!!UUUUU!!UU!!UUU!!UUUUU!!UUUUU!!UUUUU!!UU!!UUU!!UUUUU!!UU!!UUU!!UUUUU!!UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\234!nullnull\234!nullnull!!\234!nullnull\234!nullnull!!!" + "'", str2, "\234!nullnull\234!nullnull!!\234!nullnull\234!nullnull!!!");
    }

    @Test
    public void test04174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04174");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test04175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04175");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0146\u0146\u0146\u0146\u0146\u0146\u0146\u0146\u0346\u0348\u0348!", "!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test04176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04176");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("EHHH\200}}`EHHH]]!", "ULLLULLLULLLULLLULLLULLLULLLULLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ULLL\200}}`ULLL]]!" + "'", str2, "ULLL\200}}`ULLL]]!");
    }

    @Test
    public void test04177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04177");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NLLLNLLL!", "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u017e\u017e\u017e\u017e\u017e\u017e!" + "'", str2, "\u017e\u017e\u017e\u017e\u017e\u017e!");
    }

    @Test
    public void test04178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04178");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!", "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248!" + "'", str2, "\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248!");
    }

    @Test
    public void test04179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04179");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d!", "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04180");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!", "null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226!!null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255!" + "'", str2, "\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255\257!\255\255!");
    }

    @Test
    public void test04181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04181");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016dnullnullnullnullnullnullnullnull!", "\u0289\u028a\u028c\u028c!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04182");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN}~\200\200}~\200\200LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN!", "!X!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04183");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!!!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!!!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!!!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!!!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!", "XXXX\200}}`XXXX]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!" + "'", str2, "!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!");
    }

    @Test
    public void test04184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04184");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230!", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200XXXX}\200\200XXXX}\200\200\230\230XXXX}\200\200XXXX}\200\200\230\230~}\200\200~}\200\200XXXX}\200\200XXXX}\200\200\230\230XXXX}\200\200XXXX}\200\200\230\230~}\200\200~}\200\200XXXX}\200\200XXXX}\200\200\230\230XXXX}\200\200XXXX}\200\200\230\230~}\200\200~}\200\200XXXX}\200\200XXXX}\200\200\230\230XXXX}\200\200XXXX}\200\200\230\230~}\200\200~}\200\200XXXX}\200\200XXXX}\200\200\230\230XXXX}\200\200XXXX}\200\200\230\230~}\200\200~}\200\200XXXX}\200\200XXXX}\200\200\230\230XXXX}\200\200XXXX}\200\200\230\230~}\200\200~}\200\200XXXX}\200\200XXXX}\200\200\230\230XXXX}\200\200XXXX}\200\200\230\230~}\200\200~}\200\200XXXX}\200\200XXXX}\200\200\230\230XXXX}\200\200XXXX}\200\200\230\230!" + "'", str2, "~}\200\200~}\200\200XXXX}\200\200XXXX}\200\200\230\230XXXX}\200\200XXXX}\200\200\230\230~}\200\200~}\200\200XXXX}\200\200XXXX}\200\200\230\230XXXX}\200\200XXXX}\200\200\230\230~}\200\200~}\200\200XXXX}\200\200XXXX}\200\200\230\230XXXX}\200\200XXXX}\200\200\230\230~}\200\200~}\200\200XXXX}\200\200XXXX}\200\200\230\230XXXX}\200\200XXXX}\200\200\230\230~}\200\200~}\200\200XXXX}\200\200XXXX}\200\200\230\230XXXX}\200\200XXXX}\200\200\230\230~}\200\200~}\200\200XXXX}\200\200XXXX}\200\200\230\230XXXX}\200\200XXXX}\200\200\230\230~}\200\200~}\200\200XXXX}\200\200XXXX}\200\200\230\230XXXX}\200\200XXXX}\200\200\230\230~}\200\200~}\200\200XXXX}\200\200XXXX}\200\200\230\230XXXX}\200\200XXXX}\200\200\230\230!");
    }

    @Test
    public void test04185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04185");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!", "\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!" + "'", str2, "\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!");
    }

    @Test
    public void test04186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04186");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c!", "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04187");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04188");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNN!", "UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!LL!!!LLL!LLLLL!!LL!!!LLL!LLLLL!!LL!!!LLL!LLLLL!!LL!!!LLL!LLLLL!!LL!!!LLL!LLLLL!!LL!!!LLL!LLLLL!!LL!!!LLL!LLLLL!!LL!!!LLL!LLL!" + "'", str2, "LL!!LL!!!LLL!LLLLL!!LL!!!LLL!LLLLL!!LL!!!LLL!LLLLL!!LL!!!LLL!LLLLL!!LL!!!LLL!LLLLL!!LL!!!LLL!LLLLL!!LL!!!LLL!LLLLL!!LL!!!LLL!LLL!");
    }

    @Test
    public void test04189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04189");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull!", "unllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULLNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULL~}\200\200~}\200\200NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULLNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULL~}\200\200~}\200\200NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULLNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULL~}\200\200~}\200\200NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULLNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULL~}\200\200~}\200\200NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULLNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULL~}\200\200~}\200\200NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULLNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULL~}\200\200~}\200\200NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULLNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULL~}\200\200~}\200\200NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULLNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULL!" + "'", str2, "~}\200\200~}\200\200NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULLNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULL~}\200\200~}\200\200NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULLNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULL~}\200\200~}\200\200NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULLNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULL~}\200\200~}\200\200NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULLNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULL~}\200\200~}\200\200NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULLNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULL~}\200\200~}\200\200NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULLNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULL~}\200\200~}\200\200NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULLNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULL~}\200\200~}\200\200NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULLNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNULLNULL!");
    }

    @Test
    public void test04190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04190");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!!``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!!``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!!``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!!``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!", "`JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ`JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!!``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!!``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!!``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!!``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!" + "'", str2, "``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!!``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!!``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!!``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!!``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!");
    }

    @Test
    public void test04191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04191");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNN!", "l!uul!uul!uul!uul!uul!uul!uul!uu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!!" + "'", str2, "U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!!");
    }

    @Test
    public void test04192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04192");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275LLL\275LLL!", "\u0176\u0175\u0178\u0178\u0176\u0175\u0178\u0178\u0176\u0175\u0178\u0178\u0176\u0175\u0178\u0178!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\u0174\u0174\u0174\275\u0174\u0174\u0174!" + "'", str2, "\275\u0174\u0174\u0174\275\u0174\u0174\u0174!");
    }

    @Test
    public void test04193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04193");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLL!", "JLLLJLLLJLLLJLLLJLLLJLLLJLLLJLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull``!nullnull``nullnull``nullnull``!nullnull``nullnull``nullnull``!nullnull``nullnull``nullnull``!nullnull``nullnull``nullnull``!nullnull``nullnull``nullnull``!nullnull``nullnull``nullnull``!nullnull``nullnull``nullnull``!nullnull``nullnull``!" + "'", str2, "nullnull``!nullnull``nullnull``nullnull``!nullnull``nullnull``nullnull``!nullnull``nullnull``nullnull``!nullnull``nullnull``nullnull``!nullnull``nullnull``nullnull``!nullnull``nullnull``nullnull``!nullnull``nullnull``nullnull``!nullnull``nullnull``!");
    }

    @Test
    public void test04194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04194");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!!" + "'", str2, "\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!!");
    }

    @Test
    public void test04195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04195");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLL!", "}~\200\200}~\200\200\215\215\215\215\215\215\215\215}~\200\200}~\200\200\215\215\215\215\215\215\215\215!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04196");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!ffFF!", "HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HHHH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HH\275\275HHH\275\275HHHHH\275\275HH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!HHHH!" + "'", str2, "!HHHH!");
    }

    @Test
    public void test04197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04197");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fanullnullnull!", "LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02faLNNNLNNNLNNN!" + "'", str2, "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02faLNNNLNNNLNNN!");
    }

    @Test
    public void test04198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04198");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!!", "!LUU!LUU!LUU!LUU!UUU!UUU!UUU!UUU!LUU!LUU!LUU!LUU!UUU!UUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!" + "'", str2, "LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!");
    }

    @Test
    public void test04199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04199");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!ffFF!", "LL!!LL!!!LLL!LLLLL!!LL!!!LLL!LLLLL!!LL!!!LLL!LLLLL!!LL!!!LLL!LLLLL!!LL!!!LLL!LLLLL!!LL!!!LLL!LLLLL!!LL!!!LLL!LLLLL!!LL!!!LLL!LLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LLLL!" + "'", str2, "!LLLL!");
    }

    @Test
    public void test04200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04200");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU!", "nullnullnullnull\260null\255\255\260null\255\255!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!nullnullnullnull\260null\255\255\260null\255\255!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL!" + "'", str2, "\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL!");
    }

    @Test
    public void test04201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04201");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!LUU!LUU!LUU!LUU!UUU!UUU!UUU!UUU!LUU!LUU!LUU!LUU!UUU!UUU!", "\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
    }

    @Test
    public void test04202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04202");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHH!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04203");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "N~LLN~LL!!N~LLN~LL!!N~LLN~LLN~LLN~LL!!N~LLN~LL!!N~LLN~LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04204");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7\u03a8\u03aa\u03a7\u03a7!", "~}\200\200~}\200\200LLUU!LLUULLUULLUU!LLUULLUULLUULLUULLUU!LLUULLUULLUU!LLUULLUULLUULLUU~}\200\200~}\200\200LLUU!LLUULLUULLUU!LLUULLUULLUULLUULLUU!LLUULLUULLUU!LLUULLUULLUULLUU~}\200\200~}\200\200LLUU!LLUULLUULLUU!LLUULLUULLUULLUULLUU!LLUULLUULLUU!LLUULLUULLUULLUU~}\200\200~}\200\200LLUU!LLUULLUULLUU!LLUULLUULLUULLUULLUU!LLUULLUULLUU!LLUULLUULLUULLUU~}\200\200~}\200\200LLUU!LLUULLUULLUU!LLUULLUULLUULLUULLUU!LLUULLUULLUU!LLUULLUULLUULLUU~}\200\200~}\200\200LLUU!LLUULLUULLUU!LLUULLUULLUULLUULLUU!LLUULLUULLUU!LLUULLUULLUULLUU~}\200\200~}\200\200LLUU!LLUULLUULLUU!LLUULLUULLUULLUULLUU!LLUULLUULLUU!LLUULLUULLUULLUU~}\200\200~}\200\200LLUU!LLUULLUULLUU!LLUULLUULLUULLUULLUU!LLUULLUULLUU!LLUULLUULLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04205");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!", "JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04206");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "u]uuu]uu!!u]uuu]uu!!u]uuu]uuu]uuu]uu!!u]uuu]uu!!u]uuu]uu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04207");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLL!", "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04208");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]!\253\253]!\253\253!!]!\253\253]!\253\253!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!\253\253]!\253\253!!]!\253\253]!\253\253!!!" + "'", str2, "]!\253\253]!\253\253!!]!\253\253]!\253\253!!!");
    }

    @Test
    public void test04209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04209");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!" + "'", str2, "!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!");
    }

    @Test
    public void test04210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04210");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULL!" + "'", str2, "LLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULL!");
    }

    @Test
    public void test04211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04211");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("AA]]AA]]nullnullAA]]AA]]nullnull!", "llllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL]]LL]]LLLLLLLLLL]]LL]]LLLLLLLL!" + "'", str2, "LL]]LL]]LLLLLLLLLL]]LL]]LLLLLLLL!");
    }

    @Test
    public void test04212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04212");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!", "UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!" + "'", str2, "!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!");
    }

    @Test
    public void test04213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04213");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test04214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04214");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\215}\215\215\215}\215\215nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\215}\215\215\215}\215\215!", "nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\215}\215\215\215}\215\215!");
    }

    @Test
    public void test04215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04215");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("HHHHHHHH!", "U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU!!U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04216");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200\u0170\u0170\u0170\u0170\u0170\u0170nullnullnull}~\200\200}~\200\200\u0170\u0170\u0170\u0170\u0170\u0170nullnullnull!", "\227nullnullnullnullnullnull\227nullnullnull\227nullnullnull\227nullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnull\227nullnullnull\227nullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338}~\200\200}~\200\200\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338!" + "'", str2, "}~\200\200}~\200\200\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338}~\200\200}~\200\200\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338!");
    }

    @Test
    public void test04217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04217");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!!", "\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!!" + "'", str2, "\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!!!!!");
    }

    @Test
    public void test04218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04218");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e\u014e\u014c\u014e\u014e!", "!~HH!~HH\220\220!~HH!~HH\220\220\220!~HH\220\220\220!~HH\220\220\220!~HH\220\220\220!~HH\220\220!~HH!~HH\220\220!~HH!~HH\220\220!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04219");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246!", "LLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6nullnullnullnullnullnullnullnull!" + "'", str2, "\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04220");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhh!", "\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!!" + "'", str2, "\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!!");
    }

    @Test
    public void test04221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04221");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnull!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "qrttqrttqrttqrttqrtt!!!qrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrtt!!!qrttqrttqrttqrttqrttqrttqrttqrtt!" + "'", str2, "qrttqrttqrttqrttqrtt!!!qrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrtt!!!qrttqrttqrttqrttqrttqrttqrttqrtt!");
    }

    @Test
    public void test04222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04222");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!", "!null!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!" + "'", str2, "!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!");
    }

    @Test
    public void test04223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04223");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340null\335\340\340!", "L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u037e\u037b\u037b\u037e\u037b\u037b\u037e\u037b\u037b\u037e\u037b\u037b\u037e\u037b\u037b\u037e\u037b\u037b\u037e\u037b\u037b\u037e\u037b\u037bnullnullnull!" + "'", str2, "\u037e\u037b\u037b\u037e\u037b\u037b\u037e\u037b\u037b\u037e\u037b\u037b\u037e\u037b\u037b\u037e\u037b\u037b\u037e\u037b\u037b\u037e\u037b\u037bnullnullnull!");
    }

    @Test
    public void test04224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04224");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0198\u0198\u0196\u0196\u0198\u0198\u0196\u0196\u0178\u0178\u0176\u0176\u0178\u0178\u0176\u0176\u0198\u0198\u0196\u0196\u0198\u0198\u0196\u0196\u0178\u0178\u0176\u0176\u0178\u0178\u0176\u0176\u0198\u0198\u0196\u0196\u0198\u0198\u0196\u0196\u0178\u0178\u0176\u0176\u0178\u0178\u0176\u0176\u0198\u0198\u0196\u0196\u0198\u0198\u0196\u0196\u0178\u0178\u0176\u0176\u0178\u0178\u0176\u0176\u0198\u0198\u0196\u0196\u0198\u0198\u0196\u0196\u0178\u0178\u0176\u0176\u0178\u0178\u0176\u0176\u0198\u0198\u0196\u0196\u0198\u0198\u0196\u0196\u0178\u0178\u0176\u0176\u0178\u0178\u0176\u0176\u0198\u0198\u0196\u0196\u0198\u0198\u0196\u0196\u0178\u0178\u0176\u0176\u0178\u0178\u0176\u0176\u0198\u0198\u0196\u0196\u0198\u0198\u0196\u0196\u0178\u0178\u0176\u0176\u0178\u0178\u0176\u0176!", "!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04225");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04226");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!!!!!" + "'", str2, "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!!!!!");
    }

    @Test
    public void test04227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04227");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!", "NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test04228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04228");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!nullpnullrrRRnullpnullrrRR!!!", "UUUU!]UU!]UU!]UU!]UUUUUU!]UU!]UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]uuuu]uuu]]]]]uuuu]uuu]]]]!!]uuuu]uuu]]]]]uuuu]uuu]]]]!!]uuuu]uuu]]]]]uuuu]uuu]]]]!!]uuuu]uuu]]]]]uuuu]uuu]]]]!!]uuuu]uuu]]]]]uuuu]uuu]]]]!!]uuuu]uuu]]]]]uuuu]uuu]]]]!!]uuuu]uuu]]]]]uuuu]uuu]]]]!!]uuuu]uuu]]]]]uuuu]uuu]]]]!!!" + "'", str2, "]uuuu]uuu]]]]]uuuu]uuu]]]]!!]uuuu]uuu]]]]]uuuu]uuu]]]]!!]uuuu]uuu]]]]]uuuu]uuu]]]]!!]uuuu]uuu]]]]]uuuu]uuu]]]]!!]uuuu]uuu]]]]]uuuu]uuu]]]]!!]uuuu]uuu]]]]]uuuu]uuu]]]]!!]uuuu]uuu]]]]]uuuu]uuu]]]]!!]uuuu]uuu]]]]]uuuu]uuu]]]]!!!");
    }

    @Test
    public void test04229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04229");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256!", "!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256!" + "'", str2, "~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256~\256\256\256!");
    }

    @Test
    public void test04230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04230");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("ULNNULNNULNNULNNULNNULNNULNNULNN!!ULNNULNNULNNULNNULNNULNNULNNULNN!!!", "null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4!!!" + "'", str2, "\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4!!!");
    }

    @Test
    public void test04231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04231");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!", "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c!" + "'", str2, "\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c!");
    }

    @Test
    public void test04232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04232");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```!", "~~!!U~~~U~~~U~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!U~~~U~~~U~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```!" + "'", str2, "~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```~~~~```!");
    }

    @Test
    public void test04233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04233");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\246\250\250\250\246\250\250\250!", "!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!\300\336\336!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\246\250\250\250\246\250\250\250!" + "'", str2, "\246\250\250\250\246\250\250\250!");
    }

    @Test
    public void test04234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04234");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!\220nullnull!!!", "````````````````\200}}`````````````````]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!" + "'", str2, "!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!\220````````!!!");
    }

    @Test
    public void test04235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04235");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!", "W!XXW!XXW!XXW!XX\200}}`W!XXW!XXW!XXW!XX]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "W!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XX!" + "'", str2, "W!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XX!");
    }

    @Test
    public void test04236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04236");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!!", "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!!!!" + "'", str2, "n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!n\273\273\273\273LLNN\270\270\273LLNN\270\270!!!!!!!");
    }

    @Test
    public void test04237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04237");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("U\220LL\200}}`U\220LL]]!", "\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\220JJ\200}}`\275\220JJ]]!" + "'", str2, "\275\220JJ\200}}`\275\220JJ]]!");
    }

    @Test
    public void test04238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04238");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "nullnullnullnullnullnullnullnull!!````````````nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!````````````nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test04239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04239");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("EEEEEEEEEEEEEEEE\200}}`EEEEEEEEEEEEEEEE]]!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLL]]!" + "'", str2, "LLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLL]]!");
    }

    @Test
    public void test04240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04240");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02be\u02be\u02bb\u02bc\u02be\u02be\u02be\u02be\u02bb\u02bc\u02be\u02be\u02be\u02be\u02bb\u02bc\u02be\u02be\u02be\u02be!", "!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!!\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN\230\226NN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0170\u0170\u0170\u0170nullnullnullnullnullnullnullnullnull!" + "'", str2, "\u0170\u0170\u0170\u0170nullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04241");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\336nullnullnull\336nullnullnull!!\336nullnullnull\336nullnullnull!!\336nullnullnull\336nullnullnull!!\336nullnullnull\336nullnullnull!!\336nullnullnull\336nullnullnull!!\336nullnullnull\336nullnullnull!!\336nullnullnull\336nullnullnull!!\336nullnullnull\336nullnullnull!!!", "\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256\253\254\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\254\253\256\256\254\253\256\256\254\253\256\256null\254\253\256\256\254\253\256\256\254\253\256\256!!null\254\253\256\256\254\253\256\256\254\253\256\256null\254\253\256\256\254\253\256\256\254\253\256\256!!null\254\253\256\256\254\253\256\256\254\253\256\256null\254\253\256\256\254\253\256\256\254\253\256\256!!null\254\253\256\256\254\253\256\256\254\253\256\256null\254\253\256\256\254\253\256\256\254\253\256\256!!null\254\253\256\256\254\253\256\256\254\253\256\256null\254\253\256\256\254\253\256\256\254\253\256\256!!null\254\253\256\256\254\253\256\256\254\253\256\256null\254\253\256\256\254\253\256\256\254\253\256\256!!null\254\253\256\256\254\253\256\256\254\253\256\256null\254\253\256\256\254\253\256\256\254\253\256\256!!null\254\253\256\256\254\253\256\256\254\253\256\256null\254\253\256\256\254\253\256\256\254\253\256\256!!!" + "'", str2, "null\254\253\256\256\254\253\256\256\254\253\256\256null\254\253\256\256\254\253\256\256\254\253\256\256!!null\254\253\256\256\254\253\256\256\254\253\256\256null\254\253\256\256\254\253\256\256\254\253\256\256!!null\254\253\256\256\254\253\256\256\254\253\256\256null\254\253\256\256\254\253\256\256\254\253\256\256!!null\254\253\256\256\254\253\256\256\254\253\256\256null\254\253\256\256\254\253\256\256\254\253\256\256!!null\254\253\256\256\254\253\256\256\254\253\256\256null\254\253\256\256\254\253\256\256\254\253\256\256!!null\254\253\256\256\254\253\256\256\254\253\256\256null\254\253\256\256\254\253\256\256\254\253\256\256!!null\254\253\256\256\254\253\256\256\254\253\256\256null\254\253\256\256\254\253\256\256\254\253\256\256!!null\254\253\256\256\254\253\256\256\254\253\256\256null\254\253\256\256\254\253\256\256\254\253\256\256!!!");
    }

    @Test
    public void test04242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04242");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("IJLLIJLL!!IJLLIJLL!!IJLLIJLLIJLLIJLL!!IJLLIJLL!!IJLLIJLL!", "ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull\214\214nullnull\214\214!!nullnull\214\214nullnull\214\214!!nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214!!nullnull\214\214nullnull\214\214!!nullnull\214\214nullnull\214\214!" + "'", str2, "nullnull\214\214nullnull\214\214!!nullnull\214\214nullnull\214\214!!nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214!!nullnull\214\214nullnull\214\214!!nullnull\214\214nullnull\214\214!");
    }

    @Test
    public void test04243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04243");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!\200}}`!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!]]!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!\200}}`!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!]]!" + "'", str2, "!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!\200}}`!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!]]!");
    }

    @Test
    public void test04244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04244");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULL!", "\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!" + "'", str2, "!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!");
    }

    @Test
    public void test04245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04245");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NLLLULNN!", "\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!\276\276!!\276\276!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\276\276\276\276\276!!!" + "'", str2, "!\276\276\276\276\276!!!");
    }

    @Test
    public void test04246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04246");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225!", "NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!!NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!!NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!!NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!!NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170nullnull\225\225\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170nullnull\225\225\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170nullnull\225\225\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170nullnull\225\225\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170nullnull\225\225\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170nullnull\225\225\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170nullnull\225\225\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170nullnull\225\225!" + "'", str2, "\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170nullnull\225\225\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170nullnull\225\225\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170nullnull\225\225\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170nullnull\225\225\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170nullnull\225\225\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170nullnull\225\225\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170nullnull\225\225\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170nullnull\225\225!");
    }

    @Test
    public void test04247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04247");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL}~\200\200}~\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!", "U!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!}~\200\200}~\200\200UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!!" + "'", str2, "}~\200\200}~\200\200UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!}~\200\200}~\200\200UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!!");
    }

    @Test
    public void test04248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04248");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014enullnull!", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUU!" + "'", str2, "nullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUU!");
    }

    @Test
    public void test04249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04249");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a!!!", "\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!" + "'", str2, "!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test04250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04250");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04251");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129!!!!!", "nullnull]]nullnull]]LnullnullnullLnullnullnullnullnull]]nullnull]]LnullnullnullLnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!" + "'", str2, "!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!");
    }

    @Test
    public void test04252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04252");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL!", "\u0366\u0365\u0368\u0368\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04253");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!UUUUUUUUUUUUUUUU!", "\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126\u0128\u0126\u0126!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!NNNNNNNNNNNNNNNN!" + "'", str2, "!NNNNNNNNNNNNNNNN!");
    }

    @Test
    public void test04254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04254");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\u0345\u0348\u0346\u0346!", "porrporrporrporrporrporrporrporrnullporrnullnullnullporrnullnullporrporrporrporrporrporrporrporrnullporrnullnullnullporrnullnullporrporrporrporrporrporrporrporrnullporrnullnullnullporrnullnullporrporrporrporrporrporrporrporrnullporrnullnullnullporrnullnullporrporrporrporrporrporrporrporrnullporrnullnullnullporrnullnullporrporrporrporrporrporrporrporrnullporrnullnullnullporrnullnullporrporrporrporrporrporrporrporrnullporrnullnullnullporrnullnullporrporrporrporrporrporrporrporrnullporrnullnullnullporrnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test04255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04255");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!" + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
    }

    @Test
    public void test04256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04256");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04257");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!", "~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230~}\200\200~}\200\200jghh}\200\200jghh}\200\200\230\230jghh}\200\200jghh}\200\200\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!" + "'", str2, "!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!");
    }

    @Test
    public void test04258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04258");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!", "!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!!" + "'", str2, "~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!!");
    }

    @Test
    public void test04259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04259");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!!!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!\336\335\335!", "JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!JnullJJJnullJJ!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
    }

    @Test
    public void test04260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04260");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}null\200\200}null\200\200}null\200\200}null\200\200L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~}null\200\200}null\200\200}null\200\200}null\200\200L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~!", "!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~!" + "'", str2, "}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~!");
    }

    @Test
    public void test04261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04261");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("RRRRRRRR!", "!\253\256\256\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04262");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```!", "\u014e\u014c\u014c\u014e\u014c\u014c\u014e\u014c\u014c\u014e\u014c\u014c\u014e\u014c\u014c\u014e\u014c\u014c\u014e\u014c\u014c\u014e\u014c\u014c!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```!" + "'", str2, "nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```!");
    }

    @Test
    public void test04263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04263");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!", "\u0144\u0143\u0146\u0146\u0144\u0143\u0146\u0146\u0144\u0143\u0146\u0146\u0144\u0143\u0146\u0146\u0144\u0143\u0146\u0146!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0143\u0145\u0145\u0143\u0145\u0145\u0143\u0145\u0145\u0143\u0145\u0145\u0143\u0145\u0145\u0143\u0145\u0145\u0143\u0145\u0145\u0143\u0145\u0145!" + "'", str2, "\u0143\u0145\u0145\u0143\u0145\u0145\u0143\u0145\u0145\u0143\u0145\u0145\u0143\u0145\u0145\u0143\u0145\u0145\u0143\u0145\u0145\u0143\u0145\u0145!");
    }

    @Test
    public void test04264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04264");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!", "NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200!!NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200!!NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200!!NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200!!NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL\200\200\200\200\200\200\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!" + "'", str2, "]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!");
    }

    @Test
    public void test04265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04265");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u016e\u016d\u0170\u0170\u014d\u014e\u0150\u0150!", "EE!!EE!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04266");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~N\275!!N\275!!N\275!!N\275!!N\275!!N\275!!N\275!!N\275!!\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~N\275!!N\275!!N\275!!N\275!!N\275!!N\275!!N\275!!N\275!!!", "L\230\230\230\230null\226\226\230null\226\226!!!!L\230\230\230\230null\226\226\230null\226\226!!!!!!L\230\230\230\230null\226\226\230null\226\226!!!!L\230\230\230\230null\226\226\230null\226\226!!!!!!L\230\230\230\230null\226\226\230null\226\226!!!!L\230\230\230\230null\226\226\230null\226\226!!!!!!L\230\230\230\230null\226\226\230null\226\226!!!!L\230\230\230\230null\226\226\230null\226\226!!!!!!L\230\230\230\230null\226\226\230null\226\226!!!!L\230\230\230\230null\226\226\230null\226\226!!!!!!L\230\230\230\230null\226\226\230null\226\226!!!!L\230\230\230\230null\226\226\230null\226\226!!!!!!L\230\230\230\230null\226\226\230null\226\226!!!!L\230\230\230\230null\226\226\230null\226\226!!!!!!L\230\230\230\230null\226\226\230null\226\226!!!!L\230\230\230\230null\226\226\230null\226\226!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!!" + "'", str2, "\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!!");
    }

    @Test
    public void test04267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04267");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!", "!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!" + "'", str2, "!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!");
    }

    @Test
    public void test04268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04268");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\215}\215\215\215}\215\215NLLLNLLLNLLLNLLL\215}\215\215\215}\215\215!", "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215\u014b\u014e\u014e\u014e\u014b\u014e\u014e\u014e\u014b\u014e\u014e\u014e\u014b\u014e\u014e\u014e\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215\u014b\u014e\u014e\u014e\u014b\u014e\u014e\u014e\u014b\u014e\u014e\u014e\u014b\u014e\u014e\u014e\215}\215\215\215}\215\215!");
    }

    @Test
    public void test04269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04269");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\336\336!!\336\336!!!!\336\336!!\336\336!!!!\200\200\u0346\u0348\u0348!", "NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!NLLLNLLL!!NLLLNLLLNLLL\256\254\254NLLLNLLL!!NLLLNLLLNLLL\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368LL!!LL!!!!LL!!LL!!!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368LL!!LL!!!!LL!!LL!!!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test04270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04270");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!", "nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!" + "'", str2, "LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!");
    }

    @Test
    public void test04271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04271");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LL!", "\u03aa\u03aa\u03aa\u038a\u038a\u038a!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test04272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04272");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u03dd\u03de\u03e0\u03e0nullnullnullnull!", "\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\200\200!!\200\200!!\200\200!!\200\200!!!" + "'", str2, "nullnullnullnull\200\200!!\200\200!!\200\200!!\200\200!!!");
    }

    @Test
    public void test04273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04273");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d!", "\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test04274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04274");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\230\230\225\225\230\230\225\225!", "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\230\225\225\230\230\225\225!" + "'", str2, "\230\230\225\225\230\230\225\225!");
    }

    @Test
    public void test04275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04275");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!", "LLUU\226\230\230LLUULLUULLUULLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUULLUULLUULLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230LLUU\226\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!" + "'", str2, "\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!");
    }

    @Test
    public void test04276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04276");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014f!", "\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!" + "'", str2, "!!!");
    }

    @Test
    public void test04277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04277");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!OPRROPRROPRROPRROPRROPRROPRROPRR!!!", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!" + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!");
    }

    @Test
    public void test04278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04278");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN!", "HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!" + "'", str2, "!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!");
    }

    @Test
    public void test04279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04279");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368nullnull\204\204nullnullnullnullnull\204\204nullnullnull!!nullnull\204\204nullnullnullnullnull\204\204nullnullnull!!nullnull\204\204nullnullnullnullnull\204\204nullnullnull!!nullnull\204\204nullnullnullnullnull\204\204\u0346\u0348\u0348!", "\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\204\204\335\336\340\340\335\336\340\340\335\336\340\340\u0346\u0348\u0348!");
    }

    @Test
    public void test04280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04280");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullijllijllijllijllnullnullnullnullijllijll!", "LL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340!" + "'", str2, "nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340!");
    }

    @Test
    public void test04281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04281");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LIIILIII!", "\u014e\u014e\u014e\u014e!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!!!null!!!!" + "'", str2, "null!!!null!!!!");
    }

    @Test
    public void test04282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04282");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!!L\220UU\200~~L\220UU\200~~L\220UUL\220UUL\220UU\200~~L\220UU\200~~L\220UUL\220UU!", "hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!" + "'", str2, "null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!");
    }

    @Test
    public void test04283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04283");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\300\300\300\275\300\300\300!", "EnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnullEnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275UUU\275UUU!" + "'", str2, "\275UUU\275UUU!");
    }

    @Test
    public void test04284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04284");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnull\200}}`nullnullnullnull]]!", "\275UUU\275UUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test04285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04285");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016eUU!!!!!!!", "LULLLULL!!LULLLULL!!LULLLULL!!LULLLULL!!LULLLULL!!LULLLULL!!LULLLULL!!LULLLULL!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LUUUUnullLLUnullLL!!!!LUUUUnullLLUnullLL!!!!!!LUUUUnullLLUnullLL!!!!LUUUUnullLLUnullLL!!!!!!LUUUUnullLLUnullLL!!!!LUUUUnullLLUnullLL!!!!!!LUUUUnullLLUnullLL!!!!LUUUUnullLLUnullLL!!!!!!LUUUUnullLLUnullLL!!!!LUUUUnullLLUnullLL!!!!!!LUUUUnullLLUnullLL!!!!LUUUUnullLLUnullLL!!!!!!LUUUUnullLLUnullLL!!!!LUUUUnullLLUnullLL!!!!!!LUUUUnullLLUnullLL!!!!LUUUUnullLLUnullLL!!!!!!!" + "'", str2, "LUUUUnullLLUnullLL!!!!LUUUUnullLLUnullLL!!!!!!LUUUUnullLLUnullLL!!!!LUUUUnullLLUnullLL!!!!!!LUUUUnullLLUnullLL!!!!LUUUUnullLLUnullLL!!!!!!LUUUUnullLLUnullLL!!!!LUUUUnullLLUnullLL!!!!!!LUUUUnullLLUnullLL!!!!LUUUUnullLLUnullLL!!!!!!LUUUUnullLLUnullLL!!!!LUUUUnullLLUnullLL!!!!!!LUUUUnullLLUnullLL!!!!LUUUUnullLLUnullLL!!!!!!LUUUUnullLLUnullLL!!!!LUUUUnullLLUnullLL!!!!!!!");
    }

    @Test
    public void test04286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04286");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~!", "nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a~~!" + "'", str2, "\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a\u015a\u015a\u0158\u0158\u015a~~!");
    }

    @Test
    public void test04287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04287");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302!", "\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\200\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302!" + "'", str2, "\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302!");
    }

    @Test
    public void test04288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04288");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200}\335\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test04289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04289");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullijllijllijllijllnullnullnullnullijllijll!", "!N!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "bnullnullnullbnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullbnullnullnullbnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "bnullnullnullbnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullbnullnullnullbnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04290");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246\u0243\u0244\u0246\u0246!", "!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull!" + "'", str2, "^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04291");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test04292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04292");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!", "\275HHHHHHHHHHHH\275HHHHHHHHHHHH\275HHHHHHHHHHHH\275HHHHHHHHHHHHHHHHHHHH\275\275HHHHHHHH\275\275HHHHHHHH\275\275HHHHHHHH\275\275\275HHHHHHHHHHHH\275HHHHHHHHHHHH\275HHHHHHHHHHHH\275HHHHHHHHHHHHHHHHHHHH\275\275HHHHHHHH\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!!" + "'", str2, "HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!HHHH!!!!");
    }

    @Test
    public void test04293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04293");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0109\u010e\u010e\u0346\u0348\u0348!", "LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test04294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04294");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\245\245\245\245\u0346\u0348\u0348!", "\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\245\245\245\245\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\245\245\245\245\u0346\u0348\u0348!");
    }

    @Test
    public void test04295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04295");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253!", "LL!!\336`\336\336\336`\336\336\336`\336\336LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\336`\336\336\336`\336\336\336`\336\336LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253!");
    }

    @Test
    public void test04296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04296");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\u037b\u037c\u037e\u037e\u0348\u0346\u0346!", "null\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u037e\u037e\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u037e\u037e\u0348\u0346\u0346!");
    }

    @Test
    public void test04297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04297");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]]AA]]AA!!]]AA]]AA!!]]AA]]AA]]AA]]AA!!]]AA]]AA!!]]AA]]AA!", "F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullF!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]FF]]FF!!]]FF]]FF!!]]FF]]FF]]FF]]FF!!]]FF]]FF!!]]FF]]FF!" + "'", str2, "]]FF]]FF!!]]FF]]FF!!]]FF]]FF]]FF]]FF!!]]FF]]FF!!]]FF]]FF!");
    }

    @Test
    public void test04298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04298");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!", "\246\250\250\250\246\250\250\250!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!````````````nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!````````````nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!````````````nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!````````````nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test04299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04299");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200LUUULUUULUUULUUULUUULUUULUUULUUU}~\200\200}~\200\200LUUULUUULUUULUUULUUULUUULUUULUUU!", "\u023d\u023e\u0240\u0240\u023d\u023e\u0240\u0240\u023d\u023e\u0240\u0240\u023d\u023e\u0240\u0240!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200PNNNPNNNPNNNPNNNPNNNPNNNPNNNPNNN}~\200\200}~\200\200PNNNPNNNPNNNPNNNPNNNPNNNPNNNPNNN!" + "'", str2, "}~\200\200}~\200\200PNNNPNNNPNNNPNNNPNNNPNNNPNNNPNNN}~\200\200}~\200\200PNNNPNNNPNNNPNNNPNNNPNNNPNNNPNNN!");
    }

    @Test
    public void test04300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04300");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!!\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340\335\336\340\340!", "null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL``LL``LL``LL``LL``LL``LL``LL``!!LL``LL``LL``LL``LL``LL``LL``LL``!!LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``!!LL``LL``LL``LL``LL``LL``LL``LL``!!LL``LL``LL``LL``LL``LL``LL``LL``!" + "'", str2, "LL``LL``LL``LL``LL``LL``LL``LL``!!LL``LL``LL``LL``LL``LL``LL``LL``!!LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``!!LL``LL``LL``LL``LL``LL``LL``LL``!!LL``LL``LL``LL``LL``LL``LL``LL``!");
    }

    @Test
    public void test04301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04301");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\215}\215\215\215}\215\215\u014b\u014e\u014e\u014e\u014b\u014e\u014e\u014e\u014b\u014e\u014e\u014e\u014b\u014e\u014e\u014e\215}\215\215\215}\215\215!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215\u014e\u014e\u014e\u014e!!!\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215\u014e\u014e\u014e\u014e!!!\215}\215\215\215}\215\215!");
    }

    @Test
    public void test04302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04302");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275UNLLUNLLUNLL\276UNLL\275\275!", "UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\u0176\u0178\u0178\u0176\u0178\u0178\u0176\u0178\u0178\276\u0176\u0178\u0178\275\275!" + "'", str2, "\275\u0176\u0178\u0178\u0176\u0178\u0178\u0176\u0178\u0178\276\u0176\u0178\u0178\275\275!");
    }

    @Test
    public void test04303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04303");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348!" + "'", str2, "\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348\u0348\u0345\u0348\u0348!");
    }

    @Test
    public void test04304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04304");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!~nullnull!!!!~nullnull!!!!!!~nullnull!!!!~nullnull!!!!!!~nullnull!!!!~nullnull!!!!~nullnull!!!!~nullnull!!!!!!~nullnull!!!!~nullnull!!!!!!~nullnull!!!!~nullnull!!!", "}~\200\200}~\200\200FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHH}~\200\200}~\200\200FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!" + "'", str2, "!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test04305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04305");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull!", "N!!!N!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04306");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!!nullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnull!", "NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!UULLUULL!UULLUULLUULL!UULLUULLUULLUULLUULL!UULLUULLUULL!UULLUULLUULL!!UULLUULL!UULLUULLUULL!UULLUULLUULLUULLUULL!UULLUULLUULL!UULLUULLUULL!!UULLUULL!UULLUULLUULL!UULLUULLUULLUULLUULL!UULLUULLUULL!UULLUULLUULL!!UULLUULL!UULLUULLUULL!UULLUULLUULLUULLUULL!UULLUULLUULL!UULLUULLUULL!!UULLUULL!UULLUULLUULL!UULLUULLUULLUULLUULL!UULLUULLUULL!UULLUULLUULL!!UULLUULL!UULLUULLUULL!UULLUULLUULLUULLUULL!UULLUULLUULL!UULLUULLUULL!!UULLUULL!UULLUULLUULL!UULLUULLUULLUULLUULL!UULLUULLUULL!UULLUULLUULL!!UULLUULL!UULLUULLUULL!UULLUULLUULLUULLUULL!UULLUULLUULL!UULLUULLUULL!" + "'", str2, "!!UULLUULL!UULLUULLUULL!UULLUULLUULLUULLUULL!UULLUULLUULL!UULLUULLUULL!!UULLUULL!UULLUULLUULL!UULLUULLUULLUULLUULL!UULLUULLUULL!UULLUULLUULL!!UULLUULL!UULLUULLUULL!UULLUULLUULLUULLUULL!UULLUULLUULL!UULLUULLUULL!!UULLUULL!UULLUULLUULL!UULLUULLUULLUULLUULL!UULLUULLUULL!UULLUULLUULL!!UULLUULL!UULLUULLUULL!UULLUULLUULLUULLUULL!UULLUULLUULL!UULLUULLUULL!!UULLUULL!UULLUULLUULL!UULLUULLUULLUULLUULL!UULLUULLUULL!UULLUULLUULL!!UULLUULL!UULLUULLUULL!UULLUULLUULLUULLUULL!UULLUULLUULL!UULLUULLUULL!!UULLUULL!UULLUULLUULL!UULLUULLUULLUULLUULL!UULLUULLUULL!UULLUULLUULL!");
    }

    @Test
    public void test04307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04307");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NNNNNNNNNNNNNNNN!NNN!NNN!NNN!NNNNNNNNNNNNNNNNNNN!NNN!NNN!", "}~\200\200}~\200\200\336^LL\336^LL}~\200\200}~\200\200\336^LL\336^LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnull!nullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnull!nullnullnull!");
    }

    @Test
    public void test04308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04308");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLUULLUU}}LLUULLUU}}!", "nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260nullnull\255\256\260\260\255\256\260\260!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\260NN\260\260NN}}\260\260NN\260\260NN}}!" + "'", str2, "\260\260NN\260\260NN}}\260\260NN\260\260NN}}!");
    }

    @Test
    public void test04309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04309");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!", "llLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLLllLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!" + "'", str2, "^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!");
    }

    @Test
    public void test04310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04310");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!", "ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!" + "'", str2, "!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!");
    }

    @Test
    public void test04311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04311");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnulljjnullnulljj!!nullnulljjnullnulljj!!nullnulljjnullnulljjnullnulljjnullnulljj!!nullnulljjnullnulljj!!nullnulljjnullnulljj!", "\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e!" + "'", str2, "\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e!");
    }

    @Test
    public void test04312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04312");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("JLLLJLLLJLLLJLLLJLLLJLLLJLLLJLLL!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ULLLULLLULLLULLLULLLULLLULLLULLL!" + "'", str2, "ULLLULLLULLLULLLULLLULLLULLLULLL!");
    }

    @Test
    public void test04313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04313");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "!\253\253\253!\253\253\253!\253\253\253!\253\253\253\200}}`!\253\253\253!\253\253\253!\253\253\253!\253\253\253]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04314");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!" + "'", str2, "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!");
    }

    @Test
    public void test04315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04315");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368!", "\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368!" + "'", str2, "\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368!");
    }

    @Test
    public void test04316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04316");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!", "!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!" + "'", str2, "!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!");
    }

    @Test
    public void test04317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04317");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("HH!!H~~HH!!H~~HH!!H~~HH!!H~~HH!!H~~HH!!H~~HH!!H~~HH!!H~~!", "\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!null~~nullnull!!null~~nullnull!!null~~nullnull!!null~~nullnull!!null~~nullnull!!null~~nullnull!!null~~nullnull!!null~~!" + "'", str2, "nullnull!!null~~nullnull!!null~~nullnull!!null~~nullnull!!null~~nullnull!!null~~nullnull!!null~~nullnull!!null~~nullnull!!null~~!");
    }

    @Test
    public void test04318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04318");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!", "!\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test04319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04319");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "``!!``!!``!!``!!``!!``!!``!!``!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!");
    }

    @Test
    public void test04320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04320");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("H!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HH!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnull!" + "'", str2, "null!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnull!");
    }

    @Test
    public void test04321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04321");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!!", "\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS!!!" + "'", str2, "]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS!!!");
    }

    @Test
    public void test04322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04322");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]]]]]]]]!!]]]]]]]]!!]]]]]]]]]]]]]]]]!!]]]]]]]]!!]]]]]]]]!", "nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]]]]]]]!!]]]]]]]]!!]]]]]]]]]]]]]]]]!!]]]]]]]]!!]]]]]]]]!" + "'", str2, "]]]]]]]]!!]]]]]]]]!!]]]]]]]]]]]]]]]]!!]]]]]]]]!!]]]]]]]]!");
    }

    @Test
    public void test04323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04323");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\227nullnullnullnullnullnull\227nullnullnull\227nullnullnull\227nullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnull\227nullnullnull\227nullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull\227nullnullnullnullnullnull!", "porrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnullporrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnullporrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnullporrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnullporrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnullporrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnullporrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnullporrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLL\227UPLLUPLLUPLL\227UPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLL\227UPLLUPLLUPLL\227UPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL!" + "'", str2, "\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLL\227UPLLUPLLUPLL\227UPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLL\227UPLLUPLLUPLL\227UPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL!");
    }

    @Test
    public void test04324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04324");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLL!", "\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!!" + "'", str2, "\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!!");
    }

    @Test
    public void test04325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04325");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!~HH!~HH\220\220!~HH!~HH\220\220\220!~HH\220\220\220!~HH\220\220\220!~HH\220\220\220!~HH\220\220!~HH!~HH\220\220!~HH!~HH\220\220!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~nullnull!~nullnull\220\220!~nullnull!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220!~nullnull!~nullnull\220\220!~nullnull!~nullnull\220\220!" + "'", str2, "!~nullnull!~nullnull\220\220!~nullnull!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220!~nullnull!~nullnull\220\220!~nullnull!~nullnull\220\220!");
    }

    @Test
    public void test04326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04326");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04327");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200UUUU\214UUUUUUUUUUUU\214UUUUUUUU}~\200\200}~\200\200UUUU\214UUUUUUUUUUUU\214UUUUUUUU}~\200\200}~\200\200UUUU\214UUUUUUUUUUUU\214UUUUUUUU}~\200\200}~\200\200UUUU\214UUUUUUUUUUUU\214\u0348\u0346\u0346!", "\u0366\u0365\u0368\u0368LL!!LL!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnullnullnull\214nullnullnullnullnullnullnullnullnullnullnullnull\214nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull\214nullnullnullnullnullnullnullnullnullnullnullnull\214nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull\214nullnullnullnullnullnullnullnullnullnullnullnull\214nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull\214nullnullnullnullnullnullnullnullnullnullnullnull\214\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnullnullnull\214nullnullnullnullnullnullnullnullnullnullnullnull\214nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull\214nullnullnullnullnullnullnullnullnullnullnullnull\214nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull\214nullnullnullnullnullnullnullnullnullnullnullnull\214nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull\214nullnullnullnullnullnullnullnullnullnullnullnull\214\u0348\u0346\u0346!");
    }

    @Test
    public void test04328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04328");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!", "FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!" + "'", str2, "\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!");
    }

    @Test
    public void test04329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04329");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN\214\214!", "\u0366\u0365\u0368\u0368\335\340\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNKKNNKKNNKKNNKKNNKKNNKKNNKKNNKK\214\214NNKKNNKKNNKKNNKKNNKKNNKKNNKKNNKK\214\214NNKKNNKKNNKKNNKKNNKKNNKKNNKKNNKK\214\214NNKKNNKKNNKKNNKKNNKKNNKKNNKKNNKK\214\214NNKKNNKKNNKKNNKKNNKKNNKKNNKKNNKK\214\214NNKKNNKKNNKKNNKKNNKKNNKKNNKKNNKK\214\214NNKKNNKKNNKKNNKKNNKKNNKKNNKKNNKK\214\214NNKKNNKKNNKKNNKKNNKKNNKKNNKKNNKK\214\214!" + "'", str2, "NNKKNNKKNNKKNNKKNNKKNNKKNNKKNNKK\214\214NNKKNNKKNNKKNNKKNNKKNNKKNNKKNNKK\214\214NNKKNNKKNNKKNNKKNNKKNNKKNNKKNNKK\214\214NNKKNNKKNNKKNNKKNNKKNNKKNNKKNNKK\214\214NNKKNNKKNNKKNNKKNNKKNNKKNNKKNNKK\214\214NNKKNNKKNNKKNNKKNNKKNNKKNNKKNNKK\214\214NNKKNNKKNNKKNNKKNNKKNNKKNNKKNNKK\214\214NNKKNNKKNNKKNNKKNNKKNNKKNNKKNNKK\214\214!");
    }

    @Test
    public void test04330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04330");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\275\275\275\275\u0346\u0348\u0348!", "}nullnullnull~}}^}nullnullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\275\275\275\275\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\275\275\275\275\u0346\u0348\u0348!");
    }

    @Test
    public void test04331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04331");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NLLLNLLLNLLLNLLLLLNNLLNNLLNNLLNNNLLLNLLLNLLLNLLLLLNNLLNN!", "\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04332");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!!", "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!" + "'", str2, "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!");
    }

    @Test
    public void test04333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04333");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!", "\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test04334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04334");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014f!", "U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!" + "'", str2, "!null!");
    }

    @Test
    public void test04335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04335");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnull!!!!nullnullnullnullnullnull!!!!!!nullnullnullnullnullnull!!!!nullnullnullnullnullnull!!!!!!nullnullnullnullnullnull!!!!nullnullnullnullnullnull!!!!!!nullnullnullnullnullnull!!!!nullnullnullnullnullnull!!!!!!nullnullnullnullnullnull!!!!nullnullnullnullnullnull!!!!!!nullnullnullnullnullnull!!!!nullnullnullnullnullnull!!!!!!nullnullnullnullnullnull!!!!nullnullnullnullnullnull!!!!!!nullnullnullnullnullnull!!!!nullnullnullnullnullnull!!!!!!!", "AA]]AA]]nullnullAA]]AA]]nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ualluallualluallualluall!!!!ualluallualluallualluall!!!!!!ualluallualluallualluall!!!!ualluallualluallualluall!!!!!!ualluallualluallualluall!!!!ualluallualluallualluall!!!!!!ualluallualluallualluall!!!!ualluallualluallualluall!!!!!!ualluallualluallualluall!!!!ualluallualluallualluall!!!!!!ualluallualluallualluall!!!!ualluallualluallualluall!!!!!!ualluallualluallualluall!!!!ualluallualluallualluall!!!!!!ualluallualluallualluall!!!!ualluallualluallualluall!!!!!!!" + "'", str2, "ualluallualluallualluall!!!!ualluallualluallualluall!!!!!!ualluallualluallualluall!!!!ualluallualluallualluall!!!!!!ualluallualluallualluall!!!!ualluallualluallualluall!!!!!!ualluallualluallualluall!!!!ualluallualluallualluall!!!!!!ualluallualluallualluall!!!!ualluallualluallualluall!!!!!!ualluallualluallualluall!!!!ualluallualluallualluall!!!!!!ualluallualluallualluall!!!!ualluallualluallualluall!!!!!!ualluallualluallualluall!!!!ualluallualluallualluall!!!!!!!");
    }

    @Test
    public void test04336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04336");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\260\260NN\260\260NN}}\260\260NN\260\260NN}}!", "NLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLNLLL\275NLLLNLLLnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\260NN\260\260NN}}\260\260NN\260\260NN}}!" + "'", str2, "\260\260NN\260\260NN}}\260\260NN\260\260NN}}!");
    }

    @Test
    public void test04337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04337");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04338");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!", "!!UU!!UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!" + "'", str2, "]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!");
    }

    @Test
    public void test04339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04339");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04340");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!" + "'", str2, "!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!");
    }

    @Test
    public void test04341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04341");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276L\266\266~LL\276L\266\266~LL!!\276L\266\266~LL\276L\266\266~LL!!\276L\266\266~LL\276L\266\266~LL\276L\266\266~LL\276L\266\266~LL!!\276L\266\266~LL\276L\266\266~LL!!\276L\266\266~LL\276L\266\266~LL!", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276X\266\266~XX\276X\266\266~XX!!\276X\266\266~XX\276X\266\266~XX!!\276X\266\266~XX\276X\266\266~XX\276X\266\266~XX\276X\266\266~XX!!\276X\266\266~XX\276X\266\266~XX!!\276X\266\266~XX\276X\266\266~XX!" + "'", str2, "\276X\266\266~XX\276X\266\266~XX!!\276X\266\266~XX\276X\266\266~XX!!\276X\266\266~XX\276X\266\266~XX\276X\266\266~XX\276X\266\266~XX!!\276X\266\266~XX\276X\266\266~XX!!\276X\266\266~XX\276X\266\266~XX!");
    }

    @Test
    public void test04342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04342");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\200\200\230\230\200\200\230\230!", "\u0348~~\225\230\230\u0348~~\225\230\230\u0348~~\225\230\230\u0348~~\225\230\230\200\u0348~~\225\230\230\u0348~~\225\230\230\u0348~~\225\230\230\u0348~~\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200\230\230\200\200\230\230!" + "'", str2, "\200\200\230\230\200\200\230\230!");
    }

    @Test
    public void test04343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04343");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~!", "UUXXUUXXXXUUXXUUXXXX!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~!" + "'", str2, "\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~!");
    }

    @Test
    public void test04344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04344");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\246\250\250\250\246\250\250\250!", "!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\246\250\250\250\246\250\250\250!" + "'", str2, "\246\250\250\250\246\250\250\250!");
    }

    @Test
    public void test04345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04345");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNLLLNLLLNLLLNLLLNLLLNLL!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!!!!", "!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!!" + "'", str2, "`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!`!```!```!```!```!```!``!!!!`!```!```!```!```!```!``!!!!!!!");
    }

    @Test
    public void test04346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04346");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "P\220NN\200}}`P\220NN]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04347");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````!", "~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}~}}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````!" + "'", str2, "nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````!");
    }

    @Test
    public void test04348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04348");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0108!", "]!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]]!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!U!" + "'", str2, "!U!");
    }

    @Test
    public void test04349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04349");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!!", "\275UUU\275UUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test04350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04350");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!!", "\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!!" + "'", str2, "~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!!");
    }

    @Test
    public void test04351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04351");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200!!!!", "}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnull!!!nullnullnullnull!!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnull!!!nullnullnullnull!!!!");
    }

    @Test
    public void test04352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04352");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("EHHHEnullHHEnullHHEnullHHEnullHHEHHHEnullHHEnullHH!", "xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04353");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```!", "\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7```!" + "'", str2, "\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7```!");
    }

    @Test
    public void test04354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04354");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnull\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnull\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!", "JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!" + "'", str2, "\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!");
    }

    @Test
    public void test04355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04355");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!", "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02faLNNNLNNNLNNN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!\316null\313\313\316null\313\313!!\316null\313\313\316null\313\313!!!!\316null\313\313\316null\313\313!!\316null\313\313\316null\313\313!!!!\316null\313\313\316null\313\313!!\316null\313\313\316null\313\313!!!!\316null\313\313\316null\313\313!!\316null\313\313\316null\313\313!!!!\316null\313\313\316null\313\313!!\316null\313\313\316null\313\313!!!!\316null\313\313\316null\313\313!!\316null\313\313\316null\313\313!!!!\316null\313\313\316null\313\313!!\316null\313\313\316null\313\313!!!!\316null\313\313\316null\313\313!!\316null\313\313\316null\313\313!" + "'", str2, "!!!!\316null\313\313\316null\313\313!!\316null\313\313\316null\313\313!!!!\316null\313\313\316null\313\313!!\316null\313\313\316null\313\313!!!!\316null\313\313\316null\313\313!!\316null\313\313\316null\313\313!!!!\316null\313\313\316null\313\313!!\316null\313\313\316null\313\313!!!!\316null\313\313\316null\313\313!!\316null\313\313\316null\313\313!!!!\316null\313\313\316null\313\313!!\316null\313\313\316null\313\313!!!!\316null\313\313\316null\313\313!!\316null\313\313\316null\313\313!!!!\316null\313\313\316null\313\313!!\316null\313\313\316null\313\313!");
    }

    @Test
    public void test04356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04356");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\ua7ad\ua7ad\ua7ad\ua7ad\200\ua7ad\ua7ad\ua7ad\ua7ad]]!", "}~\200\200}~\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX}~\200\200}~\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\200}}`nullnullnullnull]]!" + "'", str2, "nullnullnullnull\200}}`nullnullnullnull]]!");
    }

    @Test
    public void test04357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04357");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!", "!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!" + "'", str2, "!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!");
    }

    @Test
    public void test04358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04358");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\234!nullnull\234!nullnull!!\234!nullnull\234!nullnull!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\234!nullnullnullnullnullnullnullnull\234!nullnullnullnullnullnullnullnull!!\234!nullnullnullnullnullnullnullnull\234!nullnullnullnullnullnullnullnull!!!" + "'", str2, "\234!nullnullnullnullnullnullnullnull\234!nullnullnullnullnullnullnullnull!!\234!nullnullnullnullnullnullnullnull\234!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test04359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04359");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```!", "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```!" + "'", str2, "LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```LNUUL\275\275!!!```!");
    }

    @Test
    public void test04360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04360");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!", "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^``!" + "'", str2, "`^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^``!");
    }

    @Test
    public void test04361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04361");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd!", "\u0366\u0365\u0368\u0368\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull!" + "'", str2, "~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04362");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!", "\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\256\276\275VV\254\254\256\276\275VV\254\254!!\256\276\275VV\254\254\256\276\275VV\254\254!!\256\276\275VV\254\254\256\276\275VV\254\254!!\256\276\275VV\254\254\256\276\275VV\254\254!!\256\276\275VV\254\254\256\276\275VV\254\254!!\256\276\275VV\254\254\256\276\275VV\254\254!!\256\276\275VV\254\254\256\276\275VV\254\254!!\256\276\275VV\254\254\256\276\275VV\254\254!" + "'", str2, "!!\256\276\275VV\254\254\256\276\275VV\254\254!!\256\276\275VV\254\254\256\276\275VV\254\254!!\256\276\275VV\254\254\256\276\275VV\254\254!!\256\276\275VV\254\254\256\276\275VV\254\254!!\256\276\275VV\254\254\256\276\275VV\254\254!!\256\276\275VV\254\254\256\276\275VV\254\254!!\256\276\275VV\254\254\256\276\275VV\254\254!!\256\276\275VV\254\254\256\276\275VV\254\254!");
    }

    @Test
    public void test04363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04363");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!", "nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!" + "'", str2, "\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!");
    }

    @Test
    public void test04364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04364");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("ULNNULNNULNNULNNULNNULNNULNNULNN!!ULNNULNNULNNULNNULNNULNNULNNULNN!!ULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNNULNN!!ULNNULNNULNNULNNULNNULNNULNNULNN!!ULNNULNNULNNULNNULNNULNNULNNULNN!", "NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216!!nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216!!nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216!!nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216!!nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216!" + "'", str2, "nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216!!nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216!!nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216!!nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216!!nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216nullnull\216\216!");
    }

    @Test
    public void test04365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04365");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NLLLNLLL!", "~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0179\u0178\u0178\u0178\u0179\u0178\u0178\u0178!" + "'", str2, "\u0179\u0178\u0178\u0178\u0179\u0178\u0178\u0178!");
    }

    @Test
    public void test04366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04366");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200UNLLUNLLuuUNLLUNLLuu~}\200\200~}\200\200UNLLUNLLuuUNLLUNLLuu~}\200\200~}\200\200UNLLUNLLuuUNLLUNLLuu~}\200\200~}\200\200UNLLUNLLuuUNLLUNLLuu~}\200\200~}\200\200UNLLUNLLuuUNLLUNLLuu~}\200\200~}\200\200UNLLUNLLuuUNLLUNLLuu~}\200\200~}\200\200UNLLUNLLuuUNLLUNLLuu~}\200\200~}\200\200UNLLUNLLuuUNLLUNLLuu!", "!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04367");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04368");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!", "nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04369");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\336\336!!\336\336!!!!\336\336!!\336\336!!!!\200\200\u0346\u0348\u0348!", "L\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLL!!L\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLL!!L\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLL!!L\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLL!!L\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368nullnull!!nullnull!!!!nullnull!!nullnull!!!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368nullnull!!nullnull!!!!nullnull!!nullnull!!!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test04370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04370");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLLUNLLUNLL\275\275UNLLUNLL\275\275UNLLUNLL\275\275UNLLUNLL\275\275\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLLUNLLUNLL\275\275UNLLUNLL\275\275!", "nullnullaanullnullaanullnullaanullnullaanullnullaanullnullaanullnullaanullnullaa!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275NLUUNLUUNLUU\275NLUUNLUUNLUU\275NLUUNLUUNLUU\275NLUUNLUUNLUUNLUUNLUU\275\275NLUUNLUU\275\275NLUUNLUU\275\275NLUUNLUU\275\275\275NLUUNLUUNLUU\275NLUUNLUUNLUU\275NLUUNLUUNLUU\275NLUUNLUUNLUUNLUUNLUU\275\275NLUUNLUU\275\275!" + "'", str2, "\275NLUUNLUUNLUU\275NLUUNLUUNLUU\275NLUUNLUUNLUU\275NLUUNLUUNLUUNLUUNLUU\275\275NLUUNLUU\275\275NLUUNLUU\275\275NLUUNLUU\275\275\275NLUUNLUUNLUU\275NLUUNLUUNLUU\275NLUUNLUUNLUU\275NLUUNLUUNLUUNLUUNLUU\275\275NLUUNLUU\275\275!");
    }

    @Test
    public void test04371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04371");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260!", "\253\254\256\256\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128nullnull\253\254\256\256\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260!" + "'", str2, "nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260!");
    }

    @Test
    public void test04372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04372");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("HFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFFHFFF!HFFFHFFF!", "}~\200\200}~\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX}~\200\200}~\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04373");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!!", "!!!!\300\300!!\300\300!!\300\300!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\300\300!!\300\300!!\300\300!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!" + "'", str2, "!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!");
    }

    @Test
    public void test04374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04374");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!", "fehhfehh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!" + "'", str2, "\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!");
    }

    @Test
    public void test04375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04375");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UNLLUNLLUNLLUNLLUNLL!", "\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043bnullnullnullnullnullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u020c\u020b\u020e\u020e\u020c\u020b\u020e\u020e\u020c\u020b\u020e\u020e\u020c\u020b\u020e\u020e\u020c\u020b\u020e\u020e!" + "'", str2, "\u020c\u020b\u020e\u020e\u020c\u020b\u020e\u020e\u020c\u020b\u020e\u020e\u020c\u020b\u020e\u020e\u020c\u020b\u020e\u020e!");
    }

    @Test
    public void test04376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04376");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!", "EEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!EEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnullEEnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "E\220UU\200~~E\220UU\200~~E\220UUE\220UUE\220UU\200~~E\220UU\200~~E\220UUE\220UU!!E\220UU\200~~E\220UU\200~~E\220UUE\220UUE\220UU\200~~E\220UU\200~~E\220UUE\220UU!!E\220UU\200~~E\220UU\200~~E\220UUE\220UUE\220UU\200~~E\220UU\200~~E\220UUE\220UUE\220UU\200~~E\220UU\200~~E\220UUE\220UUE\220UU\200~~E\220UU\200~~E\220UUE\220UU!!E\220UU\200~~E\220UU\200~~E\220UUE\220UUE\220UU\200~~E\220UU\200~~E\220UUE\220UU!!E\220UU\200~~E\220UU\200~~E\220UUE\220UUE\220UU\200~~E\220UU\200~~E\220UUE\220UU!" + "'", str2, "E\220UU\200~~E\220UU\200~~E\220UUE\220UUE\220UU\200~~E\220UU\200~~E\220UUE\220UU!!E\220UU\200~~E\220UU\200~~E\220UUE\220UUE\220UU\200~~E\220UU\200~~E\220UUE\220UU!!E\220UU\200~~E\220UU\200~~E\220UUE\220UUE\220UU\200~~E\220UU\200~~E\220UUE\220UUE\220UU\200~~E\220UU\200~~E\220UUE\220UUE\220UU\200~~E\220UU\200~~E\220UUE\220UU!!E\220UU\200~~E\220UU\200~~E\220UUE\220UUE\220UU\200~~E\220UU\200~~E\220UUE\220UU!!E\220UU\200~~E\220UU\200~~E\220UUE\220UUE\220UU\200~~E\220UU\200~~E\220UUE\220UU!");
    }

    @Test
    public void test04377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04377");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnull~}}^nullnullnullnull]]!", "UUNNNNUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fhnullnullfhnullnullfhnullnullfhnullnull~}}^fhnullnullfhnullnullfhnullnullfhnullnull]]!" + "'", str2, "fhnullnullfhnullnullfhnullnullfhnullnull~}}^fhnullnullfhnullnullfhnullnullfhnullnull]]!");
    }

    @Test
    public void test04378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04378");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("ELLLELLLELLLELLLELLLELLLELLLELLLELLLELLLELLLELLLELLLELLL!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261!" + "'", str2, "null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261!");
    }

    @Test
    public void test04379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04379");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NLLLNLLLLLNLLLNLLLLL!!NLLLNLLLLLNLLLNLLLLL!!NLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLL!!NLLLNLLLLLNLLLNLLLLL!!NLLLNLLLLLNLLLNLLLLL!", "!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\275\275\275!\275\275\275\275\275!\275\275\275!\275\275\275\275\275!!!\275\275\275!\275\275\275\275\275!\275\275\275!\275\275\275\275\275!!!\275\275\275!\275\275\275\275\275!\275\275\275!\275\275\275\275\275!\275\275\275!\275\275\275\275\275!\275\275\275!\275\275\275\275\275!!!\275\275\275!\275\275\275\275\275!\275\275\275!\275\275\275\275\275!!!\275\275\275!\275\275\275\275\275!\275\275\275!\275\275\275\275\275!" + "'", str2, "!\275\275\275!\275\275\275\275\275!\275\275\275!\275\275\275\275\275!!!\275\275\275!\275\275\275\275\275!\275\275\275!\275\275\275\275\275!!!\275\275\275!\275\275\275\275\275!\275\275\275!\275\275\275\275\275!\275\275\275!\275\275\275\275\275!\275\275\275!\275\275\275\275\275!!!\275\275\275!\275\275\275\275\275!\275\275\275!\275\275\275\275\275!!!\275\275\275!\275\275\275\275\275!\275\275\275!\275\275\275\275\275!");
    }

    @Test
    public void test04380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04380");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL!" + "'", str2, "ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL!");
    }

    @Test
    public void test04381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04381");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0nullnull!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348ll!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348ll!");
    }

    @Test
    public void test04382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04382");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\u0366\u0365\u0368\u0368\u0128\u0128\u0128\u0128\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test04383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04383");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u017e\u017e\u017e\u017e\u017e\u017enullnullnullnullnullnullnullnull!", "\265\276\276\276\265\276\276\276\276\276\265\276\276\276\265\276\276\276\276\276\265\276\276\276\265\276\276\276\276\276\265\276\276\276\265\276\276\276\276\276\265\276\276\276\265\276\276\276\276\276\265\276\276\276\265\276\276\276\276\276\265\276\276\276\265\276\276\276\276\276\265\276\276\276\265\276\276\276\276\276!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276\276\276nullnullnull\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276nullnullnull\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!" + "'", str2, "\276\276\276\276nullnullnull\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276nullnullnull\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!");
    }

    @Test
    public void test04384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04384");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull!!null~~nullnull!!null~~nullnull!!null~~nullnull!!null~~nullnull!!null~~nullnull!!null~~nullnull!!null~~nullnull!!null~~!", "eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8~~!" + "'", str2, "\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8~~!");
    }

    @Test
    public void test04385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04385");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("ULLL\200}}`ULLL]]!", "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02faLNNNLNNNLNNN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\253\253\253\200}}`null\253\253\253]]!" + "'", str2, "null\253\253\253\200}}`null\253\253\253]]!");
    }

    @Test
    public void test04386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04386");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!!", "\340\340!!\340\340!!nullnullnullnullnullnullnullnull\340\340!!\340\340!!nullnullnullnullnullnullnullnull\340\340!!\340\340!!nullnullnullnullnullnullnullnull\340\340!!\340\340!!nullnullnullnullnullnullnullnull\340\340!!\340\340!!nullnullnullnullnullnullnullnull\340\340!!\340\340!!nullnullnullnullnullnullnullnull\340\340!!\340\340!!nullnullnullnullnullnullnullnull\340\340!!\340\340!!nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!!" + "'", str2, "\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!!");
    }

    @Test
    public void test04387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04387");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230\200}}`~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230]]!", "nullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqllnullnulluqlluqll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230\200}}`~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230]]!" + "'", str2, "~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230\200}}`~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230~~\276\276\276~~\225\230\230]]!");
    }

    @Test
    public void test04388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04388");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNUULNUU!!LNUULNUU!!LNUULNUULNUULNUU!!LNUULNUU!!LNUULNUU!", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test04389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04389");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!", "}~\200\200}~\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL}~\200\200}~\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170!" + "'", str2, "\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170!");
    }

    @Test
    public void test04390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04390");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!!", "}~\200\200}~\200\200UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!}~\200\200}~\200\200UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!!" + "'", str2, "\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!\275\275!!\275\275!!!!\275\275!!\275\275!!!!!!!");
    }

    @Test
    public void test04391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04391");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NN!!NN!!!", "nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0175\u0175\u0175\u0175!!!" + "'", str2, "\u0175\u0175\u0175\u0175!!!");
    }

    @Test
    public void test04392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04392");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200~^~~~^~~}~\200\200}~\200\200~^~~~^~~!", "!fhhnullnullnull!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhhnullnullnull!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200~^~~~^~~}~\200\200}~\200\200~^~~~^~~!" + "'", str2, "}~\200\200}~\200\200~^~~~^~~}~\200\200}~\200\200~^~~~^~~!");
    }

    @Test
    public void test04393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04393");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]U!!]U!!!!]U!!]U!!!!]U!!]U!!]U!!]U!!!!]U!!]U!!!!]U!!]U!!!", "\275nullnull\200\200nullnull\200\200nullnull\200\200\276nullnull\200\200\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]f!!]f!!!!]f!!]f!!!!]f!!]f!!]f!!]f!!!!]f!!]f!!!!]f!!]f!!!" + "'", str2, "]f!!]f!!!!]f!!]f!!!!]f!!]f!!]f!!]f!!!!]f!!]f!!!!]f!!]f!!!");
    }

    @Test
    public void test04394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04394");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!", "~n~~\225\230\230~n~~\225\230\230~n~~\225\230\230~n~~\225\230\230\200}}`~n~~\225\230\230~n~~\225\230\230~n~~\225\230\230~n~~\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\227nullnullnull\227nullnullnull\227nullnullnull\227nullnullnull\227nullnullnull\227nullnullnull\227nullnullnull\227nullnullnull!!\227nullnullnull\227nullnullnull\227nullnullnull\227nullnullnull\227nullnullnull\227nullnullnull\227nullnullnull\227nullnullnull!!!" + "'", str2, "\227nullnullnull\227nullnullnull\227nullnullnull\227nullnullnull\227nullnullnull\227nullnullnull\227nullnullnull\227nullnullnull!!\227nullnullnull\227nullnullnull\227nullnullnull\227nullnullnull\227nullnullnull\227nullnullnull\227nullnullnull\227nullnullnull!!!");
    }

    @Test
    public void test04395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04395");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246!", "LULLLULL!!LULLLULL!!LULLLULL!!LULLLULL!!LULLLULL!!LULLLULL!!LULLLULL!!LULLLULL!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\254\256\256null\254\256\256nullnullnullnullnullnullnullnullnull\254\256\256null\254\256\256nullnullnullnullnullnullnullnullnull\254\256\256null\254\256\256nullnullnullnullnullnullnullnullnull\254\256\256null\254\256\256nullnullnullnullnullnullnullnullnull\254\256\256null\254\256\256nullnullnullnullnullnullnullnullnull\254\256\256null\254\256\256nullnullnullnullnullnullnullnullnull\254\256\256null\254\256\256nullnullnullnullnullnullnullnullnull\254\256\256null\254\256\256nullnullnullnullnullnullnullnull!" + "'", str2, "null\254\256\256null\254\256\256nullnullnullnullnullnullnullnullnull\254\256\256null\254\256\256nullnullnullnullnullnullnullnullnull\254\256\256null\254\256\256nullnullnullnullnullnullnullnullnull\254\256\256null\254\256\256nullnullnullnullnullnullnullnullnull\254\256\256null\254\256\256nullnullnullnullnullnullnullnullnull\254\256\256null\254\256\256nullnullnullnullnullnullnullnullnull\254\256\256null\254\256\256nullnullnullnullnullnullnullnullnull\254\256\256null\254\256\256nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04396");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!", "\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test04397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04397");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!ffFF!", "\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035b\u035bnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnull!" + "'", str2, "!nullnullnullnull!");
    }

    @Test
    public void test04398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04398");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!", "NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b!" + "'", str2, "\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b!");
    }

    @Test
    public void test04399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04399");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!!", "llllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!!" + "'", str2, "\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!!");
    }

    @Test
    public void test04400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04400");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("EHHHEHHHEHHHEHHHEHHHEHHHEHHHEHHH!", "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test04401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04401");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd!", "^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU^```^```^```^```^```^```^```^```^```^```UUUUUUUU^```^```UUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull!" + "'", str2, "~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04402");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\254\254\254\254\u0346\u0348\u0348!", "}~\200\200}~\200\200NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU}~\200\200}~\200\200NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\254\254\254\254\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\254\254\254\254\u0346\u0348\u0348!");
    }

    @Test
    public void test04403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04403");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("a]aaa]aa!!a]aaa]aa!!a]aaa]aaa]aaa]aa!!a]aaa]aa!!a]aaa]aa!", "}~\200\200}~\200\200LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN}~\200\200}~\200\200LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!" + "'", str2, "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!");
    }

    @Test
    public void test04404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04404");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!~\223\223!~\223\223!!!~\223\223!~\223\223!!!~\223\223!~\223\223!~\223\223!~\223\223!!!~\223\223!~\223\223!!!~\223\223!~\223\223!", "ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll\200}}`ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~\223\223!~\223\223!!!~\223\223!~\223\223!!!~\223\223!~\223\223!~\223\223!~\223\223!!!~\223\223!~\223\223!!!~\223\223!~\223\223!" + "'", str2, "!~\223\223!~\223\223!!!~\223\223!~\223\223!!!~\223\223!~\223\223!~\223\223!~\223\223!!!~\223\223!~\223\223!!!~\223\223!~\223\223!");
    }

    @Test
    public void test04405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04405");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!", "\u0366\u0365\u0368\u0368\275!!!\275!!!\204\204\275!!!\275!!!\275!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!!!\275!!!\275!!!\204\204\275!!!\275!!!\275!!!\275!!!\275!!!\204\204\275!!!\275!!!\275\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!" + "'", str2, "null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!");
    }

    @Test
    public void test04406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04406");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\253\254\256\256LNUULNUULNUULNUU\253\254\256\256LNUULNUU!", "\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b\u014f\u014b\u014b!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnullnullnull!" + "'", str2, "\253\254\256\256nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04407");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\253\256\256\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "\u016a\u016a\u016a\u016a\u016a\u016aLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271\266\u016bll\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test04408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04408");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN!", "rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!" + "'", str2, "!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!RRR!");
    }

    @Test
    public void test04409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04409");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!", "\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!" + "'", str2, "!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!");
    }

    @Test
    public void test04410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04410");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLL!", "nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0119\u0119\u0119\u0119!!\276\u0119\u0119\u0119\276\u0119\u0119\u0119\u0119\u0119\u0119\u0119!!\276\u0119\u0119\u0119\276\u0119\u0119\u0119\u0119\u0119\u0119\u0119!!\276\u0119\u0119\u0119\276\u0119\u0119\u0119\u0119\u0119\u0119\u0119!!\276\u0119\u0119\u0119\276\u0119\u0119\u0119\u0119\u0119\u0119\u0119!!\276\u0119\u0119\u0119\276\u0119\u0119\u0119\u0119\u0119\u0119\u0119!!\276\u0119\u0119\u0119\276\u0119\u0119\u0119\u0119\u0119\u0119\u0119!!\276\u0119\u0119\u0119\276\u0119\u0119\u0119\u0119\u0119\u0119\u0119!!\276\u0119\u0119\u0119\276\u0119\u0119\u0119!" + "'", str2, "\u0119\u0119\u0119\u0119!!\276\u0119\u0119\u0119\276\u0119\u0119\u0119\u0119\u0119\u0119\u0119!!\276\u0119\u0119\u0119\276\u0119\u0119\u0119\u0119\u0119\u0119\u0119!!\276\u0119\u0119\u0119\276\u0119\u0119\u0119\u0119\u0119\u0119\u0119!!\276\u0119\u0119\u0119\276\u0119\u0119\u0119\u0119\u0119\u0119\u0119!!\276\u0119\u0119\u0119\276\u0119\u0119\u0119\u0119\u0119\u0119\u0119!!\276\u0119\u0119\u0119\276\u0119\u0119\u0119\u0119\u0119\u0119\u0119!!\276\u0119\u0119\u0119\276\u0119\u0119\u0119\u0119\u0119\u0119\u0119!!\276\u0119\u0119\u0119\276\u0119\u0119\u0119!");
    }

    @Test
    public void test04411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04411");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d!", "}~\200\200}~\200\200LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL}~\200\200}~\200\200LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull!" + "'", str2, "\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull!");
    }

    @Test
    public void test04412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04412");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\200}}null\200}}null\200}}null\200}}null\200}}null\200}}null\200}}null\200}}!", "N!!!N!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "enullnullnull\200}}enullnullnull\200}}enullnullnull\200}}enullnullnull\200}}enullnullnull\200}}enullnullnull\200}}enullnullnull\200}}enullnullnull\200}}!" + "'", str2, "enullnullnull\200}}enullnullnull\200}}enullnullnull\200}}enullnullnull\200}}enullnullnull\200}}enullnullnull\200}}enullnullnull\200}}enullnullnull\200}}!");
    }

    @Test
    public void test04413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04413");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test04414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04414");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!!\275!!!\275!!\275\275!\275!!!\275!!\275\275!\275!!!\275!!\275\275!\275!!!\275!!\275\275\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!!\275!!!\275!!\275\275!\275!!!\275!!\275\275!", "\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!!\275!!!\275!!\275\275!\275!!!\275!!\275\275!\275!!!\275!!\275\275!\275!!!\275!!\275\275\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!!\275!!!\275!!\275\275!\275!!!\275!!\275\275!" + "'", str2, "\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!!\275!!!\275!!\275\275!\275!!!\275!!\275\275!\275!!!\275!!\275\275!\275!!!\275!!\275\275\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!!\275!!!\275!!\275\275!\275!!!\275!!\275\275!");
    }

    @Test
    public void test04415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04415");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NnullnullnullNnullnullnullNnullnullnullNnullnullnull\200}}`NnullnullnullNnullnullnullNnullnullnullNnullnullnull]]!", "`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNLLLNLLLNLLLNNLLLNLLLNLLLNNLLLNLLLNLLLNNLLLNLLLNLLL\200}}`NNLLLNLLLNLLLNNLLLNLLLNLLLNNLLLNLLLNLLLNNLLLNLLLNLLL]]!" + "'", str2, "NNLLLNLLLNLLLNNLLLNLLLNLLLNNLLLNLLLNLLLNNLLLNLLLNLLL\200}}`NNLLLNLLLNLLLNNLLLNLLLNLLLNNLLLNLLLNLLLNNLLLNLLLNLLL]]!");
    }

    @Test
    public void test04416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04416");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\236\276\276null\236\276\276!!null\236\276\276null\236\276\276!!null\236\276\276null\236\276\276null\236\276\276null\236\276\276!!null\236\276\276null\236\276\276!!null\236\276\276null\236\276\276!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014enullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\255\256\260\260\236\276\276\255\256\260\260\236\276\276!!\255\256\260\260\236\276\276\255\256\260\260\236\276\276!!\255\256\260\260\236\276\276\255\256\260\260\236\276\276\255\256\260\260\236\276\276\255\256\260\260\236\276\276!!\255\256\260\260\236\276\276\255\256\260\260\236\276\276!!\255\256\260\260\236\276\276\255\256\260\260\236\276\276!" + "'", str2, "\255\256\260\260\236\276\276\255\256\260\260\236\276\276!!\255\256\260\260\236\276\276\255\256\260\260\236\276\276!!\255\256\260\260\236\276\276\255\256\260\260\236\276\276\255\256\260\260\236\276\276\255\256\260\260\236\276\276!!\255\256\260\260\236\276\276\255\256\260\260\236\276\276!!\255\256\260\260\236\276\276\255\256\260\260\236\276\276!");
    }

    @Test
    public void test04417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04417");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!", "X!UUX!UUX!UUX!UUX!UUX!UUX!UUX!UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!" + "'", str2, "]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!");
    }

    @Test
    public void test04418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04418");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("u!ll!!!u!ll!!!u!ll!!!u!ll!!!u!ll!!!u!ll!!!u!ll!!!u!ll!!!!", "\u0366\u0365\u0368\u0368\214\214!!\214\214!!\214\214!!\214\214\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnull!!!null!nullnull!!!null!nullnull!!!null!nullnull!!!null!nullnull!!!null!nullnull!!!null!nullnull!!!null!nullnull!!!!" + "'", str2, "null!nullnull!!!null!nullnull!!!null!nullnull!!!null!nullnull!!!null!nullnull!!!null!nullnull!!!null!nullnull!!!null!nullnull!!!!");
    }

    @Test
    public void test04419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04419");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200~^~~~^~~}~\200\200}~\200\200~^~~~^~~!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200~^~~~^~~}~\200\200}~\200\200~^~~~^~~!" + "'", str2, "}~\200\200}~\200\200~^~~~^~~}~\200\200}~\200\200~^~~~^~~!");
    }

    @Test
    public void test04420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04420");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}\200\200\200nullnullnull}\200\200\200nullnullnull}\200\200\200nullnullnull}\200\200\200nullnullnull}\200\200\200nullnullnull}\200\200\200nullnullnull}\200\200\200nullnullnull}\200\200\200nullnullnull!", "!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}\200\200\200\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320}\200\200\200\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320}\200\200\200\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320}\200\200\200\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320}\200\200\200\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320}\200\200\200\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320}\200\200\200\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320}\200\200\200\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320!" + "'", str2, "}\200\200\200\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320}\200\200\200\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320}\200\200\200\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320}\200\200\200\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320}\200\200\200\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320}\200\200\200\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320}\200\200\200\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320}\200\200\200\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320!");
    }

    @Test
    public void test04421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04421");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~!", "}~\200\200}~\200\200NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL}~\200\200}~\200\200NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~!" + "'", str2, "}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~!");
    }

    @Test
    public void test04422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04422");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLLUNLLUNLL\275\275UNLLUNLL\275\275UNLLUNLL\275\275UNLLUNLL\275\275\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLLUNLLUNLL\275\275UNLLUNLL\275\275!", "\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nmppnmppnmpp\275nmppnmppnmpp\275nmppnmppnmpp\275nmppnmppnmppnmppnmpp\275\275nmppnmpp\275\275nmppnmpp\275\275nmppnmpp\275\275\275nmppnmppnmpp\275nmppnmppnmpp\275nmppnmppnmpp\275nmppnmppnmppnmppnmpp\275\275nmppnmpp\275\275!" + "'", str2, "\275nmppnmppnmpp\275nmppnmppnmpp\275nmppnmppnmpp\275nmppnmppnmppnmppnmpp\275\275nmppnmpp\275\275nmppnmpp\275\275nmppnmpp\275\275\275nmppnmppnmpp\275nmppnmppnmpp\275nmppnmppnmpp\275nmppnmppnmppnmppnmpp\275\275nmppnmpp\275\275!");
    }

    @Test
    public void test04423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04423");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200ULLLULLLULLLULLLULLLULLLULLLULLLJJULLLULLLULLLULLLULLLULLLULLLULLLJJ~}\200\200~}\200\200ULLLULLLULLLULLLULLLULLLULLLULLLJJULLLULLLULLLULLLULLLULLLULLLULLLJJ~}\200\200~}\200\200ULLLULLLULLLULLLULLLULLLULLLULLLJJULLLULLLULLLULLLULLLULLLULLLULLLJJ~}\200\200~}\200\200ULLLULLLULLLULLLULLLULLLULLLULLLJJULLLULLLULLLULLLULLLULLLULLLULLLJJ~}\200\200~}\200\200ULLLULLLULLLULLLULLLULLLULLLULLLJJULLLULLLULLLULLLULLLULLLULLLULLLJJ~}\200\200~}\200\200ULLLULLLULLLULLLULLLULLLULLLULLLJJULLLULLLULLLULLLULLLULLLULLLULLLJJ~}\200\200~}\200\200ULLLULLLULLLULLLULLLULLLULLLULLLJJULLLULLLULLLULLLULLLULLLULLLULLLJJ~}\200\200~}\200\200ULLLULLLULLLULLLULLLULLLULLLULLLJJULLLULLLULLLULLLULLLULLLULLLULLLJJ!", "\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106LLLUU~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106LLLUU~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106LLLUU~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106LLLUU~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106LLLUU~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106LLLUU~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106LLLUU~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106LLLUU!" + "'", str2, "~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106LLLUU~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106LLLUU~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106LLLUU~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106LLLUU~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106LLLUU~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106LLLUU~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106LLLUU~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106LLLUU!");
    }

    @Test
    public void test04424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04424");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u011e\u011c\u011c\u011c\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u011e\u011c\u011c\u011c\u0348\u0346\u0346!");
    }

    @Test
    public void test04425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04425");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("L\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LL!!L\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LL!!L\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LL!!L\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LL!!L\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LL!", "\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!" + "'", str2, "null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!");
    }

    @Test
    public void test04426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04426");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "]U!!]U!!!!]U!!]U!!!!]U!!]U!!]U!!]U!!!!]U!!]U!!!!]U!!]U!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04427");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("`NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL`NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!", "FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04428");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\u0345\u0348\u0346\u0346!", "}N\200\200}N\200\200}N\200\200}N\200\200ULLLULLLULLLULLL}N\200\200}N\200\200}N\200\200}N\200\200ULLLULLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test04429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04429");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129\u0129!!!!!", "!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test04430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04430");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!!!l\253\253!l\253\253!!!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!l\253\253!", "!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!" + "'", str2, "!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!!!U\253\253!U\253\253!!!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!U\253\253!");
    }

    @Test
    public void test04431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04431");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]!", "NLLLNLLLNLLLNLLLLLNNLLNNLLNNLLNNNLLLNLLLNLLLNLLLLLNNLLNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]!" + "'", str2, "\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]!");
    }

    @Test
    public void test04432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04432");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnulleenullnullee\254~\256\256\254~\256\256\254~\256\256\254~\256\256!", "\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226!!\254~\256\256\254~\256\256\254~\256\256\254~\256\256!" + "'", str2, "\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226!!\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
    }

    @Test
    public void test04433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04433");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!!", "}null\200\200}null\200\200}null\200\200}null\200\200L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~}null\200\200}null\200\200}null\200\200}null\200\200L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!" + "'", str2, "!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!");
    }

    @Test
    public void test04434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04434");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!", "XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!" + "'", str2, "!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!^``!^``!^``!^``!^``!^``!^``!^``!!!");
    }

    @Test
    public void test04435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04435");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!!", "nullnullnullnull\200\200!!\200\200!!\200\200!!\200\200!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!!" + "'", str2, "\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!\275!!!\275!!!");
    }

    @Test
    public void test04436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04436");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200UUUU\214UUUUUUUUUUUU\214UUUUUUUU}~\200\200}~\200\200UUUU\214UUUUUUUUUUUU\214UUUUUUUU}~\200\200}~\200\200UUUU\214UUUUUUUUUUUU\214UUUUUUUU}~\200\200}~\200\200UUUU\214UUUUUUUUUUUU\214\u0348\u0346\u0346!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnullnullnull\214nullnullnullnullnullnullnullnullnullnullnullnull\214nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull\214nullnullnullnullnullnullnullnullnullnullnullnull\214nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull\214nullnullnullnullnullnullnullnullnullnullnullnull\214nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull\214nullnullnullnullnullnullnullnullnullnullnullnull\214\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnullnullnull\214nullnullnullnullnullnullnullnullnullnullnullnull\214nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull\214nullnullnullnullnullnullnullnullnullnullnullnull\214nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull\214nullnullnullnullnullnullnullnullnullnullnullnull\214nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull\214nullnullnullnullnullnullnullnullnullnullnullnull\214\u0348\u0346\u0346!");
    }

    @Test
    public void test04437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04437");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214!", "nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214!" + "'", str2, "\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214\307\310\312\312\307\310\312\312null\312\214\214null\312\214\214!");
    }

    @Test
    public void test04438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04438");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!", "nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246!!nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246!!nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246!!nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246!!nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246nullnull\246\246!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!" + "'", str2, "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!");
    }

    @Test
    public void test04439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04439");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0420\u0420\u0420\u0420!!!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!!");
    }

    @Test
    public void test04440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04440");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!", "``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!~}}^``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!" + "'", str2, "!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!");
    }

    @Test
    public void test04441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04441");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031anullnull!!!", "\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016enullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e!!!" + "'", str2, "\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e!!!");
    }

    @Test
    public void test04442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04442");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "nullnull]]nullnull]]nullnullnullnullnullnullnullnullnullnull]]nullnull]]nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04443");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d!!!", "LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!!" + "'", str2, "\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!!");
    }

    @Test
    public void test04444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04444");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!", "\u0366\u0365\u0368\u0368!!\216\216\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!");
    }

    @Test
    public void test04445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04445");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "}~\200\200}~\200\200nullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04446");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!", "\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04447");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348!" + "'", str2, "\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348!");
    }

    @Test
    public void test04448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04448");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!!", "LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230\200}}`LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230LLLLLLLLLLLLLLLL\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test04449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04449");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c!", "!\253\256\256\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271\266\u020e\u0210!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256!!]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256!!]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256!!]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256!!]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256!" + "'", str2, "]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256!!]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256!!]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256!!]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256!!]]\253\271\271!!\256\256\253\271\271!!\256\256]]\253\271\271!!\256\256\253\271\271!!\256\256!");
    }

    @Test
    public void test04450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04450");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test04451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04451");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UNLLUNLL\253\253UNLLUNLL\253\253UNLLUNLL\253\253UNLLUNLL\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UNLLUNLL\253\253UNLLUNLL\253\253!", "!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253FFFFFFFF\253\253FFFFFFFF\253\253FFFFFFFF\253\253FFFFFFFF\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253FFFFFFFF\253\253FFFFFFFF\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253FFFFFFFF\253\253FFFFFFFF\253\253FFFFFFFF\253\253FFFFFFFF\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253FFFFFFFF\253\253FFFFFFFF\253\253!");
    }

    @Test
    public void test04452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04452");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248nullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\335\336\340\340nullnullnull\335\336\340\340nullnullnull!!\335\336\340\340nullnullnull\335\336\340\340nullnullnull!!\335\336\340\340nullnullnull\335\336\340\340nullnullnull!!\335\336\340\340nullnullnull\335\336\340\340\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\335\336\340\340nullnullnull\335\336\340\340nullnullnull!!\335\336\340\340nullnullnull\335\336\340\340nullnullnull!!\335\336\340\340nullnullnull\335\336\340\340nullnullnull!!\335\336\340\340nullnullnull\335\336\340\340\u0346\u0348\u0348!");
    }

    @Test
    public void test04453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04453");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\352\356\356\356\352\356\356\356\352\356\356\356\352\356\356\356\200}}`\352\356\356\356\352\356\356\356\352\356\356\356\352\356\356\356]]!", "null\300\300\300null\300\300\300null\300\300\300null\300\300\300null\300\300\300null\300\300\300null\300\300\300null\300\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test04454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04454");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL!", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!" + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
    }

    @Test
    public void test04455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04455");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u016a\u016a\u016a\u016a\u016a\u016aLL!", "nullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunll!!nullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunll!!nullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunll!!nullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunll!!nullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunllnullnullunllunll!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLLLNULLNULLNULLNULLNLLLNULLNULL!" + "'", str2, "NLLLNULLNULLNULLNULLNLLLNULLNULL!");
    }

    @Test
    public void test04456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04456");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!~LL!~LL!!!~LL!~LL!!!~LL!~LL!~LL!~LL!!!~LL!~LL!!!~LL!~LL!", "!!UULLUULL!UULLUULLUULL!UULLUULLUULLUULLUULL!UULLUULLUULL!UULLUULLUULL!!UULLUULL!UULLUULLUULL!UULLUULLUULLUULLUULL!UULLUULLUULL!UULLUULLUULL!!UULLUULL!UULLUULLUULL!UULLUULLUULLUULLUULL!UULLUULLUULL!UULLUULLUULL!!UULLUULL!UULLUULLUULL!UULLUULLUULLUULLUULL!UULLUULLUULL!UULLUULLUULL!!UULLUULL!UULLUULLUULL!UULLUULLUULLUULLUULL!UULLUULLUULL!UULLUULLUULL!!UULLUULL!UULLUULLUULL!UULLUULLUULLUULLUULL!UULLUULLUULL!UULLUULLUULL!!UULLUULL!UULLUULLUULL!UULLUULLUULLUULLUULL!UULLUULLUULL!UULLUULLUULL!!UULLUULL!UULLUULLUULL!UULLUULLUULLUULLUULL!UULLUULLUULL!UULLUULLUULL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270!" + "'", str2, "\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270!");
    }

    @Test
    public void test04457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04457");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256!", "\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256!" + "'", str2, "\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256!");
    }

    @Test
    public void test04458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04458");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("wxzzwxzz!!wxzzwxzz!!wxzzwxzzwxzzwxzz!!wxzzwxzz!!wxzzwxzz!", "nullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04459");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c!", "UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04460");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!~lnulluulnulluu!~lnulluulnulluu!!!~lnulluulnulluu!~lnulluulnulluu!!!~lnulluulnulluu!~lnulluulnulluu!~lnulluulnulluu!~lnulluulnulluu!!!~lnulluulnulluu!~lnulluulnulluu!!!~lnulluulnulluu!~lnulluulnulluu!", "\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04461");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NLLLULNN!", "LLnullnullLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullLLnullnullLLnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\220\220\220\216\220\215\215!" + "'", str2, "\215\220\220\220\216\220\215\215!");
    }

    @Test
    public void test04462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04462");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UU!!UU!!!", "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NN!!NN!!!" + "'", str2, "NN!!NN!!!");
    }

    @Test
    public void test04463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04463");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276!", "FEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHH!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ffff\236\276\276ffff\236\276\276!!ffff\236\276\276ffff\236\276\276!!ffff\236\276\276ffff\236\276\276ffff\236\276\276ffff\236\276\276!!ffff\236\276\276ffff\236\276\276!!ffff\236\276\276ffff\236\276\276!" + "'", str2, "ffff\236\276\276ffff\236\276\276!!ffff\236\276\276ffff\236\276\276!!ffff\236\276\276ffff\236\276\276ffff\236\276\276ffff\236\276\276!!ffff\236\276\276ffff\236\276\276!!ffff\236\276\276ffff\236\276\276!");
    }

    @Test
    public void test04464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04464");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150!!\200\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150!!]]!", "!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!\200}}`!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!]]!" + "'", str2, "!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!\200}}`!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!]]!");
    }

    @Test
    public void test04465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04465");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\200}}`\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300]]!", "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test04466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04466");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126!!!", "\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test04467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04467");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226!!\254~\256\256\254~\256\256\254~\256\256\254~\256\256!", "!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!\254~\256\256\254~\256\256\254~\256\256\254~\256\256!" + "'", str2, "null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
    }

    @Test
    public void test04468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04468");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!!LL!!!LL!!LL!", "~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!" + "'", str2, "!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!");
    }

    @Test
    public void test04469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04469");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!!", "!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!!!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!!!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!!!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!!!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!!" + "'", str2, "~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!~\200\200\200\200\220\216\216\200\220\216\216!!!!!!!");
    }

    @Test
    public void test04470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04470");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NULLLNUULNUULNUULNUUNULLLNUULNUU!", "\u0143\u0145\u0145\u0143\u0145\u0145\u0143\u0145\u0145\u0143\u0145\u0145\u0143\u0145\u0145\u0143\u0145\u0145\u0143\u0145\u0145\u0143\u0145\u0145!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0143\u0145\u0145\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0143\u0145\u0145\u0145\u0143\u0145\u0143!!!" + "'", str2, "\u0143\u0145\u0145\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0143\u0145\u0145\u0145\u0143\u0145\u0143!!!");
    }

    @Test
    public void test04471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04471");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL!!````````````LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!````````````LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!", "NNUUNNUU!!NNUUNNUU!!NNUUNNUUNNUUNNUU!!NNUUNNUU!!NNUUNNUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test04472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04472");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!!", "~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!!" + "'", str2, "\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!!");
    }

    @Test
    public void test04473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04473");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLL!", "nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226!!nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226!!nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226!!nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226!!nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL!" + "'", str2, "\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL!");
    }

    @Test
    public void test04474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04474");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NNNNNNNNNNNNNNNN\200}}`NNNNNNNNNNNNNNNN]]!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test04475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04475");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128!", "nullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test04476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04476");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!NnullLLNnullLLLLNnullLLNnullLLLL!!!", "\275!!!\275\275!!\275\275!!\275\275!!\275\275!!\275!!!\275\275!!\275\275!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!!" + "'", str2, "\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!!");
    }

    @Test
    public void test04477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04477");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108nullnull!!!!!!!", "null\236\276\276null\236\276\276!!null\236\276\276null\236\276\276!!null\236\276\276null\236\276\276null\236\276\276null\236\276\276!!null\236\276\276null\236\276\276!!null\236\276\276null\236\276\276!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\266\267\271\271\266\267\271\271!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!!!!" + "'", str2, "nullnullnullnull\266\267\271\271\266\267\271\271!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!nullnullnullnull\266\267\271\271\266\267\271\271!!!!!!!");
    }

    @Test
    public void test04478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04478");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7!", "\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!!\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test04479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04479");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!!", "\276!!!\276\276!!\276\276!!\276\276!!\276\276!!\276!!!\276\276!!\276\276!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test04480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04480");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\253\253\253\253\253\253\253\253!", "LNLLLNLL!!LNLLLNLL!!LNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\253\253\253\253\253\253\253!" + "'", str2, "\253\253\253\253\253\253\253\253!");
    }

    @Test
    public void test04481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04481");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04482");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NULLNULL!!NULLNULL!!NULLNULLNULLNULL!!NULLNULL!!NULLNULL!", "\u029e\u0346\u0346\ua7b0!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04483");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!", "\u0366\u0365\u0368\u0368LL!!LL!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!" + "'", str2, "!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!");
    }

    @Test
    public void test04484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04484");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!\254\254!!\254\254!!!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!!!\254\254!!\254\254!", "N~~~N~~~N~~~N~~~N~~~N~~~N~~~N~~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\254\254!!\254\254!!!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!!!\254\254!!\254\254!" + "'", str2, "!!\254\254!!\254\254!!!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!!!\254\254!!\254\254!");
    }

    @Test
    public void test04485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04485");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!!", "]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!!" + "'", str2, "]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!!");
    }

    @Test
    public void test04486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04486");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("`NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL`NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU`UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!" + "'", str2, "`UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU`UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
    }

    @Test
    public void test04487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04487");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NNNNNNNNNNNNNNNN\200}}`NNNNNNNNNNNNNNNN]]!", "\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!\200}\200\200\200}\200\200!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200}}`\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200]]!" + "'", str2, "\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200}}`\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200]]!");
    }

    @Test
    public void test04488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04488");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```NNNN```!", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```!" + "'", str2, "xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```!");
    }

    @Test
    public void test04489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04489");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("efhhefhh!", "\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UL!!UL!!!" + "'", str2, "UL!!UL!!!");
    }

    @Test
    public void test04490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04490");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200U^LLU^LL}~\200\200}~\200\200U^LLU^LL!", "LL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200L^NNL^NN}~\200\200}~\200\200L^NNL^NN!" + "'", str2, "}~\200\200}~\200\200L^NNL^NN}~\200\200}~\200\200L^NNL^NN!");
    }

    @Test
    public void test04491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04491");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UU!!````````````UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!````````````UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!", "\u014e\u014e\u014e\u014e!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test04492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04492");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128!", "!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test04493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04493");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!!UULLUULLUULLUULLUULLUULLUULLUULL!", "\u0366\u0365\u0368\u0368\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!" + "'", str2, "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!");
    }

    @Test
    public void test04494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04494");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NN!!U`LLU`LLU`LLNN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!U`LLU`LLU`LLNN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!", "!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!``nullnull``nullnull``nullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!``nullnull``nullnull``nullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!``nullnull``nullnull``nullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!``nullnull``nullnull``nullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test04495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04495");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300!", "!\276\276\276\276\276!!\276\276!!\276\276!!\276\276!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04496");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnull]]nullnull]]LnullnullnullLnullnullnullnullnull]]nullnull]]LnullnullnullLnullnullnull!", "}~\200\200}~\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX}~\200\200}~\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test04497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04497");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275nullnullnull\276null\275\275!", "\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnullnullnullnullnullnullnullnullnullnull\276nullnullnullnull\275\275!" + "'", str2, "\275nullnullnullnullnullnullnullnullnullnullnullnull\276nullnullnullnull\275\275!");
    }

    @Test
    public void test04498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04498");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("U\220LL\200}}`U\220LL]]!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\220nullnull\200}}`null\220nullnull]]!" + "'", str2, "null\220nullnull\200}}`null\220nullnull]]!");
    }

    @Test
    public void test04499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04499");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335!", "NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!" + "'", str2, "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!");
    }

    @Test
    public void test04500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04500");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!", "\276L\266\266~LL\276L\266\266~LL!!\276L\266\266~LL\276L\266\266~LL!!\276L\266\266~LL\276L\266\266~LL\276L\266\266~LL\276L\266\266~LL!!\276L\266\266~LL\276L\266\266~LL!!\276L\266\266~LL\276L\266\266~LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!" + "'", str2, "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!");
    }
}
