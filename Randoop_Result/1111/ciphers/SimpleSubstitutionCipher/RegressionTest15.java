package ciphers.SimpleSubstitutionCipher;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15 {

    public static boolean debug = false;

    @Test
    public void test07501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07501");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!!", "UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!UU~LLUUUU~LLUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test07502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07502");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108\u0128\u0126\u0108\u0108!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07503");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```!", "\275\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\u014c\u014b\u014e\u014e\276\u014c\u014b\u014e\u014e\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```!" + "'", str2, "nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```nullnullnullnull```!");
    }

    @Test
    public void test07504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07504");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!~!!!~!!!!!~!!!~!!!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!", "``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!!``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!!``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!!``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!!``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~!!!~!!!!!~!!!~!!!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!" + "'", str2, "!~!!!~!!!!!~!!!~!!!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!");
    }

    @Test
    public void test07505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07505");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("u`uu`UUU!", "\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null`nullnull`nullnullnull!" + "'", str2, "null`nullnull`nullnullnull!");
    }

    @Test
    public void test07506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07506");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275HHHHHHHHHHHH\275HHHHHHHHHHHH\275HHHHHHHHHHHH\275HHHHHHHHHHHHHHHHHHHH\275\275HHHHHHHH\275\275HHHHHHHH\275\275HHHHHHHH\275\275\275HHHHHHHHHHHH\275HHHHHHHHHHHH\275HHHHHHHHHHHH\275HHHHHHHHHHHHHHHHHHHH\275\275HHHHHHHH\275\275!", "\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!!!!!!!!!!!!\275!!!!!!!!!!!!\275!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!!!!\275\275!!!!!!!!\275\275!!!!!!!!\275\275!!!!!!!!\275\275\275!!!!!!!!!!!!\275!!!!!!!!!!!!\275!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!!!!\275\275!!!!!!!!\275\275!" + "'", str2, "\275!!!!!!!!!!!!\275!!!!!!!!!!!!\275!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!!!!\275\275!!!!!!!!\275\275!!!!!!!!\275\275!!!!!!!!\275\275\275!!!!!!!!!!!!\275!!!!!!!!!!!!\275!!!!!!!!!!!!\275!!!!!!!!!!!!!!!!!!!!\275\275!!!!!!!!\275\275!");
    }

    @Test
    public void test07507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07507");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!", "LULLLULL!!LULLLULL!!LULLLULL!!LULLLULL!!LULLLULL!!LULLLULL!!LULLLULL!!LULLLULL!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\254\256\256!null\254\256\256null\254\256\256null\254\256\256!null\254\256\256null\254\256\256\u0368\u0368null\254\256\256!null\254\256\256null\254\256\256null\254\256\256!null\254\256\256null\254\256\256\u0368\u0368null\254\256\256!null\254\256\256null\254\256\256null\254\256\256!null\254\256\256null\254\256\256\u0368\u0368null\254\256\256!null\254\256\256null\254\256\256null\254\256\256!null\254\256\256null\254\256\256\u0368\u0368null\254\256\256!null\254\256\256null\254\256\256null\254\256\256!null\254\256\256null\254\256\256\u0368\u0368null\254\256\256!null\254\256\256null\254\256\256null\254\256\256!null\254\256\256null\254\256\256\u0368\u0368null\254\256\256!null\254\256\256null\254\256\256null\254\256\256!null\254\256\256null\254\256\256\u0368\u0368null\254\256\256!null\254\256\256null\254\256\256null\254\256\256!null\254\256\256null\254\256\256\u0368\u0368!" + "'", str2, "null\254\256\256!null\254\256\256null\254\256\256null\254\256\256!null\254\256\256null\254\256\256\u0368\u0368null\254\256\256!null\254\256\256null\254\256\256null\254\256\256!null\254\256\256null\254\256\256\u0368\u0368null\254\256\256!null\254\256\256null\254\256\256null\254\256\256!null\254\256\256null\254\256\256\u0368\u0368null\254\256\256!null\254\256\256null\254\256\256null\254\256\256!null\254\256\256null\254\256\256\u0368\u0368null\254\256\256!null\254\256\256null\254\256\256null\254\256\256!null\254\256\256null\254\256\256\u0368\u0368null\254\256\256!null\254\256\256null\254\256\256null\254\256\256!null\254\256\256null\254\256\256\u0368\u0368null\254\256\256!null\254\256\256null\254\256\256null\254\256\256!null\254\256\256null\254\256\256\u0368\u0368null\254\256\256!null\254\256\256null\254\256\256null\254\256\256!null\254\256\256null\254\256\256\u0368\u0368!");
    }

    @Test
    public void test07508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07508");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "\u0366\u0365\u0368\u0368LL!!LL!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07509");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``!", "\275!UUU!UUU!UUU\276!UUU\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``!" + "'", str2, "Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``Rnull```Rnull``Rnull``!");
    }

    @Test
    public void test07510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07510");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!", "\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
    }

    @Test
    public void test07511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07511");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("PP!!PP!!!!PP!!PP!!!!PP!!PP!!!!PP!!PP!!!!PP!!PP!!!!PP!!PP!!!!PP!!PP!!!!PP!!PP!!!!!", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!" + "'", str2, "nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!");
    }

    @Test
    public void test07512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07512");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220!!!", "\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!" + "'", str2, "null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!");
    }

    @Test
    public void test07513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07513");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d!", "\276\276!!\276\276!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07514");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("]!``]!``!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!``]!``!" + "'", str2, "]!``]!``!");
    }

    @Test
    public void test07515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07515");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108```!", "\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```!" + "'", str2, "nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```nullnull!!nullnullnull```!");
    }

    @Test
    public void test07516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07516");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!!", "LUUULUUULUUULUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUULUUULUUULUUULUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uuuuUUUUUUUUUUUU\256\254\254uuuuUUUUUUUUUUUU\256\254\254!!uuuuUUUUUUUUUUUU\256\254\254uuuuUUUUUUUUUUUU\256\254\254!!uuuuUUUUUUUUUUUU\256\254\254uuuuUUUUUUUUUUUU\256\254\254!!uuuuUUUUUUUUUUUU\256\254\254uuuuUUUUUUUUUUUU\256\254\254!!uuuuUUUUUUUUUUUU\256\254\254uuuuUUUUUUUUUUUU\256\254\254!!uuuuUUUUUUUUUUUU\256\254\254uuuuUUUUUUUUUUUU\256\254\254!!uuuuUUUUUUUUUUUU\256\254\254uuuuUUUUUUUUUUUU\256\254\254!!uuuuUUUUUUUUUUUU\256\254\254uuuuUUUUUUUUUUUU\256\254\254!!!" + "'", str2, "uuuuUUUUUUUUUUUU\256\254\254uuuuUUUUUUUUUUUU\256\254\254!!uuuuUUUUUUUUUUUU\256\254\254uuuuUUUUUUUUUUUU\256\254\254!!uuuuUUUUUUUUUUUU\256\254\254uuuuUUUUUUUUUUUU\256\254\254!!uuuuUUUUUUUUUUUU\256\254\254uuuuUUUUUUUUUUUU\256\254\254!!uuuuUUUUUUUUUUUU\256\254\254uuuuUUUUUUUUUUUU\256\254\254!!uuuuUUUUUUUUUUUU\256\254\254uuuuUUUUUUUUUUUU\256\254\254!!uuuuUUUUUUUUUUUU\256\254\254uuuuUUUUUUUUUUUU\256\254\254!!uuuuUUUUUUUUUUUU\256\254\254uuuuUUUUUUUUUUUU\256\254\254!!!");
    }

    @Test
    public void test07517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07517");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143\u0146\u0144\u0143\u0143!!!", "nullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHHnullnullnullnullnullnullnullnullFHHHFHHH!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ULLLULLL!!ULLLULLL!!ULLLULLL!!ULLLULLL!!ULLLULLL!!ULLLULLL!!ULLLULLL!!ULLLULLL!!!" + "'", str2, "ULLLULLL!!ULLLULLL!!ULLLULLL!!ULLLULLL!!ULLLULLL!!ULLLULLL!!ULLLULLL!!ULLLULLL!!!");
    }

    @Test
    public void test07518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07518");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\253\254\256\256````````````````\253\254\256\256````````!", "LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256````````````````\253\254\256\256````````!" + "'", str2, "\253\254\256\256````````````````\253\254\256\256````````!");
    }

    @Test
    public void test07519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07519");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN!", "]f!!]f!!!!]f!!]f!!!!]f!!]f!!]f!!]f!!!!]f!!]f!!!!]f!!]f!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull!" + "'", str2, "^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07520");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("L!!!L!!!L!!!L!!!\200}}`L!!!L!!!L!!!L!!!]]!", "nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L!!!L!!!L!!!L!!!\200}}`L!!!L!!!L!!!L!!!]]!" + "'", str2, "L!!!L!!!L!!!L!!!\200}}`L!!!L!!!L!!!L!!!]]!");
    }

    @Test
    public void test07521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07521");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u011d\u011d\u011a\u011a\u011d\u011d\u011a\u011a\u011d\u011d\u011a\u011a\u011d\u011d\u011a\u011a\u011d\u011d\u011a\u011a\u011d\u011d\u011a\u011a\u011d\u011d\u011a\u011a\u011d\u011d\u011a\u011a!", "rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225rqttrqttnullnullrqttrqttnullnull\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RRUURRUURRUURRUURRUURRUURRUURRUU!" + "'", str2, "RRUURRUURRUURRUURRUURRUURRUURRUU!");
    }

    @Test
    public void test07522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07522");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248!", "\275``uuuuuuuu``uuuuuuuu``uuuuuuuu\276``uuuuuuuu\275\275!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07523");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275!" + "'", str2, "\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275\275\200!!\275\275!!\275\275!");
    }

    @Test
    public void test07524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07524");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220!", "\215\220\220\220\216\220\215\215!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\220\220\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\220\220\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\220\220\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\220\220\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\220\220\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\220\220\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\220\220\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\220\220!" + "'", str2, "\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\220\220\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\220\220\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\220\220\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\220\220\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\220\220\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\220\220\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\220\220\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\220\220!");
    }

    @Test
    public void test07525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07525");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230~}\200\200~}\200\200NLLLNLLL\230\230NLLLNLLL\230\230!", "\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200\214UUU\214UUU\230\230\214UUU\214UUU\230\230~}\200\200~}\200\200\214UUU\214UUU\230\230\214UUU\214UUU\230\230~}\200\200~}\200\200\214UUU\214UUU\230\230\214UUU\214UUU\230\230~}\200\200~}\200\200\214UUU\214UUU\230\230\214UUU\214UUU\230\230~}\200\200~}\200\200\214UUU\214UUU\230\230\214UUU\214UUU\230\230~}\200\200~}\200\200\214UUU\214UUU\230\230\214UUU\214UUU\230\230~}\200\200~}\200\200\214UUU\214UUU\230\230\214UUU\214UUU\230\230~}\200\200~}\200\200\214UUU\214UUU\230\230\214UUU\214UUU\230\230!" + "'", str2, "~}\200\200~}\200\200\214UUU\214UUU\230\230\214UUU\214UUU\230\230~}\200\200~}\200\200\214UUU\214UUU\230\230\214UUU\214UUU\230\230~}\200\200~}\200\200\214UUU\214UUU\230\230\214UUU\214UUU\230\230~}\200\200~}\200\200\214UUU\214UUU\230\230\214UUU\214UUU\230\230~}\200\200~}\200\200\214UUU\214UUU\230\230\214UUU\214UUU\230\230~}\200\200~}\200\200\214UUU\214UUU\230\230\214UUU\214UUU\230\230~}\200\200~}\200\200\214UUU\214UUU\230\230\214UUU\214UUU\230\230~}\200\200~}\200\200\214UUU\214UUU\230\230\214UUU\214UUU\230\230!");
    }

    @Test
    public void test07526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07526");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!", "\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!" + "'", str2, "!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!");
    }

    @Test
    public void test07527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07527");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214!", "nullnullnullnullnullnullnullnull!!nullnull]]nullnull]]nullnull]]nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnull]]nullnull]]nullnull]]nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UULLUULLUULLUULLUULLUULLUULLUULL\214\214UULLUULLUULLUULLUULLUULLUULLUULL\214\214UULLUULLUULLUULLUULLUULLUULLUULL\214\214UULLUULLUULLUULLUULLUULLUULLUULL\214\214UULLUULLUULLUULLUULLUULLUULLUULL\214\214UULLUULLUULLUULLUULLUULLUULLUULL\214\214UULLUULLUULLUULLUULLUULLUULLUULL\214\214UULLUULLUULLUULLUULLUULLUULLUULL\214\214!" + "'", str2, "UULLUULLUULLUULLUULLUULLUULLUULL\214\214UULLUULLUULLUULLUULLUULLUULLUULL\214\214UULLUULLUULLUULLUULLUULLUULLUULL\214\214UULLUULLUULLUULLUULLUULLUULLUULL\214\214UULLUULLUULLUULLUULLUULLUULLUULL\214\214UULLUULLUULLUULLUULLUULLUULLUULL\214\214UULLUULLUULLUULLUULLUULLUULLUULL\214\214UULLUULLUULLUULLUULLUULLUULLUULL\214\214!");
    }

    @Test
    public void test07528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07528");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test07529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07529");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LNLLLNLL\253\253LNLLLNLL\253\253LNLLLNLL\253\253LNLLLNLL\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LNLLLNLL\253\253LNLLLNLL\253\253!", "`}LNNNLNNN`}LNNNLNNN`}LNNNLNNN`}LNNNLNNN`}LNNNLNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253}N}}}N}}\253\253}N}}}N}}\253\253}N}}}N}}\253\253}N}}}N}}\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253}N}}}N}}\253\253}N}}}N}}\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253}N}}}N}}\253\253}N}}}N}}\253\253}N}}}N}}\253\253}N}}}N}}\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253}N}}}N}}\253\253}N}}}N}}\253\253!");
    }

    @Test
    public void test07530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07530");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnull}~\200\200}~\200\200nullnull}~\200\200}~\200\200nullnull}~\200\200}~\200\200\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U}\200\200U}\200\200nullnullnullnullnullnullnullnullU}\200\200U}\200\200nullnullnullnullnullnullnullnullU}\200\200U}\200\200nullnullnullnullnullnullnullnullU}\200\200U}\200\200nullnullnullnullnullnullnullnullU}\200\200U}\200\200nullnullnullnullnullnullnullnullU}\200\200U}\200\200nullnullnullnullnullnullnullnullU}\200\200U}\200\200nullnullnullnullnullnullnullnullU}\200\200U}\200\200nullnullnullnullnullnullnullnull!" + "'", str2, "U}\200\200U}\200\200nullnullnullnullnullnullnullnullU}\200\200U}\200\200nullnullnullnullnullnullnullnullU}\200\200U}\200\200nullnullnullnullnullnullnullnullU}\200\200U}\200\200nullnullnullnullnullnullnullnullU}\200\200U}\200\200nullnullnullnullnullnullnullnullU}\200\200U}\200\200nullnullnullnullnullnullnullnullU}\200\200U}\200\200nullnullnullnullnullnullnullnullU}\200\200U}\200\200nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07531");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u029d\u02a0\u02a0\u02a0\u02a0\u02a0!", "!\253\256\256\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07532");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "XXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxxXXxx!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07533");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0176\u0175\u0178\u0178\u0176\u0175\u0178\u0178\u0176\u0175\u0178\u0178\u0176\u0175\u0178\u0178!!!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test07534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07534");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254\u0264\u0262\u0262\256\254\254!!!", "llllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLLllllllllllllllllLLLLLLLLLLLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0140\u0140nullnullnull\256\254\254\u0140\u0140nullnullnull\256\254\254\u0140\u0140nullnullnull\256\254\254\u0140\u0140nullnullnull\256\254\254\u0140\u0140nullnullnull\256\254\254\u0140\u0140nullnullnull\256\254\254\u0140\u0140nullnullnull\256\254\254\u0140\u0140nullnullnull\256\254\254\u0140\u0140nullnullnull\256\254\254\u0140\u0140nullnullnull\256\254\254\u0140\u0140nullnullnull\256\254\254\u0140\u0140nullnullnull\256\254\254\u0140\u0140nullnullnull\256\254\254\u0140\u0140nullnullnull\256\254\254\u0140\u0140nullnullnull\256\254\254\u0140\u0140nullnullnull\256\254\254!!!" + "'", str2, "\u0140\u0140nullnullnull\256\254\254\u0140\u0140nullnullnull\256\254\254\u0140\u0140nullnullnull\256\254\254\u0140\u0140nullnullnull\256\254\254\u0140\u0140nullnullnull\256\254\254\u0140\u0140nullnullnull\256\254\254\u0140\u0140nullnullnull\256\254\254\u0140\u0140nullnullnull\256\254\254\u0140\u0140nullnullnull\256\254\254\u0140\u0140nullnullnull\256\254\254\u0140\u0140nullnullnull\256\254\254\u0140\u0140nullnullnull\256\254\254\u0140\u0140nullnullnull\256\254\254\u0140\u0140nullnullnull\256\254\254\u0140\u0140nullnullnull\256\254\254\u0140\u0140nullnullnull\256\254\254!!!");
    }

    @Test
    public void test07535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07535");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\255\256\260\260\236\276\276\255\256\260\260\236\276\276!!\255\256\260\260\236\276\276\255\256\260\260\236\276\276!!\255\256\260\260\236\276\276\255\256\260\260\236\276\276\255\256\260\260\236\276\276\255\256\260\260\236\276\276!!\255\256\260\260\236\276\276\255\256\260\260\236\276\276!!\255\256\260\260\236\276\276\255\256\260\260\236\276\276!", "\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\255\256\260\260\236\276\276\255\256\260\260\236\276\276!!\255\256\260\260\236\276\276\255\256\260\260\236\276\276!!\255\256\260\260\236\276\276\255\256\260\260\236\276\276\255\256\260\260\236\276\276\255\256\260\260\236\276\276!!\255\256\260\260\236\276\276\255\256\260\260\236\276\276!!\255\256\260\260\236\276\276\255\256\260\260\236\276\276!" + "'", str2, "\255\256\260\260\236\276\276\255\256\260\260\236\276\276!!\255\256\260\260\236\276\276\255\256\260\260\236\276\276!!\255\256\260\260\236\276\276\255\256\260\260\236\276\276\255\256\260\260\236\276\276\255\256\260\260\236\276\276!!\255\256\260\260\236\276\276\255\256\260\260\236\276\276!!\255\256\260\260\236\276\276\255\256\260\260\236\276\276!");
    }

    @Test
    public void test07536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07536");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7!", "NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!!NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!!NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!!NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!!NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test07537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07537");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240!", "!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07538");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aa\u03aanullnull!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!efhhnullefhhefhhefhhnullefhhefhh!!efhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhh!!efhhnullefhhefhhefhhnullefhhefhh!!efhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhh!!efhhnullefhhefhhefhhnullefhhefhh!!efhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhh!!efhhnullefhhefhhefhhnullefhhefhh!!efhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhh!!efhhnullefhhefhhefhhnullefhhefhh!!efhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhh!!efhhnullefhhefhhefhhnullefhhefhh!!efhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhh!!efhhnullefhhefhhefhhnullefhhefhh!!efhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhh!!efhhnullefhhefhhefhhnullefhhefhh!!efhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhh!" + "'", str2, "!!efhhnullefhhefhhefhhnullefhhefhh!!efhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhh!!efhhnullefhhefhhefhhnullefhhefhh!!efhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhh!!efhhnullefhhefhhefhhnullefhhefhh!!efhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhh!!efhhnullefhhefhhefhhnullefhhefhh!!efhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhh!!efhhnullefhhefhhefhhnullefhhefhh!!efhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhh!!efhhnullefhhefhhefhhnullefhhefhh!!efhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhh!!efhhnullefhhefhhefhhnullefhhefhh!!efhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhh!!efhhnullefhhefhhefhhnullefhhefhh!!efhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhhefhhnullefhhefhh!");
    }

    @Test
    public void test07539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07539");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("`}\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270`}\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270`}\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270`}\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270`}\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270\270l\270\270!", "NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL\200}}`NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`}\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270`}\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270`}\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270`}\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270`}\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270!" + "'", str2, "`}\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270`}\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270`}\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270`}\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270`}\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270\270\u0264\270\270!");
    }

    @Test
    public void test07540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07540");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8\u01c6\u01c8\u01c8!", "\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fanullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!" + "'", str2, "U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!");
    }

    @Test
    public void test07541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07541");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!!", "\253\254\256\256L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\253\254\256\256L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!!" + "'", str2, "\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!!");
    }

    @Test
    public void test07542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07542");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!LUNNLUNNLUNNLUNN\256\254\254LUNNLUNNLUNNLUNN\256\254\254!!!", "UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!UN!!UN!!!!UN!!UN!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "N!!!N!!!N!!!N!!!\256\254\254N!!!N!!!N!!!N!!!\256\254\254!!N!!!N!!!N!!!N!!!\256\254\254N!!!N!!!N!!!N!!!\256\254\254!!N!!!N!!!N!!!N!!!\256\254\254N!!!N!!!N!!!N!!!\256\254\254!!N!!!N!!!N!!!N!!!\256\254\254N!!!N!!!N!!!N!!!\256\254\254!!N!!!N!!!N!!!N!!!\256\254\254N!!!N!!!N!!!N!!!\256\254\254!!N!!!N!!!N!!!N!!!\256\254\254N!!!N!!!N!!!N!!!\256\254\254!!N!!!N!!!N!!!N!!!\256\254\254N!!!N!!!N!!!N!!!\256\254\254!!N!!!N!!!N!!!N!!!\256\254\254N!!!N!!!N!!!N!!!\256\254\254!!!" + "'", str2, "N!!!N!!!N!!!N!!!\256\254\254N!!!N!!!N!!!N!!!\256\254\254!!N!!!N!!!N!!!N!!!\256\254\254N!!!N!!!N!!!N!!!\256\254\254!!N!!!N!!!N!!!N!!!\256\254\254N!!!N!!!N!!!N!!!\256\254\254!!N!!!N!!!N!!!N!!!\256\254\254N!!!N!!!N!!!N!!!\256\254\254!!N!!!N!!!N!!!N!!!\256\254\254N!!!N!!!N!!!N!!!\256\254\254!!N!!!N!!!N!!!N!!!\256\254\254N!!!N!!!N!!!N!!!\256\254\254!!N!!!N!!!N!!!N!!!\256\254\254N!!!N!!!N!!!N!!!\256\254\254!!N!!!N!!!N!!!N!!!\256\254\254N!!!N!!!N!!!N!!!\256\254\254!!!");
    }

    @Test
    public void test07543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07543");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\226L\230\230\226L\230\230\226L\230\230\226L\230\230\226L\230\230!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\226F\230\230\226F\230\230\226F\230\230\226F\230\230\226F\230\230!" + "'", str2, "\226F\230\230\226F\230\230\226F\230\230\226F\230\230\226F\230\230!");
    }

    @Test
    public void test07544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07544");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("UUNNNNUU!", "UUUU!]UU!]UU!]UU!]UUUUUU!]UU!]UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``nullnullnullnull``!" + "'", str2, "``nullnullnullnull``!");
    }

    @Test
    public void test07545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07545");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355\u010d\360\360\360\360null\355\355\360null\355\355!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07546");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````!", "``!!``!!^```^`````!!``!!^```^`````!!``!!^```^`````!!``!!^```^`````!!``!!^```^`````!!``!!^```^`````!!``!!^```^`````!!``!!^```^```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````!" + "'", str2, "\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````!");
    }

    @Test
    public void test07547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07547");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!", "u!ll!!!u!ll!!!u!ll!!!u!ll!!!u!ll!!!u!ll!!!u!ll!!!u!ll!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!" + "'", str2, "]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!");
    }

    @Test
    public void test07548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07548");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0317\u031a\u0317\u031a\u0317\u031a\u0317\u031anullnull!", "UU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUU!!UU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUU!!UU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUU!!UU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUU!!UU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUUUU`UUU`UUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0317\u031a\u0317\u031a\u0317\u031a\u0317\u031aU`UUU`UU!" + "'", str2, "\u0317\u031a\u0317\u031a\u0317\u031a\u0317\u031aU`UUU`UU!");
    }

    @Test
    public void test07549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07549");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214!", "\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214!" + "'", str2, "\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214!");
    }

    @Test
    public void test07550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07550");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!!", "nullnull!!``nullnull``nullnull``nullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!``nullnull``nullnull``nullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ULLLULLL!!\256\254\254ULLLULLL!!\256\254\254!!ULLLULLL!!\256\254\254ULLLULLL!!\256\254\254!!ULLLULLL!!\256\254\254ULLLULLL!!\256\254\254!!ULLLULLL!!\256\254\254ULLLULLL!!\256\254\254!!ULLLULLL!!\256\254\254ULLLULLL!!\256\254\254!!ULLLULLL!!\256\254\254ULLLULLL!!\256\254\254!!ULLLULLL!!\256\254\254ULLLULLL!!\256\254\254!!ULLLULLL!!\256\254\254ULLLULLL!!\256\254\254!!!" + "'", str2, "ULLLULLL!!\256\254\254ULLLULLL!!\256\254\254!!ULLLULLL!!\256\254\254ULLLULLL!!\256\254\254!!ULLLULLL!!\256\254\254ULLLULLL!!\256\254\254!!ULLLULLL!!\256\254\254ULLLULLL!!\256\254\254!!ULLLULLL!!\256\254\254ULLLULLL!!\256\254\254!!ULLLULLL!!\256\254\254ULLLULLL!!\256\254\254!!ULLLULLL!!\256\254\254ULLLULLL!!\256\254\254!!ULLLULLL!!\256\254\254ULLLULLL!!\256\254\254!!!");
    }

    @Test
    public void test07551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07551");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("~}\200\200~}\200\200LNNNnullnullnullLNNNnullnullnull\230\230LNNNnullnullnullLNNNnullnullnull\230\230~}\200\200~}\200\200LNNNnullnullnullLNNNnullnullnull\230\230LNNNnullnullnullLNNNnullnullnull\230\230~}\200\200~}\200\200LNNNnullnullnullLNNNnullnullnull\230\230LNNNnullnullnullLNNNnullnullnull\230\230~}\200\200~}\200\200LNNNnullnullnullLNNNnullnullnull\230\230LNNNnullnullnullLNNNnullnullnull\230\230~}\200\200~}\200\200LNNNnullnullnullLNNNnullnullnull\230\230LNNNnullnullnullLNNNnullnullnull\230\230~}\200\200~}\200\200LNNNnullnullnullLNNNnullnullnull\230\230LNNNnullnullnullLNNNnullnullnull\230\230~}\200\200~}\200\200LNNNnullnullnullLNNNnullnullnull\230\230LNNNnullnullnullLNNNnullnullnull\230\230~}\200\200~}\200\200LNNNnullnullnullLNNNnullnullnull\230\230LNNNnullnullnullLNNNnullnullnull\230\230!", "nullnullnullnullnullnullnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnullbnullnullnullbnullnull\225\225nullnullnullnullnullnullnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnullbnullnullnullbnullnull\225\225nullnullnullnullnullnullnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnullbnullnullnullbnullnull\225\225nullnullnullnullnullnullnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnullbnullnullnullbnullnull\225\225nullnullnullnullnullnullnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnullbnullnullnullbnullnull\225\225nullnullnullnullnullnullnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnullbnullnullnullbnullnull\225\225nullnullnullnullnullnullnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnullbnullnullnullbnullnull\225\225nullnullnullnullnullnullnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnullbnullnullnullbnullnull\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230~}\200\200~}\200\200LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230~}\200\200~}\200\200LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230~}\200\200~}\200\200LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230~}\200\200~}\200\200LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230~}\200\200~}\200\200LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230~}\200\200~}\200\200LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230~}\200\200~}\200\200LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230!" + "'", str2, "~}\200\200~}\200\200LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230~}\200\200~}\200\200LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230~}\200\200~}\200\200LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230~}\200\200~}\200\200LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230~}\200\200~}\200\200LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230~}\200\200~}\200\200LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230~}\200\200~}\200\200LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230~}\200\200~}\200\200LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230LUUUNLLLNLLLNLLLLUUUNLLLNLLLNLLL\230\230!");
    }

    @Test
    public void test07552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07552");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275nullnullnullnullnullnullnullnullnullnullnullnull\276nullnullnullnull\275\275!", "\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0nullnull!!!```!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\u03d7\u03d8\u03da\u03da\u03d7\u03d8\u03da\u03da\u03d7\u03d8\u03da\u03da\u03d7\u03d8\u03da\u03da\u03d7\u03d8\u03da\u03da\u03d7\u03d8\u03da\u03da\u03d7\u03d8\u03da\u03da\u03d7\u03d8\u03da\u03da\u03d7\u03d8\u03da\u03da\u03d7\u03d8\u03da\u03da\u03d7\u03d8\u03da\u03da\u03d7\u03d8\u03da\u03da\276\u03d7\u03d8\u03da\u03da\u03d7\u03d8\u03da\u03da\u03d7\u03d8\u03da\u03da\u03d7\u03d8\u03da\u03da\275\275!" + "'", str2, "\275\u03d7\u03d8\u03da\u03da\u03d7\u03d8\u03da\u03da\u03d7\u03d8\u03da\u03da\u03d7\u03d8\u03da\u03da\u03d7\u03d8\u03da\u03da\u03d7\u03d8\u03da\u03da\u03d7\u03d8\u03da\u03da\u03d7\u03d8\u03da\u03da\u03d7\u03d8\u03da\u03da\u03d7\u03d8\u03da\u03da\u03d7\u03d8\u03da\u03da\u03d7\u03d8\u03da\u03da\276\u03d7\u03d8\u03da\u03da\u03d7\u03d8\u03da\u03da\u03d7\u03d8\u03da\u03da\u03d7\u03d8\u03da\u03da\275\275!");
    }

    @Test
    public void test07553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07553");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07554");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348!", "\u0225\u0228\u0228\u0228\200\u0225\u0228\u0228\u0228]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348!" + "'", str2, "\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348\u0318\u031a\u031a\u031a\u0348\u0348!");
    }

    @Test
    public void test07555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07555");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("N!LLL!LLL!LLLN!LLL!LLL!LLLN!LLL!LLL!LLLN!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLLN!LLL!LLL!LLLN!LLL!LLL!LLLN!LLL!LLL!LLLN!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnull\204\204!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U!LLL!LLL!LLLU!LLL!LLL!LLLU!LLL!LLL!LLLU!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLLU!LLL!LLL!LLLU!LLL!LLL!LLLU!LLL!LLL!LLLU!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!" + "'", str2, "U!LLL!LLL!LLLU!LLL!LLL!LLLU!LLL!LLL!LLLU!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLLU!LLL!LLL!LLLU!LLL!LLL!LLLU!LLL!LLL!LLLU!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!");
    }

    @Test
    public void test07556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07556");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce\200\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce\u02cc\u02ce\u02ce\u02ce]]!", "nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test07557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07557");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!\253\256\256\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!rrrrRR!!RR!!RR!!\256\254\254rrrrRR!!RR!!RR!!\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271\266\246\250!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test07558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07558");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266!", "\275\275\275\275\275\275\275\275LLLLLLLL\275\275\275\275\275\275\275\275LLLLLLLL\275\275\275\275\275\275\275\275LLLLLLLL\275\275\275\275\275\275\275\275LLLLLLLL\275\275\275\275\275\275\275\275LLLLLLLL\275\275\275\275\275\275\275\275LLLLLLLL\275\275\275\275\275\275\275\275LLLLLLLL\275\275\275\275\275\275\275\275LLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266!" + "'", str2, "L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266!");
    }

    @Test
    public void test07559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07559");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!\253\254\256\256UULLUULLUULLUULLUULLUULL\253\254\256\256UULLUULLUULLUULLUULLUULL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07560");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!", "NNNNNNNNNNNNNNNN\200}}`NNNNNNNNNNNNNNNN]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07561");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("uuuu\260\255\255\225\230\230uuuu\260\255\255\225\230\230uuuu\260\255\255\225\230\230uuuu\260\255\255\225\230\230\200}}`uuuu\260\255\255\225\230\230uuuu\260\255\255\225\230\230uuuu\260\255\255\225\230\230uuuu\260\255\255\225\230\230]]!", "\215}\215\215\215}\215\215nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\215}\215\215\215}\215\215!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0166\u0166\u0166\u0166\260\255\255\225\230\230\u0166\u0166\u0166\u0166\260\255\255\225\230\230\u0166\u0166\u0166\u0166\260\255\255\225\230\230\u0166\u0166\u0166\u0166\260\255\255\225\230\230\200\u0166\u0166\u0166\u0166\260\255\255\225\230\230\u0166\u0166\u0166\u0166\260\255\255\225\230\230\u0166\u0166\u0166\u0166\260\255\255\225\230\230\u0166\u0166\u0166\u0166\260\255\255\225\230\230]]!" + "'", str2, "\u0166\u0166\u0166\u0166\260\255\255\225\230\230\u0166\u0166\u0166\u0166\260\255\255\225\230\230\u0166\u0166\u0166\u0166\260\255\255\225\230\230\u0166\u0166\u0166\u0166\260\255\255\225\230\230\200\u0166\u0166\u0166\u0166\260\255\255\225\230\230\u0166\u0166\u0166\u0166\260\255\255\225\230\230\u0166\u0166\u0166\u0166\260\255\255\225\230\230\u0166\u0166\u0166\u0166\260\255\255\225\230\230]]!");
    }

    @Test
    public void test07562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07562");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LLUULLUU}}LLUULLUU}}!", "eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!eHHHHnullEEHnullEE!!!!eHHHHnullEEHnullEE!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01a8\u01a8\u01a6\u01a6\u01a8\u01a8\u01a6\u01a6\u01a8\u01a8\u01a6\u01a6\u01a8\u01a8\u01a6\u01a6}}!" + "'", str2, "\u01a8\u01a8\u01a6\u01a6\u01a8\u01a8\u01a6\u01a6\u01a8\u01a8\u01a6\u01a6\u01a8\u01a8\u01a6\u01a6}}!");
    }

    @Test
    public void test07563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07563");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL!", "\u0366\u0365\u0368\u0368\u014e\u014e!!\213\213\213\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull!" + "'", str2, "\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull!");
    }

    @Test
    public void test07564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07564");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!" + "'", str2, "!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!!!!!!!!\246\246!");
    }

    @Test
    public void test07565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07565");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~NNN\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~NNN]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````!" + "'", str2, "\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````\200```\200`````!");
    }

    @Test
    public void test07566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07566");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!!", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253!!!!!!!!\253\253!!!!!!!!\253\253!!!!!!!!\253\253!!!!!!!!\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253!!!!!!!!\253\253!!!!!!!!\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!!" + "'", str2, "`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull`nullnullnull!!!");
    }

    @Test
    public void test07567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07567");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!!!\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!!!]]!", "NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200NNNNNNNN\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!!!\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!!!]]!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!!!\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!!!]]!");
    }

    @Test
    public void test07568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07568");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0240\u0240!", "!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull!~nullnull\276\276\266\266\276\276\266\266!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~!" + "'", str2, "~~!");
    }

    @Test
    public void test07569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07569");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!", "hehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehhhehh!hehhhehhhehhhehhhehhhehhhehhhehh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!" + "'", str2, "]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!");
    }

    @Test
    public void test07570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07570");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "UNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLLUNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLL!!UNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLLUNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLL!!UNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLLUNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLL!!UNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLLUNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLL!!UNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLLUNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLL!!UNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLLUNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLL!!UNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLLUNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLL!!UNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLLUNLLLUUNLLUNLLLUUNLLUNLLLUUNLLUNLL!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u026e\u026e\u026c\u026c\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u026e\u026e\u026c\u026c\u0346\u0348\u0348!");
    }

    @Test
    public void test07571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07571");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "U\226UUU\226UU!!U\226UUU\226UU!!U\226UUU\226UUU\226UUU\226UU!!U\226UUU\226UU!!U\226UUU\226UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07572");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!nullrttnullrttnullrtt!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!" + "'", str2, "!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!nullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnull!");
    }

    @Test
    public void test07573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07573");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200\u0348\u0346\u0346!", "}~\200\200}~\200\200\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!}~\200\200}~\200\200\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!\276\300!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200\u0348\u0346\u0346!");
    }

    @Test
    public void test07574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07574");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275HHH\276H\275\275!", "u\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275LLL\276L\275\275!" + "'", str2, "\275LLL\276L\275\275!");
    }

    @Test
    public void test07575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07575");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\253\254\256\256````````````````\253\254\256\256````````!", "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256````````````````\253\254\256\256````````!" + "'", str2, "\253\254\256\256````````````````\253\254\256\256````````!");
    }

    @Test
    public void test07576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07576");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("TQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQTQQQ!", "\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad]^^!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac!" + "'", str2, "\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac!");
    }

    @Test
    public void test07577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07577");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("}~\200\200}~\200\200UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!}~\200\200}~\200\200UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!UL!!!", "\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb!!}~\200\200}~\200\200\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb!!!" + "'", str2, "}~\200\200}~\200\200\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb!!}~\200\200}~\200\200\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb\u02f9\u02fb!!!");
    }

    @Test
    public void test07578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07578");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\215\216\230\230AULLAULLAULL\215\216\230\230AULLAULLAULL\215\216\230\230AULLAULLAULL\215\216\230\230AULLAULLAULL\215\216\230\230AULLAULLAULL\215\216\230\230AULLAULLAULL\215\216\230\230AULLAULLAULL\215\216\230\230AULLAULLAULL!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull\215\216\230\230nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07579");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!\254nullnull!\254nullnull!!!!!!!!!", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\254UUUUUUUU!\254UUUUUUUU!!!!!!!!!\254UUUUUUUU!\254UUUUUUUU!!!!!!!!!\254UUUUUUUU!\254UUUUUUUU!!!!!!!!!\254UUUUUUUU!\254UUUUUUUU!!!!!!!!!\254UUUUUUUU!\254UUUUUUUU!!!!!!!!!\254UUUUUUUU!\254UUUUUUUU!!!!!!!!!\254UUUUUUUU!\254UUUUUUUU!!!!!!!!!\254UUUUUUUU!\254UUUUUUUU!!!!!!!!!" + "'", str2, "!\254UUUUUUUU!\254UUUUUUUU!!!!!!!!!\254UUUUUUUU!\254UUUUUUUU!!!!!!!!!\254UUUUUUUU!\254UUUUUUUU!!!!!!!!!\254UUUUUUUU!\254UUUUUUUU!!!!!!!!!\254UUUUUUUU!\254UUUUUUUU!!!!!!!!!\254UUUUUUUU!\254UUUUUUUU!!!!!!!!!\254UUUUUUUU!\254UUUUUUUU!!!!!!!!!\254UUUUUUUU!\254UUUUUUUU!!!!!!!!!");
    }

    @Test
    public void test07580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07580");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200UL``LUL``UL``UL``LUL``UL``}~\200\200}~\200\200UL``LUL``UL``UL``LUL``UL``}~\200\200}~\200\200UL``LUL``UL``UL``LUL``UL``}~\200\200}~\200\200\u0348\u0346\u0346!", "}~\200\200}~\200\200TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT}~\200\200}~\200\200TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200TT``TTT``TT``TT``TTT``TT``}~\200\200}~\200\200TT``TTT``TT``TT``TTT``TT``}~\200\200}~\200\200TT``TTT``TT``TT``TTT``TT``}~\200\200}~\200\200\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200TT``TTT``TT``TT``TTT``TT``}~\200\200}~\200\200TT``TTT``TT``TT``TTT``TT``}~\200\200}~\200\200TT``TTT``TT``TT``TTT``TT``}~\200\200}~\200\200\u0348\u0346\u0346!");
    }

    @Test
    public void test07581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07581");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnull!!nullnull!!nullnull!!nullnull!!null!!!null!!!null!!!null!!!nullnull!!nullnull!!nullnull!!nullnull!!null!!!null!!!!", "HHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260!!!\255\256\260\260!!!!" + "'", str2, "\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260!!!\255\256\260\260!!!!");
    }

    @Test
    public void test07582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07582");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u041c\u041e\u041b\u041b\u041c\u041e\u041b\u041b\u041c\u041e\u041b\u041b\u041c\u041e\u041b\u041b!!!", "\u0366\u0365\u0368\u0368null!!!null!!!\200\200\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test07583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07583");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnullUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnull~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnullUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnull~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnullUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnull~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnullUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnull~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnullUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnull~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnullUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnull~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnullUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnull~}\200\200~}\200\200UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnullUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test07584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07584");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!N!", "nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014b!" + "'", str2, "\u014b!");
    }

    @Test
    public void test07585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07585");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226!!\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226!!!", "\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188\u0184\u0188\u0188!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226!!!" + "'", str2, "\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226\u0187\u0187\u0187\230\226\226!!!");
    }

    @Test
    public void test07586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07586");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("}~\200\200}~\200\200!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull}~\200\200}~\200\200!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!", "F]^^F]^^F]^^F]^^F]^^F]^^F]^^F]^^!F]]!F]]F]^^F]^^F]^^F]^^F]^^F]^^F]^^F]^^!F]]!F]]F]^^F]^^F]^^F]^^F]^^F]^^F]^^F]^^!F]]!F]]F]^^F]^^F]^^F]^^F]^^F]^^F]^^F]^^!F]]!F]]F]^^F]^^F]^^F]^^F]^^F]^^F]^^F]^^!F]]!F]]F]^^F]^^F]^^F]^^F]^^F]^^F]^^F]^^!F]]!F]]F]^^F]^^F]^^F]^^F]^^F]^^F]^^F]^^!F]]!F]]F]^^F]^^F]^^F]^^F]^^F]^^F]^^F]^^!F]]!F]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "}~\200\200}~\200\200!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07587");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL\200}}`!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL]]!", "UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!UNLLUNLLLLUNLLUNLLLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN\200}}`!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN]]!" + "'", str2, "!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN\200}}`!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN]]!");
    }

    @Test
    public void test07588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07588");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\200\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142\u013f\u0142\u0142]]!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull\200}}`!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull]]!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull\200}}`!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull]]!");
    }

    @Test
    public void test07589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07589");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("null\256nullnullnull!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\256nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull\256nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07590");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("`!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull`!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!", "\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200}}`\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull`!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "`!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull`!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07591");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!NNNNNNNNNNNN!!!!NNNNNNNNNNNN!!!!!!!", "\u0317\u031a\u0317\u031a\u0317\u031a\u0317\u031anullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!!" + "'", str2, "UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!UUUUUUUUUUUU!!!!UUUUUUUUUUUU!!!!!!!");
    }

    @Test
    public void test07592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07592");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}~\200\200}~\200\200\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368}~\200\200}~\200\200\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368!", "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368}~\200\200}~\200\200\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368!" + "'", str2, "}~\200\200}~\200\200\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368}~\200\200}~\200\200\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368!");
    }

    @Test
    public void test07593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07593");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!", "\276\276NLLLNLLLNLLLNLLL\276\227\227NLLLNLLLNLLLNLLL\276\227\227\276\276NLLLNLLLNLLLNLLL\276\227\227NLLLNLLLNLLLNLLL\276\227\227\276\276NLLLNLLLNLLLNLLL\276\227\227NLLLNLLLNLLLNLLL\276\227\227\276\276NLLLNLLLNLLLNLLL\276\227\227NLLLNLLLNLLLNLLL\276\227\227\276\276NLLLNLLLNLLLNLLL\276\227\227NLLLNLLLNLLLNLLL\276\227\227\276\276NLLLNLLLNLLLNLLL\276\227\227NLLLNLLLNLLLNLLL\276\227\227\276\276NLLLNLLLNLLLNLLL\276\227\227NLLLNLLLNLLLNLLL\276\227\227\276\276NLLLNLLLNLLLNLLL\276\227\227NLLLNLLLNLLLNLLL\276\227\227!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!" + "'", str2, "LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!");
    }

    @Test
    public void test07594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07594");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!", "\336~\300\300\336~\300\300!!\336~\300\300\336~\300\300!!\336~\300\300\336~\300\300\336~\300\300\336~\300\300!!\336~\300\300\336~\300\300!!\336~\300\300\336~\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test07595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07595");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!", "\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220\u0150\u0150\220!!\200\u0150\u0150\220!!\200\u0150\u0150\220\u0150\u0150\220!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150!" + "'", str2, "\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150!");
    }

    @Test
    public void test07596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07596");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!", "NLLL\200}}`NLLL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!" + "'", str2, "!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!");
    }

    @Test
    public void test07597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07597");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u017d\u0243\u0243\u017d\u0243\u0243\u017d\u0243\u0243\u017d\u0243\u0243\u017d\u0243\u0243\u017d\u0243\u0243!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnullnull!!nullnullnullnullnull!!nullnull!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnullnullnull!!nullnullnullnull!!nullnull!!nullnull!!nullnull!!nullnullnull!!nullnullnullnullnull!!nullnull!");
    }

    @Test
    public void test07598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07598");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!HHHHHHHH!!!", "\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01ddnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!" + "'", str2, "LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!");
    }

    @Test
    public void test07599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07599");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL~}\200\200~}\200\200\336\336LL\336\336LL!", "L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266L\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LL\276\276\266\266\276\276\266\266!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178!" + "'", str2, "~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178!");
    }

    @Test
    public void test07600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07600");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0243\u0243\u0243\u0243\u0243\u0243~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~!!null~~~null~~~null~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!null~~~null~~~null~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!" + "'", str2, "~~!!null~~~null~~~null~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!null~~~null~~~null~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!");
    }

    @Test
    public void test07601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07601");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!", "!!nullnull!Vnullnull!Vnullnullnullnull!Vnullnull!Vnullnull!!nullnull!Vnullnull!Vnullnullnullnull!Vnullnull!Vnullnull!!nullnull!Vnullnull!Vnullnullnullnull!Vnullnull!Vnullnull!!nullnull!Vnullnull!Vnullnullnullnull!Vnullnull!Vnullnull!!nullnull!Vnullnull!Vnullnullnullnull!Vnullnull!Vnullnull!!nullnull!Vnullnull!Vnullnullnullnull!Vnullnull!Vnullnull!!nullnull!Vnullnull!Vnullnullnullnull!Vnullnull!Vnullnull!!nullnull!Vnullnull!Vnullnullnullnull!Vnullnull!Vnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230!!!!!!!!!" + "'", str2, "\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230\u022d\u022e\u0230\u0230!!!!!!!!!");
    }

    @Test
    public void test07602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07602");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214nullnull\214\214!", "\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\275LL\276\275LL\214\214\276\275LL\276\275LL\214\214\276\275LL\276\275LL\214\214\276\275LL\276\275LL\214\214\276\275LL\276\275LL\214\214\276\275LL\276\275LL\214\214\276\275LL\276\275LL\214\214\276\275LL\276\275LL\214\214!" + "'", str2, "\276\275LL\276\275LL\214\214\276\275LL\276\275LL\214\214\276\275LL\276\275LL\214\214\276\275LL\276\275LL\214\214\276\275LL\276\275LL\214\214\276\275LL\276\275LL\214\214\276\275LL\276\275LL\214\214\276\275LL\276\275LL\214\214!");
    }

    @Test
    public void test07603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07603");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8!luu!luu!luu!luu!luu!luu!luu!luu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07604");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!", "FFFFFFFF!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07605");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200null!\340\340nullnull\340\340nullnull\340\340nullnull\340\340null!\340\340nullnull\340\340nullnull\340\340nullnull\340\340}~\200\200}~\200\200null!\340\340nullnull\340\340nullnull\340\340nullnull\340\340null!\340\340nullnull\340\340nullnull\340\340nullnull\340\340}~\200\200}~\200\200null!\340\340nullnull\340\340nullnull\340\340nullnull\340\340null!\340\340nullnull\340\340nullnull\340\340nullnull\340\340}~\200\200}~\200\200null!\340\340nullnull\340\340nullnull\340\340nullnull\340\340null!\340\340nullnull\340\340nullnull\340\340nullnull\340\340\u0348\u0346\u0346!", "\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01ddnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200ULLL!UUULLLULLLUUULLLULLLUUULLLULLLUUULLL!UUULLLULLLUUULLLULLLUUULLLULLLUU}~\200\200}~\200\200ULLL!UUULLLULLLUUULLLULLLUUULLLULLLUUULLL!UUULLLULLLUUULLLULLLUUULLLULLLUU}~\200\200}~\200\200ULLL!UUULLLULLLUUULLLULLLUUULLLULLLUUULLL!UUULLLULLLUUULLLULLLUUULLLULLLUU}~\200\200}~\200\200\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200ULLL!UUULLLULLLUUULLLULLLUUULLLULLLUUULLL!UUULLLULLLUUULLLULLLUUULLLULLLUU}~\200\200}~\200\200ULLL!UUULLLULLLUUULLLULLLUUULLLULLLUUULLL!UUULLLULLLUUULLLULLLUUULLLULLLUU}~\200\200}~\200\200ULLL!UUULLLULLLUUULLLULLLUUULLLULLLUUULLL!UUULLLULLLUUULLLULLLUUULLLULLLUU}~\200\200}~\200\200\u0348\u0346\u0346!");
    }

    @Test
    public void test07606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07606");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("`LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!`LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!!", "!!!!\200~~!!!!\200~~!!!!!!!!!!!!\200~~!!!!\200~~!!!!!!!!!!!!!!\200~~!!!!\200~~!!!!!!!!!!!!\200~~!!!!\200~~!!!!!!!!!!!!!!\200~~!!!!\200~~!!!!!!!!!!!!\200~~!!!!\200~~!!!!!!!!!!!!\200~~!!!!\200~~!!!!!!!!!!!!\200~~!!!!\200~~!!!!!!!!!!!!!!\200~~!!!!\200~~!!!!!!!!!!!!\200~~!!!!\200~~!!!!!!!!!!!!!!\200~~!!!!\200~~!!!!!!!!!!!!\200~~!!!!\200~~!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!`nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "`nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!`nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test07607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07607");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0!", "!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!\270!!!\270!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07608");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\200\200\230\230\200\200\230\230!", "\u0366\u0365\u0368\u0368\300\300!!\300\300!!\300\300!!\300\300\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200\230\230\200\200\230\230!" + "'", str2, "\200\200\230\230\200\200\230\230!");
    }

    @Test
    public void test07609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07609");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("~\200}}~\200}}~\200}}~\200}}UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL~\200}}~\200}}~\200}}~\200}}UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!", "null\225\223\223\275\275\275null\225\223\223\275\275\275!!null\225\223\223\275\275\275null\225\223\223\275\275\275!!null\225\223\223\275\275\275null\225\223\223\275\275\275null\225\223\223\275\275\275null\225\223\223\275\275\275!!null\225\223\223\275\275\275null\225\223\223\275\275\275!!null\225\223\223\275\275\275null\225\223\223\275\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~\200}}~\200}}~\200}}~\200}}\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272~\200}}~\200}}~\200}}~\200}}\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272!" + "'", str2, "~\200}}~\200}}~\200}}~\200}}\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272~\200}}~\200}}~\200}}~\200}}\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272\270\267\272\272!");
    }

    @Test
    public void test07610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07610");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07611");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("NN!!NN!!LNNNLNNNNN!!NN!!LNNNLNNNNN!!NN!!LNNNLNNNNN!!NN!!LNNNLNNNNN!!NN!!LNNNLNNNNN!!NN!!LNNNLNNNNN!!NN!!LNNNLNNNNN!!NN!!LNNNLNNN!", "}~\200\200}~\200\200FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF}~\200\200}~\200\200FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07612");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("]LNLLLNLLLNLLLNLLLNLL]]LNLLLNLL]]LNLLLNLL]]LNLLLNLL]]]LNLLLNLLLNLLLNLLLNLL]]LNLLLNLL]]!", "\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126nullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e]]!" + "'", str2, "\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e\u026e\u026b\u026e\u026e]]!");
    }

    @Test
    public void test07613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07613");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "!!~ULLLULLL!!!!~ULLLULLL!!!!!!~ULLLULLL!!!!~ULLLULLL!!!!!!~ULLLULLL!!!!~ULLLULLL!!!!~ULLLULLL!!!!~ULLLULLL!!!!!!~ULLLULLL!!!!~ULLLULLL!!!!!!~ULLLULLL!!!!~ULLLULLL!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\342\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\342\u0348\u0346\u0346!");
    }

    @Test
    public void test07614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07614");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!\200}}`!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07615");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("UULL!UULLUULLUULL!UULLUULLUULL!UULLUULLUULL!UULLUULLUULL!UULLUULLUULL!UULLUULLUULL!UULLUULLUULL!UULLUULL!!UULL!UULLUULLUULL!UULLUULLUULL!UULLUULLUULL!UULLUULLUULL!UULLUULLUULL!UULLUULLUULL!UULLUULLUULL!UULLUULL!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test07616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07616");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!", "\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231!!\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231!!\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231!!\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231!!\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231\232\220\231\231\200~~\232\220\231\231\200~~\232\220\231\231\232\220\231\231!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!" + "'", str2, "!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!!!!~~~!!~~!!~~!!~~~!!~~!!~~!");
    }

    @Test
    public void test07617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07617");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\253\254\256\256\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!\253\254\256\256\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!!", "nullnullnullnull\275\275\275nullnullnullnull\275\275\275!!nullnullnullnull\275\275\275nullnullnullnull\275\275\275!!nullnullnullnull\275\275\275nullnullnullnull\275\275\275nullnullnullnull\275\275\275nullnullnullnull\275\275\275!!nullnullnullnull\275\275\275nullnullnullnull\275\275\275!!nullnullnullnull\275\275\275nullnullnullnull\275\275\275!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!\253\254\256\256U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!" + "'", str2, "\253\254\256\256U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!\253\254\256\256U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!");
    }

    @Test
    public void test07618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07618");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "nullnull\254\254nullnull\254\254]]nullnull\254\254nullnull\254\254]]\214nullnull\254\254nullnull\254\254nullnull\254\254\214nullnull\254\254nullnull\254\254nullnull\254\254nullnull\254\254nullnull\254\254]]nullnull\254\254nullnull\254\254]]\214nullnull\254\254nullnull\254\254nullnull\254\254\214nullnull\254\254nullnull\254\254nullnull\254\254!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07619");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225null~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!", "VV!!VV!!!!``VV!!VV!!``VV!!VV!!``VV!!VV!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!``VV!!VV!!``VV!!VV!!``VV!!VV!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!VV!!VV!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull~\225\225\230\230\225\225\230\230\225\225\230\230\225\225nullnullnullnull~\225\225\230\230\225\225\230\230\225\225\230\230\225\225nullnullnullnull~\225\225\230\230\225\225\230\230\225\225\230\230\225\225nullnullnullnull~\225\225\230\230\225\225\230\230\225\225\230\230\225\225nullnullnullnull~\225\225\230\230\225\225\230\230\225\225\230\230\225\225nullnullnullnull~\225\225\230\230\225\225\230\230\225\225\230\230\225\225nullnullnullnull~\225\225\230\230\225\225\230\230\225\225\230\230\225\225nullnullnullnull~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!" + "'", str2, "nullnullnullnull~\225\225\230\230\225\225\230\230\225\225\230\230\225\225nullnullnullnull~\225\225\230\230\225\225\230\230\225\225\230\230\225\225nullnullnullnull~\225\225\230\230\225\225\230\230\225\225\230\230\225\225nullnullnullnull~\225\225\230\230\225\225\230\230\225\225\230\230\225\225nullnullnullnull~\225\225\230\230\225\225\230\230\225\225\230\230\225\225nullnullnullnull~\225\225\230\230\225\225\230\230\225\225\230\230\225\225nullnullnullnull~\225\225\230\230\225\225\230\230\225\225\230\230\225\225nullnullnullnull~\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
    }

    @Test
    public void test07620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07620");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!", "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!" + "'", str2, "!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!");
    }

    @Test
    public void test07621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07621");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07622");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NULLNULL!", "LLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLL!LLLLLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLL!" + "'", str2, "LLLLLLLL!");
    }

    @Test
    public void test07623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07623");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "!!\214\214!!\214\214!!!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!!!\214\214!!\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test07624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07624");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240\u0240!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "!UN!!\230UN!!UN!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test07625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07625");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200!", "!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200!" + "'", str2, "\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200!");
    }

    @Test
    public void test07626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07626");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("`!!nullnull!!nullnull!!nullnull`!!nullnull!!nullnull!!nullnull!", "LNUU~\210LNUU\212\212\210LNUU\212\212LNUU~\210LNUU\212\212\210LNUU\212\212!!LNUU~\210LNUU\212\212\210LNUU\212\212LNUU~\210LNUU\212\212\210LNUU\212\212!!LNUU~\210LNUU\212\212\210LNUU\212\212LNUU~\210LNUU\212\212\210LNUU\212\212LNUU~\210LNUU\212\212\210LNUU\212\212LNUU~\210LNUU\212\212\210LNUU\212\212!!LNUU~\210LNUU\212\212\210LNUU\212\212LNUU~\210LNUU\212\212\210LNUU\212\212!!LNUU~\210LNUU\212\212\210LNUU\212\212LNUU~\210LNUU\212\212\210LNUU\212\212!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`!!\210\210UU\210\210UU!!\210\210UU\210\210UU!!\210\210UU\210\210UU`!!\210\210UU\210\210UU!!\210\210UU\210\210UU!!\210\210UU\210\210UU!" + "'", str2, "`!!\210\210UU\210\210UU!!\210\210UU\210\210UU!!\210\210UU\210\210UU`!!\210\210UU\210\210UU!!\210\210UU\210\210UU!!\210\210UU\210\210UU!");
    }

    @Test
    public void test07627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07627");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL\275\200LL!", "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!!" + "'", str2, "\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!\275\200!!!");
    }

    @Test
    public void test07628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07628");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!", "\336\335\340\340\336\335\340\340!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!" + "'", str2, "\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!");
    }

    @Test
    public void test07629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07629");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("ab!", "}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!}^LL}^LL}^LL}^LL}^LL}^LL}^LL}^LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!" + "'", str2, "nullnull!");
    }

    @Test
    public void test07630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07630");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUU!!nullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUU!!nullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUU!!nullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUU!!nullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUUnullnullNUUUNUUU!", "^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^!!UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^!!UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^!!UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^!!UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^!" + "'", str2, "UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^!!UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^!!UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^!!UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^!!UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^UNLLUNLL`^^^`^^^!");
    }

    @Test
    public void test07631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07631");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!L!", "!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!" + "'", str2, "!null!");
    }

    @Test
    public void test07632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07632");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214UUUUUUUU\214\214!", "!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!!!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!!!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!!!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!!!~\200FFFF~~\200FFFF~~!~\200FFFF~~\200FFFF~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214!" + "'", str2, "nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214!");
    }

    @Test
    public void test07633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07633");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u026e\u026e\u026c\u026c\u0346\u0348\u0348!", "!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test07634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07634");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUU!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNN!" + "'", str2, "NUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNN!");
    }

    @Test
    public void test07635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07635");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu!", "\276bcee\275\275\276bcee\275\275c!eec!eec!eec!eec!eec!eec!eec!ee\276bcee\275\275\276bcee\275\275c!eec!eec!eec!eec!eec!eec!eec!ee\276bcee\275\275\276bcee\275\275c!eec!eec!eec!eec!eec!eec!eec!ee\276bcee\275\275\276bcee\275\275c!eec!eec!eec!eec!eec!eec!eec!ee\276bcee\275\275\276bcee\275\275c!eec!eec!eec!eec!eec!eec!eec!ee\276bcee\275\275\276bcee\275\275c!eec!eec!eec!eec!eec!eec!eec!ee\276bcee\275\275\276bcee\275\275c!eec!eec!eec!eec!eec!eec!eec!ee\276bcee\275\275\276bcee\275\275c!eec!eec!eec!eec!eec!eec!eec!ee!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]\275!\275\275\275!\275\275]]\275!\275\275\275!\275\275!!]]\275!\275\275\275!\275\275]]\275!\275\275\275!\275\275!!]]\275!\275\275\275!\275\275]]\275!\275\275\275!\275\275]]\275!\275\275\275!\275\275]]\275!\275\275\275!\275\275!!]]\275!\275\275\275!\275\275]]\275!\275\275\275!\275\275!!]]\275!\275\275\275!\275\275]]\275!\275\275\275!\275\275!" + "'", str2, "]]\275!\275\275\275!\275\275]]\275!\275\275\275!\275\275!!]]\275!\275\275\275!\275\275]]\275!\275\275\275!\275\275!!]]\275!\275\275\275!\275\275]]\275!\275\275\275!\275\275]]\275!\275\275\275!\275\275]]\275!\275\275\275!\275\275!!]]\275!\275\275\275!\275\275]]\275!\275\275\275!\275\275!!]]\275!\275\275\275!\275\275]]\275!\275\275\275!\275\275!");
    }

    @Test
    public void test07636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07636");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}~\200\200}~\200\200NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL}~\200\200}~\200\200NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!", "null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullqrttqrttqrttqrttqrttqrttqrttqrttnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullqrttqrttqrttqrttqrttqrttqrttqrtt!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL}~\200\200}~\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!" + "'", str2, "}~\200\200}~\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL}~\200\200}~\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!");
    }

    @Test
    public void test07637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07637");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\275\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262\u0264\u0264\u0262\u0262!", "\246\246\246\246\246\246\246\246!!\246\246\246\246\246\246\246\246!!\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246\246!!\246\246\246\246\246\246\246\246!!\246\246\246\246\246\246\246\246!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07638");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fanullnull!", "~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL~}\200\200~}\200\200NNLLNNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02faN~LLN~LL!" + "'", str2, "\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02faN~LLN~LL!");
    }

    @Test
    public void test07639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07639");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullaanullnullaanullnullaanullnullaanullnullaanullnullaanullnullaanullnullaa!", "LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LL!" + "'", str2, "LL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LL!");
    }

    @Test
    public void test07640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07640");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!}!!!}!!!!!}!!!}!!!!!}!!!}!!!}!!!}!!!!!}!!!}!!!!!}!!!}!!!", "\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!}!!!}!!!!!}!!!}!!!!!}!!!}!!!}!!!}!!!!!}!!!}!!!!!}!!!}!!!" + "'", str2, "!}!!!}!!!!!}!!!}!!!!!}!!!}!!!}!!!}!!!!!}!!!}!!!!!}!!!}!!!");
    }

    @Test
    public void test07641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07641");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0348\u0348\u01e0\u01e0\u01e0\u0348\u0348\u01e0\u01e0\u01e0\u0348\u0348\u01e0\u01e0\u01e0\u0348\u0348\u01e0\u01e0\u01e0\200\u0348\u0348\u01e0\u01e0\u01e0\u0348\u0348\u01e0\u01e0\u01e0\u0348\u0348\u01e0\u01e0\u01e0\u0348\u0348\u01e0\u01e0\u01e0]]!", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~nullnullnull\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~nullnullnull]]!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~nullnullnull\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~nullnullnull]]!");
    }

    @Test
    public void test07642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07642");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("]!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!]]!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!]]!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!]]!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!]]]!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!]]!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!]]!", "\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLL\227UPLLUPLLUPLL\227UPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLL\227UPLLUPLLUPLL\227UPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL\227UPLLUPLLUPLLUPLLUPLLUPLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!]]!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!]]!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!]]!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!]]]!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!]]!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!]]!" + "'", str2, "]!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!]]!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!]]!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!]]!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!]]]!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!]]!LLLLLLLLLLLLLLLL!!!LLLLLLLLLLLLLLLL!!]]!");
    }

    @Test
    public void test07643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07643");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016eUU!!!!!!!", "\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!!" + "'", str2, "NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!!");
    }

    @Test
    public void test07644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07644");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}~\200\200}~\200\200L^NNL^NN}~\200\200}~\200\200L^NNL^NN!", "!!!!NN!!NN!!NN!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!NN!!NN!!NN!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200!^NN!^NN}~\200\200}~\200\200!^NN!^NN!" + "'", str2, "}~\200\200}~\200\200!^NN!^NN}~\200\200}~\200\200!^NN!^NN!");
    }

    @Test
    public void test07645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07645");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226^```^```^```^```^```^```^```^```^```^```\230null\226\226\230null\226\226^```^```\230null\226\226\230null\226\226!", "!!!lll!lll!lll!lll!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```^```^```^```^```^```^```^```^```\230l!ll\226\226\230l!ll\226\226^```^```\230l!ll\226\226\230l!ll\226\226^```^```^```^```^```^```^```^```^```^```\230l!ll\226\226\230l!ll\226\226^```^```\230l!ll\226\226\230l!ll\226\226^```^```^```^```^```^```^```^```^```^```\230l!ll\226\226\230l!ll\226\226^```^```\230l!ll\226\226\230l!ll\226\226^```^```^```^```^```^```^```^```^```^```\230l!ll\226\226\230l!ll\226\226^```^```\230l!ll\226\226\230l!ll\226\226^```^```^```^```^```^```^```^```^```^```\230l!ll\226\226\230l!ll\226\226^```^```\230l!ll\226\226\230l!ll\226\226^```^```^```^```^```^```^```^```^```^```\230l!ll\226\226\230l!ll\226\226^```^```\230l!ll\226\226\230l!ll\226\226^```^```^```^```^```^```^```^```^```^```\230l!ll\226\226\230l!ll\226\226^```^```\230l!ll\226\226\230l!ll\226\226^```^```^```^```^```^```^```^```^```^```\230l!ll\226\226\230l!ll\226\226^```^```\230l!ll\226\226\230l!ll\226\226!" + "'", str2, "^```^```^```^```^```^```^```^```^```^```\230l!ll\226\226\230l!ll\226\226^```^```\230l!ll\226\226\230l!ll\226\226^```^```^```^```^```^```^```^```^```^```\230l!ll\226\226\230l!ll\226\226^```^```\230l!ll\226\226\230l!ll\226\226^```^```^```^```^```^```^```^```^```^```\230l!ll\226\226\230l!ll\226\226^```^```\230l!ll\226\226\230l!ll\226\226^```^```^```^```^```^```^```^```^```^```\230l!ll\226\226\230l!ll\226\226^```^```\230l!ll\226\226\230l!ll\226\226^```^```^```^```^```^```^```^```^```^```\230l!ll\226\226\230l!ll\226\226^```^```\230l!ll\226\226\230l!ll\226\226^```^```^```^```^```^```^```^```^```^```\230l!ll\226\226\230l!ll\226\226^```^```\230l!ll\226\226\230l!ll\226\226^```^```^```^```^```^```^```^```^```^```\230l!ll\226\226\230l!ll\226\226^```^```\230l!ll\226\226\230l!ll\226\226^```^```^```^```^```^```^```^```^```^```\230l!ll\226\226\230l!ll\226\226^```^```\230l!ll\226\226\230l!ll\226\226!");
    }

    @Test
    public void test07646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07646");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!", "!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```^```^```^```^```^```^```^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```^```^```^```^```^```^```^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```^```^```^```^```^```^```^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```^```^```^```^```^```^```^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```^```^```^```^```^```^```^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```^```^```^```^```^```^```^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```^```^```^```^```^```^```^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```^```^```^```^```^```^```^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!" + "'", str2, "^```^```^```^```^```^```^```^```^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```^```^```^```^```^```^```^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```^```^```^```^```^```^```^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```^```^```^```^```^```^```^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```^```^```^```^```^```^```^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```^```^```^```^```^```^```^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```^```^```^```^```^```^```^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```^```^```^```^```^```^```^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!");
    }

    @Test
    public void test07647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07647");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0170\u0170\u0170\u0170nullnullnullnullnullnullnullnullnull!", "LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLL!!!LLLL!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LLnull!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LLnull!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LLnull!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LLnull!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!" + "'", str2, "!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LLnull!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LLnull!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LLnull!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LLnull!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!");
    }

    @Test
    public void test07648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07648");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!H!", "\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\260!" + "'", str2, "!\260!");
    }

    @Test
    public void test07649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07649");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214\u0243L\214\214!", "nullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214!" + "'", str2, "UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214UNUUUNUUnullU\214\214nullU\214\214!");
    }

    @Test
    public void test07650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07650");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnull!", "^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!^!!!^!!!!!^!!!^!!!!\276!^!!!^!!!^!!\276!^!!!^!!!^!!!^!!!^!!!!!^!!!^!!!!\276!^!!!^!!!^!!\276!^!!!^!!!^!!!^!!!^!!!!!^!!!^!!!!\276!^!!!^!!!^!!\276!^!!!^!!!^!!!^!!!^!!!!!^!!!^!!!!\276!^!!!^!!!^!!\276!^!!!^!!!^!!!^!!!^!!!!!^!!!^!!!!\276!^!!!^!!!^!!\276!^!!!^!!!^!!!^!!!^!!!!!^!!!^!!!!\276!^!!!^!!!^!!\276!^!!!^!!!^!!!^!!!^!!!!!^!!!^!!!!\276!^!!!^!!!^!!\276!^!!!^!!!^!!!^!!!^!!!!!^!!!^!!!!\276!^!!!^!!!^!!\276!^!!!^!!!^!!!" + "'", str2, "!^!!!^!!!!!^!!!^!!!!\276!^!!!^!!!^!!\276!^!!!^!!!^!!!^!!!^!!!!!^!!!^!!!!\276!^!!!^!!!^!!\276!^!!!^!!!^!!!^!!!^!!!!!^!!!^!!!!\276!^!!!^!!!^!!\276!^!!!^!!!^!!!^!!!^!!!!!^!!!^!!!!\276!^!!!^!!!^!!\276!^!!!^!!!^!!!^!!!^!!!!!^!!!^!!!!\276!^!!!^!!!^!!\276!^!!!^!!!^!!!^!!!^!!!!!^!!!^!!!!\276!^!!!^!!!^!!\276!^!!!^!!!^!!!^!!!^!!!!!^!!!^!!!!\276!^!!!^!!!^!!\276!^!!!^!!!^!!!^!!!^!!!!!^!!!^!!!!\276!^!!!^!!!^!!\276!^!!!^!!!^!!!");
    }

    @Test
    public void test07651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07651");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UN\276\276UN\276\276!!\256\254\254UN\276\276UN\276\276!!\256\254\254!!UN\276\276UN\276\276!!\256\254\254UN\276\276UN\276\276!!\256\254\254!!UN\276\276UN\276\276!!\256\254\254UN\276\276UN\276\276!!\256\254\254!!UN\276\276UN\276\276!!\256\254\254UN\276\276UN\276\276!!\256\254\254!!UN\276\276UN\276\276!!\256\254\254UN\276\276UN\276\276!!\256\254\254!!UN\276\276UN\276\276!!\256\254\254UN\276\276UN\276\276!!\256\254\254!!UN\276\276UN\276\276!!\256\254\254UN\276\276UN\276\276!!\256\254\254!!UN\276\276UN\276\276!!\256\254\254UN\276\276UN\276\276!!\256\254\254!!!", "h]hhh]hh!!h]hhh]hh!!h]hhh]hhh]hhh]hh!!h]hhh]hh!!h]hhh]hh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HH\276\276HH\276\276!!\256\254\254HH\276\276HH\276\276!!\256\254\254!!HH\276\276HH\276\276!!\256\254\254HH\276\276HH\276\276!!\256\254\254!!HH\276\276HH\276\276!!\256\254\254HH\276\276HH\276\276!!\256\254\254!!HH\276\276HH\276\276!!\256\254\254HH\276\276HH\276\276!!\256\254\254!!HH\276\276HH\276\276!!\256\254\254HH\276\276HH\276\276!!\256\254\254!!HH\276\276HH\276\276!!\256\254\254HH\276\276HH\276\276!!\256\254\254!!HH\276\276HH\276\276!!\256\254\254HH\276\276HH\276\276!!\256\254\254!!HH\276\276HH\276\276!!\256\254\254HH\276\276HH\276\276!!\256\254\254!!!" + "'", str2, "HH\276\276HH\276\276!!\256\254\254HH\276\276HH\276\276!!\256\254\254!!HH\276\276HH\276\276!!\256\254\254HH\276\276HH\276\276!!\256\254\254!!HH\276\276HH\276\276!!\256\254\254HH\276\276HH\276\276!!\256\254\254!!HH\276\276HH\276\276!!\256\254\254HH\276\276HH\276\276!!\256\254\254!!HH\276\276HH\276\276!!\256\254\254HH\276\276HH\276\276!!\256\254\254!!HH\276\276HH\276\276!!\256\254\254HH\276\276HH\276\276!!\256\254\254!!HH\276\276HH\276\276!!\256\254\254HH\276\276HH\276\276!!\256\254\254!!HH\276\276HH\276\276!!\256\254\254HH\276\276HH\276\276!!\256\254\254!!!");
    }

    @Test
    public void test07652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07652");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!!", "\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!!" + "'", str2, "\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!!");
    }

    @Test
    public void test07653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07653");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("UNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNNUNLLUNLLNN!", "\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07654");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LL]UULLLL]UULLLL]UULLLL]UULL!LL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULL!LL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULL!LL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULL!LL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULL!LL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULL!LL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULL!LL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULL!LL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULLLL]UULL!", "LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL]~~LLLL]~~LLLL]~~LLLL]~~LL!LL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LL!LL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LL!LL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LL!LL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LL!LL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LL!LL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LL!LL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LL!LL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LL!" + "'", str2, "LL]~~LLLL]~~LLLL]~~LLLL]~~LL!LL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LL!LL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LL!LL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LL!LL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LL!LL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LL!LL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LL!LL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LL!LL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LLLL]~~LL!");
    }

    @Test
    public void test07655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07655");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
    }

    @Test
    public void test07656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07656");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u026e\u026e\u026c\u026c\u0346\u0348\u0348!", "``!!``!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test07657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07657");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275\335\336\340\340\335\336\340\340\335\336\340\340\276\335\336\340\340\275\275!", "UNLLUNLL!!!!UNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnullnullnullnullnullnullnullnullnullnull\276nullnullnullnull\275\275!" + "'", str2, "\275nullnullnullnullnullnullnullnullnullnullnullnull\276nullnullnullnull\275\275!");
    }

    @Test
    public void test07658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07658");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!NU!!!", "\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test07659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07659");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("E~UUHHUUHHE~UUHHUUHH!!E~UUHHUUHHE~UUHHUUHH!!E~UUHHUUHHE~UUHHUUHHE~UUHHUUHHE~UUHHUUHH!!E~UUHHUUHHE~UUHHUUHH!!E~UUHHUUHHE~UUHHUUHH!", "\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028enullnullnullnullnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01b2\u028e\u028e\u028e\u028e\u01b2\u028e\u028e\u028e\u028e\u01b2\u028e\u028e\u028e\u028e\u01b2\u028e\u028e\u028e\u028e\u01b2\u028e\u028e\u028e\u028e\u01b2\u028e\u028e\u028e\u028e\u01b2\u028e\u028e\u028e\u028e\u01b2\u028e\u028e\u028e\u028e\u01b2\u028e\u028e\u028e\u028e\u01b2\u028e\u028e\u028e\u028e\u01b2\u028e\u028e\u028e\u028e\u01b2\u028e\u028e\u028e\u028e!" + "'", str2, "\u01b2\u028e\u028e\u028e\u028e\u01b2\u028e\u028e\u028e\u028e\u01b2\u028e\u028e\u028e\u028e\u01b2\u028e\u028e\u028e\u028e\u01b2\u028e\u028e\u028e\u028e\u01b2\u028e\u028e\u028e\u028e\u01b2\u028e\u028e\u028e\u028e\u01b2\u028e\u028e\u028e\u028e\u01b2\u028e\u028e\u028e\u028e\u01b2\u028e\u028e\u028e\u028e\u01b2\u028e\u028e\u028e\u028e\u01b2\u028e\u028e\u028e\u028e!");
    }

    @Test
    public void test07660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07660");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!!``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!!``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!!``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!!``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ``JJ!", "]]UU]]UU!!]]UU]]UU!!]]UU]]UU]]UU]]UU!!]]UU]]UU!!]]UU]]UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!" + "'", str2, "``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!");
    }

    @Test
    public void test07661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07661");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\276L\266\266~LL\276L\266\266~LL!!\276L\266\266~LL\276L\266\266~LL!!\276L\266\266~LL\276L\266\266~LL\276L\266\266~LL\276L\266\266~LL!!\276L\266\266~LL\276L\266\266~LL!!\276L\266\266~LL\276L\266\266~LL!", "\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU!" + "'", str2, "\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU!");
    }

    @Test
    public void test07662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07662");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("NN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNNNN!!NN!!UNNNUNNN!", "\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``\275\200``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07663");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\214\214LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\214\214LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\214\214LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\214\214LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\214\214LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\214\214LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\214\214LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\214\214!", "!UUU!UUU!!!UUU!UUU!!!UUU!UUU!UUU!UUU!!!UUU!UUU!!!UUU!UUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\214\214UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\214\214UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\214\214UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\214\214UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\214\214UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\214\214UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\214\214UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\214\214!" + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\214\214UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\214\214UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\214\214UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\214\214UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\214\214UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\214\214UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\214\214UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\214\214!");
    }

    @Test
    public void test07664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07664");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!!!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!!!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!!!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!!!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT\200~~!TTT!TTT!TTT!TTT!TTT!TTT!TTT!TTT!", "\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e\ua7ab\ua7ab\ua7ab\ua7ab\u025e\u025e\u025e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!" + "'", str2, "!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]\200~~!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!");
    }

    @Test
    public void test07665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07665");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!!!LLL!LLL!!!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!", "EHHHHEFFHEFFHEFFEHHHHEFFHEFFHEFFEHHHHEFFHEFFHEFFEHHHHEFFHEFFHEFFEHHHHEFFHEFFHEFFEHHHHEFFHEFFHEFFEHHHHEFFHEFFHEFFEHHHHEFFHEFFHEFF!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!FFF!FFF!!!FFF!FFF!!!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!!!FFF!FFF!!!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!!!FFF!FFF!!!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!!!FFF!FFF!!!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!!!FFF!FFF!!!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!!!FFF!FFF!!!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!!!FFF!FFF!!!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!!!FFF!FFF!!!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!" + "'", str2, "!FFF!FFF!!!FFF!FFF!!!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!!!FFF!FFF!!!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!!!FFF!FFF!!!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!!!FFF!FFF!!!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!!!FFF!FFF!!!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!!!FFF!FFF!!!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!!!FFF!FFF!!!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!!!FFF!FFF!!!FFF!FFF!FFF!FFF!FFF!FFF!FFF!FFF!");
    }

    @Test
    public void test07666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07666");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("~~\200\200!~~\200\200~~\200\200~~\200\200!~~\200\200~~\200\200!!~~\200\200!~~\200\200~~\200\200~~\200\200!~~\200\200~~\200\200!!!", "!UNLL\230UNLLUNLLUNLL\230UNLLUNLLUNLL\230UNLLUNLL!UNLL\230UNLLUNLLUNLL\230UNLLUNLLUNLL\230UNLLUNLL!UNLL\230UNLLUNLLUNLL\230UNLLUNLLUNLL\230UNLLUNLL!UNLL\230UNLLUNLLUNLL\230UNLLUNLLUNLL\230UNLLUNLL!!UNLL\230UNLLUNLLUNLL\230UNLLUNLL!!UNLL\230UNLLUNLLUNLL\230UNLLUNLL!!UNLL\230UNLLUNLLUNLL\230UNLLUNLL!!UNLL\230UNLLUNLLUNLL\230UNLLUNLL!UNLL\230UNLLUNLLUNLL\230UNLLUNLLUNLL\230UNLLUNLL!UNLL\230UNLLUNLLUNLL\230UNLLUNLLUNLL\230UNLLUNLL!UNLL\230UNLLUNLLUNLL\230UNLLUNLLUNLL\230UNLLUNLL!UNLL\230UNLLUNLLUNLL\230UNLLUNLLUNLL\230UNLLUNLL!!UNLL\230UNLLUNLLUNLL\230UNLLUNLL!!UNLL\230UNLLUNLLUNLL\230UNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~\200\200!~~\200\200~~\200\200~~\200\200!~~\200\200~~\200\200!!~~\200\200!~~\200\200~~\200\200~~\200\200!~~\200\200~~\200\200!!!" + "'", str2, "~~\200\200!~~\200\200~~\200\200~~\200\200!~~\200\200~~\200\200!!~~\200\200!~~\200\200~~\200\200~~\200\200!~~\200\200~~\200\200!!!");
    }

    @Test
    public void test07667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07667");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}~\200\200}~\200\200\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338}~\200\200}~\200\200\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338!", "\215}\215\215\215}\215\215nullnullnullnull\215}\215\215\215}\215\215!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338}~\200\200}~\200\200\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338!" + "'", str2, "}~\200\200}~\200\200\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338}~\200\200}~\200\200\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338!");
    }

    @Test
    public void test07668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07668");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\300\300\275\275\300\300\275\275\300\300\275\275\300\300\275\275\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\300\300\275\275\300\300\275\275!", "\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275~~~\275~~~\275~~~\275~~~~~\275\275~~\275\275~~\275\275~~\275\275\275~~~\275~~~\275~~~\275~~~~~\275\275~~\275\275!" + "'", str2, "\275~~~\275~~~\275~~~\275~~~~~\275\275~~\275\275~~\275\275~~\275\275\275~~~\275~~~\275~~~\275~~~~~\275\275~~\275\275!");
    }

    @Test
    public void test07669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07669");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0!", "nullnull\200\200!nullnull\200\200nullnull\200\200nullnull\200\200!nullnull\200\200nullnull\200\200nullnull\200\200!nullnull\200\200nullnull\200\200nullnull\200\200!nullnull\200\200nullnull\200\200nullnull\200\200!nullnull\200\200nullnull\200\200nullnull\200\200!nullnull\200\200nullnull\200\200nullnull\200\200!nullnull\200\200nullnull\200\200nullnull\200\200!nullnull\200\200nullnull\200\200!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07670");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!!", "\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!!" + "'", str2, "\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!\256\256!!!");
    }

    @Test
    public void test07671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07671");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!~UU!~UU\220\220!~UU!~UU\220\220\220!~UU\220\220\220!~UU\220\220\220!~UU\220\220\220!~UU\220\220!~UU!~UU\220\220!~UU!~UU\220\220!", "LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~LL!~LL\220\220!~LL!~LL\220\220\220!~LL\220\220\220!~LL\220\220\220!~LL\220\220\220!~LL\220\220!~LL!~LL\220\220!~LL!~LL\220\220!" + "'", str2, "!~LL!~LL\220\220!~LL!~LL\220\220\220!~LL\220\220\220!~LL\220\220\220!~LL\220\220\220!~LL\220\220!~LL!~LL\220\220!~LL!~LL\220\220!");
    }

    @Test
    public void test07672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07672");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!", "\u0366\u0365\u0368\u0368\336\336!!\336\336!!!!\336\336!!\336\336!!!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!" + "'", str2, "!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!!\200\200!!\200\200!!!!\200\200!!\200\200!!!!\200\200!!\200\200!");
    }

    @Test
    public void test07673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07673");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!!", "\u014f!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!!" + "'", str2, "\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!!");
    }

    @Test
    public void test07674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07674");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL\275\276LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07675");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!", "LL!!LL!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07676");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u017e\u017e\u017e\u017e\u017e\u017e!", "efhhefhh!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07677");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106\u0108\u0106\u0106!", "``\253```\253```\200\200\253```\253```\200\200``\253```\253```\200\200\253```\253```\200\200``\253```\253```\200\200\253```\253```\200\200``\253```\253```\200\200\253```\253```\200\200``\253```\253```\200\200\253```\253```\200\200``\253```\253```\200\200\253```\253```\200\200``\253```\253```\200\200\253```\253```\200\200``\253```\253```\200\200\253```\253```\200\200!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`~\200\200`~\200\200!!`~\200\200`~\200\200!!`~\200\200`~\200\200`~\200\200`~\200\200!!`~\200\200`~\200\200!!`~\200\200`~\200\200!" + "'", str2, "`~\200\200`~\200\200!!`~\200\200`~\200\200!!`~\200\200`~\200\200`~\200\200`~\200\200!!`~\200\200`~\200\200!!`~\200\200`~\200\200!");
    }

    @Test
    public void test07678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07678");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!", "U!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!!U!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL]U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test07679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07679");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!", "nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!" + "'", str2, "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!");
    }

    @Test
    public void test07680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07680");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ\275\276JJ!", "!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE!" + "'", str2, "\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE!");
    }

    @Test
    public void test07681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07681");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!", "EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!HHEE!!EE!!HHEE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!HHEE!!EE!!HHEE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!HHEE!!EE!!HHEE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!HHEE!!EE!!HHEE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!HHEE!!EE!!HHEE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!HHEE!!EE!!HHEE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!HHEE!!EE!!HHEE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!HHEE!!EE!!HH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!" + "'", str2, "!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!");
    }

    @Test
    public void test07682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07682");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!ZZZ!ZZZ!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test07683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07683");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnull]]!", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\276\276nullnullnullnullnullnullnullnull\276\276\253\253nullnullnullnullnullnullnullnull\276\276nullnullnullnullnullnullnullnull\276\276\253\253nullnullnullnullnullnullnullnull\276\276nullnullnullnullnullnullnullnull\276\276\253\253nullnullnullnullnullnullnullnull\276\276nullnullnullnullnullnullnullnull\276\276\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\276\276nullnullnullnullnullnullnullnull\276\276\253\253nullnullnullnullnullnullnullnull\276\276nullnullnullnullnullnullnullnull\276\276\253\253!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\200\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220]]!" + "'", str2, "\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\200\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220\u021d\u021e\u0220\u0220]]!");
    }

    @Test
    public void test07684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07684");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!~\223\223!~\223\223!!!~\223\223!~\223\223!!!~\223\223!~\223\223!~\223\223!~\223\223!!!~\223\223!~\223\223!!!~\223\223!~\223\223!", "L\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnullL\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnull!!L\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnullL\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnull!!L\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnullL\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnullL\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnullL\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnull!!L\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnullL\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnull!!L\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnullL\220nullnull\200~~L\220nullnull\200~~L\220nullnullL\220nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~\223\223!~\223\223!!!~\223\223!~\223\223!!!~\223\223!~\223\223!~\223\223!~\223\223!!!~\223\223!~\223\223!!!~\223\223!~\223\223!" + "'", str2, "!~\223\223!~\223\223!!!~\223\223!~\223\223!!!~\223\223!~\223\223!~\223\223!~\223\223!!!~\223\223!~\223\223!!!~\223\223!~\223\223!");
    }

    @Test
    public void test07685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07685");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u0346\u0348\u0348!", "null`nullnull`nullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test07686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07686");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~]]UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~]]UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~]]UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~]]UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~!" + "'", str2, "UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~]]UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~]]UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~]]UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~]]UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~UN~~!");
    }

    @Test
    public void test07687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07687");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!LLUU!", "\270null\270\270\270null\270\270!!\270null\270\270\270null\270\270!!\270null\270\270\270null\270\270!!\270null\270\270\270null\270\270!!\270null\270\270\270null\270\270!!\270null\270\270\270null\270\270!!\270null\270\270\270null\270\270!!\270null\270\270\270null\270\270!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LLLL!" + "'", str2, "!LLLL!");
    }

    @Test
    public void test07688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07688");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!", "!NNNNNNNNNNNNNNNN!!!NNNNNNNNNNNNNNNN!!!!!NNNNNNNNNNNNNNNN!!!NNNNNNNNNNNNNNNN!!!!!NNNNNNNNNNNNNNNN!!!NNNNNNNNNNNNNNNN!!!NNNNNNNNNNNNNNNN!!!NNNNNNNNNNNNNNNN!!!!!NNNNNNNNNNNNNNNN!!!NNNNNNNNNNNNNNNN!!!!!NNNNNNNNNNNNNNNN!!!NNNNNNNNNNNNNNNN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!" + "'", str2, "\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!");
    }

    @Test
    public void test07689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07689");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0!", "n\253uun\253\u035e\u035en\253uun\253\u035e\u035e!!!!n\253uun\253\u035e\u035en\253uun\253\u035e\u035e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull!" + "'", str2, "^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07690");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("`}nullnull`}nullnull`}nullnull`}nullnull`}nullnull!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull!" + "'", str2, "`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07691");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0345\u0346\u0348\u0348!", "\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320\u031d\u031e\u0320\u0320!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test07692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07692");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~LLUUL~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07693");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\300\300!!\300\300!!\300\300\300\300\300\300\300\300\300\300!!\300\300!!\300\300\300\300\300\300\300\300\300\300!!\300\300!!\300\300\300\300\300\300\300\300\300\300!!\300\300!!\300\300\300\300\300\300\300\300\300\300!!\300\300!!\300\300\300\300\300\300\300\300\300\300!!\300\300!!\300\300\300\300\300\300\300\300\300\300!!\300\300!!\300\300\300\300\300\300\300\300\300\300!!\300\300!!\300\300\300\300\300\300\300\300!", "\u0366\u0365\u0368\u0368!]!!!]!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07694");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fanullnull!", "!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa]]]]]]]]!" + "'", str2, "\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa]]]]]]]]!");
    }

    @Test
    public void test07695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07695");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0346\u0348\u0348\u0348\253\u0348\u0346\u0346!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\253\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\253\u0348\u0346\u0346!");
    }

    @Test
    public void test07696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07696");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214HFHHHFHHHHFFHHFFHFHHHFHHHHFFHHFF\214\214!", "LJ\225\225LJ\225\225LJ\225\225LJ\225\225LJ\225\225LJ\225\225LJ\225\225LJ\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\225J\225\225\225J\225\225\225\225JJ\225\225JJ\225J\225\225\225J\225\225\225\225JJ\225\225JJ\214\214\225J\225\225\225J\225\225\225\225JJ\225\225JJ\225J\225\225\225J\225\225\225\225JJ\225\225JJ\214\214\225J\225\225\225J\225\225\225\225JJ\225\225JJ\225J\225\225\225J\225\225\225\225JJ\225\225JJ\214\214\225J\225\225\225J\225\225\225\225JJ\225\225JJ\225J\225\225\225J\225\225\225\225JJ\225\225JJ\214\214\225J\225\225\225J\225\225\225\225JJ\225\225JJ\225J\225\225\225J\225\225\225\225JJ\225\225JJ\214\214\225J\225\225\225J\225\225\225\225JJ\225\225JJ\225J\225\225\225J\225\225\225\225JJ\225\225JJ\214\214\225J\225\225\225J\225\225\225\225JJ\225\225JJ\225J\225\225\225J\225\225\225\225JJ\225\225JJ\214\214\225J\225\225\225J\225\225\225\225JJ\225\225JJ\225J\225\225\225J\225\225\225\225JJ\225\225JJ\214\214!" + "'", str2, "\225J\225\225\225J\225\225\225\225JJ\225\225JJ\225J\225\225\225J\225\225\225\225JJ\225\225JJ\214\214\225J\225\225\225J\225\225\225\225JJ\225\225JJ\225J\225\225\225J\225\225\225\225JJ\225\225JJ\214\214\225J\225\225\225J\225\225\225\225JJ\225\225JJ\225J\225\225\225J\225\225\225\225JJ\225\225JJ\214\214\225J\225\225\225J\225\225\225\225JJ\225\225JJ\225J\225\225\225J\225\225\225\225JJ\225\225JJ\214\214\225J\225\225\225J\225\225\225\225JJ\225\225JJ\225J\225\225\225J\225\225\225\225JJ\225\225JJ\214\214\225J\225\225\225J\225\225\225\225JJ\225\225JJ\225J\225\225\225J\225\225\225\225JJ\225\225JJ\214\214\225J\225\225\225J\225\225\225\225JJ\225\225JJ\225J\225\225\225J\225\225\225\225JJ\225\225JJ\214\214\225J\225\225\225J\225\225\225\225JJ\225\225JJ\225J\225\225\225J\225\225\225\225JJ\225\225JJ\214\214!");
    }

    @Test
    public void test07697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07697");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256!", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256!" + "'", str2, "\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256!");
    }

    @Test
    public void test07698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07698");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!", "L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269!" + "'", str2, "\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269!");
    }

    @Test
    public void test07699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07699");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!\254UUUUUUUU!\254UUUUUUUU!!!!!!!!!\254UUUUUUUU!\254UUUUUUUU!!!!!!!!!\254UUUUUUUU!\254UUUUUUUU!!!!!!!!!\254UUUUUUUU!\254UUUUUUUU!!!!!!!!!\254UUUUUUUU!\254UUUUUUUU!!!!!!!!!\254UUUUUUUU!\254UUUUUUUU!!!!!!!!!\254UUUUUUUU!\254UUUUUUUU!!!!!!!!!\254UUUUUUUU!\254UUUUUUUU!!!!!!!!!", "\u0366\u0365\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!!!!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!!!!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!!!!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!!!!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!!!!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!!!!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!!!!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!!!!" + "'", str2, "!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!!!!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!!!!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!!!!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!!!!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!!!!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!!!!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!!!!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!\254\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!!!!");
    }

    @Test
    public void test07700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07700");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnullaanullnullaanullnullaanullnullaanullnullaanullnullaanullnullaanullnullaa!", "!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07701");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!~LNUULNUU!!!!~LNUULNUU!!!!!!~LNUULNUU!!!!~LNUULNUU!!!!!!~LNUULNUU!!!!~LNUULNUU!!!!~LNUULNUU!!!!~LNUULNUU!!!!!!~LNUULNUU!!!!~LNUULNUU!!!!!!~LNUULNUU!!!!~LNUULNUU!!!", "}~\200\200}~\200\200!^NN!^NN}~\200\200}~\200\200!^NN!^NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~N^}}N^}}!!!!~N^}}N^}}!!!!!!~N^}}N^}}!!!!~N^}}N^}}!!!!!!~N^}}N^}}!!!!~N^}}N^}}!!!!~N^}}N^}}!!!!~N^}}N^}}!!!!!!~N^}}N^}}!!!!~N^}}N^}}!!!!!!~N^}}N^}}!!!!~N^}}N^}}!!!" + "'", str2, "!!~N^}}N^}}!!!!~N^}}N^}}!!!!!!~N^}}N^}}!!!!~N^}}N^}}!!!!!!~N^}}N^}}!!!!~N^}}N^}}!!!!~N^}}N^}}!!!!~N^}}N^}}!!!!!!~N^}}N^}}!!!!~N^}}N^}}!!!!!!~N^}}N^}}!!!!~N^}}N^}}!!!");
    }

    @Test
    public void test07702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07702");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!!", "!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!HFFFFF!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FF!!FF!!FF!!FF!!\256\254\254FF!!FF!!FF!!FF!!\256\254\254!!FF!!FF!!FF!!FF!!\256\254\254FF!!FF!!FF!!FF!!\256\254\254!!FF!!FF!!FF!!FF!!\256\254\254FF!!FF!!FF!!FF!!\256\254\254!!FF!!FF!!FF!!FF!!\256\254\254FF!!FF!!FF!!FF!!\256\254\254!!FF!!FF!!FF!!FF!!\256\254\254FF!!FF!!FF!!FF!!\256\254\254!!FF!!FF!!FF!!FF!!\256\254\254FF!!FF!!FF!!FF!!\256\254\254!!FF!!FF!!FF!!FF!!\256\254\254FF!!FF!!FF!!FF!!\256\254\254!!FF!!FF!!FF!!FF!!\256\254\254FF!!FF!!FF!!FF!!\256\254\254!!!" + "'", str2, "FF!!FF!!FF!!FF!!\256\254\254FF!!FF!!FF!!FF!!\256\254\254!!FF!!FF!!FF!!FF!!\256\254\254FF!!FF!!FF!!FF!!\256\254\254!!FF!!FF!!FF!!FF!!\256\254\254FF!!FF!!FF!!FF!!\256\254\254!!FF!!FF!!FF!!FF!!\256\254\254FF!!FF!!FF!!FF!!\256\254\254!!FF!!FF!!FF!!FF!!\256\254\254FF!!FF!!FF!!FF!!\256\254\254!!FF!!FF!!FF!!FF!!\256\254\254FF!!FF!!FF!!FF!!\256\254\254!!FF!!FF!!FF!!FF!!\256\254\254FF!!FF!!FF!!FF!!\256\254\254!!FF!!FF!!FF!!FF!!\256\254\254FF!!FF!!FF!!FF!!\256\254\254!!!");
    }

    @Test
    public void test07703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07703");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230!", "!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!\220LUNNLUNN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230~}\200\200~}\200\200!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230~}\200\200~}\200\200!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230~}\200\200~}\200\200!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230~}\200\200~}\200\200!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230~}\200\200~}\200\200!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230~}\200\200~}\200\200!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230~}\200\200~}\200\200!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230!" + "'", str2, "~}\200\200~}\200\200!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230~}\200\200~}\200\200!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230~}\200\200~}\200\200!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230~}\200\200~}\200\200!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230~}\200\200~}\200\200!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230~}\200\200~}\200\200!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230~}\200\200~}\200\200!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230~}\200\200~}\200\200!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230!^!!!^!!!^!!!^!!!^!!!^!!!^!!!^!!\230\230!");
    }

    @Test
    public void test07704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07704");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256UULLUULLUULLUULLUULLUULLUULLUULL\253\254\256\256\253\254\256\256!", "\275!UUU!UUU!UUU\276!UUU\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnull\253\254\256\256\253\254\256\256RRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnull\253\254\256\256\253\254\256\256RRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnull\253\254\256\256\253\254\256\256RRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnull\253\254\256\256\253\254\256\256RRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnull\253\254\256\256\253\254\256\256RRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnull\253\254\256\256\253\254\256\256RRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnull\253\254\256\256\253\254\256\256RRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnull\253\254\256\256\253\254\256\256!" + "'", str2, "RRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnull\253\254\256\256\253\254\256\256RRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnull\253\254\256\256\253\254\256\256RRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnull\253\254\256\256\253\254\256\256RRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnull\253\254\256\256\253\254\256\256RRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnull\253\254\256\256\253\254\256\256RRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnull\253\254\256\256\253\254\256\256RRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnull\253\254\256\256\253\254\256\256RRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnullRRnullnull\253\254\256\256\253\254\256\256!");
    }

    @Test
    public void test07705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07705");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("hh!!hh!!!", "\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!!");
    }

    @Test
    public void test07706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07706");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\214\214UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\214\214UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\214\214UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\214\214UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\214\214UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\214\214UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\214\214UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\214\214!", "\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366\u0368\u0366\u0366!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\214\214NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\214\214NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\214\214NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\214\214NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\214\214NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\214\214NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\214\214NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\214\214!" + "'", str2, "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\214\214NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\214\214NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\214\214NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\214\214NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\214\214NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\214\214NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\214\214NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\214\214!");
    }

    @Test
    public void test07707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07707");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!", "\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL!!\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL!!\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL!!\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL!!\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL!!\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL!!\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL!!\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL\335ULL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!" + "'", str2, "!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!!``!!``!!!");
    }

    @Test
    public void test07708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07708");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("ELLLELLLELLLELLL\200}}`ELLLELLLELLLELLL]]!", "!!~u!llu!llu!llu!llu!llu!llu!llu!ll!!!!~u!llu!llu!llu!llu!llu!llu!llu!ll!!!!!!~u!llu!llu!llu!llu!llu!llu!llu!ll!!!!~u!llu!llu!llu!llu!llu!llu!llu!ll!!!!!!~u!llu!llu!llu!llu!llu!llu!llu!ll!!!!~u!llu!llu!llu!llu!llu!llu!llu!ll!!!!~u!llu!llu!llu!llu!llu!llu!llu!ll!!!!~u!llu!llu!llu!llu!llu!llu!llu!ll!!!!!!~u!llu!llu!llu!llu!llu!llu!llu!ll!!!!~u!llu!llu!llu!llu!llu!llu!llu!ll!!!!!!~u!llu!llu!llu!llu!llu!llu!llu!ll!!!!~u!llu!llu!llu!llu!llu!llu!llu!ll!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!UUU!UUU!UUU!UUU\200}}`!UUU!UUU!UUU!UUU]]!" + "'", str2, "!UUU!UUU!UUU!UUU\200}}`!UUU!UUU!UUU!UUU]]!");
    }

    @Test
    public void test07709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07709");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07710");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!U\336LLU\336LLLLU\336LLU\336LLLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07711");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LNLLLNLL!!LNLLLNLL!!LNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!", "!\253\256\256]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh]nullhh!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u012e\u012b\u012e\u012e\u012e\u012b\u012e\u012e\u012e\u012b\u012e\u012e\u012e\u012b\u012e\u012e\u012e\u012b\u012e\u012e\u012e\u012b\u012e\u012e\u012e\u012b\u012e\u012e\u012e\u012b\u012e\u012e\u012e\u012b\u012e\u012e\u012e\u012b\u012e\u012e\u012e\u012b\u012e\u012e\u012e\u012b\u012e\u012e!" + "'", str2, "\u012e\u012b\u012e\u012e\u012e\u012b\u012e\u012e\u012e\u012b\u012e\u012e\u012e\u012b\u012e\u012e\u012e\u012b\u012e\u012e\u012e\u012b\u012e\u012e\u012e\u012b\u012e\u012e\u012e\u012b\u012e\u012e\u012e\u012b\u012e\u012e\u012e\u012b\u012e\u012e\u012e\u012b\u012e\u012e\u012e\u012b\u012e\u012e!");
    }

    @Test
    public void test07712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07712");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\253\254\256\256LNUULNUULNUULNUU\253\254\256\256LNUULNUU!", "^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN^```^```^```^```^```^```^```^```^```^```NNNNNNNN^```^```NNNNNNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256``^^``^^``^^``^^\253\254\256\256``^^``^^!" + "'", str2, "\253\254\256\256``^^``^^``^^``^^\253\254\256\256``^^``^^!");
    }

    @Test
    public void test07713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07713");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!!!!!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!!!!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!!!!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!!!!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!!!!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!!!!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!!!!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!!!!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!!!!!!" + "'", str2, "NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!!!!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!!!!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!!!!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!!!!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!!!!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!!!!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!!!!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!!!NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN!!!!!!!");
    }

    @Test
    public void test07714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07714");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("L~JJL~JJ!!L~JJL~JJ!!L~JJL~JJL~JJL~JJ!!L~JJL~JJ!!L~JJL~JJ!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnull!nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L~UUL~UU!!L~UUL~UU!!L~UUL~UUL~UUL~UU!!L~UUL~UU!!L~UUL~UU!" + "'", str2, "L~UUL~UU!!L~UUL~UU!!L~UUL~UUL~UUL~UU!!L~UUL~UU!!L~UUL~UU!");
    }

    @Test
    public void test07715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07715");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!~nullnull!~nullnull\220\220!~nullnull!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220!~nullnull!~nullnull\220\220!~nullnull!~nullnull\220\220!", "\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254\u0112\u0114\u0114\u0114\256\254\254!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~\254\256\256\256\254\256\256\256!~\254\256\256\256\254\256\256\256\220\220!~\254\256\256\256\254\256\256\256!~\254\256\256\256\254\256\256\256\220\220\220!~\254\256\256\256\254\256\256\256\220\220\220!~\254\256\256\256\254\256\256\256\220\220\220!~\254\256\256\256\254\256\256\256\220\220\220!~\254\256\256\256\254\256\256\256\220\220!~\254\256\256\256\254\256\256\256!~\254\256\256\256\254\256\256\256\220\220!~\254\256\256\256\254\256\256\256!~\254\256\256\256\254\256\256\256\220\220!" + "'", str2, "!~\254\256\256\256\254\256\256\256!~\254\256\256\256\254\256\256\256\220\220!~\254\256\256\256\254\256\256\256!~\254\256\256\256\254\256\256\256\220\220\220!~\254\256\256\256\254\256\256\256\220\220\220!~\254\256\256\256\254\256\256\256\220\220\220!~\254\256\256\256\254\256\256\256\220\220\220!~\254\256\256\256\254\256\256\256\220\220!~\254\256\256\256\254\256\256\256!~\254\256\256\256\254\256\256\256\220\220!~\254\256\256\256\254\256\256\256!~\254\256\256\256\254\256\256\256\220\220!");
    }

    @Test
    public void test07716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07716");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\311\314\314\314\311\314\314\314\311\314\314\314\311\314\314\314\311\314\314\314\311\314\314\314\311\314\314\314\311\314\314\314!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368!\314\314\314\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368!\314\314\314\u0346\u0348\u0348!");
    }

    @Test
    public void test07717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07717");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269\u0269!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07718");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u01a0!!!\200\u01a0!!!]]!", "\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!!!\200}}`null!!!]]!" + "'", str2, "null!!!\200}}`null!!!]]!");
    }

    @Test
    public void test07719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07719");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("H\200\200\200H\200\200\200]]H\200\200\200H\200\200\200]]H\200\200\200H\200\200\200]]H\200\200\200H\200\200\200]]~}}^H\200\200\200H\200\200\200]]H\200\200\200H\200\200\200]]H\200\200\200H\200\200\200]]H\200\200\200H\200\200\200]]]]!", "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\200\200\200null\200\200\200]]null\200\200\200null\200\200\200]]null\200\200\200null\200\200\200]]null\200\200\200null\200\200\200]]~}}^null\200\200\200null\200\200\200]]null\200\200\200null\200\200\200]]null\200\200\200null\200\200\200]]null\200\200\200null\200\200\200]]]]!" + "'", str2, "null\200\200\200null\200\200\200]]null\200\200\200null\200\200\200]]null\200\200\200null\200\200\200]]null\200\200\200null\200\200\200]]~}}^null\200\200\200null\200\200\200]]null\200\200\200null\200\200\200]]null\200\200\200null\200\200\200]]null\200\200\200null\200\200\200]]]]!");
    }

    @Test
    public void test07720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07720");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!\200\200\u0346\u0348\u0348!", "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test07721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07721");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NNnullnull!!NN!!NNnullnull!", "\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!\330\273\273\273\273null\270\270\273null\270\270!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!" + "'", str2, "!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!U!!!U!!!!UU!!UU!U!!!U!!!");
    }

    @Test
    public void test07722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07722");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275nmppnmppnmpp\275nmppnmppnmpp\275nmppnmppnmpp\275nmppnmppnmppnmppnmpp\275\275nmppnmpp\275\275nmppnmpp\275\275nmppnmpp\275\275\275nmppnmppnmpp\275nmppnmppnmpp\275nmppnmppnmpp\275nmppnmppnmppnmppnmpp\275\275nmppnmpp\275\275!", "\275\u0126\u0128\u0128\u0126\u0128\u0128\200\200\u0126\u0128\u0128\u0126\u0128\u0128\200\200\u0126\u0128\u0128\u0126\u0128\u0128\200\200\276\u0126\u0128\u0128\u0126\u0128\u0128\200\200\275\275!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\233nullnullnull\233nullnullnull\233nullnullnull\275\233nullnullnull\233nullnullnull\233nullnullnull\275\233nullnullnull\233nullnullnull\233nullnullnull\275\233nullnullnull\233nullnullnull\233nullnullnull\233nullnullnull\233nullnullnull\275\275\233nullnullnull\233nullnullnull\275\275\233nullnullnull\233nullnullnull\275\275\233nullnullnull\233nullnullnull\275\275\275\233nullnullnull\233nullnullnull\233nullnullnull\275\233nullnullnull\233nullnullnull\233nullnullnull\275\233nullnullnull\233nullnullnull\233nullnullnull\275\233nullnullnull\233nullnullnull\233nullnullnull\233nullnullnull\233nullnullnull\275\275\233nullnullnull\233nullnullnull\275\275!" + "'", str2, "\275\233nullnullnull\233nullnullnull\233nullnullnull\275\233nullnullnull\233nullnullnull\233nullnullnull\275\233nullnullnull\233nullnullnull\233nullnullnull\275\233nullnullnull\233nullnullnull\233nullnullnull\233nullnullnull\233nullnullnull\275\275\233nullnullnull\233nullnullnull\275\275\233nullnullnull\233nullnullnull\275\275\233nullnullnull\233nullnullnull\275\275\275\233nullnullnull\233nullnullnull\233nullnullnull\275\233nullnullnull\233nullnullnull\233nullnullnull\275\233nullnullnull\233nullnullnull\233nullnullnull\275\233nullnullnull\233nullnullnull\233nullnullnull\233nullnullnull\233nullnullnull\275\275\233nullnullnull\233nullnullnull\275\275!");
    }

    @Test
    public void test07723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07723");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!~\223\223!~\223\223!!!~\223\223!~\223\223!!!~\223\223!~\223\223!~\223\223!~\223\223!!!~\223\223!~\223\223!!!~\223\223!~\223\223!", "\275``uuuuuuuu``uuuuuuuu``uuuuuuuu\276``uuuuuuuu\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~\223\223!~\223\223!!!~\223\223!~\223\223!!!~\223\223!~\223\223!~\223\223!~\223\223!!!~\223\223!~\223\223!!!~\223\223!~\223\223!" + "'", str2, "!~\223\223!~\223\223!!!~\223\223!~\223\223!!!~\223\223!~\223\223!~\223\223!~\223\223!!!~\223\223!~\223\223!!!~\223\223!~\223\223!");
    }

    @Test
    public void test07724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07724");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!NLL!NLL!!!NLL!NLL!!!", "\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\276\276\276!\276\276\276!!!\276\276\276!\276\276\276!!!" + "'", str2, "!\276\276\276!\276\276\276!!!\276\276\276!\276\276\276!!!");
    }

    @Test
    public void test07725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07725");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!", "SSSS!!!SSSS!!!SSSS!!!SSSS!!!SSSS!!!SSSS!!!SSSS!!!SSSS!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!" + "'", str2, "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!");
    }

    @Test
    public void test07726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07726");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0123\u0124\u0126\u0126\213\213\213\u0346\u0348\u0348!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368nullnullnullnull\213\213\213\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368nullnullnullnull\213\213\213\u0346\u0348\u0348!");
    }

    @Test
    public void test07727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07727");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!", "l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230\200}}`l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230l!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nnl!nn\225\230\230]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276!!!" + "'", str2, "\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276\u0279\u0276\u0276!!!");
    }

    @Test
    public void test07728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07728");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da!", "\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c\u037c\u037e\u037c\u037c!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da!" + "'", str2, "\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02d7\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da\u02da!");
    }

    @Test
    public void test07729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07729");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!\275nullnullnullnullnullnullnullnullnullnullnull!!!!!!!", "\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!!!\275LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!!!!!\275LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!!!\275LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!!!!!\275LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!!!\275LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!!!!!\275LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!!!\275LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!!!!!\275LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!!!\275LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!!!!!\275LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!!!\275LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!!!!!\275LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!!!\275LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!!!!!\275LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!!!\275LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!!!!!!" + "'", str2, "\275LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!!!\275LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!!!!!\275LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!!!\275LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!!!!!\275LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!!!\275LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!!!!!\275LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!!!\275LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!!!!!\275LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!!!\275LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!!!!!\275LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!!!\275LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!!!!!\275LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!!!\275LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!!!!!\275LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!!!\275LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!!!!!!");
    }

    @Test
    public void test07730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07730");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XXXX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XX\275\275XXX\275\275XXXXX\275\275XX!", "LUUULUUULUUULUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUULUUULUUULUUULUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UU!" + "'", str2, "UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UUUU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UU\275\275UUU\275\275UUUUU\275\275UU!");
    }

    @Test
    public void test07731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07731");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NLLLNLLLnullnullnullnullnullnullnullnullNLLLNLLLnullnullnullnullnullnullnullnullNLLLNLLLnullnullnullnullnullnullnullnullNLLLNLLLnullnullnullnullnullnullnullnullNLLLNLLLnullnullnullnullnullnullnullnullNLLLNLLLnullnullnullnullnullnullnullnullNLLLNLLLnullnullnullnullnullnullnullnullNLLLNLLLnullnullnullnullnullnullnullnull!", "\u0366\u0365\u0368\u0368nullnull!!nullnull!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LLL!LLL!lll!lll!lll!lll!lll!lll!lll!lll!LLL!LLL!lll!lll!lll!lll!lll!lll!lll!lll!LLL!LLL!lll!lll!lll!lll!lll!lll!lll!lll!LLL!LLL!lll!lll!lll!lll!lll!lll!lll!lll!LLL!LLL!lll!lll!lll!lll!lll!lll!lll!lll!LLL!LLL!lll!lll!lll!lll!lll!lll!lll!lll!LLL!LLL!lll!lll!lll!lll!lll!lll!lll!lll!LLL!LLL!lll!lll!lll!lll!lll!lll!lll!lll!" + "'", str2, "!LLL!LLL!lll!lll!lll!lll!lll!lll!lll!lll!LLL!LLL!lll!lll!lll!lll!lll!lll!lll!lll!LLL!LLL!lll!lll!lll!lll!lll!lll!lll!lll!LLL!LLL!lll!lll!lll!lll!lll!lll!lll!lll!LLL!LLL!lll!lll!lll!lll!lll!lll!lll!lll!LLL!LLL!lll!lll!lll!lll!lll!lll!lll!lll!LLL!LLL!lll!lll!lll!lll!lll!lll!lll!lll!LLL!LLL!lll!lll!lll!lll!lll!lll!lll!lll!");
    }

    @Test
    public void test07732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07732");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0225\u0228\u0228\u0228\u0225\u0228\u0228\u0228\u0225\u0228\u0228\u0228\u0225\u0228\u0228\u0228\u0225\u0228\u0228\u0228\u0225\u0228\u0228\u0228\u0225\u0228\u0228\u0228\u0225\u0228\u0228\u0228!", "nullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HHnullnull!!HH!!HH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!" + "'", str2, "NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!");
    }

    @Test
    public void test07733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07733");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE\275\276EE!", "\u0199\u0199\220nullnull\200\u0199\u0199\220nullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull!" + "'", str2, "\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull!");
    }

    @Test
    public void test07734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07734");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!eeeeeeeeeeeeeeee!", "!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!!!!L!~~L!~~!!L!~~L!~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LLLLLLLLLLLLLLLL!" + "'", str2, "!LLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test07735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07735");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226!!\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226\312\316\316\316\230\226\226!!!", "\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\275\276\u01c6\u01c9\u01c9\u01c6\u01c9\u01c9\225\225!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226!!!" + "'", str2, "\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226\u01c7\u01c7\u01c7\u01c7\230\226\226!!!");
    }

    @Test
    public void test07736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07736");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UU!!UU!!!", "NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN\200}}`NLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNN]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NN!!NN!!!" + "'", str2, "NN!!NN!!!");
    }

    @Test
    public void test07737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07737");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\230LLL!\230LLL\230LLL\230LLL\230LLL!!\230LLL\230LLL!!\230LLL\230LLL!!\230LLL\230LLL!!\230LLL!\230LLL\230LLL\230LLL\230LLL!!\230LLL\230LLL!!!", "\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\200\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\u01e0\u01e0\u01e0!\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0!!\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0!!\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0!!\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0!!\230\u01e0\u01e0\u01e0!\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0!!\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0!!!" + "'", str2, "\230\u01e0\u01e0\u01e0!\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0!!\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0!!\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0!!\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0!!\230\u01e0\u01e0\u01e0!\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0!!\230\u01e0\u01e0\u01e0\230\u01e0\u01e0\u01e0!!!");
    }

    @Test
    public void test07738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07738");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]nullnull!!!!\275]nullnull!!!!]nullnull!!!!]nullnull!!!!\275]nullnull!!!!]nullnull!!!!]nullnull!!!!\275]nullnull!!!!]nullnull!!!!]nullnull!!!!\275]nullnull!!!!]nullnull!!!!]nullnull!!!!\275]nullnull!!!!]nullnull!!!!]nullnull!!!!\275]nullnull!!!!]nullnull!!!!]nullnull!!!!\275]nullnull!!!!]nullnull!!!!]nullnull!!!!\275\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e]nullnull!!!!\275]nullnull!!!!]nullnull!!!!]nullnull!!!!\275]nullnull!!!!]nullnull!!!!]nullnull!!!!\275]nullnull!!!!]nullnull!!!!]nullnull!!!!\275]nullnull!!!!]nullnull!!!!]nullnull!!!!\275]nullnull!!!!]nullnull!!!!]nullnull!!!!\275]nullnull!!!!]nullnull!!!!]nullnull!!!!\275]nullnull!!!!]nullnull!!!!]nullnull!!!!\275\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e!" + "'", str2, "]nullnull!!!!\275]nullnull!!!!]nullnull!!!!]nullnull!!!!\275]nullnull!!!!]nullnull!!!!]nullnull!!!!\275]nullnull!!!!]nullnull!!!!]nullnull!!!!\275]nullnull!!!!]nullnull!!!!]nullnull!!!!\275]nullnull!!!!]nullnull!!!!]nullnull!!!!\275]nullnull!!!!]nullnull!!!!]nullnull!!!!\275]nullnull!!!!]nullnull!!!!]nullnull!!!!\275\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e]nullnull!!!!\275]nullnull!!!!]nullnull!!!!]nullnull!!!!\275]nullnull!!!!]nullnull!!!!]nullnull!!!!\275]nullnull!!!!]nullnull!!!!]nullnull!!!!\275]nullnull!!!!]nullnull!!!!]nullnull!!!!\275]nullnull!!!!]nullnull!!!!]nullnull!!!!\275]nullnull!!!!]nullnull!!!!]nullnull!!!!\275]nullnull!!!!]nullnull!!!!]nullnull!!!!\275\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e!");
    }

    @Test
    public void test07739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07739");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\336~\300\300\336~\300\300!!\336~\300\300\336~\300\300!!\336~\300\300\336~\300\300\336~\300\300\336~\300\300!!\336~\300\300\336~\300\300!!\336~\300\300\336~\300\300!", "!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!\276\275\275!L~~!!L~~!L~~!L~~!L~~!\276\275\275!L~~!!L~~!L~~!L~~!L~~!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnullnull~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnull!" + "'", str2, "null~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnullnull~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnull!");
    }

    @Test
    public void test07740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07740");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\276V\275\275\276V\275\275\276V\275\275\276V\275\275\276V\275\275\276V\275\275\276V\275\275\276V\275\275!", "\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\u01e0\275\275\276\u01e0\275\275\276\u01e0\275\275\276\u01e0\275\275\276\u01e0\275\275\276\u01e0\275\275\276\u01e0\275\275\276\u01e0\275\275!" + "'", str2, "\276\u01e0\275\275\276\u01e0\275\275\276\u01e0\275\275\276\u01e0\275\275\276\u01e0\275\275\276\u01e0\275\275\276\u01e0\275\275\276\u01e0\275\275!");
    }

    @Test
    public void test07741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07741");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\253LNN\253LNN\253\253\253LNN\253LNN\253\253!!\253LNN\253LNN\253\253\253LNN\253LNN\253\253!!\253LNN\253LNN\253\253\253LNN\253LNN\253\253!!\253LNN\253LNN\253\253\253LNN\253LNN\253\253!!\253LNN\253LNN\253\253\253LNN\253LNN\253\253!!\253LNN\253LNN\253\253\253LNN\253LNN\253\253!!\253LNN\253LNN\253\253\253LNN\253LNN\253\253!!\253LNN\253LNN\253\253\253LNN\253LNN\253\253!!!", "\255\256\260\260\236\276\276\255\256\260\260\236\276\276!!\255\256\260\260\236\276\276\255\256\260\260\236\276\276!!\255\256\260\260\236\276\276\255\256\260\260\236\276\276\255\256\260\260\236\276\276\255\256\260\260\236\276\276!!\255\256\260\260\236\276\276\255\256\260\260\236\276\276!!\255\256\260\260\236\276\276\255\256\260\260\236\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\236\276\276\253\236\276\276\253\253\253\236\276\276\253\236\276\276\253\253!!\253\236\276\276\253\236\276\276\253\253\253\236\276\276\253\236\276\276\253\253!!\253\236\276\276\253\236\276\276\253\253\253\236\276\276\253\236\276\276\253\253!!\253\236\276\276\253\236\276\276\253\253\253\236\276\276\253\236\276\276\253\253!!\253\236\276\276\253\236\276\276\253\253\253\236\276\276\253\236\276\276\253\253!!\253\236\276\276\253\236\276\276\253\253\253\236\276\276\253\236\276\276\253\253!!\253\236\276\276\253\236\276\276\253\253\253\236\276\276\253\236\276\276\253\253!!\253\236\276\276\253\236\276\276\253\253\253\236\276\276\253\236\276\276\253\253!!!" + "'", str2, "\253\236\276\276\253\236\276\276\253\253\253\236\276\276\253\236\276\276\253\253!!\253\236\276\276\253\236\276\276\253\253\253\236\276\276\253\236\276\276\253\253!!\253\236\276\276\253\236\276\276\253\253\253\236\276\276\253\236\276\276\253\253!!\253\236\276\276\253\236\276\276\253\253\253\236\276\276\253\236\276\276\253\253!!\253\236\276\276\253\236\276\276\253\253\253\236\276\276\253\236\276\276\253\253!!\253\236\276\276\253\236\276\276\253\253\253\236\276\276\253\236\276\276\253\253!!\253\236\276\276\253\236\276\276\253\253\253\236\276\276\253\236\276\276\253\253!!\253\236\276\276\253\236\276\276\253\253\253\236\276\276\253\236\276\276\253\253!!!");
    }

    @Test
    public void test07742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07742");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u0317\u031a\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u0317\u031a\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u0317\u031a\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0\u0317\u031a\u03de\u03dd\u03e0\u03e0\u03de\u03dd\u03e0\u03e0!", "\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0317\u031a\u0317\u031a\u0317\u031a\u0317\u031anullnullnullnullnullnullnullnull!" + "'", str2, "\u0317\u031a\u0317\u031a\u0317\u031a\u0317\u031anullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07743");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!", "\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\250\250\250\250\250\250\250\250\246~~\250\246~~\250\250\250\250\250\250\250\250\250\246~~\250\246~~!" + "'", str2, "\250\250\250\250\250\250\250\250\250\246~~\250\246~~\250\250\250\250\250\250\250\250\250\246~~\250\246~~!");
    }

    @Test
    public void test07744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07744");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!LLLnullnullnull\256\254\254!LLLnullnullnull\256\254\254!!!LLLnullnullnull\256\254\254!LLLnullnullnull\256\254\254!!!LLLnullnullnull\256\254\254!LLLnullnullnull\256\254\254!!!LLLnullnullnull\256\254\254!LLLnullnullnull\256\254\254!!!LLLnullnullnull\256\254\254!LLLnullnullnull\256\254\254!!!LLLnullnullnull\256\254\254!LLLnullnullnull\256\254\254!!!LLLnullnullnull\256\254\254!LLLnullnullnull\256\254\254!!!LLLnullnullnull\256\254\254!LLLnullnullnull\256\254\254!!!", "NLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNN\214\214NLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNN\214\214NLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNN\214\214NLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNN\214\214NLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNN\214\214NLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNN\214\214NLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNN\214\214NLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNN\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LLLLLLLLLLLLLLL\256\254\254!LLLLLLLLLLLLLLL\256\254\254!!!LLLLLLLLLLLLLLL\256\254\254!LLLLLLLLLLLLLLL\256\254\254!!!LLLLLLLLLLLLLLL\256\254\254!LLLLLLLLLLLLLLL\256\254\254!!!LLLLLLLLLLLLLLL\256\254\254!LLLLLLLLLLLLLLL\256\254\254!!!LLLLLLLLLLLLLLL\256\254\254!LLLLLLLLLLLLLLL\256\254\254!!!LLLLLLLLLLLLLLL\256\254\254!LLLLLLLLLLLLLLL\256\254\254!!!LLLLLLLLLLLLLLL\256\254\254!LLLLLLLLLLLLLLL\256\254\254!!!LLLLLLLLLLLLLLL\256\254\254!LLLLLLLLLLLLLLL\256\254\254!!!" + "'", str2, "!LLLLLLLLLLLLLLL\256\254\254!LLLLLLLLLLLLLLL\256\254\254!!!LLLLLLLLLLLLLLL\256\254\254!LLLLLLLLLLLLLLL\256\254\254!!!LLLLLLLLLLLLLLL\256\254\254!LLLLLLLLLLLLLLL\256\254\254!!!LLLLLLLLLLLLLLL\256\254\254!LLLLLLLLLLLLLLL\256\254\254!!!LLLLLLLLLLLLLLL\256\254\254!LLLLLLLLLLLLLLL\256\254\254!!!LLLLLLLLLLLLLLL\256\254\254!LLLLLLLLLLLLLLL\256\254\254!!!LLLLLLLLLLLLLLL\256\254\254!LLLLLLLLLLLLLLL\256\254\254!!!LLLLLLLLLLLLLLL\256\254\254!LLLLLLLLLLLLLLL\256\254\254!!!");
    }

    @Test
    public void test07745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07745");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("TQTTTQTT!!TQTTTQTT!!TQTTTQTT!!TQTTTQTT!!TQTTTQTT!!TQTTTQTT!!TQTTTQTT!!TQTTTQTT!!!", "\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!!" + "'", str2, "\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!\230\215\230\230\230\215\230\230!!!");
    }

    @Test
    public void test07746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07746");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnull!", "!~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07747");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!nullnull}}nullnull}}!!!", "\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL\276UNLLUNLLUNLLUNLL\266\266~UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "N\276LLN\276LL}}N\276LLN\276LL}}!!N\276LLN\276LL}}N\276LLN\276LL}}!!N\276LLN\276LL}}N\276LLN\276LL}}!!N\276LLN\276LL}}N\276LLN\276LL}}!!N\276LLN\276LL}}N\276LLN\276LL}}!!N\276LLN\276LL}}N\276LLN\276LL}}!!N\276LLN\276LL}}N\276LLN\276LL}}!!N\276LLN\276LL}}N\276LLN\276LL}}!!!" + "'", str2, "N\276LLN\276LL}}N\276LLN\276LL}}!!N\276LLN\276LL}}N\276LLN\276LL}}!!N\276LLN\276LL}}N\276LLN\276LL}}!!N\276LLN\276LL}}N\276LLN\276LL}}!!N\276LLN\276LL}}N\276LLN\276LL}}!!N\276LLN\276LL}}N\276LLN\276LL}}!!N\276LLN\276LL}}N\276LLN\276LL}}!!N\276LLN\276LL}}N\276LLN\276LL}}!!!");
    }

    @Test
    public void test07748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07748");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UUUUUUUU!!UUUUUUUU!!UUUUUUUUUUUUUUUU!!UUUUUUUU!!UUUUUUUU!", "!\253\256\256]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU]!\225\225\225UU!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\225\225\225\225\225\225\225\225!!\225\225\225\225\225\225\225\225!!\225\225\225\225\225\225\225\225\225\225\225\225\225\225\225\225!!\225\225\225\225\225\225\225\225!!\225\225\225\225\225\225\225\225!" + "'", str2, "\225\225\225\225\225\225\225\225!!\225\225\225\225\225\225\225\225!!\225\225\225\225\225\225\225\225\225\225\225\225\225\225\225\225!!\225\225\225\225\225\225\225\225!!\225\225\225\225\225\225\225\225!");
    }

    @Test
    public void test07749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07749");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("HHFFFHHHFHHHFHHHHHFFFHHHFHHHFHHHHHFFFHHHFHHHFHHHHHFFFHHHFHHHFHHHHHFFFHHHFHHHFHHHHHFFFHHHFHHHFHHHHHFFFHHHFHHHFHHHHHFFFHHHFHHHFHHH!", "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UULLLUUULUUULUUUUULLLUUULUUULUUUUULLLUUULUUULUUUUULLLUUULUUULUUUUULLLUUULUUULUUUUULLLUUULUUULUUUUULLLUUULUUULUUUUULLLUUULUUULUUU!" + "'", str2, "UULLLUUULUUULUUUUULLLUUULUUULUUUUULLLUUULUUULUUUUULLLUUULUUULUUUUULLLUUULUUULUUUUULLLUUULUUULUUUUULLLUUULUUULUUUUULLLUUULUUULUUU!");
    }

    @Test
    public void test07750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07750");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("U!VVU!VVLLU!VVU!VVLLU!VVU!VVLLU!VVU!VVLLU!VVU!VVLLU!VVU!VVLLU!VVU!VVLLU!VVU!VVLL!", "NUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNNNUNNNUNNNNNUNNNUNNNNNUNNNUNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "N!UUN!UUUUN!UUN!UUUUN!UUN!UUUUN!UUN!UUUUN!UUN!UUUUN!UUN!UUUUN!UUN!UUUUN!UUN!UUUU!" + "'", str2, "N!UUN!UUUUN!UUN!UUUUN!UUN!UUUUN!UUN!UUUUN!UUN!UUUUN!UUN!UUUUN!UUN!UUUUN!UUN!UUUU!");
    }

    @Test
    public void test07751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07751");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!nll!nll!!!nll!nll!!!nll!nll!nll!nll!nll!nll!nll!nll!", "\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!" + "'", str2, "!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!!!\213\213!!\213\213!!!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!");
    }

    @Test
    public void test07752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07752");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214!", "\275!JLL!JLL!JLL\275!JLL!JLL!JLL\275!JLL!JLL!JLL\275!JLL!JLL!JLL!JLL!JLL\275\275!JLL!JLL\275\275!JLL!JLL\275\275!JLL!JLL\275\275\275!JLL!JLL!JLL\275!JLL!JLL!JLL\275!JLL!JLL!JLL\275!JLL!JLL!JLL!JLL!JLL\275\275!JLL!JLL\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214!");
    }

    @Test
    public void test07753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07753");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("U!LLLLLU!LLLLLLLU!LLLLLU!LLLLLLLU!LLLLLU!LLLLLLLU!LLLLLU!LLLLLLLU!LLLLLU!LLLLLLLU!LLLLLU!LLLLLLLU!LLLLLU!LLLLLLLU!LLLLLU!LLLLLLL!", "\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254\256\254\254\254!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnullnullnullnull!nullnullnullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnullnullnull!" + "'", str2, "null!nullnullnullnullnullnull!nullnullnullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnullnullnull!");
    }

    @Test
    public void test07754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07754");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NLLLNLLLNLLLNLLLNNNNNNNNNNNNNLLLNLLLNLLLNLLLNNNNNNNNNNNNNLLLNLLLNLLLNLLLNNNNNNNNNNNNNLLLNLLLNLLLNLLLNNNNNNNNNNNNNLLLNLLLNLLLNLLLNNNNNNNNNNNNNLLLNLLLNLLLNLLLNNNNNNNNNNNNNLLLNLLLNLLLNLLLNNNNNNNNNNNNNLLLNLLLNLLLNLLLNNNNNNNNNNNN!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test07755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07755");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!xxxxxxxx!!!", "\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!!" + "'", str2, "FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!!");
    }

    @Test
    public void test07756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07756");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!", "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!!!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!!!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!!!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!!!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!!!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!!!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!!!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!!!" + "'", str2, "!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!!!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!!!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!!!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!!!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!!!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!!!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!!!EEE!EEE!EEE!EEE!EEE!EEE!EEE!EEE!!!");
    }

    @Test
    public void test07757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07757");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!" + "'", str2, "!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!!!!```!");
    }

    @Test
    public void test07758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07758");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!", "\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u02d5\u02d6\u02d8\u02d8\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245\u0245!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200!!!!!" + "'", str2, "\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200\u02d6!\200\200!!!!!");
    }

    @Test
    public void test07759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07759");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\200}}`\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!]]!", "\u0317\u031a\u0317\u031a\u0317\u031a\u0317\u031aU`UUU`UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\200}}`\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!]]!" + "'", str2, "\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\200}}`\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!]]!");
    }

    @Test
    public void test07760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07760");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!", "LNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNNLNNNLNNNNLNNNLNN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\340null\336\336\340null\336\336\340null\336\336\u0348\u0348\253\340null\336\336\340null\336\336\340null\336\336\u0348\u0348!!\253\340null\336\336\340null\336\336\340null\336\336\u0348\u0348\253\340null\336\336\340null\336\336\340null\336\336\u0348\u0348!!\253\340null\336\336\340null\336\336\340null\336\336\u0348\u0348\253\340null\336\336\340null\336\336\340null\336\336\u0348\u0348\253\340null\336\336\340null\336\336\340null\336\336\u0348\u0348\253\340null\336\336\340null\336\336\340null\336\336\u0348\u0348!!\253\340null\336\336\340null\336\336\340null\336\336\u0348\u0348\253\340null\336\336\340null\336\336\340null\336\336\u0348\u0348!!\253\340null\336\336\340null\336\336\340null\336\336\u0348\u0348\253\340null\336\336\340null\336\336\340null\336\336\u0348\u0348!" + "'", str2, "\253\340null\336\336\340null\336\336\340null\336\336\u0348\u0348\253\340null\336\336\340null\336\336\340null\336\336\u0348\u0348!!\253\340null\336\336\340null\336\336\340null\336\336\u0348\u0348\253\340null\336\336\340null\336\336\340null\336\336\u0348\u0348!!\253\340null\336\336\340null\336\336\340null\336\336\u0348\u0348\253\340null\336\336\340null\336\336\340null\336\336\u0348\u0348\253\340null\336\336\340null\336\336\340null\336\336\u0348\u0348\253\340null\336\336\340null\336\336\340null\336\336\u0348\u0348!!\253\340null\336\336\340null\336\336\340null\336\336\u0348\u0348\253\340null\336\336\340null\336\336\340null\336\336\u0348\u0348!!\253\340null\336\336\340null\336\336\340null\336\336\u0348\u0348\253\340null\336\336\340null\336\336\340null\336\336\u0348\u0348!");
    }

    @Test
    public void test07761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07761");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UULLUULLUULLUULLUULLUULLUULLUULL\214\214UULLUULLUULLUULLUULLUULLUULLUULL\214\214UULLUULLUULLUULLUULLUULLUULLUULL\214\214UULLUULLUULLUULLUULLUULLUULLUULL\214\214UULLUULLUULLUULLUULLUULLUULLUULL\214\214UULLUULLUULLUULLUULLUULLUULLUULL\214\214UULLUULLUULLUULLUULLUULLUULLUULL\214\214UULLUULLUULLUULLUULLUULLUULLUULL\214\214!", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\214\214XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\214\214XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\214\214XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\214\214XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\214\214XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\214\214XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\214\214XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\214\214!" + "'", str2, "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\214\214XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\214\214XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\214\214XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\214\214XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\214\214XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\214\214XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\214\214XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\214\214!");
    }

    @Test
    public void test07762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07762");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!" + "'", str2, "!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!");
    }

    @Test
    public void test07763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07763");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS!!!", "\u014e\u014e\u014e\u014e\u014e\u014e\200\u014e\u014e\u014e\u014e\u014e\u014e\200\u014e\u014e\u014e\u014e\u014e\u014e\200\u014e\u014e\u014e\u014e\u014e\u014e\200\u014e\u014e\u014e\u014e\u014e\u014e\200\u014e\u014e\u014e\u014e\u014e\u014e\200\u014e\u014e\u014e\u014e\u014e\u014e\200\u014e\u014e\u014e\u014e\u014e\u014e\200}}!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN!!]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN!!]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN!!]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN!!]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN!!]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN!!]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN!!]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN!!!" + "'", str2, "]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN!!]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN!!]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN!!]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN!!]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN!!]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN!!]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN!!]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN]]NN]]NN!!]]NN]]NN]]NN]]NN]]NN]]NN!!!");
    }

    @Test
    public void test07764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07764");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!LLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUU!!!", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test07765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07765");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("FF!", "!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt!t!!!t!!tt\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TT!" + "'", str2, "TT!");
    }

    @Test
    public void test07766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07766");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UUUUUUUU!!UUUUUUUU!!UUUUUUUUUUUUUUUU!!UUUUUUUU!!UUUUUUUU!", "UUUU\260\255\255\225\230\230UUUU\260\255\255\225\230\230UUUU\260\255\255\225\230\230UUUU\260\255\255\225\230\230\200}}`UUUU\260\255\255\225\230\230UUUU\260\255\255\225\230\230UUUU\260\255\255\225\230\230UUUU\260\255\255\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUU!!UUUUUUUU!!UUUUUUUUUUUUUUUU!!UUUUUUUU!!UUUUUUUU!" + "'", str2, "UUUUUUUU!!UUUUUUUU!!UUUUUUUUUUUUUUUU!!UUUUUUUU!!UUUUUUUU!");
    }

    @Test
    public void test07767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07767");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LLUULLUU!~~~!~~~LLUULLUU!~~~!~~~\214\214LLUULLUU!~~~!~~~LLUULLUU!~~~!~~~\214\214LLUULLUU!~~~!~~~LLUULLUU!~~~!~~~\214\214LLUULLUU!~~~!~~~LLUULLUU!~~~!~~~\214\214LLUULLUU!~~~!~~~LLUULLUU!~~~!~~~\214\214LLUULLUU!~~~!~~~LLUULLUU!~~~!~~~\214\214LLUULLUU!~~~!~~~LLUULLUU!~~~!~~~\214\214LLUULLUU!~~~!~~~LLUULLUU!~~~!~~~\214\214!", "!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\360\360\356\356\360\360\356\356!~~~!~~~\360\360\356\356\360\360\356\356!~~~!~~~\214\214\360\360\356\356\360\360\356\356!~~~!~~~\360\360\356\356\360\360\356\356!~~~!~~~\214\214\360\360\356\356\360\360\356\356!~~~!~~~\360\360\356\356\360\360\356\356!~~~!~~~\214\214\360\360\356\356\360\360\356\356!~~~!~~~\360\360\356\356\360\360\356\356!~~~!~~~\214\214\360\360\356\356\360\360\356\356!~~~!~~~\360\360\356\356\360\360\356\356!~~~!~~~\214\214\360\360\356\356\360\360\356\356!~~~!~~~\360\360\356\356\360\360\356\356!~~~!~~~\214\214\360\360\356\356\360\360\356\356!~~~!~~~\360\360\356\356\360\360\356\356!~~~!~~~\214\214\360\360\356\356\360\360\356\356!~~~!~~~\360\360\356\356\360\360\356\356!~~~!~~~\214\214!" + "'", str2, "\360\360\356\356\360\360\356\356!~~~!~~~\360\360\356\356\360\360\356\356!~~~!~~~\214\214\360\360\356\356\360\360\356\356!~~~!~~~\360\360\356\356\360\360\356\356!~~~!~~~\214\214\360\360\356\356\360\360\356\356!~~~!~~~\360\360\356\356\360\360\356\356!~~~!~~~\214\214\360\360\356\356\360\360\356\356!~~~!~~~\360\360\356\356\360\360\356\356!~~~!~~~\214\214\360\360\356\356\360\360\356\356!~~~!~~~\360\360\356\356\360\360\356\356!~~~!~~~\214\214\360\360\356\356\360\360\356\356!~~~!~~~\360\360\356\356\360\360\356\356!~~~!~~~\214\214\360\360\356\356\360\360\356\356!~~~!~~~\360\360\356\356\360\360\356\356!~~~!~~~\214\214\360\360\356\356\360\360\356\356!~~~!~~~\360\360\356\356\360\360\356\356!~~~!~~~\214\214!");
    }

    @Test
    public void test07768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07768");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254!!!", "lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```lnlllnlllnlllnll```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254!!!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254!!LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254LLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!!\256\254\254!!!");
    }

    @Test
    public void test07769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07769");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321null\324\321\321!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!" + "'", str2, "!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!");
    }

    @Test
    public void test07770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07770");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02faLIIILIIILIII!", "``\253```\253```\200\200\253```\253```\200\200``\253```\253```\200\200\253```\253```\200\200``\253```\253```\200\200\253```\253```\200\200``\253```\253```\200\200\253```\253```\200\200``\253```\253```\200\200\253```\253```\200\200``\253```\253```\200\200\253```\253```\200\200``\253```\253```\200\200\253```\253```\200\200``\253```\253```\200\200\253```\253```\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fanullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fanullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07771");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "\u035e\u035e\u035e\u035e\u035e\u035e\u035e\u035e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07772");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!", "\u016e\u016d\u0170\u0170\u014d\u014e\u0150\u0150!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07773");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NLLLNULLNULLNULLNULLNLLLNULLNULL!", "!~nullnull!~nullnull\220\220!~nullnull!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220!~nullnull!~nullnull\220\220!~nullnull!~nullnull\220\220!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U~~~U\220~~U\220~~U\220~~U\220~~U~~~U\220~~U\220~~!" + "'", str2, "U~~~U\220~~U\220~~U\220~~U\220~~U~~~U\220~~U\220~~!");
    }

    @Test
    public void test07774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07774");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6~~~~~~~!", "\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198nullnullnull~~~~~~~!" + "'", str2, "\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198nullnullnull~~~~~~~!");
    }

    @Test
    public void test07775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07775");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("ELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLLELLLELLLLL!", "]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!]^``]^``!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07776");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UNNN\200}}`UNNN]]!", "]]HH]]HH!!]]HH]]HH!!]]HH]]HH]]HH]]HH!!]]HH]]HH!!]]HH]]HH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]HHH\200}}`]HHH]]!" + "'", str2, "]HHH\200}}`]HHH]]!");
    }

    @Test
    public void test07777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07777");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test07778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07778");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!!", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~null\275!!null\275!!null\275!!null\275!!null\275!!null\275!!null\275!!null\275!!\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~null\275!!null\275!!null\275!!null\275!!null\275!!null\275!!null\275!!null\275!!!" + "'", str2, "\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~null\275!!null\275!!null\275!!null\275!!null\275!!null\275!!null\275!!null\275!!\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~null\275!!null\275!!null\275!!null\275!!null\275!!null\275!!null\275!!null\275!!!");
    }

    @Test
    public void test07779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07779");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\230\226nullnull\236\276\276\230\226nullnull\236\276\276!!\230\226nullnull\236\276\276\230\226nullnull\236\276\276!!\230\226nullnull\236\276\276\230\226nullnull\236\276\276\230\226nullnull\236\276\276\230\226nullnull\236\276\276!!\230\226nullnull\236\276\276\230\226nullnull\236\276\276!!\230\226nullnull\236\276\276\230\226nullnull\236\276\276!", "h~ufllufllh~ufllufll!!h~ufllufllh~ufllufll!!h~ufllufllh~ufllufllh~ufllufllh~ufllufll!!h~ufllufllh~ufllufll!!h~ufllufllh~ufllufll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\226null\335\340\340null\335\340\340\236\276\276\230\226null\335\340\340null\335\340\340\236\276\276!!\230\226null\335\340\340null\335\340\340\236\276\276\230\226null\335\340\340null\335\340\340\236\276\276!!\230\226null\335\340\340null\335\340\340\236\276\276\230\226null\335\340\340null\335\340\340\236\276\276\230\226null\335\340\340null\335\340\340\236\276\276\230\226null\335\340\340null\335\340\340\236\276\276!!\230\226null\335\340\340null\335\340\340\236\276\276\230\226null\335\340\340null\335\340\340\236\276\276!!\230\226null\335\340\340null\335\340\340\236\276\276\230\226null\335\340\340null\335\340\340\236\276\276!" + "'", str2, "\230\226null\335\340\340null\335\340\340\236\276\276\230\226null\335\340\340null\335\340\340\236\276\276!!\230\226null\335\340\340null\335\340\340\236\276\276\230\226null\335\340\340null\335\340\340\236\276\276!!\230\226null\335\340\340null\335\340\340\236\276\276\230\226null\335\340\340null\335\340\340\236\276\276\230\226null\335\340\340null\335\340\340\236\276\276\230\226null\335\340\340null\335\340\340\236\276\276!!\230\226null\335\340\340null\335\340\340\236\276\276\230\226null\335\340\340null\335\340\340\236\276\276!!\230\226null\335\340\340null\335\340\340\236\276\276\230\226null\335\340\340null\335\340\340\236\276\276!");
    }

    @Test
    public void test07780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07780");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!", "!~TT!~TT!!!~TT!~TT!!!~TT!~TT!~TT!~TT!!!~TT!~TT!!!~TT!~TT!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!" + "'", str2, "\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!!\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225\230\230\225\225!");
    }

    @Test
    public void test07781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07781");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!~~!!~~!!!!~~!!~~!!!!~~!!~~!!~~!!~~!!!!~~!!~~!!!!~~!!~~!", "~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ~}\200\200~}\200\200JJ!!JJ!!JJJJ!!JJ!!JJ!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~~!!~~!!!!~~!!~~!!!!~~!!~~!!~~!!~~!!!!~~!!~~!!!!~~!!~~!" + "'", str2, "!!~~!!~~!!!!~~!!~~!!!!~~!!~~!!~~!!~~!!!!~~!!~~!!!!~~!!~~!");
    }

    @Test
    public void test07782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07782");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e\275\276\u018e\u018e!", "\u0366\u0365\u0368\u0368\u0146\u0146\u0146\u0146\u0146\u0146\u0146\u0146\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull!" + "'", str2, "\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull!");
    }

    @Test
    public void test07783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07783");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295!", "~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!~}\200\200~}\200\200!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`null!nullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnull`null!nullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnull!" + "'", str2, "`null!nullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnull`null!nullnullnullnullnullnull!nullnullnullnullnullnull!nullnullnullnullnull!");
    }

    @Test
    public void test07784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07784");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!", "!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III\200}}`!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III!III]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII!" + "'", str2, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII!");
    }

    @Test
    public void test07785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07785");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!", "!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!" + "'", str2, "!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!!\276\276\275\275\276\276\275\275!");
    }

    @Test
    public void test07786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07786");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\276!!!\276\276!!\276\276!!\276\276!!\276\276!!\276!!!\276\276!!\276\276!!!", "\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!\216\254\254\u02be!!\216\254\254\u02be\u02be\u02be\u02be\u02be\u02be\u02be\u02be!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!!!\276\276!!\276\276!!\276\276!!\276\276!!\276!!!\276\276!!\276\276!!!" + "'", str2, "\276!!!\276\276!!\276\276!!\276\276!!\276\276!!\276!!!\276\276!!\276\276!!!");
    }

    @Test
    public void test07787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07787");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150\u0150!", "U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```U!!!!!!```!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0197\u0197\u0197\u0197\u0197\u0197\u0197\u0197\u0197\u0197\u0197\u0197\u0197\u0197\u0197\u0197\u0197\u0197\u0197\u0197\u0197\u0197\u0197\u0197nullnullnullnullnullnullnull!" + "'", str2, "\u0197\u0197\u0197\u0197\u0197\u0197\u0197\u0197\u0197\u0197\u0197\u0197\u0197\u0197\u0197\u0197\u0197\u0197\u0197\u0197\u0197\u0197\u0197\u0197nullnullnullnullnullnullnull!");
    }

    @Test
    public void test07788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07788");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\253\254\256\256~`~~~`~~~`~~~`~~\253\254\256\256~`~~~`~~!", "}~\200\200}~\200\200NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL}~\200\200}~\200\200NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256~`~~~`~~~`~~~`~~\253\254\256\256~`~~~`~~!" + "'", str2, "\253\254\256\256~`~~~`~~~`~~~`~~\253\254\256\256~`~~~`~~!");
    }

    @Test
    public void test07789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07789");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LL!!!!LL!", "UNLLUNLLUNLLUNLLULLLULLLULLLULLLUNLLUNLLUNLLUNLLULLLULLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!!!LL!" + "'", str2, "LL!!!!LL!");
    }

    @Test
    public void test07790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07790");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!!", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNUNLLNNNNNNNNNNNNUNLLNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNUNLLNNNNNNNNNNNNUNLLNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNUNLLNNNNNNNNNNNNUNLLNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNUNLLNNNNNNNNNNNNUNLLNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNUNLLNNNNNNNNNNNNUNLLNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNUNLLNNNNNNNNNNNNUNLLNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNUNLLNNNNNNNNNNNNUNLLNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNUNLLNNNNNNNNNNNNUNLLNNNNNNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!!" + "'", str2, "NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!NUNNNUNNNN!!NN!!!");
    }

    @Test
    public void test07791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07791");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0406\u0406!", "!\216\216\216!\216\216\216!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!" + "'", str2, "nullnull!");
    }

    @Test
    public void test07792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07792");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200!", "\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200!" + "'", str2, "}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200!");
    }

    @Test
    public void test07793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07793");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("unllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunll!", "UNLLnllUNLLnllUNLLnllUNLLnllUNLLnllUNLLnllUNLLnllUNLLnll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!" + "'", str2, "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!");
    }

    @Test
    public void test07794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07794");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!!", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!!!!" + "'", str2, "U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!U!!!!!!!!");
    }

    @Test
    public void test07795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07795");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("NN!!NN!!!", "ELLLELLLELLLELLL\200}}`ELLLELLLELLLELLL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!!");
    }

    @Test
    public void test07796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07796");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275]!]]]!]]]!]]\275]!]]]!]]]!]]!", "LUUULUUU!!``LUUULUUU``LUUULUUU``LUUULUUULUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!``LUUULUUU``LUUULUUU``LUUULUUULUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!LUUULUUU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275]!]]]!]]]!]]\275]!]]]!]]]!]]!" + "'", str2, "\275]!]]]!]]]!]]\275]!]]]!]]]!]]!");
    }

    @Test
    public void test07797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07797");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("HHHHHHHH!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!" + "'", str2, "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!");
    }

    @Test
    public void test07798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07798");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!", "``!!``!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
    }

    @Test
    public void test07799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07799");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!\300\300nullnull\300\300nullnull\300\300nullnull\300\300nullnull!!!", "null\276\276\276null\276\276\276null\276\276\276null\276\276\276null\276\276\276null\276\276\276null\276\276\276null\276\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!!!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!!!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!!!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!!!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!!" + "'", str2, "!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!!!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!!!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!!!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!!!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!!nullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUUnullnullLLUULLUU!!!");
    }

    @Test
    public void test07800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07800");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\230\226null\335\340\340null\335\340\340\236\276\276\230\226null\335\340\340null\335\340\340\236\276\276!!\230\226null\335\340\340null\335\340\340\236\276\276\230\226null\335\340\340null\335\340\340\236\276\276!!\230\226null\335\340\340null\335\340\340\236\276\276\230\226null\335\340\340null\335\340\340\236\276\276\230\226null\335\340\340null\335\340\340\236\276\276\230\226null\335\340\340null\335\340\340\236\276\276!!\230\226null\335\340\340null\335\340\340\236\276\276\230\226null\335\340\340null\335\340\340\236\276\276!!\230\226null\335\340\340null\335\340\340\236\276\276\230\226null\335\340\340null\335\340\340\236\276\276!", "OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```OPRROPRROPRROPRR```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\226RRPPORRRRPPORR\236\276\276\230\226RRPPORRRRPPORR\236\276\276!!\230\226RRPPORRRRPPORR\236\276\276\230\226RRPPORRRRPPORR\236\276\276!!\230\226RRPPORRRRPPORR\236\276\276\230\226RRPPORRRRPPORR\236\276\276\230\226RRPPORRRRPPORR\236\276\276\230\226RRPPORRRRPPORR\236\276\276!!\230\226RRPPORRRRPPORR\236\276\276\230\226RRPPORRRRPPORR\236\276\276!!\230\226RRPPORRRRPPORR\236\276\276\230\226RRPPORRRRPPORR\236\276\276!" + "'", str2, "\230\226RRPPORRRRPPORR\236\276\276\230\226RRPPORRRRPPORR\236\276\276!!\230\226RRPPORRRRPPORR\236\276\276\230\226RRPPORRRRPPORR\236\276\276!!\230\226RRPPORRRRPPORR\236\276\276\230\226RRPPORRRRPPORR\236\276\276\230\226RRPPORRRRPPORR\236\276\276\230\226RRPPORRRRPPORR\236\276\276!!\230\226RRPPORRRRPPORR\236\276\276\230\226RRPPORRRRPPORR\236\276\276!!\230\226RRPPORRRRPPORR\236\276\276\230\226RRPPORRRRPPORR\236\276\276!");
    }

    @Test
    public void test07801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07801");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!!efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!!efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!!efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!!efhh\200~~efhh\200~~efhhefhhefhh\200~~efhh\200~~efhhefhh!", "nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200!!nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200!!nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200!!nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200!!nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200!!nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200!!nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200!!nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07802");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!u!", "NLLL\220NN\200}}`NLLL\220NN]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!" + "'", str2, "!!!");
    }

    @Test
    public void test07803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07803");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!!!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!!!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!!!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!!!~!nullnull!!nullnull!nullnull!!nullnull!~!nullnull!!nullnull!nullnull!!nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0245\u0246\u0248\u0248\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0245\u0246\u0248\u0248\u0346\u0348\u0348!");
    }

    @Test
    public void test07804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07804");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300\300\300!!\300\300!!\276\300\300\300\276\300\300\300!", "~}\200\200~}\200\200!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX~}\200\200~}\200\200!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX~}\200\200~}\200\200!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX~}\200\200~}\200\200!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX~}\200\200~}\200\200!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX~}\200\200~}\200\200!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX~}\200\200~}\200\200!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX~}\200\200~}\200\200!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!\276!!!\276!!!!!!!!!!!\276!!!\276!!!!!!!!!!!\276!!!\276!!!!!!!!!!!\276!!!\276!!!!!!!!!!!\276!!!\276!!!!!!!!!!!\276!!!\276!!!!!!!!!!!\276!!!\276!!!!!!!!!!!\276!!!\276!!!!" + "'", str2, "!!!!!!!!\276!!!\276!!!!!!!!!!!\276!!!\276!!!!!!!!!!!\276!!!\276!!!!!!!!!!!\276!!!\276!!!!!!!!!!!\276!!!\276!!!!!!!!!!!\276!!!\276!!!!!!!!!!!\276!!!\276!!!!!!!!!!!\276!!!\276!!!!");
    }

    @Test
    public void test07805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07805");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d!", "\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240\u023e\u023e\u0240\u0240!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07806");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!~}}^``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!]]!", "\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!~}}^``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!]]!" + "'", str2, "``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!~}}^``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!]]!");
    }

    @Test
    public void test07807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07807");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!", "\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!\253\254\256\256!null!!!null!!!null!!!null!!!null!!!null!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c!!!" + "'", str2, "\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c\u0349\u034a\u034c\u034c!!!");
    }

    @Test
    public void test07808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07808");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LULLLULL!!LULLLULL!!LULLLULL!!LULLLULL!!LULLLULL!!LULLLULL!!LULLLULL!!LULLLULL!!!", "UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230\200}}`UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230UU^^\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullwnullnullnullwnullnull!!nullwnullnullnullwnullnull!!nullwnullnullnullwnullnull!!nullwnullnullnullwnullnull!!nullwnullnullnullwnullnull!!nullwnullnullnullwnullnull!!nullwnullnullnullwnullnull!!nullwnullnullnullwnullnull!!!" + "'", str2, "nullwnullnullnullwnullnull!!nullwnullnullnullwnullnull!!nullwnullnullnullwnullnull!!nullwnullnullnullwnullnull!!nullwnullnullnullwnullnull!!nullwnullnullnullwnullnull!!nullwnullnullnullwnullnull!!nullwnullnullnullwnullnull!!!");
    }

    @Test
    public void test07809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07809");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!\253\256\256\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271\266!!!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test07810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07810");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "!LLUULLUULLUU!LLUULLUULLUU!!!LLUULLUULLUU!LLUULLUULLUU!!!LLUULLUULLUU!LLUULLUULLUU!LLUULLUULLUU!LLUULLUULLUU!!!LLUULLUULLUU!LLUULLUULLUU!!!LLUULLUULLUU!LLUULLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test07811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07811");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\253\254\256\256\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!\253\254\256\256\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!!", "ULLL\200}}`ULLL]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!\253\254\256\256null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!" + "'", str2, "\253\254\256\256null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!\253\254\256\256null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!");
    }

    @Test
    public void test07812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07812");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!!", "\u0346\u0346null!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!!" + "'", str2, "\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!\275\275\275!!!!\275\275\275!!!!!!\275\275\275!!!!\275\275\275!!!!!!!!!");
    }

    @Test
    public void test07813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07813");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e\220\220\216\216\220\220\216\216\u0110\u0110\u010e\u010e\u0110\u0110\u010e\u010e!", "\275NNN\275NNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull!" + "'", str2, "\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull\220\220\216\216\220\220\216\216nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07814");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!!", "!NNNNNNNNNNNNNNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!!" + "'", str2, "~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!!");
    }

    @Test
    public void test07815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07815");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\230\226NULLNULL\236\276\276\230\226NULLNULL\236\276\276!!\230\226NULLNULL\236\276\276\230\226NULLNULL\236\276\276!!\230\226NULLNULL\236\276\276\230\226NULLNULL\236\276\276\230\226NULLNULL\236\276\276\230\226NULLNULL\236\276\276!!\230\226NULLNULL\236\276\276\230\226NULLNULL\236\276\276!!\230\226NULLNULL\236\276\276\230\226NULLNULL\236\276\276!", "\u014e\u014e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!!\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!!\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!!\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!!\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!" + "'", str2, "\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!!\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!!\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!!\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!!\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!");
    }

    @Test
    public void test07816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07816");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!", "!!!!!!!!!!!!!!!!\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!" + "'", str2, "!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!");
    }

    @Test
    public void test07817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07817");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnull]]nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "XXXX\200}}`XXXX]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]]]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]]]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]]]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]]]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx!" + "'", str2, "]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]]]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]]]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]]]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]]]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx]nullxx!");
    }

    @Test
    public void test07818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07818");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!", "\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test07819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07819");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230\200}}```]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230]]!", "URRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRR\200}}`URRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRR]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230\200}}```]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230]]!" + "'", str2, "``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230\200}}```]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230]]!");
    }

    @Test
    public void test07820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07820");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356!", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HH!!HH!!HHHHHHHHHH!!HH!!HHHHHHHHHH!!HH!!HHHHHHHHHH!!HH!!HHHHHHHHHH!!HH!!HHHHHHHHHH!!HH!!HHHHHHHHHH!!HH!!HHHHHHHHHH!!HH!!HHHHHHHH!" + "'", str2, "HH!!HH!!HHHHHHHHHH!!HH!!HHHHHHHHHH!!HH!!HHHHHHHHHH!!HH!!HHHHHHHHHH!!HH!!HHHHHHHHHH!!HH!!HHHHHHHHHH!!HH!!HHHHHHHHHH!!HH!!HHHHHHHH!");
    }

    @Test
    public void test07821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07821");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("a]aaa]aa!!a]aaa]aa!!a]aaa]aaa]aaa]aa!!a]aaa]aa!!a]aaa]aa!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!" + "'", str2, "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!");
    }

    @Test
    public void test07822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07822");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd\u029d\u029d\u02bd\u02bd\u02bd\u02bd!", "U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!uuu!uuunullnull!uuu!uuunullnullnullnull!uuu!uuunullnull!uuu!uuunullnullnullnull!uuu!uuunullnull!uuu!uuunullnullnullnull!uuu!uuunullnull!uuu!uuunullnullnullnull!uuu!uuunullnull!uuu!uuunullnullnullnull!uuu!uuunullnull!uuu!uuunullnullnullnull!uuu!uuunullnull!uuu!uuunullnullnullnull!uuu!uuunullnull!uuu!uuunullnull!" + "'", str2, "nullnull!uuu!uuunullnull!uuu!uuunullnullnullnull!uuu!uuunullnull!uuu!uuunullnullnullnull!uuu!uuunullnull!uuu!uuunullnullnullnull!uuu!uuunullnull!uuu!uuunullnullnullnull!uuu!uuunullnull!uuu!uuunullnullnullnull!uuu!uuunullnull!uuu!uuunullnullnullnull!uuu!uuunullnull!uuu!uuunullnullnullnull!uuu!uuunullnull!uuu!uuunullnull!");
    }

    @Test
    public void test07823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07823");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "\260\260\u0108\u0108\260\260\u0108\u0108}}\260\260\u0108\u0108\260\260\u0108\u0108}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07824");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "!!!!U\270\270\270U\270\270\270!!U\270\270\270U\270\270\270!!U\270\270\270U\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!U\270\270\270U\270\270\270!!U\270\270\270U\270\270\270!!U\270\270\270U\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368nullnull\277\277\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368nullnull\277\277\u0346\u0348\u0348!");
    }

    @Test
    public void test07825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07825");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230\200}}`!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230]]!", "}~\200\200}~\200\200nullnull}~\200\200}~\200\200nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230\200}}`!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230]]!" + "'", str2, "!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230\200}}`!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230!!!!!!!!!!!!!!!!\225\230\230]]!");
    }

    @Test
    public void test07826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07826");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("L\204LLL\204LLL\204LLL\204LLLLLLLLLLLLLLLLLLL\204LLL\204LLL\204LLL\204LLLLLLLLLL!", "\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\256\204\256\256\256\204\256\256\256\204\256\256\256\204\256\256\256\256\256\256\256\256\256\256\256\256\256\256\256\256\256\256\256\204\256\256\256\204\256\256\256\204\256\256\256\204\256\256\256\256\256\256\256\256\256\256!" + "'", str2, "\256\204\256\256\256\204\256\256\256\204\256\256\256\204\256\256\256\256\256\256\256\256\256\256\256\256\256\256\256\256\256\256\256\204\256\256\256\204\256\256\256\204\256\256\256\204\256\256\256\256\256\256\256\256\256\256!");
    }

    @Test
    public void test07827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07827");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d!!!!", "fhnullnullfhnullnullfhnullnullfhnullnull~}}^fhnullnullfhnullnullfhnullnullfhnullnull]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HL^^HL^^HL^^HL^^HL^^HL^^HL^^HL^^null!!!null!!!HL^^HL^^HL^^HL^^HL^^HL^^HL^^HL^^null!!!null!!!!!HL^^HL^^HL^^HL^^HL^^HL^^HL^^HL^^null!!!null!!!HL^^HL^^HL^^HL^^HL^^HL^^HL^^HL^^null!!!null!!!!!HL^^HL^^HL^^HL^^HL^^HL^^HL^^HL^^null!!!null!!!HL^^HL^^HL^^HL^^HL^^HL^^HL^^HL^^null!!!null!!!HL^^HL^^HL^^HL^^HL^^HL^^HL^^HL^^null!!!null!!!HL^^HL^^HL^^HL^^HL^^HL^^HL^^HL^^null!!!null!!!!!HL^^HL^^HL^^HL^^HL^^HL^^HL^^HL^^null!!!null!!!HL^^HL^^HL^^HL^^HL^^HL^^HL^^HL^^null!!!null!!!!!HL^^HL^^HL^^HL^^HL^^HL^^HL^^HL^^null!!!null!!!HL^^HL^^HL^^HL^^HL^^HL^^HL^^HL^^null!!!null!!!!" + "'", str2, "HL^^HL^^HL^^HL^^HL^^HL^^HL^^HL^^null!!!null!!!HL^^HL^^HL^^HL^^HL^^HL^^HL^^HL^^null!!!null!!!!!HL^^HL^^HL^^HL^^HL^^HL^^HL^^HL^^null!!!null!!!HL^^HL^^HL^^HL^^HL^^HL^^HL^^HL^^null!!!null!!!!!HL^^HL^^HL^^HL^^HL^^HL^^HL^^HL^^null!!!null!!!HL^^HL^^HL^^HL^^HL^^HL^^HL^^HL^^null!!!null!!!HL^^HL^^HL^^HL^^HL^^HL^^HL^^HL^^null!!!null!!!HL^^HL^^HL^^HL^^HL^^HL^^HL^^HL^^null!!!null!!!!!HL^^HL^^HL^^HL^^HL^^HL^^HL^^HL^^null!!!null!!!HL^^HL^^HL^^HL^^HL^^HL^^HL^^HL^^null!!!null!!!!!HL^^HL^^HL^^HL^^HL^^HL^^HL^^HL^^null!!!null!!!HL^^HL^^HL^^HL^^HL^^HL^^HL^^HL^^null!!!null!!!!");
    }

    @Test
    public void test07828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07828");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!\253\256\256\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01canullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01ca\u01c5\u01c6\u01ca\u01canullnull!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh]nullnullnullnullhhhhhhhh!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test07829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07829");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("~~!!null~~~null~~~null~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!null~~~null~~~null~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!", "L\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LL!!L\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LL!!L\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LL!!L\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LL!!L\220LL\200~~L\220LL\200~~L\220LLL\220LLL\220LL\200~~L\220LL\200~~L\220LLL\220LL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!" + "'", str2, "\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170\u0170~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!");
    }

    @Test
    public void test07830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07830");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!", "}~\200\200}~\200\200nullnull}~\200\200}~\200\200nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u}llu}llu}llu}llu}llu}llu}llu}ll!!u}llu}llu}llu}llu}llu}llu}llu}ll!!u}llu}llu}llu}llu}llu}llu}llu}ll!!u}llu}llu}llu}llu}llu}llu}llu}ll!!u}llu}llu}llu}llu}llu}llu}llu}ll!!u}llu}llu}llu}llu}llu}llu}llu}ll!!u}llu}llu}llu}llu}llu}llu}llu}ll!!u}llu}llu}llu}llu}llu}llu}llu}ll!!!" + "'", str2, "u}llu}llu}llu}llu}llu}llu}llu}ll!!u}llu}llu}llu}llu}llu}llu}llu}ll!!u}llu}llu}llu}llu}llu}llu}llu}ll!!u}llu}llu}llu}llu}llu}llu}llu}ll!!u}llu}llu}llu}llu}llu}llu}llu}ll!!u}llu}llu}llu}llu}llu}llu}llu}ll!!u}llu}llu}llu}llu}llu}llu}llu}ll!!u}llu}llu}llu}llu}llu}llu}llu}ll!!!");
    }

    @Test
    public void test07831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07831");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("]]null{|~~nullnullnull{|~~nullnull]]null{|~~nullnullnull{|~~nullnull!!]]null{|~~nullnullnull{|~~nullnull]]null{|~~nullnullnull{|~~nullnull!!]]null{|~~nullnullnull{|~~nullnull]]null{|~~nullnullnull{|~~nullnull]]null{|~~nullnullnull{|~~nullnull]]null{|~~nullnullnull{|~~nullnull!!]]null{|~~nullnullnull{|~~nullnull]]null{|~~nullnullnull{|~~nullnull!!]]null{|~~nullnullnull{|~~nullnull]]null{|~~nullnullnull{|~~nullnull!", "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a!" + "'", str2, "\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a\u031a!");
    }

    @Test
    public void test07832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07832");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336!!nullnull\336\336nullnull\336\336!", "!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07833");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214!" + "'", str2, "\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214\220\220\216\216\220\220\216\216!!\214\214!!\214\214!");
    }

    @Test
    public void test07834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07834");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\335\336\340\340nullnullnull\335\336\340\340nullnullnull!!\335\336\340\340nullnullnull\335\336\340\340nullnullnull!!\335\336\340\340nullnullnull\335\336\340\340nullnullnull!!\335\336\340\340nullnullnull\335\336\340\340\u0346\u0348\u0348!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200ULLL!UUULLLULLLUUULLLULLLUUULLLULLLUUULLL!UUULLLULLLUUULLLULLLUUULLLULLLUU}~\200\200}~\200\200ULLL!UUULLLULLLUUULLLULLLUUULLLULLLUUULLL!UUULLLULLLUUULLLULLLUUULLLULLLUU}~\200\200}~\200\200ULLL!UUULLLULLLUUULLLULLLUUULLLULLLUUULLL!UUULLLULLLUUULLLULLLUUULLLULLLUU}~\200\200}~\200\200\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u01ac\u01aa\u01aa\u01ac\u01aa\u01aa\u01ac\u01aa\u01aa\u01ac\u01aa\u01aa\u01ac\u01aa\u01aa\u01ac\u01aa\u01aa\u01ac\u01aa\u01aa\u01ac\u01aa\u01aa\u01ac\u01aa\u01aa\u01ac\u01aa\u01aa\u01ac\u01aa\u01aa\u01ac\u01aa\u01aa\u01ac\u01aa\u01aa\u01ac\u01aa\u01aa\u01ac\u01aa\u01aa\u01ac\u01aa\u01aa\u01ac\u01aa\u01aa\u01ac\u01aa\u01aa\u01ac\u01aa\u01aa\u01ac\u01aa\u01aa\u01ac\u01aa\u01aa\u01ac\u01aa\u01aa\u01ac\u01aa\u01aa\u01ac\u01aa\u01aa\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u01ac\u01aa\u01aa\u01ac\u01aa\u01aa\u01ac\u01aa\u01aa\u01ac\u01aa\u01aa\u01ac\u01aa\u01aa\u01ac\u01aa\u01aa\u01ac\u01aa\u01aa\u01ac\u01aa\u01aa\u01ac\u01aa\u01aa\u01ac\u01aa\u01aa\u01ac\u01aa\u01aa\u01ac\u01aa\u01aa\u01ac\u01aa\u01aa\u01ac\u01aa\u01aa\u01ac\u01aa\u01aa\u01ac\u01aa\u01aa\u01ac\u01aa\u01aa\u01ac\u01aa\u01aa\u01ac\u01aa\u01aa\u01ac\u01aa\u01aa\u01ac\u01aa\u01aa\u01ac\u01aa\u01aa\u01ac\u01aa\u01aa\u01ac\u01aa\u01aa\u0346\u0348\u0348!");
    }

    @Test
    public void test07835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07835");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("}~\200\200}~\200\200NNUUNNUUNNUUNNUU^NNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUU^NNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUU}~\200\200}~\200\200NNUUNNUUNNUUNNUU^NNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUU^NNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUU!", "!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!!TT!!!!!!!!TT!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07836");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!\227!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07837");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!", "N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!!N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!!N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!!N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!!N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!" + "'", str2, "\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!");
    }

    @Test
    public void test07838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07838");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\336\335\300\300\336\335\300\300\376\376\336\335\300\300\336\335\300\300\376\376!", "UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07839");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!~]]!~]]!!!~]]!~]]!!!~]]!~]]!~]]!~]]!!!~]]!~]]!!!~]]!~]]!", "UUNNUUNN!!UUNNUUNN!!UUNNUUNNUUNNUUNN!!UUNNUUNN!!UUNNUUNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~]]!~]]!!!~]]!~]]!!!~]]!~]]!~]]!~]]!!!~]]!~]]!!!~]]!~]]!" + "'", str2, "!~]]!~]]!!!~]]!~]]!!!~]]!~]]!~]]!~]]!!!~]]!~]]!!!~]]!~]]!");
    }

    @Test
    public void test07840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07840");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("]!!!!!]]!!]]!!]]!!]]]!!!!!]]!!]]!", "NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!!!!!]]!!]]!!]]!!]]]!!!!!]]!!]]!" + "'", str2, "]!!!!!]]!!]]!!]]!!]]]!!!!!]]!!]]!");
    }

    @Test
    public void test07841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07841");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test07842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07842");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07843");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07844");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!nullnullnullnullnullnullnullnull!!!!!!!!!", "nullnull\336\336nullnull\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "oprroprroprroprroprroprroprroprr!!!!!!!!oprroprroprroprroprroprroprroprr!!!!!!!!oprroprroprroprroprroprroprroprr!!!!!!!!oprroprroprroprroprroprroprroprr!!!!!!!!oprroprroprroprroprroprroprroprr!!!!!!!!oprroprroprroprroprroprroprroprr!!!!!!!!oprroprroprroprroprroprroprroprr!!!!!!!!oprroprroprroprroprroprroprroprr!!!!!!!!!" + "'", str2, "oprroprroprroprroprroprroprroprr!!!!!!!!oprroprroprroprroprroprroprroprr!!!!!!!!oprroprroprroprroprroprroprroprr!!!!!!!!oprroprroprroprroprroprroprroprr!!!!!!!!oprroprroprroprroprroprroprroprr!!!!!!!!oprroprroprroprroprroprroprroprr!!!!!!!!oprroprroprroprroprroprroprroprr!!!!!!!!oprroprroprroprroprroprroprroprr!!!!!!!!!");
    }

    @Test
    public void test07845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07845");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360!", "!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u020d\u020e\u0210\u0210\u020d\u020e\u0210\u0210\u020d\u020e\u0210\u0210\u020d\u020e\u0210\u0210\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u020d\u020e\u0210\u0210\u020d\u020e\u0210\u0210\u020d\u020e\u0210\u0210\u020d\u020e\u0210\u0210\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360!" + "'", str2, "\u020d\u020e\u0210\u0210\u020d\u020e\u0210\u0210\u020d\u020e\u0210\u0210\u020d\u020e\u0210\u0210\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u020d\u020e\u0210\u0210\u020d\u020e\u0210\u0210\u020d\u020e\u0210\u0210\u020d\u020e\u0210\u0210\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360!");
    }

    @Test
    public void test07846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07846");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test07847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07847");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e}}!", "\253\254\256\256\366\367\371\371\366\367\371\371\366\367\371\371\366\367\371\371\253\254\256\256\366\367\371\371\366\367\371\371!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\253nullnull\253\253nullnull}}\253\253nullnull\253\253nullnull}}!" + "'", str2, "\253\253nullnull\253\253nullnull}}\253\253nullnull\253\253nullnull}}!");
    }

    @Test
    public void test07848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07848");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!!", "\276X\266\266~XX\276X\266\266~XX!!\276X\266\266~XX\276X\266\266~XX!!\276X\266\266~XX\276X\266\266~XX\276X\266\266~XX\276X\266\266~XX!!\276X\266\266~XX\276X\266\266~XX!!\276X\266\266~XX\276X\266\266~XX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!!" + "'", str2, "\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!\261\262\264\264XX~~XX~~!!!!\261\262\264\264XX~~XX~~!!!!!!!");
    }

    @Test
    public void test07849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07849");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178~}\200\200~}\200\200\u0178\u0178\u0178\u0178!", "\275\233nullnullnull\233nullnullnull\233nullnullnull\275\233nullnullnull\233nullnullnull\233nullnullnull\275\233nullnullnull\233nullnullnull\233nullnullnull\275\233nullnullnull\233nullnullnull\233nullnullnull\233nullnullnull\233nullnullnull\275\275\233nullnullnull\233nullnullnull\275\275\233nullnullnull\233nullnullnull\275\275\233nullnullnull\233nullnullnull\275\275\275\233nullnullnull\233nullnullnull\233nullnullnull\275\233nullnullnull\233nullnullnull\233nullnullnull\275\233nullnullnull\233nullnullnull\233nullnullnull\275\233nullnullnull\233nullnullnull\233nullnullnull\233nullnullnull\233nullnullnull\275\275\233nullnullnull\233nullnullnull\275\275!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200LLUULLUULLLLUULLUULL~}\200\200~}\200\200LLUULLUULLLLUULLUULL~}\200\200~}\200\200LLUULLUULLLLUULLUULL~}\200\200~}\200\200LLUULLUULLLLUULLUULL~}\200\200~}\200\200LLUULLUULLLLUULLUULL~}\200\200~}\200\200LLUULLUULLLLUULLUULL~}\200\200~}\200\200LLUULLUULLLLUULLUULL~}\200\200~}\200\200LLUULLUULLLLUULLUULL!" + "'", str2, "~}\200\200~}\200\200LLUULLUULLLLUULLUULL~}\200\200~}\200\200LLUULLUULLLLUULLUULL~}\200\200~}\200\200LLUULLUULLLLUULLUULL~}\200\200~}\200\200LLUULLUULLLLUULLUULL~}\200\200~}\200\200LLUULLUULLLLUULLUULL~}\200\200~}\200\200LLUULLUULLLLUULLUULL~}\200\200~}\200\200LLUULLUULLLLUULLUULL~}\200\200~}\200\200LLUULLUULLLLUULLUULL!");
    }

    @Test
    public void test07850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07850");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("hi!", "ULUUULUULUUULUUUULUUULUULUUULUUUULUUULUULUUULUUUULUUULUULUUULUUUULUUULUULUUULUUUULUUULUULUUULUUUULUUULUULUUULUUUULUUULUULUUULUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!" + "'", str2, "nullnull!");
    }

    @Test
    public void test07851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07851");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!", "\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~\215\216\230\230\276{|~~{|~~{|~~\276{|~~{|~~{|~~\276{|~~{|~~{|~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!" + "'", str2, "!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!");
    }

    @Test
    public void test07852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07852");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}~\200\200}~\200\200L^NNL^NN}~\200\200}~\200\200L^NNL^NN!", "\u011b\u011c\u011e\u011e\u011b\u011c\u011e\u011e\u011e\214\214\u011e\214\214\u011b\u011c\u011e\u011e\u011b\u011c\u011e\u011e\u011e\214\214\u011e\214\214\u011b\u011c\u011e\u011e\u011b\u011c\u011e\u011e\u011e\214\214\u011e\214\214\u011b\u011c\u011e\u011e\u011b\u011c\u011e\u011e\u011e\214\214\u011e\214\214\u011b\u011c\u011e\u011e\u011b\u011c\u011e\u011e\u011e\214\214\u011e\214\214\u011b\u011c\u011e\u011e\u011b\u011c\u011e\u011e\u011e\214\214\u011e\214\214\u011b\u011c\u011e\u011e\u011b\u011c\u011e\u011e\u011e\214\214\u011e\214\214\u011b\u011c\u011e\u011e\u011b\u011c\u011e\u011e\u011e\214\214\u011e\214\214!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200L^\214\214L^\214\214}~\200\200}~\200\200L^\214\214L^\214\214!" + "'", str2, "}~\200\200}~\200\200L^\214\214L^\214\214}~\200\200}~\200\200L^\214\214L^\214\214!");
    }

    @Test
    public void test07853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07853");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("NLLLNLLLNLLLNLLL\200}}`NLLLNLLLNLLLNLLL]]!", "]!E!!!E!!!E!!!E!!!E!!]]!E!!!E!!]]!E!!!E!!]]!E!!!E!!]]]!E!!!E!!!E!!!E!!!E!!]]!E!!!E!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test07854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07854");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnull]]!", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "XXXXXXXXXXXXXXXXXXXXXXXXXXXX\200}}`XXXXXXXXXXXXXXXXXXXXXXXXXXXX]]!" + "'", str2, "XXXXXXXXXXXXXXXXXXXXXXXXXXXX\200}}`XXXXXXXXXXXXXXXXXXXXXXXXXXXX]]!");
    }

    @Test
    public void test07855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07855");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07856");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LLLL!!LL!!LL!", "nullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUUnullnullUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270!" + "'", str2, "\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270\270\270!!\270\270!!\270\270!");
    }

    @Test
    public void test07857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07857");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266\336\336\326\326\336\336\326\326\276\276\266\266\276\276\266\266!", "\250\250\250\250\250\250\250\250\250\246~~\250\246~~\250\250\250\250\250\250\250\250\250\246~~\250\246~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266!" + "'", str2, "nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266nullnullnullnullnullnullnullnull\276\276\266\266\276\276\266\266!");
    }

    @Test
    public void test07858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07858");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("````````````````````````````````````````````````````````````````````````````````!", "nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!nullnull]]!\220!!!!\220!!!\220!!!\220!!!\220!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````````````````````````````````````````````````````````````````````````````````!" + "'", str2, "````````````````````````````````````````````````````````````````````````````````!");
    }

    @Test
    public void test07859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07859");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LL~LLLLLL~LLLL!!LL~LLLLLL~LLLL!!LL~LLLLLL~LLLL!!LL~LLLLLL~LLLL!!LL~LLLLLL~LLLL!!LL~LLLLLL~LLLL!!LL~LLLLLL~LLLL!!LL~LLLLLL~LLLL!!!", "UNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNN!!UNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNN!!UNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNN!!UNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNN!!UNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNNUNLLUNLLUNNNUNNN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340!!!" + "'", str2, "\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340\u0340!!!");
    }

    @Test
    public void test07860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07860");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!", "\253\254\256\256``^^``^^``^^``^^\253\254\256\256``^^``^^!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test07861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07861");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106\u0106\u0104\u0106\u0106!!!!!!!", "]]]]]]]]!!]]]]]]]]!!]]]]]]]]]]]]]]]]!!]]]]]]]]!!]]]]]]]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!!!!" + "'", str2, "]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!]]]]]]]]]]]]]]]]nullnullnullnullnullnullnullnull!!!!!!!");
    }

    @Test
    public void test07862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07862");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170!", "\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140\u0140!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07863");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!\351\352\354\354\351\352\354\354!!!", "\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!\253nullnullnullnull\260\260\253nullnullnullnull\260\260!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test07864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07864");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8\u01c5\u01c6\u01c8\u01c8~~!", "\u02ce\u02ce\u02ce\u02ce\u02ce\u02ce\u02ce\u02ce\u02ce\u02ce\u02ce\u02ce\u02ce\u02ce\u02ce\u02ce!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~nullnullnullnullnullnullnullnull!!nullnullnullnull~~!");
    }

    @Test
    public void test07865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07865");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275``\230\230\230\230\230\230\230\230``\230\230\230\230\230\230\230\230``\230\230\230\230\230\230\230\230\276``\230\230\230\230\230\230\230\230\275\275!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275``\230\230\230\230\230\230\230\230``\230\230\230\230\230\230\230\230``\230\230\230\230\230\230\230\230\276``\230\230\230\230\230\230\230\230\275\275!" + "'", str2, "\275``\230\230\230\230\230\230\230\230``\230\230\230\230\230\230\230\230``\230\230\230\230\230\230\230\230\276``\230\230\230\230\230\230\230\230\275\275!");
    }

    @Test
    public void test07866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07866");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256!", "!UN!!\230UN!!UN!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\253\254\256\256\253\254\256\256NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\253\254\256\256\253\254\256\256NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\253\254\256\256\253\254\256\256NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\253\254\256\256\253\254\256\256NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\253\254\256\256\253\254\256\256NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\253\254\256\256\253\254\256\256NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\253\254\256\256\253\254\256\256NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\253\254\256\256\253\254\256\256!" + "'", str2, "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\253\254\256\256\253\254\256\256NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\253\254\256\256\253\254\256\256NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\253\254\256\256\253\254\256\256NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\253\254\256\256\253\254\256\256NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\253\254\256\256\253\254\256\256NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\253\254\256\256\253\254\256\256NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\253\254\256\256\253\254\256\256NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\253\254\256\256\253\254\256\256!");
    }

    @Test
    public void test07867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07867");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07868");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "}~\200\200}~\200\200\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be}~\200\200}~\200\200\u02bb\u02bc\u02be\u02be\u02bb\u02bc\u02be\u02be!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07869");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u02bd\u02bd\ua7b2\ua7b2\u02bd\u02bd\ua7b2\ua7b2\ua7b2\ua7b2\u02bd\u02bd\ua7b2\ua7b2\u02bd\u02bd\ua7b2\ua7b2\ua7b2\ua7b2!", "RRUURRUURRUURRUURRUURRUURRUURRUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07870");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa]]]]]]]]!", "\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016eUU!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa]]]]]]]]!" + "'", str2, "\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa]]]]]]]]!");
    }

    @Test
    public void test07871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07871");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\200\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0]]!", "null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLLLLLLLLLLLLLL]]!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLLLLLLLLLLLLLL]]!");
    }

    @Test
    public void test07872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07872");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275H!]]H!]]H!]]\275H!]]H!]]H!]]!", "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\200}}`NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275null!]]null!]]null!]]\275null!]]null!]]null!]]!" + "'", str2, "\275null!]]null!]]null!]]\275null!]]null!]]null!]]!");
    }

    @Test
    public void test07873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07873");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u019e\u019c\u019c\u019e\u019c\u019c\u019e\u019c\u019c\u019e\u019c\u019c\u019e\u019c\u019c\u019e\u019c\u019c\u019e\u019c\u019c\u019e\u019c\u019c\u0346\u0348\u0348!", "nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!nullnull\340\340!!\340\340!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\300N!!\300!!\300N!!\300!!\300N!!\300N!!\300!!\300N!!\300!!\300N!!\300!!\300N!!\300N!!\300!!\300N!!\300!!\300N!!\300\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\300N!!\300!!\300N!!\300!!\300N!!\300N!!\300!!\300N!!\300!!\300N!!\300!!\300N!!\300N!!\300!!\300N!!\300!!\300N!!\300\u0346\u0348\u0348!");
    }

    @Test
    public void test07874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07874");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u037e\u037b\u037b\u037e\u037b\u037b\u037e\u037b\u037b\u037e\u037b\u037b\u037e\u037b\u037b\u037e\u037b\u037b\u037e\u037b\u037b\u037e\u037b\u037bnullnullnull!", "\u0346\u0348\u0348\u0348\u037e\u037e\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037enullnn!" + "'", str2, "\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037enullnn!");
    }

    @Test
    public void test07875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07875");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!!\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!!\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!!\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!!\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!!\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!!\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!!\336\336\335\335\336\336\335\335!!\336\336\335\335\336\336\335\335!!!!!", "!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!\220!!\200~~!\220!!\200~~!\220!!!\220!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test07876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07876");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae\u01ce\u01ce\u01ae\u01ae!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07877");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "HHHHHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07878");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!", "\200\275!!\200\275!!\200\275!!\200\275!!\200\275!!\200\275!!\200\275!!\200\275!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!" + "'", str2, "]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!");
    }

    @Test
    public void test07879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07879");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("}~\200\200}~\200\200\215\215\215\215\215\215\215\215}~\200\200}~\200\200\215\215\215\215\215\215\215\215!", "null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200\215\215\215\215\215\215\215\215}~\200\200}~\200\200\215\215\215\215\215\215\215\215!" + "'", str2, "}~\200\200}~\200\200\215\215\215\215\215\215\215\215}~\200\200}~\200\200\215\215\215\215\215\215\215\215!");
    }

    @Test
    public void test07880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07880");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\336\300\300\300\300\336\300\300!", "!~!!!~!!\220\220!~!!!~!!\220\220\220!~!!\220\220\220!~!!\220\220\220!~!!\220\220\220!~!!\220\220!~!!!~!!\220\220!~!!!~!!\220\220!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07881");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("unllunllunllunllunllunllunllunll!", "!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07882");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!!!LIJJLIJJ!!LIJJLIJJ!!LIJJLIJJ!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!LIJJLIJJ!!LIJJLIJJ!!LIJJLIJJ!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test07883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07883");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108!", "L\230\230\230\230null\226\226\230null\226\226!!!!L\230\230\230\230null\226\226\230null\226\226!!!!!!L\230\230\230\230null\226\226\230null\226\226!!!!L\230\230\230\230null\226\226\230null\226\226!!!!!!L\230\230\230\230null\226\226\230null\226\226!!!!L\230\230\230\230null\226\226\230null\226\226!!!!!!L\230\230\230\230null\226\226\230null\226\226!!!!L\230\230\230\230null\226\226\230null\226\226!!!!!!L\230\230\230\230null\226\226\230null\226\226!!!!L\230\230\230\230null\226\226\230null\226\226!!!!!!L\230\230\230\230null\226\226\230null\226\226!!!!L\230\230\230\230null\226\226\230null\226\226!!!!!!L\230\230\230\230null\226\226\230null\226\226!!!!L\230\230\230\230null\226\226\230null\226\226!!!!!!L\230\230\230\230null\226\226\230null\226\226!!!!L\230\230\230\230null\226\226\230null\226\226!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07884");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UULLUULL!", "\275LLL\275LLL\275LLL\275LLLLL\275\275LL\275\275LL\275\275LL\275\275\275LLL\275LLL\275LLL\275LLLLL\275\275LL\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLL!" + "'", str2, "LLLLLLLL!");
    }

    @Test
    public void test07885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07885");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!", "\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u01a0\u019d\u019d\u019d\u01a0\u019d\u019d\u019d!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!" + "'", str2, "\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!");
    }

    @Test
    public void test07886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07886");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnullnullnullnullnull\204\204nullnull\204\204nullnull\204\204nullnull\204\204nullnullnullnullnullnull\204\204nullnull\204\204!", "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnull\204\204!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\204\204nullnullnullnullnullnullnullnull\204\204!");
    }

    @Test
    public void test07887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07887");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106!", "OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07888");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013d\u013dnullnullnullnull!", "LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LLLL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LL\275\275LLL\275\275LLLLL\275\275LL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L\275\275\275\275L\275\275\275L\275\275\275L\275\275\275\275L\275\275\275L\275\275\275L\275\275\275L\275\275\275L\275\275\275\275L\275\275\275L\275\275\275L\275\275\275\275L\275\275\275L\275\275\275L\275\275\275L\275\275\275L\275\275\275\275L\275\275\275L\275\275\275L\275\275\275\275L\275\275\275L\275\275\275L\275\275\275L\275\275\275L\275\275\275\275L\275\275\275L\275\275\275L\275\275\275\275L\275\275\275L\275\275\275L\275\275\275L\275\275\275L\275\275\275\275L\275\275\275L\275\275\275L\275\275\275\275L\275\275\275L\275\275\275L\275\275\275L\275\275\275L\275\275\275\275L\275\275\275L\275\275\275L\275\275\275\275L\275\275\275L\275\275\275L\275\275\275L\275\275\275L\275\275\275\275L\275\275\275L\275\275\275L\275\275\275\275L\275\275\275L\275\275\275L\275\275\275L\275\275\275L\275\275\275\275L\275\275\275L\275\275\275L\275\275\275\275L\275\275\275L\275\275\275L\275\275\275L\275\275\275!" + "'", str2, "L\275\275\275\275L\275\275\275L\275\275\275L\275\275\275\275L\275\275\275L\275\275\275L\275\275\275L\275\275\275L\275\275\275\275L\275\275\275L\275\275\275L\275\275\275\275L\275\275\275L\275\275\275L\275\275\275L\275\275\275L\275\275\275\275L\275\275\275L\275\275\275L\275\275\275\275L\275\275\275L\275\275\275L\275\275\275L\275\275\275L\275\275\275\275L\275\275\275L\275\275\275L\275\275\275\275L\275\275\275L\275\275\275L\275\275\275L\275\275\275L\275\275\275\275L\275\275\275L\275\275\275L\275\275\275\275L\275\275\275L\275\275\275L\275\275\275L\275\275\275L\275\275\275\275L\275\275\275L\275\275\275L\275\275\275\275L\275\275\275L\275\275\275L\275\275\275L\275\275\275L\275\275\275\275L\275\275\275L\275\275\275L\275\275\275\275L\275\275\275L\275\275\275L\275\275\275L\275\275\275L\275\275\275\275L\275\275\275L\275\275\275L\275\275\275\275L\275\275\275L\275\275\275L\275\275\275L\275\275\275!");
    }

    @Test
    public void test07889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07889");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!\200\200\u0346\u0348\u0348!", "\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253!!\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253!!\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test07890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07890");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108]]!", "\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}}^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~}}^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test07891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07891");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253L!\253\253\253L!\253\253L!\253\253!", "\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253!" + "'", str2, "\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253\300!\253\253\253\300!\253\253\300!\253\253!");
    }

    @Test
    public void test07892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07892");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\213\213\213\u0346\u0348\u0348!", "fhnullnullfhnullnullfhnullnullfhnullnull~}}^fhnullnullfhnullnullfhnullnullfhnullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\213\213\213\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\261\262\264\264\213\213\213\u0346\u0348\u0348!");
    }

    @Test
    public void test07893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07893");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260!!!\255\256\260\260!!!!", "!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260!!!\255\256\260\260!!!!" + "'", str2, "\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260!!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260\255\256\260\260!!\255\256\260\260!!!\255\256\260\260!!!!");
    }

    @Test
    public void test07894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07894");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!!!!!!!!!!!!!!!!!", "ECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBBECBB!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test07895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07895");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!\216\254\254!l!!\216\254\254!l!!!l!!!l!!!l!!!l!!!l!!!l!!!l!!!", "\336~\300\300\336~\300\300!!\336~\300\300\336~\300\300!!\336~\300\300\336~\300\300\336~\300\300\336~\300\300!!\336~\300\300\336~\300\300!!\336~\300\300\336~\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!" + "'", str2, "!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!\216\254\254!null!!\216\254\254!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!");
    }

    @Test
    public void test07896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07896");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254!", "\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300\276!\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254!" + "'", str2, "\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254!");
    }

    @Test
    public void test07897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07897");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!]]aa]]aa!!!", "\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e\u031a\u031a\u031a\u031a\u016e\u016e\u016e\u016e!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!!!" + "'", str2, "]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!!!");
    }

    @Test
    public void test07898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07898");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("U~~~U\220~~U\220~~U\220~~U\220~~U~~~U\220~~U\220~~!", "^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```^```^```^```^```^```^```^```^```^```^```!```!```!```!```!```!```!```!```^```^```!```!```!```!```!```!```!```!```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^~~~^\220~~^\220~~^\220~~^\220~~^~~~^\220~~^\220~~!" + "'", str2, "^~~~^\220~~^\220~~^\220~~^\220~~^~~~^\220~~^\220~~!");
    }

    @Test
    public void test07899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07899");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108\u0104\u0108\u0108\u0108!", "NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!NLLLLLNNLLNN!!!!NLLLLLNNLLNN!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07900");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "\u0346\u0348\u0348\u0348\216\254\254\254\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07901");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("u}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}ll}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200u}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}llu}ll\275u}llu}ll}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200}u}ll\200\200!", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253````````\253\253````````\253\253````````\253\253````````\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253````````\253\253````````\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`}``\275`}```}```}``\275`}```}```}``\275`}```}```}``\275`}```}```}``\275`}```}```}``\275`}```}```}``\275`}```}```}``\275`}```}``}`}``\200\200}`}``\200\200}`}``\200\200}`}``\200\200}`}``\200\200}`}``\200\200}`}``\200\200}`}``\200\200`}``\275`}```}```}``\275`}```}```}``\275`}```}```}``\275`}```}```}``\275`}```}```}``\275`}```}```}``\275`}```}```}``\275`}```}``}`}``\200\200}`}``\200\200}`}``\200\200}`}``\200\200}`}``\200\200}`}``\200\200}`}``\200\200}`}``\200\200!" + "'", str2, "`}``\275`}```}```}``\275`}```}```}``\275`}```}```}``\275`}```}```}``\275`}```}```}``\275`}```}```}``\275`}```}```}``\275`}```}``}`}``\200\200}`}``\200\200}`}``\200\200}`}``\200\200}`}``\200\200}`}``\200\200}`}``\200\200}`}``\200\200`}``\275`}```}```}``\275`}```}```}``\275`}```}```}``\275`}```}```}``\275`}```}```}``\275`}```}```}``\275`}```}```}``\275`}```}``}`}``\200\200}`}``\200\200}`}``\200\200}`}``\200\200}`}``\200\200}`}``\200\200}`}``\200\200}`}``\200\200!");
    }

    @Test
    public void test07902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07902");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07903");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0220\u021d\u021d\u0346\u0348\u0348!", "\253\254\256\256nullnullnullnull\253\254\256\256nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test07904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07904");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!\253\256\256\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLL!!!LLLL!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271\266nullnull!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test07905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07905");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!", "UULLUULLUULLUULLUULLUULLUULLUULL\214\214UULLUULLUULLUULLUULLUULLUULLUULL\214\214UULLUULLUULLUULLUULLUULLUULLUULL\214\214UULLUULLUULLUULLUULLUULLUULLUULL\214\214UULLUULLUULLUULLUULLUULLUULLUULL\214\214UULLUULLUULLUULLUULLUULLUULLUULL\214\214UULLUULLUULLUULLUULLUULLUULLUULL\214\214UULLUULLUULLUULLUULLUULLUULLUULL\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!" + "'", str2, "!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!!``!!````!");
    }

    @Test
    public void test07906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07906");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230!", "FEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230!" + "'", str2, "~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230~}\200\200~}\200\200!!~~}\200\200!!~~}\200\200\230\230!!~~}\200\200!!~~}\200\200\230\230!");
    }

    @Test
    public void test07907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07907");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("`LNLLLNLLLNLL`LNLLLNLLLNLL!", "porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!porrporr!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`OROOOROOOROO`OROOOROOOROO!" + "'", str2, "`OROOOROOOROO`OROOOROOOROO!");
    }

    @Test
    public void test07908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07908");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u02eb\u02ec\u02ee\u02ee\u02cc\u02cb\u02ce\u02ce!", "!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!ULL!ULL!ULL!ULL!ULL!ULL!ULL!ULL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02ebnullnullnullnullnullnullnull!" + "'", str2, "\u02ebnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07909");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~!", "\276\276\276\276\365\366\370\370\365\366\370\370\365\366\370\370\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\365\366\370\370\365\366\370\370\365\366\370\370\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~!" + "'", str2, "\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\215\216\230\230\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~\276\276\276\276\276\276\276\276~~!");
    }

    @Test
    public void test07910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07910");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LL!", "\214!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!" + "'", str2, "nullnull!");
    }

    @Test
    public void test07911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07911");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e!", "}H\200\200}H\200\200}H\200\200}H\200\200!HHH!HHH!HHH!HHH}H\200\200}H\200\200}H\200\200}H\200\200!HHH!HHH!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031anullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031anullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07912");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("L\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLL!!L\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLL!!L\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLL!!L\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLL!!L\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLL!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLL!!L\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLL!!L\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLL!!L\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLL!!L\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLL!" + "'", str2, "L\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLL!!L\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLL!!L\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLL!!L\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLL!!L\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLL!");
    }

    @Test
    public void test07913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07913");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\260\260NN\260\260NN}}\260\260NN\260\260NN}}!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\260nullnull\260\260nullnull}}\260\260nullnull\260\260nullnull}}!" + "'", str2, "\260\260nullnull\260\260nullnull}}\260\260nullnull\260\260nullnull}}!");
    }

    @Test
    public void test07914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07914");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("hehhhehhhehhhehhhehhhehhhehhhehh!!hehhhehhhehhhehhhehhhehhhehhhehh!!hehhhehhhehhhehhhehhhehhhehhhehh!!hehhhehhhehhhehhhehhhehhhehhhehh!!hehhhehhhehhhehhhehhhehhhehhhehh!!hehhhehhhehhhehhhehhhehhhehhhehh!!hehhhehhhehhhehhhehhhehhhehhhehh!!hehhhehhhehhhehhhehhhehhhehhhehh!!!", "NHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHH!!HNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHH!!HNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHH!!HNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHH!!HNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHH!!HNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHH!!HNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHH!!HNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHH!!!" + "'", str2, "HNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHH!!HNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHH!!HNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHH!!HNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHH!!HNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHH!!HNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHH!!HNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHH!!HNHHHNHHHNHHHNHHHNHHHNHHHNHHHNHH!!!");
    }

    @Test
    public void test07915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07915");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!!!", "!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL\200}}`!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL!NLL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!!!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!!!");
    }

    @Test
    public void test07916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07916");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d!!!", "hfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnullhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnullhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnullhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnullhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnullhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnullhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnullhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!" + "'", str2, "NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!");
    }

    @Test
    public void test07917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07917");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c\u039c!", "}}}}}}}}}}}}}}}}\200}}`}}}}}}}}}}}}}}}}]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull!" + "'", str2, "`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull`}nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07918");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07919");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!NNLLNNLL!!!", "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244!!!" + "'", str2, "\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244\u0244!!!");
    }

    @Test
    public void test07920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07920");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!~UU!~UU\220\220!~UU!~UU\220\220\220!~UU\220\220\220!~UU\220\220\220!~UU\220\220\220!~UU\220\220!~UU!~UU\220\220!~UU!~UU\220\220!", "!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!!\256!TTT!!TTT!TTT\254\254\256!TTT!!TTT!TTT\254\254!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~nullnull!~nullnull\220\220!~nullnull!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220!~nullnull!~nullnull\220\220!~nullnull!~nullnull\220\220!" + "'", str2, "!~nullnull!~nullnull\220\220!~nullnull!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220!~nullnull!~nullnull\220\220!~nullnull!~nullnull\220\220!");
    }

    @Test
    public void test07921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07921");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\u0366\u0365\u0368\u0368nullnullnullnull\213\213\213\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test07922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07922");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("U\200\200\200\200]UU\200]UU\200]UU\200]UUU\200\200\200\200]UU\200]UU!", "XXXXnullnullnull\256\254\254XXXXnullnullnull\256\254\254!!XXXXnullnullnull\256\254\254XXXXnullnullnull\256\254\254!!XXXXnullnullnull\256\254\254XXXXnullnullnull\256\254\254!!XXXXnullnullnull\256\254\254XXXXnullnullnull\256\254\254!!XXXXnullnullnull\256\254\254XXXXnullnullnull\256\254\254!!XXXXnullnullnull\256\254\254XXXXnullnullnull\256\254\254!!XXXXnullnullnull\256\254\254XXXXnullnullnull\256\254\254!!XXXXnullnullnull\256\254\254XXXXnullnullnull\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "X\200\200\200\200]XX\200]XX\200]XX\200]XXX\200\200\200\200]XX\200]XX!" + "'", str2, "X\200\200\200\200]XX\200]XX\200]XX\200]XXX\200\200\200\200]XX\200]XX!");
    }

    @Test
    public void test07923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07923");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullnullnullnullnull!", "\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLUULLUULLUULLUULLUULLUULLUULLUU!" + "'", str2, "LLUULLUULLUULLUULLUULLUULLUULLUU!");
    }

    @Test
    public void test07924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07924");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnull!nullnullnull!", "}~\200\200}~\200\200!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]}~\200\200}~\200\200!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]!]!]]]!]]]!]]!]!]]]!]]]!]]!]!]]]!]]]!]]!]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]!]!]]]!]]]!]]!]!]]]!]]]!]]!" + "'", str2, "]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]!]!]]]!]]]!]]!]!]]]!]]]!]]!]!]]]!]]]!]]!]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]!]!]]]!]]]!]]!]!]]]!]]]!]]!");
    }

    @Test
    public void test07925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07925");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("L\335LLL\335LL!!L\335LLL\335LL!!L\335LLL\335LLL\335LLL\335LL!!L\335LLL\335LL!!L\335LLL\335LL!", "LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```LLLL```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`L```L``!!`L```L``!!`L```L```L```L``!!`L```L``!!`L```L``!" + "'", str2, "`L```L``!!`L```L``!!`L```L```L```L``!!`L```L``!!`L```L``!");
    }

    @Test
    public void test07926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07926");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!!nullnull!!!!!!!!nullnull!!!!!!!!!", "}~\200\200}~\200\200LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN}~\200\200}~\200\200LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~L\200\200~L\200\200!!!!!!!!~L\200\200~L\200\200!!!!!!!!!!~L\200\200~L\200\200!!!!!!!!~L\200\200~L\200\200!!!!!!!!!!~L\200\200~L\200\200!!!!!!!!~L\200\200~L\200\200!!!!!!!!!!~L\200\200~L\200\200!!!!!!!!~L\200\200~L\200\200!!!!!!!!!!~L\200\200~L\200\200!!!!!!!!~L\200\200~L\200\200!!!!!!!!!!~L\200\200~L\200\200!!!!!!!!~L\200\200~L\200\200!!!!!!!!!!~L\200\200~L\200\200!!!!!!!!~L\200\200~L\200\200!!!!!!!!!!~L\200\200~L\200\200!!!!!!!!~L\200\200~L\200\200!!!!!!!!!" + "'", str2, "!!~L\200\200~L\200\200!!!!!!!!~L\200\200~L\200\200!!!!!!!!!!~L\200\200~L\200\200!!!!!!!!~L\200\200~L\200\200!!!!!!!!!!~L\200\200~L\200\200!!!!!!!!~L\200\200~L\200\200!!!!!!!!!!~L\200\200~L\200\200!!!!!!!!~L\200\200~L\200\200!!!!!!!!!!~L\200\200~L\200\200!!!!!!!!~L\200\200~L\200\200!!!!!!!!!!~L\200\200~L\200\200!!!!!!!!~L\200\200~L\200\200!!!!!!!!!!~L\200\200~L\200\200!!!!!!!!~L\200\200~L\200\200!!!!!!!!!!~L\200\200~L\200\200!!!!!!!!~L\200\200~L\200\200!!!!!!!!!");
    }

    @Test
    public void test07927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07927");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("L~UUL~UU!!L~UUL~UU!!L~UUL~UUL~UUL~UU!!L~UUL~UU!!L~UUL~UU!", "!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!!~NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "N~LLN~LL!!N~LLN~LL!!N~LLN~LLN~LLN~LL!!N~LLN~LL!!N~LLN~LL!" + "'", str2, "N~LLN~LL!!N~LLN~LL!!N~LLN~LLN~LLN~LL!!N~LLN~LL!!N~LLN~LL!");
    }

    @Test
    public void test07928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07928");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225!", "\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e\u014e\u014e\u014c\u014c\u014e\u014e\u014c\u014c\u014e\u014e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225!" + "'", str2, "\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225\226\230\225\225!");
    }

    @Test
    public void test07929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07929");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\275\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c!", "!\253\256\256\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271\266LL!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07930");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}UNLLUNLLUNLL~}}^}UNLLUNLLUNLL]]!", "!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!luu!luu!!!luu!luu!!!luu!luu!luu!luu!luu!luu!luu!luu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}!ULL!ULL!ULL~}}^}!ULL!ULL!ULL]]!" + "'", str2, "}!ULL!ULL!ULL~}}^}!ULL!ULL!ULL]]!");
    }

    @Test
    public void test07931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07931");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!", "\ua7b0\ua7b0\ua7b0\ua7b0\ua7b0\ua7b0~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!" + "'", str2, "!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!");
    }

    @Test
    public void test07932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07932");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!", "~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200~}\200\200~}\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200^]``^]``^]``^]``^]``^]``^]``^]``}~\200\200}~\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!" + "'", str2, "\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\276\276\276\275\276\276\276\276\276\276\276\276\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!");
    }

    @Test
    public void test07933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07933");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnull!nullnullnull!", "\u0366\u0365\u0368\u0368!\253LL!\253LL!\253LL!\253LL!\253LL!\253LL!\253LL!\253LL!!!\253LL!\253LL!\253LL!\253LL!\253LL!\253LL!\253LL!\253LL!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253!LL\253\253LL\253\253LL\253\253!LL\253\253LL\253\253LL\253\253!LL\253\253LL\253\253LL\253\253!LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253!LL\253\253LL\253\253LL\253\253!LL\253\253LL\253\253LL\253\253!" + "'", str2, "LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253!LL\253\253LL\253\253LL\253\253!LL\253\253LL\253\253LL\253\253!LL\253\253LL\253\253LL\253\253!LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253LL\253\253!LL\253\253LL\253\253LL\253\253!LL\253\253LL\253\253LL\253\253!");
    }

    @Test
    public void test07934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07934");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\300\300\300\300\300\300\300\300\300\300\300\300\u02fa\300\300\300\300\300\300\300\300\300\300\300\300\u02fa\300\300\300\300\300\300\300\300\300\300\300\300\u02fa\300\300\300\300\300\300\300\300\300\300\300\300\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\300\300\300\300\300\300\300\300\300\300\300\300\u02fa\300\300\300\300\300\300\300\300\300\300\300\300!", "\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fanullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fanullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07935");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!!", "UUUUUUUU!!UUUUUUUU!!UUUUUUUUUUUUUUUU!!UUUUUUUU!!UUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!!" + "'", str2, "\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!\215\216\230\230`!!!`!!!`!!!!");
    }

    @Test
    public void test07936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07936");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07937");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u035e\u035e\u035e\u035e\u035e\u035e\u035e\u035e!", "\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~\276!~~U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!U\275!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\335nullnullnull\335\u035e\u035enull\335nullnullnull\335\u035e\u035e!!!!null\335nullnullnull\335\u035e\u035enull\335nullnullnull\335\u035e\u035e!" + "'", str2, "null\335nullnullnull\335\u035e\u035enull\335nullnullnull\335\u035e\u035e!!!!null\335nullnullnull\335\u035e\u035enull\335nullnullnull\335\u035e\u035e!");
    }

    @Test
    public void test07938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07938");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LLLLLLLL!", "!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!```!```!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````````!" + "'", str2, "````````!");
    }

    @Test
    public void test07939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07939");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLLUNLLUNLL\275\275UNLLUNLL\275\275UNLLUNLL\275\275UNLLUNLL\275\275\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLLUNLLUNLL\275\275UNLLUNLL\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test07940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07940");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\200\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230]]!", "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02faLNNNLNNNLNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\200\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230]]!" + "'", str2, "\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\200\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230\u0319\u031a\u031c\u031c\225\230\230]]!");
    }

    @Test
    public void test07941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07941");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "ijllijllijllijll!ill!ill!ill!illijllijllijllijll!ill!ill!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07942");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230\200}}`~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230~null~~\225\230\230]]!", "\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302\u02ff\u0300\u0302\u0302!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~nullnullnullnull~~\225\230\230~nullnullnullnull~~\225\230\230~nullnullnullnull~~\225\230\230~nullnullnullnull~~\225\230\230\200}}`~nullnullnullnull~~\225\230\230~nullnullnullnull~~\225\230\230~nullnullnullnull~~\225\230\230~nullnullnullnull~~\225\230\230]]!" + "'", str2, "~nullnullnullnull~~\225\230\230~nullnullnullnull~~\225\230\230~nullnullnullnull~~\225\230\230~nullnullnullnull~~\225\230\230\200}}`~nullnullnullnull~~\225\230\230~nullnullnullnull~~\225\230\230~nullnullnullnull~~\225\230\230~nullnullnullnull~~\225\230\230]]!");
    }

    @Test
    public void test07943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07943");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!nullnullHH!!nullnullnullHH!!nullnull!nullnullHH!!nullnullnullHH!!nullnull!nullnullHH!!nullnullnullHH!!nullnull!nullnullHH!!nullnullnullHH!!nullnull!nullnullHH!!nullnullnullHH!!nullnull!", "!!!!LIJJLIJJ!!LIJJLIJJ!!LIJJLIJJ!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!LIJJLIJJ!!LIJJLIJJ!!LIJJLIJJ!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!JJ!!!!!!!!!!!!!!JJ!!!!!!!!!!!!!!!!!!!JJ!!!!!!!!!!!!!!JJ!!!!!!!!!!!!!!!!!!!JJ!!!!!!!!!!!!!!JJ!!!!!!!!!!!!!!!!!!!JJ!!!!!!!!!!!!!!JJ!!!!!!!!!!!!!!!!!!!JJ!!!!!!!!!!!!!!JJ!!!!!!!!!!!" + "'", str2, "!!!!!!!!!JJ!!!!!!!!!!!!!!JJ!!!!!!!!!!!!!!!!!!!JJ!!!!!!!!!!!!!!JJ!!!!!!!!!!!!!!!!!!!JJ!!!!!!!!!!!!!!JJ!!!!!!!!!!!!!!!!!!!JJ!!!!!!!!!!!!!!JJ!!!!!!!!!!!!!!!!!!!JJ!!!!!!!!!!!!!!JJ!!!!!!!!!!!");
    }

    @Test
    public void test07944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07944");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\336~\300\300\336~\300\300!!\336~\300\300\336~\300\300!!\336~\300\300\336~\300\300\336~\300\300\336~\300\300!!\336~\300\300\336~\300\300!!\336~\300\300\336~\300\300!", "!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!!\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254\256\215\216\230\230!\215\216\230\230\215\216\230\230\254\254!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230~\216\216\230~\216\216!!\230~\216\216\230~\216\216!!\230~\216\216\230~\216\216\230~\216\216\230~\216\216!!\230~\216\216\230~\216\216!!\230~\216\216\230~\216\216!" + "'", str2, "\230~\216\216\230~\216\216!!\230~\216\216\230~\216\216!!\230~\216\216\230~\216\216\230~\216\216\230~\216\216!!\230~\216\216\230~\216\216!!\230~\216\216\230~\216\216!");
    }

    @Test
    public void test07945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07945");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!~LL!~LL\220\220!~LL!~LL\220\220\220!~LL\220\220\220!~LL\220\220\220!~LL\220\220\220!~LL\220\220!~LL!~LL\220\220!~LL!~LL\220\220!", "!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~nullnull!~nullnull\220\220!~nullnull!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220!~nullnull!~nullnull\220\220!~nullnull!~nullnull\220\220!" + "'", str2, "!~nullnull!~nullnull\220\220!~nullnull!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220!~nullnull!~nullnull\220\220!~nullnull!~nullnull\220\220!");
    }

    @Test
    public void test07946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07946");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!HHHH!", "null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275!!null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275!!null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275!!null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275!!null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275null\220\275\275\200~~null\220\275\275\200~~null\220\275\275null\220\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\200\200\200\200!" + "'", str2, "!\200\200\200\200!");
    }

    @Test
    public void test07947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07947");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!", "ULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null\253\260\260null\253\260\260null\253\260\260null\253\260\260!!!null\253\260\260null\253\260\260null\253\260\260null\253\260\260!!!!!null\253\260\260null\253\260\260null\253\260\260null\253\260\260!!!null\253\260\260null\253\260\260null\253\260\260null\253\260\260!!!!!null\253\260\260null\253\260\260null\253\260\260null\253\260\260!!!null\253\260\260null\253\260\260null\253\260\260null\253\260\260!!!null\253\260\260null\253\260\260null\253\260\260null\253\260\260!!!null\253\260\260null\253\260\260null\253\260\260null\253\260\260!!!!!null\253\260\260null\253\260\260null\253\260\260null\253\260\260!!!null\253\260\260null\253\260\260null\253\260\260null\253\260\260!!!!!null\253\260\260null\253\260\260null\253\260\260null\253\260\260!!!null\253\260\260null\253\260\260null\253\260\260null\253\260\260!!!" + "'", str2, "!null\253\260\260null\253\260\260null\253\260\260null\253\260\260!!!null\253\260\260null\253\260\260null\253\260\260null\253\260\260!!!!!null\253\260\260null\253\260\260null\253\260\260null\253\260\260!!!null\253\260\260null\253\260\260null\253\260\260null\253\260\260!!!!!null\253\260\260null\253\260\260null\253\260\260null\253\260\260!!!null\253\260\260null\253\260\260null\253\260\260null\253\260\260!!!null\253\260\260null\253\260\260null\253\260\260null\253\260\260!!!null\253\260\260null\253\260\260null\253\260\260null\253\260\260!!!!!null\253\260\260null\253\260\260null\253\260\260null\253\260\260!!!null\253\260\260null\253\260\260null\253\260\260null\253\260\260!!!!!null\253\260\260null\253\260\260null\253\260\260null\253\260\260!!!null\253\260\260null\253\260\260null\253\260\260null\253\260\260!!!");
    }

    @Test
    public void test07948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07948");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("RRRRRRRR!", "\u0420\u0420\u0420\u0420!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07949");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NULLNULL!!NULLNULL!!NULLNULLNULLNULL!!NULLNULL!!NULLNULL!", "]nullnull!!!!\275]nullnull!!!!]nullnull!!!!]nullnull!!!!\275]nullnull!!!!]nullnull!!!!]nullnull!!!!\275]nullnull!!!!]nullnull!!!!]nullnull!!!!\275]nullnull!!!!]nullnull!!!!]nullnull!!!!\275]nullnull!!!!]nullnull!!!!]nullnull!!!!\275]nullnull!!!!]nullnull!!!!]nullnull!!!!\275]nullnull!!!!]nullnull!!!!]nullnull!!!!\275\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e]nullnull!!!!\275]nullnull!!!!]nullnull!!!!]nullnull!!!!\275]nullnull!!!!]nullnull!!!!]nullnull!!!!\275]nullnull!!!!]nullnull!!!!]nullnull!!!!\275]nullnull!!!!]nullnull!!!!]nullnull!!!!\275]nullnull!!!!]nullnull!!!!]nullnull!!!!\275]nullnull!!!!]nullnull!!!!]nullnull!!!!\275]nullnull!!!!]nullnull!!!!]nullnull!!!!\275\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275U!!\275U!!!!\275U!!\275U!!!!\275U!!\275U!!\275U!!\275U!!!!\275U!!\275U!!!!\275U!!\275U!!!" + "'", str2, "\275U!!\275U!!!!\275U!!\275U!!!!\275U!!\275U!!\275U!!\275U!!!!\275U!!\275U!!!!\275U!!\275U!!!");
    }

    @Test
    public void test07950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07950");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```^```^```^```^```^```^```^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX^```^```!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU\253\254\256\256\253\254\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```^```^```^```^```^```^```^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```^```^```^```^```^```^```^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```^```^```^```^```^```^```^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```^```^```^```^```^```^```^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```^```^```^```^```^```^```^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```^```^```^```^```^```^```^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```^```^```^```^```^```^```^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```^```^```^```^```^```^```^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!" + "'", str2, "^```^```^```^```^```^```^```^```^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```^```^```^```^```^```^```^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```^```^```^```^```^```^```^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```^```^```^```^```^```^```^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```^```^```^```^```^```^```^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```^```^```^```^```^```^```^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```^```^```^```^```^```^```^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```^```^```^```^```^```^```^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU^```^```!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!");
    }

    @Test
    public void test07951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07951");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!", "nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```nullnullnullnull!!!```!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa!" + "'", str2, "\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa\u02fa!");
    }

    @Test
    public void test07952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07952");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH!!\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH!!\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH!!\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH!!\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH!", "\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL!!\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL!!\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL!!\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL!!\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL!" + "'", str2, "\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL!!\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL!!\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL!!\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL!!\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL\275LLL\275LLLLL!");
    }

    @Test
    public void test07953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07953");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220!", "\u0366\u0365\u0368\u0368\u0345\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220!" + "'", str2, "nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220!");
    }

    @Test
    public void test07954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07954");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!", "\u01a0\u0196\u019d\u019dnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "qrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrtt\200}}`qrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrtt]]!" + "'", str2, "qrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrtt\200}}`qrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrttqrtt]]!");
    }

    @Test
    public void test07955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07955");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204!", "\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028enullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204!" + "'", str2, "\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204!");
    }

    @Test
    public void test07956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07956");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("}~\200\200}~\200\200LUELLUELLUELL^LUELLUELLUELLLUELLUELLUELLLUELLUELLUELL^LUELLUELLUELLLUELLUELLUELL}~\200\200}~\200\200LUELLUELLUELL^LUELLUELLUELLLUELLUELLUELLLUELLUELLUELL^LUELLUELLUELLLUELLUELLUELL!", "``!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!````!!``!!``!!``!!``!!``!!``!!``!!!!``!!``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull^nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07957");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnullnullnullnullnull\273nullnull!", "\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\325nullnullnull\325nullnullnull\275\275\325nullnullnull\325nullnullnull\275\275\325nullnullnull\325nullnullnull\275\275\325nullnullnull\325nullnullnull\275\275\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\275\325nullnullnull\325nullnullnull\325nullnullnull\325nullnullnull\325nullnullnull\275\275\325nullnullnull\325nullnullnull\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUU!" + "'", str2, "LLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUULLUULLUULLUULLUU\273LLUULLUU!");
    }

    @Test
    public void test07958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07958");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275``UU``UU``UU\276``UU\275\275!", "mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!mnpp!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275``nullnull``nullnull``nullnull\276``nullnull\275\275!" + "'", str2, "\275``nullnull``nullnull``nullnull\276``nullnull\275\275!");
    }

    @Test
    public void test07959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07959");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("h~ufllufllh~ufllufll!!h~ufllufllh~ufllufll!!h~ufllufllh~ufllufllh~ufllufllh~ufllufll!!h~ufllufllh~ufllufll!!h~ufllufllh~ufllufll!", "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null~\352null\354\354\352null\354\354null~\352null\354\354\352null\354\354!!null~\352null\354\354\352null\354\354null~\352null\354\354\352null\354\354!!null~\352null\354\354\352null\354\354null~\352null\354\354\352null\354\354null~\352null\354\354\352null\354\354null~\352null\354\354\352null\354\354!!null~\352null\354\354\352null\354\354null~\352null\354\354\352null\354\354!!null~\352null\354\354\352null\354\354null~\352null\354\354\352null\354\354!" + "'", str2, "null~\352null\354\354\352null\354\354null~\352null\354\354\352null\354\354!!null~\352null\354\354\352null\354\354null~\352null\354\354\352null\354\354!!null~\352null\354\354\352null\354\354null~\352null\354\354\352null\354\354null~\352null\354\354\352null\354\354null~\352null\354\354\352null\354\354!!null~\352null\354\354\352null\354\354null~\352null\354\354\352null\354\354!!null~\352null\354\354\352null\354\354null~\352null\354\354\352null\354\354!");
    }

    @Test
    public void test07960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07960");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!!", "\u0128\u0126\u0126\u0108\u0106\u0106!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test07961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07961");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275L!]]L!]]L!]]\275L!]]L!]]L!]]!", "!hee!hee!!!hee!hee!!!hee!hee!hee!hee!hee!hee!hee!hee!hee!hee!!!hee!hee!!!hee!hee!hee!hee!hee!hee!hee!hee!hee!hee!!!hee!hee!!!hee!hee!hee!hee!hee!hee!hee!hee!hee!hee!!!hee!hee!!!hee!hee!hee!hee!hee!hee!hee!hee!hee!hee!!!hee!hee!!!hee!hee!hee!hee!hee!hee!hee!hee!hee!hee!!!hee!hee!!!hee!hee!hee!hee!hee!hee!hee!hee!hee!hee!!!hee!hee!!!hee!hee!hee!hee!hee!hee!hee!hee!hee!hee!!!hee!hee!!!hee!hee!hee!hee!hee!hee!hee!hee!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275null!]]null!]]null!]]\275null!]]null!]]null!]]!" + "'", str2, "\275null!]]null!]]null!]]\275null!]]null!]]null!]]!");
    }

    @Test
    public void test07962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07962");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]!", "\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]!" + "'", str2, "]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]]`]]!");
    }

    @Test
    public void test07963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07963");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NLUUNLUU!", "HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```HHHH```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````````!" + "'", str2, "````````!");
    }

    @Test
    public void test07964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07964");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~!!F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~!!F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~!!F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~!!F!~~F!~~F!~~F!~~F!~~F!~~F!~~F!~~!", "NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```NULLNULLNULLNULL```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~!!U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~!!U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~!!U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~!!U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~!" + "'", str2, "U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~!!U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~!!U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~!!U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~!!U!~~U!~~U!~~U!~~U!~~U!~~U!~~U!~~!");
    }

    @Test
    public void test07965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07965");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275nullnull\200\200nullnull\200\200nullnull\200\200\276nullnull\200\200\275\275!", "\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200\276nullnullnullnullnullnullnullnull\200\200\275\275!" + "'", str2, "\275nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200nullnullnullnullnullnullnullnull\200\200\276nullnullnullnullnullnullnullnull\200\200\275\275!");
    }

    @Test
    public void test07966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07966");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d\u017d!!!", "\u0129\u0129\u0129\u0129\u0146\u0147\u0149\u0149\u0146\u0147\u0149\u0149\u0146\u0147\u0149\u0149\u0146\u0147\u0149\u0149\u0129\u0129\u0129\u0129\u0146\u0147\u0149\u0149\u0146\u0147\u0149\u0149!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test07967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07967");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test07968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07968");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!", "\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!\276\276\236\236\276\276\236\236\276\276\236\236\276\276\236\236!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!" + "'", str2, "!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!");
    }

    @Test
    public void test07969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07969");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\316\316\316\316\236\276\276\316\316\316\316\236\276\276!!\316\316\316\316\236\276\276\316\316\316\316\236\276\276!!\316\316\316\316\236\276\276\316\316\316\316\236\276\276\316\316\316\316\236\276\276\316\316\316\316\236\276\276!!\316\316\316\316\236\276\276\316\316\316\316\236\276\276!!\316\316\316\316\236\276\276\316\316\316\316\236\276\276!", "\276\276!!\276\276!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276!" + "'", str2, "nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276!");
    }

    @Test
    public void test07970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07970");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("fehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehh!", "\u014b!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07971");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("fehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehh!", "!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07972");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("null\200\200\200null\200\200\200]]null\200\200\200null\200\200\200]]null\200\200\200null\200\200\200]]null\200\200\200null\200\200\200]]~}}^null\200\200\200null\200\200\200]]null\200\200\200null\200\200\200]]null\200\200\200null\200\200\200]]null\200\200\200null\200\200\200]]]]!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348~~\200\200\200\u0348\u0348~~\200\200\200\u0348\u0348~~\200\200\200\u0348\u0348~~\200\200\200\u0348\u0348~~\200\200\200\u0348\u0348~~\200\200\200\u0348\u0348~~\200\200\200\u0348\u0348~~\200\200\200\u0348\u0348~~\200\200\200\u0348\u0348~~\200\200\200\u0348\u0348~~\200\200\200\u0348\u0348~~\200\200\200\u0348\u0348~~\200\200\200\u0348\u0348~~\200\200\200\u0348\u0348~~\200\200\200\u0348\u0348~~\200\200\200]]]]!" + "'", str2, "\u0348\u0348~~\200\200\200\u0348\u0348~~\200\200\200\u0348\u0348~~\200\200\200\u0348\u0348~~\200\200\200\u0348\u0348~~\200\200\200\u0348\u0348~~\200\200\200\u0348\u0348~~\200\200\200\u0348\u0348~~\200\200\200\u0348\u0348~~\200\200\200\u0348\u0348~~\200\200\200\u0348\u0348~~\200\200\200\u0348\u0348~~\200\200\200\u0348\u0348~~\200\200\200\u0348\u0348~~\200\200\200\u0348\u0348~~\200\200\200\u0348\u0348~~\200\200\200]]]]!");
    }

    @Test
    public void test07973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07973");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!null!!!null!!!!!null!!!null!!!!!null!!!null!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!", "\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!" + "'", str2, "!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!");
    }

    @Test
    public void test07974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07974");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLLNULLNULLUNLLUNLL!", "~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!" + "'", str2, "!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!");
    }

    @Test
    public void test07975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07975");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u01ac\u01ac\u01ac\u01ac\u01ac\u01ac^^!", "LLUULNUULNUULNUULLUULNUULNUULNUULLUULNUULNUULNUULLUULNUULNUULNUULLUULNUULNUULNUULLUULNUULNUULNUULLUULNUULNUULNUULLUULNUULNUULNUU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^^^^]null^^]null^^]null^^]null^^^^^^]null^^]null^^!" + "'", str2, "^^^^]null^^]null^^]null^^]null^^^^^^]null^^]null^^!");
    }

    @Test
    public void test07976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07976");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("u`uu`UUU!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnull}~\200\200}~\200\200nullnull}~\200\200}~\200\200nullnull}~\200\200}~\200\200\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}`}}`}}}!" + "'", str2, "}`}}`}}}!");
    }

    @Test
    public void test07977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07977");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("null!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!", "H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!" + "'", str2, "!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!!hhh!hhh!hhh!hhh!hhh!hhh!hhh!hhh!");
    }

    @Test
    public void test07978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07978");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200!", "}`}}`}}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200!" + "'", str2, "\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200!");
    }

    @Test
    public void test07979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07979");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("L!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LL!", "\336~\300\300\336~\300\300!!\336~\300\300\336~\300\300!!\336~\300\300\336~\300\300\336~\300\300\336~\300\300!!\336~\300\300\336~\300\300!!\336~\300\300\336~\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test07980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07980");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275LLL\275LLL\275LLL\275LLLLL\275\275LL\275\275LL\275\275LL\275\275\275LLL\275LLL\275LLL\275LLLLL\275\275LL\275\275!", "\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016enullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\u03c0\u03c0\u03c0\275\u03c0\u03c0\u03c0\275\u03c0\u03c0\u03c0\275\u03c0\u03c0\u03c0\u03c0\u03c0\275\275\u03c0\u03c0\275\275\u03c0\u03c0\275\275\u03c0\u03c0\275\275\275\u03c0\u03c0\u03c0\275\u03c0\u03c0\u03c0\275\u03c0\u03c0\u03c0\275\u03c0\u03c0\u03c0\u03c0\u03c0\275\275\u03c0\u03c0\275\275!" + "'", str2, "\275\u03c0\u03c0\u03c0\275\u03c0\u03c0\u03c0\275\u03c0\u03c0\u03c0\275\u03c0\u03c0\u03c0\u03c0\u03c0\275\275\u03c0\u03c0\275\275\u03c0\u03c0\275\275\u03c0\u03c0\275\275\275\u03c0\u03c0\u03c0\275\u03c0\u03c0\u03c0\275\u03c0\u03c0\u03c0\275\u03c0\u03c0\u03c0\u03c0\u03c0\275\275\u03c0\u03c0\275\275!");
    }

    @Test
    public void test07981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07981");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!", "\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016eUU!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!" + "'", str2, "\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!");
    }

    @Test
    public void test07982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07982");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220!", "H\200\200\200H\200\200\200]]H\200\200\200H\200\200\200]]H\200\200\200H\200\200\200]]H\200\200\200H\200\200\200]]~}}^H\200\200\200H\200\200\200]]H\200\200\200H\200\200\200]]H\200\200\200H\200\200\200]]H\200\200\200H\200\200\200]]]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220!" + "'", str2, "nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220nullnullnullnull\213\220\220!");
    }

    @Test
    public void test07983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07983");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225nullnull\371\371nullnull\371\371\225\225!", "H\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHH!!H\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHH!!H\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHH!!H\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHH!!H\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275HHH\275HHHHH\275HHH\275HHHHH\225\225\275HHH\275HHHHH\275HHH\275HHHHH\225\225\275HHH\275HHHHH\275HHH\275HHHHH\225\225\275HHH\275HHHHH\275HHH\275HHHHH\225\225\275HHH\275HHHHH\275HHH\275HHHHH\225\225\275HHH\275HHHHH\275HHH\275HHHHH\225\225\275HHH\275HHHHH\275HHH\275HHHHH\225\225\275HHH\275HHHHH\275HHH\275HHHHH\225\225!" + "'", str2, "\275HHH\275HHHHH\275HHH\275HHHHH\225\225\275HHH\275HHHHH\275HHH\275HHHHH\225\225\275HHH\275HHHHH\275HHH\275HHHHH\225\225\275HHH\275HHHHH\275HHH\275HHHHH\225\225\275HHH\275HHHHH\275HHH\275HHHHH\225\225\275HHH\275HHHHH\275HHH\275HHHHH\225\225\275HHH\275HHHHH\275HHH\275HHHHH\225\225\275HHH\275HHHHH\275HHH\275HHHHH\225\225!");
    }

    @Test
    public void test07984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07984");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!", "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!" + "'", str2, "!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!!!\253\253!!\253\253!!!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!!\253\253!");
    }

    @Test
    public void test07985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07985");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("FEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHH!", "NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!!NNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NNNNNN!NN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!" + "'", str2, "N!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NN!");
    }

    @Test
    public void test07986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07986");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}\300!!!\200\200}\300!!!\200\200}\300!!!\200\200}\300!!!\200\200\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~}\300!!!\200\200}\300!!!\200\200}\300!!!\200\200}\300!!!\200\200\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~\300!~~!", "!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!!]]!!]]LL]]LL]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}]!!!\200\200}]!!!\200\200}]!!!\200\200}]!!!\200\200]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~}]!!!\200\200}]!!!\200\200}]!!!\200\200}]!!!\200\200]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~!" + "'", str2, "}]!!!\200\200}]!!!\200\200}]!!!\200\200}]!!!\200\200]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~}]!!!\200\200}]!!!\200\200}]!!!\200\200}]!!!\200\200]!~~]!~~]!~~]!~~]!~~]!~~]!~~]!~~!");
    }

    @Test
    public void test07987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07987");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\276\276\276\276NLLLNLLLNLLL\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276NLLLNLLLNLLL\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!", "null\225\230\230null\225\230\230null\225\230\230null\225\230\230\200}}`null\225\230\230null\225\230\230null\225\230\230null\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276\276\276\230\225\225\225\230\225\225\225\230\225\225\225\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\230\225\225\225\230\225\225\225\230\225\225\225\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!" + "'", str2, "\276\276\276\276\230\225\225\225\230\225\225\225\230\225\225\225\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\230\225\225\225\230\225\225\225\230\225\225\225\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!");
    }

    @Test
    public void test07988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07988");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("]]\256\256]]\256\256!!]]\256\256]]\256\256!!]]\256\256]]\256\256]]\256\256]]\256\256!!]]\256\256]]\256\256!!]]\256\256]]\256\256!", "UUUU\236\276\276UUUU\236\276\276!!UUUU\236\276\276UUUU\236\276\276!!UUUU\236\276\276UUUU\236\276\276UUUU\236\276\276UUUU\236\276\276!!UUUU\236\276\276UUUU\236\276\276!!UUUU\236\276\276UUUU\236\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]\256\256]]\256\256!!]]\256\256]]\256\256!!]]\256\256]]\256\256]]\256\256]]\256\256!!]]\256\256]]\256\256!!]]\256\256]]\256\256!" + "'", str2, "]]\256\256]]\256\256!!]]\256\256]]\256\256!!]]\256\256]]\256\256]]\256\256]]\256\256!!]]\256\256]]\256\256!!]]\256\256]]\256\256!");
    }

    @Test
    public void test07989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07989");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("FF!", "}~\200\200}~\200\200^^]]^^]]}~\200\200}~\200\200^^]]^^]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~!" + "'", str2, "~~!");
    }

    @Test
    public void test07990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07990");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("null`nullnull`nullnullnull!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull`nullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull`nullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07991");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!", "\275\u03c0\u03c0\u03c0\275\u03c0\u03c0\u03c0\275\u03c0\u03c0\u03c0\275\u03c0\u03c0\u03c0\u03c0\u03c0\275\275\u03c0\u03c0\275\275\u03c0\u03c0\275\275\u03c0\u03c0\275\275\275\u03c0\u03c0\u03c0\275\u03c0\u03c0\u03c0\275\u03c0\u03c0\u03c0\275\u03c0\u03c0\u03c0\u03c0\u03c0\275\275\u03c0\u03c0\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!" + "'", str2, "!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!");
    }

    @Test
    public void test07992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07992");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnullnullnullZWXXZWXXZWXXZWXXnullnullnullnullZWXXZWXX!", "\u0366\u0365\u0368\u0368\220\220!!\220\220!!\220\220!!\220\220\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07993");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("`UNUUUNUUUNUU`UNUUUNUUUNUU!", "UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`UUUUUUUUUUUU`UUUUUUUUUUUU!" + "'", str2, "`UUUUUUUUUUUU`UUUUUUUUUUUU!");
    }

    @Test
    public void test07994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07994");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc\u01de\u01dc\u01dc\u01dc!", "!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!!!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!!!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!!!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!!!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!L!!!L!!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test07995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07995");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB!!``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB!!``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB!!``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB!!``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB``BB!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07996");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\316\316\316\316\236\276\276\316\316\316\316\236\276\276!!\316\316\316\316\236\276\276\316\316\316\316\236\276\276!!\316\316\316\316\236\276\276\316\316\316\316\236\276\276\316\316\316\316\236\276\276\316\316\316\316\236\276\276!!\316\316\316\316\236\276\276\316\316\316\316\236\276\276!!\316\316\316\316\236\276\276\316\316\316\316\236\276\276!", "!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276!" + "'", str2, "nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276!!nullnullnullnull\236\276\276nullnullnullnull\236\276\276!");
    }

    @Test
    public void test07997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07997");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200!", "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200!" + "'", str2, "~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200~~\200\200!");
    }

    @Test
    public void test07998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07998");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("N~LLN~LL!!N~LLN~LL!!N~LLN~LLN~LLN~LL!!N~LLN~LL!!N~LLN~LL!", "\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnullnull~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnull!" + "'", str2, "null~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnullnull~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnull!");
    }

    @Test
    public void test07999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07999");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!l!", "\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108\275\200\u0108\u0108!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!" + "'", str2, "!null!");
    }

    @Test
    public void test08000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test08000");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("FF!!FF!!!", "\275H!]]H!]]H!]]\275H!]]H!]]H!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!!");
    }
}
