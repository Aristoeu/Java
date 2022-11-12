package ciphers.SimpleSubCipher;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest29 {

    public static boolean debug = false;

    @Test
    public void test14501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14501");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\335\336\336\336\335\336\336\336!!\335\336\336\336\335\336\336\336!!\335\336\336\336\335\336\336\336!!\335\336\336\336\335\336\336\336!!\335\336\336\336\335\336\336\336!!\335\336\336\336\335\336\336\336!!\335\336\336\336\335\336\336\336!!\335\336\336\336\335\336\336\336!!!", "\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test14502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14502");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "!\253\256\256\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271\266\256\256!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\256\256\256\266\266\266\256\266\266\266\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\256\256\256\266\266\266\256\266\266\266\u0346\u0348\u0348!");
    }

    @Test
    public void test14503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14503");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016enullnullnullnullnullnullnullnull!", "null\236\276\276null\236\276\276!!null\236\276\276null\236\276\276!!null\236\276\276null\236\276\276null\236\276\276null\236\276\276!!null\236\276\276null\236\276\276!!null\236\276\276null\236\276\276!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!");
    }

    @Test
    public void test14504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14504");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\253\256\256\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "}}}}!!!}}}}!!!!!}}}}!!!}}}}!!!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!!!}}}}!!!}}}}!!!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!!!}}}}!!!}}}}!!!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!!!}}}}!!!}}}}!!!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!!!}}}}!!!}}}}!!!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!!!}}}}!!!}}}}!!!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!!!}}}}!!!}}}}!!!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!!!}}}}!!!}}}}!!!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!}}}}!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test14505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14505");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200\200!!\200\200!!\200\200!!\200\200!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL!" + "'", str2, "\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL!");
    }

    @Test
    public void test14506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14506");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u01bc\u01bc\u01ba\u01ba\u01bc\u01bc\u01bc\u01ba\u01ba\u01bc\u01bc\u01bc\u01ba\u01ba\u01bc\u01bc\u01bc\u01ba\u01ba\u01bc\u01bc\u01bc\u01ba\u01ba\u01bc\u01bc\u01bc\u01ba\u01ba\u01bc\u01bc\u01bc\u01ba\u01ba\u01bc\u01bc\u01bc\u01ba\u01ba\u01bc~~!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUU~~UUUUU~~UUUUU~~UUUUU~~UUUUU~~UUUUU~~UUUUU~~UUUUU~~!" + "'", str2, "UUUUU~~UUUUU~~UUUUU~~UUUUU~~UUUUU~~UUUUU~~UUUUU~~UUUUU~~!");
    }

    @Test
    public void test14507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14507");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "Lnullnullnull\230\226\226Lnullnullnull\230\226\226Lnullnullnull\230\226\226Lnullnullnull\230\226\226Lnullnullnull\230\226\226Lnullnullnull\230\226\226Lnullnullnull\230\226\226Lnullnullnull\230\226\226!!Lnullnullnull\230\226\226Lnullnullnull\230\226\226Lnullnullnull\230\226\226Lnullnullnull\230\226\226Lnullnullnull\230\226\226Lnullnullnull\230\226\226Lnullnullnull\230\226\226Lnullnullnull\230\226\226!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348L\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348L\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230LLLLLL\230\u0348\u0346\u0346!");
    }

    @Test
    public void test14508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14508");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("AUAAnullnullnullnullAUAAAUAAAUAAnullnullnullnullAUAAAUAA!", "null}}}null}}}}}null}}}null}}}}}!!null}}}null}}}}}null}}}null}}}}}!!null}}}null}}}}}null}}}null}}}}}!!null}}}null}}}}}null}}}null}}}}}!!null}}}null}}}}}null}}}null}}}}}!!null}}}null}}}}}null}}}null}}}}}!!null}}}null}}}}}null}}}null}}}}}!!null}}}null}}}}}null}}}null}}}}}!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0147\u0166\u0167\u0169\u0169\u0166\u0167\u0169\u0169\u0166\u0167\u0169\u0169\u0166\u0167\u0169\u0169\u0147\u0147\u0147\u0166\u0167\u0169\u0169\u0166\u0167\u0169\u0169\u0166\u0167\u0169\u0169\u0166\u0167\u0169\u0169\u0147\u0147nullnull!" + "'", str2, "\u0147\u0166\u0167\u0169\u0169\u0166\u0167\u0169\u0169\u0166\u0167\u0169\u0169\u0166\u0167\u0169\u0169\u0147\u0147\u0147\u0166\u0167\u0169\u0169\u0166\u0167\u0169\u0169\u0166\u0167\u0169\u0169\u0166\u0167\u0169\u0169\u0147\u0147nullnull!");
    }

    @Test
    public void test14509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14509");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "!!]]!!]]\200!!!\200!!!!!]]!!]]\200!!!\200!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test14510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14510");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\216!~~\216!~~\216!~~\216!~~\216!~~\216!~~\216!~~\216!~~VSTTVSTTVSTTVSTTVSTTVSTTVSTTVSTT\216!~~\216!~~\216!~~\216!~~\216!~~\216!~~\216!~~\216!~~VSTTVSTTVSTTVSTTVSTTVSTTVSTTVSTT!", "U!!!U!!!\254\254U!!!U!!!\254\254]]U!!!U!!!\254\254U!!!U!!!\254\254]]\214U!!!U!!!\254\254U!!!U!!!\254\254U!!!U!!!\254\254\214U!!!U!!!\254\254U!!!U!!!\254\254U!!!U!!!\254\254U!!!U!!!\254\254U!!!U!!!\254\254]]U!!!U!!!\254\254U!!!U!!!\254\254]]\214U!!!U!!!\254\254U!!!U!!!\254\254U!!!U!!!\254\254\214U!!!U!!!\254\254U!!!U!!!\254\254U!!!U!!!\254\254!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\216!~~\216!~~\216!~~\216!~~\216!~~\216!~~\216!~~\216!~~]\254\254\254]\254\254\254]\254\254\254]\254\254\254]\254\254\254]\254\254\254]\254\254\254]\254\254\254\216!~~\216!~~\216!~~\216!~~\216!~~\216!~~\216!~~\216!~~]\254\254\254]\254\254\254]\254\254\254]\254\254\254]\254\254\254]\254\254\254]\254\254\254]\254\254\254!" + "'", str2, "\216!~~\216!~~\216!~~\216!~~\216!~~\216!~~\216!~~\216!~~]\254\254\254]\254\254\254]\254\254\254]\254\254\254]\254\254\254]\254\254\254]\254\254\254]\254\254\254\216!~~\216!~~\216!~~\216!~~\216!~~\216!~~\216!~~\216!~~]\254\254\254]\254\254\254]\254\254\254]\254\254\254]\254\254\254]\254\254\254]\254\254\254]\254\254\254!");
    }

    @Test
    public void test14511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14511");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\300\300!!\300\300!!\300\300!!\300\300\u0346\u0348\u0348!", "^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200^```^```^```^```^```^```^```^```^```^```\200\200\200\200\200\200\200\200^```^```\200\200\200\200\200\200\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\200\200!!\200\200!!\200\200!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\200\200!!\200\200!!\200\200!!\200\200\u0346\u0348\u0348!");
    }
}
