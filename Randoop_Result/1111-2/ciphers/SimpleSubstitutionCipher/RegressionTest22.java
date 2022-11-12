package ciphers.SimpleSubstitutionCipher;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest22 {

    public static boolean debug = false;

    @Test
    public void test11001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11001");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "nullnullnullnull\362\363\365\365\362\363\365\365\362\363\365\365\362\363\365\365nullnullnullnull\362\363\365\365\362\363\365\365!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11002");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\253\254\256\256\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da!!!\253\254\256\256\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da\u01d7\u01d8\u01da\u01da!!!!", "}~\200\200}~\200\200!^nullnull!^nullnull}~\200\200}~\200\200!^nullnull!^nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\253\254\256\256nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!" + "'", str2, "\253\254\256\256nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\253\254\256\256nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!");
    }

    @Test
    public void test11003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11003");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0178\u0177\u017a\u017a\u0178\u0177\u017a\u017a\u0178\u0177\u017a\u017a\u0346\u0348\u0348!", "\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test11004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11004");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!!LL!", "!\254\214\214!!\214\214!!!\254\214\214!!\214\214!!!!!!!!!!!\254\214\214!!\214\214!!!\254\214\214!!\214\214!!!!!!!!!!!\254\214\214!!\214\214!!!\254\214\214!!\214\214!!!!!!!!!!!\254\214\214!!\214\214!!!\254\214\214!!\214\214!!!!!!!!!!!\254\214\214!!\214\214!!!\254\214\214!!\214\214!!!!!!!!!!!\254\214\214!!\214\214!!!\254\214\214!!\214\214!!!!!!!!!!!\254\214\214!!\214\214!!!\254\214\214!!\214\214!!!!!!!!!!!\254\214\214!!\214\214!!!\254\214\214!!\214\214!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!\254\254!" + "'", str2, "!!!\254\254!");
    }

    @Test
    public void test11005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11005");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a!", "LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043bnullnull!" + "'", str2, "\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043b\u043c\u043e\u043b\u043bnullnull!");
    }

    @Test
    public void test11006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11006");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnull~N\200\200~N\200\200!!!!nullnullnullnull~N\200\200~N\200\200!!!!!!nullnullnullnull~N\200\200~N\200\200!!!!nullnullnullnull~N\200\200~N\200\200!!!!!!nullnullnullnull~N\200\200~N\200\200!!!!nullnullnullnull~N\200\200~N\200\200!!!!!!nullnullnullnull~N\200\200~N\200\200!!!!nullnullnullnull~N\200\200~N\200\200!!!!!!nullnullnullnull~N\200\200~N\200\200!!!!nullnullnullnull~N\200\200~N\200\200!!!!!!nullnullnullnull~N\200\200~N\200\200!!!!nullnullnullnull~N\200\200~N\200\200!!!!!!nullnullnullnull~N\200\200~N\200\200!!!!nullnullnullnull~N\200\200~N\200\200!!!!!!nullnullnullnull~N\200\200~N\200\200!!!!nullnullnullnull~N\200\200~N\200\200!!!!!!!", "\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198nullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200!!!!!!!" + "'", str2, "\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200\u0196\200\200!!!!!!!");
    }

    @Test
    public void test11007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11007");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!", "U!LLU!LL!!U!LLU!LL!!U!LLU!LLU!LLU!LL!!U!LLU!LL!!U!LLU!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!" + "'", str2, "````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!!````!!!````!!!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!````!!!!");
    }

    @Test
    public void test11008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11008");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("UNLLUNLL!!!!UNLLUNLL!", "\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u017c\u017b\u017e\u017e\u017c\u017b\u017e\u017e\u017c\u017b\u017e\u017e\u017c\u017b\u017e\u017e!" + "'", str2, "\u017c\u017b\u017e\u017e\u017c\u017b\u017e\u017e\u017c\u017b\u017e\u017e\u017c\u017b\u017e\u017e!");
    }

    @Test
    public void test11009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11009");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!" + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
    }

    @Test
    public void test11010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11010");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "ORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRRORRRORRRRR!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test11011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11011");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!!", "\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU!!\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU!!\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU!!\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU!!\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU!!\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU!!\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU!!\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU\253\254\256\256NLUUNLUUNLUUNLUUNLUUNLUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!!" + "'", str2, "^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!!");
    }

    @Test
    public void test11012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11012");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254!!!", "!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!!" + "'", str2, "nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!!");
    }

    @Test
    public void test11013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11013");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!tttnullnullnullnull!tttnullnull!", "!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u025e\u025e\u025e\u025e\u025e\u025enullnull!" + "'", str2, "\u025e\u025e\u025e\u025e\u025e\u025enullnull!");
    }

    @Test
    public void test11014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11014");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("`nullnull!!nullnull!!nullnull!!`nullnull!!nullnull!!nullnull!!!", "\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230\200}}`\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!`nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "`nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!`nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test11015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11015");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!!", "ss!!ss!!ssssssssss!!ss!!ssssssssss!!ss!!ssssssssss!!ss!!ssssssssss!!ss!!ssssssssss!!ss!!ssssssssss!!ss!!ssssssssss!!ss!!ssssssss!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!" + "'", str2, "!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!");
    }

    @Test
    public void test11016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11016");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!ULL!ULL!ULL!ULL!ULL!", "\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\336\300\300!\336\300\300!\336\300\300!\336\300\300!\336\300\300!" + "'", str2, "!\336\300\300!\336\300\300!\336\300\300!\336\300\300!\336\300\300!");
    }

    @Test
    public void test11017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11017");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLL!", "null!!!null!!!null!!!null!!!\256\254\254null!!!null!!!null!!!null!!!\256\254\254!!null!!!null!!!null!!!null!!!\256\254\254null!!!null!!!null!!!null!!!\256\254\254!!null!!!null!!!null!!!null!!!\256\254\254null!!!null!!!null!!!null!!!\256\254\254!!null!!!null!!!null!!!null!!!\256\254\254null!!!null!!!null!!!null!!!\256\254\254!!null!!!null!!!null!!!null!!!\256\254\254null!!!null!!!null!!!null!!!\256\254\254!!null!!!null!!!null!!!null!!!\256\254\254null!!!null!!!null!!!null!!!\256\254\254!!null!!!null!!!null!!!null!!!\256\254\254null!!!null!!!null!!!null!!!\256\254\254!!null!!!null!!!null!!!null!!!\256\254\254null!!!null!!!null!!!null!!!\256\254\254!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0238\u0238\u0238\u0238\u0236\u0238\u0238\u0238\u0236\u0238\u0238\u0238\u0238\u0238\u0238\u0238\u0236\u0238\u0238\u0238\u0236\u0238\u0238\u0238\u0238\u0238\u0238\u0238\u0236\u0238\u0238\u0238\u0236\u0238\u0238\u0238\u0238\u0238\u0238\u0238\u0236\u0238\u0238\u0238\u0236\u0238\u0238\u0238\u0238\u0238\u0238\u0238\u0236\u0238\u0238\u0238\u0236\u0238\u0238\u0238\u0238\u0238\u0238\u0238\u0236\u0238\u0238\u0238\u0236\u0238\u0238\u0238\u0238\u0238\u0238\u0238\u0236\u0238\u0238\u0238\u0236\u0238\u0238\u0238\u0238\u0238\u0238\u0238\u0236\u0238\u0238\u0238\u0236\u0238\u0238\u0238!" + "'", str2, "\u0238\u0238\u0238\u0238\u0236\u0238\u0238\u0238\u0236\u0238\u0238\u0238\u0238\u0238\u0238\u0238\u0236\u0238\u0238\u0238\u0236\u0238\u0238\u0238\u0238\u0238\u0238\u0238\u0236\u0238\u0238\u0238\u0236\u0238\u0238\u0238\u0238\u0238\u0238\u0238\u0236\u0238\u0238\u0238\u0236\u0238\u0238\u0238\u0238\u0238\u0238\u0238\u0236\u0238\u0238\u0238\u0236\u0238\u0238\u0238\u0238\u0238\u0238\u0238\u0236\u0238\u0238\u0238\u0236\u0238\u0238\u0238\u0238\u0238\u0238\u0238\u0236\u0238\u0238\u0238\u0236\u0238\u0238\u0238\u0238\u0238\u0238\u0238\u0236\u0238\u0238\u0238\u0236\u0238\u0238\u0238!");
    }

    @Test
    public void test11018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11018");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test11019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11019");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!!", "~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\275UNLL!!\275UNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\275UNLL!!\275UNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\275UNLL!!\275UNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\275UNLL!!\275UNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\275UNLL!!\275UNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\275UNLL!!\275UNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\275UNLL!!\275UNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\275UNLL!!\275UNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\275UNLL!!\275UNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\275UNLL!!\275UNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\275UNLL!!\275UNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\275UNLL!!\275UNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\275UNLL!!\275UNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\275UNLL!!\275UNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\275UNLL!!\275UNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\275UNLL!!\275UNLL!!!" + "'", str2, "!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\275UNLL!!\275UNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\275UNLL!!\275UNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\275UNLL!!\275UNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\275UNLL!!\275UNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\275UNLL!!\275UNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\275UNLL!!\275UNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\275UNLL!!\275UNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\275UNLL!!\275UNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\275UNLL!!\275UNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\275UNLL!!\275UNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\275UNLL!!\275UNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\275UNLL!!\275UNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\275UNLL!!\275UNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\275UNLL!!\275UNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\275UNLL!!\275UNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\275UNLL!!\275UNLL!!!");
    }

    @Test
    public void test11020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11020");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("U!!!U!!!\254\254U!!!U!!!\254\254]]U!!!U!!!\254\254U!!!U!!!\254\254]]\214U!!!U!!!\254\254U!!!U!!!\254\254U!!!U!!!\254\254\214U!!!U!!!\254\254U!!!U!!!\254\254U!!!U!!!\254\254U!!!U!!!\254\254U!!!U!!!\254\254]]U!!!U!!!\254\254U!!!U!!!\254\254]]\214U!!!U!!!\254\254U!!!U!!!\254\254U!!!U!!!\254\254\214U!!!U!!!\254\254U!!!U!!!\254\254U!!!U!!!\254\254!", "}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254]]\214\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\214\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254]]\214\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\214\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254!" + "'", str2, "\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254]]\214\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\214\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254]]\214\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\214\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254\u02c2\u02c2!!!\254\254!");
    }

    @Test
    public void test11021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11021");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\336!!!\336!!!!", "!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!\204\204!!!!!!!!\204\204!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!\204\204!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!!!null!!!!" + "'", str2, "null!!!null!!!!");
    }

    @Test
    public void test11022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11022");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("RRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnull!", "!!!!TTTTTTTT!!TTTTTTTT!!!!TTTTTTTT!!TTTTTTTT!!!!TTTTTTTT!!TTTTTTTT!!!!TTTTTTTT!!TTTTTTTT!!!!TTTTTTTT!!TTTTTTTT!!!!TTTTTTTT!!TTTTTTTT!!!!TTTTTTTT!!TTTTTTTT!!!!TTTTTTTT!!TTTTTTTT!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTT!" + "'", str2, "TT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTTTT!TTT!TTT!");
    }

    @Test
    public void test11023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11023");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("PNNNnull!!PNNNnull!!!", "\u0346\u0348\u0348\u0348NN\214\214UNN\214\214NN\214\214\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullOOOoinullnull!!nullOOOoinullnull!!!" + "'", str2, "nullOOOoinullnull!!nullOOOoinullnull!!!");
    }

    @Test
    public void test11024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11024");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull!", "\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test11025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11025");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330!", "LL]UULLLL]UULLLL]UULLLL]UULL!LL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULL!LL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULL!LL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULL!LL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULL!LL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULL!LL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULL!LL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULL!LL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]!" + "'", str2, "LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]LU]]!");
    }

    @Test
    public void test11026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11026");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!", "\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU\226\230UU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180!" + "'", str2, "\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180!");
    }

    @Test
    public void test11027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11027");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\215}\215\215\215}\215\215LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\215}\215\215\215}\215\215!", "UELLLUEELUEELUEELUEEUELLLUEELUEE!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]\215}\215\215\215}\215\215!");
    }

    @Test
    public void test11028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11028");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\336\340\335\335\336\340\335\335!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test11029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11029");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("TT!!TT!!!", "\276P\275\275\276P\275\275\276P\275\275\276P\275\275\276P\275\275\276P\275\275\276P\275\275\276P\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275!!\275\275!!!" + "'", str2, "\275\275!!\275\275!!!");
    }

    @Test
    public void test11030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11030");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("]\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253]]\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253]]\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253]]\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253]]]\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253]]\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253]]!", "!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253]]\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253]]\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253]]\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253]]]\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253]]\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253]]!" + "'", str2, "]\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253]]\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253]]\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253]]\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253]]]\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253]]\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253]]!");
    }

    @Test
    public void test11031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11031");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("NN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNN!", "\u0366\u0365\u0368\u0368\u016c\u016e\u016b\u016b\u016c\u016e\u016b\u016b\u016c\u016e\u016b\u016b\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test11032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11032");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!eeeeeeeeeeeeeeee!", "\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull!!\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull!!\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull!!\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull!!\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!NNNNNNNNNNNNNNNN!" + "'", str2, "!NNNNNNNNNNNNNNNN!");
    }

    @Test
    public void test11033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11033");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "null]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnullnull]nullnull!null]nullnullnull]nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11034");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU\275\276UU!", "~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL!" + "'", str2, "\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL!");
    }

    @Test
    public void test11035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11035");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\316\316\316\316\316\316\316\316!!\316\316\316\316\316\316\316\316!!\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316\316!!\316\316\316\316\316\316\316\316!!\316\316\316\316\316\316\316\316!", "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u02fa\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0\u01cd\u01ce\u01d0\u01d0!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test11036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11036");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\253~\256\256\253~\256\256!!\253~\256\256\253~\256\256!!\253~\256\256\253~\256\256\253~\256\256\253~\256\256!!\253~\256\256\253~\256\256!!\253~\256\256\253~\256\256!", "``nullnull``nullnull!!``nullnull``nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253~\256\256\253~\256\256!!\253~\256\256\253~\256\256!!\253~\256\256\253~\256\256\253~\256\256\253~\256\256!!\253~\256\256\253~\256\256!!\253~\256\256\253~\256\256!" + "'", str2, "\253~\256\256\253~\256\256!!\253~\256\256\253~\256\256!!\253~\256\256\253~\256\256\253~\256\256\253~\256\256!!\253~\256\256\253~\256\256!!\253~\256\256\253~\256\256!");
    }

    @Test
    public void test11037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11037");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0346\u0348\u0348!", "!!LLLL!!!!!!LLLL!!!!!!!!LLLL!!!!!!LLLL!!!!!!!!LLLL!!!!!!LLLL!!!!!!!!LLLL!!!!!!LLLL!!!!!!!!LLLL!!!!!!LLLL!!!!!!!!LLLL!!!!!!LLLL!!!!!!!!LLLL!!!!!!LLLL!!!!!!!!LLLL!!!!!!LLLL!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test11038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11038");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!!", "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!!" + "'", str2, "LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!LLLLLLLLLLLL!!!!LLLLLLLLLLLL!!!!!!!");
    }

    @Test
    public void test11039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11039");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!LLLLLLLLLLLLLLLL!", "nullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240!" + "'", str2, "\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240!");
    }

    @Test
    public void test11040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11040");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!\253\256\256]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179\u0178\u0179\u0179\u0179!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull]!\225\225\225nullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test11041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11041");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\253\254\256\256\366\367\371\371\366\367\371\371\366\367\371\371\366\367\371\371\253\254\256\256\366\367\371\371\366\367\371\371!", "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02faLIIILIIILIII!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256null\367nullnullnull\367nullnullnull\367nullnullnull\367nullnull\253\254\256\256null\367nullnullnull\367nullnull!" + "'", str2, "\253\254\256\256null\367nullnullnull\367nullnullnull\367nullnullnull\367nullnull\253\254\256\256null\367nullnullnull\367nullnull!");
    }

    @Test
    public void test11042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11042");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220\200null\220\220!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11043");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230\200}}`~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230]]!", "!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~nullnullnullnull~~\225\230\230~nullnullnullnull~~\225\230\230~nullnullnullnull~~\225\230\230~nullnullnullnull~~\225\230\230\200}}`~nullnullnullnull~~\225\230\230~nullnullnullnull~~\225\230\230~nullnullnullnull~~\225\230\230~nullnullnullnull~~\225\230\230]]!" + "'", str2, "~nullnullnullnull~~\225\230\230~nullnullnullnull~~\225\230\230~nullnullnullnull~~\225\230\230~nullnullnullnull~~\225\230\230\200}}`~nullnullnullnull~~\225\230\230~nullnullnullnull~~\225\230\230~nullnullnullnull~~\225\230\230~nullnullnullnull~~\225\230\230]]!");
    }

    @Test
    public void test11044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11044");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230\200}}`l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230]]!", "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\213\213\213\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU\225\230\230L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU\225\230\230L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU\225\230\230L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU\225\230\230\200}}`L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU\225\230\230L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU\225\230\230L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU\225\230\230L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU\225\230\230]]!" + "'", str2, "L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU\225\230\230L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU\225\230\230L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU\225\230\230L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU\225\230\230\200}}`L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU\225\230\230L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU\225\230\230L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU\225\230\230L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU\225\230\230]]!");
    }

    @Test
    public void test11045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11045");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLLLL!!LL!!ULLLULLL!", "\331\332\336\336\331\332\336\336nullnull\331\332\336\336\331\332\336\336nullnull\331\332\336\336\331\332\336\336nullnull\331\332\336\336\331\332\336\336nullnull\331\332\336\336\331\332\336\336nullnull\331\332\336\336\331\332\336\336nullnull\331\332\336\336\331\332\336\336nullnull\331\332\336\336\331\332\336\336nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300!" + "'", str2, "\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300!");
    }

    @Test
    public void test11046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11046");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\276R\266\266~RR\276R\266\266~RR!!\276R\266\266~RR\276R\266\266~RR!!\276R\266\266~RR\276R\266\266~RR\276R\266\266~RR\276R\266\266~RR!!\276R\266\266~RR\276R\266\266~RR!!\276R\266\266~RR\276R\266\266~RR!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!" + "'", str2, "\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!");
    }

    @Test
    public void test11047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11047");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0147\u014a\u014a\u0147\u014a\u014a\u0147\u014a\u014a\u0147\u014a\u014a!!!", "\276\276!!\276\276!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!!" + "'", str2, "null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!!");
    }

    @Test
    public void test11048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11048");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("`NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL`NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!", "XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test11049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11049");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!~~!!~~!!!!~~!!~~!!!!~~!!~~!!~~!!~~!!!!~~!!~~!!!!~~!!~~!", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\200}}`UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~~!!~~!!!!~~!!~~!!!!~~!!~~!!~~!!~~!!!!~~!!~~!!!!~~!!~~!" + "'", str2, "!!~~!!~~!!!!~~!!~~!!!!~~!!~~!!~~!!~~!!!!~~!!~~!!!!~~!!~~!");
    }

    @Test
    public void test11050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11050");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("ab!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!" + "'", str2, "LL!");
    }

    @Test
    public void test11051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11051");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u014b!", "!\264\264\265\265!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!" + "'", str2, "!null!");
    }

    @Test
    public void test11052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11052");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\253\u0210\u0210\u0210\u0348\u0348\253\u0210\u0210\u0210\u0348\u0348!!\253\u0210\u0210\u0210\u0348\u0348\253\u0210\u0210\u0210\u0348\u0348!!\253\u0210\u0210\u0210\u0348\u0348\253\u0210\u0210\u0210\u0348\u0348\253\u0210\u0210\u0210\u0348\u0348\253\u0210\u0210\u0210\u0348\u0348!!\253\u0210\u0210\u0210\u0348\u0348\253\u0210\u0210\u0210\u0348\u0348!!\253\u0210\u0210\u0210\u0348\u0348\253\u0210\u0210\u0210\u0348\u0348!", "\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!" + "'", str2, "\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!");
    }

    @Test
    public void test11053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11053");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}~\200\200}~\200\200\276\271\271\271^\276\271\271\271\276\271\271\271\276\271\271\271^\276\271\271\271\276\271\271\271}~\200\200}~\200\200\276\271\271\271^\276\271\271\271\276\271\271\271\276\271\271\271^\276\271\271\271\276\271\271\271!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200\276\271\271\271^\276\271\271\271\276\271\271\271\276\271\271\271^\276\271\271\271\276\271\271\271}~\200\200}~\200\200\276\271\271\271^\276\271\271\271\276\271\271\271\276\271\271\271^\276\271\271\271\276\271\271\271!" + "'", str2, "}~\200\200}~\200\200\276\271\271\271^\276\271\271\271\276\271\271\271\276\271\271\271^\276\271\271\271\276\271\271\271}~\200\200}~\200\200\276\271\271\271^\276\271\271\271\276\271\271\271\276\271\271\271^\276\271\271\271\276\271\271\271!");
    }

    @Test
    public void test11054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11054");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("anullaaanullaa!!anullaaanullaa!!!", "!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u013b\u013c\u013e\u013e\u013b\u013c\u013e\u013e\u013b\u013c\u013e\u013e\u013b\u013c\u013e\u013enullnull!!!" + "'", str2, "\u013b\u013c\u013e\u013e\u013b\u013c\u013e\u013e\u013b\u013c\u013e\u013e\u013b\u013c\u013e\u013enullnull!!!");
    }

    @Test
    public void test11055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11055");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "\u0366\u0365\u0368\u0368null!!!null!!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11056");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275``NNNNNNNN``NNNNNNNN``NNNNNNNN\276``NNNNNNNN\275\275!", "HH!!HH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull\276``nullnullnullnullnullnullnullnull\275\275!" + "'", str2, "\275``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull\276``nullnullnullnullnullnullnullnull\275\275!");
    }

    @Test
    public void test11057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11057");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0123\u0124\u0126\u0126\u0123\u0124\u0126\u0126nullnull!", "!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull!!UU!!UU!!UU!!UUnullnullnullnull!!UU!!UU!" + "'", str2, "nullnullnullnull!!UU!!UU!!UU!!UUnullnullnullnull!!UU!!UU!");
    }

    @Test
    public void test11058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11058");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\215}\215\215\215}\215\215~LLL~LLL~LLL~LLL\215}\215\215\215}\215\215!", "!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215\u026e\u026e\u026e\u026e\u026e\u026e\u026e\u026e\u026e\u026e\u026e\u026e\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215\u026e\u026e\u026e\u026e\u026e\u026e\u026e\u026e\u026e\u026e\u026e\u026e\215}\215\215\215}\215\215!");
    }

    @Test
    public void test11059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11059");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test11060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11060");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\231\u0346\u0348\u0348!", "U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!U\220~~U\220~~!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\231\220~~~\220~~~\220\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\231\220~~~\220~~~\220\u0346\u0348\u0348!");
    }

    @Test
    public void test11061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11061");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}!", "\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}!" + "'", str2, "}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}!");
    }

    @Test
    public void test11062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11062");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("N^LLN^LLnullnullN^LLN^LLnullnullN^LLN^LLnullnullN^LLN^LLnullnullN^LLN^LLnullnull!", "\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125\u0122\u0123\u0125\u0125nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0122\u0122\u0122\u0122\u0122\u0122\u0122\u0122\u0122\u0122LL!" + "'", str2, "\u0122\u0122\u0122\u0122\u0122\u0122\u0122\u0122\u0122\u0122LL!");
    }

    @Test
    public void test11063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11063");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad\u03aa\u03ab\u03ad\u03ad!", "}~\200\200}~\200\200NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN}~\200\200}~\200\200NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test11064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11064");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU!", "~!~~\225\230\230~!~~\225\230\230~!~~\225\230\230~!~~\225\230\230\200}}`~!~~\225\230\230~!~~\225\230\230~!~~\225\230\230~!~~\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\230\266\266~\230\230\276\230\266\266~\230\230!!\276\230\266\266~\230\230\276\230\266\266~\230\230!!\276\230\266\266~\230\230\276\230\266\266~\230\230\276\230\266\266~\230\230\276\230\266\266~\230\230!!\276\230\266\266~\230\230\276\230\266\266~\230\230!!\276\230\266\266~\230\230\276\230\266\266~\230\230!" + "'", str2, "\276\230\266\266~\230\230\276\230\266\266~\230\230!!\276\230\266\266~\230\230\276\230\266\266~\230\230!!\276\230\266\266~\230\230\276\230\266\266~\230\230\276\230\266\266~\230\230\276\230\266\266~\230\230!!\276\230\266\266~\230\230\276\230\266\266~\230\230!!\276\230\266\266~\230\230\276\230\266\266~\230\230!");
    }

    @Test
    public void test11065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11065");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("X!XXXWWWXWWWXWWWX!XXXWWWXWWWXWWWX!XXXWWWXWWWXWWWX!XXXWWWXWWWXWWWX!XXXWWWXWWWXWWWX!XXXWWWXWWWXWWWX!XXXWWWXWWWXWWWX!XXXWWWXWWWXWWW!", "HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200HFHHHFHH\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H!HHHHHHHHHHHHHHH!HHHHHHHHHHHHHHH!HHHHHHHHHHHHHHH!HHHHHHHHHHHHHHH!HHHHHHHHHHHHHHH!HHHHHHHHHHHHHHH!HHHHHHHHHHHHHHH!HHHHHHHHHHHHHH!" + "'", str2, "H!HHHHHHHHHHHHHHH!HHHHHHHHHHHHHHH!HHHHHHHHHHHHHHH!HHHHHHHHHHHHHHH!HHHHHHHHHHHHHHH!HHHHHHHHHHHHHHH!HHHHHHHHHHHHHHH!HHHHHHHHHHHHHH!");
    }

    @Test
    public void test11066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11066");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0\u03be\u03c0\u03c0\u03c0!", "U!LLL!LLL!LLLU!LLL!LLL!LLLU!LLL!LLL!LLLU!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLLU!LLL!LLL!LLLU!LLL!LLL!LLLU!LLL!LLL!LLLU!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test11067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11067");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}T!!!\200\200}T!!!\200\200}T!!!\200\200}T!!!\200\200T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~}T!!!\200\200}T!!!\200\200}T!!!\200\200}T!!!\200\200T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~!", "nullnullnullnullnullnullnullnullnnnullnullnullnullnullnullnullnullnnnullnullnullnullnullnullnullnullnnnullnullnullnullnullnullnullnullnnnullnullnullnullnullnullnullnullnnnullnullnullnullnullnullnullnullnnnullnullnullnullnullnullnullnullnnnullnullnullnullnullnullnullnullnn!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}L!!!\200\200}L!!!\200\200}L!!!\200\200}L!!!\200\200L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~}L!!!\200\200}L!!!\200\200}L!!!\200\200}L!!!\200\200L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~!" + "'", str2, "}L!!!\200\200}L!!!\200\200}L!!!\200\200}L!!!\200\200L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~}L!!!\200\200}L!!!\200\200}L!!!\200\200}L!!!\200\200L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~!");
    }

    @Test
    public void test11068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11068");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u0178\u0177\u017a\u017a\u0178\u0177\u017a\u017a\u0178\u0177\u017a\u017a\u0346\u0348\u0348!", "!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test11069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11069");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366!" + "'", str2, "\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366\u0346\u0346\u0366\u0366!");
    }

    @Test
    public void test11070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11070");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("}~\200\200}~\200\200\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368}~\200\200}~\200\200\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368}~\200\200}~\200\200\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368!" + "'", str2, "}~\200\200}~\200\200\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368}~\200\200}~\200\200\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368!");
    }

    @Test
    public void test11071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11071");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c\u025c\u025e\u025c\u025c!", "\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01fb\u01fc\u01fe\u01fe\u01de\u01de\u01de\u01de\u01de!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!" + "'", str2, "]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!!]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test11072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11072");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275\275LL\275\275LLL\275LLL\214\214L\275LLL\214\214\275\275LL\275\275LLL\275LLL\214\214L\275LLL\214\214\275\275LL\275\275LLL\275LLL\214\214L\275LLL\214\214\275\275LL\275\275LLL\275LLL\214\214L\275LLL\214\214\275\275LL\275\275LLL\275LLL\214\214L\275LLL\214\214\275\275LL\275\275LLL\275LLL\214\214L\275LLL\214\214\275\275LL\275\275LLL\275LLL\214\214L\275LLL\214\214\275\275LL\275\275LLL\275LLL\214\214L\275LLL\214\214!", "UNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275\u0352\u0352\275\275\u0352\u0352\u0352\275\u0352\u0352\u0352\214\214\u0352\275\u0352\u0352\u0352\214\214\275\275\u0352\u0352\275\275\u0352\u0352\u0352\275\u0352\u0352\u0352\214\214\u0352\275\u0352\u0352\u0352\214\214\275\275\u0352\u0352\275\275\u0352\u0352\u0352\275\u0352\u0352\u0352\214\214\u0352\275\u0352\u0352\u0352\214\214\275\275\u0352\u0352\275\275\u0352\u0352\u0352\275\u0352\u0352\u0352\214\214\u0352\275\u0352\u0352\u0352\214\214\275\275\u0352\u0352\275\275\u0352\u0352\u0352\275\u0352\u0352\u0352\214\214\u0352\275\u0352\u0352\u0352\214\214\275\275\u0352\u0352\275\275\u0352\u0352\u0352\275\u0352\u0352\u0352\214\214\u0352\275\u0352\u0352\u0352\214\214\275\275\u0352\u0352\275\275\u0352\u0352\u0352\275\u0352\u0352\u0352\214\214\u0352\275\u0352\u0352\u0352\214\214\275\275\u0352\u0352\275\275\u0352\u0352\u0352\275\u0352\u0352\u0352\214\214\u0352\275\u0352\u0352\u0352\214\214!" + "'", str2, "\275\275\u0352\u0352\275\275\u0352\u0352\u0352\275\u0352\u0352\u0352\214\214\u0352\275\u0352\u0352\u0352\214\214\275\275\u0352\u0352\275\275\u0352\u0352\u0352\275\u0352\u0352\u0352\214\214\u0352\275\u0352\u0352\u0352\214\214\275\275\u0352\u0352\275\275\u0352\u0352\u0352\275\u0352\u0352\u0352\214\214\u0352\275\u0352\u0352\u0352\214\214\275\275\u0352\u0352\275\275\u0352\u0352\u0352\275\u0352\u0352\u0352\214\214\u0352\275\u0352\u0352\u0352\214\214\275\275\u0352\u0352\275\275\u0352\u0352\u0352\275\u0352\u0352\u0352\214\214\u0352\275\u0352\u0352\u0352\214\214\275\275\u0352\u0352\275\275\u0352\u0352\u0352\275\u0352\u0352\u0352\214\214\u0352\275\u0352\u0352\u0352\214\214\275\275\u0352\u0352\275\275\u0352\u0352\u0352\275\u0352\u0352\u0352\214\214\u0352\275\u0352\u0352\u0352\214\214\275\275\u0352\u0352\275\275\u0352\u0352\u0352\275\u0352\u0352\u0352\214\214\u0352\275\u0352\u0352\u0352\214\214!");
    }

    @Test
    public void test11073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11073");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275!U!!!U!!!U!!\276!U!!\275\275!", "nullnull\214\214nullnull\214\214!!nullnull\214\214nullnull\214\214!!nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214!!nullnull\214\214nullnull\214\214!!nullnull\214\214nullnull\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!\274!!!\274!!!\274!!\276!\274!!\275\275!" + "'", str2, "\275!\274!!!\274!!!\274!!\276!\274!!\275\275!");
    }

    @Test
    public void test11074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11074");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230\200}}`\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230]]!", "!LLLnullnullnull\256\254\254!LLLnullnullnull\256\254\254!!!LLLnullnullnull\256\254\254!LLLnullnullnull\256\254\254!!!LLLnullnullnull\256\254\254!LLLnullnullnull\256\254\254!!!LLLnullnullnull\256\254\254!LLLnullnullnull\256\254\254!!!LLLnullnullnull\256\254\254!LLLnullnullnull\256\254\254!!!LLLnullnullnull\256\254\254!LLLnullnullnull\256\254\254!!!LLLnullnullnull\256\254\254!LLLnullnullnull\256\254\254!!!LLLnullnullnull\256\254\254!LLLnullnullnull\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230\200}}`\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230]]!" + "'", str2, "\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230\200}}`\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\253\225\230\230]]!");
    }

    @Test
    public void test11075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11075");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!!" + "'", str2, "nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!!");
    }

    @Test
    public void test11076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11076");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!", "{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!|!~~|!~~!!|!~~|!~~!!!!|!~~|!~~!!|!~~|!~~!!!!|!~~|!~~!!|!~~|!~~!!!!|!~~|!~~!!|!~~|!~~!!!!|!~~|!~~!!|!~~|!~~!!!!|!~~|!~~!!|!~~|!~~!!!!|!~~|!~~!!|!~~|!~~!!!!|!~~|!~~!!|!~~|!~~!" + "'", str2, "!!!!|!~~|!~~!!|!~~|!~~!!!!|!~~|!~~!!|!~~|!~~!!!!|!~~|!~~!!|!~~|!~~!!!!|!~~|!~~!!|!~~|!~~!!!!|!~~|!~~!!|!~~|!~~!!!!|!~~|!~~!!|!~~|!~~!!!!|!~~|!~~!!|!~~|!~~!!!!|!~~|!~~!!|!~~|!~~!");
    }

    @Test
    public void test11077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11077");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\200}}`!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!]]!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\200}}`!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!]]!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\200}}`!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!]]!");
    }

    @Test
    public void test11078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11078");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\220\220NN]]NN]]\253\253\253\200}}`\220\220NN]]NN]]\253\253\253]]!", "FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220nullnull]]nullnull]]\253\253\253\200}}`\220\220nullnull]]nullnull]]\253\253\253]]!" + "'", str2, "\220\220nullnull]]nullnull]]\253\253\253\200}}`\220\220nullnull]]nullnull]]\253\253\253]]!");
    }

    @Test
    public void test11079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11079");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\276\276\300\300\276\276\300\300\276\276\300\300\276\276\300\300\276\276\300\300!", "UU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUU!!UU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUU!!UU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUU!!UU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUU!!UU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276nullnull\276\276nullnull\276\276nullnull\276\276nullnull\276\276nullnull!" + "'", str2, "\276\276nullnull\276\276nullnull\276\276nullnull\276\276nullnull\276\276nullnull!");
    }

    @Test
    public void test11080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11080");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214!", "]LNLLLNLLLNLLLNLLLNLL]]LNLLLNLL]]LNLLLNLL]]LNLLLNLL]]]LNLLLNLLLNLLLNLLLNLL]]LNLLLNLL]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLnullL\214\214nullL\214\214LLLLLLLLnullL\214\214nullL\214\214LLLLLLLLnullL\214\214nullL\214\214LLLLLLLLnullL\214\214nullL\214\214LLLLLLLLnullL\214\214nullL\214\214LLLLLLLLnullL\214\214nullL\214\214LLLLLLLLnullL\214\214nullL\214\214LLLLLLLLnullL\214\214nullL\214\214!" + "'", str2, "LLLLLLLLnullL\214\214nullL\214\214LLLLLLLLnullL\214\214nullL\214\214LLLLLLLLnullL\214\214nullL\214\214LLLLLLLLnullL\214\214nullL\214\214LLLLLLLLnullL\214\214nullL\214\214LLLLLLLLnullL\214\214nullL\214\214LLLLLLLLnullL\214\214nullL\214\214LLLLLLLLnullL\214\214nullL\214\214!");
    }

    @Test
    public void test11081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11081");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("null]]]null]]]!", "\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull\215\216\230\230nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLL]]]UNLL]]]!" + "'", str2, "UNLL]]]UNLL]]]!");
    }

    @Test
    public void test11082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11082");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!", "\276\300\266\266~\300\300\276\300\266\266~\300\300!!\276\300\266\266~\300\300\276\300\266\266~\300\300!!\276\300\266\266~\300\300\276\300\266\266~\300\300\276\300\266\266~\300\300\276\300\266\266~\300\300!!\276\300\266\266~\300\300\276\300\266\266~\300\300!!\276\300\266\266~\300\300\276\300\266\266~\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test11083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11083");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac!", "!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL!" + "'", str2, "^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL!");
    }

    @Test
    public void test11084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11084");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108\u0105\u0108\u0108\u0108!", "\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348\u0346\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test11085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11085");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368LL!!\213\213\213\u0346\u0348\u0348!", "nullOOOoinullnull!!nullOOOoinullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368LL!!\213\213\213\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368LL!!\213\213\213\u0346\u0348\u0348!");
    }

    @Test
    public void test11086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11086");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull!!\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull!!\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull!!\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull!!\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnull!", "NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!NULLNULL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL!!\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL!!\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL!!\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL!!\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL!" + "'", str2, "\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL!!\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL!!\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL!!\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL!!\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL\204\204ULLLULLL!");
    }

    @Test
    public void test11087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11087");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!", "\u014f\u014d\u0151\u0151\u014f\u014d\u0151\u0151\u014f\u014d\u0151\u0151\u014f\u014d\u0151\u0151\u014f\u014d\u0151\u0151\u014f\u014d\u0151\u0151\u014f\u014d\u0151\u0151\u014f\u014d\u0151\u0151\u014f\u014d\u0151\u0151\u014f\u014d\u0151\u0151\u014f\u014d\u0151\u0151\u014f\u014d\u0151\u0151nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014eLL!" + "'", str2, "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014eLL!");
    }

    @Test
    public void test11088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11088");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LL``LL``LL``LL``LL``LL``LL``LL``!!LL``LL``LL``LL``LL``LL``LL``LL``!!LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``!!LL``LL``LL``LL``LL``LL``LL``LL``!!LL``LL``LL``LL``LL``LL``LL``LL``!", "\367!UNLLUNLL\367!UNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!" + "'", str2, "!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!");
    }

    @Test
    public void test11089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11089");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "\u0366\u0365\u0368\u0368\215\215!!\215\215!!\215\215!!\215\215!!\213\213\213\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test11090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11090");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LLnull!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LLnull!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LLnull!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LLnull!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!", "\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnullnullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test11091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11091");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("}~\200\200}~\200\200!]!!!!!^!]!!!!!!]!!!!!!]!!!!!^!]!!!!!!]!!!!!}~\200\200}~\200\200!]!!!!!^!]!!!!!!]!!!!!!]!!!!!^!]!!!!!!]!!!!!!", "\335\336\336\336\335\336\336\336!!\335\336\336\336\335\336\336\336!!\335\336\336\336\335\336\336\336!!\335\336\336\336\335\336\336\336!!\335\336\336\336\335\336\336\336!!\335\336\336\336\335\336\336\336!!\335\336\336\336\335\336\336\336!!\335\336\336\336\335\336\336\336!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200!]!!!!!^!]!!!!!!]!!!!!!]!!!!!^!]!!!!!!]!!!!!}~\200\200}~\200\200!]!!!!!^!]!!!!!!]!!!!!!]!!!!!^!]!!!!!!]!!!!!!" + "'", str2, "}~\200\200}~\200\200!]!!!!!^!]!!!!!!]!!!!!!]!!!!!^!]!!!!!!]!!!!!}~\200\200}~\200\200!]!!!!!^!]!!!!!!]!!!!!!]!!!!!^!]!!!!!!]!!!!!!");
    }

    @Test
    public void test11092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11092");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!!!!!!!!!", "U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!U\273\273\273\273UULL\270\270\273UULL\270\270!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!!!" + "'", str2, "!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!!!!!!!!!");
    }

    @Test
    public void test11093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11093");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0346\u0346\u013e\u0346\u0346\u0346\u0346\u0346\u0346\u013e\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u013e\u0346\u0346\u0346\u0346\u0346\u0346\u013e\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u013e\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u013e\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u013e\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u013e\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u013e\u0346\u0346\u0346\u0346\u0346\u0346\u013e\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u013e\u0346\u0346\u0346\u0346\u0346\u0346\u013e\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!", "UALLUALLAAAAAAAAUALLUALLAAAAAAAAUALLUALLAAAAAAAAUALLUALLAAAAAAAAUALLUALLAAAAAAAAUALLUALLAAAAAAAAUALLUALLAAAAAAAAUALLUALLAAAAAAAA!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!" + "'", str2, "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!");
    }

    @Test
    public void test11094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11094");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("L]LLL]LL!!L]LLL]LL!!L]LLL]LLL]LLL]LL!!L]LLL]LL!!L]LLL]LL!", "]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!]]!!]]!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]]]]]]]!!]]]]]]]]!!]]]]]]]]]]]]]]]]!!]]]]]]]]!!]]]]]]]]!" + "'", str2, "]]]]]]]]!!]]]]]]]]!!]]]]]]]]]]]]]]]]!!]]]]]]]]!!]]]]]]]]!");
    }

    @Test
    public void test11095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11095");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test11096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11096");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!nullnullnullnullnullnullnull\256\254\254nullnullnullnullnullnullnull\256\254\254!!!", "LNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUNNUUNNUUNNUUNNUUNNUUNNUUNN\256\254\254UUNNUUNNUUNNUUNNUUNNUUNNUUNN\256\254\254!!UUNNUUNNUUNNUUNNUUNNUUNNUUNN\256\254\254UUNNUUNNUUNNUUNNUUNNUUNNUUNN\256\254\254!!UUNNUUNNUUNNUUNNUUNNUUNNUUNN\256\254\254UUNNUUNNUUNNUUNNUUNNUUNNUUNN\256\254\254!!UUNNUUNNUUNNUUNNUUNNUUNNUUNN\256\254\254UUNNUUNNUUNNUUNNUUNNUUNNUUNN\256\254\254!!UUNNUUNNUUNNUUNNUUNNUUNNUUNN\256\254\254UUNNUUNNUUNNUUNNUUNNUUNNUUNN\256\254\254!!UUNNUUNNUUNNUUNNUUNNUUNNUUNN\256\254\254UUNNUUNNUUNNUUNNUUNNUUNNUUNN\256\254\254!!UUNNUUNNUUNNUUNNUUNNUUNNUUNN\256\254\254UUNNUUNNUUNNUUNNUUNNUUNNUUNN\256\254\254!!UUNNUUNNUUNNUUNNUUNNUUNNUUNN\256\254\254UUNNUUNNUUNNUUNNUUNNUUNNUUNN\256\254\254!!!" + "'", str2, "UUNNUUNNUUNNUUNNUUNNUUNNUUNN\256\254\254UUNNUUNNUUNNUUNNUUNNUUNNUUNN\256\254\254!!UUNNUUNNUUNNUUNNUUNNUUNNUUNN\256\254\254UUNNUUNNUUNNUUNNUUNNUUNNUUNN\256\254\254!!UUNNUUNNUUNNUUNNUUNNUUNNUUNN\256\254\254UUNNUUNNUUNNUUNNUUNNUUNNUUNN\256\254\254!!UUNNUUNNUUNNUUNNUUNNUUNNUUNN\256\254\254UUNNUUNNUUNNUUNNUUNNUUNNUUNN\256\254\254!!UUNNUUNNUUNNUUNNUUNNUUNNUUNN\256\254\254UUNNUUNNUUNNUUNNUUNNUUNNUUNN\256\254\254!!UUNNUUNNUUNNUUNNUUNNUUNNUUNN\256\254\254UUNNUUNNUUNNUUNNUUNNUUNNUUNN\256\254\254!!UUNNUUNNUUNNUUNNUUNNUUNNUUNN\256\254\254UUNNUUNNUUNNUUNNUUNNUUNNUUNN\256\254\254!!UUNNUUNNUUNNUUNNUUNNUUNNUUNN\256\254\254UUNNUUNNUUNNUUNNUUNNUUNNUUNN\256\254\254!!!");
    }

    @Test
    public void test11097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11097");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}~\200\200}~\200\200!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335}~\200\200}~\200\200!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335!\335\335\335!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull}~\200\200}~\200\200!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!" + "'", str2, "}~\200\200}~\200\200!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull}~\200\200}~\200\200!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
    }

    @Test
    public void test11098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11098");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7\u01c7!!!", "\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a\u0318\u031a\u031a!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`nullnull!!nullnull!!nullnull!!`nullnull!!nullnull!!nullnull!!!" + "'", str2, "`nullnull!!nullnull!!nullnull!!`nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test11099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11099");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("`\253```\253\u035e\u035e`\253```\253\u035e\u035e!!!!`\253```\253\u035e\u035e`\253```\253\u035e\u035e!", "``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230\200}}```]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`\253```\253\u035e\u035e`\253```\253\u035e\u035e!!!!`\253```\253\u035e\u035e`\253```\253\u035e\u035e!" + "'", str2, "`\253```\253\u035e\u035e`\253```\253\u035e\u035e!!!!`\253```\253\u035e\u035e`\253```\253\u035e\u035e!");
    }

    @Test
    public void test11100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11100");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!", "llllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLLllllllllLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!" + "'", str2, "!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!");
    }

    @Test
    public void test11101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11101");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("}null!!!\200\200}null!!!\200\200}null!!!\200\200}null!!!\200\200null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~}null!!!\200\200}null!!!\200\200}null!!!\200\200}null!!!\200\200null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~!", "\u0366\u0365\u0368\u0368vv!!vv!!!!vv!!vv!!!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}nullnullnullnull!!!\200\200}nullnullnullnull!!!\200\200}nullnullnullnull!!!\200\200}nullnullnullnull!!!\200\200nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~}nullnullnullnull!!!\200\200}nullnullnullnull!!!\200\200}nullnullnullnull!!!\200\200}nullnullnullnull!!!\200\200nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~!" + "'", str2, "}nullnullnullnull!!!\200\200}nullnullnullnull!!!\200\200}nullnullnullnull!!!\200\200}nullnullnullnull!!!\200\200nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~}nullnullnullnull!!!\200\200}nullnullnullnull!!!\200\200}nullnullnullnull!!!\200\200}nullnullnullnull!!!\200\200nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~nullnullnullnull!~~!");
    }

    @Test
    public void test11102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11102");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11103");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\u017c\u017b\u017e\u017e\u017c\u017b\u017e\u017e\u017c\u017b\u017e\u017e\u017c\u017b\u017e\u017e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test11104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11104");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("P!nullnullP!nullnull!!P!nullnullP!nullnull!!P!nullnullP!nullnullP!nullnullP!nullnull!!P!nullnullP!nullnull!!P!nullnullP!nullnull!", "\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\200\200!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b!" + "'", str2, "\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b\u038b!");
    }

    @Test
    public void test11105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11105");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``!" + "'", str2, "^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``!");
    }

    @Test
    public void test11106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11106");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("lluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUU!", "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368^^``^^``^^!" + "'", str2, "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368^^``^^``^^!");
    }

    @Test
    public void test11107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11107");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031anullnullnullnullnullnullnullnull!", "LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031aNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!" + "'", str2, "\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031aNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!");
    }

    @Test
    public void test11108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11108");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}~\200\200}~\200\200LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL}~\200\200}~\200\200LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!", "TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!}~\200\200}~\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "}~\200\200}~\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!}~\200\200}~\200\200!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test11109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11109");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!", "nullnullLULLLULLLULLLULLnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!L!LLL!LLL!LLL!LL!!!L!LLL!LLL!LLL!LL!!!!!L!LLL!LLL!LLL!LL!!!L!LLL!LLL!LLL!LL!!!!!L!LLL!LLL!LLL!LL!!!L!LLL!LLL!LLL!LL!!!!!L!LLL!LLL!LLL!LL!!!L!LLL!LLL!LLL!LL!!!!!L!LLL!LLL!LLL!LL!!!L!LLL!LLL!LLL!LL!!!!!L!LLL!LLL!LLL!LL!!!L!LLL!LLL!LLL!LL!!!!!L!LLL!LLL!LLL!LL!!!L!LLL!LLL!LLL!LL!!!!!L!LLL!LLL!LLL!LL!!!L!LLL!LLL!LLL!LL!!!!!" + "'", str2, "!L!LLL!LLL!LLL!LL!!!L!LLL!LLL!LLL!LL!!!!!L!LLL!LLL!LLL!LL!!!L!LLL!LLL!LLL!LL!!!!!L!LLL!LLL!LLL!LL!!!L!LLL!LLL!LLL!LL!!!!!L!LLL!LLL!LLL!LL!!!L!LLL!LLL!LLL!LL!!!!!L!LLL!LLL!LLL!LL!!!L!LLL!LLL!LLL!LL!!!!!L!LLL!LLL!LLL!LL!!!L!LLL!LLL!LLL!LL!!!!!L!LLL!LLL!LLL!LL!!!L!LLL!LLL!LLL!LL!!!!!L!LLL!LLL!LLL!LL!!!L!LLL!LLL!LLL!LL!!!!!");
    }

    @Test
    public void test11110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11110");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("null\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnullnull\216\254\254null\216\254\254nullnullnullnullnullnullnullnull!", "!\220!!!\220!!^^\225\230\230!\220!!!\220!!^^\225\230\230!\220!!!\220!!^^\225\230\230!\220!!!\220!!^^\225\230\230\200}}`!\220!!!\220!!^^\225\230\230!\220!!!\220!!^^\225\230\230!\220!!!\220!!^^\225\230\230!\220!!!\220!!^^\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!" + "'", str2, "!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!\216\254\254!\200!!\216\254\254!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!\200!!!");
    }

    @Test
    public void test11111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11111");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\253\253\253\200\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\253\253\253]]!", "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8nullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLLnullnullnullUNLLnullnullnullUNLLnullnullnullUNLLnullnullnull\253\253\253\200}}`UNLLnullnullnullUNLLnullnullnullUNLLnullnullnullUNLLnullnullnull\253\253\253]]!" + "'", str2, "UNLLnullnullnullUNLLnullnullnullUNLLnullnullnullUNLLnullnullnull\253\253\253\200}}`UNLLnullnullnullUNLLnullnullnullUNLLnullnullnullUNLLnullnullnull\253\253\253]]!");
    }

    @Test
    public void test11112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11112");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LL]LLLLLL]LLLLLL]LLLLLL]LLLL!LL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLL!LL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLL!LL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLL!LL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLL!LL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLL!LL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLL!LL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLL!LL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLL!", "LUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUU\200}}`LUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUULUUU]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UU]UUUUUU]UUUUUU]UUUUUU]UUUU!UU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUU!UU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUU!UU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUU!UU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUU!UU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUU!UU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUU!UU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUU!UU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUU!" + "'", str2, "UU]UUUUUU]UUUUUU]UUUUUU]UUUU!UU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUU!UU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUU!UU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUU!UU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUU!UU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUU!UU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUU!UU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUU!UU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUU!");
    }

    @Test
    public void test11113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11113");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "T!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TT!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11114");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u021e\u021e\u021e\u021e\u021e\u021e\u021e\u021e!!!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!" + "'", str2, "!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!");
    }

    @Test
    public void test11115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11115");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("null!\272\272null!\272\272!\272\272\272!\272\272\272null!\272\272null!\272\272!\272\272\272!\272\272\272!!null!\272\272null!\272\272!\272\272\272!\272\272\272null!\272\272null!\272\272!\272\272\272!\272\272\272!!null!\272\272null!\272\272!\272\272\272!\272\272\272null!\272\272null!\272\272!\272\272\272!\272\272\272null!\272\272null!\272\272!\272\272\272!\272\272\272null!\272\272null!\272\272!\272\272\272!\272\272\272!!null!\272\272null!\272\272!\272\272\272!\272\272\272null!\272\272null!\272\272!\272\272\272!\272\272\272!!null!\272\272null!\272\272!\272\272\272!\272\272\272null!\272\272null!\272\272!\272\272\272!\272\272\272!", "``nnnnnnnn``nnnnnnnn``nnnnnnnn``nnnnnnnn``nnnnnnnn``nnnnnnnn``nnnnnnnn``nnnnnnnn!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNN!nullnullNNNN!nullnull!nullnullnull!nullnullnullNNNN!nullnullNNNN!nullnull!nullnullnull!nullnullnull!!NNNN!nullnullNNNN!nullnull!nullnullnull!nullnullnullNNNN!nullnullNNNN!nullnull!nullnullnull!nullnullnull!!NNNN!nullnullNNNN!nullnull!nullnullnull!nullnullnullNNNN!nullnullNNNN!nullnull!nullnullnull!nullnullnullNNNN!nullnullNNNN!nullnull!nullnullnull!nullnullnullNNNN!nullnullNNNN!nullnull!nullnullnull!nullnullnull!!NNNN!nullnullNNNN!nullnull!nullnullnull!nullnullnullNNNN!nullnullNNNN!nullnull!nullnullnull!nullnullnull!!NNNN!nullnullNNNN!nullnull!nullnullnull!nullnullnullNNNN!nullnullNNNN!nullnull!nullnullnull!nullnullnull!" + "'", str2, "NNNN!nullnullNNNN!nullnull!nullnullnull!nullnullnullNNNN!nullnullNNNN!nullnull!nullnullnull!nullnullnull!!NNNN!nullnullNNNN!nullnull!nullnullnull!nullnullnullNNNN!nullnullNNNN!nullnull!nullnullnull!nullnullnull!!NNNN!nullnullNNNN!nullnull!nullnullnull!nullnullnullNNNN!nullnullNNNN!nullnull!nullnullnull!nullnullnullNNNN!nullnullNNNN!nullnull!nullnullnull!nullnullnullNNNN!nullnullNNNN!nullnull!nullnullnull!nullnullnull!!NNNN!nullnullNNNN!nullnull!nullnullnull!nullnullnullNNNN!nullnullNNNN!nullnull!nullnullnull!nullnullnull!!NNNN!nullnullNNNN!nullnull!nullnullnull!nullnullnullNNNN!nullnullNNNN!nullnull!nullnullnull!nullnullnull!");
    }

    @Test
    public void test11116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11116");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!!", "LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\261\262\264\264LL~~LL~~!!!!\261\262\264\264LL~~LL~~!!!!!!\261\262\264\264LL~~LL~~!!!!\261\262\264\264LL~~LL~~!!!!!!\261\262\264\264LL~~LL~~!!!!\261\262\264\264LL~~LL~~!!!!!!\261\262\264\264LL~~LL~~!!!!\261\262\264\264LL~~LL~~!!!!!!\261\262\264\264LL~~LL~~!!!!\261\262\264\264LL~~LL~~!!!!!!\261\262\264\264LL~~LL~~!!!!\261\262\264\264LL~~LL~~!!!!!!\261\262\264\264LL~~LL~~!!!!\261\262\264\264LL~~LL~~!!!!!!\261\262\264\264LL~~LL~~!!!!\261\262\264\264LL~~LL~~!!!!!!!" + "'", str2, "\261\262\264\264LL~~LL~~!!!!\261\262\264\264LL~~LL~~!!!!!!\261\262\264\264LL~~LL~~!!!!\261\262\264\264LL~~LL~~!!!!!!\261\262\264\264LL~~LL~~!!!!\261\262\264\264LL~~LL~~!!!!!!\261\262\264\264LL~~LL~~!!!!\261\262\264\264LL~~LL~~!!!!!!\261\262\264\264LL~~LL~~!!!!\261\262\264\264LL~~LL~~!!!!!!\261\262\264\264LL~~LL~~!!!!\261\262\264\264LL~~LL~~!!!!!!\261\262\264\264LL~~LL~~!!!!\261\262\264\264LL~~LL~~!!!!!!\261\262\264\264LL~~LL~~!!!!\261\262\264\264LL~~LL~~!!!!!!!");
    }

    @Test
    public void test11117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11117");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("NLLLNULLNULLNULLNULLNLLLNULLNULL!", "]nullnull!!nullnull!!nullnull!!\200}}`]nullnull!!nullnull!!nullnull!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}\200\200\200}~\200\200}~\200\200}~\200\200}~\200\200}\200\200\200}~\200\200}~\200\200!" + "'", str2, "}\200\200\200}~\200\200}~\200\200}~\200\200}~\200\200}\200\200\200}~\200\200}~\200\200!");
    }

    @Test
    public void test11118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11118");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196!", "\u0366\u0365\u0368\u0368\335\336\340\340nullnullnull\335\336\340\340nullnullnull!!\335\336\340\340nullnullnull\335\336\340\340nullnullnull!!\335\336\340\340nullnullnull\335\336\340\340nullnullnull!!\335\336\340\340nullnullnull\335\336\340\340\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnull!" + "'", str2, "LLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnullLLUU!nullnull!");
    }

    @Test
    public void test11119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11119");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11120");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0nullnull!", "}~\200\200}~\200\200U^LLU^LL}~\200\200}~\200\200U^LLU^LL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null}\200\200nullnull}\200\200null}\200\200null}\200\200nullnull}\200\200null}\200\200null}\200\200nullnull}\200\200null}\200\200null}\200\200nullnull}\200\200null}\200\200null}\200\200nullnull}\200\200null}\200\200null}\200\200nullnull}\200\200null}\200\200null}\200\200nullnull}\200\200null}\200\200null}\200\200nullnull}\200\200null}\200\200null}\200\200nullnull}\200\200null}\200\200null}\200\200nullnull}\200\200null}\200\200null}\200\200nullnull}\200\200null}\200\200null}\200\200nullnull}\200\200null}\200\200null}\200\200nullnull}\200\200null}\200\200null}\200\200nullnull}\200\200null}\200\200null}\200\200nullnull}\200\200null}\200\200null}\200\200nullnull}\200\200null}\200\200null}\200\200nullnull}\200\200null}\200\200null}\200\200nullnull}\200\200null}\200\200null}\200\200nullnull}\200\200null}\200\200null}\200\200nullnull}\200\200null}\200\200!" + "'", str2, "null}\200\200nullnull}\200\200null}\200\200null}\200\200nullnull}\200\200null}\200\200null}\200\200nullnull}\200\200null}\200\200null}\200\200nullnull}\200\200null}\200\200null}\200\200nullnull}\200\200null}\200\200null}\200\200nullnull}\200\200null}\200\200null}\200\200nullnull}\200\200null}\200\200null}\200\200nullnull}\200\200null}\200\200null}\200\200nullnull}\200\200null}\200\200null}\200\200nullnull}\200\200null}\200\200null}\200\200nullnull}\200\200null}\200\200null}\200\200nullnull}\200\200null}\200\200null}\200\200nullnull}\200\200null}\200\200null}\200\200nullnull}\200\200null}\200\200null}\200\200nullnull}\200\200null}\200\200null}\200\200nullnull}\200\200null}\200\200null}\200\200nullnull}\200\200null}\200\200null}\200\200nullnull}\200\200null}\200\200null}\200\200nullnull}\200\200null}\200\200null}\200\200nullnull}\200\200null}\200\200!");
    }

    @Test
    public void test11121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11121");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("]!\253\253]!\253\253!!]!\253\253]!\253\253!!!", "nullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!\253\253]!\253\253!!]!\253\253]!\253\253!!!" + "'", str2, "]!\253\253]!\253\253!!]!\253\253]!\253\253!!!");
    }

    @Test
    public void test11122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11122");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\276V\275\275\276V\275\275\276V\275\275\276V\275\275\276V\275\275\276V\275\275\276V\275\275\276V\275\275!", "````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276`\275\275\276`\275\275\276`\275\275\276`\275\275\276`\275\275\276`\275\275\276`\275\275\276`\275\275!" + "'", str2, "\276`\275\275\276`\275\275\276`\275\275\276`\275\275\276`\275\275\276`\275\275\276`\275\275\276`\275\275!");
    }

    @Test
    public void test11123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11123");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!!", "nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLUULLUULLUULLUU\256\254\254LLUULLUULLUULLUU\256\254\254!!LLUULLUULLUULLUU\256\254\254LLUULLUULLUULLUU\256\254\254!!LLUULLUULLUULLUU\256\254\254LLUULLUULLUULLUU\256\254\254!!LLUULLUULLUULLUU\256\254\254LLUULLUULLUULLUU\256\254\254!!LLUULLUULLUULLUU\256\254\254LLUULLUULLUULLUU\256\254\254!!LLUULLUULLUULLUU\256\254\254LLUULLUULLUULLUU\256\254\254!!LLUULLUULLUULLUU\256\254\254LLUULLUULLUULLUU\256\254\254!!LLUULLUULLUULLUU\256\254\254LLUULLUULLUULLUU\256\254\254!!!" + "'", str2, "LLUULLUULLUULLUU\256\254\254LLUULLUULLUULLUU\256\254\254!!LLUULLUULLUULLUU\256\254\254LLUULLUULLUULLUU\256\254\254!!LLUULLUULLUULLUU\256\254\254LLUULLUULLUULLUU\256\254\254!!LLUULLUULLUULLUU\256\254\254LLUULLUULLUULLUU\256\254\254!!LLUULLUULLUULLUU\256\254\254LLUULLUULLUULLUU\256\254\254!!LLUULLUULLUULLUU\256\254\254LLUULLUULLUULLUU\256\254\254!!LLUULLUULLUULLUU\256\254\254LLUULLUULLUULLUU\256\254\254!!LLUULLUULLUULLUU\256\254\254LLUULLUULLUULLUU\256\254\254!!!");
    }

    @Test
    public void test11124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11124");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!```!!!!!!!!!!!!!!!!```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11125");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("NnullnullnullNnullnullnullNnullnullnullNnullnullnull\200}}`NnullnullnullNnullnullnullNnullnullnullNnullnullnull]]!", "!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!\200}}`!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!!!!NN!!]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u03c2\u03e2\u03e2\u03e2\u03c2\u03e2\u03e2\u03e2\u03c2\u03e2\u03e2\u03e2\u03c2\u03e2\u03e2\u03e2nullnullnull\200\u03c2\u03e2\u03e2\u03e2\u03c2\u03e2\u03e2\u03e2\u03c2\u03e2\u03e2\u03e2\u03c2\u03e2\u03e2\u03e2nullnullnull]]!" + "'", str2, "\u03c2\u03e2\u03e2\u03e2\u03c2\u03e2\u03e2\u03e2\u03c2\u03e2\u03e2\u03e2\u03c2\u03e2\u03e2\u03e2nullnullnull\200\u03c2\u03e2\u03e2\u03e2\u03c2\u03e2\u03e2\u03e2\u03c2\u03e2\u03e2\u03e2\u03c2\u03e2\u03e2\u03e2nullnullnull]]!");
    }

    @Test
    public void test11126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11126");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullnullnullnullnull!!BB!!BBnullnullnullnullnullnullnullnull!!BB!!BBnullnullnullnullnullnullnullnull!!BB!!BBnullnullnullnullnullnullnullnull!!BB!!BBnullnullnullnullnullnullnullnull!!BB!!BBnullnullnullnullnullnullnullnull!!BB!!BBnullnullnullnullnullnullnullnull!!BB!!BBnullnullnullnullnullnullnullnull!!BB!!BB!", "\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!!NN!!NNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!!NN!!NNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!!NN!!NNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!!NN!!NNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!!NN!!NNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!!NN!!NNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!!NN!!NNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!!NN!!NN!" + "'", str2, "LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!!NN!!NNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!!NN!!NNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!!NN!!NNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!!NN!!NNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!!NN!!NNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!!NN!!NNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!!NN!!NNLUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN!!NN!!NN!");
    }

    @Test
    public void test11127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11127");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}unll!!!\200\200}unll!!!\200\200}unll!!!\200\200}unll!!!\200\200unll!~~unll!~~unll!~~unll!~~unll!~~unll!~~unll!~~unll!~~unll!~~unll!~~unll!~~unll!~~unll!~~unll!~~unll!~~unll!~~}unll!!!\200\200}unll!!!\200\200}unll!!!\200\200}unll!!!\200\200unll!~~unll!~~unll!~~unll!~~unll!~~unll!~~unll!~~unll!~~!", "\u0346\u0348\u0348\u0348\u0108\u0106\u0106\u0106\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}nullnull!!!!!\200\200}nullnull!!!!!\200\200}nullnull!!!!!\200\200}nullnull!!!!!\200\200nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~}nullnull!!!!!\200\200}nullnull!!!!!\200\200}nullnull!!!!!\200\200}nullnull!!!!!\200\200nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~!" + "'", str2, "}nullnull!!!!!\200\200}nullnull!!!!!\200\200}nullnull!!!!!\200\200}nullnull!!!!!\200\200nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~}nullnull!!!!!\200\200}nullnull!!!!!\200\200}nullnull!!!!!\200\200}nullnull!!!!!\200\200nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~!");
    }

    @Test
    public void test11128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11128");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LUUULUUU!", "\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de\u01de!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01de\u01de\u01de\u01de\u01de\u01de!" + "'", str2, "\u01de\u01de\u01de\u01de\u01de\u01de!");
    }

    @Test
    public void test11129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11129");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275!\274!!!\274!!!\274!!\276!\274!!\275\275!", "\u017e\u017e\u017e\u017e\u017e\u017enullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!\274!!!\274!!!\274!!\276!\274!!\275\275!" + "'", str2, "\275!\274!!!\274!!!\274!!\276!\274!!\275\275!");
    }

    @Test
    public void test11130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11130");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU\200}}`LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU]]!", "!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!LLLLLLLL!L!!!L!!LLLLLLLL!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!LLLLLLLL!L!!!L!!LLLLLLLL!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!LLLLLLLL!L!!!L!!LLLLLLLL!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!LLLLLLLL!L!!!L!!LLLLLLLL!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!LLLLLLLL!L!!!L!!LLLLLLLL!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!LLLLLLLL!L!!!L!!LLLLLLLL!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!LLLLLLLL!L!!!L!!LLLLLLLL!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!LLLLLLLL!L!!!L!!LLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\200}}`!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!]]!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\200}}`!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!]]!");
    }

    @Test
    public void test11131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11131");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullfehhnullnullnullfehhnullnull!!nullfehhnullnullnullfehhnullnull!!nullfehhnullnullnullfehhnullnullnullfehhnullnullnullfehhnullnull!!nullfehhnullnullnullfehhnullnull!!nullfehhnullnullnullfehhnullnull!", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu!!uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu!!uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu!!uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu!!uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu!" + "'", str2, "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu!!uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu!!uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu!!uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu!!uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu!");
    }

    @Test
    public void test11132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11132");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LULLLULL\200\200LULLLULL\200\200LULLLULL\200\200LULLLULL\200\200LULLLULL\200\200LULLLULL\200\200LULLLULL\200\200LULLLULL\200\200!", "\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200!" + "'", str2, "nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200!");
    }

    @Test
    public void test11133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11133");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\200\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258\u0258]]!", "UU!!UU!!!UUU!UUUUU!!UU!!!UUU!UUUUU!!UU!!!UUU!UUUUU!!UU!!!UUU!UUUUU!!UU!!!UUU!UUUUU!!UU!!!UUU!UUUUU!!UU!!!UUU!UUUUU!!UU!!!UUU!UUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test11134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11134");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204!!\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204!!\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204!!\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204!!\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204!", "\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\204nullnullnullnull\204\204\204nullnullnullnull\204\204!!\204nullnullnullnull\204\204\204nullnullnullnull\204\204!!\204nullnullnullnull\204\204\204nullnullnullnull\204\204\204nullnullnullnull\204\204\204nullnullnullnull\204\204!!\204nullnullnullnull\204\204\204nullnullnullnull\204\204!!\204nullnullnullnull\204\204\204nullnullnullnull\204\204!" + "'", str2, "\204nullnullnullnull\204\204\204nullnullnullnull\204\204!!\204nullnullnullnull\204\204\204nullnullnullnull\204\204!!\204nullnullnullnull\204\204\204nullnullnullnull\204\204\204nullnullnullnull\204\204\204nullnullnullnull\204\204!!\204nullnullnullnull\204\204\204nullnullnullnull\204\204!!\204nullnullnullnull\204\204\204nullnullnullnull\204\204!");
    }

    @Test
    public void test11135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11135");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnull~~\256\254\254nullnull~~\256\254\254!!nullnull~~\256\254\254nullnull~~\256\254\254!!nullnull~~\256\254\254nullnull~~\256\254\254!!nullnull~~\256\254\254nullnull~~\256\254\254!!nullnull~~\256\254\254nullnull~~\256\254\254!!nullnull~~\256\254\254nullnull~~\256\254\254!!nullnull~~\256\254\254nullnull~~\256\254\254!!nullnull~~\256\254\254nullnull~~\256\254\254!!!", "!LUU!LUU!LUU!LUU!UUU!UUU!UUU!UUU!LUU!LUU!LUU!LUU!UUU!UUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\230\216\216null\230\216\216~~\256\254\254null\230\216\216null\230\216\216~~\256\254\254!!null\230\216\216null\230\216\216~~\256\254\254null\230\216\216null\230\216\216~~\256\254\254!!null\230\216\216null\230\216\216~~\256\254\254null\230\216\216null\230\216\216~~\256\254\254!!null\230\216\216null\230\216\216~~\256\254\254null\230\216\216null\230\216\216~~\256\254\254!!null\230\216\216null\230\216\216~~\256\254\254null\230\216\216null\230\216\216~~\256\254\254!!null\230\216\216null\230\216\216~~\256\254\254null\230\216\216null\230\216\216~~\256\254\254!!null\230\216\216null\230\216\216~~\256\254\254null\230\216\216null\230\216\216~~\256\254\254!!null\230\216\216null\230\216\216~~\256\254\254null\230\216\216null\230\216\216~~\256\254\254!!!" + "'", str2, "null\230\216\216null\230\216\216~~\256\254\254null\230\216\216null\230\216\216~~\256\254\254!!null\230\216\216null\230\216\216~~\256\254\254null\230\216\216null\230\216\216~~\256\254\254!!null\230\216\216null\230\216\216~~\256\254\254null\230\216\216null\230\216\216~~\256\254\254!!null\230\216\216null\230\216\216~~\256\254\254null\230\216\216null\230\216\216~~\256\254\254!!null\230\216\216null\230\216\216~~\256\254\254null\230\216\216null\230\216\216~~\256\254\254!!null\230\216\216null\230\216\216~~\256\254\254null\230\216\216null\230\216\216~~\256\254\254!!null\230\216\216null\230\216\216~~\256\254\254null\230\216\216null\230\216\216~~\256\254\254!!null\230\216\216null\230\216\216~~\256\254\254null\230\216\216null\230\216\216~~\256\254\254!!!");
    }

    @Test
    public void test11136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11136");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!!N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!!N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!!N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!!N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!", "NNNNNNNNNNNNNNNN!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!!N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!!N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!!N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!!N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!" + "'", str2, "N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!!N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!!N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!!N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!!N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!");
    }

    @Test
    public void test11137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11137");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0199\u0199\220nullnull\200\u0199\u0199\220nullnull]]!", "!LLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnulleenullnulleenullnull\220nullnulleenullnullee\200}}`nullnulleenullnulleenullnull\220nullnulleenullnullee]]!" + "'", str2, "nullnulleenullnulleenullnull\220nullnulleenullnullee\200}}`nullnulleenullnulleenullnull\220nullnulleenullnullee]]!");
    }

    @Test
    public void test11138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11138");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220!", "!\253\256\256\u031e\u031e\u031e\u031e\u031e\u031e\u031e\u031e\u031e\u031e\u031e\u031enullnullnullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\u031e\u031e\u031e\u031e\u031e\u031e\u031e\u031e\u031e\u031e\u031e\u031enullnullnullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220!" + "'", str2, "\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220\276\276\276\276\213\220\220!");
    }

    @Test
    public void test11139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11139");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!", "\275``!~UU!~UU!~UU!~UU!~UU!~UU!~UU!~UU``!~UU!~UU!~UU!~UU!~UU!~UU!~UU!~UU``!~UU!~UU!~UU!~UU!~UU!~UU!~UU!~UU\276``!~UU!~UU!~UU!~UU!~UU!~UU!~UU!~UU\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!" + "'", str2, "!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!");
    }

    @Test
    public void test11140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11140");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!", "\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test11141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11141");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull!!``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull!!!", "~}\200\200~}\200\200L!NNL!NNNLLLNLLLL!NNL!NNNLLLNLLL~}\200\200~}\200\200L!NNL!NNNLLLNLLLL!NNL!NNNLLLNLLL~}\200\200~}\200\200L!NNL!NNNLLLNLLLL!NNL!NNNLLLNLLL~}\200\200~}\200\200L!NNL!NNNLLLNLLLL!NNL!NNNLLLNLLL~}\200\200~}\200\200L!NNL!NNNLLLNLLLL!NNL!NNNLLLNLLL~}\200\200~}\200\200L!NNL!NNNLLLNLLLL!NNL!NNNLLLNLLL~}\200\200~}\200\200L!NNL!NNNLLLNLLLL!NNL!NNNLLLNLLL~}\200\200~}\200\200L!NNL!NNNLLLNLLLL!NNL!NNNLLLNLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200``}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200!!``}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200``}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200!!!" + "'", str2, "``}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200``}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200!!``}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200``}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200}L\200\200!!!");
    }

    @Test
    public void test11142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11142");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\276\276XX\276\276XXXX\276\276XX\276\276\276\276XX\276\276XXXX\276\276XX\276\276\276\276XX\276\276XXXX\276\276XX\276\276\276\276XX\276\276XXXX\276\276XX\276\276\276\276XX\276\276XXXX\276\276XX\276\276\276\276XX\276\276XXXX\276\276XX\276\276\276\276XX\276\276XXXX\276\276XX\276\276\276\276XX\276\276XXXX\276\276XX\276\276!", "P!RRP!RRP!RRP!RRP!RRP!RRP!RRP!RR!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276!" + "'", str2, "\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276\276\276nullnull\276\276nullnullnullnull\276\276nullnull\276\276!");
    }

    @Test
    public void test11143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11143");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225!", "\276\276nullnull\276\276nullnull!!\276\276nullnull\276\276nullnull!!\276\276nullnull\276\276nullnull\276\276nullnull\276\276nullnull!!\276\276nullnull\276\276nullnull!!\276\276nullnull\276\276nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225!" + "'", str2, "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\225\225!");
    }

    @Test
    public void test11144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11144");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("`\226\226\226\226\226\226\226\226\226\226\226\226`\226\226\226\226\226\226\226\226\226\226\226\226!", "}~\200\200}~\200\200\u0170\u0170\u0170\u0170\u0170\u0170nullnullnull}~\200\200}~\200\200\u0170\u0170\u0170\u0170\u0170\u0170nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`\226\226\226\226\226\226\226\226\226\226\226\226`\226\226\226\226\226\226\226\226\226\226\226\226!" + "'", str2, "`\226\226\226\226\226\226\226\226\226\226\226\226`\226\226\226\226\226\226\226\226\226\226\226\226!");
    }

    @Test
    public void test11145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11145");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\335LLL\335nullLL\335nullLL\335nullLL\335nullLL\335LLL\335nullLL\335nullLL!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test11146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11146");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368!\253\256\256\u0346\u0348\u0348!", "L\335LLL\335LL!!L\335LLL\335LL!!L\335LLL\335LLL\335LLL\335LL!!L\335LLL\335LL!!L\335LLL\335LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368!\253\256\256\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368!\253\256\256\u0346\u0348\u0348!");
    }

    @Test
    public void test11147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11147");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038enullnull!", "nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!" + "'", str2, "nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!");
    }

    @Test
    public void test11148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11148");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("NLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLL!", "\215\213!!\215\213!!u!llu!llu!llu!llu!llu!llu!llu!ll\215\213!!\215\213!!u!llu!llu!llu!llu!llu!llu!llu!ll\215\213!!\215\213!!u!llu!llu!llu!llu!llu!llu!llu!ll\215\213!!\215\213!!u!llu!llu!llu!llu!llu!llu!llu!ll\215\213!!\215\213!!u!llu!llu!llu!llu!llu!llu!llu!ll\215\213!!\215\213!!u!llu!llu!llu!llu!llu!llu!llu!ll\215\213!!\215\213!!u!llu!llu!llu!llu!llu!llu!llu!ll\215\213!!\215\213!!u!llu!llu!llu!llu!llu!llu!llu!ll!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180!" + "'", str2, "\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180!");
    }

    @Test
    public void test11149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11149");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("null\200}}null\200}}null\200}}null\200}}null\200}}null\200}}null\200}}null\200}}!", "\u014f!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}!" + "'", str2, "nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}nullnullnullnull\200}}!");
    }

    @Test
    public void test11150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11150");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\276X\266\266~XX\276X\266\266~XX!!\276X\266\266~XX\276X\266\266~XX!!\276X\266\266~XX\276X\266\266~XX\276X\266\266~XX\276X\266\266~XX!!\276X\266\266~XX\276X\266\266~XX!!\276X\266\266~XX\276X\266\266~XX!", "\u019b\u019c\u019e\u019e\u019b\u019c\u019e\u019e\u019b\u019c\u019e\u019e\u019b\u019c\u019e\u019e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!" + "'", str2, "\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!!\276null\266\266~nullnull\276null\266\266~nullnull!");
    }

    @Test
    public void test11151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11151");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\276\276!!\276\276!!!", "\u011d\u011d!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276!!\276\276!!!" + "'", str2, "\276\276!!\276\276!!!");
    }

    @Test
    public void test11152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11152");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\215}\215\215\215}\215\215LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\215}\215\215\215}\215\215!", "]!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!]]!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!]]!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!]]!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!]]]!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!]]!lnulllllnulllllnulllllnullll!!!lnulllllnulllllnulllllnullll!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\u0278\215}\215\215\215}\215\215!");
    }

    @Test
    public void test11153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11153");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa!~~!", "\u014c\u016e\u016c\u016c\u016e\u016c\u016c\u014c\u016e\u016c\u016c\u016e\u016c\u016c\u014c\u016e\u016c\u016c\u016e\u016c\u016c\u014c\u016e\u016c\u016c\u016e\u016c\u016c\u014c\u016e\u016c\u016c\u016e\u016c\u016c!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa!~~!" + "'", str2, "\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa!~~!");
    }

    @Test
    public void test11154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11154");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\275!~!!!~!!!~!!\276!~!!\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test11155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11155");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300!", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256\253\254\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test11156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11156");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225!", "\352\351\354\354\352\351\354\354!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225!" + "'", str2, "\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225\275\276null!nullnullnull!nullnull\275\276null!nullnullnull!nullnull\225\225!");
    }

    @Test
    public void test11157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11157");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11158");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c!!!", "\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d!!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test11159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11159");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276!!\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276!!\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276!!\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276!!\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314nullnullnull\236\276\276!", "!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314L!]]L!]]L!]]\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314L!]]L!]]L!]]\236\276\276!!\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314L!]]L!]]L!]]\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314L!]]L!]]L!]]\236\276\276!!\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314L!]]L!]]L!]]\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314L!]]L!]]L!]]\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314L!]]L!]]L!]]\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314L!]]L!]]L!]]\236\276\276!!\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314L!]]L!]]L!]]\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314L!]]L!]]L!]]\236\276\276!!\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314L!]]L!]]L!]]\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314L!]]L!]]L!]]\236\276\276!" + "'", str2, "\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314L!]]L!]]L!]]\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314L!]]L!]]L!]]\236\276\276!!\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314L!]]L!]]L!]]\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314L!]]L!]]L!]]\236\276\276!!\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314L!]]L!]]L!]]\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314L!]]L!]]L!]]\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314L!]]L!]]L!]]\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314L!]]L!]]L!]]\236\276\276!!\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314L!]]L!]]L!]]\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314L!]]L!]]L!]]\236\276\276!!\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314L!]]L!]]L!]]\236\276\276\230\226\u0311\u0312\u0314\u0314\u0311\u0312\u0314\u0314L!]]L!]]L!]]\236\276\276!");
    }

    @Test
    public void test11160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11160");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "orrrorrrrrorrrorrrrrorrrorrrrrorrrorrrrrorrrorrrrrorrrorrrrrorrrorrrrrorrrorrrrr!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullRRRRRRRRRRRRnullRRRRRRRRRRRRnullRRRRRRRRRRRRnullRRRRRRRRRRRRnullRRRRRRRRRRRRnullRRRRRRRRRRRRnullRRRRRRRRRRRRnullRRRRRRRRRRRRnullRRRRRRRRRRRRnullRRRRRRRRRRRRnullRRRRRRRRRRRRnullRRRRRRRRRRRRnullRRRRRRRRRRRRnullRRRRRRRRRRRRnullRRRRRRRRRRRRnullRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!" + "'", str2, "nullRRRRRRRRRRRRnullRRRRRRRRRRRRnullRRRRRRRRRRRRnullRRRRRRRRRRRRnullRRRRRRRRRRRRnullRRRRRRRRRRRRnullRRRRRRRRRRRRnullRRRRRRRRRRRRnullRRRRRRRRRRRRnullRRRRRRRRRRRRnullRRRRRRRRRRRRnullRRRRRRRRRRRRnullRRRRRRRRRRRRnullRRRRRRRRRRRRnullRRRRRRRRRRRRnullRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR!");
    }

    @Test
    public void test11161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11161");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!", "!\271\271\214\214\271\271\214\214\271\271\214\214!\271\271\214\214\271\271\214\214\271\271\214\214!\271\271\214\214\271\271\214\214\271\271\214\214!\271\271\214\214\271\271\214\214\271\271\214\214!\271\271\214\214\271\271\214\214\271\271\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!" + "'", str2, "null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!!null\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnullnull\220nullnull\200~~null\220nullnull\200~~null\220nullnullnull\220nullnull!");
    }

    @Test
    public void test11162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11162");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!!!!!!!!LL!!!!!!!!!!!!!!LL!!!!!!!!!!!!!!!!!!!LL!!!!!!!!!!!!!!LL!!!!!!!!!!!!!!!!!!!LL!!!!!!!!!!!!!!LL!!!!!!!!!!!!!!!!!!!LL!!!!!!!!!!!!!!LL!!!!!!!!!!!!!!!!!!!LL!!!!!!!!!!!!!!LL!!!!!!!!!!!", "\200\u02d6\200\200\200\u02d6\200\200\u02d6\200\200\200\u02d6\200\200\200\200\u02d6\200\200\200\u02d6\200\200\u02d6\200\200\200\u02d6\200\200\200\200\u02d6\200\200\200\u02d6\200\200\u02d6\200\200\200\u02d6\200\200\200\200\u02d6\200\200\200\u02d6\200\200\u02d6\200\200\200\u02d6\200\200\200\200\u02d6\200\200\200\u02d6\200\200\u02d6\200\200\200\u02d6\200\200\200\200\u02d6\200\200\200\u02d6\200\200\u02d6\200\200\200\u02d6\200\200\200\200\u02d6\200\200\200\u02d6\200\200\u02d6\200\200\200\u02d6\200\200\200\200\u02d6\200\200\200\u02d6\200\200\u02d6\200\200\200\u02d6\200\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!\200\200!!!!!!!!!!!!!!\200\200!!!!!!!!!!!!!!!!!!!\200\200!!!!!!!!!!!!!!\200\200!!!!!!!!!!!!!!!!!!!\200\200!!!!!!!!!!!!!!\200\200!!!!!!!!!!!!!!!!!!!\200\200!!!!!!!!!!!!!!\200\200!!!!!!!!!!!!!!!!!!!\200\200!!!!!!!!!!!!!!\200\200!!!!!!!!!!!" + "'", str2, "!!!!!!!!!\200\200!!!!!!!!!!!!!!\200\200!!!!!!!!!!!!!!!!!!!\200\200!!!!!!!!!!!!!!\200\200!!!!!!!!!!!!!!!!!!!\200\200!!!!!!!!!!!!!!\200\200!!!!!!!!!!!!!!!!!!!\200\200!!!!!!!!!!!!!!\200\200!!!!!!!!!!!!!!!!!!!\200\200!!!!!!!!!!!!!!\200\200!!!!!!!!!!!");
    }

    @Test
    public void test11163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11163");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!", "!~\254\256\256\256\254\256\256\256!~\254\256\256\256\254\256\256\256\220\220!~\254\256\256\256\254\256\256\256!~\254\256\256\256\254\256\256\256\220\220\220!~\254\256\256\256\254\256\256\256\220\220\220!~\254\256\256\256\254\256\256\256\220\220\220!~\254\256\256\256\254\256\256\256\220\220\220!~\254\256\256\256\254\256\256\256\220\220!~\254\256\256\256\254\256\256\256!~\254\256\256\256\254\256\256\256\220\220!~\254\256\256\256\254\256\256\256!~\254\256\256\256\254\256\256\256\220\220!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\276\275\275!null~~!!null~~!null~~!null~~!null~~!\276\275\275!null~~!!null~~!null~~!null~~!null~~!!!\276\275\275!null~~!!null~~!null~~!null~~!null~~!\276\275\275!null~~!!null~~!null~~!null~~!null~~!!!\276\275\275!null~~!!null~~!null~~!null~~!null~~!\276\275\275!null~~!!null~~!null~~!null~~!null~~!!!\276\275\275!null~~!!null~~!null~~!null~~!null~~!\276\275\275!null~~!!null~~!null~~!null~~!null~~!!!\276\275\275!null~~!!null~~!null~~!null~~!null~~!\276\275\275!null~~!!null~~!null~~!null~~!null~~!!!\276\275\275!null~~!!null~~!null~~!null~~!null~~!\276\275\275!null~~!!null~~!null~~!null~~!null~~!!!\276\275\275!null~~!!null~~!null~~!null~~!null~~!\276\275\275!null~~!!null~~!null~~!null~~!null~~!!!\276\275\275!null~~!!null~~!null~~!null~~!null~~!\276\275\275!null~~!!null~~!null~~!null~~!null~~!!!" + "'", str2, "!\276\275\275!null~~!!null~~!null~~!null~~!null~~!\276\275\275!null~~!!null~~!null~~!null~~!null~~!!!\276\275\275!null~~!!null~~!null~~!null~~!null~~!\276\275\275!null~~!!null~~!null~~!null~~!null~~!!!\276\275\275!null~~!!null~~!null~~!null~~!null~~!\276\275\275!null~~!!null~~!null~~!null~~!null~~!!!\276\275\275!null~~!!null~~!null~~!null~~!null~~!\276\275\275!null~~!!null~~!null~~!null~~!null~~!!!\276\275\275!null~~!!null~~!null~~!null~~!null~~!\276\275\275!null~~!!null~~!null~~!null~~!null~~!!!\276\275\275!null~~!!null~~!null~~!null~~!null~~!\276\275\275!null~~!!null~~!null~~!null~~!null~~!!!\276\275\275!null~~!!null~~!null~~!null~~!null~~!\276\275\275!null~~!!null~~!null~~!null~~!null~~!!!\276\275\275!null~~!!null~~!null~~!null~~!null~~!\276\275\275!null~~!!null~~!null~~!null~~!null~~!!!");
    }

    @Test
    public void test11164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11164");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "U]^^nullnullnullU]^^nullnullnullU]^^nullnullnullU]^^nullnullnull\253\253\253\200}}`U]^^nullnullnullU]^^nullnullnullU]^^nullnullnullU]^^nullnullnull\253\253\253]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!" + "'", str2, "!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
    }

    @Test
    public void test11165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11165");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!fhhnullnullnull!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhhnullnullnull!fhh!fhh!fhh!fhh!fhh!fhh!fhh!fhh!", "\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\214\214\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\214\214\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\214\214\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\214\214\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\214\214\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\214\214\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\214\214\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\u01b5\214\214!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02e9\u02ea\u02ec\u02ec\u02e9\u02ea\u02ec\u02ec\u02e9\u02ea\u02ec\u02ec\u02e9\u02ea\u02ec\u02ec\u02e9\u02ea\u02ec\u02ec\u02e9\u02ea\u02ec\u02ec!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!" + "'", str2, "\u02e9\u02ea\u02ec\u02ec\u02e9\u02ea\u02ec\u02ec\u02e9\u02ea\u02ec\u02ec\u02e9\u02ea\u02ec\u02ec\u02e9\u02ea\u02ec\u02ec\u02e9\u02ea\u02ec\u02ec!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
    }

    @Test
    public void test11166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11166");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("HHFFH~~HHFFH~~HHFFH~~HHFFH~~HHFFH~~HHFFH~~HHFFH~~HHFFH~~!", "!LUU!LUU!LUU!LUU!UUU!UUU!UUU!UUU!LUU!LUU!LUU!LUU!UUU!UUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~!" + "'", str2, "nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~!");
    }

    @Test
    public void test11167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11167");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\215}\215\215\215}\215\215LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!\215}\215\215\215}\215\215!", "LL}}\275\275\275LL}}\275\275\275!!LL}}\275\275\275LL}}\275\275\275!!LL}}\275\275\275LL}}\275\275\275LL}}\275\275\275LL}}\275\275\275!!LL}}\275\275\275LL}}\275\275\275!!LL}}\275\275\275LL}}\275\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\215}\215\215\215}\215\215!");
    }

    @Test
    public void test11168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11168");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!!!!EE!!EE!", "!~!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!~!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!!!~!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!~!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!!!~!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!~!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!~!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!~!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!!!~!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!~!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!!!~!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!~!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!~\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!" + "'", str2, "!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!");
    }

    @Test
    public void test11169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11169");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\220\220!!\220\220!!\220\220!!\220\220\u0346\u0348\u0348!", "LLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\220\220!!\220\220!!\220\220!!\220\220\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\220\220!!\220\220!!\220\220!!\220\220\u0346\u0348\u0348!");
    }

    @Test
    public void test11170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11170");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0136\u0139\u0139\u0139\u0139\u0136\u0139\u0139\u0139\u0139\225\225\u0136\u0139\u0139\u0139\u0139\u0136\u0139\u0139\u0139\u0139\225\225\u0136\u0139\u0139\u0139\u0139\u0136\u0139\u0139\u0139\u0139\225\225\u0136\u0139\u0139\u0139\u0139\u0136\u0139\u0139\u0139\u0139\225\225\u0136\u0139\u0139\u0139\u0139\u0136\u0139\u0139\u0139\u0139\225\225\u0136\u0139\u0139\u0139\u0139\u0136\u0139\u0139\u0139\u0139\225\225\u0136\u0139\u0139\u0139\u0139\u0136\u0139\u0139\u0139\u0139\225\225\u0136\u0139\u0139\u0139\u0139\u0136\u0139\u0139\u0139\u0139\225\225!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225!");
    }

    @Test
    public void test11171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11171");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261null\261\261\261!", "L\255UUnullnullnullL\255UUnullnullnullnullnullL\255UUnullnullnullL\255UUnullnullnullnullnull!!L\255UUnullnullnullL\255UUnullnullnullnullnullL\255UUnullnullnullL\255UUnullnullnullnullnull!!L\255UUnullnullnullL\255UUnullnullnullnullnullL\255UUnullnullnullL\255UUnullnullnullnullnullL\255UUnullnullnullL\255UUnullnullnullnullnullL\255UUnullnullnullL\255UUnullnullnullnullnull!!L\255UUnullnullnullL\255UUnullnullnullnullnullL\255UUnullnullnullL\255UUnullnullnullnullnull!!L\255UUnullnullnullL\255UUnullnullnullnullnullL\255UUnullnullnullL\255UUnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0245\u0246\u0248\u0248\261\261\261\u0245\u0246\u0248\u0248\261\261\261\u0245\u0246\u0248\u0248\261\261\261\u0245\u0246\u0248\u0248\261\261\261\u0245\u0246\u0248\u0248\261\261\261\u0245\u0246\u0248\u0248\261\261\261\u0245\u0246\u0248\u0248\261\261\261\u0245\u0246\u0248\u0248\261\261\261\u0245\u0246\u0248\u0248\261\261\261\u0245\u0246\u0248\u0248\261\261\261\u0245\u0246\u0248\u0248\261\261\261\u0245\u0246\u0248\u0248\261\261\261\u0245\u0246\u0248\u0248\261\261\261\u0245\u0246\u0248\u0248\261\261\261!" + "'", str2, "\u0245\u0246\u0248\u0248\261\261\261\u0245\u0246\u0248\u0248\261\261\261\u0245\u0246\u0248\u0248\261\261\261\u0245\u0246\u0248\u0248\261\261\261\u0245\u0246\u0248\u0248\261\261\261\u0245\u0246\u0248\u0248\261\261\261\u0245\u0246\u0248\u0248\261\261\261\u0245\u0246\u0248\u0248\261\261\261\u0245\u0246\u0248\u0248\261\261\261\u0245\u0246\u0248\u0248\261\261\261\u0245\u0246\u0248\u0248\261\261\261\u0245\u0246\u0248\u0248\261\261\261\u0245\u0246\u0248\u0248\261\261\261\u0245\u0246\u0248\u0248\261\261\261!");
    }

    @Test
    public void test11172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11172");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhh!", "null\256null\254\254nullnullnull\256null\254\254nullnull!!null\256null\254\254nullnullnull\256null\254\254nullnull!!null\256null\254\254nullnullnull\256null\254\254nullnull!!null\256null\254\254nullnullnull\256null\254\254nullnull!!null\256null\254\254nullnullnull\256null\254\254nullnull!!null\256null\254\254nullnullnull\256null\254\254nullnull!!null\256null\254\254nullnullnull\256null\254\254nullnull!!null\256null\254\254nullnullnull\256null\254\254nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NULLNULLNULLNULLNULLNULLNULLNULL!L!!!L!!NULLNULLNULLNULLNULLNULLNULLNULL!L!!!L!!NULLNULLNULLNULLNULLNULLNULLNULL!L!!!L!!NULLNULLNULLNULLNULLNULLNULLNULL!L!!!L!!NULLNULLNULLNULLNULLNULLNULLNULL!L!!!L!!NULLNULLNULLNULLNULLNULLNULLNULL!L!!!L!!NULLNULLNULLNULLNULLNULLNULLNULL!L!!!L!!NULLNULLNULLNULLNULLNULLNULLNULL!L!!!L!!!" + "'", str2, "NULLNULLNULLNULLNULLNULLNULLNULL!L!!!L!!NULLNULLNULLNULLNULLNULLNULLNULL!L!!!L!!NULLNULLNULLNULLNULLNULLNULLNULL!L!!!L!!NULLNULLNULLNULLNULLNULLNULLNULL!L!!!L!!NULLNULLNULLNULLNULLNULLNULLNULL!L!!!L!!NULLNULLNULLNULLNULLNULLNULLNULL!L!!!L!!NULLNULLNULLNULLNULLNULLNULLNULL!L!!!L!!NULLNULLNULLNULLNULLNULLNULLNULL!L!!!L!!!");
    }

    @Test
    public void test11173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11173");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!!!!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!!!!!!!!", "~}\200\200~}\200\200\u01a0\u01a0nullnull\230\230\u01a0\u01a0nullnull\230\230~}\200\200~}\200\200\u01a0\u01a0nullnull\230\230\u01a0\u01a0nullnull\230\230~}\200\200~}\200\200\u01a0\u01a0nullnull\230\230\u01a0\u01a0nullnull\230\230~}\200\200~}\200\200\u01a0\u01a0nullnull\230\230\u01a0\u01a0nullnull\230\230~}\200\200~}\200\200\u01a0\u01a0nullnull\230\230\u01a0\u01a0nullnull\230\230~}\200\200~}\200\200\u01a0\u01a0nullnull\230\230\u01a0\u01a0nullnull\230\230~}\200\200~}\200\200\u01a0\u01a0nullnull\230\230\u01a0\u01a0nullnull\230\230~}\200\200~}\200\200\u01a0\u01a0nullnull\230\230\u01a0\u01a0nullnull\230\230!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!!!!!!!!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!!!!!!!!!!" + "'", str2, "NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!!!!!!!!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!!!!!!!!!!");
    }

    @Test
    public void test11174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11174");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull}}\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull}}!", "!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256}}\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256}}!" + "'", str2, "\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256}}\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256\254\254\256\256\256\254\256\256\256\254\256\256\256}}!");
    }

    @Test
    public void test11175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11175");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!!NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!!NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!!NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!!NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u0346\u0348\u0348!");
    }

    @Test
    public void test11176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11176");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!]]]!]!!!", "LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```LNNNLNNNLNNNLNNN!!!```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]]]!]!!!" + "'", str2, "!]]]!]!!!");
    }

    @Test
    public void test11177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11177");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test11178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11178");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270!", "!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!" + "'", str2, "!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!");
    }

    @Test
    public void test11179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11179");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "LNLLLNLLLNLLLNLLLNLLLNLL!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!LNLLLNLLLNLLLNLLLNLLLNLL!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11180");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0126\u0128\u0128\u0126\u0128\u0128!", "\u0366\u0365\u0368\u0368\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u010e\u010c\u0110\u0110\u010e\u010c\u0110\u0110nullnull!" + "'", str2, "\u010e\u010c\u0110\u0110\u010e\u010c\u0110\u0110nullnull!");
    }

    @Test
    public void test11181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11181");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!!RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!!RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!!RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!!RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!", "nullnull\336\336nullnull\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LL!!LLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LL!!LLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LL!!LLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LL!!LLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LL!" + "'", str2, "LLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LL!!LLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LL!!LLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LL!!LLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LL!!LLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LLLLLL!LL!");
    }

    @Test
    public void test11182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11182");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\215}\215\215\215}\215\215RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR\215}\215\215\215}\215\215!", "\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\215}\215\215\215}\215\215!");
    }

    @Test
    public void test11183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11183");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266!", "]]]]]]]]nullnull]]]]]]]]nullnull!!]]]]]]]]nullnull]]]]]]]]nullnull!!]]]]]]]]nullnull]]]]]]]]nullnull!!]]]]]]]]nullnull]]]]]]]]nullnull!!]]]]]]]]nullnull]]]]]]]]nullnull!!]]]]]]]]nullnull]]]]]]]]nullnull!!]]]]]]]]nullnull]]]]]]]]nullnull!!]]]]]]]]nullnull]]]]]]]]nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266!" + "'", str2, "L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266!");
    }

    @Test
    public void test11184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11184");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "\u0366\u0365\u0368\u0368nullnull!!nullnull!!!!nullnull!!nullnull!!!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test11185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11185");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!", "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!!!!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!" + "'", str2, "\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!");
    }

    @Test
    public void test11186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11186");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11187");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0346\u0348\u0348\u0348\u037e\u037e\u0348\u0346\u0346!", "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0108\u0108\u0108\u0108\u0108\u0108\u037e\u037e\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0108\u0108\u0108\u0108\u0108\u0108\u037e\u037e\u0348\u0346\u0346!");
    }

    @Test
    public void test11188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11188");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("ULLLULL\256\254\254ULLLULL\256\254\254!!ULLLULL\256\254\254ULLLULL\256\254\254!!ULLLULL\256\254\254ULLLULL\256\254\254!!ULLLULL\256\254\254ULLLULL\256\254\254!!ULLLULL\256\254\254ULLLULL\256\254\254!!ULLLULL\256\254\254ULLLULL\256\254\254!!ULLLULL\256\254\254ULLLULL\256\254\254!!ULLLULL\256\254\254ULLLULL\256\254\254!!!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380}~\200\200}~\200\200\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380}~\200\200}~\200\200\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380}~\200\200}~\200\200\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u037d\u037e\u0380\u0380\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "N\200\200\200N\200\200\256\254\254N\200\200\200N\200\200\256\254\254!!N\200\200\200N\200\200\256\254\254N\200\200\200N\200\200\256\254\254!!N\200\200\200N\200\200\256\254\254N\200\200\200N\200\200\256\254\254!!N\200\200\200N\200\200\256\254\254N\200\200\200N\200\200\256\254\254!!N\200\200\200N\200\200\256\254\254N\200\200\200N\200\200\256\254\254!!N\200\200\200N\200\200\256\254\254N\200\200\200N\200\200\256\254\254!!N\200\200\200N\200\200\256\254\254N\200\200\200N\200\200\256\254\254!!N\200\200\200N\200\200\256\254\254N\200\200\200N\200\200\256\254\254!!!" + "'", str2, "N\200\200\200N\200\200\256\254\254N\200\200\200N\200\200\256\254\254!!N\200\200\200N\200\200\256\254\254N\200\200\200N\200\200\256\254\254!!N\200\200\200N\200\200\256\254\254N\200\200\200N\200\200\256\254\254!!N\200\200\200N\200\200\256\254\254N\200\200\200N\200\200\256\254\254!!N\200\200\200N\200\200\256\254\254N\200\200\200N\200\200\256\254\254!!N\200\200\200N\200\200\256\254\254N\200\200\200N\200\200\256\254\254!!N\200\200\200N\200\200\256\254\254N\200\200\200N\200\200\256\254\254!!N\200\200\200N\200\200\256\254\254N\200\200\200N\200\200\256\254\254!!!");
    }

    @Test
    public void test11189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11189");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull\230!\225\225\230!\225\225nullnull!", "\ua7ad\ua7ad\ua7ad\ua7ad\200\ua7ad\ua7ad\ua7ad\ua7ad]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230!\225\225\230!\225\225\u026c\u026c\u026c\u026c\230!\225\225\230!\225\225\u026c\u026c\u026c\u026c\230!\225\225\230!\225\225\u026c\u026c\u026c\u026c\230!\225\225\230!\225\225\u026c\u026c\u026c\u026c\230!\225\225\230!\225\225\u026c\u026c\u026c\u026c\230!\225\225\230!\225\225\u026c\u026c\u026c\u026c\230!\225\225\230!\225\225\u026c\u026c\u026c\u026c\230!\225\225\230!\225\225\u026c\u026c\u026c\u026c!" + "'", str2, "\230!\225\225\230!\225\225\u026c\u026c\u026c\u026c\230!\225\225\230!\225\225\u026c\u026c\u026c\u026c\230!\225\225\230!\225\225\u026c\u026c\u026c\u026c\230!\225\225\230!\225\225\u026c\u026c\u026c\u026c\230!\225\225\230!\225\225\u026c\u026c\u026c\u026c\230!\225\225\230!\225\225\u026c\u026c\u026c\u026c\230!\225\225\230!\225\225\u026c\u026c\u026c\u026c\230!\225\225\230!\225\225\u026c\u026c\u026c\u026c!");
    }

    @Test
    public void test11190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11190");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\210\210\u01ad\u01ad\u01ad\u01ad\u01ad\210\210\u01ad\u01ad\u01ad\u01ad\u01ad\210\210\u01ad\u01ad\u01ad\u01ad\u01ad\210\210\u01ad\u01ad\u01ad\u01ad\u01ad\200}}`\210\210\u01ad\u01ad\u01ad\u01ad\u01ad\210\210\u01ad\u01ad\u01ad\u01ad\u01ad\210\210\u01ad\u01ad\u01ad\u01ad\u01ad\210\210\u01ad\u01ad\u01ad\u01ad\u01ad]]!", "\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\210\210nullnullnullnullnull\210\210nullnullnullnullnull\210\210nullnullnullnullnull\210\210nullnullnullnullnull\200}}`\210\210nullnullnullnullnull\210\210nullnullnullnullnull\210\210nullnullnullnullnull\210\210nullnullnullnullnull]]!" + "'", str2, "\210\210nullnullnullnullnull\210\210nullnullnullnullnull\210\210nullnullnullnullnull\210\210nullnullnullnullnull\200}}`\210\210nullnullnullnullnull\210\210nullnullnullnullnull\210\210nullnullnullnullnull\210\210nullnullnullnullnull]]!");
    }

    @Test
    public void test11191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11191");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "\u0406\u0406!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test11192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11192");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!\331\330\333\333\331\330\333\333\331\330\333\333\331\330\333\333!", "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test11193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11193");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("NLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUU!", "LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\213\213\213\213\213\216\216\213\213\216\216\213\213\216\216\214\213\213\213\213\213\216\216\213\213\216\216\213\213\216\216\214\213\213\213\213\213\216\216\213\213\216\216\213\213\216\216\214\213\213\213\213\213\216\216\213\213\216\216\213\213\216\216\214\213\213\213\213\213\216\216\213\213\216\216\213\213\216\216\214\213\213\213\213\213\216\216\213\213\216\216\213\213\216\216\214\213\213\213\213\213\216\216\213\213\216\216\213\213\216\216\214\213\213\213\213\213\216\216\213\213\216\216\213\213\216\216!" + "'", str2, "\214\213\213\213\213\213\216\216\213\213\216\216\213\213\216\216\214\213\213\213\213\213\216\216\213\213\216\216\213\213\216\216\214\213\213\213\213\213\216\216\213\213\216\216\213\213\216\216\214\213\213\213\213\213\216\216\213\213\216\216\213\213\216\216\214\213\213\213\213\213\216\216\213\213\216\216\213\213\216\216\214\213\213\213\213\213\216\216\213\213\216\216\213\213\216\216\214\213\213\213\213\213\216\216\213\213\216\216\213\213\216\216\214\213\213\213\213\213\216\216\213\213\216\216\213\213\216\216!");
    }

    @Test
    public void test11194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11194");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266!", "LNUU~\210LNUU\212\212\210LNUU\212\212LNUU~\210LNUU\212\212\210LNUU\212\212!!LNUU~\210LNUU\212\212\210LNUU\212\212LNUU~\210LNUU\212\212\210LNUU\212\212!!LNUU~\210LNUU\212\212\210LNUU\212\212LNUU~\210LNUU\212\212\210LNUU\212\212LNUU~\210LNUU\212\212\210LNUU\212\212LNUU~\210LNUU\212\212\210LNUU\212\212!!LNUU~\210LNUU\212\212\210LNUU\212\212LNUU~\210LNUU\212\212\210LNUU\212\212!!LNUU~\210LNUU\212\212\210LNUU\212\212LNUU~\210LNUU\212\212\210LNUU\212\212!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\276\276\266\266\276\276\266\266\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\276\276\266\266\276\276\266\266\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\276\276\266\266\276\276\266\266\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\276\276\266\266\276\276\266\266\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\276\276\266\266\276\276\266\266\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\276\276\266\266\276\276\266\266\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\276\276\266\266\276\276\266\266\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\276\276\266\266\276\276\266\266!" + "'", str2, "\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\276\276\266\266\276\276\266\266\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\276\276\266\266\276\276\266\266\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\276\276\266\266\276\276\266\266\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\276\276\266\266\276\276\266\266\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\276\276\266\266\276\276\266\266\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\276\276\266\266\276\276\266\266\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\276\276\266\266\276\276\266\266\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\210\210UU\276\276\266\266\276\276\266\266!");
    }

    @Test
    public void test11195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11195");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]!" + "'", str2, "]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]]nullnull!!]]!");
    }

    @Test
    public void test11196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11196");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d!!!", "\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!!!\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!!!\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!!!\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!!!\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!!!\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!!!\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!!!\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!\253\254\256\256UL!!UL!!UL!!UL!!UL!!UL!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test11197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11197");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340!nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340!nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340!nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340!nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340!", "UUNN\226\230\230UUNNUUNNUUNNUUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNNUUNNUUNNUUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN!\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN!\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN!\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN!\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN!" + "'", str2, "!\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN!\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN!\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN!\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN!\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN\230\230NN\230\230NNNN!");
    }

    @Test
    public void test11198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11198");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11199");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("E~UUHHUUHHE~UUHHUUHH!!E~UUHHUUHHE~UUHHUUHH!!E~UUHHUUHHE~UUHHUUHHE~UUHHUUHHE~UUHHUUHH!!E~UUHHUUHHE~UUHHUUHH!!E~UUHHUUHHE~UUHHUUHH!", "!!!!!!!!\276!!!\276!!!!!!!!!!!\276!!!\276!!!!!!!!!!!\276!!!\276!!!!!!!!!!!\276!!!\276!!!!!!!!!!!\276!!!\276!!!!!!!!!!!\276!!!\276!!!!!!!!!!!\276!!!\276!!!!!!!!!!!\276!!!\276!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null~nullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!null~nullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!null~nullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!null~nullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!null~nullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!" + "'", str2, "null~nullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!null~nullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!null~nullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!null~nullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!null~nullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test11200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11200");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!!", "`!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull`!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!!" + "'", str2, "_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!_!___!__!!!");
    }

    @Test
    public void test11201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11201");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LNLLLNLL!!LNLLLNLL!!!", "nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0178\u0175\u0178\u0178\u0178\u0175\u0178\u0178\u0178\u0175\u0178\u0178\u0178\u0175\u0178\u0178!!!" + "'", str2, "\u0178\u0175\u0178\u0178\u0178\u0175\u0178\u0178\u0178\u0175\u0178\u0178\u0178\u0175\u0178\u0178!!!");
    }

    @Test
    public void test11202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11202");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\270\270^^\270~~\270\270^^\270~~\270\270^^\270~~\270\270^^\270~~\270\270^^\270~~\270\270^^\270~~\270\270^^\270~~\270\270^^\270~~!", "L!LLL!LL!!L!LLL!LL!!L!LLL!LL!!L!LLL!LL!!L!LLL!LL!!L!LLL!LL!!L!LLL!LL!!L!LLL!LL!!L!LLL!LL!!L!LLL!LL!!L!LLL!LL!!L!LLL!LL!!L!LLL!LL!!L!LLL!LL!!L!LLL!LL!!L!LLL!LL!!L!LLL!LL!!L!LLL!LL!!L!LLL!LL!!L!LLL!LL!!L!LLL!LL!!L!LLL!LL!!L!LLL!LL!!L!LLL!LL!!L!LLL!LL!!L!LLL!LL!!L!LLL!LL!!L!LLL!LL!!L!LLL!LL!!L!LLL!LL!!L!LLL!LL!!L!LLL!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\270\270^^\270~~\270\270^^\270~~\270\270^^\270~~\270\270^^\270~~\270\270^^\270~~\270\270^^\270~~\270\270^^\270~~\270\270^^\270~~!" + "'", str2, "\270\270^^\270~~\270\270^^\270~~\270\270^^\270~~\270\270^^\270~~\270\270^^\270~~\270\270^^\270~~\270\270^^\270~~\270\270^^\270~~!");
    }

    @Test
    public void test11203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11203");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu~}\200\200~}\200\200null!nullnullnull!nullnull!xuu!xuunull!nullnullnull!nullnull!xuu!xuu!", "!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200JJ!!!JJ!!JJ!!JJ!!!JJ!!JJ!!!!JJ!!JJJJ!!!JJ!!JJ!!JJ!!!JJ!!JJ!!!!JJ!!JJ~}\200\200~}\200\200JJ!!!JJ!!JJ!!JJ!!!JJ!!JJ!!!!JJ!!JJJJ!!!JJ!!JJ!!JJ!!!JJ!!JJ!!!!JJ!!JJ~}\200\200~}\200\200JJ!!!JJ!!JJ!!JJ!!!JJ!!JJ!!!!JJ!!JJJJ!!!JJ!!JJ!!JJ!!!JJ!!JJ!!!!JJ!!JJ~}\200\200~}\200\200JJ!!!JJ!!JJ!!JJ!!!JJ!!JJ!!!!JJ!!JJJJ!!!JJ!!JJ!!JJ!!!JJ!!JJ!!!!JJ!!JJ~}\200\200~}\200\200JJ!!!JJ!!JJ!!JJ!!!JJ!!JJ!!!!JJ!!JJJJ!!!JJ!!JJ!!JJ!!!JJ!!JJ!!!!JJ!!JJ~}\200\200~}\200\200JJ!!!JJ!!JJ!!JJ!!!JJ!!JJ!!!!JJ!!JJJJ!!!JJ!!JJ!!JJ!!!JJ!!JJ!!!!JJ!!JJ~}\200\200~}\200\200JJ!!!JJ!!JJ!!JJ!!!JJ!!JJ!!!!JJ!!JJJJ!!!JJ!!JJ!!JJ!!!JJ!!JJ!!!!JJ!!JJ~}\200\200~}\200\200JJ!!!JJ!!JJ!!JJ!!!JJ!!JJ!!!!JJ!!JJJJ!!!JJ!!JJ!!JJ!!!JJ!!JJ!!!!JJ!!JJ!" + "'", str2, "~}\200\200~}\200\200JJ!!!JJ!!JJ!!JJ!!!JJ!!JJ!!!!JJ!!JJJJ!!!JJ!!JJ!!JJ!!!JJ!!JJ!!!!JJ!!JJ~}\200\200~}\200\200JJ!!!JJ!!JJ!!JJ!!!JJ!!JJ!!!!JJ!!JJJJ!!!JJ!!JJ!!JJ!!!JJ!!JJ!!!!JJ!!JJ~}\200\200~}\200\200JJ!!!JJ!!JJ!!JJ!!!JJ!!JJ!!!!JJ!!JJJJ!!!JJ!!JJ!!JJ!!!JJ!!JJ!!!!JJ!!JJ~}\200\200~}\200\200JJ!!!JJ!!JJ!!JJ!!!JJ!!JJ!!!!JJ!!JJJJ!!!JJ!!JJ!!JJ!!!JJ!!JJ!!!!JJ!!JJ~}\200\200~}\200\200JJ!!!JJ!!JJ!!JJ!!!JJ!!JJ!!!!JJ!!JJJJ!!!JJ!!JJ!!JJ!!!JJ!!JJ!!!!JJ!!JJ~}\200\200~}\200\200JJ!!!JJ!!JJ!!JJ!!!JJ!!JJ!!!!JJ!!JJJJ!!!JJ!!JJ!!JJ!!!JJ!!JJ!!!!JJ!!JJ~}\200\200~}\200\200JJ!!!JJ!!JJ!!JJ!!!JJ!!JJ!!!!JJ!!JJJJ!!!JJ!!JJ!!JJ!!!JJ!!JJ!!!!JJ!!JJ~}\200\200~}\200\200JJ!!!JJ!!JJ!!JJ!!!JJ!!JJ!!!!JJ!!JJJJ!!!JJ!!JJ!!JJ!!!JJ!!JJ!!!!JJ!!JJ!");
    }

    @Test
    public void test11204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11204");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!\253\256\256]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230\200}}`l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256]!LNN!LNN!LNN!LNNNNNNNNNN]!LNN!LNN!LNN!LNNNNNNNNNN]!LNN!LNN!LNN!LNNNNNNNNNN]!LNN!LNN!LNN!LNNNNNNNNNN]!LNN!LNN!LNN!LNNNNNNNNNN]!LNN!LNN!LNN!LNNNNNNNNNN]!LNN!LNN!LNN!LNNNNNNNNNN]!LNN!LNN!LNN!LNNNNNNNNNN]!LNN!LNN!LNN!LNNNNNNNNNN]!LNN!LNN!LNN!LNNNNNNNNNN]!LNN!LNN!LNN!LNNNNNNNNNN]!LNN!LNN!LNN!LNNNNNNNNNN!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!LNN!LNN!LNN!LNNNNNNNNNN]!LNN!LNN!LNN!LNNNNNNNNNN]!LNN!LNN!LNN!LNNNNNNNNNN]!LNN!LNN!LNN!LNNNNNNNNNN]!LNN!LNN!LNN!LNNNNNNNNNN]!LNN!LNN!LNN!LNNNNNNNNNN]!LNN!LNN!LNN!LNNNNNNNNNN]!LNN!LNN!LNN!LNNNNNNNNNN]!LNN!LNN!LNN!LNNNNNNNNNN]!LNN!LNN!LNN!LNNNNNNNNNN]!LNN!LNN!LNN!LNNNNNNNNNN]!LNN!LNN!LNN!LNNNNNNNNNN!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256]!LNN!LNN!LNN!LNNNNNNNNNN]!LNN!LNN!LNN!LNNNNNNNNNN]!LNN!LNN!LNN!LNNNNNNNNNN]!LNN!LNN!LNN!LNNNNNNNNNN]!LNN!LNN!LNN!LNNNNNNNNNN]!LNN!LNN!LNN!LNNNNNNNNNN]!LNN!LNN!LNN!LNNNNNNNNNN]!LNN!LNN!LNN!LNNNNNNNNNN]!LNN!LNN!LNN!LNNNNNNNNNN]!LNN!LNN!LNN!LNNNNNNNNNN]!LNN!LNN!LNN!LNNNNNNNNNN]!LNN!LNN!LNN!LNNNNNNNNNN!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!LNN!LNN!LNN!LNNNNNNNNNN]!LNN!LNN!LNN!LNNNNNNNNNN]!LNN!LNN!LNN!LNNNNNNNNNN]!LNN!LNN!LNN!LNNNNNNNNNN]!LNN!LNN!LNN!LNNNNNNNNNN]!LNN!LNN!LNN!LNNNNNNNNNN]!LNN!LNN!LNN!LNNNNNNNNNN]!LNN!LNN!LNN!LNNNNNNNNNN]!LNN!LNN!LNN!LNNNNNNNNNN]!LNN!LNN!LNN!LNNNNNNNNNN]!LNN!LNN!LNN!LNNNNNNNNNN]!LNN!LNN!LNN!LNNNNNNNNNN!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test11205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11205");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!!", "\u0366\u0365\u0368\u0368\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013f\u013fUU\204\204\u013f\u013f\u013f\u013f\u013f\u013f\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU!!\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU!!\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU!!\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU!!\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU!!\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU!!\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU!!\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU!!!" + "'", str2, "\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU!!\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU!!\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU!!\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU!!\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU!!\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU!!\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU!!\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUU!!!");
    }

    @Test
    public void test11206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11206");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!null!\276\276null!\276\276null!\276\276null!\276\276!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!null!\276\276null!\276\276null!\276\276null!\276\276!!!!!", "`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull`uuunullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!U`UU!\276\276U`UU!\276\276U`UU!\276\276U`UU!\276\276!!!U`UU!\276\276U`UU!\276\276U`UU!\276\276U`UU!\276\276!!!!!U`UU!\276\276U`UU!\276\276U`UU!\276\276U`UU!\276\276!!!U`UU!\276\276U`UU!\276\276U`UU!\276\276U`UU!\276\276!!!!!U`UU!\276\276U`UU!\276\276U`UU!\276\276U`UU!\276\276!!!U`UU!\276\276U`UU!\276\276U`UU!\276\276U`UU!\276\276!!!!!U`UU!\276\276U`UU!\276\276U`UU!\276\276U`UU!\276\276!!!U`UU!\276\276U`UU!\276\276U`UU!\276\276U`UU!\276\276!!!!!U`UU!\276\276U`UU!\276\276U`UU!\276\276U`UU!\276\276!!!U`UU!\276\276U`UU!\276\276U`UU!\276\276U`UU!\276\276!!!!!U`UU!\276\276U`UU!\276\276U`UU!\276\276U`UU!\276\276!!!U`UU!\276\276U`UU!\276\276U`UU!\276\276U`UU!\276\276!!!!!U`UU!\276\276U`UU!\276\276U`UU!\276\276U`UU!\276\276!!!U`UU!\276\276U`UU!\276\276U`UU!\276\276U`UU!\276\276!!!!!U`UU!\276\276U`UU!\276\276U`UU!\276\276U`UU!\276\276!!!U`UU!\276\276U`UU!\276\276U`UU!\276\276U`UU!\276\276!!!!!" + "'", str2, "!U`UU!\276\276U`UU!\276\276U`UU!\276\276U`UU!\276\276!!!U`UU!\276\276U`UU!\276\276U`UU!\276\276U`UU!\276\276!!!!!U`UU!\276\276U`UU!\276\276U`UU!\276\276U`UU!\276\276!!!U`UU!\276\276U`UU!\276\276U`UU!\276\276U`UU!\276\276!!!!!U`UU!\276\276U`UU!\276\276U`UU!\276\276U`UU!\276\276!!!U`UU!\276\276U`UU!\276\276U`UU!\276\276U`UU!\276\276!!!!!U`UU!\276\276U`UU!\276\276U`UU!\276\276U`UU!\276\276!!!U`UU!\276\276U`UU!\276\276U`UU!\276\276U`UU!\276\276!!!!!U`UU!\276\276U`UU!\276\276U`UU!\276\276U`UU!\276\276!!!U`UU!\276\276U`UU!\276\276U`UU!\276\276U`UU!\276\276!!!!!U`UU!\276\276U`UU!\276\276U`UU!\276\276U`UU!\276\276!!!U`UU!\276\276U`UU!\276\276U`UU!\276\276U`UU!\276\276!!!!!U`UU!\276\276U`UU!\276\276U`UU!\276\276U`UU!\276\276!!!U`UU!\276\276U`UU!\276\276U`UU!\276\276U`UU!\276\276!!!!!U`UU!\276\276U`UU!\276\276U`UU!\276\276U`UU!\276\276!!!U`UU!\276\276U`UU!\276\276U`UU!\276\276U`UU!\276\276!!!!!");
    }

    @Test
    public void test11207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11207");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180!", "!!~!!!!!!~!!!!!!!!~!!!!!!~!!!!!!!!~!!!!!!~!!!!!!~!!!!!!~!!!!!!!!~!!!!!!~!!!!!!!!~!!!!!!~!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!nullnull!!!!!nullnull!!!!!nullnull!!!!!nullnull!!!!!nullnull!!!!!nullnull!!!!!nullnull!!!!!nullnull!" + "'", str2, "!!!!!nullnull!!!!!nullnull!!!!!nullnull!!!!!nullnull!!!!!nullnull!!!!!nullnull!!!!!nullnull!!!!!nullnull!");
    }

    @Test
    public void test11208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11208");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!", "!~HH!~HH!!!~HH!~HH!!!~HH!~HH!~HH!~HH!!!~HH!~HH!!!~HH!~HH!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!!" + "'", str2, "H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!!");
    }

    @Test
    public void test11209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11209");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "PNNNPNNNPNNNPNNNPNNNPNNNPNNNPNNN!!PP!!PPPNNNPNNNPNNNPNNNPNNNPNNNPNNNPNNN!!PP!!PPPNNNPNNNPNNNPNNNPNNNPNNNPNNNPNNN!!PP!!PPPNNNPNNNPNNNPNNNPNNNPNNNPNNNPNNN!!PP!!PPPNNNPNNNPNNNPNNNPNNNPNNNPNNNPNNN!!PP!!PPPNNNPNNNPNNNPNNNPNNNPNNNPNNNPNNN!!PP!!PPPNNNPNNNPNNNPNNNPNNNPNNNPNNNPNNN!!PP!!PPPNNNPNNNPNNNPNNNPNNNPNNNPNNNPNNN!!PP!!PP!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test11210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11210");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0346\u0348\u0348\u0348\210\205\206\206\u0348\u0346\u0346!", "!~nullnull!~nullnull\220\220!~nullnull!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220!~nullnull!~nullnull\220\220!~nullnull!~nullnull\220\220!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\210\205\206\206\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\210\205\206\206\u0348\u0346\u0346!");
    }

    @Test
    public void test11211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11211");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullOOOoinullnull!!nullOOOoinullnull!!!", "\276\275UU\276\275UU\214\214\276\275UU\276\275UU\214\214\276\275UU\276\275UU\214\214\276\275UU\276\275UU\214\214\276\275UU\276\275UU\214\214\276\275UU\276\275UU\214\214\276\275UU\276\275UU\214\214\276\275UU\276\275UU\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275UUU\276\276\276U\276\275UUU\275UUU!!\275UUU\276\276\276U\276\275UUU\275UUU!!!" + "'", str2, "\275UUU\276\276\276U\276\275UUU\275UUU!!\275UUU\276\276\276U\276\275UUU\275UUU!!!");
    }

    @Test
    public void test11212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11212");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\276NNN\276NNN\276NNN\276NNN\276NNN!", "\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198nullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\275\275\275\276\275\275\275\276\275\275\275\276\275\275\275\276\275\275\275!" + "'", str2, "\276\275\275\275\276\275\275\275\276\275\275\275\276\275\275\275\276\275\275\275!");
    }

    @Test
    public void test11213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11213");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\260\260\u0108\u0108\260\260\u0108\u0108}}\260\260\u0108\u0108\260\260\u0108\u0108}}!", "}~\200\200}~\200\200!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\260nullnull\260\260nullnull}}\260\260nullnull\260\260nullnull}}!" + "'", str2, "\260\260nullnull\260\260nullnull}}\260\260nullnull\260\260nullnull}}!");
    }

    @Test
    public void test11214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11214");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\253~\256\256\253~\256\256!!\253~\256\256\253~\256\256!!\253~\256\256\253~\256\256\253~\256\256\253~\256\256!!\253~\256\256\253~\256\256!!\253~\256\256\253~\256\256!", "~}\200\200~}\200\200UELLUELLuuUELLUELLuu~}\200\200~}\200\200UELLUELLuuUELLUELLuu~}\200\200~}\200\200UELLUELLuuUELLUELLuu~}\200\200~}\200\200UELLUELLuuUELLUELLuu~}\200\200~}\200\200UELLUELLuuUELLUELLuu~}\200\200~}\200\200UELLUELLuuUELLUELLuu~}\200\200~}\200\200UELLUELLuuUELLUELLuu~}\200\200~}\200\200UELLUELLuuUELLUELLuu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253~\256\256\253~\256\256!!\253~\256\256\253~\256\256!!\253~\256\256\253~\256\256\253~\256\256\253~\256\256!!\253~\256\256\253~\256\256!!\253~\256\256\253~\256\256!" + "'", str2, "\253~\256\256\253~\256\256!!\253~\256\256\253~\256\256!!\253~\256\256\253~\256\256\253~\256\256\253~\256\256!!\253~\256\256\253~\256\256!!\253~\256\256\253~\256\256!");
    }

    @Test
    public void test11215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11215");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\253\254\256\256LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!", "FFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHHFFHHFFHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\253\254\256\256FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF!" + "'", str2, "\253\254\256\256FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF\253\254\256\256FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF!");
    }

    @Test
    public void test11216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11216");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "HH!!HH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test11217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11217");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348nullnullnull!", "\253\253nullnull\253\253nullnull}}\253\253nullnull\253\253nullnull}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348u}}}u}}}u}}}!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348u}}}u}}}u}}}!");
    }

    @Test
    public void test11218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11218");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}}}~\200\200}~\200\200}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test11219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11219");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!", "\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test11220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11220");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!!!!!!!!\200\200!!!!!!!!!!!!!!\200\200!!!!!!!!!!!!!!!!!!!\200\200!!!!!!!!!!!!!!\200\200!!!!!!!!!!!!!!!!!!!\200\200!!!!!!!!!!!!!!\200\200!!!!!!!!!!!!!!!!!!!\200\200!!!!!!!!!!!!!!\200\200!!!!!!!!!!!!!!!!!!!\200\200!!!!!!!!!!!!!!\200\200!!!!!!!!!!!", "\275\u0366\u0366nullnull\200\200\u0366\u0366nullnull\200\200\u0366\u0366nullnull\200\200\276\u0366\u0366nullnull\200\200\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!\200\200!!!!!!!!!!!!!!\200\200!!!!!!!!!!!!!!!!!!!\200\200!!!!!!!!!!!!!!\200\200!!!!!!!!!!!!!!!!!!!\200\200!!!!!!!!!!!!!!\200\200!!!!!!!!!!!!!!!!!!!\200\200!!!!!!!!!!!!!!\200\200!!!!!!!!!!!!!!!!!!!\200\200!!!!!!!!!!!!!!\200\200!!!!!!!!!!!" + "'", str2, "!!!!!!!!!\200\200!!!!!!!!!!!!!!\200\200!!!!!!!!!!!!!!!!!!!\200\200!!!!!!!!!!!!!!\200\200!!!!!!!!!!!!!!!!!!!\200\200!!!!!!!!!!!!!!\200\200!!!!!!!!!!!!!!!!!!!\200\200!!!!!!!!!!!!!!\200\200!!!!!!!!!!!!!!!!!!!\200\200!!!!!!!!!!!!!!\200\200!!!!!!!!!!!");
    }

    @Test
    public void test11221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11221");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\305\306\310\310\305\306\310\310!!\305\306\310\310\305\306\310\310!!!", "!~UU!~UU!~UU!~UU!~UU!~UU!~UU!~UU!!!~UU!~UU!~UU!~UU!~UU!~UU!~UU!~UU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test11222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11222");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!!", "!]]]!]!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!!" + "'", str2, "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!!");
    }

    @Test
    public void test11223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11223");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253uruuuruu\253\253uruuuruu\253\253uruuuruu\253\253uruuuruu\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253uruuuruu\253\253uruuuruu\253\253!", "\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356\352\351\356\356!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253!");
    }

    @Test
    public void test11224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11224");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\200}}`!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU]]!", "}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}\200}}`!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}]]!" + "'", str2, "!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}\200}}`!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}]]!");
    }

    @Test
    public void test11225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11225");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!\340nullnullnullnullnull\300\300nullnull\300\300!!!!!!!", "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullUNLLUNLLUNLLUNLLUNLLuuUNLLUNLLuu!!!!nullUNLLUNLLUNLLUNLLUNLLuuUNLLUNLLuu!!!!!!nullUNLLUNLLUNLLUNLLUNLLuuUNLLUNLLuu!!!!nullUNLLUNLLUNLLUNLLUNLLuuUNLLUNLLuu!!!!!!nullUNLLUNLLUNLLUNLLUNLLuuUNLLUNLLuu!!!!nullUNLLUNLLUNLLUNLLUNLLuuUNLLUNLLuu!!!!!!nullUNLLUNLLUNLLUNLLUNLLuuUNLLUNLLuu!!!!nullUNLLUNLLUNLLUNLLUNLLuuUNLLUNLLuu!!!!!!nullUNLLUNLLUNLLUNLLUNLLuuUNLLUNLLuu!!!!nullUNLLUNLLUNLLUNLLUNLLuuUNLLUNLLuu!!!!!!nullUNLLUNLLUNLLUNLLUNLLuuUNLLUNLLuu!!!!nullUNLLUNLLUNLLUNLLUNLLuuUNLLUNLLuu!!!!!!nullUNLLUNLLUNLLUNLLUNLLuuUNLLUNLLuu!!!!nullUNLLUNLLUNLLUNLLUNLLuuUNLLUNLLuu!!!!!!nullUNLLUNLLUNLLUNLLUNLLuuUNLLUNLLuu!!!!nullUNLLUNLLUNLLUNLLUNLLuuUNLLUNLLuu!!!!!!!" + "'", str2, "nullUNLLUNLLUNLLUNLLUNLLuuUNLLUNLLuu!!!!nullUNLLUNLLUNLLUNLLUNLLuuUNLLUNLLuu!!!!!!nullUNLLUNLLUNLLUNLLUNLLuuUNLLUNLLuu!!!!nullUNLLUNLLUNLLUNLLUNLLuuUNLLUNLLuu!!!!!!nullUNLLUNLLUNLLUNLLUNLLuuUNLLUNLLuu!!!!nullUNLLUNLLUNLLUNLLUNLLuuUNLLUNLLuu!!!!!!nullUNLLUNLLUNLLUNLLUNLLuuUNLLUNLLuu!!!!nullUNLLUNLLUNLLUNLLUNLLuuUNLLUNLLuu!!!!!!nullUNLLUNLLUNLLUNLLUNLLuuUNLLUNLLuu!!!!nullUNLLUNLLUNLLUNLLUNLLuuUNLLUNLLuu!!!!!!nullUNLLUNLLUNLLUNLLUNLLuuUNLLUNLLuu!!!!nullUNLLUNLLUNLLUNLLUNLLuuUNLLUNLLuu!!!!!!nullUNLLUNLLUNLLUNLLUNLLuuUNLLUNLLuu!!!!nullUNLLUNLLUNLLUNLLUNLLuuUNLLUNLLuu!!!!!!nullUNLLUNLLUNLLUNLLUNLLuuUNLLUNLLuu!!!!nullUNLLUNLLUNLLUNLLUNLLuuUNLLUNLLuu!!!!!!!");
    }

    @Test
    public void test11226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11226");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!ll}}ll}}!!!", "LL!!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!!" + "'", str2, "nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!!");
    }

    @Test
    public void test11227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11227");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u014e!\275\275\u014e!\275\275\u014e\u014e\u014e!\275\275\u014e!\275\275\u014e\u014e\u014e!\275\275\u014e!\275\275\u014e\u014e\u014e!\275\275\u014e!\275\275\u014e\u014e\u014e!\275\275\u014e!\275\275\u014e\u014e\u014e!\275\275\u014e!\275\275\u014e\u014e\u014e!\275\275\u014e!\275\275\u014e\u014e\u014e!\275\275\u014e!\275\275\u014e\u014e!", "\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnull!" + "'", str2, "null!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnullnull!\275\275null!\275\275nullnull!");
    }

    @Test
    public void test11228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11228");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!", "\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c\u017c!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!!" + "'", str2, "``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!!");
    }

    @Test
    public void test11229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11229");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260!\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260!\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260!\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260!\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260!", "NLLLNLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260!\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260!\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260!\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260!\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260!" + "'", str2, "!\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260!\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260!\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260!\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260!\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260\255!\260\260\260\260!!\255!\260\260\255!\260\260!");
    }

    @Test
    public void test11230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11230");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!{!!!{!!!{!!!{!!!{!!!{!!!{!!!{!!!", "!!^^\225\230\230!!^^\225\230\230!!^^\225\230\230!!^^\225\230\230\200}}`!!^^\225\230\230!!^^\225\230\230!!^^\225\230\230!!^^\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!{!!!{!!!{!!!{!!!{!!!{!!!{!!!{!!!" + "'", str2, "!{!!!{!!!{!!!{!!!{!!!{!!!{!!!{!!!");
    }

    @Test
    public void test11231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11231");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!!!", "UNLLUNLLUNLLUNLLUNLLUNLLUNLL\200}}`UNLLUNLLUNLLUNLLUNLLUNLLUNLL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]\232\231\234\234\232\231\234\234]]\232\231\234\234\232\231\234\234!!]]\232\231\234\234\232\231\234\234]]\232\231\234\234\232\231\234\234!!]]\232\231\234\234\232\231\234\234]]\232\231\234\234\232\231\234\234!!]]\232\231\234\234\232\231\234\234]]\232\231\234\234\232\231\234\234!!]]\232\231\234\234\232\231\234\234]]\232\231\234\234\232\231\234\234!!]]\232\231\234\234\232\231\234\234]]\232\231\234\234\232\231\234\234!!]]\232\231\234\234\232\231\234\234]]\232\231\234\234\232\231\234\234!!]]\232\231\234\234\232\231\234\234]]\232\231\234\234\232\231\234\234!!!" + "'", str2, "]]\232\231\234\234\232\231\234\234]]\232\231\234\234\232\231\234\234!!]]\232\231\234\234\232\231\234\234]]\232\231\234\234\232\231\234\234!!]]\232\231\234\234\232\231\234\234]]\232\231\234\234\232\231\234\234!!]]\232\231\234\234\232\231\234\234]]\232\231\234\234\232\231\234\234!!]]\232\231\234\234\232\231\234\234]]\232\231\234\234\232\231\234\234!!]]\232\231\234\234\232\231\234\234]]\232\231\234\234\232\231\234\234!!]]\232\231\234\234\232\231\234\234]]\232\231\234\234\232\231\234\234!!]]\232\231\234\234\232\231\234\234]]\232\231\234\234\232\231\234\234!!!");
    }

    @Test
    public void test11232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11232");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLUUL!NLLUU!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLUUL!NLLUU!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLUUL!NLLUU!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLUUL!NLLUU!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLUUL!NLLUU!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLUUL!NLLUU!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLUUL!NLLUU!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLUUL!NLLUU!", "\204nullnullnullnull\204\204\204nullnullnullnull\204\204!!\204nullnullnullnull\204\204\204nullnullnullnull\204\204!!\204nullnullnullnull\204\204\204nullnullnullnull\204\204\204nullnullnullnull\204\204\204nullnullnullnull\204\204!!\204nullnullnullnull\204\204\204nullnullnullnull\204\204!!\204nullnullnullnull\204\204\204nullnullnullnull\204\204!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLNNL!NLLNN!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLNNL!NLLNN!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLNNL!NLLNN!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLNNL!NLLNN!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLNNL!NLLNN!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLNNL!NLLNN!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLNNL!NLLNN!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLNNL!NLLNN!" + "'", str2, "!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLNNL!NLLNN!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLNNL!NLLNN!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLNNL!NLLNN!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLNNL!NLLNN!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLNNL!NLLNN!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLNNL!NLLNN!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLNNL!NLLNN!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLLL!NLLNNL!NLLNN!");
    }

    @Test
    public void test11233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11233");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0153\u0153\u0153\u0153\u0153\u0153\u0153\u0153\u0153\u0153\u0153\u0153nullnullnullnull!", "\260\260uu]]uu]]\260\260uu]]uu]]}}\260\260uu]]uu]]\260\260uu]]uu]]}}!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u}}}nullu}}}u}}}u}}}nullu}}}u}}}u}}}u}}}u}}}nullu}}}u}}}u}}}nullu}}}u}}}u}}}u}}}u}}}u}}}nullu}}}u}}}u}}}u}}}u}}}u}}}nullu}}}u}}}u}}}u}}}u}}}u}}}nullu}}}u}}}u}}}u}}}u}}}u}}}nullu}}}u}}}u}}}u}}}u}}}nullu}}}u}}}u}}}nullu}}}u}}}u}}}u}}}u}}}nullu}}}u}}}u}}}nullu}}}u}}}u}}}u}}}!" + "'", str2, "u}}}nullu}}}u}}}u}}}nullu}}}u}}}u}}}u}}}u}}}nullu}}}u}}}u}}}nullu}}}u}}}u}}}u}}}u}}}u}}}nullu}}}u}}}u}}}u}}}u}}}u}}}nullu}}}u}}}u}}}u}}}u}}}u}}}nullu}}}u}}}u}}}u}}}u}}}u}}}nullu}}}u}}}u}}}u}}}u}}}nullu}}}u}}}u}}}nullu}}}u}}}u}}}u}}}u}}}nullu}}}u}}}u}}}nullu}}}u}}}u}}}u}}}!");
    }

    @Test
    public void test11234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11234");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FFnullnullH~FFH~FF!", "]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]!!]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]!!]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]!!]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]!!]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]]]\275]]]\275]]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]!" + "'", str2, "]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]]\275]]]\275]]]~]]]~]]!");
    }

    @Test
    public void test11235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11235");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\266!!!!ufll\266\266!ufll\266\266!!!!\266!!!!ufll\266\266!ufll\266\266!!!!!!\266!!!!ufll\266\266!ufll\266\266!!!!\266!!!!ufll\266\266!ufll\266\266!!!!!!\266!!!!ufll\266\266!ufll\266\266!!!!\266!!!!ufll\266\266!ufll\266\266!!!!!!\266!!!!ufll\266\266!ufll\266\266!!!!\266!!!!ufll\266\266!ufll\266\266!!!!!!\266!!!!ufll\266\266!ufll\266\266!!!!\266!!!!ufll\266\266!ufll\266\266!!!!!!\266!!!!ufll\266\266!ufll\266\266!!!!\266!!!!ufll\266\266!ufll\266\266!!!!!!\266!!!!ufll\266\266!ufll\266\266!!!!\266!!!!ufll\266\266!ufll\266\266!!!!!!\266!!!!ufll\266\266!ufll\266\266!!!!\266!!!!ufll\266\266!ufll\266\266!!!!!!!", "\225\230\230\230\225\230\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\266!!!!null\230nullnull\266\266!null\230nullnull\266\266!!!!\266!!!!null\230nullnull\266\266!null\230nullnull\266\266!!!!!!\266!!!!null\230nullnull\266\266!null\230nullnull\266\266!!!!\266!!!!null\230nullnull\266\266!null\230nullnull\266\266!!!!!!\266!!!!null\230nullnull\266\266!null\230nullnull\266\266!!!!\266!!!!null\230nullnull\266\266!null\230nullnull\266\266!!!!!!\266!!!!null\230nullnull\266\266!null\230nullnull\266\266!!!!\266!!!!null\230nullnull\266\266!null\230nullnull\266\266!!!!!!\266!!!!null\230nullnull\266\266!null\230nullnull\266\266!!!!\266!!!!null\230nullnull\266\266!null\230nullnull\266\266!!!!!!\266!!!!null\230nullnull\266\266!null\230nullnull\266\266!!!!\266!!!!null\230nullnull\266\266!null\230nullnull\266\266!!!!!!\266!!!!null\230nullnull\266\266!null\230nullnull\266\266!!!!\266!!!!null\230nullnull\266\266!null\230nullnull\266\266!!!!!!\266!!!!null\230nullnull\266\266!null\230nullnull\266\266!!!!\266!!!!null\230nullnull\266\266!null\230nullnull\266\266!!!!!!!" + "'", str2, "\266!!!!null\230nullnull\266\266!null\230nullnull\266\266!!!!\266!!!!null\230nullnull\266\266!null\230nullnull\266\266!!!!!!\266!!!!null\230nullnull\266\266!null\230nullnull\266\266!!!!\266!!!!null\230nullnull\266\266!null\230nullnull\266\266!!!!!!\266!!!!null\230nullnull\266\266!null\230nullnull\266\266!!!!\266!!!!null\230nullnull\266\266!null\230nullnull\266\266!!!!!!\266!!!!null\230nullnull\266\266!null\230nullnull\266\266!!!!\266!!!!null\230nullnull\266\266!null\230nullnull\266\266!!!!!!\266!!!!null\230nullnull\266\266!null\230nullnull\266\266!!!!\266!!!!null\230nullnull\266\266!null\230nullnull\266\266!!!!!!\266!!!!null\230nullnull\266\266!null\230nullnull\266\266!!!!\266!!!!null\230nullnull\266\266!null\230nullnull\266\266!!!!!!\266!!!!null\230nullnull\266\266!null\230nullnull\266\266!!!!\266!!!!null\230nullnull\266\266!null\230nullnull\266\266!!!!!!\266!!!!null\230nullnull\266\266!null\230nullnull\266\266!!!!\266!!!!null\230nullnull\266\266!null\230nullnull\266\266!!!!!!!");
    }

    @Test
    public void test11236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11236");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("L\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLL!", "!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!nullnullnullnullnullnullnullnull\275null!!\275null!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLL!" + "'", str2, "L\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLLL\200LLLLL!");
    }

    @Test
    public void test11237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11237");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!!!!!!!!!!!!!!!\254~\256\256\254~\256\256\254~\256\256\254~\256\256!", "\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!\254~\256\256\254~\256\256\254~\256\256\254~\256\256!" + "'", str2, "!!!!!!!!!!!!!!!!\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
    }

    @Test
    public void test11238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11238");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8ULLLULLLULLLULLLULLLULLLULLLULLL!", "nullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnullnullnullnullnullnullnullnullnullnull\340nullnullnull\340nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210!" + "'", str2, "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210\u020e\u0210\u0210\u0210!");
    }

    @Test
    public void test11239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11239");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300\275\276\300\300!", "\u0366\u0365\u0368\u0368\231\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull!" + "'", str2, "\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull!");
    }

    @Test
    public void test11240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11240");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test11241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11241");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!!!TTTTTTTT!!TTTTTTTT!!!!TTTTTTTT!!TTTTTTTT!!!!TTTTTTTT!!TTTTTTTT!!!!TTTTTTTT!!TTTTTTTT!!!!TTTTTTTT!!TTTTTTTT!!!!TTTTTTTT!!TTTTTTTT!!!!TTTTTTTT!!TTTTTTTT!!!!TTTTTTTT!!TTTTTTTT!", "!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!!!~\200nullnullnullnull~~\200nullnullnullnull~~!~\200nullnullnullnull~~\200nullnullnullnull~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!~~~~~~~~!!~~~~~~~~!!!!~~~~~~~~!!~~~~~~~~!!!!~~~~~~~~!!~~~~~~~~!!!!~~~~~~~~!!~~~~~~~~!!!!~~~~~~~~!!~~~~~~~~!!!!~~~~~~~~!!~~~~~~~~!!!!~~~~~~~~!!~~~~~~~~!!!!~~~~~~~~!!~~~~~~~~!" + "'", str2, "!!!!~~~~~~~~!!~~~~~~~~!!!!~~~~~~~~!!~~~~~~~~!!!!~~~~~~~~!!~~~~~~~~!!!!~~~~~~~~!!~~~~~~~~!!!!~~~~~~~~!!~~~~~~~~!!!!~~~~~~~~!!~~~~~~~~!!!!~~~~~~~~!!~~~~~~~~!!!!~~~~~~~~!!~~~~~~~~!");
    }

    @Test
    public void test11242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11242");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull!!\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull!!\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull!!\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull!!\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull\276nullnullnullnull\266\266~nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test11243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11243");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!", "LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN``LNNNLNNN````LNNNLNNN``LNNNLNNN````!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test11244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11244");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("UU!!````````````UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!````````````UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!", "!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!!!xx!!xx!!xx!!xx!!xx!!xx!!xx!!xx!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!````````````nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test11245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11245");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test11246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11246");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("hnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullffhnullff!", "\275!!!!!!!!!!!!\275!!!!!!!!!!!!\275!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!!!!\275\275!!!!!!!!\275\275!!!!!!!!\275\275!!!!!!!!\275\275\275!!!!!!!!!!!!\275!!!!!!!!!!!!\275!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!!!!\275\275!!!!!!!!\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test11247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11247");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]!", "!nullnullHH!!nullnullnullHH!!nullnull!nullnullHH!!nullnullnullHH!!nullnull!nullnullHH!!nullnullnullHH!!nullnull!nullnullHH!!nullnullnullHH!!nullnull!nullnullHH!!nullnullnullHH!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]!" + "'", str2, "\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\220\220\216\216\220\220\216\216\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]\275\275]]!");
    }

    @Test
    public void test11248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11248");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!Lnullnull!Lnullnull!Lnullnull!Lnullnull!Lnullnull!", "\223]\223\223\223]\223\223!!\223]\223\223\223]\223\223!!\223]\223\223\223]\223\223\223]\223\223\223]\223\223!!\223]\223\223\223]\223\223!!\223]\223\223\223]\223\223!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]\223\223]]\223\223]]!]\223\223]]\223\223]]!]\223\223]]\223\223]]!]\223\223]]\223\223]]!]\223\223]]\223\223]]!" + "'", str2, "!]\223\223]]\223\223]]!]\223\223]]\223\223]]!]\223\223]]\223\223]]!]\223\223]]\223\223]]!]\223\223]]\223\223]]!");
    }

    @Test
    public void test11249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11249");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!~N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!", "\276\u01e0\275\275\276\u01e0\275\275\276\u01e0\275\275\276\u01e0\275\275\276\u01e0\275\275\276\u01e0\275\275\276\u01e0\275\275\276\u01e0\275\275!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0!!!!" + "'", str2, "\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0!!!!");
    }

    @Test
    public void test11250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11250");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0166\u0166\u0166\u0166\260\255\255\225\230\230\u0166\u0166\u0166\u0166\260\255\255\225\230\230\u0166\u0166\u0166\u0166\260\255\255\225\230\230\u0166\u0166\u0166\u0166\260\255\255\225\230\230\200\u0166\u0166\u0166\u0166\260\255\255\225\230\230\u0166\u0166\u0166\u0166\260\255\255\225\230\230\u0166\u0166\u0166\u0166\260\255\255\225\230\230\u0166\u0166\u0166\u0166\260\255\255\225\230\230]]!", "!\275\275\275!!\275\275\275!\275\275\275!\275\275\275!!\275\275\275!\275\275\275!!!\275\275\275!!\275\275\275!\275\275\275!\275\275\275!!\275\275\275!\275\275\275!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\260\255\255\225\230\230nullnullnullnull\260\255\255\225\230\230nullnullnullnull\260\255\255\225\230\230nullnullnullnull\260\255\255\225\230\230\200}}`nullnullnullnull\260\255\255\225\230\230nullnullnullnull\260\255\255\225\230\230nullnullnullnull\260\255\255\225\230\230nullnullnullnull\260\255\255\225\230\230]]!" + "'", str2, "nullnullnullnull\260\255\255\225\230\230nullnullnullnull\260\255\255\225\230\230nullnullnullnull\260\255\255\225\230\230nullnullnullnull\260\255\255\225\230\230\200}}`nullnullnullnull\260\255\255\225\230\230nullnullnullnull\260\255\255\225\230\230nullnullnullnull\260\255\255\225\230\230nullnullnullnull\260\255\255\225\230\230]]!");
    }

    @Test
    public void test11251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11251");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\300!\276\276\300!\276\276\300!\276\276\300!\276\276\300!\276\276\300!\276\276\300!\276\276\300!\276\276!", "\260\260\253\253\260\260\253\253\260\260\253\253\260\260\253\253\260\260\260\260!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!\276\276null!\276\276null!\276\276null!\276\276null!\276\276null!\276\276null!\276\276null!\276\276!" + "'", str2, "null!\276\276null!\276\276null!\276\276null!\276\276null!\276\276null!\276\276null!\276\276null!\276\276!");
    }

    @Test
    public void test11252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11252");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LLUU\275\275\275LLUU\275\275\275!!LLUU\275\275\275LLUU\275\275\275!!LLUU\275\275\275LLUU\275\275\275LLUU\275\275\275LLUU\275\275\275!!LLUU\275\275\275LLUU\275\275\275!!LLUU\275\275\275LLUU\275\275\275!", "FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\275\275\275nullnullnullnull\275\275\275!!nullnullnullnull\275\275\275nullnullnullnull\275\275\275!!nullnullnullnull\275\275\275nullnullnullnull\275\275\275nullnullnullnull\275\275\275nullnullnullnull\275\275\275!!nullnullnullnull\275\275\275nullnullnullnull\275\275\275!!nullnullnullnull\275\275\275nullnullnullnull\275\275\275!" + "'", str2, "nullnullnullnull\275\275\275nullnullnullnull\275\275\275!!nullnullnullnull\275\275\275nullnullnullnull\275\275\275!!nullnullnullnull\275\275\275nullnullnullnull\275\275\275nullnullnullnull\275\275\275nullnullnullnull\275\275\275!!nullnullnullnull\275\275\275nullnullnullnull\275\275\275!!nullnullnullnull\275\275\275nullnullnullnull\275\275\275!");
    }

    @Test
    public void test11253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11253");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!nullnullnull!!!!nullnullnull!!!", "\275null\276\276\275null\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!ijllijllijll!!!!ijllijllijll!!!" + "'", str2, "!!ijllijllijll!!!!ijllijllijll!!!");
    }

    @Test
    public void test11254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11254");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!\253\256\256\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "\200\200}}\200\200}}\200\200}}\200\200\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\200\200}}\200\200}}\200\200}}\200\200\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test11255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11255");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e!", "hfhhHHHhfhhHHHHHhfhhHHHhfhhHHHHHhfhhHHHhfhhHHHHHhfhhHHHhfhhHHHHHhfhhHHHhfhhHHHHHhfhhHHHhfhhHHHHHhfhhHHHhfhhHHHHHhfhhHHHhfhhHHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test11256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11256");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!", "!\253\256\256]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e]!\225\225\225\u014e\u014e!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\256\256\253\253\253\253\253\253\253\253\256\256\253\253\253\253\253\253\253\253!!\256\256\253\253\253\253\253\253\253\253\256\256\253\253\253\253\253\253\253\253!!\256\256\253\253\253\253\253\253\253\253\256\256\253\253\253\253\253\253\253\253!!\256\256\253\253\253\253\253\253\253\253\256\256\253\253\253\253\253\253\253\253!!\256\256\253\253\253\253\253\253\253\253\256\256\253\253\253\253\253\253\253\253!!\256\256\253\253\253\253\253\253\253\253\256\256\253\253\253\253\253\253\253\253!!\256\256\253\253\253\253\253\253\253\253\256\256\253\253\253\253\253\253\253\253!!\256\256\253\253\253\253\253\253\253\253\256\256\253\253\253\253\253\253\253\253!" + "'", str2, "!!\256\256\253\253\253\253\253\253\253\253\256\256\253\253\253\253\253\253\253\253!!\256\256\253\253\253\253\253\253\253\253\256\256\253\253\253\253\253\253\253\253!!\256\256\253\253\253\253\253\253\253\253\256\256\253\253\253\253\253\253\253\253!!\256\256\253\253\253\253\253\253\253\253\256\256\253\253\253\253\253\253\253\253!!\256\256\253\253\253\253\253\253\253\253\256\256\253\253\253\253\253\253\253\253!!\256\256\253\253\253\253\253\253\253\253\256\256\253\253\253\253\253\253\253\253!!\256\256\253\253\253\253\253\253\253\253\256\256\253\253\253\253\253\253\253\253!!\256\256\253\253\253\253\253\253\253\253\256\256\253\253\253\253\253\253\253\253!");
    }

    @Test
    public void test11257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11257");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!\254!", "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\254!" + "'", str2, "!\254!");
    }

    @Test
    public void test11258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11258");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~NNN\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~NNN]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!" + "'", str2, "}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!");
    }

    @Test
    public void test11259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11259");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\303\304\306\306\303\304\306\306\303\304\306\306\303\304\306\306nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\303\304\306\306\303\304\306\306\303\304\306\306\303\304\306\306nullnullnullnullnullnullnullnull!", "\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0135\u0135\u0133\u0133\u0135\u0135\u0133\u0133\u0135\u0135\u0133\u0133\u0135\u0135\u0133\u0133\256I\260\260\256I\260\260\256I\260\260\256I\260\260\256I\260\260\256I\260\260\256I\260\260\256I\260\260\256I\260\260\256I\260\260\256I\260\260\256I\260\260\256I\260\260\256I\260\260\256I\260\260\256I\260\260\u0135\u0135\u0133\u0133\u0135\u0135\u0133\u0133\u0135\u0135\u0133\u0133\u0135\u0135\u0133\u0133\256I\260\260\256I\260\260\256I\260\260\256I\260\260\256I\260\260\256I\260\260\256I\260\260\256I\260\260!" + "'", str2, "\u0135\u0135\u0133\u0133\u0135\u0135\u0133\u0133\u0135\u0135\u0133\u0133\u0135\u0135\u0133\u0133\256I\260\260\256I\260\260\256I\260\260\256I\260\260\256I\260\260\256I\260\260\256I\260\260\256I\260\260\256I\260\260\256I\260\260\256I\260\260\256I\260\260\256I\260\260\256I\260\260\256I\260\260\256I\260\260\u0135\u0135\u0133\u0133\u0135\u0135\u0133\u0133\u0135\u0135\u0133\u0133\u0135\u0135\u0133\u0133\256I\260\260\256I\260\260\256I\260\260\256I\260\260\256I\260\260\256I\260\260\256I\260\260\256I\260\260!");
    }

    @Test
    public void test11260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11260");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\215\215!!\215\215!!\215\215!!\215\215!!\213\213\213\u0346\u0348\u0348!", "}~\200\200}~\200\200NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL}~\200\200}~\200\200NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\215\215!!\215\215!!\215\215!!\215\215!!\213\213\213\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\215\215!!\215\215!!\215\215!!\215\215!!\213\213\213\u0346\u0348\u0348!");
    }

    @Test
    public void test11261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11261");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\u0366\u0365\u0368\u0368\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253!!\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253!!\200\200\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368!\253\253\u0366\u0366\253\253\u0366\u0366\253\253\u0366\u0366\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368!\253\253\u0366\u0366\253\253\u0366\u0366\253\253\u0366\u0366\u0346\u0348\u0348!");
    }

    @Test
    public void test11262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11262");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LNLLLNLL!!LNLLLNLL!!LNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!", "]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test11263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11263");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test11264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11264");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("HHHHHHHH!", "{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnullnullnullnullnullnullnull{|~~{|~~nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test11265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11265");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!~HH!~HH\220\220!~HH!~HH\220\220\220!~HH\220\220\220!~HH\220\220\220!~HH\220\220\220!~HH\220\220!~HH!~HH\220\220!~HH!~HH\220\220!", "NNNNNNNNNNNNNNNN\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~NN!~NN\220\220!~NN!~NN\220\220\220!~NN\220\220\220!~NN\220\220\220!~NN\220\220\220!~NN\220\220!~NN!~NN\220\220!~NN!~NN\220\220!" + "'", str2, "!~NN!~NN\220\220!~NN!~NN\220\220\220!~NN\220\220\220!~NN\220\220\220!~NN\220\220\220!~NN\220\220!~NN!~NN\220\220!~NN!~NN\220\220!");
    }

    @Test
    public void test11266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11266");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnullnullnull\200\200!!\200\200!!\200\200!!\200\200!!!", "\u0346\u0348\u0348\u0348\234\235\237\237\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200\200!!\200\200!!\200\200!!\200\200!!!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200\200!!\200\200!!\200\200!!\200\200!!!");
    }

    @Test
    public void test11267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11267");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0348\u02a0\u02a0\u0348\u0348\u0348\u02a0\u02a0\u0348\u0348\u0348\u02a0\u02a0\u0348\u0348\u0348\u02a0\u02a0\u0348\u0348\u0348\u02a0\u02a0\u0348\u0348\u0348\u02a0\u02a0\u0348\u0348\u0348\u02a0\u02a0\u0348\u0348\u0348\u02a0\u02a0\u0348\u0348\u0348\u02a0\u02a0\u0348\u0348\u0348\u02a0\u02a0\u0348\u0348\u0348\u02a0\u02a0\u0348\u0348\u0348\u02a0\u02a0\u0348\u0348\u0348\u02a0\u02a0\u0348\u0348\u0348\u02a0\u02a0\u0348\u0348\u0348\u02a0\u02a0\u0348\u0348\u0348\u02a0\u02a0\u0348\u0348!!!", "LLLL!~~LLLL!~~LLLL!~~LLLL!~~LLLL!~~LLLL!~~LLLL!~~LLLL!~~LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!~~LLLL!~~LLLL!~~LLLL!~~LLLL!~~LLLL!~~LLLL!~~LLLL!~~LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!!");
    }

    @Test
    public void test11268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11268");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!PP!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test11269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11269");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RRR\275\275RRRRR\275\275RRRR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RRR\275\275RRRRR\275\275RRRR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RRR\275\275RRRRR\275\275RRRR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RRR\275\275RRRRR\275\275RRRR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RRR\275\275RRRRR\275\275RRRR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RRR\275\275RRRRR\275\275RRRR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RRR\275\275RRRRR\275\275RRRR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RR\275\275RRR\275\275RRRRR\275\275RR!", "\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038e\u038enullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UU!" + "'", str2, "UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UU!");
    }

    @Test
    public void test11270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11270");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u0346\u0348\u0348!", "}~\200\200}~\200\200!U!!!!!^!U!!!!!!U!!!!!!U!!!!!^!U!!!!!!U!!!!!}~\200\200}~\200\200!U!!!!!^!U!!!!!!U!!!!!!U!!!!!^!U!!!!!!U!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test11271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11271");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368\u0388\u0386\u0386\u0388\u0386\u0386\u0368\u0368!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!" + "'", str2, "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!");
    }

    @Test
    public void test11272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11272");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!\254!", "NN``NN``NN``NN``NN``NN``NN``NN``!!NN``NN``NN``NN``NN``NN``NN``NN``!!NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``NN``!!NN``NN``NN``NN``NN``NN``NN``NN``!!NN``NN``NN``NN``NN``NN``NN``NN``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\254!" + "'", str2, "!\254!");
    }

    @Test
    public void test11273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11273");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UNNNUNNNNNUNNNUNNNNN!!UNNNUNNNNNUNNNUNNNNN!!UNNNUNNNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNNN!!UNNNUNNNNNUNNNUNNNNN!!UNNNUNNNNNUNNNUNNNNN!", "LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L!!!L!!!!!L!!!L!!!!!!!L!!!L!!!!!L!!!L!!!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!!!L!!!L!!!!!L!!!L!!!!!!!L!!!L!!!!!L!!!L!!!!!!" + "'", str2, "L!!!L!!!!!L!!!L!!!!!!!L!!!L!!!!!L!!!L!!!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!L!!!L!!!!!!!L!!!L!!!!!L!!!L!!!!!!!L!!!L!!!!!L!!!L!!!!!!");
    }

    @Test
    public void test11274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11274");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!", "]\256!\254\254\256!\254\254\256!\254\254\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]]\256!\254\254\256!\254\254\256!\254\254\256!\254\254\256!\254\254]]\256!\254\254\256!\254\254]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test11275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11275");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230!" + "'", str2, "~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230!");
    }

    @Test
    public void test11276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11276");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\230!\225\225\230!\225\225\u026c\u026c\u026c\u026c\230!\225\225\230!\225\225\u026c\u026c\u026c\u026c\230!\225\225\230!\225\225\u026c\u026c\u026c\u026c\230!\225\225\230!\225\225\u026c\u026c\u026c\u026c\230!\225\225\230!\225\225\u026c\u026c\u026c\u026c\230!\225\225\230!\225\225\u026c\u026c\u026c\u026c\230!\225\225\230!\225\225\u026c\u026c\u026c\u026c\230!\225\225\230!\225\225\u026c\u026c\u026c\u026c!", "\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230!\225\225\230!\225\225]nullnullnullnullnullnull]nullnullnullnullnullnull\230!\225\225\230!\225\225]nullnullnullnullnullnull]nullnullnullnullnullnull\230!\225\225\230!\225\225]nullnullnullnullnullnull]nullnullnullnullnullnull\230!\225\225\230!\225\225]nullnullnullnullnullnull]nullnullnullnullnullnull\230!\225\225\230!\225\225]nullnullnullnullnullnull]nullnullnullnullnullnull\230!\225\225\230!\225\225]nullnullnullnullnullnull]nullnullnullnullnullnull\230!\225\225\230!\225\225]nullnullnullnullnullnull]nullnullnullnullnullnull\230!\225\225\230!\225\225]nullnullnullnullnullnull]nullnullnullnullnullnull!" + "'", str2, "\230!\225\225\230!\225\225]nullnullnullnullnullnull]nullnullnullnullnullnull\230!\225\225\230!\225\225]nullnullnullnullnullnull]nullnullnullnullnullnull\230!\225\225\230!\225\225]nullnullnullnullnullnull]nullnullnullnullnullnull\230!\225\225\230!\225\225]nullnullnullnullnullnull]nullnullnullnullnullnull\230!\225\225\230!\225\225]nullnullnullnullnullnull]nullnullnullnullnullnull\230!\225\225\230!\225\225]nullnullnullnullnullnull]nullnullnullnullnullnull\230!\225\225\230!\225\225]nullnullnullnullnullnull]nullnullnullnullnullnull\230!\225\225\230!\225\225]nullnullnullnullnullnull]nullnullnullnullnullnull!");
    }

    @Test
    public void test11277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11277");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("E!LLE!LLLLE!LLE!LLLLE!LLE!LLLLE!LLE!LLLLE!LLE!LLLLE!LLE!LLLLE!LLE!LLLLE!LLE!LLLL!", "\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fanullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228!" + "'", str2, "\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228\u0228!");
    }

    @Test
    public void test11278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11278");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("n]nnn]nn!!n]nnn]nn!!n]nnn]nnn]nnn]nn!!n]nnn]nn!!n]nnn]nn!", "\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276\274\276\276\276\274\276\276\276\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276]\276\276\276]\276\276!!\276]\276\276\276]\276\276!!\276]\276\276\276]\276\276\276]\276\276\276]\276\276!!\276]\276\276\276]\276\276!!\276]\276\276\276]\276\276!" + "'", str2, "\276]\276\276\276]\276\276!!\276]\276\276\276]\276\276!!\276]\276\276\276]\276\276\276]\276\276\276]\276\276!!\276]\276\276\276]\276\276!!\276]\276\276\276]\276\276!");
    }

    @Test
    public void test11279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11279");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0200\u01fd\u01fd\u0200\u01fd\u01fd\u0200\u01fd\u01fd\u0200\u01fd\u01fd\256\u0200\u01fd\u01fd\u0200\u01fd\u01fd\u0200\u01fd\u01fd\u0200\u01fd\u01fd\u0200\u01fd\u01fd\u0200\u01fd\u01fd\u0200\u01fd\u01fd\u0200\u01fd\u01fd\u0200\u01fd\u01fd\u0200\u01fd\u01fd\u0200\u01fd\u01fd\u0200\u01fd\u01fd!", "LL^^\225\230\230LL^^\225\230\230LL^^\225\230\230LL^^\225\230\230\200}}`LL^^\225\230\230LL^^\225\230\230LL^^\225\230\230LL^^\225\230\230]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnull\256null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnull\256null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test11280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11280");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275\276LUUULUUU\275\276LUUULUUU\225\225\275\276LUUULUUU\275\276LUUULUUU\225\225\275\276LUUULUUU\275\276LUUULUUU\225\225\275\276LUUULUUU\275\276LUUULUUU\225\225\275\276LUUULUUU\275\276LUUULUUU\225\225\275\276LUUULUUU\275\276LUUULUUU\225\225\275\276LUUULUUU\275\276LUUULUUU\225\225\275\276LUUULUUU\275\276LUUULUUU\225\225!", "UNLLUNLLUNLLUNLL\236\276\276UNLLUNLLUNLLUNLL\236\276\276!!UNLLUNLLUNLLUNLL\236\276\276UNLLUNLLUNLLUNLL\236\276\276!!UNLLUNLLUNLLUNLL\236\276\276UNLLUNLLUNLLUNLL\236\276\276UNLLUNLLUNLLUNLL\236\276\276UNLLUNLLUNLLUNLL\236\276\276!!UNLLUNLLUNLLUNLL\236\276\276UNLLUNLLUNLLUNLL\236\276\276!!UNLLUNLLUNLLUNLL\236\276\276UNLLUNLLUNLLUNLL\236\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276LNNNLNNN\275\276LNNNLNNN\225\225\275\276LNNNLNNN\275\276LNNNLNNN\225\225\275\276LNNNLNNN\275\276LNNNLNNN\225\225\275\276LNNNLNNN\275\276LNNNLNNN\225\225\275\276LNNNLNNN\275\276LNNNLNNN\225\225\275\276LNNNLNNN\275\276LNNNLNNN\225\225\275\276LNNNLNNN\275\276LNNNLNNN\225\225\275\276LNNNLNNN\275\276LNNNLNNN\225\225!" + "'", str2, "\275\276LNNNLNNN\275\276LNNNLNNN\225\225\275\276LNNNLNNN\275\276LNNNLNNN\225\225\275\276LNNNLNNN\275\276LNNNLNNN\225\225\275\276LNNNLNNN\275\276LNNNLNNN\225\225\275\276LNNNLNNN\275\276LNNNLNNN\225\225\275\276LNNNLNNN\275\276LNNNLNNN\225\225\275\276LNNNLNNN\275\276LNNNLNNN\225\225\275\276LNNNLNNN\275\276LNNNLNNN\225\225!");
    }

    @Test
    public void test11281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11281");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!!!\316null\313\313\316null\313\313!!\316null\313\313\316null\313\313!!!!\316null\313\313\316null\313\313!!\316null\313\313\316null\313\313!!!!\316null\313\313\316null\313\313!!\316null\313\313\316null\313\313!!!!\316null\313\313\316null\313\313!!\316null\313\313\316null\313\313!!!!\316null\313\313\316null\313\313!!\316null\313\313\316null\313\313!!!!\316null\313\313\316null\313\313!!\316null\313\313\316null\313\313!!!!\316null\313\313\316null\313\313!!\316null\313\313\316null\313\313!!!!\316null\313\313\316null\313\313!!\316null\313\313\316null\313\313!", "LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU~}}^LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!!!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!!!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!!!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!!!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!!!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!!!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!!!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!" + "'", str2, "!!!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!!!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!!!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!!!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!!!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!!!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!!!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!!!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!!nullnull\344\342\342nullnullnullnull\344\342\342nullnull!");
    }

    @Test
    public void test11282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11282");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\200\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230]]!", "]^``]^``!!]^``]^``!!]^``]^``]^``]^``!!]^``]^``!!]^``]^``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\200\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230]]!" + "'", str2, "\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\200\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230]]!");
    }

    @Test
    public void test11283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11283");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u032d\200\200\u032d\200\200\u032d\200\200\u032d\200\200\u032e\u0330\u0330\u0330\u032e\u0330\u0330\u0330\u032e\u0330\u0330\u0330\u032e\u0330\u0330\u0330\u032d\200\200\u032d\200\200\u032d\200\200\u032d\200\200\u032e\u0330\u0330\u0330\u032e\u0330\u0330\u0330!", "\276\u011d\u011dnullnull\275\275\276\u011d\u011dnullnull\275\275\u011d\u011d\u011d\u011d\u011d\u011d\u011d\u011d!nullnull\276\u011d\u011dnullnull\275\275\276\u011d\u011dnullnull\275\275\u011d\u011d\u011d\u011d\u011d\u011d\u011d\u011d!nullnull\276\u011d\u011dnullnull\275\275\276\u011d\u011dnullnull\275\275\u011d\u011d\u011d\u011d\u011d\u011d\u011d\u011d!nullnull\276\u011d\u011dnullnull\275\275\276\u011d\u011dnullnull\275\275\u011d\u011d\u011d\u011d\u011d\u011d\u011d\u011d!nullnull\276\u011d\u011dnullnull\275\275\276\u011d\u011dnullnull\275\275\u011d\u011d\u011d\u011d\u011d\u011d\u011d\u011d!nullnull\276\u011d\u011dnullnull\275\275\276\u011d\u011dnullnull\275\275\u011d\u011d\u011d\u011d\u011d\u011d\u011d\u011d!nullnull\276\u011d\u011dnullnull\275\275\276\u011d\u011dnullnull\275\275\u011d\u011d\u011d\u011d\u011d\u011d\u011d\u011d!nullnull\276\u011d\u011dnullnull\275\275\276\u011d\u011dnullnull\275\275\u011d\u011d\u011d\u011d\u011d\u011d\u011d\u011d!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u032d\200\200\u032d\200\200\u032d\200\200\u032d\200\200\u032e\u0330\u0330\u0330\u032e\u0330\u0330\u0330\u032e\u0330\u0330\u0330\u032e\u0330\u0330\u0330\u032d\200\200\u032d\200\200\u032d\200\200\u032d\200\200\u032e\u0330\u0330\u0330\u032e\u0330\u0330\u0330!" + "'", str2, "\u032d\200\200\u032d\200\200\u032d\200\200\u032d\200\200\u032e\u0330\u0330\u0330\u032e\u0330\u0330\u0330\u032e\u0330\u0330\u0330\u032e\u0330\u0330\u0330\u032d\200\200\u032d\200\200\u032d\200\200\u032d\200\200\u032e\u0330\u0330\u0330\u032e\u0330\u0330\u0330!");
    }

    @Test
    public void test11284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11284");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11285");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276!" + "'", str2, "nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276!");
    }

    @Test
    public void test11286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11286");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullijllnullnullnullijllnullnull\253\253nullijllnullnullnullijllnullnull\253\253nullijllnullnullnullijllnullnull\253\253nullijllnullnullnullijllnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullijllnullnullnullijllnullnull\253\253nullijllnullnullnullijllnullnull\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11287");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("l!nnl!nnnullnulll!nnl!nnnullnull!", "rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u016e\u016b\u016b\u016e\u016b\u016b\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016e\u016b\u016b\u016e\u016b\u016b\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e!" + "'", str2, "\u016e\u016b\u016b\u016e\u016b\u016b\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016e\u016b\u016b\u016e\u016b\u016b\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e!");
    }

    @Test
    public void test11288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11288");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!!!XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!!!XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!!!XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!!!XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!!!XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!!!XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!!!XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!XVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVVXVVV!!!!!!!", "}T!!!\200\200}T!!!\200\200}T!!!\200\200}T!!!\200\200T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~}T!!!\200\200}T!!!\200\200}T!!!\200\200}T!!!\200\200T!~~T!~~T!~~T!~~T!~~T!~~T!~~T!~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!!!" + "'", str2, "!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!!!!!");
    }

    @Test
    public void test11289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11289");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!" + "'", str2, "!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!");
    }

    @Test
    public void test11290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11290");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("l!!!l!!!LLl!!!l!!!LLl!!!l!!!LLl!!!l!!!LLl!!!l!!!LLl!!!l!!!LLl!!!l!!!LLl!!!l!!!LL!", "!!nullnull\300\300nullnull\300\300!!nullnull\300\300nullnull\300\300!!!!nullnull\300\300nullnull\300\300!!nullnull\300\300nullnull\300\300!!!!nullnull\300\300nullnull\300\300!!nullnull\300\300nullnull\300\300!!!!nullnull\300\300nullnull\300\300!!nullnull\300\300nullnull\300\300!!!!nullnull\300\300nullnull\300\300!!nullnull\300\300nullnull\300\300!!!!nullnull\300\300nullnull\300\300!!nullnull\300\300nullnull\300\300!!!!nullnull\300\300nullnull\300\300!!nullnull\300\300nullnull\300\300!!!!nullnull\300\300nullnull\300\300!!nullnull\300\300nullnull\300\300!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\300!!!\300!!!\300\300\300!!!\300!!!\300\300\300!!!\300!!!\300\300\300!!!\300!!!\300\300\300!!!\300!!!\300\300\300!!!\300!!!\300\300\300!!!\300!!!\300\300\300!!!\300!!!\300\300!" + "'", str2, "\300!!!\300!!!\300\300\300!!!\300!!!\300\300\300!!!\300!!!\300\300\300!!!\300!!!\300\300\300!!!\300!!!\300\300\300!!!\300!!!\300\300\300!!!\300!!!\300\300\300!!!\300!!!\300\300!");
    }

    @Test
    public void test11291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11291");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LNNNLNNNLLLLLLLLLLLLLLLLLNNNLNNN!", "^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!^```^```!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````````````````````````````````!" + "'", str2, "````````````````````````````````!");
    }

    @Test
    public void test11292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11292");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\200}}`\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231]]!", "!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!]!!!]!!!]!!!]!!!]!!!]!!!]!!!]!!null!]!!nullnullnull!]!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\200}}`\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231]]!" + "'", str2, "\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\200}}`\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231\227\227\231\231]]!");
    }

    @Test
    public void test11293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11293");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa!!!", "~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa!!!" + "'", str2, "\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa!!!");
    }

    @Test
    public void test11294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11294");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull\336\335\340\340\336\335\340\340nullnull!", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\204\204!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test11295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11295");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!", "!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!LL!!LL!!!!LL!!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
    }

    @Test
    public void test11296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11296");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "!!ijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijll!!ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11297");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LULLLULL\253\253LULLLULL\253\253LULLLULL\253\253LULLLULL\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LULLLULL\253\253LULLLULL\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!" + "'", str2, "LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
    }

    @Test
    public void test11298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11298");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u014c\u016e\u016c\u016c\u016e\u016c\u016c\u014c\u016e\u016c\u016c\u016e\u016c\u016c\u014c\u016e\u016c\u016c\u016e\u016c\u016c\u014c\u016e\u016c\u016c\u016e\u016c\u016c\u014c\u016e\u016c\u016c\u016e\u016c\u016c!", "LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u019c\u019c\u019c\u019c\u019c\u019c\u019c\u019c\u019c\u019c\u019c\u019c\u019c\u019c\u019c\u019c\u019c\u019c\u019c\u019cnullnull!" + "'", str2, "\u019c\u019c\u019c\u019c\u019c\u019c\u019c\u019c\u019c\u019c\u019c\u019c\u019c\u019c\u019c\u019c\u019c\u019c\u019c\u019cnullnull!");
    }

    @Test
    public void test11299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11299");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u0357\u035a\u035a\u0357\u035a\u035a\u0357\u035a\u035a\u0357\u035a\u035a\u0357\u035a\u035a\u0357\u035a\u035a\u0357\u035a\u035a\u0357\u035a\u035a\u0357\u035a\u035a\u0357\u035a\u035a\u0357\u035a\u035a\u0357\u035a\u035a\u0357\u035a\u035a\u0357\u035a\u035a\u0357\u035a\u035a\u0357\u035a\u035a\u0346\u0348\u0348!", "UNNNUNNNNNUNNNUNNNNN!!UNNNUNNNNNUNNNUNNNNN!!UNNNUNNNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNNN!!UNNNUNNNNNUNNNUNNNNN!!UNNNUNNNNNUNNNUNNNNN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\340\333\u0357\u035a\u035a\340\333\u0357\u035a\u035a\340\333\u0357\u035a\u035a\340\333\u0357\u035a\u035a\340\333\u0357\u035a\u035a\340\333\u0357\u035a\u035a\340\333\u0357\u035a\u035a\340\333\u0357\u035a\u035a\340\333\u0357\u035a\u035a\340\333\u0357\u035a\u035a\340\333\u0357\u035a\u035a\340\333\u0357\u035a\u035a\340\333\u0357\u035a\u035a\340\333\u0357\u035a\u035a\340\333\u0357\u035a\u035a\340\333\u0357\u035a\u035a\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\340\333\u0357\u035a\u035a\340\333\u0357\u035a\u035a\340\333\u0357\u035a\u035a\340\333\u0357\u035a\u035a\340\333\u0357\u035a\u035a\340\333\u0357\u035a\u035a\340\333\u0357\u035a\u035a\340\333\u0357\u035a\u035a\340\333\u0357\u035a\u035a\340\333\u0357\u035a\u035a\340\333\u0357\u035a\u035a\340\333\u0357\u035a\u035a\340\333\u0357\u035a\u035a\340\333\u0357\u035a\u035a\340\333\u0357\u035a\u035a\340\333\u0357\u035a\u035a\u0346\u0348\u0348!");
    }

    @Test
    public void test11300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11300");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\270U\270\270\270U\270\270!!\270U\270\270\270U\270\270!!\270U\270\270\270U\270\270!!\270U\270\270\270U\270\270!!\270U\270\270\270U\270\270!!\270U\270\270\270U\270\270!!\270U\270\270\270U\270\270!!\270U\270\270\270U\270\270!!!", "]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256!!]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256!!]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256!!]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256!!]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256!!]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256!!]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256!!]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256]nullnull~~!!\254\253\256\256\254\253\256\256\254\253\256\256!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\270\256\270\270\270\256\270\270!!\270\256\270\270\270\256\270\270!!\270\256\270\270\270\256\270\270!!\270\256\270\270\270\256\270\270!!\270\256\270\270\270\256\270\270!!\270\256\270\270\270\256\270\270!!\270\256\270\270\270\256\270\270!!\270\256\270\270\270\256\270\270!!!" + "'", str2, "\270\256\270\270\270\256\270\270!!\270\256\270\270\270\256\270\270!!\270\256\270\270\270\256\270\270!!\270\256\270\270\270\256\270\270!!\270\256\270\270\270\256\270\270!!\270\256\270\270\270\256\270\270!!\270\256\270\270\270\256\270\270!!\270\256\270\270\270\256\270\270!!!");
    }

    @Test
    public void test11301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11301");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!", "dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```dddd```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!" + "'", str2, "!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!!!\276!!!\276!!!");
    }

    @Test
    public void test11302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11302");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200`!!!`!!!}~\200\200}~\200\200\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11303");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150\u014c\u014e\u0150\u0150!!!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullHnullnullnullHnullnull!!nullHnullnullnullHnullnull!!nullHnullnullnullHnullnull!!nullHnullnullnullHnullnull!!nullHnullnullnullHnullnull!!nullHnullnullnullHnullnull!!nullHnullnullnullHnullnull!!nullHnullnullnullHnullnull!!!" + "'", str2, "nullHnullnullnullHnullnull!!nullHnullnullnullHnullnull!!nullHnullnullnullHnullnull!!nullHnullnullnullHnullnull!!nullHnullnullnullHnullnull!!nullHnullnullnullHnullnull!!nullHnullnullnullHnullnull!!nullHnullnullnullHnullnull!!!");
    }

    @Test
    public void test11304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11304");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253!LL\253\253LL\253\253LL\253\253!LL\253\253LL\253\253LL\253\253!LL\253\253LL\253\253LL\253\253!LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253!LL\253\253LL\253\253LL\253\253!LL\253\253LL\253\253LL\253\253!", "~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253!nullnull\253\253nullnull\253\253nullnull\253\253!nullnull\253\253nullnull\253\253nullnull\253\253!nullnull\253\253nullnull\253\253nullnull\253\253!nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253!nullnull\253\253nullnull\253\253nullnull\253\253!nullnull\253\253nullnull\253\253nullnull\253\253!" + "'", str2, "nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253!nullnull\253\253nullnull\253\253nullnull\253\253!nullnull\253\253nullnull\253\253nullnull\253\253!nullnull\253\253nullnull\253\253nullnull\253\253!nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253nullnull\253\253!nullnull\253\253nullnull\253\253nullnull\253\253!nullnull\253\253nullnull\253\253nullnull\253\253!");
    }

    @Test
    public void test11305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11305");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!!!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!!!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!!!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!!!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!!!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!!!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!!!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!~L!!\225\225!!!", "\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010d\u010dnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!!!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!!!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!!!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!!!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!!!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!!!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!!!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!!!" + "'", str2, "!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!!!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!!!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!!!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!!!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!!!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!!!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!!!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!~U!!\225\225!!!");
    }

    @Test
    public void test11306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11306");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330\325\340\330\330!", "t\220!!\200~~t\220!!\200~~t\220!!t\220!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!t\220!!\200~~t\220!!\200~~t\220!!t\220!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test11307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11307");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("VV\275\275VV\275\275!!VV\275\275VV\275\275!!VV\275\275VV\275\275VV\275\275VV\275\275!!VV\275\275VV\275\275!!VV\275\275VV\275\275!", "Le!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!llLe!lle!lle!ll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL\275\275LL\275\275!!LL\275\275LL\275\275!!LL\275\275LL\275\275LL\275\275LL\275\275!!LL\275\275LL\275\275!!LL\275\275LL\275\275!" + "'", str2, "LL\275\275LL\275\275!!LL\275\275LL\275\275!!LL\275\275LL\275\275LL\275\275LL\275\275!!LL\275\275LL\275\275!!LL\275\275LL\275\275!");
    }

    @Test
    public void test11308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11308");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!H!nullnullH!nullnull!!!", "!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!!" + "'", str2, "`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!`!!```!````!!```!```!!!");
    }

    @Test
    public void test11309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11309");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("E!LLE!LL!LLL!LLLE!LLE!LL!LLL!LLL!!E!LLE!LL!LLL!LLLE!LLE!LL!LLL!LLL!!E!LLE!LL!LLL!LLLE!LLE!LL!LLL!LLLE!LLE!LL!LLL!LLLE!LLE!LL!LLL!LLL!!E!LLE!LL!LLL!LLLE!LLE!LL!LLL!LLL!!E!LLE!LL!LLL!LLLE!LLE!LL!LLL!LLL!", "\300!!!\300!!!\300\300\300!!!\300!!!\300\300\300!!!\300!!!\300\300\300!!!\300!!!\300\300\300!!!\300!!!\300\300\300!!!\300!!!\300\300\300!!!\300!!!\300\300\300!!!\300!!!\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnull!nullnullnull!nullnullnullnull!nullnullnull!nullnull!nullnullnull!nullnullnull!!null!nullnullnull!nullnull!nullnullnull!nullnullnullnull!nullnullnull!nullnull!nullnullnull!nullnullnull!!null!nullnullnull!nullnull!nullnullnull!nullnullnullnull!nullnullnull!nullnull!nullnullnull!nullnullnullnull!nullnullnull!nullnull!nullnullnull!nullnullnullnull!nullnullnull!nullnull!nullnullnull!nullnullnull!!null!nullnullnull!nullnull!nullnullnull!nullnullnullnull!nullnullnull!nullnull!nullnullnull!nullnullnull!!null!nullnullnull!nullnull!nullnullnull!nullnullnullnull!nullnullnull!nullnull!nullnullnull!nullnullnull!" + "'", str2, "null!nullnullnull!nullnull!nullnullnull!nullnullnullnull!nullnullnull!nullnull!nullnullnull!nullnullnull!!null!nullnullnull!nullnull!nullnullnull!nullnullnullnull!nullnullnull!nullnull!nullnullnull!nullnullnull!!null!nullnullnull!nullnull!nullnullnull!nullnullnullnull!nullnullnull!nullnull!nullnullnull!nullnullnullnull!nullnullnull!nullnull!nullnullnull!nullnullnullnull!nullnullnull!nullnull!nullnullnull!nullnullnull!!null!nullnullnull!nullnull!nullnullnull!nullnullnullnull!nullnullnull!nullnull!nullnullnull!nullnullnull!!null!nullnullnull!nullnull!nullnullnull!nullnullnullnull!nullnullnull!nullnull!nullnullnull!nullnullnull!");
    }

    @Test
    public void test11310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11310");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0346\u0348\u0348\u0348\275\275\275\275\u0348\u0346\u0346!", "JILLJILLJILLJILLJILLJILLJILLJILL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\275\275\275\275\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\275\275\275\275\u0348\u0346\u0346!");
    }

    @Test
    public void test11311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11311");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!", "\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300\275\300\300\300\275\300\300\300\300\300!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\300\300\300\300\u0348\u0348\300\300\300\300\u0348\u0348!!\300\300\300\300\u0348\u0348\300\300\300\300\u0348\u0348!!\300\300\300\300\u0348\u0348\300\300\300\300\u0348\u0348\300\300\300\300\u0348\u0348\300\300\300\300\u0348\u0348!!\300\300\300\300\u0348\u0348\300\300\300\300\u0348\u0348!!\300\300\300\300\u0348\u0348\300\300\300\300\u0348\u0348!" + "'", str2, "\300\300\300\300\u0348\u0348\300\300\300\300\u0348\u0348!!\300\300\300\300\u0348\u0348\300\300\300\300\u0348\u0348!!\300\300\300\300\u0348\u0348\300\300\300\300\u0348\u0348\300\300\300\300\u0348\u0348\300\300\300\300\u0348\u0348!!\300\300\300\300\u0348\u0348\300\300\300\300\u0348\u0348!!\300\300\300\300\u0348\u0348\300\300\300\300\u0348\u0348!");
    }

    @Test
    public void test11312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11312");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!!", "!\253\256\256\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!!" + "'", str2, "^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!!");
    }

    @Test
    public void test11313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11313");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212!!null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212!!null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212!!null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212!!null~\210null\212\212\210null\212\212null~\210null\212\212\210null\212\212!", "LL]LLLLLL]LLLLLL]LLLLLL]LLLL!LL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLL!LL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLL!LL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLL!LL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLL!LL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLL!LL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLL!LL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLL!LL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLLLL]LLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0308\u0308~\210\u0308\u0308\212\212\210\u0308\u0308\212\212\u0308\u0308~\210\u0308\u0308\212\212\210\u0308\u0308\212\212\u0308\u0308~\210\u0308\u0308\212\212\210\u0308\u0308\212\212\u0308\u0308~\210\u0308\u0308\212\212\210\u0308\u0308\212\212\u0308\u0308~\210\u0308\u0308\212\212\210\u0308\u0308\212\212\u0308\u0308~\210\u0308\u0308\212\212\210\u0308\u0308\212\212\u0308\u0308~\210\u0308\u0308\212\212\210\u0308\u0308\212\212\u0308\u0308~\210\u0308\u0308\212\212\210\u0308\u0308\212\212\u0308\u0308~\210\u0308\u0308\212\212\210\u0308\u0308\212\212\u0308\u0308~\210\u0308\u0308\212\212\210\u0308\u0308\212\212\u0308\u0308~\210\u0308\u0308\212\212\210\u0308\u0308\212\212\u0308\u0308~\210\u0308\u0308\212\212\210\u0308\u0308\212\212!" + "'", str2, "\u0308\u0308~\210\u0308\u0308\212\212\210\u0308\u0308\212\212\u0308\u0308~\210\u0308\u0308\212\212\210\u0308\u0308\212\212\u0308\u0308~\210\u0308\u0308\212\212\210\u0308\u0308\212\212\u0308\u0308~\210\u0308\u0308\212\212\210\u0308\u0308\212\212\u0308\u0308~\210\u0308\u0308\212\212\210\u0308\u0308\212\212\u0308\u0308~\210\u0308\u0308\212\212\210\u0308\u0308\212\212\u0308\u0308~\210\u0308\u0308\212\212\210\u0308\u0308\212\212\u0308\u0308~\210\u0308\u0308\212\212\210\u0308\u0308\212\212\u0308\u0308~\210\u0308\u0308\212\212\210\u0308\u0308\212\212\u0308\u0308~\210\u0308\u0308\212\212\210\u0308\u0308\212\212\u0308\u0308~\210\u0308\u0308\212\212\210\u0308\u0308\212\212\u0308\u0308~\210\u0308\u0308\212\212\210\u0308\u0308\212\212!");
    }

    @Test
    public void test11314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11314");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204!", "ULLLULLL!!\256\254\254ULLLULLL!!\256\254\254!!ULLLULLL!!\256\254\254ULLLULLL!!\256\254\254!!ULLLULLL!!\256\254\254ULLLULLL!!\256\254\254!!ULLLULLL!!\256\254\254ULLLULLL!!\256\254\254!!ULLLULLL!!\256\254\254ULLLULLL!!\256\254\254!!ULLLULLL!!\256\254\254ULLLULLL!!\256\254\254!!ULLLULLL!!\256\254\254ULLLULLL!!\256\254\254!!ULLLULLL!!\256\254\254ULLLULLL!!\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204!" + "'", str2, "]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204]!!!\201\204\204!");
    }

    @Test
    public void test11315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11315");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\335LLL\335nullLL\335nullLL\335nullLL\335nullLL\335LLL\335nullLL\335nullLL!", "!\253\256\256\266null!nullnull\271\271\266null!nullnull\271\271\266null!nullnull\271\271\266null!nullnull\271\271\266null!nullnull\271\271\266null!nullnull\271\271\266null!nullnull\271\271\266null!nullnull\271\271\266null!nullnull\271\271\266null!nullnull\271\271\266null!nullnull\271\271\266null!nullnull\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266null!nullnull\271\271\266null!nullnull\271\271\266null!nullnull\271\271\266null!nullnull\271\271\266null!nullnull\271\271\266null!nullnull\271\271\266null!nullnull\271\271\266null!nullnull\271\271\266null!nullnull\271\271\266null!nullnull\271\271\266null!nullnull\271\271\266null!nullnull\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LUUULL\266UUUULL\266UUUULL\266UUUULL\266UUUULUUULL\266UUUULL\266UUUU!" + "'", str2, "LUUULL\266UUUULL\266UUUULL\266UUUULL\266UUUULUUULL\266UUUULL\266UUUU!");
    }

    @Test
    public void test11316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11316");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "nullhnullnullnullhnullnull\255\256\260\260\255\256\260\260nullhnullnullnullhnullnull\255\256\260\260\255\256\260\260nullhnullnullnullhnullnull\255\256\260\260\255\256\260\260nullhnullnullnullhnullnull\255\256\260\260\255\256\260\260nullhnullnullnullhnullnull\255\256\260\260\255\256\260\260nullhnullnullnullhnullnull\255\256\260\260\255\256\260\260nullhnullnullnullhnullnull\255\256\260\260\255\256\260\260nullhnullnullnullhnullnull\255\256\260\260\255\256\260\260!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11317");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!LNUU!!!!", "\275!~!!!~!!!~!!\276!~!!\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!" + "'", str2, "nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!");
    }

    @Test
    public void test11318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11318");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341````\341\341``\341\341````\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341````\341\341``\341\341````\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341````\341\341``\341\341````\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341````\341\341``\341\341````\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341````\341\341``\341\341````\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341````\341\341``\341\341````\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341````\341\341``\341\341````\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341``\341\341````\341\341``\341\341````!", "EEEEEEEEEEEEEEEE\200}}`EEEEEEEEEEEEEEEE]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````!" + "'", str2, "nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull````nullnull``nullnull````!");
    }

    @Test
    public void test11319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11319");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull!" + "'", str2, "~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull~}\200\200~}\200\200nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test11320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11320");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!", "LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!LLLLLL!!LL!!LL!!\256\254\254LLLLLL!!LL!!LL!!\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test11321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11321");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!nullnull!!nullnull!", "\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test11322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11322");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc\u01fc!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!" + "'", str2, "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!");
    }

    @Test
    public void test11323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11323");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("uuuuUUUUUUUUUUUU\256\254\254uuuuUUUUUUUUUUUU\256\254\254!!uuuuUUUUUUUUUUUU\256\254\254uuuuUUUUUUUUUUUU\256\254\254!!uuuuUUUUUUUUUUUU\256\254\254uuuuUUUUUUUUUUUU\256\254\254!!uuuuUUUUUUUUUUUU\256\254\254uuuuUUUUUUUUUUUU\256\254\254!!uuuuUUUUUUUUUUUU\256\254\254uuuuUUUUUUUUUUUU\256\254\254!!uuuuUUUUUUUUUUUU\256\254\254uuuuUUUUUUUUUUUU\256\254\254!!uuuuUUUUUUUUUUUU\256\254\254uuuuUUUUUUUUUUUU\256\254\254!!uuuuUUUUUUUUUUUU\256\254\254uuuuUUUUUUUUUUUU\256\254\254!!!", "LNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUULNUULLNUULNUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLUUUUUUUUUUUU\256\254\254LLLLUUUUUUUUUUUU\256\254\254!!LLLLUUUUUUUUUUUU\256\254\254LLLLUUUUUUUUUUUU\256\254\254!!LLLLUUUUUUUUUUUU\256\254\254LLLLUUUUUUUUUUUU\256\254\254!!LLLLUUUUUUUUUUUU\256\254\254LLLLUUUUUUUUUUUU\256\254\254!!LLLLUUUUUUUUUUUU\256\254\254LLLLUUUUUUUUUUUU\256\254\254!!LLLLUUUUUUUUUUUU\256\254\254LLLLUUUUUUUUUUUU\256\254\254!!LLLLUUUUUUUUUUUU\256\254\254LLLLUUUUUUUUUUUU\256\254\254!!LLLLUUUUUUUUUUUU\256\254\254LLLLUUUUUUUUUUUU\256\254\254!!!" + "'", str2, "LLLLUUUUUUUUUUUU\256\254\254LLLLUUUUUUUUUUUU\256\254\254!!LLLLUUUUUUUUUUUU\256\254\254LLLLUUUUUUUUUUUU\256\254\254!!LLLLUUUUUUUUUUUU\256\254\254LLLLUUUUUUUUUUUU\256\254\254!!LLLLUUUUUUUUUUUU\256\254\254LLLLUUUUUUUUUUUU\256\254\254!!LLLLUUUUUUUUUUUU\256\254\254LLLLUUUUUUUUUUUU\256\254\254!!LLLLUUUUUUUUUUUU\256\254\254LLLLUUUUUUUUUUUU\256\254\254!!LLLLUUUUUUUUUUUU\256\254\254LLLLUUUUUUUUUUUU\256\254\254!!LLLLUUUUUUUUUUUU\256\254\254LLLLUUUUUUUUUUUU\256\254\254!!!");
    }

    @Test
    public void test11324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11324");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275nullnullJJnullnullJJnullnullJJ\276nullnullJJ\275\275!", "\u0346\u0348\u0348\u0348nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300UU\276\u0346l\300\300\u0346l\300\300UU\275\275!" + "'", str2, "\275\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300UU\276\u0346l\300\300\u0346l\300\300UU\275\275!");
    }

    @Test
    public void test11325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11325");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0346\u0348\u0348\u0348\u017d\u017d\u017d\u017d\u0348\u0346\u0346!", "TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test11326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11326");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}~\200\200}~\200\200\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e}~\200\200}~\200\200\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e\u022c\u022e\u022e!", "!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!!!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!~unllunllunllunllunllunllunllunll!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200!NULLLNNNULLLNNNULLLNN!NULLLNNNULLLNNNULLLNN!NULLLNNNULLLNNNULLLNN!NULLLNNNULLLNNNULLLNN!NULLLNNNULLLNNNULLLNN!NULLLNNNULLLNNNULLLNN!NULLLNNNULLLNNNULLLNN!NULLLNNNULLLNNNULLLNN}~\200\200}~\200\200!NULLLNNNULLLNNNULLLNN!NULLLNNNULLLNNNULLLNN!NULLLNNNULLLNNNULLLNN!NULLLNNNULLLNNNULLLNN!NULLLNNNULLLNNNULLLNN!NULLLNNNULLLNNNULLLNN!NULLLNNNULLLNNNULLLNN!NULLLNNNULLLNNNULLLNN!" + "'", str2, "}~\200\200}~\200\200!NULLLNNNULLLNNNULLLNN!NULLLNNNULLLNNNULLLNN!NULLLNNNULLLNNNULLLNN!NULLLNNNULLLNNNULLLNN!NULLLNNNULLLNNNULLLNN!NULLLNNNULLLNNNULLLNN!NULLLNNNULLLNNNULLLNN!NULLLNNNULLLNNNULLLNN}~\200\200}~\200\200!NULLLNNNULLLNNNULLLNN!NULLLNNNULLLNNNULLLNN!NULLLNNNULLLNNNULLLNN!NULLLNNNULLLNNNULLLNN!NULLLNNNULLLNNNULLLNN!NULLLNNNULLLNNNULLLNN!NULLLNNNULLLNNNULLLNN!NULLLNNNULLLNNNULLLNN!");
    }

    @Test
    public void test11327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11327");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!~\307\307!~\307\307\220\220!~\307\307!~\307\307\220\220\220!~\307\307\220\220\220!~\307\307\220\220\220!~\307\307\220\220\220!~\307\307\220\220!~\307\307!~\307\307\220\220!~\307\307!~\307\307\220\220!", "]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~nullnull!~nullnull\220\220!~nullnull!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220!~nullnull!~nullnull\220\220!~nullnull!~nullnull\220\220!" + "'", str2, "!~nullnull!~nullnull\220\220!~nullnull!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220!~nullnull!~nullnull\220\220!~nullnull!~nullnull\220\220!");
    }

    @Test
    public void test11328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11328");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0348\u0348!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0348\u0348!");
    }

    @Test
    public void test11329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11329");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e\u014f\u014f\u014f\u014f\u014e\u014e\u014e\u014e!", "\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test11330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11330");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("U{UUU{UUU{UUU{UU!U{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UU!U{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UU!U{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UU!U{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UU!U{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UU!U{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UU!U{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UU!U{UUU{UUU{UUU{UUU{UUU{UUU{UUU{UU!", "!\255nullnull!\255nullnull!\255nullnull!\255nullnull!\255nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p{ppp{ppp{ppp{pp!p{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{pp!p{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{pp!p{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{pp!p{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{pp!p{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{pp!p{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{pp!p{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{pp!p{ppp{ppp{ppp{ppp{ppp{ppp{ppp{pp!" + "'", str2, "p{ppp{ppp{ppp{pp!p{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{pp!p{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{pp!p{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{pp!p{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{pp!p{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{pp!p{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{pp!p{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{ppp{pp!p{ppp{ppp{ppp{ppp{ppp{ppp{ppp{pp!");
    }

    @Test
    public void test11331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11331");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!\253null\260\260\253null\260\260!!\253null\260\260\253null\260\260!!!!!", "!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253!LLL\260\260\253!LLL\260\260!!\253!LLL\260\260\253!LLL\260\260!!!!\253!LLL\260\260\253!LLL\260\260!!\253!LLL\260\260\253!LLL\260\260!!!!\253!LLL\260\260\253!LLL\260\260!!\253!LLL\260\260\253!LLL\260\260!!!!\253!LLL\260\260\253!LLL\260\260!!\253!LLL\260\260\253!LLL\260\260!!!!\253!LLL\260\260\253!LLL\260\260!!\253!LLL\260\260\253!LLL\260\260!!!!\253!LLL\260\260\253!LLL\260\260!!\253!LLL\260\260\253!LLL\260\260!!!!\253!LLL\260\260\253!LLL\260\260!!\253!LLL\260\260\253!LLL\260\260!!!!\253!LLL\260\260\253!LLL\260\260!!\253!LLL\260\260\253!LLL\260\260!!!!!" + "'", str2, "\253!LLL\260\260\253!LLL\260\260!!\253!LLL\260\260\253!LLL\260\260!!!!\253!LLL\260\260\253!LLL\260\260!!\253!LLL\260\260\253!LLL\260\260!!!!\253!LLL\260\260\253!LLL\260\260!!\253!LLL\260\260\253!LLL\260\260!!!!\253!LLL\260\260\253!LLL\260\260!!\253!LLL\260\260\253!LLL\260\260!!!!\253!LLL\260\260\253!LLL\260\260!!\253!LLL\260\260\253!LLL\260\260!!!!\253!LLL\260\260\253!LLL\260\260!!\253!LLL\260\260\253!LLL\260\260!!!!\253!LLL\260\260\253!LLL\260\260!!\253!LLL\260\260\253!LLL\260\260!!!!\253!LLL\260\260\253!LLL\260\260!!\253!LLL\260\260\253!LLL\260\260!!!!!");
    }

    @Test
    public void test11332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11332");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "`null```null``!!`null```null``!!`null```null```null```null``!!`null```null``!!`null```null``!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\232\230\230\230\232\230\230\230\232\230\230\230\232\230\230\230\232\230\230\230\232\230\230\230\232\230\230\230\232\230\230\230\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\232\230\230\230\232\230\230\230\232\230\230\230\232\230\230\230\232\230\230\230\232\230\230\230\232\230\230\230\232\230\230\230\u0346\u0348\u0348!");
    }

    @Test
    public void test11333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11333");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "~}\200\200~}\200\200UNLL}\200\200UNLL}\200\200\230\230UNLL}\200\200UNLL}\200\200\230\230~}\200\200~}\200\200UNLL}\200\200UNLL}\200\200\230\230UNLL}\200\200UNLL}\200\200\230\230~}\200\200~}\200\200UNLL}\200\200UNLL}\200\200\230\230UNLL}\200\200UNLL}\200\200\230\230~}\200\200~}\200\200UNLL}\200\200UNLL}\200\200\230\230UNLL}\200\200UNLL}\200\200\230\230~}\200\200~}\200\200UNLL}\200\200UNLL}\200\200\230\230UNLL}\200\200UNLL}\200\200\230\230~}\200\200~}\200\200UNLL}\200\200UNLL}\200\200\230\230UNLL}\200\200UNLL}\200\200\230\230~}\200\200~}\200\200UNLL}\200\200UNLL}\200\200\230\230UNLL}\200\200UNLL}\200\200\230\230~}\200\200~}\200\200UNLL}\200\200UNLL}\200\200\230\230UNLL}\200\200UNLL}\200\200\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11334");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("KKNNnull!!KKNNnull!!!", "\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150\u014d\u014e\u0150\u0150]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test11335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11335");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!", "\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0104\u0108\u0108\u0108~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0104\u0108\u0108\u0108~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0104\u0108\u0108\u0108~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0104\u0108\u0108\u0108~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0104\u0108\u0108\u0108~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0104\u0108\u0108\u0108~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0104\u0108\u0108\u0108~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0104\u0108\u0108\u0108~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!" + "'", str2, "\u0104\u0108\u0108\u0108~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0104\u0108\u0108\u0108~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0104\u0108\u0108\u0108~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0104\u0108\u0108\u0108~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0104\u0108\u0108\u0108~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0104\u0108\u0108\u0108~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0104\u0108\u0108\u0108~\225\225\230\230\225\225\230\230\225\225\230\230\225\225\u0104\u0108\u0108\u0108~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
    }

    @Test
    public void test11336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11336");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!!", "\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!!" + "'", str2, "~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!~~~~~~~~!!!");
    }

    @Test
    public void test11337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11337");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275\276L\266\266\276L\266\266\200\200\276L\266\266\276L\266\266\200\200\276L\266\266\276L\266\266\200\200\276\276L\266\266\276L\266\266\200\200\275\275!", "!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276\342\266\266\276\342\266\266\200\200\276\342\266\266\276\342\266\266\200\200\276\342\266\266\276\342\266\266\200\200\276\276\342\266\266\276\342\266\266\200\200\275\275!" + "'", str2, "\275\276\342\266\266\276\342\266\266\200\200\276\342\266\266\276\342\266\266\200\200\276\342\266\266\276\342\266\266\200\200\276\276\342\266\266\276\342\266\266\200\200\275\275!");
    }

    @Test
    public void test11338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11338");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]!", "!\276!~~\276!~~\276!~~\276!~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]!" + "'", str2, "]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]!");
    }

    @Test
    public void test11339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11339");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275\u0108\u0108\u0108\275\u0108\u0108\u0108!", "\u0366\u0365\u0368\u0368\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnull\275nullnullnull!" + "'", str2, "\275nullnullnull\275nullnullnull!");
    }

    @Test
    public void test11340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11340");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0406\u0406!", "!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!" + "'", str2, "nullnull!");
    }

    @Test
    public void test11341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11341");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u0269\u026c\u026c\u026a\u026c\u026c\u026c\u026a\u026c\u026c\u026c!", "U!LLLLLU!LLLLLLLU!LLLLLU!LLLLLLLU!LLLLLU!LLLLLLLU!LLLLLU!LLLLLLLU!LLLLLU!LLLLLLLU!LLLLLU!LLLLLLLU!LLLLLU!LLLLLLLU!LLLLLU!LLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test11342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11342");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!", "NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!" + "'", str2, "!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!~~~\256\254\254!~~~\256\254\254!!!");
    }

    @Test
    public void test11343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11343");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("E!LLE!LLLLE!LLE!LLLLE!LLE!LLLLE!LLE!LLLLE!LLE!LLLLE!LLE!LLLLE!LLE!LLLLE!LLE!LLLL!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142!" + "'", str2, "\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142\u0142!");
    }

    @Test
    public void test11344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11344");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!~~null!!~~!!~~!!~~null!!~~!!~~!!~~!!~~!!!", "NNNN!NNN!NNN!NNN!NNNNNNN!NNN!NNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~~nnnn!!~~!!~~!!~~nnnn!!~~!!~~!!~~!!~~!!~~nnnn!!~~!!~~!!~~nnnn!!~~!!~~!!~~!!~~!!!!~~nnnn!!~~!!~~!!~~nnnn!!~~!!~~!!~~!!~~!!~~nnnn!!~~!!~~!!~~nnnn!!~~!!~~!!~~!!~~!!!!~~nnnn!!~~!!~~!!~~nnnn!!~~!!~~!!~~!!~~!!~~nnnn!!~~!!~~!!~~nnnn!!~~!!~~!!~~!!~~!!!!~~nnnn!!~~!!~~!!~~nnnn!!~~!!~~!!~~!!~~!!~~nnnn!!~~!!~~!!~~nnnn!!~~!!~~!!~~!!~~!!!!~~nnnn!!~~!!~~!!~~nnnn!!~~!!~~!!~~!!~~!!~~nnnn!!~~!!~~!!~~nnnn!!~~!!~~!!~~!!~~!!!!~~nnnn!!~~!!~~!!~~nnnn!!~~!!~~!!~~!!~~!!~~nnnn!!~~!!~~!!~~nnnn!!~~!!~~!!~~!!~~!!!!~~nnnn!!~~!!~~!!~~nnnn!!~~!!~~!!~~!!~~!!~~nnnn!!~~!!~~!!~~nnnn!!~~!!~~!!~~!!~~!!!!~~nnnn!!~~!!~~!!~~nnnn!!~~!!~~!!~~!!~~!!~~nnnn!!~~!!~~!!~~nnnn!!~~!!~~!!~~!!~~!!!" + "'", str2, "!!~~nnnn!!~~!!~~!!~~nnnn!!~~!!~~!!~~!!~~!!~~nnnn!!~~!!~~!!~~nnnn!!~~!!~~!!~~!!~~!!!!~~nnnn!!~~!!~~!!~~nnnn!!~~!!~~!!~~!!~~!!~~nnnn!!~~!!~~!!~~nnnn!!~~!!~~!!~~!!~~!!!!~~nnnn!!~~!!~~!!~~nnnn!!~~!!~~!!~~!!~~!!~~nnnn!!~~!!~~!!~~nnnn!!~~!!~~!!~~!!~~!!!!~~nnnn!!~~!!~~!!~~nnnn!!~~!!~~!!~~!!~~!!~~nnnn!!~~!!~~!!~~nnnn!!~~!!~~!!~~!!~~!!!!~~nnnn!!~~!!~~!!~~nnnn!!~~!!~~!!~~!!~~!!~~nnnn!!~~!!~~!!~~nnnn!!~~!!~~!!~~!!~~!!!!~~nnnn!!~~!!~~!!~~nnnn!!~~!!~~!!~~!!~~!!~~nnnn!!~~!!~~!!~~nnnn!!~~!!~~!!~~!!~~!!!!~~nnnn!!~~!!~~!!~~nnnn!!~~!!~~!!~~!!~~!!~~nnnn!!~~!!~~!!~~nnnn!!~~!!~~!!~~!!~~!!!!~~nnnn!!~~!!~~!!~~nnnn!!~~!!~~!!~~!!~~!!~~nnnn!!~~!!~~!!~~nnnn!!~~!!~~!!~~!!~~!!!");
    }

    @Test
    public void test11345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11345");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204!!\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204!!\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204!!\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204!!\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\204nullnullnullnull\204\204\204nullnullnullnull\204\204!!\204nullnullnullnull\204\204\204nullnullnullnull\204\204!!\204nullnullnullnull\204\204\204nullnullnullnull\204\204\204nullnullnullnull\204\204\204nullnullnullnull\204\204!!\204nullnullnullnull\204\204\204nullnullnullnull\204\204!!\204nullnullnullnull\204\204\204nullnullnullnull\204\204!" + "'", str2, "\204nullnullnullnull\204\204\204nullnullnullnull\204\204!!\204nullnullnullnull\204\204\204nullnullnullnull\204\204!!\204nullnullnullnull\204\204\204nullnullnullnull\204\204\204nullnullnullnull\204\204\204nullnullnullnull\204\204!!\204nullnullnullnull\204\204\204nullnullnullnull\204\204!!\204nullnullnullnull\204\204\204nullnullnullnull\204\204!");
    }

    @Test
    public void test11346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11346");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("]\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253]]\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253]]\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253]]\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253]]]\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253]]\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253]]!", "\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253]]\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253]]\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253]]\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253]]]\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253]]\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253]]!" + "'", str2, "]\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253]]\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253]]\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253]]\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253]]]\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253]]\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253\253!\253\253]]!");
    }

    @Test
    public void test11347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11347");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!", "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!" + "'", str2, "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!");
    }

    @Test
    public void test11348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11348");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u011d\u011d!", "LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!LNLLLNLL!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!nullnull!" + "'", str2, "!!!nullnull!");
    }

    @Test
    public void test11349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11349");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LLBBLLBB!!LLBBLLBB!!LLBBLLBB!!LLBBLLBB!!LLBBLLBB!!LLBBLLBB!!LLBBLLBB!!LLBBLLBB!!!", "\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245}}!!!" + "'", str2, "\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245}}!!!");
    }

    @Test
    public void test11350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11350");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("N^NNN^NNN^NNN^NNN^NNN^NNN^NNN^NN!!N^NNN^NNN^NNN^NNN^NNN^NNN^NNN^NN!!N^NNN^NNN^NNN^NNN^NNN^NNN^NNN^NN!!N^NNN^NNN^NNN^NNN^NNN^NNN^NNN^NN!!N^NNN^NNN^NNN^NNN^NNN^NNN^NNN^NN!!N^NNN^NNN^NNN^NNN^NNN^NNN^NNN^NN!!N^NNN^NNN^NNN^NNN^NNN^NNN^NNN^NN!!N^NNN^NNN^NNN^NNN^NNN^NNN^NNN^NN!!!", "\275\u03c0\u03c0\u03c0\275\u03c0\u03c0\u03c0\275\u03c0\u03c0\u03c0\275\u03c0\u03c0\u03c0\u03c0\u03c0\275\275\u03c0\u03c0\275\275\u03c0\u03c0\275\275\u03c0\u03c0\275\275\275\u03c0\u03c0\u03c0\275\u03c0\u03c0\u03c0\275\u03c0\u03c0\u03c0\275\u03c0\u03c0\u03c0\u03c0\u03c0\275\275\u03c0\u03c0\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnull!!null^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnull!!null^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnull!!null^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnull!!null^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnull!!null^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnull!!null^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnull!!null^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnull!!!" + "'", str2, "null^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnull!!null^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnull!!null^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnull!!null^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnull!!null^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnull!!null^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnull!!null^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnull!!null^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnullnull^nullnull!!!");
    }

    @Test
    public void test11351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11351");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LLLLLUUULUUULUUULUUULLLLLUUULUUU!", "!\254UUUUUUUU!\254UUUUUUUU!!!!!!!!!\254UUUUUUUU!\254UUUUUUUU!!!!!!!!!\254UUUUUUUU!\254UUUUUUUU!!!!!!!!!\254UUUUUUUU!\254UUUUUUUU!!!!!!!!!\254UUUUUUUU!\254UUUUUUUU!!!!!!!!!\254UUUUUUUU!\254UUUUUUUU!!!!!!!!!\254UUUUUUUU!\254UUUUUUUU!!!!!!!!!\254UUUUUUUU!\254UUUUUUUU!!!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118!" + "'", str2, "\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118\u0118!");
    }

    @Test
    public void test11352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11352");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("JLLL\200}}`JLLL]]!", "NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!NN!!NN!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!NNN\200}}`!NNN]]!" + "'", str2, "!NNN\200}}`!NNN]]!");
    }

    @Test
    public void test11353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11353");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a!", "!LNN!LNN!!!LNN!LNN!!!LNN!LNN!!!LNN!LNN!!!LNN!LNN!!!LNN!LNN!!!LNN!LNN!!!LNN!LNN!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\256null\254\254nullnullnull\256null\254\254nullnull!!null\256null\254\254nullnullnull\256null\254\254nullnull!!null\256null\254\254nullnullnull\256null\254\254nullnullnull\256null\254\254nullnullnull\256null\254\254nullnull!!null\256null\254\254nullnullnull\256null\254\254nullnull!!null\256null\254\254nullnullnull\256null\254\254nullnull!" + "'", str2, "null\256null\254\254nullnullnull\256null\254\254nullnull!!null\256null\254\254nullnullnull\256null\254\254nullnull!!null\256null\254\254nullnullnull\256null\254\254nullnullnull\256null\254\254nullnullnull\256null\254\254nullnull!!null\256null\254\254nullnullnull\256null\254\254nullnull!!null\256null\254\254nullnullnull\256null\254\254nullnull!");
    }

    @Test
    public void test11354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11354");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\204LNUU\204\204\204LNUU\204\204!!\204LNUU\204\204\204LNUU\204\204!!\204LNUU\204\204\204LNUU\204\204\204LNUU\204\204\204LNUU\204\204!!\204LNUU\204\204\204LNUU\204\204!!\204LNUU\204\204\204LNUU\204\204!", "]```]```]```]```]```]```]```]```]```]```]```]```!!!!]```]```]```]```]```]```]```]```]```]```]```]```!!!!!!]```]```]```]```]```]```]```]```]```]```]```]```!!!!]```]```]```]```]```]```]```]```]```]```]```]```!!!!!!]```]```]```]```]```]```]```]```]```]```]```]```!!!!]```]```]```]```]```]```]```]```]```]```]```]```!!!!!!]```]```]```]```]```]```]```]```]```]```]```]```!!!!]```]```]```]```]```]```]```]```]```]```]```]```!!!!!!]```]```]```]```]```]```]```]```]```]```]```]```!!!!]```]```]```]```]```]```]```]```]```]```]```]```!!!!!!]```]```]```]```]```]```]```]```]```]```]```]```!!!!]```]```]```]```]```]```]```]```]```]```]```]```!!!!!!]```]```]```]```]```]```]```]```]```]```]```]```!!!!]```]```]```]```]```]```]```]```]```]```]```]```!!!!!!]```]```]```]```]```]```]```]```]```]```]```]```!!!!]```]```]```]```]```]```]```]```]```]```]```]```!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\204``]]\204\204\204``]]\204\204!!\204``]]\204\204\204``]]\204\204!!\204``]]\204\204\204``]]\204\204\204``]]\204\204\204``]]\204\204!!\204``]]\204\204\204``]]\204\204!!\204``]]\204\204\204``]]\204\204!" + "'", str2, "\204``]]\204\204\204``]]\204\204!!\204``]]\204\204\204``]]\204\204!!\204``]]\204\204\204``]]\204\204\204``]]\204\204\204``]]\204\204!!\204``]]\204\204\204``]]\204\204!!\204``]]\204\204\204``]]\204\204!");
    }

    @Test
    public void test11355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11355");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0123\u0124\u0126\u0126\213\213\213\u0346\u0348\u0348!", "\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368nullnullnullnull\213\213\213\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368nullnullnullnull\213\213\213\u0346\u0348\u0348!");
    }

    @Test
    public void test11356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11356");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrttnullrtt!", "\253\254\256\256\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!\253\254\256\256\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!!!!" + "'", str2, "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!!!!");
    }

    @Test
    public void test11357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11357");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\200\200\u0346\u0348\u0348!", "\u0328\u0328\u0328\u0328\u0328\u0328\u0328\u0328\u0328\u0328\u0328\u0328\u0328\u0328\u0328\u0328\u0328\u0328\u0328\u0328\u0328\u0328\u0328\u0328\u0328\u0328\u0328\u0328\u0328\u0328\u0328\u0328\u0328\u0328\u0328\u0328!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnull\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnull\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test11358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11358");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!", "I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!I!III!III!III!II\256\254\254I!III!III!III!II\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!!!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!!!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!!!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!!!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!" + "'", str2, "!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!!!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!!!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!!!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!!!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!III!III\254\254!");
    }

    @Test
    public void test11359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11359");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!~ULLLULLL!!!!~ULLLULLL!!!!!!~ULLLULLL!!!!~ULLLULLL!!!!!!~ULLLULLL!!!!~ULLLULLL!!!!~ULLLULLL!!!!~ULLLULLL!!!!!!~ULLLULLL!!!!~ULLLULLL!!!!!!~ULLLULLL!!!!~ULLLULLL!!!", "]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~]!!!]!!!!!!!~]!!!]!!!!!!!!!~]!!!]!!!!!!!~]!!!]!!!!!!!!!~]!!!]!!!!!!!~]!!!]!!!!!!!~]!!!]!!!!!!!~]!!!]!!!!!!!!!~]!!!]!!!!!!!~]!!!]!!!!!!!!!~]!!!]!!!!!!!~]!!!]!!!!!!" + "'", str2, "!!~]!!!]!!!!!!!~]!!!]!!!!!!!!!~]!!!]!!!!!!!~]!!!]!!!!!!!!!~]!!!]!!!!!!!~]!!!]!!!!!!!~]!!!]!!!!!!!~]!!!]!!!!!!!!!~]!!!]!!!!!!!~]!!!]!!!!!!!!!~]!!!]!!!!!!!~]!!!]!!!!!!");
    }

    @Test
    public void test11360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11360");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200UUUU\214UUUUUUUUUUUU\214UUUUUUUU}~\200\200}~\200\200UUUU\214UUUUUUUUUUUU\214UUUUUUUU}~\200\200}~\200\200UUUU\214UUUUUUUUUUUU\214UUUUUUUU}~\200\200}~\200\200UUUU\214UUUUUUUUUUUU\214\u0348\u0346\u0346!", "!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~~~!U~~!U~~~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~~~!U~~!U~~~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~~~!U~~!U~~~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~~~!U~~!U~~~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~~~!U~~!U~~~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~~~!U~~!U~~~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~~~!U~~!U~~~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~!U~~~~!U~~!U~~~~!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200\u01dc\u01dc\u01dc\u01dc\214\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\214\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc}~\200\200}~\200\200\u01dc\u01dc\u01dc\u01dc\214\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\214\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc}~\200\200}~\200\200\u01dc\u01dc\u01dc\u01dc\214\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\214\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc}~\200\200}~\200\200\u01dc\u01dc\u01dc\u01dc\214\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\214\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200\u01dc\u01dc\u01dc\u01dc\214\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\214\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc}~\200\200}~\200\200\u01dc\u01dc\u01dc\u01dc\214\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\214\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc}~\200\200}~\200\200\u01dc\u01dc\u01dc\u01dc\214\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\214\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc}~\200\200}~\200\200\u01dc\u01dc\u01dc\u01dc\214\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\214\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u01dc\u0348\u0346\u0346!");
    }

    @Test
    public void test11361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11361");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN!", "ECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBB!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull!" + "'", str2, "^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test11362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11362");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]!\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]!\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]!\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]!\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]\300]]]!", "RR!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]!null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]!null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]!null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]!null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]!" + "'", str2, "!null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]!null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]!null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]!null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]!null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]!");
    }

    @Test
    public void test11363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11363");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201!", "UULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULLUULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULL!!UULL~UULLUULLUULL~UULLUULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201!" + "'", str2, "\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201\241\241\241\241\241\241\241\241\201\201\201\201\201\201\201\201!");
    }

    @Test
    public void test11364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11364");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106\u0108\u0128\u0106\u0106!", "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031anullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031aUUULLLULLL!" + "'", str2, "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031aUUULLLULLL!");
    }

    @Test
    public void test11365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11365");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180!", "F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullF!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLLLLLUNLLLLLLLUNLLLLLUNLLLLLLLUNLLLLLUNLLLLLLLUNLLLLLUNLLLLLLLUNLLLLLUNLLLLLLLUNLLLLLUNLLLLLLLUNLLLLLUNLLLLLLLUNLLLLLUNLLLLLLL!" + "'", str2, "UNLLLLLUNLLLLLLLUNLLLLLUNLLLLLLLUNLLLLLUNLLLLLLLUNLLLLLUNLLLLLLLUNLLLLLUNLLLLLLLUNLLLLLUNLLLLLLLUNLLLLLUNLLLLLLLUNLLLLLUNLLLLLLL!");
    }

    @Test
    public void test11366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11366");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275\276!\336\336\336!\336\336\336\275\276!\336\336\336!\336\336\336\225\225\275\276!\336\336\336!\336\336\336\275\276!\336\336\336!\336\336\336\225\225\275\276!\336\336\336!\336\336\336\275\276!\336\336\336!\336\336\336\225\225\275\276!\336\336\336!\336\336\336\275\276!\336\336\336!\336\336\336\225\225\275\276!\336\336\336!\336\336\336\275\276!\336\336\336!\336\336\336\225\225\275\276!\336\336\336!\336\336\336\275\276!\336\336\336!\336\336\336\225\225\275\276!\336\336\336!\336\336\336\275\276!\336\336\336!\336\336\336\225\225\275\276!\336\336\336!\336\336\336\275\276!\336\336\336!\336\336\336\225\225!", "!eeeeeeeeeeeeeeee!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276!nullnullnull!nullnullnull\275\276!nullnullnull!nullnullnull\225\225\275\276!nullnullnull!nullnullnull\275\276!nullnullnull!nullnullnull\225\225\275\276!nullnullnull!nullnullnull\275\276!nullnullnull!nullnullnull\225\225\275\276!nullnullnull!nullnullnull\275\276!nullnullnull!nullnullnull\225\225\275\276!nullnullnull!nullnullnull\275\276!nullnullnull!nullnullnull\225\225\275\276!nullnullnull!nullnullnull\275\276!nullnullnull!nullnullnull\225\225\275\276!nullnullnull!nullnullnull\275\276!nullnullnull!nullnullnull\225\225\275\276!nullnullnull!nullnullnull\275\276!nullnullnull!nullnullnull\225\225!" + "'", str2, "\275\276!nullnullnull!nullnullnull\275\276!nullnullnull!nullnullnull\225\225\275\276!nullnullnull!nullnullnull\275\276!nullnullnull!nullnullnull\225\225\275\276!nullnullnull!nullnullnull\275\276!nullnullnull!nullnullnull\225\225\275\276!nullnullnull!nullnullnull\275\276!nullnullnull!nullnullnull\225\225\275\276!nullnullnull!nullnullnull\275\276!nullnullnull!nullnullnull\225\225\275\276!nullnullnull!nullnullnull\275\276!nullnullnull!nullnullnull\225\225\275\276!nullnullnull!nullnullnull\275\276!nullnullnull!nullnullnull\225\225\275\276!nullnullnull!nullnullnull\275\276!nullnullnull!nullnullnull\225\225!");
    }

    @Test
    public void test11367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11367");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\216\254\254nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\216\254\254nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\216\254\254nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\216\254\254nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254NL]]NL]]NL]]NL]]NL]]NL]]NL]]NL]]\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254NL]]NL]]NL]]NL]]NL]]NL]]NL]]NL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]\216\254\254LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]\216\254\254LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]\216\254\254LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]\216\254\254LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]!" + "'", str2, "LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]\216\254\254LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]\216\254\254LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]\216\254\254LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]\216\254\254LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]LN]]!");
    }

    @Test
    public void test11368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11368");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLLLLLLLLLLLLLL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test11369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11369");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360!", "nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0289\u028a\u028c\u028c\u0289\u028a\u028c\u028c\u0289\u028a\u028c\u028c\u0289\u028a\u028c\u028c\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u0289\u028a\u028c\u028c\u0289\u028a\u028c\u028c\u0289\u028a\u028c\u028c\u0289\u028a\u028c\u028c\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360!" + "'", str2, "\u0289\u028a\u028c\u028c\u0289\u028a\u028c\u028c\u0289\u028a\u028c\u028c\u0289\u028a\u028c\u028c\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u0289\u028a\u028c\u028c\u0289\u028a\u028c\u028c\u0289\u028a\u028c\u028c\u0289\u028a\u028c\u028c\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360!");
    }

    @Test
    public void test11370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11370");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```!", "!LN!!LN!!LN!!!LN!!LN!!LN!!!LN!!LN!!LN!!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!!LN!!LN!!LN!!!LN!!LN!!LN!!!LN!!LN!!LN!!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!LN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```!" + "'", str2, "NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```!");
    }

    @Test
    public void test11371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11371");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162\u0162!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11372");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!", "\206\207\211\211\206\207\211\211\211\211\206\207\211\211\206\207\211\211\211\211!!\206\207\211\211\206\207\211\211\211\211\206\207\211\211\206\207\211\211\211\211!!\206\207\211\211\206\207\211\211\211\211\206\207\211\211\206\207\211\211\211\211!!\206\207\211\211\206\207\211\211\211\211\206\207\211\211\206\207\211\211\211\211!!\206\207\211\211\206\207\211\211\211\211\206\207\211\211\206\207\211\211\211\211!!\206\207\211\211\206\207\211\211\211\211\206\207\211\211\206\207\211\211\211\211!!\206\207\211\211\206\207\211\211\211\211\206\207\211\211\206\207\211\211\211\211!!\206\207\211\211\206\207\211\211\211\211\206\207\211\211\206\207\211\211\211\211!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\211\211\207\207\211\211\207\207\207\211!!\207\211!!\211\211\207\207\211\211\207\207\207\211!!\207\211!!!" + "'", str2, "\211\211\207\207\211\211\207\207\207\211!!\207\211!!\211\211\207\207\211\211\207\207\207\211!!\207\211!!!");
    }

    @Test
    public void test11373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11373");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!!!~~~~~~~~!!~~~~~~~~!!!!~~~~~~~~!!~~~~~~~~!!!!~~~~~~~~!!~~~~~~~~!!!!~~~~~~~~!!~~~~~~~~!!!!~~~~~~~~!!~~~~~~~~!!!!~~~~~~~~!!~~~~~~~~!!!!~~~~~~~~!!~~~~~~~~!!!!~~~~~~~~!!~~~~~~~~!", "~\200}}~\200}}~\200}}~\200\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c~\200}}~\200}}~\200}}~\200\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c\u028e\u028c\u028c!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!~~~~~~~~!!~~~~~~~~!!!!~~~~~~~~!!~~~~~~~~!!!!~~~~~~~~!!~~~~~~~~!!!!~~~~~~~~!!~~~~~~~~!!!!~~~~~~~~!!~~~~~~~~!!!!~~~~~~~~!!~~~~~~~~!!!!~~~~~~~~!!~~~~~~~~!!!!~~~~~~~~!!~~~~~~~~!" + "'", str2, "!!!!~~~~~~~~!!~~~~~~~~!!!!~~~~~~~~!!~~~~~~~~!!!!~~~~~~~~!!~~~~~~~~!!!!~~~~~~~~!!~~~~~~~~!!!!~~~~~~~~!!~~~~~~~~!!!!~~~~~~~~!!~~~~~~~~!!!!~~~~~~~~!!~~~~~~~~!!!!~~~~~~~~!!~~~~~~~~!");
    }

    @Test
    public void test11374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11374");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275!JLL!JLL!JLL\275!JLL!JLL!JLL\275!JLL!JLL!JLL\275!JLL!JLL!JLL!JLL!JLL\275\275!JLL!JLL\275\275!JLL!JLL\275\275!JLL!JLL\275\275\275!JLL!JLL!JLL\275!JLL!JLL!JLL\275!JLL!JLL!JLL\275!JLL!JLL!JLL!JLL!JLL\275\275!JLL!JLL\275\275!", "hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!hh!!hh!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!nullnullnull!nullnullnull!nullnullnull\275!nullnullnull!nullnullnull!nullnullnull\275!nullnullnull!nullnullnull!nullnullnull\275!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull\275\275!nullnullnull!nullnullnull\275\275!nullnullnull!nullnullnull\275\275!nullnullnull!nullnullnull\275\275\275!nullnullnull!nullnullnull!nullnullnull\275!nullnullnull!nullnullnull!nullnullnull\275!nullnullnull!nullnullnull!nullnullnull\275!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull\275\275!nullnullnull!nullnullnull\275\275!" + "'", str2, "\275!nullnullnull!nullnullnull!nullnullnull\275!nullnullnull!nullnullnull!nullnullnull\275!nullnullnull!nullnullnull!nullnullnull\275!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull\275\275!nullnullnull!nullnullnull\275\275!nullnullnull!nullnullnull\275\275!nullnullnull!nullnullnull\275\275\275!nullnullnull!nullnullnull!nullnullnull\275!nullnullnull!nullnullnull!nullnullnull\275!nullnullnull!nullnullnull!nullnullnull\275!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull\275\275!nullnullnull!nullnullnull\275\275!");
    }

    @Test
    public void test11375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11375");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275UNLLUNLLUNLL\276UNLL\275\275!", "nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\276\u026c\u026b\u026e\u026e\275\275!" + "'", str2, "\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\276\u026c\u026b\u026e\u026e\275\275!");
    }

    @Test
    public void test11376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11376");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275H!]]H!]]H!]]\275H!]]H!]]H!]]!", "}~\200\200}~\200\200\215\215\215\215\215\215\215\215}~\200\200}~\200\200\215\215\215\215\215\215\215\215!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\200!]]\200!]]\200!]]\275\200!]]\200!]]\200!]]!" + "'", str2, "\275\200!]]\200!]]\200!]]\275\200!]]\200!]]\200!]]!");
    }

    @Test
    public void test11377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11377");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("}~\200\200}~\200\200PNNNPNNNPNNNPNNNPNNNPNNNPNNNPNNN}~\200\200}~\200\200PNNNPNNNPNNNPNNNPNNNPNNNPNNNPNNN!", "\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\200\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348\u0348\220\216\216\216\u0348\u0348]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test11378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11378");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368null!!!null!!!\200\200\u0346\u0348\u0348!", "\u0366\u0365\u0368\u0368\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u016e\u016d\u0170\u0170\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368nullnullnullnull!!!nullnullnullnull!!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368nullnullnullnull!!!nullnullnullnull!!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test11379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11379");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275!\276\276\275!\276\276!", "\275\276!\225\225\276!\225\225\200\200\276!\225\225\276!\225\225\200\200\276!\225\225\276!\225\225\200\200\276\276!\225\225\276!\225\225\200\200\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!\276\276\275!\276\276!" + "'", str2, "\275!\276\276\275!\276\276!");
    }

    @Test
    public void test11380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11380");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037enullll]]!", "nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037eULLLLL]]!" + "'", str2, "\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037eULLLLL]]!");
    }

    @Test
    public void test11381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11381");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj!", "ILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLii!!ILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLii!!ILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLii!!ILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLii!!ILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLiiILLLILLLii!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test11382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11382");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275]!]]]!]]]!]]\275]!]]]!]]]!]]!", "P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!!P\220NN\200~~P\220NN\200~~P\220NNP\220NNP\220NN\200~~P\220NN\200~~P\220NNP\220NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275]!]]]!]]]!]]\275]!]]]!]]]!]]!" + "'", str2, "\275]!]]]!]]]!]]\275]!]]]!]]]!]]!");
    }

    @Test
    public void test11383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11383");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\200]uuunullnullnull\220\220\200]uuunullnullnull\220\220\200]uuunullnullnull\220\220\200]uuunullnullnull\220\220\200]uuunullnullnull\220\220\200]uuunullnullnull\220\220\200]uuunullnullnull\220\220\200]uuunullnullnull\220\220!", "\200unllunllunllunll}}\200unllunllunllunll}}\200unllunllunllunll}}\200unllunllunllunll}}\200unllunllunllunll}}\200unllunllunllunll}}\200unllunllunllunll}}\200unllunllunllunll}}\200unllunllunllunll}}\200unllunllunllunll}}\200unllunllunllunll}}\200unllunllunllunll}}\200unllunllunllunll}}\200unllunllunllunll}}\200unllunllunllunll}}\200unllunllunllunll}}``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\u018b\u018b\u018b\u018c\u018b\u018e\u018e\u018c\u018b\u018e\u018e\u018c\u018b\u018e\u018e\220\220\200\u018b\u018b\u018b\u018c\u018b\u018e\u018e\u018c\u018b\u018e\u018e\u018c\u018b\u018e\u018e\220\220\200\u018b\u018b\u018b\u018c\u018b\u018e\u018e\u018c\u018b\u018e\u018e\u018c\u018b\u018e\u018e\220\220\200\u018b\u018b\u018b\u018c\u018b\u018e\u018e\u018c\u018b\u018e\u018e\u018c\u018b\u018e\u018e\220\220\200\u018b\u018b\u018b\u018c\u018b\u018e\u018e\u018c\u018b\u018e\u018e\u018c\u018b\u018e\u018e\220\220\200\u018b\u018b\u018b\u018c\u018b\u018e\u018e\u018c\u018b\u018e\u018e\u018c\u018b\u018e\u018e\220\220\200\u018b\u018b\u018b\u018c\u018b\u018e\u018e\u018c\u018b\u018e\u018e\u018c\u018b\u018e\u018e\220\220\200\u018b\u018b\u018b\u018c\u018b\u018e\u018e\u018c\u018b\u018e\u018e\u018c\u018b\u018e\u018e\220\220!" + "'", str2, "\200\u018b\u018b\u018b\u018c\u018b\u018e\u018e\u018c\u018b\u018e\u018e\u018c\u018b\u018e\u018e\220\220\200\u018b\u018b\u018b\u018c\u018b\u018e\u018e\u018c\u018b\u018e\u018e\u018c\u018b\u018e\u018e\220\220\200\u018b\u018b\u018b\u018c\u018b\u018e\u018e\u018c\u018b\u018e\u018e\u018c\u018b\u018e\u018e\220\220\200\u018b\u018b\u018b\u018c\u018b\u018e\u018e\u018c\u018b\u018e\u018e\u018c\u018b\u018e\u018e\220\220\200\u018b\u018b\u018b\u018c\u018b\u018e\u018e\u018c\u018b\u018e\u018e\u018c\u018b\u018e\u018e\220\220\200\u018b\u018b\u018b\u018c\u018b\u018e\u018e\u018c\u018b\u018e\u018e\u018c\u018b\u018e\u018e\220\220\200\u018b\u018b\u018b\u018c\u018b\u018e\u018e\u018c\u018b\u018e\u018e\u018c\u018b\u018e\u018e\220\220\200\u018b\u018b\u018b\u018c\u018b\u018e\u018e\u018c\u018b\u018e\u018e\u018c\u018b\u018e\u018e\220\220!");
    }

    @Test
    public void test11384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11384");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}null\200\200}null\200\200}null\200\200}null\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}null\200\200}null\200\200}null\200\200}null\200\200nullnullnullnullnullnullnullnull!", "\u0366\u0365\u0368\u0368\215\215!!\215\215!!\215\215!!\215\215!!\213\213\213\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}\215\213!!\200\200}\215\213!!\200\200}\215\213!!\200\200}\215\213!!\200\200\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!}\215\213!!\200\200}\215\213!!\200\200}\215\213!!\200\200}\215\213!!\200\200\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!!" + "'", str2, "}\215\213!!\200\200}\215\213!!\200\200}\215\213!!\200\200}\215\213!!\200\200\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!}\215\213!!\200\200}\215\213!!\200\200}\215\213!!\200\200}\215\213!!\200\200\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!\215\213!!!");
    }

    @Test
    public void test11385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11385");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!", "LL\225\225LL\225\225LL\225\225LL\225\225LL\225\225LL\225\225LL\225\225LL\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!" + "'", str2, "!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!");
    }

    @Test
    public void test11386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11386");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullBBnullnullBB!", "}~\200\200}~\200\200\350^\214\214\350^\214\214}~\200\200}~\200\200\350^\214\214\350^\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^}\214\214^}\214\214~~^}\214\214^}\214\214~~!" + "'", str2, "^}\214\214^}\214\214~~^}\214\214^}\214\214~~!");
    }

    @Test
    public void test11387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11387");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!!!!!!!!!!!!!!!\200}}`!!!!!!!!!!!!!!!!]]!", "!!~~!!~~!!!!~~!!~~!!!!~~!!~~!!~~!!~~!!!!~~!!~~!!!!~~!!~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!\200}}`!!!!!!!!!!!!!!!!]]!" + "'", str2, "!!!!!!!!!!!!!!!!\200}}`!!!!!!!!!!!!!!!!]]!");
    }

    @Test
    public void test11388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11388");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\u0346\u0348\u0348\u0348\216\254\254\254\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test11389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11389");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\253\254\256\256N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!\253\254\256\256N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!N!!!NULLN!!!N!!!!", "\225N]]\225N]]\225N]]\225N]]\225N]]\225N]]\225N]]\225\u0317\u031a\225N]]\225\u0317\u031a\225N]]\225N]]\225N]]\225N]]\225N]]\225N]]\225N]]\225N]]\225N]]\225\u0317\u031a\225N]]\225\u0317\u031a\225N]]\225N]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256\246!!!\246nullnullnull\246!!!\246!!!\246!!!\246nullnullnull\246!!!\246!!!\246!!!\246nullnullnull\246!!!\246!!!\246!!!\246nullnullnull\246!!!\246!!!\246!!!\246nullnullnull\246!!!\246!!!\246!!!\246nullnullnull\246!!!\246!!!\246!!!\246nullnullnull\246!!!\246!!!\246!!!\246nullnullnull\246!!!\246!!!\246!!!\246nullnullnull\246!!!\246!!!\246!!!\246nullnullnull\246!!!\246!!!\246!!!\246nullnullnull\246!!!\246!!!\246!!!\246nullnullnull\246!!!\246!!!\246!!!\246nullnullnull\246!!!\246!!!\246!!!\246nullnullnull\246!!!\246!!!\246!!!\246nullnullnull\246!!!\246!!!\246!!!\246nullnullnull\246!!!\246!!!\253\254\256\256\246!!!\246nullnullnull\246!!!\246!!!\246!!!\246nullnullnull\246!!!\246!!!\246!!!\246nullnullnull\246!!!\246!!!\246!!!\246nullnullnull\246!!!\246!!!\246!!!\246nullnullnull\246!!!\246!!!\246!!!\246nullnullnull\246!!!\246!!!\246!!!\246nullnullnull\246!!!\246!!!\246!!!\246nullnullnull\246!!!\246!!!!" + "'", str2, "\253\254\256\256\246!!!\246nullnullnull\246!!!\246!!!\246!!!\246nullnullnull\246!!!\246!!!\246!!!\246nullnullnull\246!!!\246!!!\246!!!\246nullnullnull\246!!!\246!!!\246!!!\246nullnullnull\246!!!\246!!!\246!!!\246nullnullnull\246!!!\246!!!\246!!!\246nullnullnull\246!!!\246!!!\246!!!\246nullnullnull\246!!!\246!!!\246!!!\246nullnullnull\246!!!\246!!!\246!!!\246nullnullnull\246!!!\246!!!\246!!!\246nullnullnull\246!!!\246!!!\246!!!\246nullnullnull\246!!!\246!!!\246!!!\246nullnullnull\246!!!\246!!!\246!!!\246nullnullnull\246!!!\246!!!\246!!!\246nullnullnull\246!!!\246!!!\246!!!\246nullnullnull\246!!!\246!!!\253\254\256\256\246!!!\246nullnullnull\246!!!\246!!!\246!!!\246nullnullnull\246!!!\246!!!\246!!!\246nullnullnull\246!!!\246!!!\246!!!\246nullnullnull\246!!!\246!!!\246!!!\246nullnullnull\246!!!\246!!!\246!!!\246nullnullnull\246!!!\246!!!\246!!!\246nullnullnull\246!!!\246!!!\246!!!\246nullnullnull\246!!!\246!!!!");
    }

    @Test
    public void test11390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11390");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullfehhnullnullnullfehhnullnull!!nullfehhnullnullnullfehhnullnull!!nullfehhnullnullnullfehhnullnullnullfehhnullnullnullfehhnullnull!!nullfehhnullnullnullfehhnullnull!!nullfehhnullnullnullfehhnullnull!", "\275U~~~U~~~U~~~\275U~~~U~~~U~~~\275U~~~U~~~U~~~\275U~~~U~~~U~~~U~~~U~~~\275\275U~~~U~~~\275\275U~~~U~~~\275\275U~~~U~~~\275\275\275U~~~U~~~U~~~\275U~~~U~~~U~~~\275U~~~U~~~U~~~\275U~~~U~~~U~~~U~~~U~~~\275\275U~~~U~~~\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\377nullnullnullnullnullnullnull\377nullnullnull\377nullnullnull\377nullnullnullnullnullnullnull\377nullnullnull\377nullnull!!null\377nullnullnullnullnullnullnull\377nullnullnull\377nullnullnull\377nullnullnullnullnullnullnull\377nullnullnull\377nullnull!!null\377nullnullnullnullnullnullnull\377nullnullnull\377nullnullnull\377nullnullnullnullnullnullnull\377nullnullnull\377nullnullnull\377nullnullnullnullnullnullnull\377nullnullnull\377nullnullnull\377nullnullnullnullnullnullnull\377nullnullnull\377nullnull!!null\377nullnullnullnullnullnullnull\377nullnullnull\377nullnullnull\377nullnullnullnullnullnullnull\377nullnullnull\377nullnull!!null\377nullnullnullnullnullnullnull\377nullnullnull\377nullnullnull\377nullnullnullnullnullnullnull\377nullnullnull\377nullnull!" + "'", str2, "null\377nullnullnullnullnullnullnull\377nullnullnull\377nullnullnull\377nullnullnullnullnullnullnull\377nullnullnull\377nullnull!!null\377nullnullnullnullnullnullnull\377nullnullnull\377nullnullnull\377nullnullnullnullnullnullnull\377nullnullnull\377nullnull!!null\377nullnullnullnullnullnullnull\377nullnullnull\377nullnullnull\377nullnullnullnullnullnullnull\377nullnullnull\377nullnullnull\377nullnullnullnullnullnullnull\377nullnullnull\377nullnullnull\377nullnullnullnullnullnullnull\377nullnullnull\377nullnull!!null\377nullnullnullnullnullnullnull\377nullnullnull\377nullnullnull\377nullnullnullnullnullnullnull\377nullnullnull\377nullnull!!null\377nullnullnullnullnullnullnull\377nullnullnull\377nullnullnull\377nullnullnullnullnullnullnull\377nullnullnull\377nullnull!");
    }

    @Test
    public void test11391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11391");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!\226!", "\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!\216\216L!!!L!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\226!" + "'", str2, "!\226!");
    }

    @Test
    public void test11392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11392");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237nullnullnullnullnullnullnullnull\242null\237\237\242null\237\237!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae\u01ae!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test11393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11393");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~!", "\276\276\276\276nullnullnull\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276nullnullnull\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~!" + "'", str2, "\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~!");
    }

    @Test
    public void test11394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11394");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "\u0388\u0388\u0346\u0388\u0388\u0346\u0366\u0366\u0388\u0388\u0346\u0388\u0388\u0346\u0366\u0366\u0388\u0388\u0346\u0388\u0388\u0346\u0366\u0366\u0388\u0388\u0346\u0388\u0388\u0346\u0366\u0366\u0388\u0388\u0346\u0388\u0388\u0346\u0366\u0366\u0388\u0388\u0346\u0388\u0388\u0346\u0366\u0366\u0388\u0388\u0346\u0388\u0388\u0346\u0366\u0366\u0388\u0388\u0346\u0388\u0388\u0346\u0366\u0366!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348`nullnull\333\333nullnull\333\333nullnull\333\333\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348`nullnull\333\333nullnull\333\333nullnull\333\333\u0348\u0346\u0346!");
    }

    @Test
    public void test11395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11395");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!LLLL!!!!!!LLLL!!!!!!!!LLLL!!!!!!LLLL!!!!!!!!LLLL!!!!!!LLLL!!!!!!!!LLLL!!!!!!LLLL!!!!!!!!LLLL!!!!!!LLLL!!!!!!!!LLLL!!!!!!LLLL!!!!!!!!LLLL!!!!!!LLLL!!!!!!!!LLLL!!!!!!LLLL!!!!!!!", "^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnullnullnull!!!!!!nullnullnullnull!!!!!!!!nullnullnullnull!!!!!!nullnullnullnull!!!!!!!!nullnullnullnull!!!!!!nullnullnullnull!!!!!!!!nullnullnullnull!!!!!!nullnullnullnull!!!!!!!!nullnullnullnull!!!!!!nullnullnullnull!!!!!!!!nullnullnullnull!!!!!!nullnullnullnull!!!!!!!!nullnullnullnull!!!!!!nullnullnullnull!!!!!!!!nullnullnullnull!!!!!!nullnullnullnull!!!!!!!" + "'", str2, "!!nullnullnullnull!!!!!!nullnullnullnull!!!!!!!!nullnullnullnull!!!!!!nullnullnullnull!!!!!!!!nullnullnullnull!!!!!!nullnullnullnull!!!!!!!!nullnullnullnull!!!!!!nullnullnullnull!!!!!!!!nullnullnullnull!!!!!!nullnullnullnull!!!!!!!!nullnullnullnull!!!!!!nullnullnullnull!!!!!!!!nullnullnullnull!!!!!!nullnullnullnull!!!!!!!!nullnullnullnull!!!!!!nullnullnullnull!!!!!!!");
    }

    @Test
    public void test11396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11396");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("}~\200\200}~\200\200\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242}~\200\200}~\200\200\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242!", "!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN\200}}`!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN!UNN]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200nullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnull!" + "'", str2, "}~\200\200}~\200\200nullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test11397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11397");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("E\220UU\200~~E\220UU\200~~E\220UUE\220UUE\220UU\200~~E\220UU\200~~E\220UUE\220UU!!E\220UU\200~~E\220UU\200~~E\220UUE\220UUE\220UU\200~~E\220UU\200~~E\220UUE\220UU!!E\220UU\200~~E\220UU\200~~E\220UUE\220UUE\220UU\200~~E\220UU\200~~E\220UUE\220UUE\220UU\200~~E\220UU\200~~E\220UUE\220UUE\220UU\200~~E\220UU\200~~E\220UUE\220UU!!E\220UU\200~~E\220UU\200~~E\220UUE\220UUE\220UU\200~~E\220UU\200~~E\220UUE\220UU!!E\220UU\200~~E\220UU\200~~E\220UUE\220UUE\220UU\200~~E\220UU\200~~E\220UUE\220UU!", "LNUULNUU!!LNUULNUU!!LNUULNUULNUULNUU!!LNUULNUU!!LNUULNUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LL!!L\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LL!!L\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LL!!L\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LL!!L\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LL!" + "'", str2, "L\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LL!!L\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LL!!L\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LL!!L\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LL!!L\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LL!");
    }

    @Test
    public void test11398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11398");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU\276LNUULNUULNUULNUU\275\275!", "nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\u0406\u0403\u0404\u0404\u0406\u0403\u0404\u0404\u0406\u0403\u0404\u0404\u0406\u0403\u0404\u0404\u0406\u0403\u0404\u0404\u0406\u0403\u0404\u0404\u0406\u0403\u0404\u0404\u0406\u0403\u0404\u0404\u0406\u0403\u0404\u0404\u0406\u0403\u0404\u0404\u0406\u0403\u0404\u0404\u0406\u0403\u0404\u0404\276\u0406\u0403\u0404\u0404\u0406\u0403\u0404\u0404\u0406\u0403\u0404\u0404\u0406\u0403\u0404\u0404\275\275!" + "'", str2, "\275\u0406\u0403\u0404\u0404\u0406\u0403\u0404\u0404\u0406\u0403\u0404\u0404\u0406\u0403\u0404\u0404\u0406\u0403\u0404\u0404\u0406\u0403\u0404\u0404\u0406\u0403\u0404\u0404\u0406\u0403\u0404\u0404\u0406\u0403\u0404\u0404\u0406\u0403\u0404\u0404\u0406\u0403\u0404\u0404\u0406\u0403\u0404\u0404\276\u0406\u0403\u0404\u0404\u0406\u0403\u0404\u0404\u0406\u0403\u0404\u0404\u0406\u0403\u0404\u0404\275\275!");
    }

    @Test
    public void test11399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11399");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("H!~~H!~~H!~~H!~~H!~~H!~~H!~~H!~~nullnullnullnullnullnullnullnullH!~~H!~~H!~~H!~~H!~~H!~~H!~~H!~~nullnullnullnullnullnullnullnull!", "\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\216!~~\216!~~\216!~~\216!~~\216!~~\216!~~\216!~~\216!~~VSTTVSTTVSTTVSTTVSTTVSTTVSTTVSTT\216!~~\216!~~\216!~~\216!~~\216!~~\216!~~\216!~~\216!~~VSTTVSTTVSTTVSTTVSTTVSTTVSTTVSTT!" + "'", str2, "\216!~~\216!~~\216!~~\216!~~\216!~~\216!~~\216!~~\216!~~VSTTVSTTVSTTVSTTVSTTVSTTVSTTVSTT\216!~~\216!~~\216!~~\216!~~\216!~~\216!~~\216!~~\216!~~VSTTVSTTVSTTVSTTVSTTVSTTVSTTVSTT!");
    }

    @Test
    public void test11400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11400");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!", "!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!!~\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!!!!~\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!!~\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!!!!~\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!!~\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!!~\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!!~\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!!!!~\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!!~\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!!!!~\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!!~\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!!" + "'", str2, "!~\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!!~\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!!!!~\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!!~\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!!!!~\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!!~\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!!~\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!!~\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!!!!~\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!!~\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!!!!~\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!!~\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!\250!!!!");
    }

    @Test
    public void test11401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11401");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!!!" + "'", str2, "\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!\216\216!!!!!");
    }

    @Test
    public void test11402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11402");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\200\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0]]!", "LUNLLUNLLUNLLLUNLLUNLLUNLLLUNLLUNLLUNLLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLLUNLLUNLLUNLLLUNLLUNLLUNLLLUNLLUNLLUNLLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test11403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11403");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("N^NNN^NNN^NNN^NNN^NNN^NNN^NNN^NN!!N^NNN^NNN^NNN^NNN^NNN^NNN^NNN^NN!!N^NNN^NNN^NNN^NNN^NNN^NNN^NNN^NN!!N^NNN^NNN^NNN^NNN^NNN^NNN^NNN^NN!!N^NNN^NNN^NNN^NNN^NNN^NNN^NNN^NN!!N^NNN^NNN^NNN^NNN^NNN^NNN^NNN^NN!!N^NNN^NNN^NNN^NNN^NNN^NNN^NNN^NN!!N^NNN^NNN^NNN^NNN^NNN^NNN^NNN^NN!!!", "}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!!}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200}\200\200\200\200~~}\200\200\200\200~~}\200\200\200}\200\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~!!~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~!!~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~!!~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~!!~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~!!~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~!!~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~!!~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~!!!" + "'", str2, "~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~!!~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~!!~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~!!~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~!!~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~!!~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~!!~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~!!~^~~~^~~~^~~~^~~~^~~~^~~~^~~~^~~!!!");
    }

    @Test
    public void test11404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11404");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200!", "]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL!!]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL!!]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL!!]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL!!]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL!!]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL!!]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL!!]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL]]LL]]LL!!]]LL]]LL]]LL]]LL]]LL]]LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200!" + "'", str2, "\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200!");
    }

    @Test
    public void test11405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11405");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUU!", "NNNNNNNNNNNNNNNN\200}}`NNNNNNNNNNNNNNNN]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNnnnnNNNNNNNNNNNNnnnnNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNnnnnNNNNNNNNNNNNnnnnNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNnnnnNNNNNNNNNNNNnnnnNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNnnnnNNNNNNNNNNNNnnnnNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNnnnnNNNNNNNNNNNNnnnnNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNnnnnNNNNNNNNNNNNnnnnNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNnnnnNNNNNNNNNNNNnnnnNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNnnnnNNNNNNNNNNNNnnnnNNNNNNNN!" + "'", str2, "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNnnnnNNNNNNNNNNNNnnnnNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNnnnnNNNNNNNNNNNNnnnnNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNnnnnNNNNNNNNNNNNnnnnNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNnnnnNNNNNNNNNNNNnnnnNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNnnnnNNNNNNNNNNNNnnnnNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNnnnnNNNNNNNNNNNNnnnnNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNnnnnNNNNNNNNNNNNnnnnNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNnnnnNNNNNNNNNNNNnnnnNNNNNNNN!");
    }

    @Test
    public void test11406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11406");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u023e\u023e\u023e\u023e!", "UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!nullnull!");
    }

    @Test
    public void test11407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11407");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLL!!NNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLL!!NNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLL!!NNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLL!!NNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLL!", "}~\200\200}~\200\200\u010c\u010b\u010c\u010b\u010c\u010b\u010c\u010b\u010c\u010b\u010c\u010b\u010c\u010b\u010c\u010b\u010c\u010b\u010c\u010b\u010c\u010b\u010c\u010b\u010c\u010b\u010c\u010b\u010c\u010b\u010c\u010b\u010c\u010b\u010c\u010b\u010c\u010b\u010c\u010b\u010c\u010b\u010c\u010b\u010c\u010b\u010c\u010bnullnull}~\200\200}~\200\200\u010c\u010b\u010c\u010b\u010c\u010b\u010c\u010b\u010c\u010b\u010c\u010b\u010c\u010b\u010c\u010b\u010c\u010b\u010c\u010b\u010c\u010b\u010c\u010b\u010c\u010b\u010c\u010b\u010c\u010b\u010c\u010b\u010c\u010b\u010c\u010b\u010c\u010b\u010c\u010b\u010c\u010b\u010c\u010b\u010c\u010b\u010c\u010bnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUU!!LLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUU!!LLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUU!!LLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUU!!LLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUU!" + "'", str2, "LLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUU!!LLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUU!!LLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUU!!LLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUU!!LLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUULLNLUUNLUU!");
    }

    @Test
    public void test11408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11408");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200XX~~XX~~}~\200\200}~\200\200XX~~XX~~}~\200\200}~\200\200XX~~XX~~}~\200\200}~\200\200\u0348\u0346\u0346!", "\u023e\u023e\u023e\200\u023e\u023e\u023e]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnull~~nullnull~~}~\200\200}~\200\200nullnull~~nullnull~~}~\200\200}~\200\200nullnull~~nullnull~~}~\200\200}~\200\200\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnull~~nullnull~~}~\200\200}~\200\200nullnull~~nullnull~~}~\200\200}~\200\200nullnull~~nullnull~~}~\200\200}~\200\200\u0348\u0346\u0346!");
    }

    @Test
    public void test11409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11409");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!", "\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a\u015a!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test11410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11410");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!\276\276\276\276\276!!!", "\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\276\276\276\276\276!!!" + "'", str2, "!\276\276\276\276\276!!!");
    }

    @Test
    public void test11411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11411");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\220\220\215\215\u0346\u0348\u0348!", "!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!!]]!!!]]!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\220\220\215\215\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\220\220\215\215\u0346\u0348\u0348!");
    }

    @Test
    public void test11412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11412");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!XXXXXXXXXXXX!!!!XXXXXXXXXXXX!!!!!!!", "null\226\230\230nullnullnullnull\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230nullnullnullnull\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\226\226\226\226\226\226\226\226\226\226\226\226!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!!!!" + "'", str2, "\226\226\226\226\226\226\226\226\226\226\226\226!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!\226\226\226\226\226\226\226\226\226\226\226\226!!!!!!!");
    }

    @Test
    public void test11413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11413");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullnullnullnullnullnull\330\340\340null\214\214null\330\340\340null\214\214nullnullnullnullnullnullnullnullnull\330\340\340null\214\214null\330\340\340null\214\214nullnullnullnullnullnullnullnullnull\330\340\340null\214\214null\330\340\340null\214\214nullnullnullnullnullnullnullnullnull\330\340\340null\214\214null\330\340\340null\214\214nullnullnullnullnullnullnullnullnull\330\340\340null\214\214null\330\340\340null\214\214nullnullnullnullnullnullnullnullnull\330\340\340null\214\214null\330\340\340null\214\214nullnullnullnullnullnullnullnullnull\330\340\340null\214\214null\330\340\340null\214\214nullnullnullnullnullnullnullnullnull\330\340\340null\214\214null\330\340\340null\214\214!", "nullLLL\256\254\254nullLLL\256\254\254!!nullLLL\256\254\254nullLLL\256\254\254!!nullLLL\256\254\254nullLLL\256\254\254!!nullLLL\256\254\254nullLLL\256\254\254!!nullLLL\256\254\254nullLLL\256\254\254!!nullLLL\256\254\254nullLLL\256\254\254!!nullLLL\256\254\254nullLLL\256\254\254!!nullLLL\256\254\254nullLLL\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!\254LLU\254!!\214\214U\254!!\254LLU\254!!\214\214U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!\254LLU\254!!\214\214U\254!!\254LLU\254!!\214\214U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!\254LLU\254!!\214\214U\254!!\254LLU\254!!\214\214U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!\254LLU\254!!\214\214U\254!!\254LLU\254!!\214\214U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!\254LLU\254!!\214\214U\254!!\254LLU\254!!\214\214U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!\254LLU\254!!\214\214U\254!!\254LLU\254!!\214\214U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!\254LLU\254!!\214\214U\254!!\254LLU\254!!\214\214U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!\254LLU\254!!\214\214U\254!!\254LLU\254!!\214\214!" + "'", str2, "U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!\254LLU\254!!\214\214U\254!!\254LLU\254!!\214\214U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!\254LLU\254!!\214\214U\254!!\254LLU\254!!\214\214U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!\254LLU\254!!\214\214U\254!!\254LLU\254!!\214\214U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!\254LLU\254!!\214\214U\254!!\254LLU\254!!\214\214U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!\254LLU\254!!\214\214U\254!!\254LLU\254!!\214\214U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!\254LLU\254!!\214\214U\254!!\254LLU\254!!\214\214U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!\254LLU\254!!\214\214U\254!!\254LLU\254!!\214\214U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!U\254!!\254LLU\254!!\214\214U\254!!\254LLU\254!!\214\214!");
    }

    @Test
    public void test11414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11414");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("null!nullnullnullnull!!nullnull!!nullnull!!nullnull!!null!nullnullnullnull!!nullnull!!!", "!LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullcc!nullnullccnullnullccnullnullccnullnullcc!!nullnullccnullnullcc!!nullnullccnullnullcc!!nullnullccnullnullcc!!nullnullcc!nullnullccnullnullccnullnullccnullnullcc!!nullnullccnullnullcc!!!" + "'", str2, "nullnullcc!nullnullccnullnullccnullnullccnullnullcc!!nullnullccnullnullcc!!nullnullccnullnullcc!!nullnullccnullnullcc!!nullnullcc!nullnullccnullnullccnullnullccnullnullcc!!nullnullccnullnullcc!!!");
    }

    @Test
    public void test11415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11415");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("ELLLELLLELLLELLL\200}}`ELLLELLLELLLELLL]]!", "`}LNNNLNNN`}LNNNLNNN`}LNNNLNNN`}LNNNLNNN`}LNNNLNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullooonullooonullooonullooo\200}}`nullooonullooonullooonullooo]]!" + "'", str2, "nullooonullooonullooonullooo\200}}`nullooonullooonullooonullooo]]!");
    }

    @Test
    public void test11416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11416");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232!", "LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232!" + "'", str2, "~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232~}\200\200~}\200\200\227\227\232\232\227\227\232\232!");
    }

    @Test
    public void test11417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11417");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU\254UUU\254UUUU\254UUU\254UU!", "nullnull\333null\330\330\333null\330\330nullnull\333null\330\330\333null\330\330\214\214nullnull\333null\330\330\333null\330\330nullnull\333null\330\330\333null\330\330\214\214nullnull\333null\330\330\333null\330\330nullnull\333null\330\330\333null\330\330\214\214nullnull\333null\330\330\333null\330\330nullnull\333null\330\330\333null\330\330\214\214nullnull\333null\330\330\333null\330\330nullnull\333null\330\330\333null\330\330\214\214nullnull\333null\330\330\333null\330\330nullnull\333null\330\330\333null\330\330\214\214nullnull\333null\330\330\333null\330\330nullnull\333null\330\330\333null\330\330\214\214nullnull\333null\330\330\333null\330\330nullnull\333null\330\330\333null\330\330\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\254\u01aa\u01aa\u01aa\254\u01aa\u01aa\u01aa\u01aa\254\u01aa\u01aa\u01aa\254\u01aa\u01aa\254\u01aa\u01aa\u01aa\254\u01aa\u01aa\u01aa\u01aa\254\u01aa\u01aa\u01aa\254\u01aa\u01aa\254\u01aa\u01aa\u01aa\254\u01aa\u01aa\u01aa\u01aa\254\u01aa\u01aa\u01aa\254\u01aa\u01aa\254\u01aa\u01aa\u01aa\254\u01aa\u01aa\u01aa\u01aa\254\u01aa\u01aa\u01aa\254\u01aa\u01aa\254\u01aa\u01aa\u01aa\254\u01aa\u01aa\u01aa\u01aa\254\u01aa\u01aa\u01aa\254\u01aa\u01aa\254\u01aa\u01aa\u01aa\254\u01aa\u01aa\u01aa\u01aa\254\u01aa\u01aa\u01aa\254\u01aa\u01aa\254\u01aa\u01aa\u01aa\254\u01aa\u01aa\u01aa\u01aa\254\u01aa\u01aa\u01aa\254\u01aa\u01aa\254\u01aa\u01aa\u01aa\254\u01aa\u01aa\u01aa\u01aa\254\u01aa\u01aa\u01aa\254\u01aa\u01aa!" + "'", str2, "\254\u01aa\u01aa\u01aa\254\u01aa\u01aa\u01aa\u01aa\254\u01aa\u01aa\u01aa\254\u01aa\u01aa\254\u01aa\u01aa\u01aa\254\u01aa\u01aa\u01aa\u01aa\254\u01aa\u01aa\u01aa\254\u01aa\u01aa\254\u01aa\u01aa\u01aa\254\u01aa\u01aa\u01aa\u01aa\254\u01aa\u01aa\u01aa\254\u01aa\u01aa\254\u01aa\u01aa\u01aa\254\u01aa\u01aa\u01aa\u01aa\254\u01aa\u01aa\u01aa\254\u01aa\u01aa\254\u01aa\u01aa\u01aa\254\u01aa\u01aa\u01aa\u01aa\254\u01aa\u01aa\u01aa\254\u01aa\u01aa\254\u01aa\u01aa\u01aa\254\u01aa\u01aa\u01aa\u01aa\254\u01aa\u01aa\u01aa\254\u01aa\u01aa\254\u01aa\u01aa\u01aa\254\u01aa\u01aa\u01aa\u01aa\254\u01aa\u01aa\u01aa\254\u01aa\u01aa\254\u01aa\u01aa\u01aa\254\u01aa\u01aa\u01aa\u01aa\254\u01aa\u01aa\u01aa\254\u01aa\u01aa!");
    }

    @Test
    public void test11418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11418");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("ELLLELLLELLLELLLELLLELLLELLLELLLELLLELLLELLLELLLELLLELLL!", "\361\361\361\361\361\361\361\361!!\361\361\361\361\361\361\361\361!!\361\361\361\361\361\361\361\361!!\361\361\361\361\361\361\361\361!!\361\361\361\361\361\361\361\361!!\361\361\361\361\361\361\361\361!!\361\361\361\361\361\361\361\361!!\361\361\361\361\361\361\361\361!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321!" + "'", str2, "\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321\321!");
    }

    @Test
    public void test11419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11419");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0126\u0128\u0128\u0126\u0128\u0128!", "!]]]!]]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test11420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11420");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("L\335LLL\335LL!!L\335LLL\335LL!!L\335LLL\335LLL\335LLL\335LL!!L\335LLL\335LL!!L\335LLL\335LL!", "\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204!!\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204!!\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204!!\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204!!\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab!" + "'", str2, "\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab\u01ab!");
    }

    @Test
    public void test11421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11421");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!NL!!\230NL!!NL!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!!NL!!\230NL!!NL!!NL!!\230NL!!NL!!!", "}unll!!!\200\200}unll!!!\200\200}unll!!!\200\200}unll!!!\200\200unll!~~unll!~~unll!~~unll!~~unll!~~unll!~~unll!~~unll!~~unll!~~unll!~~unll!~~unll!~~unll!~~unll!~~unll!~~unll!~~}unll!!!\200\200}unll!!!\200\200}unll!!!\200\200}unll!!!\200\200unll!~~unll!~~unll!~~unll!~~unll!~~unll!~~unll!~~unll!~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LU!!\230LU!!LU!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!!" + "'", str2, "!LU!!\230LU!!LU!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!!");
    }

    @Test
    public void test11422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11422");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!", "\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!" + "'", str2, "\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!");
    }

    @Test
    public void test11423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11423");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!", "{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL{|~~{|~~ULLL\200ULLLULLLULLL\200ULLLULLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!|!~~|!~~!!|!~~|!~~!!!!|!~~|!~~!!|!~~|!~~!!!!|!~~|!~~!!|!~~|!~~!!!!|!~~|!~~!!|!~~|!~~!!!!|!~~|!~~!!|!~~|!~~!!!!|!~~|!~~!!|!~~|!~~!!!!|!~~|!~~!!|!~~|!~~!!!!|!~~|!~~!!|!~~|!~~!" + "'", str2, "!!!!|!~~|!~~!!|!~~|!~~!!!!|!~~|!~~!!|!~~|!~~!!!!|!~~|!~~!!|!~~|!~~!!!!|!~~|!~~!!|!~~|!~~!!!!|!~~|!~~!!|!~~|!~~!!!!|!~~|!~~!!|!~~|!~~!!!!|!~~|!~~!!|!~~|!~~!!!!|!~~|!~~!!|!~~|!~~!");
    }

    @Test
    public void test11424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11424");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLLUNLLUNLLUUUNLLUNLLUUUNLLUNLL!", "~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULL!" + "'", str2, "LULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULLLULLLULLLLLULLLULLLLLULLLULL!");
    }

    @Test
    public void test11425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11425");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNNNNNN\226NNNNNNNN!", "~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]\225\230\230~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]\225\230\230~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]\225\230\230~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]\225\230\230\200}}`~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]\225\230\230~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]\225\230\230~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]\225\230\230~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]~]]]\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]!" + "'", str2, "]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]]]]]\226]]]]]]]]!");
    }

    @Test
    public void test11426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11426");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("null!nullnullnull!nullnull\225\225null!nullnullnull!nullnull\225\225null!nullnullnull!nullnull\225\225null!nullnullnull!nullnull\225\225null!nullnullnull!nullnull\225\225null!nullnullnull!nullnull\225\225null!nullnullnull!nullnull\225\225null!nullnullnull!nullnull\225\225!", "N\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!N\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NNN\254NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNN!NNNNNNNNNNNN!NNNNNNNN\225\225NNNN!NNNNNNNNNNNN!NNNNNNNN\225\225NNNN!NNNNNNNNNNNN!NNNNNNNN\225\225NNNN!NNNNNNNNNNNN!NNNNNNNN\225\225NNNN!NNNNNNNNNNNN!NNNNNNNN\225\225NNNN!NNNNNNNNNNNN!NNNNNNNN\225\225NNNN!NNNNNNNNNNNN!NNNNNNNN\225\225NNNN!NNNNNNNNNNNN!NNNNNNNN\225\225!" + "'", str2, "NNNN!NNNNNNNNNNNN!NNNNNNNN\225\225NNNN!NNNNNNNNNNNN!NNNNNNNN\225\225NNNN!NNNNNNNNNNNN!NNNNNNNN\225\225NNNN!NNNNNNNNNNNN!NNNNNNNN\225\225NNNN!NNNNNNNNNNNN!NNNNNNNN\225\225NNNN!NNNNNNNNNNNN!NNNNNNNN\225\225NNNN!NNNNNNNNNNNN!NNNNNNNN\225\225NNNN!NNNNNNNNNNNN!NNNNNNNN\225\225!");
    }

    @Test
    public void test11427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11427");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!!wxzzwxzzwxzzwxzzwxzzwxzzwxzzwxzz!", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!" + "'", str2, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
    }

    @Test
    public void test11428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11428");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("~}\200\200~}\200\200LLUULLUULLLLUULLUULL~}\200\200~}\200\200LLUULLUULLLLUULLUULL~}\200\200~}\200\200LLUULLUULLLLUULLUULL~}\200\200~}\200\200LLUULLUULLLLUULLUULL~}\200\200~}\200\200LLUULLUULLLLUULLUULL~}\200\200~}\200\200LLUULLUULLLLUULLUULL~}\200\200~}\200\200LLUULLUULLLLUULLUULL~}\200\200~}\200\200LLUULLUULLLLUULLUULL!", "``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200!!``!!``!!!!``!!``!!~}\200\200~}\200\200!!``!!``!!!!``!!``!!~}\200\200~}\200\200!!``!!``!!!!``!!``!!~}\200\200~}\200\200!!``!!``!!!!``!!``!!~}\200\200~}\200\200!!``!!``!!!!``!!``!!~}\200\200~}\200\200!!``!!``!!!!``!!``!!~}\200\200~}\200\200!!``!!``!!!!``!!``!!~}\200\200~}\200\200!!``!!``!!!!``!!``!!!" + "'", str2, "~}\200\200~}\200\200!!``!!``!!!!``!!``!!~}\200\200~}\200\200!!``!!``!!!!``!!``!!~}\200\200~}\200\200!!``!!``!!!!``!!``!!~}\200\200~}\200\200!!``!!``!!!!``!!``!!~}\200\200~}\200\200!!``!!``!!!!``!!``!!~}\200\200~}\200\200!!``!!``!!!!``!!``!!~}\200\200~}\200\200!!``!!``!!!!``!!``!!~}\200\200~}\200\200!!``!!``!!!!``!!``!!!");
    }

    @Test
    public void test11429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11429");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a!!HH!!HH!!!!HH!!HH!!!!!", "!\253\256\256]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL]!\225\225\225LL!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!" + "'", str2, "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!");
    }

    @Test
    public void test11430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11430");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!!", "\u0366\u0365\u0368\u0368\231\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnoqqnoqqnoqq\256\254\254nullnullnullnullnoqqnoqqnoqq\256\254\254!!nullnullnullnullnoqqnoqqnoqq\256\254\254nullnullnullnullnoqqnoqqnoqq\256\254\254!!nullnullnullnullnoqqnoqqnoqq\256\254\254nullnullnullnullnoqqnoqqnoqq\256\254\254!!nullnullnullnullnoqqnoqqnoqq\256\254\254nullnullnullnullnoqqnoqqnoqq\256\254\254!!nullnullnullnullnoqqnoqqnoqq\256\254\254nullnullnullnullnoqqnoqqnoqq\256\254\254!!nullnullnullnullnoqqnoqqnoqq\256\254\254nullnullnullnullnoqqnoqqnoqq\256\254\254!!nullnullnullnullnoqqnoqqnoqq\256\254\254nullnullnullnullnoqqnoqqnoqq\256\254\254!!nullnullnullnullnoqqnoqqnoqq\256\254\254nullnullnullnullnoqqnoqqnoqq\256\254\254!!!" + "'", str2, "nullnullnullnullnoqqnoqqnoqq\256\254\254nullnullnullnullnoqqnoqqnoqq\256\254\254!!nullnullnullnullnoqqnoqqnoqq\256\254\254nullnullnullnullnoqqnoqqnoqq\256\254\254!!nullnullnullnullnoqqnoqqnoqq\256\254\254nullnullnullnullnoqqnoqqnoqq\256\254\254!!nullnullnullnullnoqqnoqqnoqq\256\254\254nullnullnullnullnoqqnoqqnoqq\256\254\254!!nullnullnullnullnoqqnoqqnoqq\256\254\254nullnullnullnullnoqqnoqqnoqq\256\254\254!!nullnullnullnullnoqqnoqqnoqq\256\254\254nullnullnullnullnoqqnoqqnoqq\256\254\254!!nullnullnullnullnoqqnoqqnoqq\256\254\254nullnullnullnullnoqqnoqqnoqq\256\254\254!!nullnullnullnullnoqqnoqqnoqq\256\254\254nullnullnullnullnoqqnoqqnoqq\256\254\254!!!");
    }

    @Test
    public void test11431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11431");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320!", "\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320!" + "'", str2, "\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320!");
    }

    @Test
    public void test11432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11432");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!!", "LL!!!!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!\253\254\256\256!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test11433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11433");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u0148\u0145\u0145\u0346\u0348\u0348!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test11434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11434");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!", "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a!!HH!!HH!!!!HH!!HH!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!" + "'", str2, "!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!");
    }

    @Test
    public void test11435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11435");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullnullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnullnullnullnullnull\204\204nullnull\204\204!", "NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLLLNNLLNNNULLNULLLLNNLLNNNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLLLNNLLNNNULLNULLLLNNLLNNNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLLLNNLLNNNULLNULLLLNNLLNNNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLLLNNLLNNNULLNULLLLNNLLNNNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLLLNNLLNNNULLNULLLLNNLLNNNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLLLNNLLNNNULLNULLLLNNLLNNNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLLLNNLLNNNULLNULLLLNNLLNNNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLLLNNLLNNNULLNULLLLNNLLNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNNNLNNNLNNNLNNNLNNNLNNN\204\204LNNNLNNN\204\204LNNNLNNN\204\204LNNNLNNN\204\204LNNNLNNNLNNNLNNNLNNNLNNN\204\204LNNNLNNN\204\204!" + "'", str2, "LNNNLNNNLNNNLNNNLNNNLNNN\204\204LNNNLNNN\204\204LNNNLNNN\204\204LNNNLNNN\204\204LNNNLNNNLNNNLNNNLNNNLNNN\204\204LNNNLNNN\204\204!");
    }

    @Test
    public void test11436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11436");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\253\254\256\256!JJJ!JJJ!JJJ!JJJ\253\254\256\256!JJJ!JJJ!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200\254LLL!\254\254\254LLL\254LLL\254\254\254LLL\254LLL\254\254\254LLL\254LLL\254\254\254LLL!\254\254\254LLL\254LLL\254\254\254LLL\254LLL\254\254\254LLL\254LLL\254\254}~\200\200}~\200\200\254LLL!\254\254\254LLL\254LLL\254\254\254LLL\254LLL\254\254\254LLL\254LLL\254\254\254LLL!\254\254\254LLL\254LLL\254\254\254LLL\254LLL\254\254\254LLL\254LLL\254\254}~\200\200}~\200\200\254LLL!\254\254\254LLL\254LLL\254\254\254LLL\254LLL\254\254\254LLL\254LLL\254\254\254LLL!\254\254\254LLL\254LLL\254\254\254LLL\254LLL\254\254\254LLL\254LLL\254\254}~\200\200}~\200\200\254LLL!\254\254\254LLL\254LLL\254\254\254LLL\254LLL\254\254\254LLL\254LLL\254\254\254LLL!\254\254\254LLL\254LLL\254\254\254LLL\254LLL\254\254\254LLL\254LLL\254\254\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256!nullnullnull!nullnullnull!nullnullnull!nullnullnull\253\254\256\256!nullnullnull!nullnullnull!" + "'", str2, "\253\254\256\256!nullnullnull!nullnullnull!nullnullnull!nullnullnull\253\254\256\256!nullnullnull!nullnullnull!");
    }

    @Test
    public void test11437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11437");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!hfHHhfHH!!!", "\200nulleee\220\220\200nulleee\220\220\200nulleee\220\220\200nulleee\220\220\200nulleee\220\220\200nulleee\220\220\200nulleee\220\220\200nulleee\220\220!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220EEE\220EEE!!\220EEE\220EEE!!\220EEE\220EEE!!\220EEE\220EEE!!\220EEE\220EEE!!\220EEE\220EEE!!\220EEE\220EEE!!\220EEE\220EEE!!!" + "'", str2, "\220EEE\220EEE!!\220EEE\220EEE!!\220EEE\220EEE!!\220EEE\220EEE!!\220EEE\220EEE!!\220EEE\220EEE!!\220EEE\220EEE!!\220EEE\220EEE!!!");
    }

    @Test
    public void test11438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11438");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullnullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnullnullnullnullnull\204\204nullnull\204\204!", "\276NNN\276NNN\276NNN\276NNN\276NNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "n!nnn!nnn!nnn!nnn!nnn!nn\204\204n!nnn!nn\204\204n!nnn!nn\204\204n!nnn!nn\204\204n!nnn!nnn!nnn!nnn!nnn!nn\204\204n!nnn!nn\204\204!" + "'", str2, "n!nnn!nnn!nnn!nnn!nnn!nn\204\204n!nnn!nn\204\204n!nnn!nn\204\204n!nnn!nn\204\204n!nnn!nnn!nnn!nnn!nnn!nn\204\204n!nnn!nn\204\204!");
    }

    @Test
    public void test11439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11439");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!", "\u02ee\u02eb\u02ec\u02ecnullnullnull\200\u02ee\u02eb\u02ec\u02ecnullnullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
    }

    @Test
    public void test11440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11440");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa]]]]]]]]!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa]]]]]]]]!" + "'", str2, "\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa]]]]]]]]!");
    }

    @Test
    public void test11441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11441");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275\276\u031d\u031dLL\275\276\u031d\u031dLL\225\225\275\276\u031d\u031dLL\275\276\u031d\u031dLL\225\225\275\276\u031d\u031dLL\275\276\u031d\u031dLL\225\225\275\276\u031d\u031dLL\275\276\u031d\u031dLL\225\225\275\276\u031d\u031dLL\275\276\u031d\u031dLL\225\225\275\276\u031d\u031dLL\275\276\u031d\u031dLL\225\225\275\276\u031d\u031dLL\275\276\u031d\u031dLL\225\225\275\276\u031d\u031dLL\275\276\u031d\u031dLL\225\225!", "\276LLL\276LLL\276LLL\276LLL\276LLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276\u031d\u031dTT\275\276\u031d\u031dTT\225\225\275\276\u031d\u031dTT\275\276\u031d\u031dTT\225\225\275\276\u031d\u031dTT\275\276\u031d\u031dTT\225\225\275\276\u031d\u031dTT\275\276\u031d\u031dTT\225\225\275\276\u031d\u031dTT\275\276\u031d\u031dTT\225\225\275\276\u031d\u031dTT\275\276\u031d\u031dTT\225\225\275\276\u031d\u031dTT\275\276\u031d\u031dTT\225\225\275\276\u031d\u031dTT\275\276\u031d\u031dTT\225\225!" + "'", str2, "\275\276\u031d\u031dTT\275\276\u031d\u031dTT\225\225\275\276\u031d\u031dTT\275\276\u031d\u031dTT\225\225\275\276\u031d\u031dTT\275\276\u031d\u031dTT\225\225\275\276\u031d\u031dTT\275\276\u031d\u031dTT\225\225\275\276\u031d\u031dTT\275\276\u031d\u031dTT\225\225\275\276\u031d\u031dTT\275\276\u031d\u031dTT\225\225\275\276\u031d\u031dTT\275\276\u031d\u031dTT\225\225\275\276\u031d\u031dTT\275\276\u031d\u031dTT\225\225!");
    }

    @Test
    public void test11442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11442");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~!", "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UU~~L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UU~~L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UU~~L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UU~~L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UU~~L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UU~~L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UU~~L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UU~~!" + "'", str2, "L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UU~~L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UU~~L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UU~~L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UU~~L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UU~~L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UU~~L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UU~~L!UUL!UUL!UUL!UUL!UUL!UUL!UUL!UU!!L!UUL!UUL!UUL!UU~~!");
    }

    @Test
    public void test11443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11443");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("U!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UUU!\275\275U!\275\275UU!", "\242\237\242\242\242\237\242\242\242\237\242\242\242\237\242\242\242\237\242\242\242\237\242\242\242\237\242\242\242\237\242\242\242\237\242\242\242\237\242\242\242\237\242\242\242\237\242\242\242\237\242\242\242\237\242\242\242\237\242\242\242\237\242\242\242\237\242\242\242\237\242\242\242\237\242\242\242\237\242\242\242\237\242\242\242\237\242\242\242\237\242\242\242\237\242\242\242\237\242\242\242\237\242\242\242\237\242\242\242\237\242\242\242\237\242\242\242\237\242\242\242\237\242\242\242\237\242\242!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\242!\275\275\242!\275\275\242\242\242!\275\275\242!\275\275\242\242\242!\275\275\242!\275\275\242\242\242!\275\275\242!\275\275\242\242\242!\275\275\242!\275\275\242\242\242!\275\275\242!\275\275\242\242\242!\275\275\242!\275\275\242\242\242!\275\275\242!\275\275\242\242!" + "'", str2, "\242!\275\275\242!\275\275\242\242\242!\275\275\242!\275\275\242\242\242!\275\275\242!\275\275\242\242\242!\275\275\242!\275\275\242\242\242!\275\275\242!\275\275\242\242\242!\275\275\242!\275\275\242\242\242!\275\275\242!\275\275\242\242\242!\275\275\242!\275\275\242\242!");
    }

    @Test
    public void test11444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11444");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300!", "\u0166\u0166\u0166\u0166\260\255\255\225\230\230\u0166\u0166\u0166\u0166\260\255\255\225\230\230\u0166\u0166\u0166\u0166\260\255\255\225\230\230\u0166\u0166\u0166\u0166\260\255\255\225\230\230\200\u0166\u0166\u0166\u0166\260\255\255\225\230\230\u0166\u0166\u0166\u0166\260\255\255\225\230\230\u0166\u0166\u0166\u0166\260\255\255\225\230\230\u0166\u0166\u0166\u0166\260\255\255\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test11445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11445");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "\275\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\276\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\u015c\u015d\u015f\u015f\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11446");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UNLLUNLL!!``UNLLUNLL``UNLLUNLL``UNLLUNLLUNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!``UNLLUNLL``UNLLUNLL``UNLLUNLLUNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!UNLLUNLL!!!", "!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLUULLUU!!``LLUULLUU``LLUULLUU``LLUULLUULLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!``LLUULLUU``LLUULLUU``LLUULLUULLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!!" + "'", str2, "LLUULLUU!!``LLUULLUU``LLUULLUU``LLUULLUULLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!``LLUULLUU``LLUULLUU``LLUULLUULLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!!");
    }

    @Test
    public void test11447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11447");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}nullnull!!!!!\200\200}nullnull!!!!!\200\200}nullnull!!!!!\200\200}nullnull!!!!!\200\200nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~}nullnull!!!!!\200\200}nullnull!!!!!\200\200}nullnull!!!!!\200\200}nullnull!!!!!\200\200nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~nullnull!!!~~!", "`}``\275`}```}```}``\275`}```}```}``\275`}```}```}``\275`}```}```}``\275`}```}```}``\275`}```}```}``\275`}```}```}``\275`}```}``}`}``\200\200}`}``\200\200}`}``\200\200}`}``\200\200}`}``\200\200}`}``\200\200}`}``\200\200}`}``\200\200`}``\275`}```}```}``\275`}```}```}``\275`}```}```}``\275`}```}```}``\275`}```}```}``\275`}```}```}``\275`}```}```}``\275`}```}``}`}``\200\200}`}``\200\200}`}``\200\200}`}``\200\200}`}``\200\200}`}``\200\200}`}``\200\200}`}``\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}}`\275\275}`\275\275!!!!!\200\200}}`\275\275}`\275\275!!!!!\200\200}}`\275\275}`\275\275!!!!!\200\200}}`\275\275}`\275\275!!!!!\200\200}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}}`\275\275}`\275\275!!!!!\200\200}}`\275\275}`\275\275!!!!!\200\200}}`\275\275}`\275\275!!!!!\200\200}}`\275\275}`\275\275!!!!!\200\200}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~!" + "'", str2, "}}`\275\275}`\275\275!!!!!\200\200}}`\275\275}`\275\275!!!!!\200\200}}`\275\275}`\275\275!!!!!\200\200}}`\275\275}`\275\275!!!!!\200\200}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}}`\275\275}`\275\275!!!!!\200\200}}`\275\275}`\275\275!!!!!\200\200}}`\275\275}`\275\275!!!!!\200\200}}`\275\275}`\275\275!!!!!\200\200}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~}`\275\275}`\275\275!!!~~!");
    }

    @Test
    public void test11448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11448");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnullnullnullnullnull\336\336nullnull\336\336nullnullnullnull\336\336nullnull\336\336nullnull!", "nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225nullhnullnullnullhnullnullnullnullnullhnullnullnullhnullnullnullnull\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNN!" + "'", str2, "LNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNNLNNNLNNNHHLNNNLNNNHHLNNNLNNN!");
    }

    @Test
    public void test11449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11449");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("XXXXXXXXXXXXXXXX\200}}`XXXXXXXXXXXXXXXX]]!", "\u0366\u0365\u0368\u0368\u016c\u016e\u016b\u016b\u016c\u016e\u016b\u016b\u016c\u016e\u016b\u016b\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test11450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11450");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("N````null```null``!!!!N````null```null``!!!!!!N````null```null``!!!!N````null```null``!!!!!!N````null```null``!!!!N````null```null``!!!!!!N````null```null``!!!!N````null```null``!!!!!!N````null```null``!!!!N````null```null``!!!!!!N````null```null``!!!!N````null```null``!!!!!!N````null```null``!!!!N````null```null``!!!!!!N````null```null``!!!!N````null```null``!!!!!!!", "!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260``!!!!!!!" + "'", str2, "\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u023d\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260``!!!!!!!");
    }

    @Test
    public void test11451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11451");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("`R!RRRRRR!RRRRRR!RRRRR`R!RRRRRR!RRRRRR!RRRRR!", "nullnullHHnullnullHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`L!LLLLLL!LLLLLL!LLLLL`L!LLLLLL!LLLLLL!LLLLL!" + "'", str2, "`L!LLLLLL!LLLLLL!LLLLL`L!LLLLLL!LLLLLL!LLLLL!");
    }

    @Test
    public void test11452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11452");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d!!!", "\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0\u029b\ua7b0\ua7b0\ua7b0]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test11453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11453");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\225\225\225\225\u0346\u0348\u0348!", "!LU!!\230LU!!LU!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!!!LU!!\230LU!!LU!!LU!!\230LU!!LU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\225\225\225\225\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\225\225\225\225\u0346\u0348\u0348!");
    }

    @Test
    public void test11454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11454");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253!", "LlUUnullLlUULlUULlUULlUULlUULlUUnullLlUULlUULlUULlUULlUULlUULlUULlUUnullLlUULlUULlUULlUULlUULlUUnullLlUULlUULlUULlUULlUULlUULlUU!!LlUUnullLlUULlUULlUULlUULlUULlUUnullLlUULlUULlUULlUULlUULlUULlUULlUUnullLlUULlUULlUULlUULlUULlUUnullLlUULlUULlUULlUULlUULlUULlUU!!LlUUnullLlUULlUULlUULlUULlUULlUUnullLlUULlUULlUULlUULlUULlUULlUULlUUnullLlUULlUULlUULlUULlUULlUUnullLlUULlUULlUULlUULlUULlUULlUULlUUnullLlUULlUULlUULlUULlUULlUUnullLlUULlUULlUULlUULlUULlUULlUULlUUnullLlUULlUULlUULlUULlUULlUUnullLlUULlUULlUULlUULlUULlUULlUU!!LlUUnullLlUULlUULlUULlUULlUULlUUnullLlUULlUULlUULlUULlUULlUULlUULlUUnullLlUULlUULlUULlUULlUULlUUnullLlUULlUULlUULlUULlUULlUULlUU!!LlUUnullLlUULlUULlUULlUULlUULlUUnullLlUULlUULlUULlUULlUULlUULlUULlUUnullLlUULlUULlUULlUULlUULlUUnullLlUULlUULlUULlUULlUULlUULlUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253!" + "'", str2, "\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253!");
    }

    @Test
    public void test11455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11455");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("UU]UUUUUU]UUUUUU]UUUUUU]UUUU!UU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUU!UU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUU!UU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUU!UU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUU!UU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUU!UU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUU!UU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUU!UU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUUUU]UUUU!", "U\220LL\200}}`U\220LL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "II]IIIIII]IIIIII]IIIIII]IIII!II]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIII!II]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIII!II]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIII!II]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIII!II]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIII!II]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIII!II]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIII!II]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIII!" + "'", str2, "II]IIIIII]IIIIII]IIIIII]IIII!II]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIII!II]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIII!II]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIII!II]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIII!II]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIII!II]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIII!II]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIII!II]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIIIII]IIII!");
    }

    @Test
    public void test11456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11456");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11457");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("xnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnull!", "\u0366\u0365\u0368\u0368!\253\256\256\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test11458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11458");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!", "NULLNULLNULLNULLNULLNULLNULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "unllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNN!!unllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNN!!unllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNN!!unllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNN!!unllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNN!" + "'", str2, "unllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNN!!unllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNN!!unllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNN!!unllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNN!!unllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNNunllunllLLNNLLNN!");
    }

    @Test
    public void test11459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11459");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368AA!!AA!!\200\200\u0346\u0348\u0348!", "!ULL!ULL!ULL!ULL!ULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368nullnull!!nullnull!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368nullnull!!nullnull!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test11460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11460");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204!!\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204!!\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204!!\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204!!\204\u01ad\u01aa\u01ab\u01ab\204\204\204\u01ad\u01aa\u01ab\u01ab\204\204!", "HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\204HH!!\204\204\204HH!!\204\204!!\204HH!!\204\204\204HH!!\204\204!!\204HH!!\204\204\204HH!!\204\204\204HH!!\204\204\204HH!!\204\204!!\204HH!!\204\204\204HH!!\204\204!!\204HH!!\204\204\204HH!!\204\204!" + "'", str2, "\204HH!!\204\204\204HH!!\204\204!!\204HH!!\204\204\204HH!!\204\204!!\204HH!!\204\204\204HH!!\204\204\204HH!!\204\204\204HH!!\204\204!!\204HH!!\204\204\204HH!!\204\204!!\204HH!!\204\204\204HH!!\204\204!");
    }

    @Test
    public void test11461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11461");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!", "FFFFFFFF!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!" + "'", str2, "!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!!");
    }

    @Test
    public void test11462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11462");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLL]]!", "null^^^nullnull^^nullnull^^nullnull^^nullnull^^null^^^nullnull^^nullnull^^!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\210\210\210\210\210\210\210\210\210\210\210\210\210\210\210\210\200}}`\210\210\210\210\210\210\210\210\210\210\210\210\210\210\210\210]]!" + "'", str2, "\210\210\210\210\210\210\210\210\210\210\210\210\210\210\210\210\200}}`\210\210\210\210\210\210\210\210\210\210\210\210\210\210\210\210]]!");
    }

    @Test
    public void test11463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11463");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!null````nullnullnullnull```nullnullnullnull``!!!!null````nullnullnullnull```nullnullnullnull``!!!!!!!", "LNUULNUU!!LNUULNUU!!LNUULNUULNUULNUU!!LNUULNUU!!LNUULNUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ULNN````ULNNULNNULNNULNN```ULNNULNNULNNULNN``!!!!ULNN````ULNNULNNULNNULNN```ULNNULNNULNNULNN``!!!!!!ULNN````ULNNULNNULNNULNN```ULNNULNNULNNULNN``!!!!ULNN````ULNNULNNULNNULNN```ULNNULNNULNNULNN``!!!!!!ULNN````ULNNULNNULNNULNN```ULNNULNNULNNULNN``!!!!ULNN````ULNNULNNULNNULNN```ULNNULNNULNNULNN``!!!!!!ULNN````ULNNULNNULNNULNN```ULNNULNNULNNULNN``!!!!ULNN````ULNNULNNULNNULNN```ULNNULNNULNNULNN``!!!!!!ULNN````ULNNULNNULNNULNN```ULNNULNNULNNULNN``!!!!ULNN````ULNNULNNULNNULNN```ULNNULNNULNNULNN``!!!!!!ULNN````ULNNULNNULNNULNN```ULNNULNNULNNULNN``!!!!ULNN````ULNNULNNULNNULNN```ULNNULNNULNNULNN``!!!!!!ULNN````ULNNULNNULNNULNN```ULNNULNNULNNULNN``!!!!ULNN````ULNNULNNULNNULNN```ULNNULNNULNNULNN``!!!!!!ULNN````ULNNULNNULNNULNN```ULNNULNNULNNULNN``!!!!ULNN````ULNNULNNULNNULNN```ULNNULNNULNNULNN``!!!!!!!" + "'", str2, "ULNN````ULNNULNNULNNULNN```ULNNULNNULNNULNN``!!!!ULNN````ULNNULNNULNNULNN```ULNNULNNULNNULNN``!!!!!!ULNN````ULNNULNNULNNULNN```ULNNULNNULNNULNN``!!!!ULNN````ULNNULNNULNNULNN```ULNNULNNULNNULNN``!!!!!!ULNN````ULNNULNNULNNULNN```ULNNULNNULNNULNN``!!!!ULNN````ULNNULNNULNNULNN```ULNNULNNULNNULNN``!!!!!!ULNN````ULNNULNNULNNULNN```ULNNULNNULNNULNN``!!!!ULNN````ULNNULNNULNNULNN```ULNNULNNULNNULNN``!!!!!!ULNN````ULNNULNNULNNULNN```ULNNULNNULNNULNN``!!!!ULNN````ULNNULNNULNNULNN```ULNNULNNULNNULNN``!!!!!!ULNN````ULNNULNNULNNULNN```ULNNULNNULNNULNN``!!!!ULNN````ULNNULNNULNNULNN```ULNNULNNULNNULNN``!!!!!!ULNN````ULNNULNNULNNULNN```ULNNULNNULNNULNN``!!!!ULNN````ULNNULNNULNNULNN```ULNNULNNULNNULNN``!!!!!!ULNN````ULNNULNNULNNULNN```ULNNULNNULNNULNN``!!!!ULNN````ULNNULNNULNNULNN```ULNNULNNULNNULNN``!!!!!!!");
    }

    @Test
    public void test11464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11464");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\204\201\201\201\236\276\276\204\201\201\201\236\276\276!!\204\201\201\201\236\276\276\204\201\201\201\236\276\276!!\204\201\201\201\236\276\276\204\201\201\201\236\276\276\204\201\201\201\236\276\276\204\201\201\201\236\276\276!!\204\201\201\201\236\276\276\204\201\201\201\236\276\276!!\204\201\201\201\236\276\276\204\201\201\201\236\276\276!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\204\201\201\201\236\276\276\204\201\201\201\236\276\276!!\204\201\201\201\236\276\276\204\201\201\201\236\276\276!!\204\201\201\201\236\276\276\204\201\201\201\236\276\276\204\201\201\201\236\276\276\204\201\201\201\236\276\276!!\204\201\201\201\236\276\276\204\201\201\201\236\276\276!!\204\201\201\201\236\276\276\204\201\201\201\236\276\276!" + "'", str2, "\204\201\201\201\236\276\276\204\201\201\201\236\276\276!!\204\201\201\201\236\276\276\204\201\201\201\236\276\276!!\204\201\201\201\236\276\276\204\201\201\201\236\276\276\204\201\201\201\236\276\276\204\201\201\201\236\276\276!!\204\201\201\201\236\276\276\204\201\201\201\236\276\276!!\204\201\201\201\236\276\276\204\201\201\201\236\276\276!");
    }

    @Test
    public void test11465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11465");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!!", "TnullnullnullTnullnullnull!!!!TnullnullnullTnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\225\226\230\230\225\226\230\230!!!!!\225\226\230\230\225\226\230\230!!!!!!!\225\226\230\230\225\226\230\230!!!!!\225\226\230\230\225\226\230\230!!!!!!!\225\226\230\230\225\226\230\230!!!!!\225\226\230\230\225\226\230\230!!!!!!!\225\226\230\230\225\226\230\230!!!!!\225\226\230\230\225\226\230\230!!!!!!!\225\226\230\230\225\226\230\230!!!!!\225\226\230\230\225\226\230\230!!!!!!!\225\226\230\230\225\226\230\230!!!!!\225\226\230\230\225\226\230\230!!!!!!!\225\226\230\230\225\226\230\230!!!!!\225\226\230\230\225\226\230\230!!!!!!!\225\226\230\230\225\226\230\230!!!!!\225\226\230\230\225\226\230\230!!!!!!!!" + "'", str2, "\225\226\230\230\225\226\230\230!!!!!\225\226\230\230\225\226\230\230!!!!!!!\225\226\230\230\225\226\230\230!!!!!\225\226\230\230\225\226\230\230!!!!!!!\225\226\230\230\225\226\230\230!!!!!\225\226\230\230\225\226\230\230!!!!!!!\225\226\230\230\225\226\230\230!!!!!\225\226\230\230\225\226\230\230!!!!!!!\225\226\230\230\225\226\230\230!!!!!\225\226\230\230\225\226\230\230!!!!!!!\225\226\230\230\225\226\230\230!!!!!\225\226\230\230\225\226\230\230!!!!!!!\225\226\230\230\225\226\230\230!!!!!\225\226\230\230\225\226\230\230!!!!!!!\225\226\230\230\225\226\230\230!!!!!\225\226\230\230\225\226\230\230!!!!!!!!");
    }

    @Test
    public void test11466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11466");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("FFFFFFFF\214\214FFFFFFFF\214\214FFFFFFFF\214\214FFFFFFFF\214\214FFFFFFFF\214\214FFFFFFFF\214\214FFFFFFFF\214\214FFFFFFFF\214\214!", "null\230\216\216null\230\216\216~~\256\254\254null\230\216\216null\230\216\216~~\256\254\254!!null\230\216\216null\230\216\216~~\256\254\254null\230\216\216null\230\216\216~~\256\254\254!!null\230\216\216null\230\216\216~~\256\254\254null\230\216\216null\230\216\216~~\256\254\254!!null\230\216\216null\230\216\216~~\256\254\254null\230\216\216null\230\216\216~~\256\254\254!!null\230\216\216null\230\216\216~~\256\254\254null\230\216\216null\230\216\216~~\256\254\254!!null\230\216\216null\230\216\216~~\256\254\254null\230\216\216null\230\216\216~~\256\254\254!!null\230\216\216null\230\216\216~~\256\254\254null\230\216\216null\230\216\216~~\256\254\254!!null\230\216\216null\230\216\216~~\256\254\254null\230\216\216null\230\216\216~~\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\216\216\216\216\216\216\216\216\214\214\216\216\216\216\216\216\216\216\214\214\216\216\216\216\216\216\216\216\214\214\216\216\216\216\216\216\216\216\214\214\216\216\216\216\216\216\216\216\214\214\216\216\216\216\216\216\216\216\214\214\216\216\216\216\216\216\216\216\214\214\216\216\216\216\216\216\216\216\214\214!" + "'", str2, "\216\216\216\216\216\216\216\216\214\214\216\216\216\216\216\216\216\216\214\214\216\216\216\216\216\216\216\216\214\214\216\216\216\216\216\216\216\216\214\214\216\216\216\216\216\216\216\216\214\214\216\216\216\216\216\216\216\216\214\214\216\216\216\216\216\216\216\216\214\214\216\216\216\216\216\216\216\216\214\214!");
    }

    @Test
    public void test11467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11467");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("ULLLULLL!!\256\254\254ULLLULLL!!\256\254\254!!ULLLULLL!!\256\254\254ULLLULLL!!\256\254\254!!ULLLULLL!!\256\254\254ULLLULLL!!\256\254\254!!ULLLULLL!!\256\254\254ULLLULLL!!\256\254\254!!ULLLULLL!!\256\254\254ULLLULLL!!\256\254\254!!ULLLULLL!!\256\254\254ULLLULLL!!\256\254\254!!ULLLULLL!!\256\254\254ULLLULLL!!\256\254\254!!ULLLULLL!!\256\254\254ULLLULLL!!\256\254\254!!!", "\305\306\310\310\305\306\310\310!!\305\306\310\310\305\306\310\310!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!\256\254\254nullnullnullnullnullnullnullnull!!\256\254\254!!nullnullnullnullnullnullnullnull!!\256\254\254nullnullnullnullnullnullnullnull!!\256\254\254!!nullnullnullnullnullnullnullnull!!\256\254\254nullnullnullnullnullnullnullnull!!\256\254\254!!nullnullnullnullnullnullnullnull!!\256\254\254nullnullnullnullnullnullnullnull!!\256\254\254!!nullnullnullnullnullnullnullnull!!\256\254\254nullnullnullnullnullnullnullnull!!\256\254\254!!nullnullnullnullnullnullnullnull!!\256\254\254nullnullnullnullnullnullnullnull!!\256\254\254!!nullnullnullnullnullnullnullnull!!\256\254\254nullnullnullnullnullnullnullnull!!\256\254\254!!nullnullnullnullnullnullnullnull!!\256\254\254nullnullnullnullnullnullnullnull!!\256\254\254!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!\256\254\254nullnullnullnullnullnullnullnull!!\256\254\254!!nullnullnullnullnullnullnullnull!!\256\254\254nullnullnullnullnullnullnullnull!!\256\254\254!!nullnullnullnullnullnullnullnull!!\256\254\254nullnullnullnullnullnullnullnull!!\256\254\254!!nullnullnullnullnullnullnullnull!!\256\254\254nullnullnullnullnullnullnullnull!!\256\254\254!!nullnullnullnullnullnullnullnull!!\256\254\254nullnullnullnullnullnullnullnull!!\256\254\254!!nullnullnullnullnullnullnullnull!!\256\254\254nullnullnullnullnullnullnullnull!!\256\254\254!!nullnullnullnullnullnullnullnull!!\256\254\254nullnullnullnullnullnullnullnull!!\256\254\254!!nullnullnullnullnullnullnullnull!!\256\254\254nullnullnullnullnullnullnullnull!!\256\254\254!!!");
    }

    @Test
    public void test11468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11468");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("}!\200\200}!\200\200}!\200\200}!\200\200\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215}!\200\200}!\200\200}!\200\200}!\200\200\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215!", "nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!nullnullnull!!nullnull!!nullnull!!nullnullnull!!nullnull!!nullnull!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}!\200\200}!\200\200}!\200\200}!\200\200\230\u026a\215\215\230\u026a\215\215\230\u026a\215\215\230\u026a\215\215\230\u026a\215\215\230\u026a\215\215\230\u026a\215\215\230\u026a\215\215\230\u026a\215\215\230\u026a\215\215\230\u026a\215\215\230\u026a\215\215\230\u026a\215\215\230\u026a\215\215\230\u026a\215\215\230\u026a\215\215}!\200\200}!\200\200}!\200\200}!\200\200\230\u026a\215\215\230\u026a\215\215\230\u026a\215\215\230\u026a\215\215\230\u026a\215\215\230\u026a\215\215\230\u026a\215\215\230\u026a\215\215!" + "'", str2, "}!\200\200}!\200\200}!\200\200}!\200\200\230\u026a\215\215\230\u026a\215\215\230\u026a\215\215\230\u026a\215\215\230\u026a\215\215\230\u026a\215\215\230\u026a\215\215\230\u026a\215\215\230\u026a\215\215\230\u026a\215\215\230\u026a\215\215\230\u026a\215\215\230\u026a\215\215\230\u026a\215\215\230\u026a\215\215\230\u026a\215\215}!\200\200}!\200\200}!\200\200}!\200\200\230\u026a\215\215\230\u026a\215\215\230\u026a\215\215\230\u026a\215\215\230\u026a\215\215\230\u026a\215\215\230\u026a\215\215\230\u026a\215\215!");
    }

    @Test
    public void test11469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11469");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\205\205\205\205\205\205\205\205\200\200\205\205\205\205\205\205\205\205\200\200\205\205\205\205\205\205\205\205\200\200\205\205\205\205\205\205\205\205\200\200\205\205\205\205\205\205\205\205\200\200\205\205\205\205\205\205\205\205\200\200\205\205\205\205\205\205\205\205\200\200\205\205\205\205\205\205\205\205\200\200!", "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\205\205\205\205\205\205\205\205\200\200\205\205\205\205\205\205\205\205\200\200\205\205\205\205\205\205\205\205\200\200\205\205\205\205\205\205\205\205\200\200\205\205\205\205\205\205\205\205\200\200\205\205\205\205\205\205\205\205\200\200\205\205\205\205\205\205\205\205\200\200\205\205\205\205\205\205\205\205\200\200!" + "'", str2, "\205\205\205\205\205\205\205\205\200\200\205\205\205\205\205\205\205\205\200\200\205\205\205\205\205\205\205\205\200\200\205\205\205\205\205\205\205\205\200\200\205\205\205\205\205\205\205\205\200\200\205\205\205\205\205\205\205\205\200\200\205\205\205\205\205\205\205\205\200\200\205\205\205\205\205\205\205\205\200\200!");
    }

    @Test
    public void test11470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11470");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!", "!}!!!}!!!!!}!!!}!!!!!}!!!}!!!}!!!}!!!!!}!!!}!!!!!}!!!}!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!" + "'", str2, "!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!");
    }

    @Test
    public void test11471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11471");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d!", "XXXXXXXX!!XXXXXXXX!!XXXXXXXXXXXXXXXX!!XXXXXXXX!!XXXXXXXX!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test11472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11472");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!!", "!T!!!T!!!!!T!!!T!!!!!T!!!T!!!T!!!T!!!!!T!!!T!!!!!T!!!T!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!!" + "'", str2, "\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!!");
    }

    @Test
    public void test11473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11473");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!!", "HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!HHFFHHFF!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!!" + "'", str2, "\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!!");
    }

    @Test
    public void test11474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11474");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!!", "\200]uuunullnullnull\220\220\200]uuunullnullnull\220\220\200]uuunullnullnull\220\220\200]uuunullnullnull\220\220\200]uuunullnullnull\220\220\200]uuunullnullnull\220\220\200]uuunullnullnull\220\220\200]uuunullnullnull\220\220!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\324null\326\326\324null\326\326\324\324\324null\326\326\324null\326\326\324\324!!\324null\326\326\324null\326\326\324\324\324null\326\326\324null\326\326\324\324!!\324null\326\326\324null\326\326\324\324\324null\326\326\324null\326\326\324\324!!\324null\326\326\324null\326\326\324\324\324null\326\326\324null\326\326\324\324!!\324null\326\326\324null\326\326\324\324\324null\326\326\324null\326\326\324\324!!\324null\326\326\324null\326\326\324\324\324null\326\326\324null\326\326\324\324!!\324null\326\326\324null\326\326\324\324\324null\326\326\324null\326\326\324\324!!\324null\326\326\324null\326\326\324\324\324null\326\326\324null\326\326\324\324!!!" + "'", str2, "\324null\326\326\324null\326\326\324\324\324null\326\326\324null\326\326\324\324!!\324null\326\326\324null\326\326\324\324\324null\326\326\324null\326\326\324\324!!\324null\326\326\324null\326\326\324\324\324null\326\326\324null\326\326\324\324!!\324null\326\326\324null\326\326\324\324\324null\326\326\324null\326\326\324\324!!\324null\326\326\324null\326\326\324\324\324null\326\326\324null\326\326\324\324!!\324null\326\326\324null\326\326\324\324\324null\326\326\324null\326\326\324\324!!\324null\326\326\324null\326\326\324\324\324null\326\326\324null\326\326\324\324!!\324null\326\326\324null\326\326\324\324\324null\326\326\324null\326\326\324\324!!!");
    }

    @Test
    public void test11475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11475");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!\200\200\u0346\u0348\u0348!", "!LLUULLUULLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368lnulluulnulluulnulluulnulluulnulluulnulluulnulluulnulluu!!lnulluulnulluulnulluulnulluulnulluulnulluulnulluulnulluu!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368lnulluulnulluulnulluulnulluulnulluulnulluulnulluulnulluu!!lnulluulnulluulnulluulnulluulnulluulnulluulnulluulnulluu!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test11476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11476");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275NNN\275NNN!", "nullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275UUU\275UUU!" + "'", str2, "\275UUU\275UUU!");
    }

    @Test
    public void test11477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11477");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!fehhfehh!!!", "\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test11478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11478");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!", "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368^^``^^``^^!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "\253\254\256\256nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test11479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11479");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("]null!!]null!!]null!!]null!!nullnullnull]null!!]null!!]null!!]null!!nullnullnull]null!!]null!!]null!!]null!!nullnullnull]null!!]null!!]null!!]null!!nullnullnull]null!!]null!!]null!!]null!!nullnullnull]null!!]null!!]null!!]null!!nullnullnull]null!!]null!!]null!!]null!!nullnullnull]null!!]null!!]null!!]null!!nullnullnull!", "\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!");
    }

    @Test
    public void test11480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11480");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\215}\215\215\215}\215\215\u014e\u014e\u014e\u014e!!!\215}\215\215\215}\215\215!", "\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198\u0198!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215!!!!!!!!!!!!!!!!\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215!!!!!!!!!!!!!!!!\215}\215\215\215}\215\215!");
    }

    @Test
    public void test11481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11481");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\200\200\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\200\200\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\200\200\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\200\200\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\200\200\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\200\200\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\200\200\u0108\u0106\u0108\u0108\u0108\u0106\u0108\u0108\200\200!", "xnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnullxnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200!" + "'", str2, "nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200!");
    }

    @Test
    public void test11482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11482");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!", "\u0346\u0348\u0348\u0348\226\225\226\226\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test11483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11483");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!!!", "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~\351\352\354\354\351\352\354\354!~\351\352\354\354\351\352\354\354!~\351\352\354\354\351\352\354\354!~\351\352\354\354\351\352\354\354!~\351\352\354\354\351\352\354\354!~\351\352\354\354\351\352\354\354!~\351\352\354\354\351\352\354\354!~\351\352\354\354\351\352\354\354!!!~\351\352\354\354\351\352\354\354!~\351\352\354\354\351\352\354\354!~\351\352\354\354\351\352\354\354!~\351\352\354\354\351\352\354\354!~\351\352\354\354\351\352\354\354!~\351\352\354\354\351\352\354\354!~\351\352\354\354\351\352\354\354!~\351\352\354\354\351\352\354\354!!!" + "'", str2, "!~\351\352\354\354\351\352\354\354!~\351\352\354\354\351\352\354\354!~\351\352\354\354\351\352\354\354!~\351\352\354\354\351\352\354\354!~\351\352\354\354\351\352\354\354!~\351\352\354\354\351\352\354\354!~\351\352\354\354\351\352\354\354!~\351\352\354\354\351\352\354\354!!!~\351\352\354\354\351\352\354\354!~\351\352\354\354\351\352\354\354!~\351\352\354\354\351\352\354\354!~\351\352\354\354\351\352\354\354!~\351\352\354\354\351\352\354\354!~\351\352\354\354\351\352\354\354!~\351\352\354\354\351\352\354\354!~\351\352\354\354\351\352\354\354!!!");
    }

    @Test
    public void test11484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11484");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("EEEEEEEEEEEEEEEE!EEE!EEE!EEE!EEEEEEEEEEEEEEEEEEE!EEE!EEE!", "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!null!!!null!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnull!nullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnull!nullnullnull!");
    }

    @Test
    public void test11485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11485");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!", "^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL^LLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!" + "'", str2, "!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!L^LL!!!");
    }

    @Test
    public void test11486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11486");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("fehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehh!", "rrrr\236\276\276rrrr\236\276\276!!rrrr\236\276\276rrrr\236\276\276!!rrrr\236\276\276rrrr\236\276\276rrrr\236\276\276rrrr\236\276\276!!rrrr\236\276\276rrrr\236\276\276!!rrrr\236\276\276rrrr\236\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR!" + "'", str2, "\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR\276\236RR!");
    }

    @Test
    public void test11487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11487");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!" + "'", str2, "]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!!");
    }

    @Test
    public void test11488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11488");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("URRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRR\200}}`URRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRR]]!", "efhhefhhefhhefhhefhhefhhefhhefhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFF\200}}`EFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFF]]!" + "'", str2, "EFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFF\200}}`EFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFFEFFF]]!");
    }

    @Test
    public void test11489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11489");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!", "N^LLN^LLnullnullN^LLN^LLnullnullN^LLN^LLnullnullN^LLN^LLnullnullN^LLN^LLnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!" + "'", str2, "}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!}}!!!");
    }

    @Test
    public void test11490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11490");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("``nnnnnnnn``nnnnnnnn``nnnnnnnn``nnnnnnnn``nnnnnnnn``nnnnnnnn``nnnnnnnn``nnnnnnnn!", "\u0366\u0365\u0368\u0368\u0148\u0145\u0145\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull!" + "'", str2, "``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull``nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test11491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11491");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!", "]\223!!\225]\223!!]\223!!]\223!!\225]\223!!]\223!!\255\256\260\260\255\256\260\260]\223!!\225]\223!!]\223!!]\223!!\225]\223!!]\223!!\255\256\260\260\255\256\260\260]\223!!\225]\223!!]\223!!]\223!!\225]\223!!]\223!!\255\256\260\260\255\256\260\260]\223!!\225]\223!!]\223!!]\223!!\225]\223!!]\223!!\255\256\260\260\255\256\260\260]\223!!\225]\223!!]\223!!]\223!!\225]\223!!]\223!!\255\256\260\260\255\256\260\260]\223!!\225]\223!!]\223!!]\223!!\225]\223!!]\223!!\255\256\260\260\255\256\260\260]\223!!\225]\223!!]\223!!]\223!!\225]\223!!]\223!!\255\256\260\260\255\256\260\260]\223!!\225]\223!!]\223!!]\223!!\225]\223!!]\223!!\255\256\260\260\255\256\260\260!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
    }

    @Test
    public void test11492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11492");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fanullnull!", "EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEEEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEEEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEEEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEEEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEEEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEEEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEEEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEEEFHHEFHHEE!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02faHEFFHEFF!" + "'", str2, "\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02faHEFFHEFF!");
    }

    @Test
    public void test11493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11493");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("UU]]UU]]LUUULUUUUU]]UU]]LUUULUUU!", "null\266\u0346!!nullnullnull\266\u0346!!nullnull!!null\266\u0346!!nullnullnull\266\u0346!!nullnull!!null\266\u0346!!nullnullnull\266\u0346!!nullnull!!null\266\u0346!!nullnullnull\266\u0346!!nullnull!!null\266\u0346!!nullnullnull\266\u0346!!nullnull!!null\266\u0346!!nullnullnull\266\u0346!!nullnull!!null\266\u0346!!nullnullnull\266\u0346!!nullnull!!null\266\u0346!!nullnullnull\266\u0346!!nullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014c\u014c\u014c\u014c\u014e\u014c\u014c\u014c\u014e\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014e\u014c\u014c\u014c\u014e\u014c\u014c\u014c!" + "'", str2, "\u014c\u014c\u014c\u014c\u014e\u014c\u014c\u014c\u014e\u014c\u014c\u014c\u014c\u014c\u014c\u014c\u014e\u014c\u014c\u014c\u014e\u014c\u014c\u014c!");
    }

    @Test
    public void test11494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11494");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!~NN!~NN\220\220!~NN!~NN\220\220\220!~NN\220\220\220!~NN\220\220\220!~NN\220\220\220!~NN\220\220!~NN!~NN\220\220!~NN!~NN\220\220!", "NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```NL!!!\275\275!!!```!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01d4\u01d4\u01d4\u01d4\220\220\u01d4\u01d4\u01d4\u01d4\220\220\220\u01d4\u01d4\220\220\220\u01d4\u01d4\220\220\220\u01d4\u01d4\220\220\220\u01d4\u01d4\220\220\u01d4\u01d4\u01d4\u01d4\220\220\u01d4\u01d4\u01d4\u01d4\220\220!" + "'", str2, "\u01d4\u01d4\u01d4\u01d4\220\220\u01d4\u01d4\u01d4\u01d4\220\220\220\u01d4\u01d4\220\220\220\u01d4\u01d4\220\220\220\u01d4\u01d4\220\220\220\u01d4\u01d4\220\220\u01d4\u01d4\u01d4\u01d4\220\220\u01d4\u01d4\u01d4\u01d4\220\220!");
    }

    @Test
    public void test11495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11495");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336\336!", "\253\254\256\256nullnullnullnull\253\254\256\256nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test11496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11496");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!", "}!\200\200}!\200\200}!\200\200}!\200\200\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215}!\200\200}!\200\200}!\200\200}!\200\200\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!" + "'", str2, "\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!!\236\237\241\241~\236\237\241\241\236\237\241\241\236\237\241\241~\236\237\241\241\236\237\241\241!");
    }

    @Test
    public void test11497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11497");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275!nullnullnull!nullnullnull!nullnullnull\275!nullnullnull!nullnullnull!nullnullnull\275!nullnullnull!nullnullnull!nullnullnull\275!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull\275\275!nullnullnull!nullnullnull\275\275!nullnullnull!nullnullnull\275\275!nullnullnull!nullnullnull\275\275\275!nullnullnull!nullnullnull!nullnullnull\275!nullnullnull!nullnullnull!nullnullnull\275!nullnullnull!nullnullnull!nullnullnull\275!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull\275\275!nullnullnull!nullnullnull\275\275!", "LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUUnullnullnullnullLNUULNUULNUULNUULNUULNUUnullnullnullnullLNUULNUULNUULNUULNUULNUUnullnullnullnullLNUULNUULNUULNUULNUULNUUnullnullnullnullLNUULNUULNUULNUULNUULNUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!NLUUNLUUNLUU!NLUUNLUUNLUU!NLUUNLUUNLUU\275!NLUUNLUUNLUU!NLUUNLUUNLUU!NLUUNLUUNLUU\275!NLUUNLUUNLUU!NLUUNLUUNLUU!NLUUNLUUNLUU\275!NLUUNLUUNLUU!NLUUNLUUNLUU!NLUUNLUUNLUU!NLUUNLUUNLUU!NLUUNLUUNLUU\275\275!NLUUNLUUNLUU!NLUUNLUUNLUU\275\275!NLUUNLUUNLUU!NLUUNLUUNLUU\275\275!NLUUNLUUNLUU!NLUUNLUUNLUU\275\275\275!NLUUNLUUNLUU!NLUUNLUUNLUU!NLUUNLUUNLUU\275!NLUUNLUUNLUU!NLUUNLUUNLUU!NLUUNLUUNLUU\275!NLUUNLUUNLUU!NLUUNLUUNLUU!NLUUNLUUNLUU\275!NLUUNLUUNLUU!NLUUNLUUNLUU!NLUUNLUUNLUU!NLUUNLUUNLUU!NLUUNLUUNLUU\275\275!NLUUNLUUNLUU!NLUUNLUUNLUU\275\275!" + "'", str2, "\275!NLUUNLUUNLUU!NLUUNLUUNLUU!NLUUNLUUNLUU\275!NLUUNLUUNLUU!NLUUNLUUNLUU!NLUUNLUUNLUU\275!NLUUNLUUNLUU!NLUUNLUUNLUU!NLUUNLUUNLUU\275!NLUUNLUUNLUU!NLUUNLUUNLUU!NLUUNLUUNLUU!NLUUNLUUNLUU!NLUUNLUUNLUU\275\275!NLUUNLUUNLUU!NLUUNLUUNLUU\275\275!NLUUNLUUNLUU!NLUUNLUUNLUU\275\275!NLUUNLUUNLUU!NLUUNLUUNLUU\275\275\275!NLUUNLUUNLUU!NLUUNLUUNLUU!NLUUNLUUNLUU\275!NLUUNLUUNLUU!NLUUNLUUNLUU!NLUUNLUUNLUU\275!NLUUNLUUNLUU!NLUUNLUUNLUU!NLUUNLUUNLUU\275!NLUUNLUUNLUU!NLUUNLUUNLUU!NLUUNLUUNLUU!NLUUNLUUNLUU!NLUUNLUUNLUU\275\275!NLUUNLUUNLUU!NLUUNLUUNLUU\275\275!");
    }

    @Test
    public void test11498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11498");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca\u01ca!", "\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test11499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11499");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0276\u0276\u0276\u0276\u0346\u0348\u0348!", "]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201]]!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!!\201\201!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test11500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11500");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!", "LUUULUUU!!``LUUULUUU``LUUULUUU``LUUULUUULUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!``LUUULUUU``LUUULUUU``LUUULUUULUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!" + "'", str2, "`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!");
    }
}
