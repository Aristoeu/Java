package ciphers.SimpleSubCipher;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13 {

    public static boolean debug = false;

    @Test
    public void test06501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06501");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!!", "UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226!!UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226UNLL\230\226\226!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\255\255\257\257\255\255\257\257!!\255\255\257\257\255\255\257\257!!\255\255\257\257\255\255\257\257!!\255\255\257\257\255\255\257\257!!\255\255\257\257\255\255\257\257!!\255\255\257\257\255\255\257\257!!\255\255\257\257\255\255\257\257!!\255\255\257\257\255\255\257\257!!!" + "'", str2, "\255\255\257\257\255\255\257\257!!\255\255\257\257\255\255\257\257!!\255\255\257\257\255\255\257\257!!\255\255\257\257\255\255\257\257!!\255\255\257\257\255\255\257\257!!\255\255\257\257\255\255\257\257!!\255\255\257\257\255\255\257\257!!\255\255\257\257\255\255\257\257!!!");
    }

    @Test
    public void test06502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06502");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06503");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0143\u0145\u0145\u0145\u0143\u0145\u0143\u0145\u0143\u0145\u0143\u0143\u0145\u0145\u0145\u0143\u0145\u0143!!!", "~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd~}\200\200~}\200\200\u01da\u01da\u01dd\u01dd\u01da\u01da\u01dd\u01dd!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnullnull!!nullnull!!nullnull!!nullnull!!null!nullnullnullnull!!nullnull!!!" + "'", str2, "null!nullnullnullnull!!nullnull!!nullnull!!nullnull!!null!nullnullnullnull!!nullnull!!!");
    }

    @Test
    public void test06504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06504");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!", "!!!\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!" + "'", str2, "\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!");
    }

    @Test
    public void test06505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06505");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~!" + "'", str2, "\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~!");
    }

    @Test
    public void test06506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06506");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test06507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06507");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!", "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!" + "'", str2, "LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!");
    }

    @Test
    public void test06508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06508");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!", "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!" + "'", str2, "!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!");
    }

    @Test
    public void test06509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06509");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\340null\335\335\340null\335\335!!\340null\335\335\340null\335\335!!\340null\335\335\340null\335\335\340null\335\335\340null\335\335!!\340null\335\335\340null\335\335!!\340null\335\335\340null\335\335!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06510");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264\u0264\u0262\u0264\u0264!", "\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06511");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad!!!", "UUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test06512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06512");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!", "\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348LNN!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348LNN!");
    }

    @Test
    public void test06513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06513");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!", "\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06514");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\215}\215\215\215}\215\215nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\215}\215\215\215}\215\215!", "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368LLLLLLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\215}\215\215\215}\215\215!");
    }

    @Test
    public void test06515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06515");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\340\336\336nullnullnullnull\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336nullnullnullnull\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336null\340\336\336!", "lluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\340\336\336nullnullnullnull\340\336\336null\340\336\336null\340\336\336null\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336null\340\336\336null\340\336\336null\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnull!" + "'", str2, "null\340\336\336nullnullnullnull\340\336\336null\340\336\336null\340\336\336null\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336null\340\336\336null\340\336\336null\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnull!");
    }

    @Test
    public void test06516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06516");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]!", "``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU```UU``UU``UU``UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]!" + "'", str2, "]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]!");
    }

    @Test
    public void test06517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06517");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!!!\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!!!]]!", "nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!!!\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!!!]]!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!!!\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!!!]]!");
    }

    @Test
    public void test06518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06518");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!", "}~\200\200}~\200\200UN!!!N!!!N!!!N!!^UN!!!N!!!N!!!N!!UN!!!N!!!N!!!N!!UN!!!N!!!N!!!N!!^UN!!!N!!!N!!!N!!UN!!!N!!!N!!!N!!}~\200\200}~\200\200UN!!!N!!!N!!!N!!^UN!!!N!!!N!!!N!!UN!!!N!!!N!!!N!!UN!!!N!!!N!!!N!!^UN!!!N!!!N!!!N!!UN!!!N!!!N!!!N!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\220NN\200~~!\220NN\200~~!\220NN!\220NN!\220NN\200~~!\220NN\200~~!\220NN!\220NN!!!\220NN\200~~!\220NN\200~~!\220NN!\220NN!\220NN\200~~!\220NN\200~~!\220NN!\220NN!!!\220NN\200~~!\220NN\200~~!\220NN!\220NN!\220NN\200~~!\220NN\200~~!\220NN!\220NN!\220NN\200~~!\220NN\200~~!\220NN!\220NN!\220NN\200~~!\220NN\200~~!\220NN!\220NN!!!\220NN\200~~!\220NN\200~~!\220NN!\220NN!\220NN\200~~!\220NN\200~~!\220NN!\220NN!!!\220NN\200~~!\220NN\200~~!\220NN!\220NN!\220NN\200~~!\220NN\200~~!\220NN!\220NN!" + "'", str2, "!\220NN\200~~!\220NN\200~~!\220NN!\220NN!\220NN\200~~!\220NN\200~~!\220NN!\220NN!!!\220NN\200~~!\220NN\200~~!\220NN!\220NN!\220NN\200~~!\220NN\200~~!\220NN!\220NN!!!\220NN\200~~!\220NN\200~~!\220NN!\220NN!\220NN\200~~!\220NN\200~~!\220NN!\220NN!\220NN\200~~!\220NN\200~~!\220NN!\220NN!\220NN\200~~!\220NN\200~~!\220NN!\220NN!!!\220NN\200~~!\220NN\200~~!\220NN!\220NN!\220NN\200~~!\220NN\200~~!\220NN!\220NN!!!\220NN\200~~!\220NN\200~~!\220NN!\220NN!\220NN\200~~!\220NN\200~~!\220NN!\220NN!");
    }

    @Test
    public void test06519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06519");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!", "!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test06520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06520");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198nullnullnullnullnullnullnullnull!", "JL\225\225JL\225\225\225\225JL\225\225JL\225\225\225\225!!JL\225\225JL\225\225\225\225JL\225\225JL\225\225\225\225!!JL\225\225JL\225\225\225\225JL\225\225JL\225\225\225\225!!JL\225\225JL\225\225\225\225JL\225\225JL\225\225\225\225!!JL\225\225JL\225\225\225\225JL\225\225JL\225\225\225\225!!JL\225\225JL\225\225\225\225JL\225\225JL\225\225\225\225!!JL\225\225JL\225\225\225\225JL\225\225JL\225\225\225\225!!JL\225\225JL\225\225\225\225JL\225\225JL\225\225\225\225!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullL\225!!L\225!!L\225!!L\225!!L\225!!L\225!!L\225!!L\225!!L\225!!L\225!!L\225!!L\225!!L\225!!L\225!!L\225!!L\225!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullL\225!!L\225!!L\225!!L\225!!L\225!!L\225!!L\225!!L\225!!!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullL\225!!L\225!!L\225!!L\225!!L\225!!L\225!!L\225!!L\225!!L\225!!L\225!!L\225!!L\225!!L\225!!L\225!!L\225!!L\225!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullL\225!!L\225!!L\225!!L\225!!L\225!!L\225!!L\225!!L\225!!!");
    }

    @Test
    public void test06521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06521");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\200\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142]]!", "!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull\200}}`!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull]]!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull\200}}`!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull]]!");
    }

    @Test
    public void test06522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06522");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!", "N\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNN!!N\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNN!!N\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNN!!N\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNN!!N\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNNN\275NNN\275NNNN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248nullnullnull!" + "'", str2, "\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248\u0248nullnullnull!");
    }

    @Test
    public void test06523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06523");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull!!``nullnull``nullnull``nullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!``nullnull``nullnull``nullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!", "LLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!LLUULLUULLUULLUULLUULLUULLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LUUULUUU!!``LUUULUUU``LUUULUUU``LUUULUUULUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!``LUUULUUU``LUUULUUU``LUUULUUULUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!!" + "'", str2, "LUUULUUU!!``LUUULUUU``LUUULUUU``LUUULUUULUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!``LUUULUUU``LUUULUUU``LUUULUUULUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!!");
    }

    @Test
    public void test06524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06524");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN!", "\275HHH\275HHH\275HHH\275HHH\275HHH\275HHH\275HHH\275HHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06525");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200\u0126\u0128\u0128\u0126\u0128\u0128}~\200\200}~\200\200\u0126\u0128\u0128\u0126\u0128\u0128}~\200\200}~\200\200\u0126\u0128\u0128\u0126\u0128\u0128}~\200\200}~\200\200\u0126\u0128\u0128\u0126\u0128\u0128\u0348\u0346\u0346!", "]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200\u0348\u0346\u0346!");
    }

    @Test
    public void test06526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06526");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!" + "'", str2, "\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!");
    }

    @Test
    public void test06527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06527");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "`!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull`!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06528");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("`oprroprroprr`oprroprroprr!", "ELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`nullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "`nullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06529");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!", "^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230^```^```^```^```^```^```^```^```^```^```\226XXXX\230\230\226XXXX\230\230^```^```\226XXXX\230\230\226XXXX\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!");
    }

    @Test
    public void test06530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06530");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!" + "'", str2, "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!");
    }

    @Test
    public void test06531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06531");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLLLLLLLLLLLLLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLLLLLLLLLLLLLL]]!", "!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\200\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0]]!" + "'", str2, "\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\200\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0]]!");
    }

    @Test
    public void test06532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06532");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!", "qrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnullqrttqrttqrttqrttqrttqrttqrttqrttnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!" + "'", str2, "!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!");
    }

    @Test
    public void test06533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06533");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!", "\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!" + "'", str2, "!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!");
    }

    @Test
    public void test06534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06534");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0240\u0240!" + "'", str2, "\u0240\u0240!");
    }

    @Test
    public void test06535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06535");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnull\223\223nullnullnullnullnull\223\223nullnullnull}~\200\200}~\200\200nullnull\223\223nullnullnullnullnull\223\223nullnullnull}~\200\200}~\200\200nullnull\223\223nullnullnullnullnull\223\223nullnullnull}~\200\200}~\200\200nullnull\223\223nullnullnullnullnull\223\223\u0348\u0346\u0346!", "porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\223\223\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull\223\223nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\223\223\u0348\u0346\u0346!");
    }

    @Test
    public void test06536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06536");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031anullnullnullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test06537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06537");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0164!!\216\254\254\u0164!!\216\254\254\u0164\u0164\u0164\u0164\u0164\u0164\u0164\u0164\u0164!!\216\254\254\u0164!!\216\254\254\u0164\u0164\u0164\u0164\u0164\u0164\u0164\u0164\u0164!!\216\254\254\u0164!!\216\254\254\u0164\u0164\u0164\u0164\u0164\u0164\u0164\u0164\u0164!!\216\254\254\u0164!!\216\254\254\u0164\u0164\u0164\u0164\u0164\u0164\u0164\u0164\u0164!!\216\254\254\u0164!!\216\254\254\u0164\u0164\u0164\u0164\u0164\u0164\u0164\u0164\u0164!!\216\254\254\u0164!!\216\254\254\u0164\u0164\u0164\u0164\u0164\u0164\u0164\u0164\u0164!!\216\254\254\u0164!!\216\254\254\u0164\u0164\u0164\u0164\u0164\u0164\u0164\u0164\u0164!!\216\254\254\u0164!!\216\254\254\u0164\u0164\u0164\u0164\u0164\u0164\u0164\u0164!!!" + "'", str2, "\u0164!!\216\254\254\u0164!!\216\254\254\u0164\u0164\u0164\u0164\u0164\u0164\u0164\u0164\u0164!!\216\254\254\u0164!!\216\254\254\u0164\u0164\u0164\u0164\u0164\u0164\u0164\u0164\u0164!!\216\254\254\u0164!!\216\254\254\u0164\u0164\u0164\u0164\u0164\u0164\u0164\u0164\u0164!!\216\254\254\u0164!!\216\254\254\u0164\u0164\u0164\u0164\u0164\u0164\u0164\u0164\u0164!!\216\254\254\u0164!!\216\254\254\u0164\u0164\u0164\u0164\u0164\u0164\u0164\u0164\u0164!!\216\254\254\u0164!!\216\254\254\u0164\u0164\u0164\u0164\u0164\u0164\u0164\u0164\u0164!!\216\254\254\u0164!!\216\254\254\u0164\u0164\u0164\u0164\u0164\u0164\u0164\u0164\u0164!!\216\254\254\u0164!!\216\254\254\u0164\u0164\u0164\u0164\u0164\u0164\u0164\u0164!!!");
    }

    @Test
    public void test06538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06538");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("JLLL\200}}`JLLL]]!", "\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01a0!!!\200\u01a0!!!]]!" + "'", str2, "\u01a0!!!\200\u01a0!!!]]!");
    }

    @Test
    public void test06539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06539");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!!``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!!``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!!``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!!``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!", "ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!!``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!!``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!!``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!!``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!" + "'", str2, "``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!!``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!!``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!!``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!!``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!");
    }

    @Test
    public void test06540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06540");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348LNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!" + "'", str2, "\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!");
    }

    @Test
    public void test06541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06541");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!", "\271\271LLnullnullnull\271\271LLnullnullnull\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LLnullnullnull\271\271LLnullnullnull\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LLnullnullnull\271\271LLnullnullnull\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LLnullnullnull\271\271LLnullnullnull\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LLnullnullnull\271\271LLnullnullnull\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LLnullnullnull\271\271LLnullnullnull\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LLnullnullnull\271\271LLnullnullnull\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LLnullnullnull\271\271LLnullnullnull\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL\271\271LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!" + "'", str2, "!!!");
    }

    @Test
    public void test06542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06542");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "!~!!!~!!!!!~!!!~!!!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06543");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200HHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHH~}\200\200~}\200\200HHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHH~}\200\200~}\200\200HHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHH~}\200\200~}\200\200HHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHH~}\200\200~}\200\200HHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHH~}\200\200~}\200\200HHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHH~}\200\200~}\200\200HHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHH~}\200\200~}\200\200HHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHHHEEHHEEHHEEHHEEHHEEHHEEHHEEHHEEHH!", "NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!!NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!!NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!!NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!!NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!" + "'", str2, "~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL~}\200\200~}\200\200LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!");
    }

    @Test
    public void test06544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06544");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull!!!!nullnull!", "!ffFF!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06545");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!```!```!```!```!```!```!```!```!" + "'", str2, "!```!```!```!```!```!```!```!```!");
    }

    @Test
    public void test06546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06546");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214!", "^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214!" + "'", str2, "\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214!");
    }

    @Test
    public void test06547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06547");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNN!", "HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HH!!HH!!HHHHHHHHHH!!HH!!HHHHHHHHHH!!HH!!HHHHHHHHHH!!HH!!HHHHHHHHHH!!HH!!HHHHHHHHHH!!HH!!HHHHHHHHHH!!HH!!HHHHHHHHHH!!HH!!HHHHHHHH!" + "'", str2, "HH!!HH!!HHHHHHHHHH!!HH!!HHHHHHHHHH!!HH!!HHHHHHHHHH!!HH!!HHHHHHHHHH!!HH!!HHHHHHHHHH!!HH!!HHHHHHHHHH!!HH!!HHHHHHHHHH!!HH!!HHHHHHHH!");
    }

    @Test
    public void test06548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06548");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test06549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06549");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!u!", "U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~!" + "'", str2, "!~!");
    }

    @Test
    public void test06550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06550");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368ULLLULLL!!ULLLULLL!!\200\200\u0346\u0348\u0348!", "\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u020c\u020e\u020e\u020e\u020c\u020e\u020e\u020e\u020c\u020e\u020e\u020e\u020c\u020e\u020e\u020e!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u020c\u020e\u020e\u020e\u020c\u020e\u020e\u020e\u020c\u020e\u020e\u020e\u020c\u020e\u020e\u020e!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test06551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06551");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!", "LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214LLUULLUU\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!" + "'", str2, "!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!");
    }

    @Test
    public void test06552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06552");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!", "\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LLUULLUULLUU!LLUULLUULLUU!!!LLUULLUULLUU!LLUULLUULLUU!!!LLUULLUULLUU!LLUULLUULLUU!LLUULLUULLUU!LLUULLUULLUU!!!LLUULLUULLUU!LLUULLUULLUU!!!LLUULLUULLUU!LLUULLUULLUU!" + "'", str2, "!LLUULLUULLUU!LLUULLUULLUU!!!LLUULLUULLUU!LLUULLUULLUU!!!LLUULLUULLUU!LLUULLUULLUU!LLUULLUULLUU!LLUULLUULLUU!!!LLUULLUULLUU!LLUULLUULLUU!!!LLUULLUULLUU!LLUULLUULLUU!");
    }

    @Test
    public void test06553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06553");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!!!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!~LLLLLLLL!!!", "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!!!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!!!" + "'", str2, "!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!!!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!~UUUUUUUU!!!");
    }

    @Test
    public void test06554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06554");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnull\200\200!!\200\200!!\200\200!!\200\200!!!", "LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L!!!L!!!L!!!L!!!\200\200!!\200\200!!\200\200!!\200\200!!!" + "'", str2, "L!!!L!!!L!!!L!!!\200\200!!\200\200!!\200\200!!\200\200!!!");
    }

    @Test
    public void test06555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06555");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\300\300\300null\300\300\300null\300\300\300null\300\300\300null\300\300\300null\300\300\300null\300\300\300null\300\300\300!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06556");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!", "UNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!!LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!!LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!!LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!!LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!" + "'", str2, "LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!!LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!!LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!!LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!!LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNN\200~~LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!");
    }

    @Test
    public void test06557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06557");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06558");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366!", "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366!" + "'", str2, "\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366!");
    }

    @Test
    public void test06559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06559");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\200\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0]]!", "~~!!null~~~null~~~null~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!null~~~null~~~null~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test06560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06560");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!", "LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!" + "'", str2, "UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!");
    }

    @Test
    public void test06561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06561");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275nullnull\200\200nullnull\200\200nullnull\200\200\276nullnull\200\200\275\275!", "NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\u0126\u0128\u0128\u0126\u0128\u0128\200\200\u0126\u0128\u0128\u0126\u0128\u0128\200\200\u0126\u0128\u0128\u0126\u0128\u0128\200\200\276\u0126\u0128\u0128\u0126\u0128\u0128\200\200\275\275!" + "'", str2, "\275\u0126\u0128\u0128\u0126\u0128\u0128\200\200\u0126\u0128\u0128\u0126\u0128\u0128\200\200\u0126\u0128\u0128\u0126\u0128\u0128\200\200\276\u0126\u0128\u0128\u0126\u0128\u0128\200\200\275\275!");
    }

    @Test
    public void test06562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06562");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}~\200\200}~\200\200\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e}~\200\200}~\200\200\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e\u0240\u023e\u023e\u023e!", "\215}\215\215\215}\215\215A]]]A]]]A]]]A]]]\215}\215\215\215}\215\215!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06563");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null!nullnullnull!nullnullnull!nullnullnull!nullnull\200}}`null!nullnullnull!nullnullnull!nullnullnull!nullnull]]!", "NNLLLNLLLNLLLNNLLLNLLLNLLLNNLLLNLLLNLLLNNLLLNLLLNLLL\200}}`NNLLLNLLLNLLLNNLLLNLLLNLLLNNLLLNLLLNLLLNNLLLNLLLNLLL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\311null\314\314!\311null\314\314\311null\314\314\311null\314\314!\311null\314\314\311null\314\314\311null\314\314!\311null\314\314\311null\314\314\311null\314\314!\311null\314\314\311null\314\314\200}}`\311null\314\314!\311null\314\314\311null\314\314\311null\314\314!\311null\314\314\311null\314\314\311null\314\314!\311null\314\314\311null\314\314\311null\314\314!\311null\314\314\311null\314\314]]!" + "'", str2, "\311null\314\314!\311null\314\314\311null\314\314\311null\314\314!\311null\314\314\311null\314\314\311null\314\314!\311null\314\314\311null\314\314\311null\314\314!\311null\314\314\311null\314\314\200}}`\311null\314\314!\311null\314\314\311null\314\314\311null\314\314!\311null\314\314\311null\314\314\311null\314\314!\311null\314\314\311null\314\314\311null\314\314!\311null\314\314\311null\314\314]]!");
    }

    @Test
    public void test06564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06564");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~null\275!!null\275!!null\275!!null\275!!null\275!!null\275!!null\275!!null\275!!\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~null\275!!null\275!!null\275!!null\275!!null\275!!null\275!!null\275!!null\275!!!" + "'", str2, "\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~null\275!!null\275!!null\275!!null\275!!null\275!!null\275!!null\275!!null\275!!\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~null\275!!null\275!!null\275!!null\275!!null\275!!null\275!!null\275!!null\275!!!");
    }

    @Test
    public void test06565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06565");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\220NN\200~~!\220NN\200~~!\220NN!\220NN!\220NN\200~~!\220NN\200~~!\220NN!\220NN!!!\220NN\200~~!\220NN\200~~!\220NN!\220NN!\220NN\200~~!\220NN\200~~!\220NN!\220NN!!!\220NN\200~~!\220NN\200~~!\220NN!\220NN!\220NN\200~~!\220NN\200~~!\220NN!\220NN!\220NN\200~~!\220NN\200~~!\220NN!\220NN!\220NN\200~~!\220NN\200~~!\220NN!\220NN!!!\220NN\200~~!\220NN\200~~!\220NN!\220NN!\220NN\200~~!\220NN\200~~!\220NN!\220NN!!!\220NN\200~~!\220NN\200~~!\220NN!\220NN!\220NN\200~~!\220NN\200~~!\220NN!\220NN!", "HH!!HH!!HHHH!!HH!!HH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!" + "'", str2, "!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!");
    }

    @Test
    public void test06566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06566");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]]\220\220]]\220\220!!]]\220\220]]\220\220!!]]\220\220]]\220\220]]\220\220]]\220\220!!]]\220\220]]\220\220!!]]\220\220]]\220\220!", "\253\254\256\256LNUULNUULNUULNUU\253\254\256\256LNUULNUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]\220\220]]\220\220!!]]\220\220]]\220\220!!]]\220\220]]\220\220]]\220\220]]\220\220!!]]\220\220]]\220\220!!]]\220\220]]\220\220!" + "'", str2, "]]\220\220]]\220\220!!]]\220\220]]\220\220!!]]\220\220]]\220\220]]\220\220]]\220\220!!]]\220\220]]\220\220!!]]\220\220]]\220\220!");
    }

    @Test
    public void test06567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06567");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06568");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]]]]]]]]!!]]]]]]]]!!!", "\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]]]]]]]!!]]]]]]]]!!!" + "'", str2, "]]]]]]]]!!]]]]]]]]!!!");
    }

    @Test
    public void test06569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06569");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!", "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!" + "'", str2, "!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!");
    }

    @Test
    public void test06570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06570");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL!!LL!!!LLL!LLLLL!!LL!!!LLL!LLLLL!!LL!!!LLL!LLLLL!!LL!!!LLL!LLLLL!!LL!!!LLL!LLLLL!!LL!!!LLL!LLLLL!!LL!!!LLL!LLLLL!!LL!!!LLL!LLL!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!nullnullnull!nullnullnullnullnull!!nullnull!!!nullnullnull!nullnullnullnullnull!!nullnull!!!nullnullnull!nullnullnullnullnull!!nullnull!!!nullnullnull!nullnullnullnullnull!!nullnull!!!nullnullnull!nullnullnullnullnull!!nullnull!!!nullnullnull!nullnullnullnullnull!!nullnull!!!nullnullnull!nullnullnullnullnull!!nullnull!!!nullnullnull!nullnullnull!" + "'", str2, "nullnull!!nullnull!!!nullnullnull!nullnullnullnullnull!!nullnull!!!nullnullnull!nullnullnullnullnull!!nullnull!!!nullnullnull!nullnullnullnullnull!!nullnull!!!nullnullnull!nullnullnullnullnull!!nullnull!!!nullnullnull!nullnullnullnullnull!!nullnull!!!nullnullnull!nullnullnullnullnull!!nullnull!!!nullnullnull!nullnullnullnullnull!!nullnull!!!nullnullnull!nullnullnull!");
    }

    @Test
    public void test06571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06571");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128!", "UU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUU!!UU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUU!!UU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUU!!UU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUU!!UU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU!" + "'", str2, "U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU!");
    }

    @Test
    public void test06572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06572");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("P\220NN\200}}`P\220NN]]!", "\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\220nullnull\200}}`null\220nullnull]]!" + "'", str2, "null\220nullnull\200}}`null\220nullnull]]!");
    }

    @Test
    public void test06573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06573");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\200\200\u0346\u0348\u0348!", "]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!]null!!\254\253\256\256\254\253\256\256\254\253\256\256]null!!\254\253\256\256\254\253\256\256\254\253\256\256!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368!\253LL!\253LL!\253LL!\253LL!\253LL!\253LL!\253LL!\253LL!!!\253LL!\253LL!\253LL!\253LL!\253LL!\253LL!\253LL!\253LL!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368!\253LL!\253LL!\253LL!\253LL!\253LL!\253LL!\253LL!\253LL!!!\253LL!\253LL!\253LL!\253LL!\253LL!\253LL!\253LL!\253LL!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test06574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06574");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06575");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335!", "\u0346\u0348\u0348\u0348\225\226\230\230\225\226\230\230\225\226\230\230\225\226\230\230\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06576");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]]\275]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06577");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEEEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEEEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEEEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEEEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEEEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEEEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEEEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEE!", "}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}!" + "'", str2, "}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}!");
    }

    @Test
    public void test06578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06578");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("`nullnullnull`nullnullnull!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`nullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "`nullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06579");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "nullnullnullnullnullnullnullnull!!\276\276!!\276\276nullnullnullnullnullnullnullnull!!\276\276!!\276\276nullnullnullnullnullnullnullnull!!\276\276!!\276\276nullnullnullnullnullnullnullnull!!\276\276!!\276\276nullnullnullnullnullnullnullnull!!\276\276!!\276\276nullnullnullnullnullnullnullnull!!\276\276!!\276\276nullnullnullnullnullnullnullnull!!\276\276!!\276\276nullnullnullnullnullnullnullnull!!\276\276!!\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06580");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!", "LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!" + "'", str2, "!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!");
    }

    @Test
    public void test06581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06581");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("````````````````\200}}`````````````````]]!", "}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````````````````\200}}`````````````````]]!" + "'", str2, "````````````````\200}}`````````````````]]!");
    }

    @Test
    public void test06582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06582");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}!" + "'", str2, "}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}!");
    }

    @Test
    public void test06583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06583");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\255\255\257\257\255\255\257\257!!\255\255\257\257\255\255\257\257!!\255\255\257\257\255\255\257\257!!\255\255\257\257\255\255\257\257!!\255\255\257\257\255\255\257\257!!\255\255\257\257\255\255\257\257!!\255\255\257\257\255\255\257\257!!\255\255\257\257\255\255\257\257!!!", "}~\200\200}~\200\200ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL}~\200\200}~\200\200ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\255\255\257\257\255\255\257\257!!\255\255\257\257\255\255\257\257!!\255\255\257\257\255\255\257\257!!\255\255\257\257\255\255\257\257!!\255\255\257\257\255\255\257\257!!\255\255\257\257\255\255\257\257!!\255\255\257\257\255\255\257\257!!\255\255\257\257\255\255\257\257!!!" + "'", str2, "\255\255\257\257\255\255\257\257!!\255\255\257\257\255\255\257\257!!\255\255\257\257\255\255\257\257!!\255\255\257\257\255\255\257\257!!\255\255\257\257\255\255\257\257!!\255\255\257\257\255\255\257\257!!\255\255\257\257\255\255\257\257!!\255\255\257\257\255\255\257\257!!!");
    }

    @Test
    public void test06584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06584");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!", "\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\200\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!" + "'", str2, "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!");
    }

    @Test
    public void test06585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06585");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LL\300\300LL\300\300!", "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200\u01d0\u01d0\200\200\u01d0\u01d0!" + "'", str2, "\200\200\u01d0\u01d0\200\200\u01d0\u01d0!");
    }

    @Test
    public void test06586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06586");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275nmppnmppnmpp\275nmppnmppnmpp\275nmppnmppnmpp\275nmppnmppnmppnmppnmpp\275\275nmppnmpp\275\275nmppnmpp\275\275nmppnmpp\275\275\275nmppnmppnmpp\275nmppnmppnmpp\275nmppnmppnmpp\275nmppnmppnmppnmppnmpp\275\275nmppnmpp\275\275!", "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!!!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!!!!!!!!!!!!\275!!!!!!!!!!!!\275!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!!!!\275\275!!!!!!!!\275\275!!!!!!!!\275\275!!!!!!!!\275\275\275!!!!!!!!!!!!\275!!!!!!!!!!!!\275!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!!!!\275\275!!!!!!!!\275\275!" + "'", str2, "\275!!!!!!!!!!!!\275!!!!!!!!!!!!\275!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!!!!\275\275!!!!!!!!\275\275!!!!!!!!\275\275!!!!!!!!\275\275\275!!!!!!!!!!!!\275!!!!!!!!!!!!\275!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!!!!\275\275!!!!!!!!\275\275!");
    }

    @Test
    public void test06587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06587");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!!!!!!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!!!!" + "'", str2, "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!!!!");
    }

    @Test
    public void test06588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06588");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!!", "nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!!" + "'", str2, "\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!\253\254\256\256N\300!!N\300!!N\300!!N\300!!N\300!!N\300!!!!!");
    }

    @Test
    public void test06589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06589");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!]!!!]!!!!!]!!!]!!!!!]!!!]!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!", "}~\200\200}~\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU}~\200\200}~\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]!!!]!!!!!]!!!]!!!!!]!!!]!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!" + "'", str2, "!]!!!]!!!!!]!!!]!!!!!]!!!]!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!");
    }

    @Test
    public void test06590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06590");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!", "nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!!LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!!LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!!LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!!LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!!LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!!LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!!LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!" + "'", str2, "!!LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!!LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!!LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!!LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!!LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!!LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!!LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!!LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!");
    }

    @Test
    public void test06591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06591");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!N!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!" + "'", str2, "!null!");
    }

    @Test
    public void test06592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06592");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull\254\254nullnull\254\254]]nullnull\254\254nullnull\254\254]]\214nullnull\254\254nullnull\254\254nullnull\254\254\214nullnull\254\254nullnull\254\254nullnull\254\254nullnull\254\254nullnull\254\254]]nullnull\254\254nullnull\254\254]]\214nullnull\254\254nullnull\254\254nullnull\254\254\214nullnull\254\254nullnull\254\254nullnull\254\254!", "!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "XXXXXXXX\254\254XXXXXXXX\254\254]]XXXXXXXX\254\254XXXXXXXX\254\254]]\214XXXXXXXX\254\254XXXXXXXX\254\254XXXXXXXX\254\254\214XXXXXXXX\254\254XXXXXXXX\254\254XXXXXXXX\254\254XXXXXXXX\254\254XXXXXXXX\254\254]]XXXXXXXX\254\254XXXXXXXX\254\254]]\214XXXXXXXX\254\254XXXXXXXX\254\254XXXXXXXX\254\254\214XXXXXXXX\254\254XXXXXXXX\254\254XXXXXXXX\254\254!" + "'", str2, "XXXXXXXX\254\254XXXXXXXX\254\254]]XXXXXXXX\254\254XXXXXXXX\254\254]]\214XXXXXXXX\254\254XXXXXXXX\254\254XXXXXXXX\254\254\214XXXXXXXX\254\254XXXXXXXX\254\254XXXXXXXX\254\254XXXXXXXX\254\254XXXXXXXX\254\254]]XXXXXXXX\254\254XXXXXXXX\254\254]]\214XXXXXXXX\254\254XXXXXXXX\254\254XXXXXXXX\254\254\214XXXXXXXX\254\254XXXXXXXX\254\254XXXXXXXX\254\254!");
    }

    @Test
    public void test06593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06593");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("`nullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnull!", "\276\276\300\300\276\276\300\300\276\276\300\300\276\276\300\300\276\276\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06594");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u029e\u0346\u0346\ua7b0!!!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346null!!!" + "'", str2, "\u0346\u0346null!!!");
    }

    @Test
    public void test06595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06595");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("bnullnullnullbnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullbnullnullnullbnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnull!", "!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "N!LLL!LLL!LLLN!LLL!LLL!LLLN!LLL!LLL!LLLN!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLLN!LLL!LLL!LLLN!LLL!LLL!LLLN!LLL!LLL!LLLN!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!" + "'", str2, "N!LLL!LLL!LLLN!LLL!LLL!LLLN!LLL!LLL!LLLN!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLLN!LLL!LLL!LLLN!LLL!LLL!LLLN!LLL!LLL!LLLN!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!");
    }

    @Test
    public void test06596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06596");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!", "null\275\275\275null\275\275\275!!null\275\275\275null\275\275\275!!null\275\275\275null\275\275\275null\275\275\275null\275\275\275!!null\275\275\275null\275\275\275!!null\275\275\275null\275\275\275!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\275nullnull!\275nullnull!\275nullnull!\275nullnull!\275nullnull!" + "'", str2, "!\275nullnull!\275nullnull!\275nullnull!\275nullnull!\275nullnull!");
    }

    @Test
    public void test06597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06597");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!~LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06598");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("bnullnullnullbnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullbnullnullnullbnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnull!", "!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!!!!!!!!!!!!!!!!!!!!\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test06599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06599");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348!", "nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348!" + "'", str2, "\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348!");
    }

    @Test
    public void test06600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06600");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull\254\254nullnull\254\254]]nullnull\254\254nullnull\254\254]]\214nullnull\254\254nullnull\254\254nullnull\254\254\214nullnull\254\254nullnull\254\254nullnull\254\254nullnull\254\254nullnull\254\254]]nullnull\254\254nullnull\254\254]]\214nullnull\254\254nullnull\254\254nullnull\254\254\214nullnull\254\254nullnull\254\254nullnull\254\254!", "~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LUUULUUU\254\254LUUULUUU\254\254]]LUUULUUU\254\254LUUULUUU\254\254]]\214LUUULUUU\254\254LUUULUUU\254\254LUUULUUU\254\254\214LUUULUUU\254\254LUUULUUU\254\254LUUULUUU\254\254LUUULUUU\254\254LUUULUUU\254\254]]LUUULUUU\254\254LUUULUUU\254\254]]\214LUUULUUU\254\254LUUULUUU\254\254LUUULUUU\254\254\214LUUULUUU\254\254LUUULUUU\254\254LUUULUUU\254\254!" + "'", str2, "LUUULUUU\254\254LUUULUUU\254\254]]LUUULUUU\254\254LUUULUUU\254\254]]\214LUUULUUU\254\254LUUULUUU\254\254LUUULUUU\254\254\214LUUULUUU\254\254LUUULUUU\254\254LUUULUUU\254\254LUUULUUU\254\254LUUULUUU\254\254]]LUUULUUU\254\254LUUULUUU\254\254]]\214LUUULUUU\254\254LUUULUUU\254\254LUUULUUU\254\254\214LUUULUUU\254\254LUUULUUU\254\254LUUULUUU\254\254!");
    }

    @Test
    public void test06601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06601");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULLUULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULL!", "}!\200\200}!\200\200}!\200\200}!\200\200!!!!!!!!!!!!!!!!}!\200\200}!\200\200}!\200\200}!\200\200!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06602");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull!!!!nullnull!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLLUNLL!!!!UNLLUNLL!" + "'", str2, "UNLLUNLL!!!!UNLLUNLL!");
    }

    @Test
    public void test06603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06603");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!", "\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!" + "'", str2, "]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!");
    }

    @Test
    public void test06604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06604");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull!", "]!!\275\275\275!!!!\275\275\275!!!!\275\275\275!!!!\275\275\275!!!!\275\275\275!!]]!!\275\275\275!!!!\275\275\275!!]]!!\275\275\275!!!!\275\275\275!!]]!!\275\275\275!!!!\275\275\275!!]]]!!\275\275\275!!!!\275\275\275!!!!\275\275\275!!!!\275\275\275!!!!\275\275\275!!]]!!\275\275\275!!!!\275\275\275!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!" + "'", str2, "!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!!\275\275!!\275\275!]!!!]!!!");
    }

    @Test
    public void test06605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06605");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~nullnullnull\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~nullnullnull]]!", "!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\200\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e]]!" + "'", str2, "\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\200\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e\u0348\u0348\u016c\u016e\u016e\u016c\u016e\u016e\u016c\u016e\u016e]]!");
    }

    @Test
    public void test06606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06606");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!", "!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!" + "'", str2, "!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!");
    }

    @Test
    public void test06607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06607");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440\u043d\u043e\u0440\u0440nullnull!", "\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254NL]]NL]]NL]]NL]]NL]]NL]]NL]]NL]]\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254NL]]NL]]NL]]NL]]NL]]NL]]NL]]NL]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullLN]]LN]]nullnullnullnullnullnullnullnullLN]]LN]]nullnullnullnullnullnullnullnullLN]]LN]]nullnullnullnullnullnullnullnullLN]]LN]]nullnullnullnullnullnullnullnullLN]]LN]]nullnullnullnullnullnullnullnullLN]]LN]]nullnullnullnullnullnullnullnullLN]]LN]]nullnullnullnullnullnullnullnullLN]]LN]]!" + "'", str2, "nullnullnullnullnullnullnullnullLN]]LN]]nullnullnullnullnullnullnullnullLN]]LN]]nullnullnullnullnullnullnullnullLN]]LN]]nullnullnullnullnullnullnullnullLN]]LN]]nullnullnullnullnullnullnullnullLN]]LN]]nullnullnullnullnullnullnullnullLN]]LN]]nullnullnullnullnullnullnullnullLN]]LN]]nullnullnullnullnullnullnullnullLN]]LN]]!");
    }

    @Test
    public void test06608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06608");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\u037e\u037e\u0348\u0346\u0346!", "NLLLL]NNL]NNL]NNL]NNNLLLL]NNL]NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u037e\u037e\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u037e\u037e\u0348\u0346\u0346!");
    }

    @Test
    public void test06609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06609");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\215}\215\215\215}\215\215nullnullnullnull\215}\215\215\215}\215\215!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\215}\215\215\215}\215\215!");
    }

    @Test
    public void test06610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06610");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]]!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!]]!nullnullnullnull!!!nullnullnullnull!!]]!", "LLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!]]!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!]]!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!]]!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!]]]!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!]]!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!]]!" + "'", str2, "]!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!]]!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!]]!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!]]!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!]]]!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!]]!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!]]!");
    }

    @Test
    public void test06611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06611");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}!", "\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu!!\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu!!\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu!!\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu!!\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}!" + "'", str2, "~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}~}}}~}}}}}!");
    }

    @Test
    public void test06612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06612");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!", "^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!" + "'", str2, "!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!");
    }

    @Test
    public void test06613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06613");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!!", "]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!!" + "'", str2, "\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!!");
    }

    @Test
    public void test06614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06614");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UULLUULL!!!!UULLUULL!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06615");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\254\254!!\254\254!!!", "\u0346\u0346\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\254\254!!\254\254!!!" + "'", str2, "\254\254!!\254\254!!!");
    }

    @Test
    public void test06616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06616");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!!\300\300!!\300\300!!\300\300!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\300\300!!\300\300!!\300\300!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\200}}`NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!NN!!NN!!NN!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!NN!!NN!!NN!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!NN!!NN!!NN!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!NN!!NN!!NN!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test06617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06617");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06618");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]]\300\300]]\300\300!!]]\300\300]]\300\300!!]]\300\300]]\300\300]]\300\300]]\300\300!!]]\300\300]]\300\300!!]]\300\300]]\300\300!", "!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]LL]]LL!!]]LL]]LL!!]]LL]]LL]]LL]]LL!!]]LL]]LL!!]]LL]]LL!" + "'", str2, "]]LL]]LL!!]]LL]]LL!!]]LL]]LL]]LL]]LL!!]]LL]]LL!!]]LL]]LL!");
    }

    @Test
    public void test06619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06619");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt\276!tt!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06620");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!", "``JJ``JJ!!``JJ``JJ!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!" + "'", str2, "``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!");
    }

    @Test
    public void test06621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06621");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("T!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TT!", "\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]!" + "'", str2, "]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]!");
    }

    @Test
    public void test06622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06622");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\305\305\305\305\305\305\305\305\305\305\305\305\305\305\305\305\200}}`\305\305\305\305\305\305\305\305\305\305\305\305\305\305\305\305]]!", "!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!!\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU\230\226UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\230\230\230\230\230\230\230\230\230\230\230\230\230\230\230\200}}`\230\230\230\230\230\230\230\230\230\230\230\230\230\230\230\230]]!" + "'", str2, "\230\230\230\230\230\230\230\230\230\230\230\230\230\230\230\230\200}}`\230\230\230\230\230\230\230\230\230\230\230\230\230\230\230\230]]!");
    }

    @Test
    public void test06623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06623");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u013fLLL\275\u013f\u013f\u013fLLL\275\u013f\u013f\u013fLLL\275\u013f\u013f\u013fLLL\275\u013f\u013f\u013fLLL\275\u013f\u013f\u013fLLL\275\u013f\u013f\u013fLLL\275\u013f\u013f\u013fLLL\275\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fLLL\275\u013f\u013f\u013fLLL\275\u013f\u013f\u013fLLL\275\u013f\u013f\u013fLLL\275\u013f\u013f\u013fLLL\275\u013f\u013f\u013fLLL\275\u013f\u013f\u013fLLL\275\u013f\u013f\u013fLLL\275\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fLLL!" + "'", str2, "\u013fLLL\275\u013f\u013f\u013fLLL\275\u013f\u013f\u013fLLL\275\u013f\u013f\u013fLLL\275\u013f\u013f\u013fLLL\275\u013f\u013f\u013fLLL\275\u013f\u013f\u013fLLL\275\u013f\u013f\u013fLLL\275\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fLLL\275\u013f\u013f\u013fLLL\275\u013f\u013f\u013fLLL\275\u013f\u013f\u013fLLL\275\u013f\u013f\u013fLLL\275\u013f\u013f\u013fLLL\275\u013f\u013f\u013fLLL\275\u013f\u013f\u013fLLL\275\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fLLL!");
    }

    @Test
    public void test06624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06624");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275XXX\275XXX!", "!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnull\275nullnullnull!" + "'", str2, "\275nullnullnull\275nullnullnull!");
    }

    @Test
    public void test06625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06625");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "!\253\256\256\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271\266R!RR\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR!!\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR!!\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR!!\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR!!\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR!" + "'", str2, "\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR!!\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR!!\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR!!\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR!!\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR!");
    }

    @Test
    public void test06626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06626");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300!", "nulloprr!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346dnullnull!" + "'", str2, "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346dnullnull!");
    }

    @Test
    public void test06627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06627");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\223]\223\223\223]\223\223!!\223]\223\223\223]\223\223!!\223]\223\223\223]\223\223\223]\223\223\223]\223\223!!\223]\223\223\223]\223\223!!\223]\223\223\223]\223\223!", "]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull!!]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull!!]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull!!]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull!!]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull]]]]]]]]nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\223]\223\223\223]\223\223!!\223]\223\223\223]\223\223!!\223]\223\223\223]\223\223\223]\223\223\223]\223\223!!\223]\223\223\223]\223\223!!\223]\223\223\223]\223\223!" + "'", str2, "\223]\223\223\223]\223\223!!\223]\223\223\223]\223\223!!\223]\223\223\223]\223\223\223]\223\223\223]\223\223!!\223]\223\223\223]\223\223!!\223]\223\223\223]\223\223!");
    }

    @Test
    public void test06628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06628");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~\200}}~\200}}~\200}}~\200}}nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~\200}}~\200}}~\200}}~\200}}nullnullnullnullnullnullnullnull!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~\200}}~\200}}~\200}}~\200}}UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL~\200}}~\200}}~\200}}~\200}}UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!" + "'", str2, "~\200}}~\200}}~\200}}~\200}}UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL~\200}}~\200}}~\200}}~\200}}UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
    }

    @Test
    public void test06629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06629");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("l]lll]ll!!l]lll]ll!!l]lll]lll]lll]ll!!l]lll]ll!!l]lll]ll!", "LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!LUNNLUNN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]!!!]!!!!!]!!!]!!!!!]!!!]!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!" + "'", str2, "!]!!!]!!!!!]!!!]!!!!!]!!!]!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!");
    }

    @Test
    public void test06630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06630");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220!", "nullnull]]nullnull]]nullnullnullnullnullnullnullnullnullnull]]nullnull]]nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200UNLL\220\220\200UNLL\220\220\200UNLL\220\220\200UNLL\220\220\200UNLL\220\220\200UNLL\220\220\200UNLL\220\220\200UNLL\220\220!" + "'", str2, "\200UNLL\220\220\200UNLL\220\220\200UNLL\220\220\200UNLL\220\220\200UNLL\220\220\200UNLL\220\220\200UNLL\220\220\200UNLL\220\220!");
    }

    @Test
    public void test06631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06631");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232!", "\u0346\u0348\u0348\u0348\u031a\u031a\u0318\u0318\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232!" + "'", str2, "~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232!");
    }

    @Test
    public void test06632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06632");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LIIILIII!", "NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!!NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!!NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!!NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!!NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0150\u0150nullnullnull!" + "'", str2, "\u0150\u0150nullnullnull!");
    }

    @Test
    public void test06633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06633");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0240\u0240\u023e\u023e\u0346\u0348\u0348!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test06634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06634");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06635");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("`!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL`!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!", "NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN`!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!" + "'", str2, "`!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN`!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!");
    }

    @Test
    public void test06636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06636");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!", "~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!" + "'", str2, "!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!");
    }

    @Test
    public void test06637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06637");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "\246\246!!\246\246!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test06638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06638");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246!", "!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!" + "'", str2, "!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!U!!!U!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06639");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170nullnull\225\225\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170nullnull\225\225\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170nullnull\225\225\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170nullnull\225\225\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170nullnull\225\225\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170nullnull\225\225\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170nullnull\225\225\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170nullnull\225\225!", "!u!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnullbnullnullnullbnullnull\225\225nullnullnullnullnullnullnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnullbnullnullnullbnullnull\225\225nullnullnullnullnullnullnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnullbnullnullnullbnullnull\225\225nullnullnullnullnullnullnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnullbnullnullnullbnullnull\225\225nullnullnullnullnullnullnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnullbnullnullnullbnullnull\225\225nullnullnullnullnullnullnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnullbnullnullnullbnullnull\225\225nullnullnullnullnullnullnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnullbnullnullnullbnullnull\225\225nullnullnullnullnullnullnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnullbnullnullnullbnullnull\225\225!" + "'", str2, "nullnullnullnullnullnullnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnullbnullnullnullbnullnull\225\225nullnullnullnullnullnullnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnullbnullnullnullbnullnull\225\225nullnullnullnullnullnullnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnullbnullnullnullbnullnull\225\225nullnullnullnullnullnullnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnullbnullnullnullbnullnull\225\225nullnullnullnullnullnullnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnullbnullnullnullbnullnull\225\225nullnullnullnullnullnullnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnullbnullnullnullbnullnull\225\225nullnullnullnullnullnullnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnullbnullnullnullbnullnull\225\225nullnullnullnullnullnullnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnullbnullnullnullbnullnull\225\225!");
    }

    @Test
    public void test06640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06640");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNNNLNNNLNNNLNNN\200}}`LNNNLNNNLNNNLNNN]]!", "XXXXXXXX\254\254XXXXXXXX\254\254]]XXXXXXXX\254\254XXXXXXXX\254\254]]\214XXXXXXXX\254\254XXXXXXXX\254\254XXXXXXXX\254\254\214XXXXXXXX\254\254XXXXXXXX\254\254XXXXXXXX\254\254XXXXXXXX\254\254XXXXXXXX\254\254]]XXXXXXXX\254\254XXXXXXXX\254\254]]\214XXXXXXXX\254\254XXXXXXXX\254\254XXXXXXXX\254\254\214XXXXXXXX\254\254XXXXXXXX\254\254XXXXXXXX\254\254!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "XXXXXXXXXXXXXXXX\200}}`XXXXXXXXXXXXXXXX]]!" + "'", str2, "XXXXXXXXXXXXXXXX\200}}`XXXXXXXXXXXXXXXX]]!");
    }

    @Test
    public void test06641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06641");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u01a0!!!\200\u01a0!!!]]!", "NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```NUUUNUUUNUUUNUUU!!!```!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`!!!\200}}``!!!]]!" + "'", str2, "`!!!\200}}``!!!]]!");
    }

    @Test
    public void test06642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06642");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06643");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!", "UNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!!UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!!UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!!UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!!UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!" + "'", str2, "UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!!UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!!UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!!UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!!UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!");
    }

    @Test
    public void test06644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06644");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("``!!``!!!", "llllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!!``!!!" + "'", str2, "``!!``!!!");
    }

    @Test
    public void test06645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06645");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368nullnullnullnull\213\213\213\u0346\u0348\u0348!", "\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\215\215!!\215\215!!\215\215!!\215\215!!\213\213\213\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\215\215!!\215\215!!\215\215!!\215\215!!\213\213\213\u0346\u0348\u0348!");
    }

    @Test
    public void test06646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06646");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266!", "nullheenullhee!!``nullheenullhee``nullheenullhee``nullheenullheenullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!``nullheenullhee``nullheenullhee``nullheenullheenullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!nullheenullhee!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266!" + "'", str2, "nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266!");
    }

    @Test
    public void test06647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06647");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!", "}~\200\200}~\200\200!U!!!!!^!U!!!!!!U!!!!!!U!!!!!^!U!!!!!!U!!!!!}~\200\200}~\200\200!U!!!!!^!U!!!!!!U!!!!!!U!!!!!^!U!!!!!!U!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test06648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06648");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!LLUU!", "nullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LLNN!" + "'", str2, "!LLNN!");
    }

    @Test
    public void test06649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06649");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```BUUUBUUUBUUUBUUU!!!```!", "!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```!" + "'", str2, "~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```~~~~~~~~~~~~~~~~!!!```!");
    }

    @Test
    public void test06650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06650");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!", "}~\200\200}~\200\200!]!!!!!^!]!!!!!!]!!!!!!]!!!!!^!]!!!!!!]!!!!!}~\200\200}~\200\200!]!!!!!^!]!!!!!!]!!!!!!]!!!!!^!]!!!!!!]!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
    }

    @Test
    public void test06651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06651");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348!", "HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348!" + "'", str2, "\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348!");
    }

    @Test
    public void test06652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06652");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("h~ufllufllh~ufllufll!!h~ufllufllh~ufllufll!!h~ufllufllh~ufllufllh~ufllufllh~ufllufll!!h~ufllufllh~ufllufll!!h~ufllufllh~ufllufll!", "\275``nullnull``nullnull``nullnull\276``nullnull\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212!!null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212!!null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212!!null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212!!null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212!" + "'", str2, "null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212!!null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212!!null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212!!null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212!!null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212!");
    }

    @Test
    public void test06653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06653");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368nullnull\200\200\u0346\u0348\u0348!", "nullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test06654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06654");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!", "!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!" + "'", str2, "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!");
    }

    @Test
    public void test06655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06655");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "Le!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!ll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06656");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!", "\276\276\276\276\365\366\370\370\365\366\370\370\365\366\370\370\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\365\366\370\370\365\366\370\370\365\366\370\370\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06657");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("l!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLLl!uul!uuLL!", "v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!v\276\275\275null!nullnullnullnullv\276\275\275null!nullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U!VVU!VVLLU!VVU!VVLLU!VVU!VVLLU!VVU!VVLLU!VVU!VVLLU!VVU!VVLLU!VVU!VVLLU!VVU!VVLL!" + "'", str2, "U!VVU!VVLLU!VVU!VVLLU!VVU!VVLLU!VVU!VVLLU!VVU!VVLLU!VVU!VVLLU!VVU!VVLLU!VVU!VVLL!");
    }

    @Test
    public void test06658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06658");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!hh!!h!!!", "~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!!" + "'", str2, "nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!nullnull!!null!!!");
    }

    @Test
    public void test06659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06659");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LIIILIII!", "\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\300!!!\300!!!!" + "'", str2, "\300!!!\300!!!!");
    }

    @Test
    public void test06660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06660");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\253\256\256\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271\266\220\216!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test06661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06661");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLL!", "NLLLNULLNULLNULLNULLNLLLNULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!!``!!^```^`````!!``!!^```^`````!!``!!^```^`````!!``!!^```^`````!!``!!^```^`````!!``!!^```^`````!!``!!^```^`````!!``!!^```^```!" + "'", str2, "``!!``!!^```^`````!!``!!^```^`````!!``!!^```^`````!!``!!^```^`````!!``!!^```^`````!!``!!^```^`````!!``!!^```^`````!!``!!^```^```!");
    }

    @Test
    public void test06662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06662");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\225\230\230null\225\230\230null\225\230\230null\225\230\230\200}}`null\225\230\230null\225\230\230null\225\230\230null\225\230\230]]!", "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "XXXX\225\230\230XXXX\225\230\230XXXX\225\230\230XXXX\225\230\230\200}}`XXXX\225\230\230XXXX\225\230\230XXXX\225\230\230XXXX\225\230\230]]!" + "'", str2, "XXXX\225\230\230XXXX\225\230\230XXXX\225\230\230XXXX\225\230\230\200}}`XXXX\225\230\230XXXX\225\230\230XXXX\225\230\230XXXX\225\230\230]]!");
    }

    @Test
    public void test06663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06663");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]~}}^nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]]]!", "~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL]]\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL]]\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL]]\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL]]~}}^\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL]]\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL]]\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL]]\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL]]]]!" + "'", str2, "\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL]]\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL]]\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL]]\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL]]~}}^\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL]]\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL]]\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL]]\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL]]]]!");
    }

    @Test
    public void test06664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06664");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\311\314\314\314\311\314\314\314\311\314\314\314\311\314\314\314\311\314\314\314\311\314\314\314\311\314\314\314\311\314\314\314!", "\352\356\356\356\352\356\356\356\352\356\356\356\352\356\356\356\200}}`\352\356\356\356\352\356\356\356\352\356\356\356\352\356\356\356]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06665");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275!", "!\220\220\220!!\220\220\220!\220\220\220!\220\220\220!!\220\220\220!\220\220\220!\220\220\220!!\220\220\220!\220\220\220!\220\220\220!!\220\220\220!\220\220\220!\220\220\220!!\220\220\220!\220\220\220!\220\220\220!!\220\220\220!\220\220\220!\220\220\220!!\220\220\220!\220\220\220!\220\220\220!!\220\220\220!\220\220\220!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275!" + "'", str2, "\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\275\275nullnullnullnullnullnullnullnull\275\275!");
    }

    @Test
    public void test06666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06666");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\227\227\276\276\u0346\u0348\u0348!", "LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\227\227\276\276\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\227\227\276\276\u0346\u0348\u0348!");
    }

    @Test
    public void test06667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06667");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\214!!", "LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214!!" + "'", str2, "\214!!");
    }

    @Test
    public void test06668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06668");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06669");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("x~nullnullx~nullnull!!x~nullnullx~nullnull!!x~nullnullx~nullnullx~nullnullx~nullnull!!x~nullnullx~nullnull!!x~nullnullx~nullnull!", "hnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "E~UUHHUUHHE~UUHHUUHH!!E~UUHHUUHHE~UUHHUUHH!!E~UUHHUUHHE~UUHHUUHHE~UUHHUUHHE~UUHHUUHH!!E~UUHHUUHHE~UUHHUUHH!!E~UUHHUUHHE~UUHHUUHH!" + "'", str2, "E~UUHHUUHHE~UUHHUUHH!!E~UUHHUUHHE~UUHHUUHH!!E~UUHHUUHHE~UUHHUUHHE~UUHHUUHHE~UUHHUUHH!!E~UUHHUUHHE~UUHHUUHH!!E~UUHHUUHHE~UUHHUUHH!");
    }

    @Test
    public void test06670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06670");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\336\335\340\340nullnullnullnullnullnull\336\335\340\340nullnullnullnullnullnull\336\335\340\340nullnullnullnullnullnull\336\335\340\340nullnullnullnullnullnull!", "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUUnullnullnullnullLNUULNUULNUULNUULNUULNUUnullnullnullnullLNUULNUULNUULNUULNUULNUUnullnullnullnullLNUULNUULNUULNUULNUULNUUnullnullnullnullLNUULNUULNUULNUULNUULNUU!" + "'", str2, "LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUUnullnullnullnullLNUULNUULNUULNUULNUULNUUnullnullnullnullLNUULNUULNUULNUULNUULNUUnullnullnullnullLNUULNUULNUULNUULNUULNUUnullnullnullnullLNUULNUULNUULNUULNUULNUU!");
    }

    @Test
    public void test06671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06671");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\276\276NN\276\276NNNN\276\276NN\276\276\276\276NN\276\276NNNN\276\276NN\276\276\276\276NN\276\276NNNN\276\276NN\276\276\276\276NN\276\276NNNN\276\276NN\276\276\276\276NN\276\276NNNN\276\276NN\276\276\276\276NN\276\276NNNN\276\276NN\276\276\276\276NN\276\276NNNN\276\276NN\276\276\276\276NN\276\276NNNN\276\276NN\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06672");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0123\u0124\u0126\u0126\213\213\213\u0346\u0348\u0348!", "\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368nullnullnullnull\213\213\213\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368nullnullnullnull\213\213\213\u0346\u0348\u0348!");
    }

    @Test
    public void test06673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06673");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnull!!BB!!BBnullnullnullnullnullnullnullnull!!BB!!BBnullnullnullnullnullnullnullnull!!BB!!BBnullnullnullnullnullnullnullnull!!BB!!BBnullnullnullnullnullnullnullnull!!BB!!BBnullnullnullnullnullnullnullnull!!BB!!BBnullnullnullnullnullnullnullnull!!BB!!BBnullnullnullnullnullnullnullnull!!BB!!BB!", "ppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnnppnn!ppnnppnnppnnppnnppnnppnnppnnppnn!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PNNNPNNNPNNNPNNNPNNNPNNNPNNNPNNN!!PP!!PPPNNNPNNNPNNNPNNNPNNNPNNNPNNNPNNN!!PP!!PPPNNNPNNNPNNNPNNNPNNNPNNNPNNNPNNN!!PP!!PPPNNNPNNNPNNNPNNNPNNNPNNNPNNNPNNN!!PP!!PPPNNNPNNNPNNNPNNNPNNNPNNNPNNNPNNN!!PP!!PPPNNNPNNNPNNNPNNNPNNNPNNNPNNNPNNN!!PP!!PPPNNNPNNNPNNNPNNNPNNNPNNNPNNNPNNN!!PP!!PPPNNNPNNNPNNNPNNNPNNNPNNNPNNNPNNN!!PP!!PP!" + "'", str2, "PNNNPNNNPNNNPNNNPNNNPNNNPNNNPNNN!!PP!!PPPNNNPNNNPNNNPNNNPNNNPNNNPNNNPNNN!!PP!!PPPNNNPNNNPNNNPNNNPNNNPNNNPNNNPNNN!!PP!!PPPNNNPNNNPNNNPNNNPNNNPNNNPNNNPNNN!!PP!!PPPNNNPNNNPNNNPNNNPNNNPNNNPNNNPNNN!!PP!!PPPNNNPNNNPNNNPNNNPNNNPNNNPNNNPNNN!!PP!!PPPNNNPNNNPNNNPNNNPNNNPNNNPNNNPNNN!!PP!!PPPNNNPNNNPNNNPNNNPNNNPNNNPNNNPNNN!!PP!!PP!");
    }

    @Test
    public void test06674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06674");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```!" + "'", str2, "\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```\215\216\230\230^```^```^```!");
    }

    @Test
    public void test06675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06675");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE~}\200\200~}\200\200EEEEEEEE!", "\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull!" + "'", str2, "~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06676");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!!", "\u0366\u0365\u0368\u0368!!]]!!]]\200\200\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366!!!" + "'", str2, "\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366!!!");
    }

    @Test
    public void test06677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06677");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~~!!U~~~U~~~U~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!U~~~U~~~U~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!", "\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ua7b0\ua7b0\ua7b0\ua7b0\ua7b0\ua7b0~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!" + "'", str2, "\ua7b0\ua7b0\ua7b0\ua7b0\ua7b0\ua7b0~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!");
    }

    @Test
    public void test06678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06678");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06679");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!", "!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!" + "'", str2, "}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!");
    }

    @Test
    public void test06680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06680");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLLLnullnullnullnullLLLLnullnull!", "\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad]^^!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac^^!" + "'", str2, "\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac^^!");
    }

    @Test
    public void test06681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06681");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!", "!\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06682");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullnullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnullnullnullnullnull\204\204nullnull\204\204!", "^^``^^``^^``^^``^^^````^^^````^^^````^^``^^``^^``^^``^^^````^^^````^^^````^^``^^``^^``^^``^^^````^^^````^^^````^^``^^``^^``^^``^^^````^^^````^^^````^^``^^``^^``^^``^^^````^^^````^^^````^^``^^``^^``^^``^^^````^^^````^^^````^^``^^``^^``^^``^^^````^^^````^^^````^^``^^``^^``^^``^^^````^^^````^^^````!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnull\204\204!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnull\204\204!");
    }

    @Test
    public void test06683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06683");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "LNLLLNLLN~~~N~~~N~~~N~~~N~~~N~~~N~~~N~~~LNLLLNLLN~~~N~~~N~~~N~~~N~~~N~~~N~~~N~~~LNLLLNLLN~~~N~~~N~~~N~~~N~~~N~~~N~~~N~~~LNLLLNLLN~~~N~~~N~~~N~~~N~~~N~~~N~~~N~~~LNLLLNLLN~~~N~~~N~~~N~~~N~~~N~~~N~~~N~~~LNLLLNLLN~~~N~~~N~~~N~~~N~~~N~~~N~~~N~~~LNLLLNLLN~~~N~~~N~~~N~~~N~~~N~~~N~~~N~~~LNLLLNLLN~~~N~~~N~~~N~~~N~~~N~~~N~~~N~~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06684");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!!", "LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLLLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLL\225\225LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLLLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLL\225\225LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLLLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLL\225\225LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLLLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLL\225\225LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLLLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLL\225\225LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLLLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLL\225\225LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLLLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLL\225\225LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLLLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNLLLNLL\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNN!!NLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNN!!NLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNN!!NLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNN!!NLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNN!!NLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNN!!NLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNN!!NLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNN!!!" + "'", str2, "NLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNN!!NLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNN!!NLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNN!!NLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNN!!NLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNN!!NLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNN!!NLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNN!!NLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!NLNNNLNNNLNNNLNNNLNNNLNN!!!");
    }

    @Test
    public void test06685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06685");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275nullnull\200\200nullnull\200\200nullnull\200\200\276nullnull\200\200\275\275!", "\276\276\300\300\276\276\300\300\276\276\300\300\276\276\300\300\276\276\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200\276nullnullnullnullnullnullnullnull\200\200\275\275!" + "'", str2, "\275nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200\276nullnullnullnullnullnullnullnull\200\200\275\275!");
    }

    @Test
    public void test06686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06686");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullLNUULNUUnullnullLNUULNUU\214\214nullnullLNUULNUUnullnullLNUULNUU\214\214nullnullLNUULNUUnullnullLNUULNUU\214\214nullnullLNUULNUUnullnullLNUULNUU\214\214nullnullLNUULNUUnullnullLNUULNUU\214\214nullnullLNUULNUUnullnullLNUULNUU\214\214nullnullLNUULNUUnullnullLNUULNUU\214\214nullnullLNUULNUUnullnullLNUULNUU\214\214!", "null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLUULLUU!~~~!~~~LLUULLUU!~~~!~~~\214\214LLUULLUU!~~~!~~~LLUULLUU!~~~!~~~\214\214LLUULLUU!~~~!~~~LLUULLUU!~~~!~~~\214\214LLUULLUU!~~~!~~~LLUULLUU!~~~!~~~\214\214LLUULLUU!~~~!~~~LLUULLUU!~~~!~~~\214\214LLUULLUU!~~~!~~~LLUULLUU!~~~!~~~\214\214LLUULLUU!~~~!~~~LLUULLUU!~~~!~~~\214\214LLUULLUU!~~~!~~~LLUULLUU!~~~!~~~\214\214!" + "'", str2, "LLUULLUU!~~~!~~~LLUULLUU!~~~!~~~\214\214LLUULLUU!~~~!~~~LLUULLUU!~~~!~~~\214\214LLUULLUU!~~~!~~~LLUULLUU!~~~!~~~\214\214LLUULLUU!~~~!~~~LLUULLUU!~~~!~~~\214\214LLUULLUU!~~~!~~~LLUULLUU!~~~!~~~\214\214LLUULLUU!~~~!~~~LLUULLUU!~~~!~~~\214\214LLUULLUU!~~~!~~~LLUULLUU!~~~!~~~\214\214LLUULLUU!~~~!~~~LLUULLUU!~~~!~~~\214\214!");
    }

    @Test
    public void test06687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06687");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull!!nullnull!!{|~~{|~~nullnull!!nullnull!!{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull!!nullnull!!{|~~{|~~nullnull!!nullnull!!{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull!!nullnull!!{|~~{|~~nullnull!!nullnull!!{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull!!nullnull!!{|~~{|~~nullnull!!nullnull!!{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull!!nullnull!!{|~~{|~~nullnull!!nullnull!!{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull!!nullnull!!{|~~{|~~nullnull!!nullnull!!{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull!!nullnull!!{|~~{|~~nullnull!!nullnull!!{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull!!nullnull!!{|~~{|~~nullnull!!nullnull!!!" + "'", str2, "{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull!!nullnull!!{|~~{|~~nullnull!!nullnull!!{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull!!nullnull!!{|~~{|~~nullnull!!nullnull!!{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull!!nullnull!!{|~~{|~~nullnull!!nullnull!!{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull!!nullnull!!{|~~{|~~nullnull!!nullnull!!{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull!!nullnull!!{|~~{|~~nullnull!!nullnull!!{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull!!nullnull!!{|~~{|~~nullnull!!nullnull!!{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull!!nullnull!!{|~~{|~~nullnull!!nullnull!!{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull!!nullnull!!{|~~{|~~nullnull!!nullnull!!!");
    }

    @Test
    public void test06688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06688");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8nullnull!", "HH!!H~~HH!!H~~HH!!H~~HH!!H~~HH!!H~~HH!!H~~HH!!H~~HH!!H~~!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HH!" + "'", str2, "nullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HH!");
    }

    @Test
    public void test06689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06689");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!!", "ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```ULLL```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!!!" + "'", str2, "LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!!!");
    }

    @Test
    public void test06690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06690");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("````````````````````````````````!", "NNLLNNLLNNLLNNLL\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````````````````````````````````!" + "'", str2, "````````````````````````````````!");
    }

    @Test
    public void test06691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06691");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\254\254\254\254\u0346\u0348\u0348!", "NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\254\254\254\254\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\254\254\254\254\u0346\u0348\u0348!");
    }

    @Test
    public void test06692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06692");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!", "LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```LULLLULLLULLLULL!!!```!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fanullnull!" + "'", str2, "\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fanullnull!");
    }

    @Test
    public void test06693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06693");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!!", "!III!III!!!III!III!!!III!III!III!III!III!III!III!III!III!III!!!III!III!!!III!III!III!III!III!III!III!III!III!III!!!III!III!!!III!III!III!III!III!III!III!III!III!III!!!III!III!!!III!III!III!III!III!III!III!III!III!III!!!III!III!!!III!III!III!III!III!III!III!III!III!III!!!III!III!!!III!III!III!III!III!III!III!III!III!III!!!III!III!!!III!III!III!III!III!III!III!III!III!III!!!III!III!!!III!III!III!III!III!III!III!III!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!!" + "'", str2, "I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!!");
    }

    @Test
    public void test06694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06694");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u035e\u035e\u035e\u035e\u035e\u035e\u035e\u035e!", "\253\254\256\256LNUULNUULNUULNUU\253\254\256\256LNUULNUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "n\253uun\253\u035e\u035en\253uun\253\u035e\u035e!!!!n\253uun\253\u035e\u035en\253uun\253\u035e\u035e!" + "'", str2, "n\253uun\253\u035e\u035en\253uun\253\u035e\u035e!!!!n\253uun\253\u035e\u035en\253uun\253\u035e\u035e!");
    }

    @Test
    public void test06695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06695");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\200}}`!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU]]!", "\u0366\u0365\u0368\u0368U!!!U!!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III\200}}`!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III]]!" + "'", str2, "!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III\200}}`!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III]]!");
    }

    @Test
    public void test06696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06696");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248!", "!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06697");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\215\216\230\230L!!!L!!!L!!!\215\216\230\230L!!!L!!!L!!!\215\216\230\230L!!!L!!!L!!!\215\216\230\230L!!!L!!!L!!!\215\216\230\230L!!!L!!!L!!!\215\216\230\230L!!!L!!!L!!!\215\216\230\230L!!!L!!!L!!!\215\216\230\230L!!!L!!!L!!!!", "\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e]]!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!!" + "'", str2, "\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!\215\216\230\230\u037e\u037e\u037e!!!!");
    }

    @Test
    public void test06698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06698");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!!", "\253\254\256\256N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!\253\254\256\256N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!!" + "'", str2, "\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!\230!\225\225\230!\225\225\250\250!!\250\250!!!");
    }

    @Test
    public void test06699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06699");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\305\305\305\305\305\305\305\305\305\305\305\305\305\305\305\305\200}}`\305\305\305\305\305\305\305\305\305\305\305\305\305\305\305\305]]!", "\215}\215\215\215}\215\215\u014b\u014e\u014e\u014e\u014b\u014e\u014e\u014e\u014b\u014e\u014e\u014e\u014b\u014e\u014e\u014e\215}\215\215\215}\215\215!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test06700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06700");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt\254~\256\256\254~\256\256\254~\256\256\254~\256\256!", "\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\254~\256\256\254~\256\256\254~\256\256\254~\256\256!" + "'", str2, "\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\u029b\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
    }

    @Test
    public void test06701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06701");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!", "\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\240\240!!\240\240!!\240\240!!\240\240!!\240\240!!\240\240!!\240\240!!\240\240!" + "'", str2, "!!\240\240!!\240\240!!\240\240!!\240\240!!\240\240!!\240\240!!\240\240!!\240\240!");
    }

    @Test
    public void test06702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06702");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!", "LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
    }

    @Test
    public void test06703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06703");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LL``LL``LL``LL``LL``LL``LL``LL``!!LL``LL``LL``LL``LL``LL``LL``LL``!!LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``!!LL``LL``LL``LL``LL``LL``LL``LL``!!LL``LL``LL``LL``LL``LL``LL``LL``!", "\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126ULL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NN``NN``NN``NN``NN``NN``NN``NN``!!NN``NN``NN``NN``NN``NN``NN``NN``!!NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``!!NN``NN``NN``NN``NN``NN``NN``NN``!!NN``NN``NN``NN``NN``NN``NN``NN``!" + "'", str2, "NN``NN``NN``NN``NN``NN``NN``NN``!!NN``NN``NN``NN``NN``NN``NN``NN``!!NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``!!NN``NN``NN``NN``NN``NN``NN``NN``!!NN``NN``NN``NN``NN``NN``NN``NN``!");
    }

    @Test
    public void test06704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06704");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300!", "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnull!" + "'", str2, "nullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnull!");
    }

    @Test
    public void test06705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06705");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0129\u0129\u0129\u0129nullll!", "LUUUUnullLLUnullLL!!!!LUUUUnullLLUnullLL!!!!!!LUUUUnullLLUnullLL!!!!LUUUUnullLLUnullLL!!!!!!LUUUUnullLLUnullLL!!!!LUUUUnullLLUnullLL!!!!!!LUUUUnullLLUnullLL!!!!LUUUUnullLLUnullLL!!!!!!LUUUUnullLLUnullLL!!!!LUUUUnullLLUnullLL!!!!!!LUUUUnullLLUnullLL!!!!LUUUUnullLLUnullLL!!!!!!LUUUUnullLLUnullLL!!!!LUUUUnullLLUnullLL!!!!!!LUUUUnullLLUnullLL!!!!LUUUUnullLLUnullLL!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!U!!!U!!!U!!!U!!U!U!!!!U!U!!!!U!U!!!!U!U!!!!!" + "'", str2, "!U!!!U!!!U!!!U!!U!U!!!!U!U!!!!U!U!!!!U!U!!!!!");
    }

    @Test
    public void test06706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06706");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u0346\u0348\u0348!", "\u0228\u0228\u0228\u0228nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test06707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06707");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NULLNULLNULLNULLNULLNULLNULLNULL!" + "'", str2, "NULLNULLNULLNULLNULLNULLNULLNULL!");
    }

    @Test
    public void test06708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06708");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!", "!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!" + "'", str2, "\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!");
    }

    @Test
    public void test06709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06709");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\253\256\256\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271\266hfhh\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216\220!\216\216!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test06710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06710");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\276\276\276\276\276!!!", "d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!d!aad!aa!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\276\276\276\276\276!!!" + "'", str2, "!\276\276\276\276\276!!!");
    }

    @Test
    public void test06711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06711");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!", "\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06712");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253!" + "'", str2, "\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253\275\200\253\253!");
    }

    @Test
    public void test06713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06713");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0420\u0420\u0420\u0420!!!", "\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!!");
    }

    @Test
    public void test06714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06714");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225LU\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06715");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016enullnull!", "\253\254\256\256!JJJ!JJJ!JJJ!JJJ\253\254\256\256!JJJ!JJJ!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06716");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH\253\254\256\256\253\254\256\256HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH\253\254\256\256\253\254\256\256HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH\253\254\256\256\253\254\256\256HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH\253\254\256\256\253\254\256\256HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH\253\254\256\256\253\254\256\256HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH\253\254\256\256\253\254\256\256HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH\253\254\256\256\253\254\256\256HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH\253\254\256\256\253\254\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06717");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae!", "UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06718");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220!!\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220!!!", "\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220!!\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220!!!" + "'", str2, "\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220!!\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220!!!");
    }

    @Test
    public void test06719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06719");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]!", "\230\226\u0128\u0128nullnull\236\276\276\230\226\u0128\u0128nullnull\236\276\276!!\230\226\u0128\u0128nullnull\236\276\276\230\226\u0128\u0128nullnull\236\276\276!!\230\226\u0128\u0128nullnull\236\276\276\230\226\u0128\u0128nullnull\236\276\276\230\226\u0128\u0128nullnull\236\276\276\230\226\u0128\u0128nullnull\236\276\276!!\230\226\u0128\u0128nullnull\236\276\276\230\226\u0128\u0128nullnull\236\276\276!!\230\226\u0128\u0128nullnull\236\276\276\230\226\u0128\u0128nullnull\236\276\276!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^!N]]!N]]N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^!N]]!N]]N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^!N]]!N]]N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^!N]]!N]]N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^!N]]!N]]N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^!N]]!N]]N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^!N]]!N]]N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^!N]]!N]]!" + "'", str2, "N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^!N]]!N]]N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^!N]]!N]]N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^!N]]!N]]N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^!N]]!N]]N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^!N]]!N]]N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^!N]]!N]]N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^!N]]!N]]N]^^N]^^N]^^N]^^N]^^N]^^N]^^N]^^!N]]!N]]!");
    }

    @Test
    public void test06720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06720");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!NUUUUNLLUNLL!!!!NUUUUNLLUNLL!!!!!!!", "\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225\u0107\u0107nullll\225\225!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!!" + "'", str2, "LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!!");
    }

    @Test
    public void test06721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06721");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("P!RRP!RRP!RRP!RRP!RRP!RRP!RRP!RR!", "LLUUUUULLUUUUUUULLUUUUULLUUUUUUULLUUUUULLUUUUUUULLUUUUULLUUUUUUULLUUUUULLUUUUUUULLUUUUULLUUUUUUULLUUUUULLUUUUUUULLUUUUULLUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test06722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06722");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8!", "\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test06723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06723");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad]^^!", "ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^!!null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^!!null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^!!null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^!!null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^!" + "'", str2, "null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^!!null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^!!null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^!!null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^!!null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^null]^^!");
    }

    @Test
    public void test06724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06724");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test06725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06725");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!!]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!!]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!!]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!!]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!", "!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]\200~!LL\200\200\200~!LL\200\200]]\200~!LL\200\200\200~!LL\200\200!!]]\200~!LL\200\200\200~!LL\200\200]]\200~!LL\200\200\200~!LL\200\200!!]]\200~!LL\200\200\200~!LL\200\200]]\200~!LL\200\200\200~!LL\200\200]]\200~!LL\200\200\200~!LL\200\200]]\200~!LL\200\200\200~!LL\200\200!!]]\200~!LL\200\200\200~!LL\200\200]]\200~!LL\200\200\200~!LL\200\200!!]]\200~!LL\200\200\200~!LL\200\200]]\200~!LL\200\200\200~!LL\200\200!" + "'", str2, "]]\200~!LL\200\200\200~!LL\200\200]]\200~!LL\200\200\200~!LL\200\200!!]]\200~!LL\200\200\200~!LL\200\200]]\200~!LL\200\200\200~!LL\200\200!!]]\200~!LL\200\200\200~!LL\200\200]]\200~!LL\200\200\200~!LL\200\200]]\200~!LL\200\200\200~!LL\200\200]]\200~!LL\200\200\200~!LL\200\200!!]]\200~!LL\200\200\200~!LL\200\200]]\200~!LL\200\200\200~!LL\200\200!!]]\200~!LL\200\200\200~!LL\200\200]]\200~!LL\200\200\200~!LL\200\200!");
    }

    @Test
    public void test06726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06726");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU~}\200\200~}\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!", "`nullnullnull`nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!" + "'", str2, "~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX~}\200\200~}\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
    }

    @Test
    public void test06727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06727");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!", "\275nullnullnullnull~}}nullnullnullnull~}}\200\200nullnullnullnull~}}nullnullnullnull~}}\200\200nullnullnullnull~}}nullnullnullnull~}}\200\200\276nullnullnullnull~}}nullnullnullnull~}}\200\200\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!" + "'", str2, "]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!");
    }

    @Test
    public void test06728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06728");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("``!!``!!``!!``!!``!!``!!``!!``!!!", "LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!!``!!``!!``!!``!!``!!``!!``!!!" + "'", str2, "``!!``!!``!!``!!``!!``!!``!!``!!!");
    }

    @Test
    public void test06729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06729");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!!", "\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8\u01c8nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253LNN\253LNN\253\253\253LNN\253LNN\253\253!!\253LNN\253LNN\253\253\253LNN\253LNN\253\253!!\253LNN\253LNN\253\253\253LNN\253LNN\253\253!!\253LNN\253LNN\253\253\253LNN\253LNN\253\253!!\253LNN\253LNN\253\253\253LNN\253LNN\253\253!!\253LNN\253LNN\253\253\253LNN\253LNN\253\253!!\253LNN\253LNN\253\253\253LNN\253LNN\253\253!!\253LNN\253LNN\253\253\253LNN\253LNN\253\253!!!" + "'", str2, "\253LNN\253LNN\253\253\253LNN\253LNN\253\253!!\253LNN\253LNN\253\253\253LNN\253LNN\253\253!!\253LNN\253LNN\253\253\253LNN\253LNN\253\253!!\253LNN\253LNN\253\253\253LNN\253LNN\253\253!!\253LNN\253LNN\253\253\253LNN\253LNN\253\253!!\253LNN\253LNN\253\253\253LNN\253LNN\253\253!!\253LNN\253LNN\253\253\253LNN\253LNN\253\253!!\253LNN\253LNN\253\253\253LNN\253LNN\253\253!!!");
    }

    @Test
    public void test06730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06730");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LL!", "TQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQ!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull!" + "'", str2, "nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test06731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06731");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!", "\276LLL\276LLL\276LLL\276LLL\276LLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!" + "'", str2, "!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!");
    }

    @Test
    public void test06732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06732");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!", "!\253\256\256\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!" + "'", str2, "!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!");
    }

    @Test
    public void test06733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06733");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null\260\255\255\225\230\230null\260\255\255\225\230\230null\260\255\255\225\230\230null\260\255\255\225\230\230\200}}`null\260\255\255\225\230\230null\260\255\255\225\230\230null\260\255\255\225\230\230null\260\255\255\225\230\230]]!", "`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUU\260\255\255\225\230\230UUUU\260\255\255\225\230\230UUUU\260\255\255\225\230\230UUUU\260\255\255\225\230\230\200}}`UUUU\260\255\255\225\230\230UUUU\260\255\255\225\230\230UUUU\260\255\255\225\230\230UUUU\260\255\255\225\230\230]]!" + "'", str2, "UUUU\260\255\255\225\230\230UUUU\260\255\255\225\230\230UUUU\260\255\255\225\230\230UUUU\260\255\255\225\230\230\200}}`UUUU\260\255\255\225\230\230UUUU\260\255\255\225\230\230UUUU\260\255\255\225\230\230UUUU\260\255\255\225\230\230]]!");
    }

    @Test
    public void test06734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06734");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\u0248\u0246\u0246\u0246\u0348\u0346\u0346!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test06735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06735");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("HH!!HH!!!", "\u0236\u0238\u0238\u0236\u0238\u0238\u0236\u0238\u0238\u0236\u0238\u0238\u0236\u0238\u0238!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!!");
    }

    @Test
    public void test06736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06736");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\u0348\u0346\u0346!", "\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull!!\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull!!\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull!!\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull!!\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test06737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06737");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!UU!!UU!", "^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull^```^```^```^```^```^```^```^```^```^```nullnull^```^```nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u023e\u023e\u023e\u023e!" + "'", str2, "\u023e\u023e\u023e\u023e!");
    }

    @Test
    public void test06738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06738");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
    }

    @Test
    public void test06739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06739");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\u0348\u0346\u0346!", "\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test06740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06740");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!", "nullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!" + "'", str2, "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
    }

    @Test
    public void test06741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06741");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!", "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!" + "'", str2, "]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!");
    }

    @Test
    public void test06742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06742");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0128\u0128\u0128\u0128\u0346\u0348\u0348!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnullnullnull\226\227\231\231\226\227\231\231\226\227\231\231nullnullnullnull\226\227\231\231\226\227\231\231\226\227\231\231}~\200\200}~\200\200nullnullnullnull\226\227\231\231\226\227\231\231\226\227\231\231nullnullnullnull\226\227\231\231\226\227\231\231\226\227\231\231}~\200\200}~\200\200nullnullnullnull\226\227\231\231\226\227\231\231\226\227\231\231nullnullnullnull\226\227\231\231\226\227\231\231\226\227\231\231}~\200\200}~\200\200nullnullnullnull\226\227\231\231\226\227\231\231\226\227\231\231nullnullnullnull\226\227\231\231\226\227\231\231\226\227\231\231\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test06743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06743");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~!!!~!!!~!!!~!!!~!!!~!!!~!!!~!!!!", "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~!!!~!!!~!!!~!!!~!!!~!!!~!!!~!!!!" + "'", str2, "~!!!~!!!~!!!~!!!~!!!~!!!~!!!~!!!!");
    }

    @Test
    public void test06744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06744");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0!", "`R!RRRRRR!RRRRRR!RRRRR`R!RRRRRR!RRRRRR!RRRRR!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test06745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06745");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!", "NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230\200}}`NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!" + "'", str2, "!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!");
    }

    @Test
    public void test06746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06746");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06747");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL!", "\u0244\u0246\u0246\u0244\u0246\u0246\u0244\u0246\u0246\u0244\u0246\u0246\256\u0244\u0246\u0246\u0244\u0246\u0246\u0244\u0246\u0246\u0244\u0246\u0246\u0244\u0246\u0246\u0244\u0246\u0246\u0244\u0246\u0246\u0244\u0246\u0246\u0244\u0246\u0246\u0244\u0246\u0246\u0244\u0246\u0246\u0244\u0246\u0246!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276\u0246\u0246\275\276\u0246\u0246\275\276\u0246\u0246\275\276\u0246\u0246\275\276\u0246\u0246\275\276\u0246\u0246\275\276\u0246\u0246\275\276\u0246\u0246\275\276\u0246\u0246\275\276\u0246\u0246\275\276\u0246\u0246\275\276\u0246\u0246\275\276\u0246\u0246\275\276\u0246\u0246\275\276\u0246\u0246\275\276\u0246\u0246\275\276\u0246\u0246\275\276\u0246\u0246\275\276\u0246\u0246\275\276\u0246\u0246!" + "'", str2, "\275\276\u0246\u0246\275\276\u0246\u0246\275\276\u0246\u0246\275\276\u0246\u0246\275\276\u0246\u0246\275\276\u0246\u0246\275\276\u0246\u0246\275\276\u0246\u0246\275\276\u0246\u0246\275\276\u0246\u0246\275\276\u0246\u0246\275\276\u0246\u0246\275\276\u0246\u0246\275\276\u0246\u0246\275\276\u0246\u0246\275\276\u0246\u0246\275\276\u0246\u0246\275\276\u0246\u0246\275\276\u0246\u0246\275\276\u0246\u0246!");
    }

    @Test
    public void test06748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06748");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LNUULNUU!!LNUULNUU!!LNUULNUULNUULNUU!!LNUULNUU!!LNUULNUU!", "\u0346\u0348\u0348\u0348nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jghhjghh!!jghhjghh!!jghhjghhjghhjghh!!jghhjghh!!jghhjghh!" + "'", str2, "jghhjghh!!jghhjghh!!jghhjghhjghhjghh!!jghhjghh!!jghhjghh!");
    }

    @Test
    public void test06749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06749");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("efhhefhhefhhefhhefhhefhhefhhefhh!!efhhefhhefhhefhhefhhefhhefhhefhh!!!!efhhefhhefhhefhhefhhefhhefhhefhh!!efhhefhhefhhefhhefhhefhhefhhefhh!!!!efhhefhhefhhefhhefhhefhhefhhefhh!!efhhefhhefhhefhhefhhefhhefhhefhh!!!!efhhefhhefhhefhhefhhefhhefhhefhh!!efhhefhhefhhefhhefhhefhhefhhefhh!!!!efhhefhhefhhefhhefhhefhhefhhefhh!!efhhefhhefhhefhhefhhefhhefhhefhh!!!!efhhefhhefhhefhhefhhefhhefhhefhh!!efhhefhhefhhefhhefhhefhhefhhefhh!!!!efhhefhhefhhefhhefhhefhhefhhefhh!!efhhefhhefhhefhhefhhefhhefhhefhh!!!!efhhefhhefhhefhhefhhefhhefhhefhh!!efhhefhhefhhefhhefhhefhhefhhefhh!!!!!", "\u014f\u014f\u014f\u014f!uu!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!!!!" + "'", str2, "uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!uu!!!!!!!");
    }

    @Test
    public void test06750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06750");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366]]!", "\230\226u!llu!ll\236\276\276\230\226u!llu!ll\236\276\276!!\230\226u!llu!ll\236\276\276\230\226u!llu!ll\236\276\276!!\230\226u!llu!ll\236\276\276\230\226u!llu!ll\236\276\276\230\226u!llu!ll\236\276\276\230\226u!llu!ll\236\276\276!!\230\226u!llu!ll\236\276\276\230\226u!llu!ll\236\276\276!!\230\226u!llu!ll\236\276\276\230\226u!llu!ll\236\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366]]!" + "'", str2, "\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366]]!");
    }

    @Test
    public void test06751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06751");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!", "\u014e\u014e\u014e\u014e\u014e\u014e!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test06752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06752");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253!", "\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253!" + "'", str2, "\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253!");
    }

    @Test
    public void test06753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06753");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!", "NLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!" + "'", str2, "\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!");
    }

    @Test
    public void test06754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06754");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200\u0348\u0346\u0346!", "`nullnull!!nullnull!!nullnull!!`nullnull!!nullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200\u0348\u0346\u0346!");
    }

    @Test
    public void test06755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06755");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\253\254\256\256````````````````\253\254\256\256````````!", "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256````````````````\253\254\256\256````````!" + "'", str2, "\253\254\256\256````````````````\253\254\256\256````````!");
    }

    @Test
    public void test06756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06756");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\276\276\276\276\276!!!", "!!~ULLLULLL!!!!~ULLLULLL!!!!!!~ULLLULLL!!!!~ULLLULLL!!!!!!~ULLLULLL!!!!~ULLLULLL!!!!~ULLLULLL!!!!~ULLLULLL!!!!!!~ULLLULLL!!!!~ULLLULLL!!!!!!~ULLLULLL!!!!~ULLLULLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\276\276\276\276\276!!!" + "'", str2, "!\276\276\276\276\276!!!");
    }

    @Test
    public void test06757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06757");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\225\226\230\230\225\226\230\230\225\226\230\230\225\226\230\230\u0348\u0346\u0346!", "XNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMMXNMMXNMMXXXNMMXNMMXXXNMMXNMM!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\225\226\230\230\225\226\230\230\225\226\230\230\225\226\230\230\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\225\226\230\230\225\226\230\230\225\226\230\230\225\226\230\230\u0348\u0346\u0346!");
    }

    @Test
    public void test06758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06758");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!~LNUULNUU!!!!~LNUULNUU!!!!!!~LNUULNUU!!!!~LNUULNUU!!!!!!~LNUULNUU!!!!~LNUULNUU!!!!~LNUULNUU!!!!~LNUULNUU!!!!!!~LNUULNUU!!!!~LNUULNUU!!!!!!~LNUULNUU!!!!~LNUULNUU!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!" + "'", str2, "!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test06759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06759");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!!", "WZZZ\200}}`WZZZ]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!!" + "'", str2, "\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!!");
    }

    @Test
    public void test06760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06760");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230NNNNNNNNNNNNNNNN\226\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06761");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```!", "NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```!" + "'", str2, "lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```!");
    }

    @Test
    public void test06762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06762");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!!", "nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230\200}}`nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!!" + "'", str2, "\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!!");
    }

    @Test
    public void test06763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06763");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test06764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06764");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~!", "ULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUUULUUULUUUUULUUULUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~!" + "'", str2, "\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~!");
    }

    @Test
    public void test06765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06765");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318!", "}~\200\200}~\200\200TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT}~\200\200}~\200\200TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318!" + "'", str2, "\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318\u0318!");
    }

    @Test
    public void test06766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06766");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~~!!nullnullnullnull~~~nullnullnullnull~~~nullnullnullnull~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!nullnullnullnull~~~nullnullnullnull~~~nullnullnullnull~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!", "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!" + "'", str2, "\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!");
    }

    @Test
    public void test06767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06767");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnull}~\200\200}~\200\200nullnull}~\200\200}~\200\200nullnull}~\200\200}~\200\200\u0348\u0346\u0346!", "\276X\266\266~XX\276X\266\266~XX!!\276X\266\266~XX\276X\266\266~XX!!\276X\266\266~XX\276X\266\266~XX\276X\266\266~XX\276X\266\266~XX!!\276X\266\266~XX\276X\266\266~XX!!\276X\266\266~XX\276X\266\266~XX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200XX~~XX~~}~\200\200}~\200\200XX~~XX~~}~\200\200}~\200\200XX~~XX~~}~\200\200}~\200\200\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200XX~~XX~~}~\200\200}~\200\200XX~~XX~~}~\200\200}~\200\200XX~~XX~~}~\200\200}~\200\200\u0348\u0346\u0346!");
    }

    @Test
    public void test06768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06768");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}~\200\200}~\200\200\u0170\u0170\u0170\u0170\u0170\u0170nullnullnull}~\200\200}~\200\200\u0170\u0170\u0170\u0170\u0170\u0170nullnullnull!", "\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\200}}`\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06769");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275```\275```\275```\275`````\275\275``\275\275``\275\275``\275\275\275```\275```\275```\275`````\275\275``\275\275!", "\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275```\275```\275```\275`````\275\275``\275\275``\275\275``\275\275\275```\275```\275```\275`````\275\275``\275\275!" + "'", str2, "\275```\275```\275```\275`````\275\275``\275\275``\275\275``\275\275\275```\275```\275```\275`````\275\275``\275\275!");
    }

    @Test
    public void test06770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06770");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\254\253\256\256\254\253\256\256\254\253\256\256null\254\253\256\256\254\253\256\256\254\253\256\256!!null\254\253\256\256\254\253\256\256\254\253\256\256null\254\253\256\256\254\253\256\256\254\253\256\256!!null\254\253\256\256\254\253\256\256\254\253\256\256null\254\253\256\256\254\253\256\256\254\253\256\256!!null\254\253\256\256\254\253\256\256\254\253\256\256null\254\253\256\256\254\253\256\256\254\253\256\256!!null\254\253\256\256\254\253\256\256\254\253\256\256null\254\253\256\256\254\253\256\256\254\253\256\256!!null\254\253\256\256\254\253\256\256\254\253\256\256null\254\253\256\256\254\253\256\256\254\253\256\256!!null\254\253\256\256\254\253\256\256\254\253\256\256null\254\253\256\256\254\253\256\256\254\253\256\256!!null\254\253\256\256\254\253\256\256\254\253\256\256null\254\253\256\256\254\253\256\256\254\253\256\256!!!", "L\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LL!!L\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LL!!L\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LL!!L\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LL!!L\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0170\u0170\254\253\256\256\254\253\256\256\254\253\256\256\u0170\u0170\254\253\256\256\254\253\256\256\254\253\256\256\u0170\u0170\254\253\256\256\254\253\256\256\254\253\256\256\u0170\u0170\254\253\256\256\254\253\256\256\254\253\256\256\u0170\u0170\254\253\256\256\254\253\256\256\254\253\256\256\u0170\u0170\254\253\256\256\254\253\256\256\254\253\256\256\u0170\u0170\254\253\256\256\254\253\256\256\254\253\256\256\u0170\u0170\254\253\256\256\254\253\256\256\254\253\256\256\u0170\u0170\254\253\256\256\254\253\256\256\254\253\256\256\u0170\u0170\254\253\256\256\254\253\256\256\254\253\256\256\u0170\u0170\254\253\256\256\254\253\256\256\254\253\256\256\u0170\u0170\254\253\256\256\254\253\256\256\254\253\256\256\u0170\u0170\254\253\256\256\254\253\256\256\254\253\256\256\u0170\u0170\254\253\256\256\254\253\256\256\254\253\256\256\u0170\u0170\254\253\256\256\254\253\256\256\254\253\256\256\u0170\u0170\254\253\256\256\254\253\256\256\254\253\256\256!!!" + "'", str2, "\u0170\u0170\254\253\256\256\254\253\256\256\254\253\256\256\u0170\u0170\254\253\256\256\254\253\256\256\254\253\256\256\u0170\u0170\254\253\256\256\254\253\256\256\254\253\256\256\u0170\u0170\254\253\256\256\254\253\256\256\254\253\256\256\u0170\u0170\254\253\256\256\254\253\256\256\254\253\256\256\u0170\u0170\254\253\256\256\254\253\256\256\254\253\256\256\u0170\u0170\254\253\256\256\254\253\256\256\254\253\256\256\u0170\u0170\254\253\256\256\254\253\256\256\254\253\256\256\u0170\u0170\254\253\256\256\254\253\256\256\254\253\256\256\u0170\u0170\254\253\256\256\254\253\256\256\254\253\256\256\u0170\u0170\254\253\256\256\254\253\256\256\254\253\256\256\u0170\u0170\254\253\256\256\254\253\256\256\254\253\256\256\u0170\u0170\254\253\256\256\254\253\256\256\254\253\256\256\u0170\u0170\254\253\256\256\254\253\256\256\254\253\256\256\u0170\u0170\254\253\256\256\254\253\256\256\254\253\256\256\u0170\u0170\254\253\256\256\254\253\256\256\254\253\256\256!!!");
    }

    @Test
    public void test06771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06771");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("XXXXXXXXXXXXXXXX\200}}`XXXXXXXXXXXXXXXX]]!", "\276\276nullnull\276\276nullnull!!\276\276nullnull\276\276nullnull!!\276\276nullnull\276\276nullnull\276\276nullnull\276\276nullnull!!\276\276nullnull\276\276nullnull!!\276\276nullnull\276\276nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\200}}`\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276]]!" + "'", str2, "\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\200}}`\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276]]!");
    }

    @Test
    public void test06772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06772");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\215}\215\215\215}\215\215ULLLULLLULLLULLL\215}\215\215\215}\215\215!", "null!nullnull!!!null!nullnull!!!null!nullnull!!!null!nullnull!!!null!nullnull!!!null!nullnull!!!null!nullnull!!!null!nullnull!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215\273\275\275\275\273\275\275\275\273\275\275\275\273\275\275\275\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215\273\275\275\275\273\275\275\275\273\275\275\275\273\275\275\275\215}\215\215\215}\215\215!");
    }

    @Test
    public void test06773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06773");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnull!", "!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\254\254\200NNN\200NNN\254\254\200NNN\200NNN\254\254\200NNN\200NNN\254\254\200NNN\200NNN\254\254\200NNN\200NNN\254\254\200NNN\200NNN\254\254\200NNN\200NNN\254\254\200NNN\200NNN!" + "'", str2, "\254\254\200NNN\200NNN\254\254\200NNN\200NNN\254\254\200NNN\200NNN\254\254\200NNN\200NNN\254\254\200NNN\200NNN\254\254\200NNN\200NNN\254\254\200NNN\200NNN\254\254\200NNN\200NNN!");
    }

    @Test
    public void test06774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06774");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!", "LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
    }

    @Test
    public void test06775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06775");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128!!!!", "\336\335\340\340\336\335\340\340!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!" + "'", str2, "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!");
    }

    @Test
    public void test06776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06776");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214!", "~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214!");
    }

    @Test
    public void test06777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06777");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368U!!!U!!!\200\200\u0346\u0348\u0348!", "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u02b6\u02b6!!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u02b6\u02b6!!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test06778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06778");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~N\275!!N\275!!N\275!!N\275!!N\275!!N\275!!N\275!!N\275!!\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~N\275!!N\275!!N\275!!N\275!!N\275!!N\275!!N\275!!N\275!!!", "\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR!!\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR!!\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR!!\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR!!\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR\271\271RR!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!!" + "'", str2, "\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!\271\275!!!");
    }

    @Test
    public void test06779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06779");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("FFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHH!", "!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!" + "'", str2, "!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!");
    }

    @Test
    public void test06780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06780");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN!", "!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!!!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!~jl\225\225jl\225\225!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull!" + "'", str2, "\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull\340nullnullnull!");
    }

    @Test
    public void test06781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06781");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253!", "\230\226u!llu!ll\236\276\276\230\226u!llu!ll\236\276\276!!\230\226u!llu!ll\236\276\276\230\226u!llu!ll\236\276\276!!\230\226u!llu!ll\236\276\276\230\226u!llu!ll\236\276\276\230\226u!llu!ll\236\276\276\230\226u!llu!ll\236\276\276!!\230\226u!llu!ll\236\276\276\230\226u!llu!ll\236\276\276!!\230\226u!llu!ll\236\276\276\230\226u!llu!ll\236\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253!" + "'", str2, "\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253!");
    }

    @Test
    public void test06782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06782");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\u037b\u037c\u037e\u037e\u0348\u0346\u0346!", "]]FF]]FF!!]]FF]]FF!!]]FF]]FF]]FF]]FF!!]]FF]]FF!!]]FF]]FF!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u037e\u037e\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u037e\u037e\u0348\u0346\u0346!");
    }

    @Test
    public void test06783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06783");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!", "mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!" + "'", str2, "!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!");
    }

    @Test
    public void test06784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06784");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("hh!!hh!!!", "}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~!!~~!!!" + "'", str2, "~~!!~~!!!");
    }

    @Test
    public void test06785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06785");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!", "\u0366\u0365\u0368\u0368\225\225\225\225\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
    }

    @Test
    public void test06786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06786");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn!", "\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!" + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
    }

    @Test
    public void test06787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06787");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336!", "a]aaa]aa!!a]aaa]aa!!a]aaa]aaa]aaa]aa!!a]aaa]aa!!a]aaa]aa!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06788");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!", "LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!" + "'", str2, "!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!");
    }

    @Test
    public void test06789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06789");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!!nullnullnullnull]nullnullnullnullnullnullnullnullnullnullnullnull]nullnullnullnullnullnullnullnull!", "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!" + "'", str2, "U!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!");
    }

    @Test
    public void test06790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06790");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\234\235\237\237\u0348\u0346\u0346!", "!!!\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\234\235\237\237\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\234\235\237\237\u0348\u0346\u0346!");
    }

    @Test
    public void test06791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06791");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnullnull~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnull!", "\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f!" + "'", str2, "\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f!");
    }

    @Test
    public void test06792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06792");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NLLLNLLL!", "\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNNNLNNN!" + "'", str2, "LNNNLNNN!");
    }

    @Test
    public void test06793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06793");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\300\300\300\276\300\275\275!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnull\276null\275\275!" + "'", str2, "\275nullnullnull\276null\275\275!");
    }

    @Test
    public void test06794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06794");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!", "]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!" + "'", str2, "!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!");
    }

    @Test
    public void test06795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06795");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~n~~\225\230\230~n~~\225\230\230~n~~\225\230\230~n~~\225\230\230\200}}`~n~~\225\230\230~n~~\225\230\230~n~~\225\230\230~n~~\225\230\230]]!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230\200}}`~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230]]!" + "'", str2, "~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230\200}}`~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230]]!");
    }

    @Test
    public void test06796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06796");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e!", "nullnullnullnull\275\275\275nullnullnullnull\275\275\275!!nullnullnullnull\275\275\275nullnullnullnull\275\275\275!!nullnullnullnull\275\275\275nullnullnullnull\275\275\275nullnullnullnull\275\275\275nullnullnullnull\275\275\275!!nullnullnullnull\275\275\275nullnullnullnull\275\275\275!!nullnullnullnull\275\275\275nullnullnullnull\275\275\275!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06797");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LL^^\225\230\230LL^^\225\230\230LL^^\225\230\230LL^^\225\230\230\200}}`LL^^\225\230\230LL^^\225\230\230LL^^\225\230\230LL^^\225\230\230]]!", "]]]]]]]]!!]]]]]]]]!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]^^\225\230\230]]^^\225\230\230]]^^\225\230\230]]^^\225\230\230\200}}`]]^^\225\230\230]]^^\225\230\230]]^^\225\230\230]]^^\225\230\230]]!" + "'", str2, "]]^^\225\230\230]]^^\225\230\230]]^^\225\230\230]]^^\225\230\230\200}}`]]^^\225\230\230]]^^\225\230\230]]^^\225\230\230]]^^\225\230\230]]!");
    }

    @Test
    public void test06798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06798");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLL!", "N~~~N~~~N~~~N~~~N~~~N~~~N~~~N~~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnull!" + "'", str2, "null]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnull!");
    }

    @Test
    public void test06799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06799");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLL!", "!\275nullnull!\275nullnull!\275nullnull!\275nullnull!\275nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "orrrorrrrrorrrorrrrrorrrorrrrrorrrorrrrrorrrorrrrrorrrorrrrrorrrorrrrrorrrorrrrr!" + "'", str2, "orrrorrrrrorrrorrrrrorrrorrrrrorrrorrrrrorrrorrrrrorrrorrrrrorrrorrrrrorrrorrrrr!");
    }

    @Test
    public void test06800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06800");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260!", "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ\200}}`ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ZZZZZZZZ\255\256\260\260\255\256\260\260ZZZZZZZZ\255\256\260\260\255\256\260\260ZZZZZZZZ\255\256\260\260\255\256\260\260ZZZZZZZZ\255\256\260\260\255\256\260\260ZZZZZZZZ\255\256\260\260\255\256\260\260ZZZZZZZZ\255\256\260\260\255\256\260\260ZZZZZZZZ\255\256\260\260\255\256\260\260ZZZZZZZZ\255\256\260\260\255\256\260\260!" + "'", str2, "ZZZZZZZZ\255\256\260\260\255\256\260\260ZZZZZZZZ\255\256\260\260\255\256\260\260ZZZZZZZZ\255\256\260\260\255\256\260\260ZZZZZZZZ\255\256\260\260\255\256\260\260ZZZZZZZZ\255\256\260\260\255\256\260\260ZZZZZZZZ\255\256\260\260\255\256\260\260ZZZZZZZZ\255\256\260\260\255\256\260\260ZZZZZZZZ\255\256\260\260\255\256\260\260!");
    }

    @Test
    public void test06801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06801");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UNLLUNLL\253\253UNLLUNLL\253\253UNLLUNLL\253\253UNLLUNLL\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UNLLUNLL\253\253UNLLUNLL\253\253!", "]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253]!]]]!]]\253\253]!]]]!]]\253\253]!]]]!]]\253\253]!]]]!]]\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253]!]]]!]]\253\253]!]]]!]]\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253]!]]]!]]\253\253]!]]]!]]\253\253]!]]]!]]\253\253]!]]]!]]\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253]!]]]!]]\253\253]!]]]!]]\253\253!");
    }

    @Test
    public void test06802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06802");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!!", "rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\254\254\254\254RRRRRRRRRRRR\256\254\254\254\254\254\254RRRRRRRRRRRR\256\254\254!!\254\254\254\254RRRRRRRRRRRR\256\254\254\254\254\254\254RRRRRRRRRRRR\256\254\254!!\254\254\254\254RRRRRRRRRRRR\256\254\254\254\254\254\254RRRRRRRRRRRR\256\254\254!!\254\254\254\254RRRRRRRRRRRR\256\254\254\254\254\254\254RRRRRRRRRRRR\256\254\254!!\254\254\254\254RRRRRRRRRRRR\256\254\254\254\254\254\254RRRRRRRRRRRR\256\254\254!!\254\254\254\254RRRRRRRRRRRR\256\254\254\254\254\254\254RRRRRRRRRRRR\256\254\254!!\254\254\254\254RRRRRRRRRRRR\256\254\254\254\254\254\254RRRRRRRRRRRR\256\254\254!!\254\254\254\254RRRRRRRRRRRR\256\254\254\254\254\254\254RRRRRRRRRRRR\256\254\254!!!" + "'", str2, "\254\254\254\254RRRRRRRRRRRR\256\254\254\254\254\254\254RRRRRRRRRRRR\256\254\254!!\254\254\254\254RRRRRRRRRRRR\256\254\254\254\254\254\254RRRRRRRRRRRR\256\254\254!!\254\254\254\254RRRRRRRRRRRR\256\254\254\254\254\254\254RRRRRRRRRRRR\256\254\254!!\254\254\254\254RRRRRRRRRRRR\256\254\254\254\254\254\254RRRRRRRRRRRR\256\254\254!!\254\254\254\254RRRRRRRRRRRR\256\254\254\254\254\254\254RRRRRRRRRRRR\256\254\254!!\254\254\254\254RRRRRRRRRRRR\256\254\254\254\254\254\254RRRRRRRRRRRR\256\254\254!!\254\254\254\254RRRRRRRRRRRR\256\254\254\254\254\254\254RRRRRRRRRRRR\256\254\254!!\254\254\254\254RRRRRRRRRRRR\256\254\254\254\254\254\254RRRRRRRRRRRR\256\254\254!!!");
    }

    @Test
    public void test06803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06803");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!", "\u0366\u0365\u0368\u0368ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226!!ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226!!ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226!!ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226\204\204ULLLULLL\226\226ULLLULLL\226\226ULLLULLL\226\226\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test06804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06804");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NL!!NL!!!", "ffff\236\276\276ffff\236\276\276!!ffff\236\276\276ffff\236\276\276!!ffff\236\276\276ffff\236\276\276ffff\236\276\276ffff\236\276\276!!ffff\236\276\276ffff\236\276\276!!ffff\236\276\276ffff\236\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!!");
    }

    @Test
    public void test06805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06805");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!NL!!NL!!!!NL!!NL!!!!!!!", "\u0366\u0365\u0368\u0368UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!\200\200\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146!!!!!!!" + "'", str2, "\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146\u0144\u0146!!!!!!!");
    }

    @Test
    public void test06806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06806");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u023e\u023e\u023e\200\u023e\u023e\u023e]]!", "FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test06807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06807");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "!\253\256\256]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull]\335\336\340\340nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test06808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06808");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!", "NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL\253\254\256\256\253\254\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!" + "'", str2, "!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!!}}!!}}!!!");
    }

    @Test
    public void test06809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06809");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!!", "\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!!" + "'", str2, "\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!\275!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!!!!");
    }

    @Test
    public void test06810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06810");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("]]FF]]FF!!]]FF]]FF!!]]FF]]FF]]FF]]FF!!]]FF]]FF!!]]FF]]FF!", "\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af]]nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]UU]]UU!!]]UU]]UU!!]]UU]]UU]]UU]]UU!!]]UU]]UU!!]]UU]]UU!" + "'", str2, "]]UU]]UU!!]]UU]]UU!!]]UU]]UU]]UU]]UU!!]]UU]]UU!!]]UU]]UU!");
    }

    @Test
    public void test06811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06811");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!!", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "XXXX!!!XXXX!!!XXXX!!!XXXX!!!XXXX!!!XXXX!!!XXXX!!!XXXX!!!!" + "'", str2, "XXXX!!!XXXX!!!XXXX!!!XXXX!!!XXXX!!!XXXX!!!XXXX!!!XXXX!!!!");
    }

    @Test
    public void test06812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06812");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LJ!!LJ!!!", "~}\200\200~}\200\200PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230~}\200\200~}\200\200PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230~}\200\200~}\200\200PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230~}\200\200~}\200\200PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230~}\200\200~}\200\200PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230~}\200\200~}\200\200PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230~}\200\200~}\200\200PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230~}\200\200~}\200\200PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230PRRRPRRRPRRRPRRRPRRRPRRRPRRRPRRR\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!!");
    }

    @Test
    public void test06813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06813");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!~lnulluulnulluu!~lnulluulnulluu!!!~lnulluulnulluu!~lnulluulnulluu!!!~lnulluulnulluu!~lnulluulnulluu!~lnulluulnulluu!~lnulluulnulluu!!!~lnulluulnulluu!~lnulluulnulluu!!!~lnulluulnulluu!~lnulluulnulluu!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06814");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204!", "!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!!!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!!!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!!!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!!!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204!" + "'", str2, "\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204!");
    }

    @Test
    public void test06815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06815");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnull!", "NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226!!NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226NNNN\230\226\226!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNN!" + "'", str2, "NNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNN!");
    }

    @Test
    public void test06816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06816");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!!LLAALLAALLAALLAALLAALLAALLAALLAA!", "N!LLL!LLL!LLLN!LLL!LLL!LLLN!LLL!LLL!LLLN!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLLN!LLL!LLL!LLLN!LLL!LLL!LLLN!LLL!LLL!LLLN!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108nullnull!" + "'", str2, "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108nullnull!");
    }

    @Test
    public void test06817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06817");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\226\225\226\226\u0348\u0346\u0346!", "\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb\u02bd\u02bb\u02bb~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\226\225\226\226\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\226\225\226\226\u0348\u0346\u0346!");
    }

    @Test
    public void test06818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06818");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!\253\256\256\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "hHHHHhhHHHH!HHHHHHHHHHHHHHHHhHHHHhhHHHH!HHHHHHHHHHHHHHHH!!hHHHHhhHHHH!HHHHHHHHHHHHHHHHhHHHHhhHHHH!HHHHHHHHHHHHHHHH!!hHHHHhhHHHH!HHHHHHHHHHHHHHHHhHHHHhhHHHH!HHHHHHHHHHHHHHHH!!hHHHHhhHHHH!HHHHHHHHHHHHHHHHhHHHHhhHHHH!HHHHHHHHHHHHHHHH!!hHHHHhhHHHH!HHHHHHHHHHHHHHHHhHHHHhhHHHH!HHHHHHHHHHHHHHHH!!hHHHHhhHHHH!HHHHHHHHHHHHHHHHhHHHHhhHHHH!HHHHHHHHHHHHHHHH!!hHHHHhhHHHH!HHHHHHHHHHHHHHHHhHHHHhhHHHH!HHHHHHHHHHHHHHHH!!hHHHHhhHHHH!HHHHHHHHHHHHHHHHhHHHHhhHHHH!HHHHHHHHHHHHHHHH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271\266\216!\216\216\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test06819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06819");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!!!!!!!!!!!!!\200}}`!!!!!!!!!!!!!!!!]]!", "\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275\275\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!\200}}`!!!!!!!!!!!!!!!!]]!" + "'", str2, "!!!!!!!!!!!!!!!!\200}}`!!!!!!!!!!!!!!!!]]!");
    }

    @Test
    public void test06820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06820");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("`}nullnull`}nullnull`}nullnull`}nullnull`}nullnull!", "HHHHHHHHHHHHHHHH\200}}`HHHHHHHHHHHHHHHH]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`}hhhhhhhh`}hhhhhhhh`}hhhhhhhh`}hhhhhhhh`}hhhhhhhh!" + "'", str2, "`}hhhhhhhh`}hhhhhhhh`}hhhhhhhh`}hhhhhhhh`}hhhhhhhh!");
    }

    @Test
    public void test06821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06821");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!", "U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU!!U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!" + "'", str2, "!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!");
    }

    @Test
    public void test06822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06822");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "`LNLLLNLLLNLL`LNLLLNLLLNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06823");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276\276\276\276\365\366\370\370\365\366\370\370\365\366\370\370\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\365\366\370\370\365\366\370\370\365\366\370\370\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!", "null!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276\276\276nullnullnullnullnullnullnullnullnullnullnullnull\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276nullnullnullnullnullnullnullnullnullnullnullnull\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!" + "'", str2, "\276\276\276\276nullnullnullnullnullnullnullnullnullnullnullnull\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276nullnullnullnullnullnullnullnullnullnullnullnull\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!");
    }

    @Test
    public void test06824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06824");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u016e\u016e\u016e\u016e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u016e\u016e\u016e\u016e!", "``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230\200}}```]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06825");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!" + "'", str2, "UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!");
    }

    @Test
    public void test06826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06826");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06827");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u0317\u031a\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u0317\u031a\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u0317\u031a\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u0317\u031a\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be!", "L\335LLL\335LL!!L\335LLL\335LL!!L\335LLL\335LLL\335LLL\335LL!!L\335LLL\335LL!!L\335LLL\335LL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0317\u031a\u0317\u031a\u0317\u031a\u0317\u031anullnullnullnullnullnullnullnull!" + "'", str2, "\u0317\u031a\u0317\u031a\u0317\u031a\u0317\u031anullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06828");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275!!!\275!!!\275!!!\275!!!\200}}`\275!!!\275!!!\275!!!\275!!!]]!", "\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!!!\275!!!\275!!!\275!!!\200}}`\275!!!\275!!!\275!!!\275!!!]]!" + "'", str2, "\275!!!\275!!!\275!!!\275!!!\200}}`\275!!!\275!!!\275!!!\275!!!]]!");
    }

    @Test
    public void test06829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06829");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212!!null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212!!null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212!!null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212!!null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212!", "\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e\u019e!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNUU~\210LNUU\212\212\210LNUU\212\212LNUU~\210LNUU\212\212\210LNUU\212\212!!LNUU~\210LNUU\212\212\210LNUU\212\212LNUU~\210LNUU\212\212\210LNUU\212\212!!LNUU~\210LNUU\212\212\210LNUU\212\212LNUU~\210LNUU\212\212\210LNUU\212\212LNUU~\210LNUU\212\212\210LNUU\212\212LNUU~\210LNUU\212\212\210LNUU\212\212!!LNUU~\210LNUU\212\212\210LNUU\212\212LNUU~\210LNUU\212\212\210LNUU\212\212!!LNUU~\210LNUU\212\212\210LNUU\212\212LNUU~\210LNUU\212\212\210LNUU\212\212!" + "'", str2, "LNUU~\210LNUU\212\212\210LNUU\212\212LNUU~\210LNUU\212\212\210LNUU\212\212!!LNUU~\210LNUU\212\212\210LNUU\212\212LNUU~\210LNUU\212\212\210LNUU\212\212!!LNUU~\210LNUU\212\212\210LNUU\212\212LNUU~\210LNUU\212\212\210LNUU\212\212LNUU~\210LNUU\212\212\210LNUU\212\212LNUU~\210LNUU\212\212\210LNUU\212\212!!LNUU~\210LNUU\212\212\210LNUU\212\212LNUU~\210LNUU\212\212\210LNUU\212\212!!LNUU~\210LNUU\212\212\210LNUU\212\212LNUU~\210LNUU\212\212\210LNUU\212\212!");
    }

    @Test
    public void test06830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06830");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\260\260NN\260\260NN}}\260\260NN\260\260NN}}!", "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\260\u0108\u0108\260\260\u0108\u0108}}\260\260\u0108\u0108\260\260\u0108\u0108}}!" + "'", str2, "\260\260\u0108\u0108\260\260\u0108\u0108}}\260\260\u0108\u0108\260\260\u0108\u0108}}!");
    }

    @Test
    public void test06831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06831");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300!", "\215}\215\215\215}\215\215\u014e\u014e\u014e\u014e!!!\215}\215\215\215}\215\215!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06832");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LL^^\225\230\230LL^^\225\230\230LL^^\225\230\230LL^^\225\230\230\200}}`LL^^\225\230\230LL^^\225\230\230LL^^\225\230\230LL^^\225\230\230]]!", "}~\200\200}~\200\200]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!}~\200\200}~\200\200]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!^^\225\230\230!!^^\225\230\230!!^^\225\230\230!!^^\225\230\230\200}}`!!^^\225\230\230!!^^\225\230\230!!^^\225\230\230!!^^\225\230\230]]!" + "'", str2, "!!^^\225\230\230!!^^\225\230\230!!^^\225\230\230!!^^\225\230\230\200}}`!!^^\225\230\230!!^^\225\230\230!!^^\225\230\230!!^^\225\230\230]]!");
    }

    @Test
    public void test06833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06833");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\230!\225\225\230!\225\225nullnullnullnullnullnullnullnull\230!\225\225\230!\225\225nullnullnullnullnullnullnullnull\230!\225\225\230!\225\225nullnullnullnullnullnullnullnull\230!\225\225\230!\225\225nullnullnullnullnullnullnullnull\230!\225\225\230!\225\225nullnullnullnullnullnullnullnull\230!\225\225\230!\225\225nullnullnullnullnullnullnullnull\230!\225\225\230!\225\225nullnullnullnullnullnullnullnull\230!\225\225\230!\225\225nullnullnullnullnullnullnullnull!", "\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!" + "'", str2, "\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\230!\225\225\230!\225\225UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
    }

    @Test
    public void test06834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06834");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("vyyyvyyyvyyyvyyyvyyyvyyyvyyyvyyy\200\200\200\200\200\200\200\200vyyyvyyyvyyyvyyyvyyyvyyyvyyyvyyy\200\200\200\200\200\200\200\200!!vyyyvyyyvyyyvyyyvyyyvyyyvyyyvyyy\200\200\200\200\200\200\200\200vyyyvyyyvyyyvyyyvyyyvyyyvyyyvyyy\200\200\200\200\200\200\200\200!!vyyyvyyyvyyyvyyyvyyyvyyyvyyyvyyy\200\200\200\200\200\200\200\200vyyyvyyyvyyyvyyyvyyyvyyyvyyyvyyy\200\200\200\200\200\200\200\200vyyyvyyyvyyyvyyyvyyyvyyyvyyyvyyy\200\200\200\200\200\200\200\200vyyyvyyyvyyyvyyyvyyyvyyyvyyyvyyy\200\200\200\200\200\200\200\200!!vyyyvyyyvyyyvyyyvyyyvyyyvyyyvyyy\200\200\200\200\200\200\200\200vyyyvyyyvyyyvyyyvyyyvyyyvyyyvyyy\200\200\200\200\200\200\200\200!!vyyyvyyyvyyyvyyyvyyyvyyyvyyyvyyy\200\200\200\200\200\200\200\200vyyyvyyyvyyyvyyyvyyyvyyyvyyyvyyy\200\200\200\200\200\200\200\200!", "N~~~N~~~N~~~N~~~N~~~N~~~N~~~N~~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200!!~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200!!~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200!!~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200!!~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200!" + "'", str2, "~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200!!~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200!!~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200!!~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200!!~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200~nnn~nnn~nnn~nnn~nnn~nnn~nnn~nnn\200\200\200\200\200\200\200\200!");
    }

    @Test
    public void test06835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06835");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~!!U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~!!U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~!!U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~!!U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~!!F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~!!F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~!!F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~!!F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~!" + "'", str2, "F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~!!F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~!!F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~!!F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~!!F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~!");
    }

    @Test
    public void test06836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06836");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("`LNLLLNLLLNLL`LNLLLNLLLNLL!", "!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]\200}}`!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]!!EEE]]]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`E]EEE]EEE]EE`E]EEE]EEE]EE!" + "'", str2, "`E]EEE]EEE]EE`E]EEE]EEE]EE!");
    }

    @Test
    public void test06837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06837");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "UULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06838");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test06839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06839");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!\253\256\256\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test06840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06840");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````!", "\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275\276\230\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````!" + "'", str2, "\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````!");
    }

    @Test
    public void test06841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06841");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275nullnullnullnullnullnullnullnullnullnullnullnull\276nullnullnullnull\275\275!", "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU\276LLUULLUULLUULLUU\275\275!" + "'", str2, "\275LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU\276LLUULLUULLUULLUU\275\275!");
    }

    @Test
    public void test06842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06842");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL!", "!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275UUU\275UUU\275UUU\275UUU\275UUU\275UUU\275UUU\275UUU!" + "'", str2, "\275UUU\275UUU\275UUU\275UUU\275UUU\275UUU\275UUU\275UUU!");
    }

    @Test
    public void test06843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06843");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLLL\276LLLLLLL\276\276LLLLL\276\276LLLLL\276\276LLLLL\276\276LLLL\276LLLLLLL\276\276LLLLL\276\276!", "!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\276nullnullnullnullnullnullnull\276\276nullnullnullnullnull\276\276nullnullnullnullnull\276\276nullnullnullnullnull\276\276nullnullnullnull\276nullnullnullnullnullnullnull\276\276nullnullnullnullnull\276\276!" + "'", str2, "nullnullnullnull\276nullnullnullnullnullnullnull\276\276nullnullnullnullnull\276\276nullnullnullnullnull\276\276nullnullnullnullnull\276\276nullnullnullnull\276nullnullnullnullnullnullnull\276\276nullnullnullnullnull\276\276!");
    }

    @Test
    public void test06844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06844");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\200\200!!\200\200!!!", "!N!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200!!\200\200!!!" + "'", str2, "\200\200!!\200\200!!!");
    }

    @Test
    public void test06845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06845");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!", "}!\200\200}!\200\200}!\200\200}!\200\200\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215}!\200\200}!\200\200}!\200\200}!\200\200\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!" + "'", str2, "\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!");
    }

    @Test
    public void test06846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06846");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!", "efhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnullefhhefhhnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!" + "'", str2, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
    }

    @Test
    public void test06847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06847");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test06848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06848");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\230!\225\225\230!\225\225nullnullnullnullnullnullnullnull\230!\225\225\230!\225\225nullnullnullnullnullnullnullnull\230!\225\225\230!\225\225nullnullnullnullnullnullnullnull\230!\225\225\230!\225\225nullnullnullnullnullnullnullnull\230!\225\225\230!\225\225nullnullnullnullnullnullnullnull\230!\225\225\230!\225\225nullnullnullnullnullnullnullnull\230!\225\225\230!\225\225nullnullnullnullnullnullnullnull\230!\225\225\230!\225\225nullnullnullnullnullnullnullnull!", "LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```LLLLLLLLLLLLLLLL```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230!\225\225\230!\225\225LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\230!\225\225\230!\225\225LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\230!\225\225\230!\225\225LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\230!\225\225\230!\225\225LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\230!\225\225\230!\225\225LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\230!\225\225\230!\225\225LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\230!\225\225\230!\225\225LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\230!\225\225\230!\225\225LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "\230!\225\225\230!\225\225LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\230!\225\225\230!\225\225LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\230!\225\225\230!\225\225LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\230!\225\225\230!\225\225LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\230!\225\225\230!\225\225LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\230!\225\225\230!\225\225LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\230!\225\225\230!\225\225LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\230!\225\225\230!\225\225LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test06849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06849");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!^^\225\230\230!!^^\225\230\230!!^^\225\230\230!!^^\225\230\230\200}}`!!^^\225\230\230!!^^\225\230\230!!^^\225\230\230!!^^\225\230\230]]!", "!!!ll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!^^\225\230\230!!^^\225\230\230!!^^\225\230\230!!^^\225\230\230\200}}`!!^^\225\230\230!!^^\225\230\230!!^^\225\230\230!!^^\225\230\230]]!" + "'", str2, "!!^^\225\230\230!!^^\225\230\230!!^^\225\230\230!!^^\225\230\230\200}}`!!^^\225\230\230!!^^\225\230\230!!^^\225\230\230!!^^\225\230\230]]!");
    }

    @Test
    public void test06850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06850");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\215}\215\215\215}\215\215\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\u01a7\u01aa\u01aa\u01aa\215}\215\215\215}\215\215!", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\273\272\275\275\273\272\275\275\253\253\273\272\275\275\273\272\275\275\253\253\273\272\275\275\273\272\275\275\253\253\273\272\275\275\273\272\275\275\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\273\272\275\275\273\272\275\275\253\253\273\272\275\275\273\272\275\275\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\215}\215\215\215}\215\215!");
    }

    @Test
    public void test06851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06851");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0345\u0346\u0348\u0348!", "!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test06852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06852");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!nullnull!", "vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!nullnullnullnullnullnullnullnull!" + "'", str2, "!!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06853");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0345\u0346\u0348\u0348!", "\276\276\300\300\276\276\300\300!!\276\276\300\300\276\276\300\300!!\276\276\300\300\276\276\300\300\276\276\300\300\276\276\300\300!!\276\276\300\300\276\276\300\300!!\276\276\300\300\276\276\300\300!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test06854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06854");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullLULLLULLLULLLULLnullnull!", "null!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnullnull!nullnullnull!nullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNNNLNNNLLLLLLLLLLLLLLLLLNNNLNNN!" + "'", str2, "LNNNLNNNLLLLLLLLLLLLLLLLLNNNLNNN!");
    }

    @Test
    public void test06855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06855");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!L!!!L!!!", "!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!!");
    }

    @Test
    public void test06856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06856");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~~!!~~!!!", "\275nullnullnullnullnullnullnullnullnullnullnullnull\276nullnullnullnull\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~!!~~!!!" + "'", str2, "~~!!~~!!!");
    }

    @Test
    public void test06857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06857");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225!", "\253\254\256\256\366\367\371\371\366\367\371\371\366\367\371\371\366\367\371\371\253\254\256\256\366\367\371\371\366\367\371\371!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```^```^```^```^```^```^```^```^```\253null\225\225\253null\225\225^```^```\253null\225\225\253null\225\225^```^```^```^```^```^```^```^```^```^```\253null\225\225\253null\225\225^```^```\253null\225\225\253null\225\225^```^```^```^```^```^```^```^```^```^```\253null\225\225\253null\225\225^```^```\253null\225\225\253null\225\225^```^```^```^```^```^```^```^```^```^```\253null\225\225\253null\225\225^```^```\253null\225\225\253null\225\225^```^```^```^```^```^```^```^```^```^```\253null\225\225\253null\225\225^```^```\253null\225\225\253null\225\225^```^```^```^```^```^```^```^```^```^```\253null\225\225\253null\225\225^```^```\253null\225\225\253null\225\225^```^```^```^```^```^```^```^```^```^```\253null\225\225\253null\225\225^```^```\253null\225\225\253null\225\225^```^```^```^```^```^```^```^```^```^```\253null\225\225\253null\225\225^```^```\253null\225\225\253null\225\225!" + "'", str2, "^```^```^```^```^```^```^```^```^```^```\253null\225\225\253null\225\225^```^```\253null\225\225\253null\225\225^```^```^```^```^```^```^```^```^```^```\253null\225\225\253null\225\225^```^```\253null\225\225\253null\225\225^```^```^```^```^```^```^```^```^```^```\253null\225\225\253null\225\225^```^```\253null\225\225\253null\225\225^```^```^```^```^```^```^```^```^```^```\253null\225\225\253null\225\225^```^```\253null\225\225\253null\225\225^```^```^```^```^```^```^```^```^```^```\253null\225\225\253null\225\225^```^```\253null\225\225\253null\225\225^```^```^```^```^```^```^```^```^```^```\253null\225\225\253null\225\225^```^```\253null\225\225\253null\225\225^```^```^```^```^```^```^```^```^```^```\253null\225\225\253null\225\225^```^```\253null\225\225\253null\225\225^```^```^```^```^```^```^```^```^```^```\253null\225\225\253null\225\225^```^```\253null\225\225\253null\225\225!");
    }

    @Test
    public void test06858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06858");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("AA]]AA]]nullnullAA]]AA]]nullnull!", "!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!]]!!]]N!!!N!!!!!]]!!]]N!!!N!!!!" + "'", str2, "!!]]!!]]N!!!N!!!!!]]!!]]N!!!N!!!!");
    }

    @Test
    public void test06859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06859");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\215\215!!\215\215!!\215\215!!\215\215!!\213\213\213\u0346\u0348\u0348!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200UL``LUL``UL``UL``LUL``UL``}~\200\200}~\200\200UL``LUL``UL``UL``LUL``UL``}~\200\200}~\200\200UL``LUL``UL``UL``LUL``UL``}~\200\200}~\200\200\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\215\215!!\215\215!!\215\215!!\215\215!!\213\213\213\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\215\215!!\215\215!!\215\215!!\215\215!!\213\213\213\u0346\u0348\u0348!");
    }

    @Test
    public void test06860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06860");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnull\254~\256\256\254~\256\256\254~\256\256\254~\256\256!", "!eeeeeeeeeeeeeeee!!!eeeeeeeeeeeeeeee!!!!!eeeeeeeeeeeeeeee!!!eeeeeeeeeeeeeeee!!!!!eeeeeeeeeeeeeeee!!!eeeeeeeeeeeeeeee!!!eeeeeeeeeeeeeeee!!!eeeeeeeeeeeeeeee!!!!!eeeeeeeeeeeeeeee!!!eeeeeeeeeeeeeeee!!!!!eeeeeeeeeeeeeeee!!!eeeeeeeeeeeeeeee!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EEEEEEEEEEEEEEEE\254~\256\256\254~\256\256\254~\256\256\254~\256\256!" + "'", str2, "EEEEEEEEEEEEEEEE\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
    }

    @Test
    public void test06861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06861");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200}}`\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230]]!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200}}`\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230]]!" + "'", str2, "\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200}}`\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230]]!");
    }

    @Test
    public void test06862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06862");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("XXXX!!!XXXX!!!XXXX!!!XXXX!!!XXXX!!!XXXX!!!XXXX!!!XXXX!!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!!" + "'", str2, "UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!!");
    }

    @Test
    public void test06863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06863");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!!", "U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!!U\220NN\200~~U\220NN\200~~U\220NNU\220NNU\220NN\200~~U\220NN\200~~U\220NNU\220NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!!" + "'", str2, "\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!!");
    }

    @Test
    public void test06864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06864");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a\u016a!", "\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06865");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LnullLLLnullLL!!LnullLLLnullLL!!LnullLLLnullLLLnullLLLnullLL!!LnullLLLnullLL!!LnullLLLnullLL!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnull}~\200\200}~\200\200nullnull}~\200\200}~\200\200nullnull}~\200\200}~\200\200\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\204\241\242\244\244\204\204\204\241\242\244\244\204\204!!\204\241\242\244\244\204\204\204\241\242\244\244\204\204!!\204\241\242\244\244\204\204\204\241\242\244\244\204\204\204\241\242\244\244\204\204\204\241\242\244\244\204\204!!\204\241\242\244\244\204\204\204\241\242\244\244\204\204!!\204\241\242\244\244\204\204\204\241\242\244\244\204\204!" + "'", str2, "\204\241\242\244\244\204\204\204\241\242\244\244\204\204!!\204\241\242\244\244\204\204\204\241\242\244\244\204\204!!\204\241\242\244\244\204\204\204\241\242\244\244\204\204\204\241\242\244\244\204\204\204\241\242\244\244\204\204!!\204\241\242\244\244\204\204\204\241\242\244\244\204\204!!\204\241\242\244\244\204\204\204\241\242\244\244\204\204!");
    }

    @Test
    public void test06866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06866");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u014f\u014d\u0151\u0151\u014f\u014d\u0151\u0151\u014f\u014d\u0151\u0151\u014f\u014d\u0151\u0151\u014f\u014d\u0151\u0151\u014f\u014d\u0151\u0151\u014f\u014d\u0151\u0151\u014f\u014d\u0151\u0151\u014f\u014d\u0151\u0151\u014f\u014d\u0151\u0151\u014f\u014d\u0151\u0151\u014f\u014d\u0151\u0151nullnull!", "eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!E!!!E!!!U!!!U!!!E!!!E!!!U!!!U!!!U!!!E!!!U!!!U!!!U!!!E!!!U!!!U!!!U!!!E!!!U!!!U!!!U!!!E!!!U!!!U!!!E!!!E!!!U!!!U!!!E!!!E!!!U!!!U!!!" + "'", str2, "!E!!!E!!!U!!!U!!!E!!!E!!!U!!!U!!!U!!!E!!!U!!!U!!!U!!!E!!!U!!!U!!!U!!!E!!!U!!!U!!!U!!!E!!!U!!!U!!!E!!!E!!!U!!!U!!!E!!!E!!!U!!!U!!!");
    }

    @Test
    public void test06867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06867");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!!", "\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226\225\230\226\226!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!!" + "'", str2, "\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!\215\215!!!");
    }

    @Test
    public void test06868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06868");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```ULLLULLLULLLULLL!!!```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06869");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368nullnull!!nullnull!!\200\200\u0346\u0348\u0348!", "\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL]]\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL]]\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL]]\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL]]~}}^\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL]]\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL]]\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL]]\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL]]]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0172\u0172\u0172\u0172\u0172\u0172\u0172\u0172!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test06870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06870");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!", "\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\335\336\336\336\335\336\336\336!!\335\336\336\336\335\336\336\336!!\335\336\336\336\335\336\336\336!!\335\336\336\336\335\336\336\336!!\335\336\336\336\335\336\336\336!!\335\336\336\336\335\336\336\336!!\335\336\336\336\335\336\336\336!!\335\336\336\336\335\336\336\336!!!" + "'", str2, "\335\336\336\336\335\336\336\336!!\335\336\336\336\335\336\336\336!!\335\336\336\336\335\336\336\336!!\335\336\336\336\335\336\336\336!!\335\336\336\336\335\336\336\336!!\335\336\336\336\335\336\336\336!!\335\336\336\336\335\336\336\336!!\335\336\336\336\335\336\336\336!!!");
    }

    @Test
    public void test06871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06871");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!!\200~\200\200\200~\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test06872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06872");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108]]!", "!!~LNUULNUU!!!!~LNUULNUU!!!!!!~LNUULNUU!!!!~LNUULNUU!!!!!!~LNUULNUU!!!!~LNUULNUU!!!!~LNUULNUU!!!!~LNUULNUU!!!!!!~LNUULNUU!!!!~LNUULNUU!!!!!!~LNUULNUU!!!!~LNUULNUU!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull~}}^null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull]]!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull~}}^null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull]]!");
    }

    @Test
    public void test06873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06873");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!", "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fanullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06874");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200LLLLLLLL~}\200\200~}\200\200LLLLLLLL~}\200\200~}\200\200LLLLLLLL~}\200\200~}\200\200LLLLLLLL~}\200\200~}\200\200LLLLLLLL~}\200\200~}\200\200LLLLLLLL~}\200\200~}\200\200LLLLLLLL~}\200\200~}\200\200LLLLLLLL!" + "'", str2, "~}\200\200~}\200\200LLLLLLLL~}\200\200~}\200\200LLLLLLLL~}\200\200~}\200\200LLLLLLLL~}\200\200~}\200\200LLLLLLLL~}\200\200~}\200\200LLLLLLLL~}\200\200~}\200\200LLLLLLLL~}\200\200~}\200\200LLLLLLLL~}\200\200~}\200\200LLLLLLLL!");
    }

    @Test
    public void test06875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06875");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e!!\214\214!", "\253\254\256\256nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214!");
    }

    @Test
    public void test06876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06876");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("`}nullnull`}nullnull`}nullnull`}nullnull`}nullnull!", "\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037enullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`}LNNNLNNN`}LNNNLNNN`}LNNNLNNN`}LNNNLNNN`}LNNNLNNN!" + "'", str2, "`}LNNNLNNN`}LNNNLNNN`}LNNNLNNN`}LNNNLNNN`}LNNNLNNN!");
    }

    @Test
    public void test06877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06877");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!!", "!~nullnull!~nullnull\220\220!~nullnull!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220!~nullnull!~nullnull\220\220!~nullnull!~nullnull\220\220!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!!" + "'", str2, "U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!!");
    }

    @Test
    public void test06878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06878");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\253\254\256\256\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!\253\254\256\256\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!!", "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\253\254\256\256L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!" + "'", str2, "\253\254\256\256L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\253\254\256\256L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!");
    }

    @Test
    public void test06879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06879");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("H!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HH!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnull!" + "'", str2, "null!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnull!");
    }

    @Test
    public void test06880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06880");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!LL!", "\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320nullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0150\u0150!" + "'", str2, "\u0150\u0150!");
    }

    @Test
    public void test06881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06881");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!" + "'", str2, "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!");
    }

    @Test
    public void test06882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06882");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!" + "'", str2, "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!");
    }

    @Test
    public void test06883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06883");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u019a\u028c\u0249\u0249\u0346\u0348\u0348!", "!~UU!~UU!!!~UU!~UU!!!~UU!~UU!~UU!~UU!!!~UU!~UU!!!~UU!~UU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test06884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06884");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~~!!null~~~null~~~null~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!null~~~null~~~null~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!", "\367!\372\372\367!\372\372!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~!!nullnullnullnull~~~nullnullnullnull~~~nullnullnullnull~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!nullnullnullnull~~~nullnullnullnull~~~nullnullnullnull~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!" + "'", str2, "~~!!nullnullnullnull~~~nullnullnullnull~~~nullnullnullnull~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!nullnullnullnull~~~nullnullnullnull~~~nullnullnullnull~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!");
    }

    @Test
    public void test06885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06885");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NNNNNNNNNNNNNNNN\200}}`NNNNNNNNNNNNNNNN]]!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLLLLLLLLLLLLLL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLL]]!" + "'", str2, "LLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLL]]!");
    }

    @Test
    public void test06886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06886");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!!!NN!!NN!!NN!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!NN!!NN!!NN!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!nullnull!!nullnull!!nullnull!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!nullnull!!nullnull!!nullnull!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!nullnull!!nullnull!!nullnull!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!nullnull!!nullnull!!nullnull!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test06887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06887");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\253\254\256\256!JJJ!JJJ!JJJ!JJJ\253\254\256\256!JJJ!JJJ!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256!UUU!UUU!UUU!UUU\253\254\256\256!UUU!UUU!" + "'", str2, "\253\254\256\256!UUU!UUU!UUU!UUU\253\254\256\256!UUU!UUU!");
    }

    @Test
    public void test06888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06888");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\210\205\206\206\u0348\u0346\u0346!", "^```^```^```^```^```^```^```^```^```^```\253null\225\225\253null\225\225^```^```\253null\225\225\253null\225\225^```^```^```^```^```^```^```^```^```^```\253null\225\225\253null\225\225^```^```\253null\225\225\253null\225\225^```^```^```^```^```^```^```^```^```^```\253null\225\225\253null\225\225^```^```\253null\225\225\253null\225\225^```^```^```^```^```^```^```^```^```^```\253null\225\225\253null\225\225^```^```\253null\225\225\253null\225\225^```^```^```^```^```^```^```^```^```^```\253null\225\225\253null\225\225^```^```\253null\225\225\253null\225\225^```^```^```^```^```^```^```^```^```^```\253null\225\225\253null\225\225^```^```\253null\225\225\253null\225\225^```^```^```^```^```^```^```^```^```^```\253null\225\225\253null\225\225^```^```\253null\225\225\253null\225\225^```^```^```^```^```^```^```^```^```^```\253null\225\225\253null\225\225^```^```\253null\225\225\253null\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\210\205\206\206\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\210\205\206\206\u0348\u0346\u0346!");
    }

    @Test
    public void test06889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06889");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\270null\270\270\270null\270\270!!\270null\270\270\270null\270\270!!\270null\270\270\270null\270\270!!\270null\270\270\270null\270\270!!\270null\270\270\270null\270\270!!\270null\270\270\270null\270\270!!\270null\270\270\270null\270\270!!\270null\270\270\270null\270\270!!!", "L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!!L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!!L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!!L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!!L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\270\u0245\u0245\270\270\270\u0245\u0245\270\270!!\270\u0245\u0245\270\270\270\u0245\u0245\270\270!!\270\u0245\u0245\270\270\270\u0245\u0245\270\270!!\270\u0245\u0245\270\270\270\u0245\u0245\270\270!!\270\u0245\u0245\270\270\270\u0245\u0245\270\270!!\270\u0245\u0245\270\270\270\u0245\u0245\270\270!!\270\u0245\u0245\270\270\270\u0245\u0245\270\270!!\270\u0245\u0245\270\270\270\u0245\u0245\270\270!!!" + "'", str2, "\270\u0245\u0245\270\270\270\u0245\u0245\270\270!!\270\u0245\u0245\270\270\270\u0245\u0245\270\270!!\270\u0245\u0245\270\270\270\u0245\u0245\270\270!!\270\u0245\u0245\270\270\270\u0245\u0245\270\270!!\270\u0245\u0245\270\270\270\u0245\u0245\270\270!!\270\u0245\u0245\270\270\270\u0245\u0245\270\270!!\270\u0245\u0245\270\270\270\u0245\u0245\270\270!!\270\u0245\u0245\270\270\270\u0245\u0245\270\270!!!");
    }

    @Test
    public void test06890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06890");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!!", "!!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!!" + "'", str2, "\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!!");
    }

    @Test
    public void test06891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06891");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]!", "nullnull\333null\330\330\333null\330\330nullnull\333null\330\330\333null\330\330\214\214nullnull\333null\330\330\333null\330\330nullnull\333null\330\330\333null\330\330\214\214nullnull\333null\330\330\333null\330\330nullnull\333null\330\330\333null\330\330\214\214nullnull\333null\330\330\333null\330\330nullnull\333null\330\330\333null\330\330\214\214nullnull\333null\330\330\333null\330\330nullnull\333null\330\330\333null\330\330\214\214nullnull\333null\330\330\333null\330\330nullnull\333null\330\330\333null\330\330\214\214nullnull\333null\330\330\333null\330\330nullnull\333null\330\330\333null\330\330\214\214nullnull\333null\330\330\333null\330\330nullnull\333null\330\330\333null\330\330\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]!" + "'", str2, "L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]!");
    }

    @Test
    public void test06892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06892");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test06893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06893");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!", "\275\276\u02fa\225\225\276\u02fa\225\225\200\200\276\u02fa\225\225\276\u02fa\225\225\200\200\276\u02fa\225\225\276\u02fa\225\225\200\200\276\276\u02fa\225\225\276\u02fa\225\225\200\200\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
    }

    @Test
    public void test06894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06894");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll!!\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll!!\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll!!\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll!!\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!!" + "'", str2, "LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!!");
    }

    @Test
    public void test06895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06895");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300!", "!\276!~~\276!~~\276!~~\276!~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300!" + "'", str2, "\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300!");
    }

    @Test
    public void test06896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06896");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "~}\200\200~}\200\200LLLLLLLL~}\200\200~}\200\200LLLLLLLL~}\200\200~}\200\200LLLLLLLL~}\200\200~}\200\200LLLLLLLL~}\200\200~}\200\200LLLLLLLL~}\200\200~}\200\200LLLLLLLL~}\200\200~}\200\200LLLLLLLL~}\200\200~}\200\200LLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06897");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214ULUUULUULUUUU\214\214LUUUU\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test06898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06898");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0128\u0126\u0126\u0108\u0106\u0106!", "]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!!]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!!]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!!]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!!]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0123\u0124\u0126\u0126\u0123\u0124\u0126\u0126nullnull!" + "'", str2, "\u0123\u0124\u0126\u0126\u0123\u0124\u0126\u0126nullnull!");
    }

    @Test
    public void test06899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06899");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230\200}}`l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230]]!", "\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230\200}}`U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230]]!" + "'", str2, "U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230\200}}`U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230]]!");
    }

    @Test
    public void test06900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06900");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~!", "\u0366\u0365\u0368\u0368!!]]!!]]\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~!" + "'", str2, "}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~!");
    }

    @Test
    public void test06901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06901");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!", "null\225\230\230null\225\230\230null\225\230\230null\225\230\230\200}}`null\225\230\230null\225\230\230null\225\230\230null\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!" + "'", str2, "!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!!]]!!]]\230\230\225\225\230\230\225\225]]\230\230\225\225\230\230\225\225]]!");
    }

    @Test
    public void test06902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06902");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\275NLUUNLUUNLUU\275NLUUNLUUNLUU\275NLUUNLUUNLUU\275NLUUNLUUNLUUNLUUNLUU\275\275NLUUNLUU\275\275NLUUNLUU\275\275NLUUNLUU\275\275\275NLUUNLUUNLUU\275NLUUNLUUNLUU\275NLUUNLUUNLUU\275NLUUNLUUNLUUNLUUNLUU\275\275NLUUNLUU\275\275!", "\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\200}}`\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\214\214\214\214\214\214\214\214\214\214\214\214\275\214\214\214\214\214\214\214\214\214\214\214\214\275\214\214\214\214\214\214\214\214\214\214\214\214\275\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\275\275\214\214\214\214\214\214\214\214\275\275\214\214\214\214\214\214\214\214\275\275\214\214\214\214\214\214\214\214\275\275\275\214\214\214\214\214\214\214\214\214\214\214\214\275\214\214\214\214\214\214\214\214\214\214\214\214\275\214\214\214\214\214\214\214\214\214\214\214\214\275\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\275\275\214\214\214\214\214\214\214\214\275\275!" + "'", str2, "\275\214\214\214\214\214\214\214\214\214\214\214\214\275\214\214\214\214\214\214\214\214\214\214\214\214\275\214\214\214\214\214\214\214\214\214\214\214\214\275\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\275\275\214\214\214\214\214\214\214\214\275\275\214\214\214\214\214\214\214\214\275\275\214\214\214\214\214\214\214\214\275\275\275\214\214\214\214\214\214\214\214\214\214\214\214\275\214\214\214\214\214\214\214\214\214\214\214\214\275\214\214\214\214\214\214\214\214\214\214\214\214\275\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\214\275\275\214\214\214\214\214\214\214\214\275\275!");
    }

    @Test
    public void test06903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06903");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("porrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnullporrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnullporrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnullporrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnullporrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnullporrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnullporrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnullporrporrporrporrporrporrporrporrporrporrnullnullporrporrnullnull!", "~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}U~LLU~LLLL}}LL}}U~LLU~LLLL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}U~LLU~LLLL}}LL}}U~LLU~LLLL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}U~LLU~LLLL}}LL}}U~LLU~LLLL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}U~LLU~LLLL}}LL}}U~LLU~LLLL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}U~LLU~LLLL}}LL}}U~LLU~LLLL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}U~LLU~LLLL}}LL}}U~LLU~LLLL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}U~LLU~LLLL}}LL}}U~LLU~LLLL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}U~LLU~LLLL}}LL}}U~LLU~LL!" + "'", str2, "LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}U~LLU~LLLL}}LL}}U~LLU~LLLL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}U~LLU~LLLL}}LL}}U~LLU~LLLL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}U~LLU~LLLL}}LL}}U~LLU~LLLL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}U~LLU~LLLL}}LL}}U~LLU~LLLL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}U~LLU~LLLL}}LL}}U~LLU~LLLL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}U~LLU~LLLL}}LL}}U~LLU~LLLL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}U~LLU~LLLL}}LL}}U~LLU~LLLL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}LL}}U~LLU~LLLL}}LL}}U~LLU~LL!");
    }

    @Test
    public void test06904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06904");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326!!\276\336\266\266~\326\326\276\336\266\266~\326\326!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!" + "'", str2, "\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!");
    }

    @Test
    public void test06905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06905");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!!FFHHFFHHFFHHFFHHFFHHFFHHFFHHFFHH!", "\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253!!\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253!!\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253!!\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253!!\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253!" + "'", str2, "\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253!!\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253!!\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253!!\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253!!\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253!");
    }

    @Test
    public void test06906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06906");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```FHHHnull\275\275!!!```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06907");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06908");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLLLLLLL!!LLLLLLLL!!!", "\275\335\336\340\340\335\336\340\340\335\336\340\340\276\335\336\340\340\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test06909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06909");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!", "U\200\200\200\200]UU\200]UU\200]UU\200]UUU\200\200\200\200]UU\200]UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!" + "'", str2, "!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!!~!!!~!!!~!!!");
    }

    @Test
    public void test06910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06910");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\u0366\u0366nullnull\200\200\u0366\u0366nullnull\200\200\u0366\u0366nullnull\200\200\276\u0366\u0366nullnull\200\200\275\275!", "IJLLIJLL!!IJLLIJLL!!IJLLIJLLIJLLIJLL!!IJLLIJLL!!IJLLIJLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnull\230\230\u0366nullnull\230\230nullnull\230\230nullnull\230\230\u0366nullnull\230\230nullnull\230\230\200\200nullnull\230\230\u0366nullnull\230\230nullnull\230\230nullnull\230\230\u0366nullnull\230\230nullnull\230\230\200\200nullnull\230\230\u0366nullnull\230\230nullnull\230\230nullnull\230\230\u0366nullnull\230\230nullnull\230\230\200\200\276nullnull\230\230\u0366nullnull\230\230nullnull\230\230nullnull\230\230\u0366nullnull\230\230nullnull\230\230\200\200\275\275!" + "'", str2, "\275nullnull\230\230\u0366nullnull\230\230nullnull\230\230nullnull\230\230\u0366nullnull\230\230nullnull\230\230\200\200nullnull\230\230\u0366nullnull\230\230nullnull\230\230nullnull\230\230\u0366nullnull\230\230nullnull\230\230\200\200nullnull\230\230\u0366nullnull\230\230nullnull\230\230nullnull\230\230\u0366nullnull\230\230nullnull\230\230\200\200\276nullnull\230\230\u0366nullnull\230\230nullnull\230\230nullnull\230\230\u0366nullnull\230\230nullnull\230\230\200\200\275\275!");
    }

    @Test
    public void test06911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06911");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128!!!!", "LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!!LLJJLLJJLLJJLLJJLLJJLLJJLLJJLLJJ!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j!!!j!!!j!!!j!!!j!!!j!!!j!!!j!!!!" + "'", str2, "j!!!j!!!j!!!j!!!j!!!j!!!j!!!j!!!!");
    }

    @Test
    public void test06912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06912");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170nullnull!", "\316\316\316\316\236\276\276\316\316\316\316\236\276\276!!\316\316\316\316\236\276\276\316\316\316\316\236\276\276!!\316\316\316\316\236\276\276\316\316\316\316\236\276\276\316\316\316\316\236\276\276\316\316\316\316\236\276\276!!\316\316\316\316\236\276\276\316\316\316\316\236\276\276!!\316\316\316\316\236\276\276\316\316\316\316\236\276\276!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06913");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!!", "}~\200\200}~\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200}~\200\200}~\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~\200\200!~~\200\200~~\200\200~~\200\200!~~\200\200~~\200\200!!~~\200\200!~~\200\200~~\200\200~~\200\200!~~\200\200~~\200\200!!!" + "'", str2, "~~\200\200!~~\200\200~~\200\200~~\200\200!~~\200\200~~\200\200!!~~\200\200!~~\200\200~~\200\200~~\200\200!~~\200\200~~\200\200!!!");
    }

    @Test
    public void test06914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06914");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316\276!\316\316!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull!" + "'", str2, "\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull!");
    }

    @Test
    public void test06915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06915");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULLnullnullnullnullEULLEULLEULL!", "LL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test06916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06916");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN!", "!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!" + "'", str2, "!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!");
    }

    @Test
    public void test06917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06917");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!", "hehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!" + "'", str2, "!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!");
    }

    @Test
    public void test06918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06918");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx!", "NNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06919");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!", "\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225!!\225]\225\225\225]\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!" + "'", str2, "]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!");
    }

    @Test
    public void test06920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06920");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test06921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06921");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("UUXXUUXXXXUUXXUUXXXX!", "}~\200\200}~\200\200LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN}~\200\200}~\200\200LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLNNLLNNNNLLNNLLNNNN!" + "'", str2, "LLNNLLNNNNLLNNLLNNNN!");
    }

    @Test
    public void test06922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06922");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!ULL!ULL!ULL!ULL!ULL!", "]LNLLLNLLLNLLLNLLLNLL]]LNLLLNLL]]LNLLLNLL]]LNLLLNLL]]]LNLLLNLLLNLLLNLLLNLL]]LNLLLNLL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LLL!LLL!LLL!LLL!LLL!" + "'", str2, "!LLL!LLL!LLL!LLL!LLL!");
    }

    @Test
    public void test06923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06923");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226!!~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226!!!", "LNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NNLNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NN!!LNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NNLNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NN!!LNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NNLNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NNLNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NNLNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NN!!LNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NNLNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NN!!LNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NNLNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226!!~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226!!!" + "'", str2, "~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226!!~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226!!!");
    }

    @Test
    public void test06924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06924");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LL!!UULLUULLUULLLL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!UULLUULLUULLLL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!", "LL!!\336`\336\336\336`\336\336\336`\336\336LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\336`\336\336\336`\336\336\336`\336\336LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276!!nullnull\276\276nullnull\276\276nullnull\276\276\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!nullnull\276\276nullnull\276\276nullnull\276\276\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!" + "'", str2, "\276\276!!nullnull\276\276nullnull\276\276nullnull\276\276\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!nullnull\276\276nullnull\276\276nullnull\276\276\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!");
    }

    @Test
    public void test06925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06925");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!", "\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!" + "'", str2, "\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!");
    }

    @Test
    public void test06926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06926");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "~LUUU~~\225\230\230~LUUU~~\225\230\230~LUUU~~\225\230\230~LUUU~~\225\230\230\200}}`~LUUU~~\225\230\230~LUUU~~\225\230\230~LUUU~~\225\230\230~LUUU~~\225\230\230]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348`\230\230\230\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348`\230\230\230\u0348\u0346\u0346!");
    }

    @Test
    public void test06927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06927");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c!", "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06928");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]!", "FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "F]^^F]^^F]^^F]^^F]^^F]^^F]^^F]^^!F]]!F]]F]^^F]^^F]^^F]^^F]^^F]^^F]^^F]^^!F]]!F]]F]^^F]^^F]^^F]^^F]^^F]^^F]^^F]^^!F]]!F]]F]^^F]^^F]^^F]^^F]^^F]^^F]^^F]^^!F]]!F]]F]^^F]^^F]^^F]^^F]^^F]^^F]^^F]^^!F]]!F]]F]^^F]^^F]^^F]^^F]^^F]^^F]^^F]^^!F]]!F]]F]^^F]^^F]^^F]^^F]^^F]^^F]^^F]^^!F]]!F]]F]^^F]^^F]^^F]^^F]^^F]^^F]^^F]^^!F]]!F]]!" + "'", str2, "F]^^F]^^F]^^F]^^F]^^F]^^F]^^F]^^!F]]!F]]F]^^F]^^F]^^F]^^F]^^F]^^F]^^F]^^!F]]!F]]F]^^F]^^F]^^F]^^F]^^F]^^F]^^F]^^!F]]!F]]F]^^F]^^F]^^F]^^F]^^F]^^F]^^F]^^!F]]!F]]F]^^F]^^F]^^F]^^F]^^F]^^F]^^F]^^!F]]!F]]F]^^F]^^F]^^F]^^F]^^F]^^F]^^F]^^!F]]!F]]F]^^F]^^F]^^F]^^F]^^F]^^F]^^F]^^!F]]!F]]F]^^F]^^F]^^F]^^F]^^F]^^F]^^F]^^!F]]!F]]!");
    }

    @Test
    public void test06929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06929");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test06930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06930");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\351\351\352\352\351\351\352\352!!\351\351\352\352\351\351\352\352!!\351\351\352\352\351\351\352\352\351\351\352\352\351\351\352\352!!\351\351\352\352\351\351\352\352!!\351\351\352\352\351\351\352\352!", "\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06931");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0366\u0365\u0368\u0368\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u0346\u0348\u0348!", "\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204\u0346\u0348\u0348!");
    }

    @Test
    public void test06932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06932");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu!", "llllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLLllllllllllllllllllllllllllllllllLLLLLLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0nullnull!" + "'", str2, "\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0nullnull!");
    }

    @Test
    public void test06933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06933");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!", "\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u0317\u031a\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u0317\u031a\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u0317\u031a\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be\u0317\u031a\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!" + "'", str2, "!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!!!!```!");
    }

    @Test
    public void test06934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06934");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!!", "LLLLLUUULUUULUUULUUULLLLLUUULUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!!" + "'", str2, "\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!!");
    }

    @Test
    public void test06935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06935");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~}\200\200~}\200\200UNLLUNLLuuUNLLUNLLuu~}\200\200~}\200\200UNLLUNLLuuUNLLUNLLuu~}\200\200~}\200\200UNLLUNLLuuUNLLUNLLuu~}\200\200~}\200\200UNLLUNLLuuUNLLUNLLuu~}\200\200~}\200\200UNLLUNLLuuUNLLUNLLuu~}\200\200~}\200\200UNLLUNLLuuUNLLUNLLuu~}\200\200~}\200\200UNLLUNLLuuUNLLUNLLuu~}\200\200~}\200\200UNLLUNLLuuUNLLUNLLuu!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200\u0126\u0128\u0128\u0126\u0128\u0128}~\200\200}~\200\200\u0126\u0128\u0128\u0126\u0128\u0128}~\200\200}~\200\200\u0126\u0128\u0128\u0126\u0128\u0128}~\200\200}~\200\200\u0126\u0128\u0128\u0126\u0128\u0128\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200UU\200\200UU\200\200}}UU\200\200UU\200\200}}~}\200\200~}\200\200UU\200\200UU\200\200}}UU\200\200UU\200\200}}~}\200\200~}\200\200UU\200\200UU\200\200}}UU\200\200UU\200\200}}~}\200\200~}\200\200UU\200\200UU\200\200}}UU\200\200UU\200\200}}~}\200\200~}\200\200UU\200\200UU\200\200}}UU\200\200UU\200\200}}~}\200\200~}\200\200UU\200\200UU\200\200}}UU\200\200UU\200\200}}~}\200\200~}\200\200UU\200\200UU\200\200}}UU\200\200UU\200\200}}~}\200\200~}\200\200UU\200\200UU\200\200}}UU\200\200UU\200\200}}!" + "'", str2, "~}\200\200~}\200\200UU\200\200UU\200\200}}UU\200\200UU\200\200}}~}\200\200~}\200\200UU\200\200UU\200\200}}UU\200\200UU\200\200}}~}\200\200~}\200\200UU\200\200UU\200\200}}UU\200\200UU\200\200}}~}\200\200~}\200\200UU\200\200UU\200\200}}UU\200\200UU\200\200}}~}\200\200~}\200\200UU\200\200UU\200\200}}UU\200\200UU\200\200}}~}\200\200~}\200\200UU\200\200UU\200\200}}UU\200\200UU\200\200}}~}\200\200~}\200\200UU\200\200UU\200\200}}UU\200\200UU\200\200}}~}\200\200~}\200\200UU\200\200UU\200\200}}UU\200\200UU\200\200}}!");
    }

    @Test
    public void test06936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06936");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262!", "JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06937");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test06938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06938");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]!", "\200!\200\200\200!\200\200\200!\200\200\200!\200\200\200!\200\200\200!\200\200\200!\200\200\200!\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]!" + "'", str2, "\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]!");
    }

    @Test
    public void test06939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06939");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("lluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUU!", "nullnull]]nullnull]]LnullnullnullLnullnullnullnullnull]]nullnull]]LnullnullnullLnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULL!" + "'", str2, "UULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULL!");
    }

    @Test
    public void test06940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06940");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0!", "!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test06941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06941");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\215\220\220\220\216\220\215\215!", "\u0366\u0365\u0368\u0368U!!!U!!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\220\220\220\216\220\215\215!" + "'", str2, "\215\220\220\220\216\220\215\215!");
    }

    @Test
    public void test06942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06942");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!", "null\340\336\336nullnullnullnull\340\336\336null\340\336\336null\340\336\336null\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336null\340\336\336null\340\336\336null\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnullnull\340\336\336nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!" + "'", str2, "!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!");
    }

    @Test
    public void test06943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06943");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullRRRnullnullnullnullRRRnullnullnullnullRRRnullnullnullnullRRRnullnullnullnullRRRnullnullnullnullRRRnullnullnullnullRRRnullnullnullnullRRR!", "\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e!" + "'", str2, "\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e!");
    }

    @Test
    public void test06944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06944");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!u!", "\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d\u0272\u0272\u0272\u019d\u019d!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u019d!" + "'", str2, "\u019d!");
    }

    @Test
    public void test06945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06945");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("PP!!PP!!!!PP!!PP!!!!PP!!PP!!!!PP!!PP!!!!PP!!PP!!!!PP!!PP!!!!PP!!PP!!!!PP!!PP!!!!!", "`UU!!UU!!UU!!`UU!!UU!!UU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!" + "'", str2, "nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!");
    }

    @Test
    public void test06946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06946");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!!!!]!!!!!!", "x~nullnullx~nullnull!!x~nullnullx~nullnull!!x~nullnullx~nullnullx~nullnullx~nullnull!!x~nullnullx~nullnull!!x~nullnullx~nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!!!!]!!!!!!" + "'", str2, "!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!!!!]!!!!!!");
    }

    @Test
    public void test06947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06947");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("HHHHHHHH!!HHHHHHHH!!HHHHHHHHHHHHHHHH!!HHHHHHHH!!HHHHHHHH!", "\352\356\356\356\352\356\356\356\352\356\356\356\352\356\356\356\200}}`\352\356\356\356\352\356\356\356\352\356\356\356\352\356\356\356]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\316\316\316\316\316\316\316\316!!\316\316\316\316\316\316\316\316!!\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316!!\316\316\316\316\316\316\316\316!!\316\316\316\316\316\316\316\316!" + "'", str2, "\316\316\316\316\316\316\316\316!!\316\316\316\316\316\316\316\316!!\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316!!\316\316\316\316\316\316\316\316!!\316\316\316\316\316\316\316\316!");
    }

    @Test
    public void test06948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06948");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test06949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06949");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LL!!UULLUULLUULLLL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!UULLUULLUULLLL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!LLLLLLLLLLLLLL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LLLLLLLLLLLLLL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!" + "'", str2, "LL!!LLLLLLLLLLLLLL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LLLLLLLLLLLLLL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
    }

    @Test
    public void test06950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06950");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u02bd\u02bd\ua7b2\ua7b2\u02bd\u02bd\ua7b2\ua7b2\ua7b2\ua7b2\u02bd\u02bd\ua7b2\ua7b2\u02bd\u02bd\ua7b2\ua7b2\ua7b2\ua7b2!", "}~\200\200}~\200\200nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06951");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}L\200\200}L\200\200}L\200\200}L\200\200LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU}L\200\200}L\200\200}L\200\200}L\200\200LNUULNUULNUULNUULNUULNUULNUULNUU!", "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}L\200\200}L\200\200}L\200\200}L\200\200LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL}L\200\200}L\200\200}L\200\200}L\200\200LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL!" + "'", str2, "}L\200\200}L\200\200}L\200\200}L\200\200LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL}L\200\200}L\200\200}L\200\200}L\200\200LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL!");
    }

    @Test
    public void test06952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06952");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0366\u0365\u0368\u0368\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u0346\u0348\u0348!", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test06953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06953");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("LL!!!!!LL!!!!!LL!!!!!LL!!!!!LL!!!!!LL!!!!!LL!!!!!LL!!!!!!", "\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!" + "'", str2, "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!");
    }

    @Test
    public void test06954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06954");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!", "UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!ULL!ULLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!ULL!ULLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!ULL!ULLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!ULL!ULLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!ULL!ULLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!ULL!ULLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!ULL!ULLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!ULL!ULL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0196\u019e\u01a0\u01a0\u0348\u0348\u0196\u019e\u01a0\u01a0\u0348\u0348\u0196\u019e\u01a0\u01a0\u0348\u0348\u0196\u019e\u01a0\u01a0\u0348\u0348\u0196\u019e\u01a0\u01a0\u0348\u0348\u0196\u019e\u01a0\u01a0\u0348\u0348\u0196\u019e\u01a0\u01a0\u0348\u0348\u0196\u019e\u01a0\u01a0\u0348\u0348\u0196\u019e\u01a0\u01a0\u0348\u0348\u0196\u019e\u01a0\u01a0\u0348\u0348\u0196\u019e\u01a0\u01a0\u0348\u0348\u0196\u019e\u01a0\u01a0\u0348\u0348!" + "'", str2, "\u0196\u019e\u01a0\u01a0\u0348\u0348\u0196\u019e\u01a0\u01a0\u0348\u0348\u0196\u019e\u01a0\u01a0\u0348\u0348\u0196\u019e\u01a0\u01a0\u0348\u0348\u0196\u019e\u01a0\u01a0\u0348\u0348\u0196\u019e\u01a0\u01a0\u0348\u0348\u0196\u019e\u01a0\u01a0\u0348\u0348\u0196\u019e\u01a0\u01a0\u0348\u0348\u0196\u019e\u01a0\u01a0\u0348\u0348\u0196\u019e\u01a0\u01a0\u0348\u0348\u0196\u019e\u01a0\u01a0\u0348\u0348\u0196\u019e\u01a0\u01a0\u0348\u0348!");
    }

    @Test
    public void test06955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06955");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("efhhefhh!", "]^``]^``!!]^``]^``!!]^``]^``]^``]^``!!]^``]^``!!]^``]^``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06956");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL]]\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL]]\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL]]\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL]]~}}^\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL]]\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL]]\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL]]\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL]]]]!", "`oprroprroprr`oprroprroprr!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullRRRnullRRRnullRRRnullRRRnullRRRnullRRRnullRRRnullRRR]]nullRRRnullRRRnullRRRnullRRRnullRRRnullRRRnullRRRnullRRR]]nullRRRnullRRRnullRRRnullRRRnullRRRnullRRRnullRRRnullRRR]]nullRRRnullRRRnullRRRnullRRRnullRRRnullRRRnullRRRnullRRR]]~}}^nullRRRnullRRRnullRRRnullRRRnullRRRnullRRRnullRRRnullRRR]]nullRRRnullRRRnullRRRnullRRRnullRRRnullRRRnullRRRnullRRR]]nullRRRnullRRRnullRRRnullRRRnullRRRnullRRRnullRRRnullRRR]]nullRRRnullRRRnullRRRnullRRRnullRRRnullRRRnullRRRnullRRR]]]]!" + "'", str2, "nullRRRnullRRRnullRRRnullRRRnullRRRnullRRRnullRRRnullRRR]]nullRRRnullRRRnullRRRnullRRRnullRRRnullRRRnullRRRnullRRR]]nullRRRnullRRRnullRRRnullRRRnullRRRnullRRRnullRRRnullRRR]]nullRRRnullRRRnullRRRnullRRRnullRRRnullRRRnullRRRnullRRR]]~}}^nullRRRnullRRRnullRRRnullRRRnullRRRnullRRRnullRRRnullRRR]]nullRRRnullRRRnullRRRnullRRRnullRRRnullRRRnullRRRnullRRR]]nullRRRnullRRRnullRRRnullRRRnullRRRnullRRRnullRRRnullRRR]]nullRRRnullRRRnullRRRnullRRRnullRRRnullRRRnullRRRnullRRR]]]]!");
    }

    @Test
    public void test06957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06957");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06958");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!", "!\253\256\256]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220!!!" + "'", str2, "\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220!!!");
    }

    @Test
    public void test06959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06959");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!!", "HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!\214\214HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!\214\214HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!\214\214HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!\214\214HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!\214\214HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!\214\214HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!\214\214HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!!!!" + "'", str2, "H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!H!!!H!!!!!!!!");
    }

    @Test
    public void test06960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06960");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!!", "\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!!\226\222\230\230\u0348\u0348\226\222\230\230\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnull!!!!!!!");
    }

    @Test
    public void test06961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06961");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```xxxx```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06962");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\276\276nullnullnullnullnullnullnullnull\276\276nullnullnullnullnullnullnullnull!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\276\276nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "\276\276nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\276\276nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06963");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!", "NNLLLNLLLNLLLNNLLLNLLLNLLLNNLLLNLLLNLLLNNLLLNLLLNLLL\200}}`NNLLLNLLLNLLLNNLLLNLLLNLLLNNLLLNLLLNLLLNNLLLNLLLNLLL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!" + "'", str2, "}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!");
    }

    @Test
    public void test06964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06964");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("RRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnull!", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test06965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06965");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276\200}}`!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276]]!", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\200}}`NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276\200}}`!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276]]!" + "'", str2, "!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276\200}}`!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276]]!");
    }

    @Test
    public void test06966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06966");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u01a0\u0196\u019d\u019dnullnullnullnull!", "\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06967");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\215}\215\215\215}\215\215LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\215}\215\215\215}\215\215!", "UUNNNNUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\215}\215\215\215}\215\215!");
    }

    @Test
    public void test06968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06968");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335\336\336\335\335!", "null\276\276\276null\276\276\276null\276\276\276null\276\276\276null\276\276\276null\276\276\276null\276\276\276null\276\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06969");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("~!!!~!!!~!!!~!!!~!!!~!!!~!!!~!!!!", "!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!!\256null\254\254\256null\254\254!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~!!!~!!!~!!!~!!!~!!!~!!!~!!!~!!!!" + "'", str2, "~!!!~!!!~!!!~!!!~!!!~!!!~!!!~!!!!");
    }

    @Test
    public void test06970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06970");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4\u01d5\u01d7\u01d4\u01d4!!!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test06971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06971");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!", "LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLL!!!LLLL!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test06972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06972");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108\u0126\u0108\u0108\u0108nullnull!!!!!!!", "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe!!!!!!!" + "'", str2, "\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe\u0200\u01fe\u01fe!!!!!!!");
    }

    @Test
    public void test06973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06973");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("`}hhhhhhhh`}hhhhhhhh`}hhhhhhhh`}hhhhhhhh`}hhhhhhhh!", "\335\300\336\336\335\300\336\336\335\300\336\336\335\300\336\336\335\300\336\336\335\300\336\336\335\300\336\336\335\300\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull!" + "'", str2, "`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06974");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullBBnullnullBB!", "\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\200\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e!" + "'", str2, "\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e!");
    }

    @Test
    public void test06975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06975");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```^```^```^```^```^```^```^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL^```^```!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!", "XXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxx!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!" + "'", str2, "^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!");
    }

    @Test
    public void test06976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06976");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126nullnull!!!", "NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLLUNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLL!!UNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLLUNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLL!!UNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLLUNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLL!!UNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLLUNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLL!!UNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLLUNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLL!!UNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLLUNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLL!!UNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLLUNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLL!!UNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLLUNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLL!!!" + "'", str2, "UNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLLUNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLL!!UNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLLUNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLL!!UNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLLUNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLL!!UNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLLUNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLL!!UNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLLUNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLL!!UNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLLUNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLL!!UNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLLUNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLL!!UNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLLUNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLL!!!");
    }

    @Test
    public void test06977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06977");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("U\220LL\200}}`U\220LL]]!", "H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226!!H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226!!H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226!!H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226!!H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]H!]]\230\226\226H!]]\230\226\226!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\220nullnull\200}}`null\220nullnull]]!" + "'", str2, "null\220nullnull\200}}`null\220nullnull]]!");
    }

    @Test
    public void test06978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06978");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200!", "!\220NN\200~~!\220NN\200~~!\220NN!\220NN!\220NN\200~~!\220NN\200~~!\220NN!\220NN!!!\220NN\200~~!\220NN\200~~!\220NN!\220NN!\220NN\200~~!\220NN\200~~!\220NN!\220NN!!!\220NN\200~~!\220NN\200~~!\220NN!\220NN!\220NN\200~~!\220NN\200~~!\220NN!\220NN!\220NN\200~~!\220NN\200~~!\220NN!\220NN!\220NN\200~~!\220NN\200~~!\220NN!\220NN!!!\220NN\200~~!\220NN\200~~!\220NN!\220NN!\220NN\200~~!\220NN\200~~!\220NN!\220NN!!!\220NN\200~~!\220NN\200~~!\220NN!\220NN!\220NN\200~~!\220NN\200~~!\220NN!\220NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~~~~~~~\200\200~~~~~~~~\200\200~~~~~~~~\200\200~~~~~~~~\200\200~~~~~~~~\200\200~~~~~~~~\200\200~~~~~~~~\200\200~~~~~~~~\200\200!" + "'", str2, "~~~~~~~~\200\200~~~~~~~~\200\200~~~~~~~~\200\200~~~~~~~~\200\200~~~~~~~~\200\200~~~~~~~~\200\200~~~~~~~~\200\200~~~~~~~~\200\200!");
    }

    @Test
    public void test06979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06979");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200\u0348\u0346\u0346!", "]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200\u0348\u0346\u0346!");
    }

    @Test
    public void test06980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06980");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!", "\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL\275\276UNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test06981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06981");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!", "nullnullnullnullnullnull!!!!nullnullnullnullnullnull!!!!!!nullnullnullnullnullnull!!!!nullnullnullnullnullnull!!!!!!nullnullnullnullnullnull!!!!nullnullnullnullnullnull!!!!!!nullnullnullnullnullnull!!!!nullnullnullnullnullnull!!!!!!nullnullnullnullnullnull!!!!nullnullnullnullnullnull!!!!!!nullnullnullnullnullnull!!!!nullnullnullnullnullnull!!!!!!nullnullnullnullnullnull!!!!nullnullnullnullnullnull!!!!!!nullnullnullnullnullnull!!!!nullnullnullnullnullnull!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNN!!U!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNN!!U!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNN!!U!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNN!!U!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNN!" + "'", str2, "U!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNN!!U!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNN!!U!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNN!!U!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNN!!U!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNNU!LLU!LLLLNNLLNN!");
    }

    @Test
    public void test06982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06982");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("nullnullnullnullabddabddabddabddnullnullnullnullabddabdd!", "EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test06983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06983");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271~}}^\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271]]!", "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271~}}^\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271]]!" + "'", str2, "\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271~}}^\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271]]!");
    }

    @Test
    public void test06984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06984");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL]]\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL]]\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL]]\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL]]~}}^\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL]]\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL]]\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL]]\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL\336LLL]]]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06985");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("enullnullnull\200}}enullnullnull\200}}enullnullnull\200}}enullnullnull\200}}enullnullnull\200}}enullnullnull\200}}enullnullnull\200}}enullnullnull\200}}!", "TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnull\200}}nullnullnullnullnullnullnullnullnullnullnullnullnull\200}}nullnullnullnullnullnullnullnullnullnullnullnullnull\200}}nullnullnullnullnullnullnullnullnullnullnullnullnull\200}}nullnullnullnullnullnullnullnullnullnullnullnullnull\200}}nullnullnullnullnullnullnullnullnullnullnullnullnull\200}}nullnullnullnullnullnullnullnullnullnullnullnullnull\200}}nullnullnullnullnullnullnullnullnullnullnullnullnull\200}}!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnull\200}}nullnullnullnullnullnullnullnullnullnullnullnullnull\200}}nullnullnullnullnullnullnullnullnullnullnullnullnull\200}}nullnullnullnullnullnullnullnullnullnullnullnullnull\200}}nullnullnullnullnullnullnullnullnullnullnullnullnull\200}}nullnullnullnullnullnullnullnullnullnullnullnullnull\200}}nullnullnullnullnullnullnullnullnullnullnullnullnull\200}}nullnullnullnullnullnullnullnullnullnullnullnullnull\200}}!");
    }

    @Test
    public void test06986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06986");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "\u037e\u037b\u037b\u037e\u037b\u037b\u037e\u037b\u037b\u037e\u037b\u037b\u037e\u037b\u037b\u037e\u037b\u037b\u037e\u037b\u037b\u037e\u037b\u037bnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06987");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("", "UZLLUZLL!!UZLLUZLL!!!!UZLLUZLL!!UZLLUZLL!!!!!!UZLLUZLL!!UZLLUZLL!!!!UZLLUZLL!!UZLLUZLL!!!!!!UZLLUZLL!!UZLLUZLL!!!!UZLLUZLL!!UZLLUZLL!!!!!!UZLLUZLL!!UZLLUZLL!!!!UZLLUZLL!!UZLLUZLL!!!!!!UZLLUZLL!!UZLLUZLL!!!!UZLLUZLL!!UZLLUZLL!!!!!!UZLLUZLL!!UZLLUZLL!!!!UZLLUZLL!!UZLLUZLL!!!!!!UZLLUZLL!!UZLLUZLL!!!!UZLLUZLL!!UZLLUZLL!!!!!!UZLLUZLL!!UZLLUZLL!!!!UZLLUZLL!!UZLLUZLL!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06988");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!!!\253\253\253!\253\253\253!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\253\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\253\u0348\u0346\u0346!");
    }

    @Test
    public void test06989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06989");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!!XX!!XX!!!", "L\204LLL\204LLL\204LLL\204LLLLLLLLLLLLLLLLLLL\204LLL\204LLL\204LLL\204LLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!" + "'", str2, "!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!");
    }

    @Test
    public void test06990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06990");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("!!!!!!!!!!!!!!!!!!", "LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test06991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06991");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!", "!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\246\246\246\246\246\246\246\246!!\246\246\246\246\246\246\246\246!!\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246!!\246\246\246\246\246\246\246\246!!\246\246\246\246\246\246\246\246!" + "'", str2, "\246\246\246\246\246\246\246\246!!\246\246\246\246\246\246\246\246!!\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246!!\246\246\246\246\246\246\246\246!!\246\246\246\246\246\246\246\246!");
    }

    @Test
    public void test06992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06992");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!", "NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test06993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06993");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("", "UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!UUUU!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06994");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\216\216\216\216\276\216\216\216\216\216\216\216\276\276\216\216\216\216\216\276\276\216\216\216\216\216\276\276\216\216\216\216\216\276\276\216\216\216\216\276\216\216\216\216\216\216\216\276\276\216\216\216\216\216\276\276!", "nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\216\216\216\216\276\216\216\216\216\216\216\216\276\276\216\216\216\216\216\276\276\216\216\216\216\216\276\276\216\216\216\216\216\276\276\216\216\216\216\276\216\216\216\216\216\216\216\276\276\216\216\216\216\216\276\276!" + "'", str2, "\216\216\216\216\276\216\216\216\216\216\216\216\276\276\216\216\216\216\216\276\276\216\216\216\216\216\276\276\216\216\216\216\216\276\276\216\216\216\216\276\216\216\216\216\216\216\216\276\276\216\216\216\216\216\276\276!");
    }

    @Test
    public void test06995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06995");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340!", "\u029e\u0346\u0346\ua7b0!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull!" + "'", str2, "\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull!");
    }

    @Test
    public void test06996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06996");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("UL!!UL!!!", "l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230\200}}`l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0256\u0256!!!" + "'", str2, "\u0256\u0256!!!");
    }

    @Test
    public void test06997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06997");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnull\336\336nullnull\336\336!", "\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300\335\336\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\336\335\300\300\336\335\300\300\376\376\336\335\300\300\336\335\300\300\376\376!" + "'", str2, "\336\335\300\300\336\335\300\300\376\376\336\335\300\300\336\335\300\300\376\376!");
    }

    @Test
    public void test06998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06998");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\242nullnull!!\237\237\242nullnull!!\237\237nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\242nullnull!!\237\237\242nullnull!!\237\237nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\242nullnull!!\237\237\242nullnull!!\237\237nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\242nullnull!!\237\237\242nullnull!!\237\237nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\242nullnull!!\237\237\242nullnull!!\237\237nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\242nullnull!!\237\237\242nullnull!!\237\237nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\242nullnull!!\237\237\242nullnull!!\237\237nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\242nullnull!!\237\237\242nullnull!!\237\237!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\242nullnull!!\237\237\242nullnull!!\237\237nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\242nullnull!!\237\237\242nullnull!!\237\237nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\242nullnull!!\237\237\242nullnull!!\237\237nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\242nullnull!!\237\237\242nullnull!!\237\237nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\242nullnull!!\237\237\242nullnull!!\237\237nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\242nullnull!!\237\237\242nullnull!!\237\237nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\242nullnull!!\237\237\242nullnull!!\237\237nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\242nullnull!!\237\237\242nullnull!!\237\237!");
    }

    @Test
    public void test06999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06999");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.encode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "LL``LL``LL``LL``LL``LL``LL``LL``!!LL``LL``LL``LL``LL``LL``LL``LL``!!LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``!!LL``LL``LL``LL``LL``LL``LL``LL``!!LL``LL``LL``LL``LL``LL``LL``LL``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test07000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test07000");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubCipher.decode("\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!", "\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f\u021c\u021d\u021f\u021f!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!" + "'", str2, "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
    }
}
