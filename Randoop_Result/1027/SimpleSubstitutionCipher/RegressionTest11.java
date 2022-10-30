package SimpleSubstitutionCipher;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

    public static boolean debug = false;

    @Test
    public void test05501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05501");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!!", "hfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnullhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnullhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnullhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnullhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnullhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnullhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnullhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhhfhhnullnullhfhhhfhhnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!!" + "'", str2, "\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!\275\276!!!");
    }

    @Test
    public void test05502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05502");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u014e\u014e\u014e\u014e\u014e\u014e!!!", "\u041c\u041e\u041b\u041b\u041c\u041e\u041b\u041b\u041c\u041e\u041b\u041b\u041c\u041e\u041b\u041b!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnullnull!!!!nullnullnull!!!" + "'", str2, "!!nullnullnull!!!!nullnullnull!!!");
    }

    @Test
    public void test05503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05503");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("`!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull`!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!", "`JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ`JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull`!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "`!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull`!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05504");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("null~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnullnull~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnull!", "\u029e\u0346\u0346\ua7b0!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05505");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220!!!", "\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\u0128\214\214!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!" + "'", str2, "N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!N\220!!\200~~N\220!!\200~~N\220!!N\220!!!");
    }

    @Test
    public void test05506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05506");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!", "!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!!!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!\336\336\336!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!" + "'", str2, "\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!");
    }

    @Test
    public void test05507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05507");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("ULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLLULLLULLLLL!", "`\275```\275```\275```\275```\275```\275```\275```\275\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368`\275```\275```\275```\275```\275```\275```\275```\275\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368\u0365\u0368\u0368!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05508");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!", "fhnullnullfhnullnullfhnullnullfhnullnull~}}^fhnullnullfhnullnullfhnullnullfhnullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!!!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!!!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!!!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!!!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!" + "'", str2, "!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!!!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!!!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!!!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!!!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!HL^^HL^^HL^^!");
    }

    @Test
    public void test05509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05509");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\u03dd\u03e0\u03e0\u03dd\u03e0\u03e0\u03dd\u03e0\u03e0\u03dd\u03e0\u03e0\u03dd\u03e0\u03e0\u03dd\u03e0\u03e0!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test05510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05510");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05511");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}nullnullnull~}}^}nullnullnull]]!", "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}UNLLUNLLUNLL~}}^}UNLLUNLLUNLL]]!" + "'", str2, "}UNLLUNLLUNLL~}}^}UNLLUNLLUNLL]]!");
    }

    @Test
    public void test05512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05512");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!!!", "!\276\276\276\276\276!!\276\276!!\276\276!!\276\276!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!!!" + "'", str2, "!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!!!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!\276!!!!!");
    }

    @Test
    public void test05513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05513");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176\u0176!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05514");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016e\u016c\u016b\u016e\u016enullnull!", "rrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPP!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05515");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("`NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL`NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!", "!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL`!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!" + "'", str2, "`!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL`!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!");
    }

    @Test
    public void test05516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05516");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!", "\275null~}}null~}}\200\200null~}}null~}}\200\200null~}}null~}}\200\200\276null~}}null~}}\200\200\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!" + "'", str2, "!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!");
    }

    @Test
    public void test05517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05517");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106\u0105\u0106\u0106\u0106!", "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05518");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("]AAAAA]]AA]]AA]]AA]]]AAAAA]]AA]]!", "NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!!NULLNULLNULLNULLNULLNULLNULLNULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]nullnullnullnullnull]]nullnull]]nullnull]]nullnull]]]nullnullnullnullnull]]nullnull]]!" + "'", str2, "]nullnullnullnullnull]]nullnull]]nullnull]]nullnull]]]nullnullnullnullnull]]nullnull]]!");
    }

    @Test
    public void test05519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05519");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("F!HHF!HHF!HHF!HHF!HHF!HHF!HHF!HH!", "\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test05520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05520");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200\u0200null!nullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05521");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d\u01a0\u0196\u019d\u019d!", "\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366\u029e\u0346\u029e\u0346\u0366\u0366!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05522");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!!", "FF]]FF]]FF]]FF]]~}}^FF]]FF]]FF]]FF]]]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!!" + "'", str2, "nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!!");
    }

    @Test
    public void test05523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05523");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\200\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126]]!", "!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!!U!!!U!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test05524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05524");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("FHHHnullnullnullnullFHHHnullnull!", "nullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXX!!nullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXX!!nullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXX!!nullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXX!!nullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXXnullnullXXXXXXXX!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360!" + "'", str2, "\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360\u035d\u035e\u0360\u0360!");
    }

    @Test
    public void test05525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05525");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300!", "\275HHHHHHHHHHHH\275HHHHHHHHHHHH\275HHHHHHHHHHHH\275HHHHHHHHHHHHHHHHHHHH\275\275HHHHHHHH\275\275HHHHHHHH\275\275HHHHHHHH\275\275\275HHHHHHHHHHHH\275HHHHHHHHHHHH\275HHHHHHHHHHHH\275HHHHHHHHHHHHHHHHHHHH\275\275HHHHHHHH\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05526");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("u\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluuu\375llu\375llu\375llu\375llu\375llu\375llu\375llu\375lluu!", "UBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!" + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
    }

    @Test
    public void test05527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05527");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("null~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnullnull~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnull!", "!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!!nullnullnullnull~nullnullnullnullnullnullnullnullnullnullnullnull~nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05528");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("`nullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnull!", "ulllulll!!ulllulllulllulllulllulllulllulll!!ulllulllulllulllulllulll!!ulllulll!!ulllulllulllulllulllulllulllulll!!ulllulllulllulllulllulll!!ulllulll!!ulllulllulllulllulllulllulllulll!!ulllulllulllulllulllulll!!ulllulll!!ulllulllulllulllulllulllulllulll!!ulllulllulllulllulllulll!!ulllulll!!ulllulllulllulllulllulllulllulll!!ulllulllulllulllulllulll!!ulllulll!!ulllulllulllulllulllulllulllulll!!ulllulllulllulllulllulll!!ulllulll!!ulllulllulllulllulllulllulllulll!!ulllulllulllulllulllulll!!ulllulll!!ulllulllulllulllulllulllulllulll!!ulllulllulllulllulllulll!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!`LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!!" + "'", str2, "`LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!`LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!LU!!!");
    }

    @Test
    public void test05529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05529");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!xxx!xxx!xxx!xxx!xxx!xxx!xxx!xxx!!!", "!\253\256\256\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!");
    }

    @Test
    public void test05530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05530");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214RRPPRRPPnullP\214\214nullP\214\214!", "!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!!\216\216!!!\216\216!!\216\216!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnull\214\214!");
    }

    @Test
    public void test05531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05531");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u02bd\u02bd\ua7b2\ua7b2\u02bd\u02bd\ua7b2\ua7b2\ua7b2\ua7b2\u02bd\u02bd\ua7b2\ua7b2\u02bd\u02bd\ua7b2\ua7b2\ua7b2\ua7b2!", "\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!\300!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05532");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336~}\200\200~}\200\200nullnull\336\336nullnull\336\336!", "LNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULLLNUULNUULNUULNUULNUULNUULNUULNUULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200UUNNUUNNNNUUNNUUNNNN~}\200\200~}\200\200UUNNUUNNNNUUNNUUNNNN~}\200\200~}\200\200UUNNUUNNNNUUNNUUNNNN~}\200\200~}\200\200UUNNUUNNNNUUNNUUNNNN~}\200\200~}\200\200UUNNUUNNNNUUNNUUNNNN~}\200\200~}\200\200UUNNUUNNNNUUNNUUNNNN~}\200\200~}\200\200UUNNUUNNNNUUNNUUNNNN~}\200\200~}\200\200UUNNUUNNNNUUNNUUNNNN!" + "'", str2, "~}\200\200~}\200\200UUNNUUNNNNUUNNUUNNNN~}\200\200~}\200\200UUNNUUNNNNUUNNUUNNNN~}\200\200~}\200\200UUNNUUNNNNUUNNUUNNNN~}\200\200~}\200\200UUNNUUNNNNUUNNUUNNNN~}\200\200~}\200\200UUNNUUNNNNUUNNUUNNNN~}\200\200~}\200\200UUNNUUNNNNUUNNUUNNNN~}\200\200~}\200\200UUNNUUNNNNUUNNUUNNNN~}\200\200~}\200\200UUNNUUNNNNUUNNUUNNNN!");
    }

    @Test
    public void test05533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05533");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!~!!!~!!!!!~!!!~!!!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~!!!~!!!!!~!!!~!!!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!" + "'", str2, "!~!!!~!!!!!~!!!~!!!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!");
    }

    @Test
    public void test05534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05534");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!~\200null~~\200null~~!~\200null~~\200null~~!!!~\200null~~\200null~~!~\200null~~\200null~~!!!~\200null~~\200null~~!~\200null~~\200null~~!~\200null~~\200null~~!~\200null~~\200null~~!!!~\200null~~\200null~~!~\200null~~\200null~~!!!~\200null~~\200null~~!~\200null~~\200null~~!", "nullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!!!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!!!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!!!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!!!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!" + "'", str2, "!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!!!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!!!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!!!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!!!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!~\200\u0183\u0184\u0188\u0188~~\200\u0183\u0184\u0188\u0188~~!");
    }

    @Test
    public void test05535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05535");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullqnullnullnullqnullnull}~\200\200}~\200\200nullqnullnullnullqnullnull}~\200\200}~\200\200nullqnullnullnullqnullnull}~\200\200}~\200\200\u0348\u0346\u0346!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200UNLLNUNLLUNLLUNLLNUNLLUNLL}~\200\200}~\200\200UNLLNUNLLUNLLUNLLNUNLLUNLL}~\200\200}~\200\200UNLLNUNLLUNLLUNLLNUNLLUNLL}~\200\200}~\200\200\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200UNLLNUNLLUNLLUNLLNUNLLUNLL}~\200\200}~\200\200UNLLNUNLLUNLLUNLLNUNLLUNLL}~\200\200}~\200\200UNLLNUNLLUNLLUNLLNUNLLUNLL}~\200\200}~\200\200\u0348\u0346\u0346!");
    }

    @Test
    public void test05536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05536");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LLLLLLLLLLLLLLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLLLLLLLLLLLLLL]]!", "]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu!!]]uluuuluu]]uluuuluu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\200}}`\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276]]!" + "'", str2, "\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\200}}`\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276]]!");
    }

    @Test
    public void test05537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05537");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("JL\225\225JL\225\225\225\225JL\225\225JL\225\225\225\225!!JL\225\225JL\225\225\225\225JL\225\225JL\225\225\225\225!!JL\225\225JL\225\225\225\225JL\225\225JL\225\225\225\225!!JL\225\225JL\225\225\225\225JL\225\225JL\225\225\225\225!!JL\225\225JL\225\225\225\225JL\225\225JL\225\225\225\225!!JL\225\225JL\225\225\225\225JL\225\225JL\225\225\225\225!!JL\225\225JL\225\225\225\225JL\225\225JL\225\225\225\225!!JL\225\225JL\225\225\225\225JL\225\225JL\225\225\225\225!!!", "\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!\256\256\254\254\256\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!" + "'", str2, "!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!\256\225\225!\256\225\225\225\225!\256\225\225!\256\225\225\225\225!!!");
    }

    @Test
    public void test05538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05538");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241!", "\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241!" + "'", str2, "\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241\241!");
    }

    @Test
    public void test05539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05539");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0300\u0300\u02fe\u02fe\u0300\u0300\u02fe\u02fe\u0300\u0300\u02fe\u02fe\u0300\u0300\u02fe\u02fe\u0300\u0300\u02fe\u02fe\u0300\u0300\u02fe\u02fe!", "\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198\u0195\u0196\u0198\u0198nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0300\u0300\u02fe\u02fe\u0300\u0300\u02fe\u02fe\u0300\u0300\u02fe\u02fe\u0300\u0300\u02fe\u02fe\u0300\u0300\u02fe\u02fe\u0300\u0300\u02fe\u02fe!" + "'", str2, "\u0300\u0300\u02fe\u02fe\u0300\u0300\u02fe\u02fe\u0300\u0300\u02fe\u02fe\u0300\u0300\u02fe\u02fe\u0300\u0300\u02fe\u02fe\u0300\u0300\u02fe\u02fe!");
    }

    @Test
    public void test05540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05540");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220\u012b\220!!\200\u012b\220!!\200\u012b\220\u012b\220!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!" + "'", str2, "null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!null\220!!\200~~null\220!!\200~~null\220!!null\220!!!");
    }

    @Test
    public void test05541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05541");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]!", "mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]!" + "'", str2, "]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]]^^^]^^^]^^^]^^^]]]]]]]]]]]]!");
    }

    @Test
    public void test05542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05542");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a\u014a!!!!", "`^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^```^``!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!!" + "'", str2, "^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!^^!!!^!!!^!!!!");
    }

    @Test
    public void test05543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05543");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!", "`nullnullnullnullnullnullnullnullnullnullnullnull`nullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!" + "'", str2, "NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!!!");
    }

    @Test
    public void test05544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05544");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!", "U~LLU~LL!!U~LLU~LL!!U~LLU~LLU~LLU~LL!!U~LLU~LL!!U~LLU~LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!" + "'", str2, "~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!");
    }

    @Test
    public void test05545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05545");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360\356\360\360\360!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05546");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253!", "\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!\253\253~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!\253\253~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!\253\253~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!\253\253~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!\253\253~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!\253\253~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!\253\253~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!\253\253~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!~\276!!\253\253!");
    }

    @Test
    public void test05547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05547");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!!]]!!]]HH]]HH]]!", "\u0366\u0365\u0368\u0368\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0178\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!" + "'", str2, "!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!!]]!!]]nullnull]]nullnull]]!");
    }

    @Test
    public void test05548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05548");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05549");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("null\253\253\253\200}}`null\253\253\253]]!", "LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU\200}}`LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLUU\253\253\253\200}}`LLUU\253\253\253]]!" + "'", str2, "LLUU\253\253\253\200}}`LLUU\253\253\253]]!");
    }

    @Test
    public void test05550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05550");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UNLLUNLLUNLLUNLLULLLULLLULLLULLLUNLLUNLLUNLLUNLLULLLULLL!", "\u0366\u0365\u0368\u0368nullnull\204\204nullnullnullnullnull\204\204nullnullnull!!nullnull\204\204nullnullnullnullnull\204\204nullnullnull!!nullnull\204\204nullnullnullnullnull\204\204nullnullnull!!nullnull\204\204nullnullnullnullnull\204\204\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L\204LLL\204LLL\204LLL\204LLLLLLLLLLLLLLLLLLL\204LLL\204LLL\204LLL\204LLLLLLLLLL!" + "'", str2, "L\204LLL\204LLL\204LLL\204LLLLLLLLLLLLLLLLLLL\204LLL\204LLL\204LLL\204LLLLLLLLLL!");
    }

    @Test
    public void test05551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05551");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275``nullnull``nullnull``nullnull\276``nullnull\275\275!", "UU]]UU]]LUUULUUUUU]]UU]]LUUULUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275``uuuuuuuu``uuuuuuuu``uuuuuuuu\276``uuuuuuuu\275\275!" + "'", str2, "\275``uuuuuuuu``uuuuuuuu``uuuuuuuu\276``uuuuuuuu\275\275!");
    }

    @Test
    public void test05552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05552");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!!", "L~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LL!!L~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LL!!L~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LL!!L~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LL!!L~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LLL~~~L~~~LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!!" + "'", str2, "\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!!");
    }

    @Test
    public void test05553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05553");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275\275!!\275\275!!!!\275\275!!\275\275!!!!!", "!\276\276\276\276\276!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275!!\275\275!!!!\275\275!!\275\275!!!!!" + "'", str2, "\275\275!!\275\275!!!!\275\275!!\275\275!!!!!");
    }

    @Test
    public void test05554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05554");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "\u0366\u0365\u0368\u0368ULLLULLL!!ULLLULLL!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05555");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!", "\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!" + "'", str2, "\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!!\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204\201\220\204\204\200~~\201\220\204\204\200~~\201\220\204\204\201\220\204\204!");
    }

    @Test
    public void test05556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05556");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!", "nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226!!nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226!!nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226!!nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226!!nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226nullnullnullnullnullnullnullnullnull\230\226\226null\230\226\226!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!" + "'", str2, "!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!");
    }

    @Test
    public void test05557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05557");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!\261\262\264\264nullnull!!!!\261\262\264\264nullnull!!!!!!!", "\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\200}}`\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\261\262\264\264!\214!!!\214!!!!!!\261\262\264\264!\214!!!\214!!!!!!!!\261\262\264\264!\214!!!\214!!!!!!\261\262\264\264!\214!!!\214!!!!!!!!\261\262\264\264!\214!!!\214!!!!!!\261\262\264\264!\214!!!\214!!!!!!!!\261\262\264\264!\214!!!\214!!!!!!\261\262\264\264!\214!!!\214!!!!!!!!\261\262\264\264!\214!!!\214!!!!!!\261\262\264\264!\214!!!\214!!!!!!!!\261\262\264\264!\214!!!\214!!!!!!\261\262\264\264!\214!!!\214!!!!!!!!\261\262\264\264!\214!!!\214!!!!!!\261\262\264\264!\214!!!\214!!!!!!!!\261\262\264\264!\214!!!\214!!!!!!\261\262\264\264!\214!!!\214!!!!!!!!!" + "'", str2, "\261\262\264\264!\214!!!\214!!!!!!\261\262\264\264!\214!!!\214!!!!!!!!\261\262\264\264!\214!!!\214!!!!!!\261\262\264\264!\214!!!\214!!!!!!!!\261\262\264\264!\214!!!\214!!!!!!\261\262\264\264!\214!!!\214!!!!!!!!\261\262\264\264!\214!!!\214!!!!!!\261\262\264\264!\214!!!\214!!!!!!!!\261\262\264\264!\214!!!\214!!!!!!\261\262\264\264!\214!!!\214!!!!!!!!\261\262\264\264!\214!!!\214!!!!!!\261\262\264\264!\214!!!\214!!!!!!!!\261\262\264\264!\214!!!\214!!!!!!\261\262\264\264!\214!!!\214!!!!!!!!\261\262\264\264!\214!!!\214!!!!!!\261\262\264\264!\214!!!\214!!!!!!!!!");
    }

    @Test
    public void test05558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05558");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "}~\200\200}~\200\200PNNNPNNNPNNNPNNNPNNNPNNNPNNNPNNN}~\200\200}~\200\200PNNNPNNNPNNNPNNNPNNNPNNNPNNNPNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull!" + "'", str2, "\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull!");
    }

    @Test
    public void test05559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05559");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "NLLLNLLL]]NLLLNLLL]]NLLLNLLL]]NLLLNLLL]]~}}^NLLLNLLL]]NLLLNLLL]]NLLLNLLL]]NLLLNLLL]]]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!!L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!!L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!!L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!!L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!" + "'", str2, "L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!!L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!!L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!!L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!!L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!");
    }

    @Test
    public void test05560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05560");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!", "``nullnull\200\200nullnull\200\200``nullnull\200\200nullnull\200\200``nullnull\200\200nullnull\200\200``nullnull\200\200nullnull\200\200``nullnull\200\200nullnull\200\200``nullnull\200\200nullnull\200\200``nullnull\200\200nullnull\200\200``nullnull\200\200nullnull\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354!" + "'", str2, "\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354\356\356\354\354!");
    }

    @Test
    public void test05561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05561");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!", "NLLLNLLLLLNLLLNLLLLL!!NLLLNLLLLLNLLLNLLLLL!!NLLLNLLLLLNLLLNLLLLLNLLLNLLLLLNLLLNLLLLL!!NLLLNLLLLLNLLLNLLLLL!!NLLLNLLLLLNLLLNLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300!" + "'", str2, "null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300null\273\300\300!");
    }

    @Test
    public void test05562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05562");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!", "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!" + "'", str2, "!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!\250!!!\250!!!!!");
    }

    @Test
    public void test05563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05563");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("UNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLLUNLL!UNLLUNLL!", "EHHH\200}}`EHHH]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05564");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "WZZZ\200}}`WZZZ]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test05565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05565");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll!!\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll!!\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll!!\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll!!\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll!", "NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu!!\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu!!\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu!!\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu!!\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu!" + "'", str2, "\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu!!\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu!!\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu!!\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu!!\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu\216\216n!uun!uu!");
    }

    @Test
    public void test05566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05566");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnullnullnullnullnullnullnull!!LL!!LLnullnullnullnullnullnullnullnull!!LL!!LL!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test05567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05567");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!!!EEE!EEE!", "\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0\u019c\u01a0\u01a0!!!```!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!" + "'", str2, "!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!");
    }

    @Test
    public void test05568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05568");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\200\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0\u019d\u019e\u01a0\u01a0]]!", "NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull\200}}`nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull]]!" + "'", str2, "nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull\200}}`nullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnull]]!");
    }

    @Test
    public void test05569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05569");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106!", "\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106nullLL!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\270\270\270\270\270\270\270\270!" + "'", str2, "\270\270\270\270\270\270\270\270!");
    }

    @Test
    public void test05570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05570");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!UBUUUBUUUBUUUBUUUBUUUBUUUBUUUBUU!", "!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!\200}}`!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!P!!!P!!!P!!!P!!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!" + "'", str2, "!P!!!P!!!P!!!P!!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!P!!!");
    }

    @Test
    public void test05571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05571");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e\u014c\u014e\u014e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test05572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05572");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368!", "!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!\200}}`!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368!" + "'", str2, "\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368!");
    }

    @Test
    public void test05573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05573");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246\u0246!!!", "LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!");
    }

    @Test
    public void test05574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05574");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270\u0270!", "!~!!!~!!\220\220!~!!!~!!\220\220\220!~!!\220\220\220!~!!\220\220\220!~!!\220\220\220!~!!\220\220!~!!!~!!\220\220!~!!!~!!\220\220!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!" + "'", str2, "!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!~nullnull!~nullnull!!!~nullnull!~nullnull!!!~nullnull!~nullnull!");
    }

    @Test
    public void test05575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05575");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "X!UUX!UUX!UUX!UUX!UUX!UUX!UUX!UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!xuu\275!xuu!xuu!xuu\275!xuu!xuu!xuu\275!xuu!xuu!xuu\275!xuu!xuu!xuu\275!xuu!xuu!xuu\275!xuu!xuu!xuu\275!xuu!xuu!xuu\275!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu\275!xuu!xuu!xuu\275!xuu!xuu!xuu\275!xuu!xuu!xuu\275!xuu!xuu!xuu\275!xuu!xuu!xuu\275!xuu!xuu!xuu\275!xuu!xuu!xuu\275!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!" + "'", str2, "!xuu\275!xuu!xuu!xuu\275!xuu!xuu!xuu\275!xuu!xuu!xuu\275!xuu!xuu!xuu\275!xuu!xuu!xuu\275!xuu!xuu!xuu\275!xuu!xuu!xuu\275!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu\275!xuu!xuu!xuu\275!xuu!xuu!xuu\275!xuu!xuu!xuu\275!xuu!xuu!xuu\275!xuu!xuu!xuu\275!xuu!xuu!xuu\275!xuu!xuu!xuu\275!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!xuu!");
    }

    @Test
    public void test05576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05576");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!UUU!UUU!!!", "}]}}}]}}!!}]}}}]}}!!}]}}}]}}}]}}}]}}!!}]}}}]}}!!}]}}}]}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!" + "'", str2, "!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!!!");
    }

    @Test
    public void test05577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05577");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("~\237~~\225\230\230~\237~~\225\230\230~\237~~\225\230\230~\237~~\225\230\230\200}}`~\237~~\225\230\230~\237~~\225\230\230~\237~~\225\230\230~\237~~\225\230\230]]!", "\u0150\u0150\u0150\u0150!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~\237~~\225\230\230~\237~~\225\230\230~\237~~\225\230\230~\237~~\225\230\230\200}}`~\237~~\225\230\230~\237~~\225\230\230~\237~~\225\230\230~\237~~\225\230\230]]!" + "'", str2, "~\237~~\225\230\230~\237~~\225\230\230~\237~~\225\230\230~\237~~\225\230\230\200}}`~\237~~\225\230\230~\237~~\225\230\230~\237~~\225\230\230~\237~~\225\230\230]]!");
    }

    @Test
    public void test05578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05578");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!", "\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test05579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05579");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\215}\215\215\215}\215\215\u014e\u014e\u014e\u014e!!!\215}\215\215\215}\215\215!", "\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260\u0131\u0132\u0134\u0134\u0131\u0132\u0134\u0134\255\256\260\260\255\256\260\260!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215null!!!null!!!null!!!null!!!\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215null!!!null!!!null!!!null!!!\215}\215\215\215}\215\215!");
    }

    @Test
    public void test05580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05580");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253FFFFFFFF\253\253FFFFFFFF\253\253FFFFFFFF\253\253FFFFFFFF\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253FFFFFFFF\253\253FFFFFFFF\253\253!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253!");
    }

    @Test
    public void test05581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05581");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("AA]]AA]]AA]]AA]]!AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]!AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]!AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]!AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]!AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]!AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]!AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]!AA]]AA]]AA]]AA]]AA]]AA]]AA]]AA]]!", "!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!!!LLL!LLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!" + "'", str2, "!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!");
    }

    @Test
    public void test05582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05582");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnull!nullnullnull!", "]!H!!!H!!!H!!!H!!!H!!]]!H!!!H!!]]!H!!!H!!]]!H!!!H!!]]]!H!!!H!!!H!!!H!!!H!!]]!H!!!H!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05583");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126\u0128\u0128\u0126\u0126!!!", "\u03aa\u03aa\u03aa\u038a\u038a\u038a!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test05584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05584");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvvnulluvv!", "FHEEFHEE!!FHEEFHEE!!FHEEFHEEFHEEFHEE!!FHEEFHEE!!FHEEFHEE!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "EFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHH!" + "'", str2, "EFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHHEFHHFHH!");
    }

    @Test
    public void test05585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05585");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\200}}`\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!]]!", "FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!FHHH\256\254\254FHHH\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\200}}`\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!]]!" + "'", str2, "\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\200}}`\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!\214!!!]]!");
    }

    @Test
    public void test05586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05586");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214!" + "'", str2, "nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnull\214\214!");
    }

    @Test
    public void test05587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05587");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!!L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!!L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!!L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!!L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!", "\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad]^^!" + "'", str2, "\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad\u01ad]^^!");
    }

    @Test
    public void test05588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05588");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!!LL!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200\300\335\335\335\214\300\335\335\335\300\335\335\335\300\335\335\335\214\300\335\335\335\300\335\335\335}~\200\200}~\200\200\300\335\335\335\214\300\335\335\335\300\335\335\335\300\335\335\335\214\300\335\335\335\300\335\335\335}~\200\200}~\200\200\300\335\335\335\214\300\335\335\335\300\335\335\335\300\335\335\335\214\300\335\335\335\300\335\335\335}~\200\200}~\200\200\300\335\335\335\214\300\335\335\335\300\335\335\335\300\335\335\335\214\300\335\335\335\300\335\335\335\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!nullnull!" + "'", str2, "!!!nullnull!");
    }

    @Test
    public void test05589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05589");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204!", "RRPPRRPPRRPPRRPPRRPPRRPPRRPPRRPP!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204!" + "'", str2, "\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204\204\204\204\204~\204\204!");
    }

    @Test
    public void test05590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05590");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!!!", "!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test05591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05591");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368nullnull!!nullnull!!!!nullnull!!nullnull!!!!\200\200\u0346\u0348\u0348!", "]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS]]SS]]SS!!]]SS]]SS]]SS]]SS]]SS]]SS!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!\200\200\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!\200\200\u0346\u0348\u0348!");
    }

    @Test
    public void test05592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05592");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\253\254\256\256\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\253\254\256\256\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246!", "LLLL\276LLLLLLL\276\276LLLLL\276\276LLLLL\276\276LLLLL\276\276LLLL\276LLLLLLL\276\276LLLLL\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnullnullnull!" + "'", str2, "\253\254\256\256nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05593");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!", "\u0346\u0348\u0348\u0348\210\205\206\206\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05594");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226!", "hnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!hnulleehnulleehnulleehnulleehnulleehnulleehnulleehnullee!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226!" + "'", str2, "\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226\226!");
    }

    @Test
    public void test05595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05595");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("RRRRRRRR!", "null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248null\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248\u0245\u0246\u0248\u0248!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275\275\275\275\275\275\275!" + "'", str2, "\275\275\275\275\275\275\275\275!");
    }

    @Test
    public void test05596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05596");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\336nullnullnull\336nullnullnull!!\336nullnullnull\336nullnullnull!!\336nullnullnull\336nullnullnull!!\336nullnullnull\336nullnullnull!!\336nullnullnull\336nullnullnull!!\336nullnullnull\336nullnullnull!!\336nullnullnull\336nullnullnull!!\336nullnullnull\336nullnullnull!!!", "UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!!UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!!UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!!UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!!UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126nullnull!!!" + "'", str2, "\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126\u0128\u0126nullnull!!!");
    }

    @Test
    public void test05597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05597");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!", "!!nullnullnull!!!!nullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!" + "'", str2, "!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!!~~!!~~~~!");
    }

    @Test
    public void test05598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05598");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!\276!nullnull\276!nullnull\276!nullnull\276!nullnull!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\276\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\276\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\276\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\276\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee!" + "'", str2, "!\276\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\276\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\276\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee\276\u02eb\u02ec\u02ee\u02ee\u02eb\u02ec\u02ee\u02ee!");
    }

    @Test
    public void test05599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05599");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!!\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226\225!\226\226!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test05600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05600");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("P!nullnullP!nullnull!!P!nullnullP!nullnull!!P!nullnullP!nullnullP!nullnullP!nullnull!!P!nullnullP!nullnull!!P!nullnullP!nullnull!", "NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!!NNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128!" + "'", str2, "\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128!");
    }

    @Test
    public void test05601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05601");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254!!!", "!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HHH!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!!" + "'", str2, "nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!!");
    }

    @Test
    public void test05602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05602");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!!NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!!NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!!NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!!NLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnnNLLLNLLLnn!", "\275HHHHHHHHHHHH\275HHHHHHHHHHHH\275HHHHHHHHHHHH\275HHHHHHHHHHHHHHHHHHHH\275\275HHHHHHHH\275\275HHHHHHHH\275\275HHHHHHHH\275\275\275HHHHHHHHHHHH\275HHHHHHHHHHHH\275HHHHHHHHHHHH\275HHHHHHHHHHHHHHHHHHHH\275\275HHHHHHHH\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH!!\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH!!\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH!!\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH!!\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH!" + "'", str2, "\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH!!\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH!!\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH!!\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH!!\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH\275HHH\275HHHHH!");
    }

    @Test
    public void test05603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05603");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!", "\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!!\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!!\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!!\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!!\230\226nullnullnullnullnullnullnullnull\236\276\276\230\226nullnullnullnullnullnullnullnull\236\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!" + "'", str2, "\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!\200\200!!!");
    }

    @Test
    public void test05604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05604");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUU!", "\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\u012c\214\214!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNN!" + "'", str2, "UUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNNNUUNNUUNNNN!");
    }

    @Test
    public void test05605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05605");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!\214\214!", "null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220null\213\220\220!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214!" + "'", str2, "\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\213\213!!\214\214!");
    }

    @Test
    public void test05606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05606");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05607");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0346\u0346!!!!", "\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368\u0366\u0365\u0368\u0368!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346!!!!" + "'", str2, "\u0346\u0346!!!!");
    }

    @Test
    public void test05608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05608");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UNLLUNLL!!UNLLUNLL!!!", "NnullnullnullNnullnullnullNnullnullnullNnullnullnull\200}}`NnullnullnullNnullnullnullNnullnullnullNnullnullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNLLLNLL!!LNLLLNLL!!!" + "'", str2, "LNLLLNLL!!LNLLLNLL!!!");
    }

    @Test
    public void test05609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05609");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\225!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05610");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!" + "'", str2, "!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!");
    }

    @Test
    public void test05611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05611");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!\253\254\256\256nullnullnullnullnullnull\253\254\256\256nullnullnullnullnullnull!!!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\336\335\340\340nullnullnullnullnullnull\336\335\340\340nullnullnullnullnullnull\336\335\340\340nullnullnullnullnullnull\336\335\340\340nullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!!" + "'", str2, "\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL\253\254\256\256UNLLUNLLUNLLUNLLUNLLUNLL!!!");
    }

    @Test
    public void test05612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05612");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("HH!!HH!!HHHH!!HH!!HH!", "nullnullnullnullabddabddabddabddnullnullnullnullabddabdd!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull!" + "'", str2, "nullnull!!nullnull!!nullnullnullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test05613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05613");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05614");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\336\335\340\340\336\335\340\340!", "null!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!~~null!~~null!~~null!~~null!~~null!~~null!~~null!~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05615");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLLnullLLLnullLLLLL!", "FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hfhhHHHhfhhHHHHHhfhhHHHhfhhHHHHHhfhhHHHhfhhHHHHHhfhhHHHhfhhHHHHHhfhhHHHhfhhHHHHHhfhhHHHhfhhHHHHHhfhhHHHhfhhHHHHHhfhhHHHhfhhHHHHH!" + "'", str2, "hfhhHHHhfhhHHHHHhfhhHHHhfhhHHHHHhfhhHHHhfhhHHHHHhfhhHHHhfhhHHHHHhfhhHHHhfhhHHHHHhfhhHHHhfhhHHHHHhfhhHHHhfhhHHHHHhfhhHHHhfhhHHHHH!");
    }

    @Test
    public void test05616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05616");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05617");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "\215}\215\215\215}\215\215NLLLNLLLNLLLNLLL\215}\215\215\215}\215\215!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05618");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLLLL!!LL!!\276LLL\276LLL!", "!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]!!]]!!\276]]]\276]]]]]!!]]!!\276]]]\276]]]]]!!]]!!\276]]]\276]]]]]!!]]!!\276]]]\276]]]]]!!]]!!\276]]]\276]]]]]!!]]!!\276]]]\276]]]]]!!]]!!\276]]]\276]]]]]!!]]!!\276]]]\276]]]!" + "'", str2, "]]!!]]!!\276]]]\276]]]]]!!]]!!\276]]]\276]]]]]!!]]!!\276]]]\276]]]]]!!]]!!\276]]]\276]]]]]!!]]!!\276]]]\276]]]]]!!]]!!\276]]]\276]]]]]!!]]!!\276]]]\276]]]]]!!]]!!\276]]]\276]]]!");
    }

    @Test
    public void test05619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05619");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214!", "!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!N!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214!" + "'", str2, "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\214\214!");
    }

    @Test
    public void test05620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05620");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336\276\276null\276\336\336null\276\336\336!", "\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\276X\275\275\276X\275\275XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276nullnullnullnull\276nullnullnullnullnullnull\276nullnull\276\276nullnullnullnull\276nullnullnullnullnullnull\276nullnull\276\276nullnullnullnull\276nullnullnullnullnullnull\276nullnull\276\276nullnullnullnull\276nullnullnullnullnullnull\276nullnull\276\276nullnullnullnull\276nullnullnullnullnullnull\276nullnull\276\276nullnullnullnull\276nullnullnullnullnullnull\276nullnull\276\276nullnullnullnull\276nullnullnullnullnullnull\276nullnull\276\276nullnullnullnull\276nullnullnullnullnullnull\276nullnull!" + "'", str2, "\276\276nullnullnullnull\276nullnullnullnullnullnull\276nullnull\276\276nullnullnullnull\276nullnullnullnullnullnull\276nullnull\276\276nullnullnullnull\276nullnullnullnullnullnull\276nullnull\276\276nullnullnullnull\276nullnullnullnullnullnull\276nullnull\276\276nullnullnullnull\276nullnullnullnullnullnull\276nullnull\276\276nullnullnullnull\276nullnullnullnullnullnull\276nullnull\276\276nullnullnullnull\276nullnullnullnullnullnull\276nullnull\276\276nullnullnullnull\276nullnullnullnullnullnull\276nullnull!");
    }

    @Test
    public void test05621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05621");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullnullnullnullnulll!nnl!nnnullnullnullnullnullnullnullnulll!nnl!nnnullnullnullnullnullnullnullnulll!nnl!nnnullnullnullnullnullnullnullnulll!nnl!nnnullnullnullnullnullnullnullnulll!nnl!nnnullnullnullnullnullnullnullnulll!nnl!nnnullnullnullnullnullnullnullnulll!nnl!nnnullnullnullnullnullnullnullnulll!nnl!nn!", "UNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUU!!UNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUU!!UNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUU!!UNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUU!!UNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUUUNNNUNNNUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!NNN!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!NNN!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!NNN!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!NNN!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!NNN!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!NNN!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!NNN!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!NNN!NN!" + "'", str2, "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!NNN!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!NNN!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!NNN!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!NNN!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!NNN!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!NNN!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!NNN!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!NNN!NN!");
    }

    @Test
    public void test05622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05622");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("FHHHnullnullnullnullFHHHnullnull!", "\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u016e\u0170\u0170\u0170\u016c\u016c\u016c\u016c\u016e\u0170\u0170\u0170\u016c\u016cLL!" + "'", str2, "\u016e\u0170\u0170\u0170\u016c\u016c\u016c\u016c\u016e\u0170\u0170\u0170\u016c\u016cLL!");
    }

    @Test
    public void test05623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05623");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!", "````````````````````````````````\253\254\256\256\253\254\256\256````````````````````````````````\253\254\256\256\253\254\256\256````````````````````````````````\253\254\256\256\253\254\256\256````````````````````````````````\253\254\256\256\253\254\256\256````````````````````````````````\253\254\256\256\253\254\256\256````````````````````````````````\253\254\256\256\253\254\256\256````````````````````````````````\253\254\256\256\253\254\256\256````````````````````````````````\253\254\256\256\253\254\256\256!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256!" + "'", str2, "\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256\256\256!!\256\256!!\256\256\256\256\256\256\256\256!");
    }

    @Test
    public void test05624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05624");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN!", "NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!NN!!N!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196!" + "'", str2, "\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196\u0196!");
    }

    @Test
    public void test05625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05625");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\276\276\276\276nullnullnull\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276nullnullnull\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!", "\u037e\u037b\u037b\u037e\u037b\u037b\u037e\u037b\u037b\u037e\u037b\u037b\u037e\u037b\u037b\u037e\u037b\u037b\u037e\u037b\u037b\u037e\u037b\u037bnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276\276\276\365\366\370\370\365\366\370\370\365\366\370\370\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\365\366\370\370\365\366\370\370\365\366\370\370\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!" + "'", str2, "\276\276\276\276\365\366\370\370\365\366\370\370\365\366\370\370\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\365\366\370\370\365\366\370\370\365\366\370\370\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276\276!");
    }

    @Test
    public void test05626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05626");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("unllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunllunll!", "nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehh!" + "'", str2, "fehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehh!");
    }

    @Test
    public void test05627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05627");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!", "RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!!RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!!RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!!RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!!RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!" + "'", str2, "\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!");
    }

    @Test
    public void test05628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05628");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("L~UUL~UU!!L~UUL~UU!!L~UUL~UUL~UUL~UU!!L~UUL~UU!!L~UUL~UU!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnullnull~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnull!" + "'", str2, "null~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnullnull~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnull!");
    }

    @Test
    public void test05629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05629");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UNLL\220NN\200~~UNLL\220NN\200~~UNLL\220NNUNLL\220NNUNLL\220NN\200~~UNLL\220NN\200~~UNLL\220NNUNLL\220NN!!UNLL\220NN\200~~UNLL\220NN\200~~UNLL\220NNUNLL\220NNUNLL\220NN\200~~UNLL\220NN\200~~UNLL\220NNUNLL\220NN!!UNLL\220NN\200~~UNLL\220NN\200~~UNLL\220NNUNLL\220NNUNLL\220NN\200~~UNLL\220NN\200~~UNLL\220NNUNLL\220NNUNLL\220NN\200~~UNLL\220NN\200~~UNLL\220NNUNLL\220NNUNLL\220NN\200~~UNLL\220NN\200~~UNLL\220NNUNLL\220NN!!UNLL\220NN\200~~UNLL\220NN\200~~UNLL\220NNUNLL\220NNUNLL\220NN\200~~UNLL\220NN\200~~UNLL\220NNUNLL\220NN!!UNLL\220NN\200~~UNLL\220NN\200~~UNLL\220NNUNLL\220NNUNLL\220NN\200~~UNLL\220NN\200~~UNLL\220NNUNLL\220NN!", "\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull\215\216\230\230\276nullnullnull\276nullnullnull\276nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NNLNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NN!!LNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NNLNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NN!!LNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NNLNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NNLNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NNLNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NN!!LNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NNLNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NN!!LNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NNLNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NN!" + "'", str2, "LNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NNLNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NN!!LNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NNLNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NN!!LNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NNLNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NNLNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NNLNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NN!!LNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NNLNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NN!!LNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NNLNLL\220NN\200~~LNLL\220NN\200~~LNLL\220NNLNLL\220NN!");
    }

    @Test
    public void test05630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05630");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLLUNLLUNLL\275\275UNLLUNLL\275\275UNLLUNLL\275\275UNLLUNLL\275\275\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLL\275UNLLUNLLUNLLUNLLUNLL\275\275UNLLUNLL\275\275!", "ijllijllijllijll!ill!ill!ill!illijllijllijllijll!ill!ill!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!JLL!JLL!JLL\275!JLL!JLL!JLL\275!JLL!JLL!JLL\275!JLL!JLL!JLL!JLL!JLL\275\275!JLL!JLL\275\275!JLL!JLL\275\275!JLL!JLL\275\275\275!JLL!JLL!JLL\275!JLL!JLL!JLL\275!JLL!JLL!JLL\275!JLL!JLL!JLL!JLL!JLL\275\275!JLL!JLL\275\275!" + "'", str2, "\275!JLL!JLL!JLL\275!JLL!JLL!JLL\275!JLL!JLL!JLL\275!JLL!JLL!JLL!JLL!JLL\275\275!JLL!JLL\275\275!JLL!JLL\275\275!JLL!JLL\275\275\275!JLL!JLL!JLL\275!JLL!JLL!JLL\275!JLL!JLL!JLL\275!JLL!JLL!JLL!JLL!JLL\275\275!JLL!JLL\275\275!");
    }

    @Test
    public void test05631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05631");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!", "\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!" + "'", str2, "\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!\275!!!!");
    }

    @Test
    public void test05632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05632");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("null\226\230\230nullnullnullnull\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230nullnullnullnull\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230null\226\230\230!", "UNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUUUNUUUNUUUUUNUUUNUUUUUNUUUNUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUNN\226\230\230UUNNUUNNUUNNUUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNNUUNNUUNNUUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230!" + "'", str2, "UUNN\226\230\230UUNNUUNNUUNNUUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNNUUNNUUNNUUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230UUNN\226\230\230!");
    }

    @Test
    public void test05633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05633");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254!", "NNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLLNNLLNNLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254!" + "'", str2, "\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254!");
    }

    @Test
    public void test05634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05634");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!!NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!!NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!!NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!!NUNLLNNNUNLLNNUNLLUNLLNUNLLNNNUNLLNNUNLLUNLL!", "\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7!" + "'", str2, "\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7\u03a7!");
    }

    @Test
    public void test05635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05635");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a!!!", "UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!" + "'", str2, "!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test05636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05636");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\ua7ad\ua7ad\ua7ad\ua7ad\200\ua7ad\ua7ad\ua7ad\ua7ad]]!", "\253\254\256\256\253\254\256\256!!\253\254\256\256\253\254\256\256!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\200}}`nullnullnullnull]]!" + "'", str2, "nullnullnullnull\200}}`nullnullnullnull]]!");
    }

    @Test
    public void test05637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05637");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("FEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHHFEHH!", "UNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUUUNLLUNLLUUUNLLUNLLUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05638");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```UNLLUNLLUNLLUNLL```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test05639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05639");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0346\u0348\u0348\u0348\226\225\226\226\u0348\u0346\u0346!", "\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011a\u011anullnullnull!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\226\225\226\226\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\226\225\226\226\u0348\u0346\u0346!");
    }

    @Test
    public void test05640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05640");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\351\351\352\352\351\351\352\352!!\351\351\352\352\351\351\352\352!!\351\351\352\352\351\351\352\352\351\351\352\352\351\351\352\352!!\351\351\352\352\351\351\352\352!!\351\351\352\352\351\351\352\352!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05641");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227!", "\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull\275nullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276NLLLNLLLNLLLNLLL\276\227\227NLLLNLLLNLLLNLLL\276\227\227\276\276NLLLNLLLNLLLNLLL\276\227\227NLLLNLLLNLLLNLLL\276\227\227\276\276NLLLNLLLNLLLNLLL\276\227\227NLLLNLLLNLLLNLLL\276\227\227\276\276NLLLNLLLNLLLNLLL\276\227\227NLLLNLLLNLLLNLLL\276\227\227\276\276NLLLNLLLNLLLNLLL\276\227\227NLLLNLLLNLLLNLLL\276\227\227\276\276NLLLNLLLNLLLNLLL\276\227\227NLLLNLLLNLLLNLLL\276\227\227\276\276NLLLNLLLNLLLNLLL\276\227\227NLLLNLLLNLLLNLLL\276\227\227\276\276NLLLNLLLNLLLNLLL\276\227\227NLLLNLLLNLLLNLLL\276\227\227!" + "'", str2, "\276\276NLLLNLLLNLLLNLLL\276\227\227NLLLNLLLNLLLNLLL\276\227\227\276\276NLLLNLLLNLLLNLLL\276\227\227NLLLNLLLNLLLNLLL\276\227\227\276\276NLLLNLLLNLLLNLLL\276\227\227NLLLNLLLNLLLNLLL\276\227\227\276\276NLLLNLLLNLLLNLLL\276\227\227NLLLNLLLNLLLNLLL\276\227\227\276\276NLLLNLLLNLLLNLLL\276\227\227NLLLNLLLNLLLNLLL\276\227\227\276\276NLLLNLLLNLLLNLLL\276\227\227NLLLNLLLNLLLNLLL\276\227\227\276\276NLLLNLLLNLLLNLLL\276\227\227NLLLNLLLNLLLNLLL\276\227\227\276\276NLLLNLLLNLLLNLLL\276\227\227NLLLNLLLNLLLNLLL\276\227\227!");
    }

    @Test
    public void test05642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05642");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128!", "\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348\u0348LL\276\u0348\u0348LL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276LLL\276LLL\276LLL\276LLL\276LLL!" + "'", str2, "\276LLL\276LLL\276LLL\276LLL\276LLL!");
    }

    @Test
    public void test05643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05643");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!!!nullnull!!nullnull!!nullnull!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!nullnull!!nullnull!!nullnull!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "\270U\270\270\270U\270\270!!\270U\270\270\270U\270\270!!\270U\270\270\270U\270\270!!\270U\270\270\270U\270\270!!\270U\270\270\270U\270\270!!\270U\270\270\270U\270\270!!\270U\270\270\270U\270\270!!\270U\270\270\270U\270\270!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!U\270\270\270U\270\270\270!!U\270\270\270U\270\270\270!!U\270\270\270U\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!U\270\270\270U\270\270\270!!U\270\270\270U\270\270\270!!U\270\270\270U\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!U\270\270\270U\270\270\270!!U\270\270\270U\270\270\270!!U\270\270\270U\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!U\270\270\270U\270\270\270!!U\270\270\270U\270\270\270!!U\270\270\270U\270\270\270!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test05644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05644");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("fehhfehh!", "!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!!UU!!UU!!!!UU!!UU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05645");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!!", "rrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPPrrpprrppRRPPRRPP!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PP!!PP!!!!PP!!PP!!!!PP!!PP!!!!PP!!PP!!!!PP!!PP!!!!PP!!PP!!!!PP!!PP!!!!PP!!PP!!!!!" + "'", str2, "PP!!PP!!!!PP!!PP!!!!PP!!PP!!!!PP!!PP!!!!PP!!PP!!!!PP!!PP!!!!PP!!PP!!!!PP!!PP!!!!!");
    }

    @Test
    public void test05646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05646");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!", "!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!" + "'", str2, "!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!!\254\254!");
    }

    @Test
    public void test05647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05647");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u020c\u020b\u020e\u020e\u020c\u020b\u020e\u020e\u020c\u020b\u020e\u020e\u020c\u020b\u020e\u020e\u020c\u020b\u020e\u020e!", "`ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL`ULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLLULLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05648");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300!", "}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200\204\204}~\200\200}~\200\200\204\204}~\200\200}~\200\200\204\204}~\200\200}~\200\200\204\204}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200\204\204}~\200\200}~\200\200\204\204!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull!" + "'", str2, "\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull\275nullnullnull!");
    }

    @Test
    public void test05649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05649");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225!", "\352\351\354\354\352\351\354\354!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```^```^```^```^```^```^```^```^```nullnull\225\225nullnull\225\225^```^```nullnull\225\225nullnull\225\225^```^```^```^```^```^```^```^```^```^```nullnull\225\225nullnull\225\225^```^```nullnull\225\225nullnull\225\225^```^```^```^```^```^```^```^```^```^```nullnull\225\225nullnull\225\225^```^```nullnull\225\225nullnull\225\225^```^```^```^```^```^```^```^```^```^```nullnull\225\225nullnull\225\225^```^```nullnull\225\225nullnull\225\225^```^```^```^```^```^```^```^```^```^```nullnull\225\225nullnull\225\225^```^```nullnull\225\225nullnull\225\225^```^```^```^```^```^```^```^```^```^```nullnull\225\225nullnull\225\225^```^```nullnull\225\225nullnull\225\225^```^```^```^```^```^```^```^```^```^```nullnull\225\225nullnull\225\225^```^```nullnull\225\225nullnull\225\225^```^```^```^```^```^```^```^```^```^```nullnull\225\225nullnull\225\225^```^```nullnull\225\225nullnull\225\225!" + "'", str2, "^```^```^```^```^```^```^```^```^```^```nullnull\225\225nullnull\225\225^```^```nullnull\225\225nullnull\225\225^```^```^```^```^```^```^```^```^```^```nullnull\225\225nullnull\225\225^```^```nullnull\225\225nullnull\225\225^```^```^```^```^```^```^```^```^```^```nullnull\225\225nullnull\225\225^```^```nullnull\225\225nullnull\225\225^```^```^```^```^```^```^```^```^```^```nullnull\225\225nullnull\225\225^```^```nullnull\225\225nullnull\225\225^```^```^```^```^```^```^```^```^```^```nullnull\225\225nullnull\225\225^```^```nullnull\225\225nullnull\225\225^```^```^```^```^```^```^```^```^```^```nullnull\225\225nullnull\225\225^```^```nullnull\225\225nullnull\225\225^```^```^```^```^```^```^```^```^```^```nullnull\225\225nullnull\225\225^```^```nullnull\225\225nullnull\225\225^```^```^```^```^```^```^```^```^```^```nullnull\225\225nullnull\225\225^```^```nullnull\225\225nullnull\225\225!");
    }

    @Test
    public void test05650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05650");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "nullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhh!!nullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhh!!nullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhh!!nullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhh!!nullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhhnullfhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05651");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!!``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!!``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!!``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!!``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL``LL!", "UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!" + "'", str2, "``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!!``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU``UU!");
    }

    @Test
    public void test05652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05652");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af\u01af]]null!nullnullnullnull!!!", "}~\200\200}~\200\200LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN}~\200\200}~\200\200LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200!!nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200!!nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200!!nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200!!nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200!!nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200!!nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200!!nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200!!!" + "'", str2, "nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200!!nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200!!nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200!!nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200!!nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200!!nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200!!nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200!!nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200nullnull]]~L\200\200!~L\200\200~L\200\200~L\200\200~L\200\200!!!");
    }

    @Test
    public void test05653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05653");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!", "LNNNLNNNLNNNLNNNLNNNLNNNLNNNLNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!" + "'", str2, "!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!!\246\246!!\246\246!!!");
    }

    @Test
    public void test05654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05654");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!!", "\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!!" + "'", str2, "\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!\235\236\240\240!!!!");
    }

    @Test
    public void test05655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05655");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("null!nullnullnullnull!!nullnull!!nullnull!!nullnull!!null!nullnullnullnull!!nullnull!!!", "ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll\200}}`ijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijllijll]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264!!!" + "'", str2, "\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264\u0264!!!");
    }

    @Test
    public void test05656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05656");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!", "FH!!FH!!FH!!FH!!FH!!FH!!FH!!FH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
    }

    @Test
    public void test05657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05657");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhhnullnullnullnullnullnullnullnull!fhh!fhh!", "NLLLNLLL]]NLLLNLLL]]NLLLNLLL]]NLLLNLLL]]~}}^NLLLNLLL]]NLLLNLLL]]NLLLNLLL]]NLLLNLLL]]]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]!" + "'", str2, "L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]!");
    }

    @Test
    public void test05658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05658");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("ULLLULLLULLLULLLULLLULLLULLLULLL!", "\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276\u019d\u019d\u019d\u019d\236\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05659");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!`uuu`uuu`uuu`uuu`uuu`uuu`uuu`uuu!!!", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!" + "'", str2, "`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!`!!!!!!");
    }

    @Test
    public void test05660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05660");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "\215\216\230\230L!!!L!!!L!!!\215\216\230\230L!!!L!!!L!!!\215\216\230\230L!!!L!!!L!!!\215\216\230\230L!!!L!!!L!!!\215\216\230\230L!!!L!!!L!!!\215\216\230\230L!!!L!!!L!!!\215\216\230\230L!!!L!!!L!!!\215\216\230\230L!!!L!!!L!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05661");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300\275\300\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05662");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```!", "LNLLLNLL!!LNLLLNLL!!LNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```!" + "'", str2, "NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```NLLLNLLLNLLLNLLL!!!```!");
    }

    @Test
    public void test05663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05663");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!!", "\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test05664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05664");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!oprroprroprroprr!", "\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LLUULLUULLUULLUU!" + "'", str2, "!LLUULLUULLUULLUU!");
    }

    @Test
    public void test05665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05665");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnullnullnullijllijllijllijllnullnullnullnullijllijll!", "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05666");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!!", "null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```null```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!!" + "'", str2, "\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!!");
    }

    @Test
    public void test05667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05667");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275\276!\225\225\276!\225\225\200\200\276!\225\225\276!\225\225\200\200\276!\225\225\276!\225\225\200\200\276\276!\225\225\276!\225\225\200\200\275\275!", "HHHHHHHH!!HHHHHHHH!!HHHHHHHHHHHHHHHH!!HHHHHHHH!!HHHHHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276!\225\225\276!\225\225\200\200\276!\225\225\276!\225\225\200\200\276!\225\225\276!\225\225\200\200\276\276!\225\225\276!\225\225\200\200\275\275!" + "'", str2, "\275\276!\225\225\276!\225\225\200\200\276!\225\225\276!\225\225\200\200\276!\225\225\276!\225\225\200\200\276\276!\225\225\276!\225\225\200\200\275\275!");
    }

    @Test
    public void test05668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05668");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!LNUULNUU!!!", "\253\254\256\256null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!\253\254\256\256null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!!" + "'", str2, "NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!NLLLNLLL!!!");
    }

    @Test
    public void test05669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05669");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!!", "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\255\256\260\260\255\256\260\260!!!!!\255\256\260\260\255\256\260\260!!!!!!!\255\256\260\260\255\256\260\260!!!!!\255\256\260\260\255\256\260\260!!!!!!!\255\256\260\260\255\256\260\260!!!!!\255\256\260\260\255\256\260\260!!!!!!!\255\256\260\260\255\256\260\260!!!!!\255\256\260\260\255\256\260\260!!!!!!!\255\256\260\260\255\256\260\260!!!!!\255\256\260\260\255\256\260\260!!!!!!!\255\256\260\260\255\256\260\260!!!!!\255\256\260\260\255\256\260\260!!!!!!!\255\256\260\260\255\256\260\260!!!!!\255\256\260\260\255\256\260\260!!!!!!!\255\256\260\260\255\256\260\260!!!!!\255\256\260\260\255\256\260\260!!!!!!!!" + "'", str2, "\255\256\260\260\255\256\260\260!!!!!\255\256\260\260\255\256\260\260!!!!!!!\255\256\260\260\255\256\260\260!!!!!\255\256\260\260\255\256\260\260!!!!!!!\255\256\260\260\255\256\260\260!!!!!\255\256\260\260\255\256\260\260!!!!!!!\255\256\260\260\255\256\260\260!!!!!\255\256\260\260\255\256\260\260!!!!!!!\255\256\260\260\255\256\260\260!!!!!\255\256\260\260\255\256\260\260!!!!!!!\255\256\260\260\255\256\260\260!!!!!\255\256\260\260\255\256\260\260!!!!!!!\255\256\260\260\255\256\260\260!!!!!\255\256\260\260\255\256\260\260!!!!!!!\255\256\260\260\255\256\260\260!!!!!\255\256\260\260\255\256\260\260!!!!!!!!");
    }

    @Test
    public void test05670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05670");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("``nullhffnullhff``nullhffnullhff``nullhffnullhff``nullhffnullhff``nullhffnullhff``nullhffnullhff``nullhffnullhff``nullhffnullhff!", "\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260\u025d\u025e\u0260\u0260!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0193\u025e\u025e\u0193\u025e\u025e\u0193\u025e\u025e\u0193\u025e\u025e\u0193\u025e\u025e\u0193\u025e\u025e\u0193\u025e\u025e\u0193\u025e\u025e\u0193\u025e\u025e\u0193\u025e\u025e\u0193\u025e\u025e\u0193\u025e\u025e\u0193\u025e\u025e\u0193\u025e\u025e\u0193\u025e\u025e\u0193\u025e\u025e!" + "'", str2, "\u0193\u025e\u025e\u0193\u025e\u025e\u0193\u025e\u025e\u0193\u025e\u025e\u0193\u025e\u025e\u0193\u025e\u025e\u0193\u025e\u025e\u0193\u025e\u025e\u0193\u025e\u025e\u0193\u025e\u025e\u0193\u025e\u025e\u0193\u025e\u025e\u0193\u025e\u025e\u0193\u025e\u025e\u0193\u025e\u025e\u0193\u025e\u025e!");
    }

    @Test
    public void test05671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05671");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0170\u0170\u0170\u0170nullnullnullnullnullnullnullnullnull!", "\u0346\u0348\u0348\u0348nullnull\340\340nullnull\340\340nullnull\340\340nullnull\340\340\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300!" + "'", str2, "\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300\u0346l\300\300!");
    }

    @Test
    public void test05672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05672");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128\u0106\u0128\u0128!", "LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````LL``LL``LL``LL``LL``LL``LL``LL``LL``LL````LL``LL````!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test05673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05673");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUUNLLLLLUULLUULLUU!", "``!!``!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05674");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!!]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!!]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!!]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!!]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200!!]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200!!]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200!!]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200!!]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200!" + "'", str2, "]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200!!]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200!!]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200!!]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200!!]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200]]\200nullnullnullnull\200\200\200nullnullnullnull\200\200!");
    }

    @Test
    public void test05675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05675");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!", "\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010c\u0109\u010a\u010c\u010cnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
    }

    @Test
    public void test05676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05676");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200}}`\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200]]!", "NNKKNNKKNNKKNNKKNNKKNNKKNNKKNNKK\214\214NNKKNNKKNNKKNNKKNNKKNNKKNNKKNNKK\214\214NNKKNNKKNNKKNNKKNNKKNNKKNNKKNNKK\214\214NNKKNNKKNNKKNNKKNNKKNNKKNNKKNNKK\214\214NNKKNNKKNNKKNNKKNNKKNNKKNNKKNNKK\214\214NNKKNNKKNNKKNNKKNNKKNNKKNNKKNNKK\214\214NNKKNNKKNNKKNNKKNNKKNNKKNNKKNNKK\214\214NNKKNNKKNNKKNNKKNNKKNNKKNNKKNNKK\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200}}`\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200]]!" + "'", str2, "\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200}}`\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200\200]]!");
    }

    @Test
    public void test05677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05677");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7\u03a8\u03a7\u03a7!", "\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!" + "'", str2, "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!");
    }

    @Test
    public void test05678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05678");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!!!!!!!!", "\u0366\u0365\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!" + "'", str2, "!!!!!!!!!");
    }

    @Test
    public void test05679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05679");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}~\200\200}~\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL}~\200\200}~\200\200NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLL!", "\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]\220\220\216\216\220\220\216\216!!]]!!]]!!]]!!]]!!]]!!]]!!]]!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]}~\200\200}~\200\200!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!" + "'", str2, "}~\200\200}~\200\200!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]}~\200\200}~\200\200!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!]]]!");
    }

    @Test
    public void test05680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05680");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!!", "nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254nullnullnullnullnullnull!!nullnull!!nullnull!!\256\254\254!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!!" + "'", str2, "\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!!");
    }

    @Test
    public void test05681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05681");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL\200}}`!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL]]!", "lluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUUlluulluuLLUULLUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\200}}`!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU]]!" + "'", str2, "!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\200}}`!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU]]!");
    }

    @Test
    public void test05682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05682");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LL]]LL]]LLLLLLLLLL]]LL]]LLLLLLLL!", "\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]\220\220\216\216\220\220\216\216UU]]UU]]UU]]UU]]UU]]UU]]UU]]UU]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull]]nullnull]]nullnullnullnullnullnullnullnullnullnull]]nullnull]]nullnullnullnullnullnullnullnull!" + "'", str2, "nullnull]]nullnull]]nullnullnullnullnullnullnullnullnullnull]]nullnull]]nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05683");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```LUNNLUNNLUNNLUNN!!!```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05684");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!!", "!X!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!!!");
    }

    @Test
    public void test05685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05685");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!null\230nullnullnull\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!!null\230nullnullnull\230nullnull!!null\230nullnullnull\230nullnull!!null\230nullnullnull\230nullnull!!null\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!null\230nullnullnull\230nullnullnull\230nullnull!!null\230nullnullnull\230nullnull!!null\230nullnullnull\230nullnull!", "nullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!UN!!\230UN!!UN!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!" + "'", str2, "!UN!!\230UN!!UN!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!!UN!!\230UN!!UN!!UN!!\230UN!!UN!!!");
    }

    @Test
    public void test05686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05686");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```UUUU```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05687");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275UUU\275UUU!", "\275L!]]L!]]L!]]\275L!]]L!]]L!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275]]]\275]]]!" + "'", str2, "\275]]]\275]]]!");
    }

    @Test
    public void test05688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05688");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\253\254\256\256~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200\253\254\256\256~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200!", "UUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LLUUUUUUUU!!LL!!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200\253\254\256\256~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200!" + "'", str2, "\253\254\256\256~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200\253\254\256\256~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200~}\200\200!ULL~}\200\200~}\200\200!");
    }

    @Test
    public void test05689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05689");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!U!LLU!LLU!LLU!LL!!!U!LLU!LLU!LLU!LL!!!!!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnullnullnull\214nullnullnullnullnullnullnullnullnullnullnullnull\214nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull\214nullnullnullnullnullnullnullnullnullnullnullnull\214nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull\214nullnullnullnullnullnullnullnullnullnullnullnull\214nullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnull\214nullnullnullnullnullnullnullnullnullnullnullnull\214\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!" + "'", str2, "!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!N!\200\200N!\200\200N!\200\200N!\200\200!!!!!");
    }

    @Test
    public void test05690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05690");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~!!\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~!!\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~!!\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~!!\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~\216\216U~~~U~~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test05691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05691");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016e\u016enullnullnullnull!", "NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214NN``NN``NN``NN``NN``NN``NN``NN``\214\214!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN``NN!" + "'", str2, "``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN```NN``NN``NN``NN!");
    }

    @Test
    public void test05692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05692");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340\276!\340\340!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull!" + "'", str2, "\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull\276!nullnull!");
    }

    @Test
    public void test05693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05693");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031anullnullnullnullnullnullnullnull!", "\276!!!\276\276!!\276\276!!\276\276!!\276\276!!\276!!!\276\276!!\276\276!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!" + "'", str2, "\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!");
    }

    @Test
    public void test05694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05694");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276\200}}`!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05695");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull\335\336\340\340\335\336\340\340nullnull!", "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!" + "'", str2, "\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250!");
    }

    @Test
    public void test05696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05696");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0143\u0145\u0145\u0143\u0145\u0145\u0143\u0145\u0145\u0143\u0145\u0145\u0143\u0145\u0145\u0143\u0145\u0145\u0143\u0145\u0145\u0143\u0145\u0145!", "!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!!!TT!!TT!!!!TT!!TT!!TT!!TT!!TT!!TT!!TT!!TT!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
    }

    @Test
    public void test05697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05697");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05698");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200\u01fd\u01fe\u0200\u0200!!!!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnull!!!nullnullnullnull!!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnull!!!nullnullnullnull!!!!");
    }

    @Test
    public void test05699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05699");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300LL\300\300!", "LL]]LL]]LLLLLLLLLL]]LL]]LLLLLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull!" + "'", str2, "``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull!");
    }

    @Test
    public void test05700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05700");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UNLLUNLL\253\253UNLLUNLL\253\253UNLLUNLL\253\253UNLLUNLL\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UNLLUNLL\253\253UNLLUNLL\253\253!", "\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]\220\220\216\216\220\220\216\216ss]]ss]]ss]]ss]]ss]]ss]]ss]]ss]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253!");
    }

    @Test
    public void test05701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05701");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!", "~}\200\200~}\200\200LNNNnullnullnullLNNNnullnullnull\230\230LNNNnullnullnullLNNNnullnullnull\230\230~}\200\200~}\200\200LNNNnullnullnullLNNNnullnullnull\230\230LNNNnullnullnullLNNNnullnullnull\230\230~}\200\200~}\200\200LNNNnullnullnullLNNNnullnullnull\230\230LNNNnullnullnullLNNNnullnullnull\230\230~}\200\200~}\200\200LNNNnullnullnullLNNNnullnullnull\230\230LNNNnullnullnullLNNNnullnullnull\230\230~}\200\200~}\200\200LNNNnullnullnullLNNNnullnullnull\230\230LNNNnullnullnullLNNNnullnullnull\230\230~}\200\200~}\200\200LNNNnullnullnullLNNNnullnullnull\230\230LNNNnullnullnullLNNNnullnullnull\230\230~}\200\200~}\200\200LNNNnullnullnullLNNNnullnullnull\230\230LNNNnullnullnullLNNNnullnullnull\230\230~}\200\200~}\200\200LNNNnullnullnullLNNNnullnullnull\230\230LNNNnullnullnullLNNNnullnullnull\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!" + "'", str2, "\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!!\200\u0366\u0365\u0368\u0368\u0348\u0348\200\u0366\u0365\u0368\u0368\u0348\u0348!");
    }

    @Test
    public void test05702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05702");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u010d\u010e\u0110\u0110\u0346\u0348\u0348!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test05703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05703");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275nullnull\200\200nullnull\200\200nullnull\200\200\276nullnull\200\200\275\275!", "UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\u0366\u0366nullnull\200\200\u0366\u0366nullnull\200\200\u0366\u0366nullnull\200\200\276\u0366\u0366nullnull\200\200\275\275!" + "'", str2, "\275\u0366\u0366nullnull\200\200\u0366\u0366nullnull\200\200\u0366\u0366nullnull\200\200\276\u0366\u0366nullnull\200\200\275\275!");
    }

    @Test
    public void test05704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05704");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!UUUUUUUU!!!", "nullnullnullnullnullnullnullnulll!nnl!nnnullnullnullnullnullnullnullnulll!nnl!nnnullnullnullnullnullnullnullnulll!nnl!nnnullnullnullnullnullnullnullnulll!nnl!nnnullnullnullnullnullnullnullnulll!nnl!nnnullnullnullnullnullnullnullnulll!nnl!nnnullnullnullnullnullnullnullnulll!nnl!nnnullnullnullnullnullnullnullnulll!nnl!nn!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!!" + "'", str2, "NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!!");
    }

    @Test
    public void test05705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05705");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UUNNUUNN!!UUNNUUNN!!UUNNUUNNUUNNUUNN!!UUNNUUNN!!UUNNUUNN!", "\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214\214!!!!\214\214\214!!!!\214\214\214!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\214\214!!\214\214!!!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!!!\214\214!!\214\214!" + "'", str2, "!!\214\214!!\214\214!!!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!!!\214\214!!\214\214!");
    }

    @Test
    public void test05706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05706");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e\u010b\u010c\u010e\u010e!", "}~\200\200}~\200\200TTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRR}~\200\200}~\200\200TTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRRTTRR!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031anullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031anullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05707");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275\275!!\275\275!!!!\275\275!!\275\275!!!!!", "NnullnullnullNnullnullnullNnullnullnullNnullnullnull\200}}`NnullnullnullNnullnullnullNnullnullnullNnullnullnull]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\275!!\275\275!!!!\275\275!!\275\275!!!!!" + "'", str2, "\275\275!!\275\275!!!!\275\275!!\275\275!!!!!");
    }

    @Test
    public void test05708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05708");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("hfhhHHHhfhhHHHHHhfhhHHHhfhhHHHHHhfhhHHHhfhhHHHHHhfhhHHHhfhhHHHHHhfhhHHHhfhhHHHHHhfhhHHHhfhhHHHHHhfhhHHHhfhhHHHHHhfhhHHHhfhhHHHHH!", "\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]\215\216\230\230!!]]!!]]!!]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05709");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("`!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL`!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!", "\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01dd\u01ddnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300!" + "'", str2, "\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300\u0300!");
    }

    @Test
    public void test05710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05710");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!NNNNNNNN!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test05711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05711");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~nullnullnullnullnull~~!", "vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!vv!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull~~!");
    }

    @Test
    public void test05712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05712");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254!!NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254!!NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254!!NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254!!NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254!!NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254!!NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254!!NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254NULLNULLNULLNULLNULLNULL!!NULLNULL!!NULLNULL!!\256\254\254!!!", "~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!~}\200\200~}\200\200!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!" + "'", str2, "!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!");
    }

    @Test
    public void test05713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05713");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!U!!!U!!!!U!!!U!!!", "\275\u0108\u0108\u0108\275\u0108\u0108\u0108!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!!!null!!!!null!!!null!!null!!!null!!!!null!!!null!!null!!!null!!!!null!!!null!!null!!!null!!!!null!!!null!!null!!!null!!!!null!!!null!!null!!!null!!!!null!!!null!!null!!!null!!!!null!!!null!!null!!!null!!!!null!!!null!!!" + "'", str2, "null!!!null!!!!null!!!null!!null!!!null!!!!null!!!null!!null!!!null!!!!null!!!null!!null!!!null!!!!null!!!null!!null!!!null!!!!null!!!null!!null!!!null!!!!null!!!null!!null!!!null!!!!null!!!null!!null!!!null!!!!null!!!null!!!");
    }

    @Test
    public void test05714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05714");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106\u0106nullLL!!!", "porrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporrporrporrporrporr!porrporrporrporrporrporrporrporr!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!!" + "'", str2, "OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!OPRRRRROPRRRRR!!!");
    }

    @Test
    public void test05715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05715");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!", "\u0346\u0348\u0348\u0348}~\200\200}~\200\200L\226LLL\226LL\223\223L\226LLL\226LLL\226LLL\226LLL\226LL\223\223L\226LLL\226LLL\226LL}~\200\200}~\200\200L\226LLL\226LL\223\223L\226LLL\226LLL\226LLL\226LLL\226LL\223\223L\226LLL\226LLL\226LL}~\200\200}~\200\200L\226LLL\226LL\223\223L\226LLL\226LLL\226LLL\226LLL\226LL\223\223L\226LLL\226LLL\226LL}~\200\200}~\200\200L\226LLL\226LL\223\223L\226LLL\226LLL\226LLL\226LLL\226LL\223\223L\226LLL\226LLL\226\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!" + "'", str2, "\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!");
    }

    @Test
    public void test05716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05716");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!", "null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```null\340\275\275!!!```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````!" + "'", str2, "````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````!");
    }

    @Test
    public void test05717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05717");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108\u0108!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05718");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!!!!~nullnullnullnullnullnullnullnull!!!!~nullnullnullnullnullnullnullnull!!!", "LLUU\253\253\253\200}}`LLUU\253\253\253]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~u!llu!llu!llu!llu!llu!llu!llu!ll!!!!~u!llu!llu!llu!llu!llu!llu!llu!ll!!!!!!~u!llu!llu!llu!llu!llu!llu!llu!ll!!!!~u!llu!llu!llu!llu!llu!llu!llu!ll!!!!!!~u!llu!llu!llu!llu!llu!llu!llu!ll!!!!~u!llu!llu!llu!llu!llu!llu!llu!ll!!!!~u!llu!llu!llu!llu!llu!llu!llu!ll!!!!~u!llu!llu!llu!llu!llu!llu!llu!ll!!!!!!~u!llu!llu!llu!llu!llu!llu!llu!ll!!!!~u!llu!llu!llu!llu!llu!llu!llu!ll!!!!!!~u!llu!llu!llu!llu!llu!llu!llu!ll!!!!~u!llu!llu!llu!llu!llu!llu!llu!ll!!!" + "'", str2, "!!~u!llu!llu!llu!llu!llu!llu!llu!ll!!!!~u!llu!llu!llu!llu!llu!llu!llu!ll!!!!!!~u!llu!llu!llu!llu!llu!llu!llu!ll!!!!~u!llu!llu!llu!llu!llu!llu!llu!ll!!!!!!~u!llu!llu!llu!llu!llu!llu!llu!ll!!!!~u!llu!llu!llu!llu!llu!llu!llu!ll!!!!~u!llu!llu!llu!llu!llu!llu!llu!ll!!!!~u!llu!llu!llu!llu!llu!llu!llu!ll!!!!!!~u!llu!llu!llu!llu!llu!llu!llu!ll!!!!~u!llu!llu!llu!llu!llu!llu!llu!ll!!!!!!~u!llu!llu!llu!llu!llu!llu!llu!ll!!!!~u!llu!llu!llu!llu!llu!llu!llu!ll!!!");
    }

    @Test
    public void test05719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05719");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}H\200\200}H\200\200}H\200\200}H\200\200!HHH!HHH!HHH!HHH}H\200\200}H\200\200}H\200\200}H\200\200!HHH!HHH!", "\u0368\u0368\u0368\u0368!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}!\200\200}!\200\200}!\200\200}!\200\200!!!!!!!!!!!!!!!!}!\200\200}!\200\200}!\200\200}!\200\200!!!!!!!!!" + "'", str2, "}!\200\200}!\200\200}!\200\200}!\200\200!!!!!!!!!!!!!!!!}!\200\200}!\200\200}!\200\200}!\200\200!!!!!!!!!");
    }

    @Test
    public void test05720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05720");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275XXX\275XXX!", "H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnull\275nullnullnull!" + "'", str2, "\275nullnullnull\275nullnullnull!");
    }

    @Test
    public void test05721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05721");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256!", "nullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256!" + "'", str2, "\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256\254\256\256\256!");
    }

    @Test
    public void test05722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05722");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("fehhfehh!", "!!!!\300\300!!\300\300!!\300\300!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\300\300!!\300\300!!\300\300!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05723");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!!!nullnullnullnull!!!nullnullnullnull!!!", "EEEEEEEEEEEEEEEE\200}}`EEEEEEEEEEEEEEEE]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!eeeeeeeeeeeeeeee!!!eeeeeeeeeeeeeeee!!!!!eeeeeeeeeeeeeeee!!!eeeeeeeeeeeeeeee!!!!!eeeeeeeeeeeeeeee!!!eeeeeeeeeeeeeeee!!!eeeeeeeeeeeeeeee!!!eeeeeeeeeeeeeeee!!!!!eeeeeeeeeeeeeeee!!!eeeeeeeeeeeeeeee!!!!!eeeeeeeeeeeeeeee!!!eeeeeeeeeeeeeeee!!!" + "'", str2, "!eeeeeeeeeeeeeeee!!!eeeeeeeeeeeeeeee!!!!!eeeeeeeeeeeeeeee!!!eeeeeeeeeeeeeeee!!!!!eeeeeeeeeeeeeeee!!!eeeeeeeeeeeeeeee!!!eeeeeeeeeeeeeeee!!!eeeeeeeeeeeeeeee!!!!!eeeeeeeeeeeeeeee!!!eeeeeeeeeeeeeeee!!!!!eeeeeeeeeeeeeeee!!!eeeeeeeeeeeeeeee!!!");
    }

    @Test
    public void test05724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05724");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\336\336!!\214\214!", "HH!!H~~HH!!H~~HH!!H~~HH!!H~~HH!!H~~HH!!H~~HH!!H~~HH!!H~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!\214\214!");
    }

    @Test
    public void test05725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05725");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!", "unulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluuunulluunullunulluuunulluuunulluunullunulluuunulluu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!" + "'", str2, "LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!!LLUULLUULLUULLUULLUULLUULLUULLUU!");
    }

    @Test
    public void test05726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05726");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\276!!!\276\276!!\276\276!!\276\276!!\276\276!!\276!!!\276\276!!\276\276!!!", "!!nullnull!Vnullnull!Vnullnullnullnull!Vnullnull!Vnullnull!!nullnull!Vnullnull!Vnullnullnullnull!Vnullnull!Vnullnull!!nullnull!Vnullnull!Vnullnullnullnull!Vnullnull!Vnullnull!!nullnull!Vnullnull!Vnullnullnullnull!Vnullnull!Vnullnull!!nullnull!Vnullnull!Vnullnullnullnull!Vnullnull!Vnullnull!!nullnull!Vnullnull!Vnullnullnullnull!Vnullnull!Vnullnull!!nullnull!Vnullnull!Vnullnullnullnull!Vnullnull!Vnullnull!!nullnull!Vnullnull!Vnullnullnullnull!Vnullnull!Vnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!!!\276\276!!\276\276!!\276\276!!\276\276!!\276!!!\276\276!!\276\276!!!" + "'", str2, "\276!!!\276\276!!\276\276!!\276\276!!\276\276!!\276!!!\276\276!!\276\276!!!");
    }

    @Test
    public void test05727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05727");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("}~\200\200}~\200\200\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338}~\200\200}~\200\200\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338!", "PRRRPRRR!!PRRRPRRR!!!!PRRRPRRR!!PRRRPRRR!!!!PRRRPRRR!!PRRRPRRR!!!!PRRRPRRR!!PRRRPRRR!!!!PRRRPRRR!!PRRRPRRR!!!!PRRRPRRR!!PRRRPRRR!!!!PRRRPRRR!!PRRRPRRR!!!!PRRRPRRR!!PRRRPRRR!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338}~\200\200}~\200\200\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338!" + "'", str2, "}~\200\200}~\200\200\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338}~\200\200}~\200\200\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338\u0335\u0336\u0338\u0338!");
    }

    @Test
    public void test05728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05728");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254\u0400\u0400!!\256\254\254!!!", "~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230~}\200\200~}\200\200U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230U^UUU^UUU^UUU^UUU^UUU^UUU^UUU^UU\230\230!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!!" + "'", str2, "nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!nullnull!!\256\254\254nullnull!!\256\254\254!!!");
    }

    @Test
    public void test05729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05729");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUUUNNNUNNNUNNNUNNNUUUUUUUUUUUU!", "LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUUUULLUULLUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test05730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05730");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d\275\276\u017d\u017d!", "!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull!" + "'", str2, "\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull!");
    }

    @Test
    public void test05731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05731");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de\u01e0\u01e0\u01de\u01de!", "!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\200}}`!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!" + "'", str2, "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
    }

    @Test
    public void test05732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05732");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\253\254\256\256````````````````\253\254\256\256````````!", "\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227\276\276nullnullnullnull\276\227\227nullnullnullnull\276\227\227!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\254\256\256````````````````\253\254\256\256````````!" + "'", str2, "\253\254\256\256````````````````\253\254\256\256````````!");
    }

    @Test
    public void test05733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05733");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!!LL!", "\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u011e\u011e!" + "'", str2, "\u011e\u011e!");
    }

    @Test
    public void test05734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05734");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253!", "\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll!!\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll!!\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll!!\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll!!\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll\216\216u!llu!ll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\222\221\224\224\222\221\224\224\253\253\222\221\224\224\222\221\224\224\253\253!");
    }

    @Test
    public void test05735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05735");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("FF]]FF]]FF]]FF]]~}}^FF]]FF]]FF]]FF]]]]!", "nullnull!!nullnull!!nullnull!!nullnull!!null!!!null!!!null!!!null!!!nullnull!!nullnull!!nullnull!!nullnull!!null!!!null!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UU]]UU]]UU]]UU]]~}}^UU]]UU]]UU]]UU]]]]!" + "'", str2, "UU]]UU]]UU]]UU]]~}}^UU]]UU]]UU]]UU]]]]!");
    }

    @Test
    public void test05736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05736");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "!!\214\214!!\214\214!!!!\214\214!!\214\214!!!!\214\214!!\214\214!!\214\214!!\214\214!!!!\214\214!!\214\214!!!!\214\214!!\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test05737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05737");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("H!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HHH!\275\275H!\275\275HH!", "\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250!" + "'", str2, "\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250\250!\275\275\250!\275\275\250\250!");
    }

    @Test
    public void test05738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05738");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}~\200\200}~\200\200!U!!!!!^!U!!!!!!U!!!!!!U!!!!!^!U!!!!!!U!!!!!}~\200\200}~\200\200!U!!!!!^!U!!!!!!U!!!!!!U!!!!!^!U!!!!!!U!!!!!!", "\253\254\256\256~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200\253\254\256\256~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200~}\200\200null~}\200\200~}\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200!~!!!!!^!~!!!!!!~!!!!!!~!!!!!^!~!!!!!!~!!!!!}~\200\200}~\200\200!~!!!!!^!~!!!!!!~!!!!!!~!!!!!^!~!!!!!!~!!!!!!" + "'", str2, "}~\200\200}~\200\200!~!!!!!^!~!!!!!!~!!!!!!~!!!!!^!~!!!!!!~!!!!!}~\200\200}~\200\200!~!!!!!^!~!!!!!!~!!!!!!~!!!!!^!~!!!!!!~!!!!!!");
    }

    @Test
    public void test05739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05739");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!!", "h]hhh]hh!!h]hhh]hh!!h]hhh]hhh]hhh]hh!!h]hhh]hh!!h]hhh]hh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254!!]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254!!]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254!!]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254!!]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254!!]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254!!]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254!!]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254!!!" + "'", str2, "]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254!!]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254!!]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254!!]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254!!]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254!!]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254!!]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254!!]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254]H]]]H]]]H]]]H]]]H]]]H]]!!]H]]]H]]!!]H]]]H]]!!\256\254\254!!!");
    }

    @Test
    public void test05740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05740");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!Lnullnull!Lnullnull!Lnullnull!Lnullnull!Lnullnull!", "\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e]]!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!" + "'", str2, "!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05741");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LNLLLNLL!!LNLLLNLL!!!", "}~\200\200}~\200\200FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF}~\200\200}~\200\200FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "FFFFFFFF!!FFFFFFFF!!!" + "'", str2, "FFFFFFFF!!FFFFFFFF!!!");
    }

    @Test
    public void test05742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05742");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}~\200\200}~\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX}~\200\200}~\200\200XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!", "!~lnulluulnulluu!~lnulluulnulluu!!!~lnulluulnulluu!~lnulluulnulluu!!!~lnulluulnulluu!~lnulluulnulluu!~lnulluulnulluu!~lnulluulnulluu!!!~lnulluulnulluu!~lnulluulnulluu!!!~lnulluulnulluu!~lnulluulnulluu!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU}~\200\200}~\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!" + "'", str2, "}~\200\200}~\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU}~\200\200}~\200\200UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
    }

    @Test
    public void test05743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05743");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll\276null\275\275\276null\275\275u!llu!llu!llu!llu!llu!llu!llu!ll!", "!~nullnull!~nullnull\220\220!~nullnull!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220\220!~nullnull\220\220!~nullnull!~nullnull\220\220!~nullnull!~nullnull\220\220!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!U\220\220\275\275\276!U\220\220\275\275U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220\276!U\220\220\275\275\276!U\220\220\275\275U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220\276!U\220\220\275\275\276!U\220\220\275\275U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220\276!U\220\220\275\275\276!U\220\220\275\275U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220\276!U\220\220\275\275\276!U\220\220\275\275U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220\276!U\220\220\275\275\276!U\220\220\275\275U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220\276!U\220\220\275\275\276!U\220\220\275\275U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220\276!U\220\220\275\275\276!U\220\220\275\275U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220!" + "'", str2, "\276!U\220\220\275\275\276!U\220\220\275\275U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220\276!U\220\220\275\275\276!U\220\220\275\275U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220\276!U\220\220\275\275\276!U\220\220\275\275U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220\276!U\220\220\275\275\276!U\220\220\275\275U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220\276!U\220\220\275\275\276!U\220\220\275\275U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220\276!U\220\220\275\275\276!U\220\220\275\275U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220\276!U\220\220\275\275\276!U\220\220\275\275U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220\276!U\220\220\275\275\276!U\220\220\275\275U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220U!\220\220!");
    }

    @Test
    public void test05744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05744");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("null!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnull!!null!nullnullnull!nullnull!", "!!!!\316null\313\313\316null\313\313!!\316null\313\313\316null\313\313!!!!\316null\313\313\316null\313\313!!\316null\313\313\316null\313\313!!!!\316null\313\313\316null\313\313!!\316null\313\313\316null\313\313!!!!\316null\313\313\316null\313\313!!\316null\313\313\316null\313\313!!!!\316null\313\313\316null\313\313!!\316null\313\313\316null\313\313!!!!\316null\313\313\316null\313\313!!\316null\313\313\316null\313\313!!!!\316null\313\313\316null\313\313!!\316null\313\313\316null\313\313!!!!\316null\313\313\316null\313\313!!\316null\313\313\316null\313\313!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e!" + "'", str2, "\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e!");
    }

    @Test
    public void test05745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05745");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test05746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05746");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u029e\u0346\u0348\u0348!", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test05747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05747");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!ll!!ll!!ll!!ll!!ll!!ll!!ll!!ll!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test05748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05748");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05749");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\200\200!!\200\200!!!", "!!~LL!!!!~LL!!!!!!~LL!!!!~LL!!!!!!~LL!!!!~LL!!!!~LL!!!!~LL!!!!!!~LL!!!!~LL!!!!!!~LL!!!!~LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200\200!!\200\200!!!" + "'", str2, "\200\200!!\200\200!!!");
    }

    @Test
    public void test05750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05750");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0245\u0246\u0248\u0248\253\253\253\200\u0245\u0246\u0248\u0248\253\253\253]]!", "\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL\200N!LLN!LLN!LL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\253\253\253\200}}`nullnullnullnull\253\253\253]]!" + "'", str2, "nullnullnullnull\253\253\253\200}}`nullnullnullnull\253\253\253]]!");
    }

    @Test
    public void test05751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05751");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!\253\256\256\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271\266null\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!!\204\204\204\204~\204\204\204\204\204\204\204\204\204\204\204\204~\204\204\204\204\204\204\204\204!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test05752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05752");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u020c\u020b\u020e\u020e\u020c\u020b\u020e\u020e\u020c\u020b\u020e\u020e\u020c\u020b\u020e\u020e\u020c\u020b\u020e\u020e!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05753");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225\275\276\300\300\275\276\300\300\225\225!", "~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225!" + "'", str2, "\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225\275\276nullnull\275\276nullnull\225\225!");
    }

    @Test
    public void test05754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05754");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253FFFFFFFF\253\253FFFFFFFF\253\253FFFFFFFF\253\253FFFFFFFF\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253FFFFFFFF\253\253FFFFFFFF\253\253!", "\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0\u01e0!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253````````\253\253````````\253\253````````\253\253````````\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253````````\253\253````````\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253````````\253\253````````\253\253````````\253\253````````\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253````````\253\253````````\253\253!");
    }

    @Test
    public void test05755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05755");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("L~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LLL~LLL~LLLLL~LLL~LLLLL~LLL~LL!", "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNNNLLNNLLNNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "N~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NN!" + "'", str2, "N~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NNN~NNN~NNNNN~NNN~NNNNN~NNN~NN!");
    }

    @Test
    public void test05756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05756");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnull!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05757");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!\215\216\230\230HFFF!!!HFFF!!!HFFF!!!!", "!!!!!!!!!!!!!!!!\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!" + "'", str2, "\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!\215\216\230\230nullnullnullnull!!!nullnullnullnull!!!nullnullnullnull!!!!");
    }

    @Test
    public void test05758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05758");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200N~\200\200N~\200\200~N\200\200~N\200\200!", "!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!!N!!!N!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u017d~\200\200\u017d~\200\200\u017d\200\200\u017d\200\200\u017d~\200\200\u017d~\200\200\u017d\200\200\u017d\200\200\u017d~\200\200\u017d~\200\200\u017d\200\200\u017d\200\200\u017d~\200\200\u017d~\200\200\u017d\200\200\u017d\200\200\u017d~\200\200\u017d~\200\200\u017d\200\200\u017d\200\200\u017d~\200\200\u017d~\200\200\u017d\200\200\u017d\200\200\u017d~\200\200\u017d~\200\200\u017d\200\200\u017d\200\200\u017d~\200\200\u017d~\200\200\u017d\200\200\u017d\200\200!" + "'", str2, "\u017d~\200\200\u017d~\200\200\u017d\200\200\u017d\200\200\u017d~\200\200\u017d~\200\200\u017d\200\200\u017d\200\200\u017d~\200\200\u017d~\200\200\u017d\200\200\u017d\200\200\u017d~\200\200\u017d~\200\200\u017d\200\200\u017d\200\200\u017d~\200\200\u017d~\200\200\u017d\200\200\u017d\200\200\u017d~\200\200\u017d~\200\200\u017d\200\200\u017d\200\200\u017d~\200\200\u017d~\200\200\u017d\200\200\u017d\200\200\u017d~\200\200\u017d~\200\200\u017d\200\200\u017d\200\200!");
    }

    @Test
    public void test05759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05759");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c\u016e\u016c\u016c!", "null\220nullnull\200}}`null\220nullnull]]!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]null{|~~nullnullnull{|~~nullnull]]null{|~~nullnullnull{|~~nullnull!!]]null{|~~nullnullnull{|~~nullnull]]null{|~~nullnullnull{|~~nullnull!!]]null{|~~nullnullnull{|~~nullnull]]null{|~~nullnullnull{|~~nullnull]]null{|~~nullnullnull{|~~nullnull]]null{|~~nullnullnull{|~~nullnull!!]]null{|~~nullnullnull{|~~nullnull]]null{|~~nullnullnull{|~~nullnull!!]]null{|~~nullnullnull{|~~nullnull]]null{|~~nullnullnull{|~~nullnull!" + "'", str2, "]]null{|~~nullnullnull{|~~nullnull]]null{|~~nullnullnull{|~~nullnull!!]]null{|~~nullnullnull{|~~nullnull]]null{|~~nullnullnull{|~~nullnull!!]]null{|~~nullnullnull{|~~nullnull]]null{|~~nullnullnull{|~~nullnull]]null{|~~nullnullnull{|~~nullnull]]null{|~~nullnullnull{|~~nullnull!!]]null{|~~nullnullnull{|~~nullnull]]null{|~~nullnullnull{|~~nullnull!!]]null{|~~nullnullnull{|~~nullnull]]null{|~~nullnullnull{|~~nullnull!");
    }

    @Test
    public void test05760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05760");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0108!", "\300\300!!\300\300!!\300\300\300\300\300\300\300\300\300\300!!\300\300!!\300\300\300\300\300\300\300\300\300\300!!\300\300!!\300\300\300\300\300\300\300\300\300\300!!\300\300!!\300\300\300\300\300\300\300\300\300\300!!\300\300!!\300\300\300\300\300\300\300\300\300\300!!\300\300!!\300\300\300\300\300\300\300\300\300\300!!\300\300!!\300\300\300\300\300\300\300\300\300\300!!\300\300!!\300\300\300\300\300\300\300\300!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!" + "'", str2, "!null!");
    }

    @Test
    public void test05761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05761");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!", "\u0366\u0365\u0368\u0368\245\245\245\245\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
    }

    @Test
    public void test05762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05762");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("FHHHFHHHFHHHFHHHFHHHFHHHFHHHFHHH!", "\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH!!\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH!!\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH!!\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH!!\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH\216\216FHHHFHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0225\u0228\u0228\u0228\u0225\u0228\u0228\u0228\u0225\u0228\u0228\u0228\u0225\u0228\u0228\u0228\u0225\u0228\u0228\u0228\u0225\u0228\u0228\u0228\u0225\u0228\u0228\u0228\u0225\u0228\u0228\u0228!" + "'", str2, "\u0225\u0228\u0228\u0228\u0225\u0228\u0228\u0228\u0225\u0228\u0228\u0228\u0225\u0228\u0228\u0228\u0225\u0228\u0228\u0228\u0225\u0228\u0228\u0228\u0225\u0228\u0228\u0228\u0225\u0228\u0228\u0228!");
    }

    @Test
    public void test05763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05763");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230\200}}`nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230]]!", "`]```]``!!`]```]``!!`]```]```]```]``!!`]```]``!!`]```]``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230\200}}```]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230]]!" + "'", str2, "``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230\200}}```]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230``]]``]]``]]``]]\225\230\230]]!");
    }

    @Test
    public void test05764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05764");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("~}\200\200~}\200\200LL!!LL!!LLLL!!LL!!LL~}\200\200~}\200\200LL!!LL!!LLLL!!LL!!LL~}\200\200~}\200\200LL!!LL!!LLLL!!LL!!LL~}\200\200~}\200\200LL!!LL!!LLLL!!LL!!LL~}\200\200~}\200\200LL!!LL!!LLLL!!LL!!LL~}\200\200~}\200\200LL!!LL!!LLLL!!LL!!LL~}\200\200~}\200\200LL!!LL!!LLLL!!LL!!LL~}\200\200~}\200\200LL!!LL!!LLLL!!LL!!LL!", "\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a\u041a!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``!" + "'", str2, "~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``~}\200\200~}\200\200``!!``!!````!!``!!``!");
    }

    @Test
    public void test05765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05765");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!\336\336\336\336nullnullnull\256\254\254\336\336\336\336nullnullnull\256\254\254!!!", "\276}L\200\200\275\275\276}L\200\200\275\275L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200\276}L\200\200\275\275\276}L\200\200\275\275L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200\276}L\200\200\275\275\276}L\200\200\275\275L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200\276}L\200\200\275\275\276}L\200\200\275\275L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200\276}L\200\200\275\275\276}L\200\200\275\275L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200\276}L\200\200\275\275\276}L\200\200\275\275L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200\276}L\200\200\275\275\276}L\200\200\275\275L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200\276}L\200\200\275\275\276}L\200\200\275\275L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200L!\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!" + "'", str2, "!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!!\200\275!!\200\275!!\200\275!!\256\254\254!!!");
    }

    @Test
    public void test05766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05766");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128\u0126\u0128\u0128!", "NLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnullNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnullNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnullNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnullNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnullNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnullNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnullNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLnullNLLLnullnullnullNLLLnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLL!LUNLLLLLUNLLLLUNLL!LUNLLLLLUNLLLL!!UNLL!LUNLLLLLUNLLLLUNLL!LUNLLLLLUNLLLL!!UNLL!LUNLLLLLUNLLLLUNLL!LUNLLLLLUNLLLLUNLL!LUNLLLLLUNLLLLUNLL!LUNLLLLLUNLLLL!!UNLL!LUNLLLLLUNLLLLUNLL!LUNLLLLLUNLLLL!!UNLL!LUNLLLLLUNLLLLUNLL!LUNLLLLLUNLLLL!" + "'", str2, "UNLL!LUNLLLLLUNLLLLUNLL!LUNLLLLLUNLLLL!!UNLL!LUNLLLLLUNLLLLUNLL!LUNLLLLLUNLLLL!!UNLL!LUNLLLLLUNLLLLUNLL!LUNLLLLLUNLLLLUNLL!LUNLLLLLUNLLLLUNLL!LUNLLLLLUNLLLL!!UNLL!LUNLLLLLUNLLLLUNLL!LUNLLLLLUNLLLL!!UNLL!LUNLLLLLUNLLLLUNLL!LUNLLLLLUNLLLL!");
    }

    @Test
    public void test05767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05767");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!EFHHEFHH!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!" + "'", str2, "LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!");
    }

    @Test
    public void test05768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05768");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!", "\275LLL\275LLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!" + "'", str2, "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!");
    }

    @Test
    public void test05769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05769");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!", "\u014f!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!" + "'", str2, "}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!!}~\200\200\236\276\276}~\200\200\236\276\276!");
    }

    @Test
    public void test05770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05770");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!!LL!", "~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200~}\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!\200\200!" + "'", str2, "!!!\200\200!");
    }

    @Test
    public void test05771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05771");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!!LL!!LL!!LL!!LL\256\254\254!!LL!!LL!!LL!!LL\256\254\254!!!", "\340\340!!\340\340!!nullnullnullnullnullnullnullnull\340\340!!\340\340!!nullnullnullnullnullnullnullnull\340\340!!\340\340!!nullnullnullnullnullnullnullnull\340\340!!\340\340!!nullnullnullnullnullnullnullnull\340\340!!\340\340!!nullnullnullnullnullnullnullnull\340\340!!\340\340!!nullnullnullnullnullnullnullnull\340\340!!\340\340!!nullnullnullnullnullnullnullnull\340\340!!\340\340!!nullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254!!!" + "'", str2, "\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254\u0180\u0180\u0180\u0180\u0180\u0180\u0180\u0180\256\254\254!!!");
    }

    @Test
    public void test05772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05772");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e\u011b\u011e\u011e\u011e!", "!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!" + "'", str2, "!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LLL!");
    }

    @Test
    public void test05773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05773");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("UU!", "\u0366\u0365\u0368\u0368\335\340\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!" + "'", str2, "LL!");
    }

    @Test
    public void test05774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05774");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128\u0125\u0126\u0128\u0128!", "!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!!\256null!nullnull\254\254\256null!nullnull\254\254!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NULLNULLNULLNULLNULL!" + "'", str2, "NULLNULLNULLNULLNULL!");
    }

    @Test
    public void test05775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05775");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!!", "\253\254\256\256~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200\253\254\256\256~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200~}\200\200~n~~~}\200\200~}\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!!" + "'", str2, "\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!\276~!!\276~!!!!\276~!!\276~!!!!!!!");
    }

    @Test
    public void test05776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05776");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275``uuuuuuuu``uuuuuuuu``uuuuuuuu\276``uuuuuuuu\275\275!", "\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200}}`\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230\200\200\200\200\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275``\230\230\230\230\230\230\230\230``\230\230\230\230\230\230\230\230``\230\230\230\230\230\230\230\230\276``\230\230\230\230\230\230\230\230\275\275!" + "'", str2, "\275``\230\230\230\230\230\230\230\230``\230\230\230\230\230\230\230\230``\230\230\230\230\230\230\230\230\276``\230\230\230\230\230\230\230\230\275\275!");
    }

    @Test
    public void test05777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05777");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!", "EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!" + "'", str2, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
    }

    @Test
    public void test05778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05778");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "}~\200\200}~\200\200\276\271\271\271^\276\271\271\271\276\271\271\271\276\271\271\271^\276\271\271\271\276\271\271\271}~\200\200}~\200\200\276\271\271\271^\276\271\271\271\276\271\271\271\276\271\271\271^\276\271\271\271\276\271\271\271!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05779");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!\271\271!!\271\271\271\271!!\271\271!!!!\271\271!!\271\271\271\271!!\271\271!!!", "\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\271\271!!\271\271\271\271!!\271\271!!!!\271\271!!\271\271\271\271!!\271\271!!!" + "'", str2, "!!\271\271!!\271\271\271\271!!\271\271!!!!\271\271!!\271\271\271\271!!\271\271!!!");
    }

    @Test
    public void test05780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05780");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("ULLLULLLULLLULLL\200}}`ULLLULLLULLLULLL]]!", "null!nullnullnullnull!!nullnull!!nullnull!!nullnull!!null!nullnullnullnull!!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLL]]!" + "'", str2, "LLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLL]]!");
    }

    @Test
    public void test05781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05781");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\214!!", "~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull~}\200\200~}\200\200rrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnullrrRRrrRRrrRRrrRRrrRRrrRRrrRRrrRRnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214!!" + "'", str2, "\214!!");
    }

    @Test
    public void test05782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05782");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]!", "\u0366\u0365\u0368\u0368nullnull!!nullnull!!\200\200\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]!" + "'", str2, "\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]\220\220\216\216\220\220\216\216stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]stvvstvv]]!");
    }

    @Test
    public void test05783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05783");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!", "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNN!" + "'", str2, "NNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNN!!NNNNNNNNNNNNNNNNNNNN!");
    }

    @Test
    public void test05784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05784");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!ffFF!", "\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227\226\227\227\227!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnull!" + "'", str2, "!nullnullnullnull!");
    }

    @Test
    public void test05785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05785");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275UUU\275UUU!", "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!\214!!!\214!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnull\275nullnullnull!" + "'", str2, "\275nullnullnull\275nullnullnull!");
    }

    @Test
    public void test05786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05786");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~!", "\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull}}\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull\336nullnullnull}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~!" + "'", str2, "}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~}}}}}\200\200}}}}}\200\200}}}}}\200\200}}}}}\200\200}!~~}!~~}!~~}!~~}!~~}!~~}!~~}!~~!");
    }

    @Test
    public void test05787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05787");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!" + "'", str2, "!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!");
    }

    @Test
    public void test05788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05788");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!U!", "nullnullnullnull\275\275\275nullnullnullnull\275\275\275!!nullnullnullnull\275\275\275nullnullnullnull\275\275\275!!nullnullnullnull\275\275\275nullnullnullnull\275\275\275nullnullnullnull\275\275\275nullnullnullnull\275\275\275!!nullnullnullnull\275\275\275nullnullnullnull\275\275\275!!nullnullnullnull\275\275\275nullnullnullnull\275\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!U!" + "'", str2, "!U!");
    }

    @Test
    public void test05789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05789");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336\300\336\336\336!", "\u037e\u037b\u037b\u037e\u037b\u037b\u037e\u037b\u037b\u037e\u037b\u037b\u037e\u037b\u037b\u037e\u037b\u037b\u037e\u037b\u037b\u037e\u037b\u037bnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05790");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}~\200\200}~\200\200!~!!!!!^!~!!!!!!~!!!!!!~!!!!!^!~!!!!!!~!!!!!}~\200\200}~\200\200!~!!!!!^!~!!!!!!~!!!!!!~!!!!!^!~!!!!!!~!!!!!!", "URRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRR\200}}`URRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRR]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200!~!!!!!^!~!!!!!!~!!!!!!~!!!!!^!~!!!!!!~!!!!!}~\200\200}~\200\200!~!!!!!^!~!!!!!!~!!!!!!~!!!!!^!~!!!!!!~!!!!!!" + "'", str2, "}~\200\200}~\200\200!~!!!!!^!~!!!!!!~!!!!!!~!!!!!^!~!!!!!!~!!!!!}~\200\200}~\200\200!~!!!!!^!~!!!!!!~!!!!!!~!!!!!^!~!!!!!!~!!!!!!");
    }

    @Test
    public void test05791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05791");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LLUULNUULNUULNUULLUULNUULNUULNUULLUULNUULNUULNUULLUULNUULNUULNUULLUULNUULNUULNUULLUULNUULNUULNUULLUULNUULNUULNUULLUULNUULNUULNUU!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnull!!nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0168\u0168\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0168\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0168\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0168\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0168\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0168\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0168\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0168\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166!" + "'", str2, "\u0168\u0168\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0168\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0168\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0168\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0168\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0168\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0168\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0168\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166\u0168\u0165\u0166\u0166!");
    }

    @Test
    public void test05792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05792");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("~}\200\200~}\200\200!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230~}\200\200~}\200\200!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230~}\200\200~}\200\200!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230~}\200\200~}\200\200!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230~}\200\200~}\200\200!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230~}\200\200~}\200\200!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230~}\200\200~}\200\200!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230~}\200\200~}\200\200!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230!!FF!!FF!!FF!!FF!!FF!!FF!!FF!!FF\230\230!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!" + "'", str2, "~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230~}\200\200~}\200\200!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!!UU!!UU!!UU!!UU!!UU!!UU!!UU!!UU\230\230!");
    }

    @Test
    public void test05793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05793");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!\200}}`!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!!PORR!!]]!", "]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!!]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}]```]```}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!\200}}`!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!]]!" + "'", str2, "!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!\200}}`!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!!`]``!!]]!");
    }

    @Test
    public void test05794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05794");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!\253\256\256\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU!!\276U\266\266~UU\276U\266\266~UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271\266~\204\204\204\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test05795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05795");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!!", "\u0126\u0128\u0128\u0126\u0128\u0128!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test05796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05796");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260stvvstvv\255\256\260\260\255\256\260\260!", "\u0346\u0348\u0348\u0348\u0108\u0106\u0106\u0106\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260!" + "'", str2, "nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260nullnullnullnullnullnullnullnull\255\256\260\260\255\256\260\260!");
    }

    @Test
    public void test05797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05797");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!!", "\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128\275\200\u0128\u0128!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!!" + "'", str2, "\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!\256\256\256\256\256\256\256\256!!!");
    }

    @Test
    public void test05798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05798");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!hee!hee!!!hee!hee!!!hee!hee!hee!hee!hee!hee!hee!hee!hee!hee!!!hee!hee!!!hee!hee!hee!hee!hee!hee!hee!hee!hee!hee!!!hee!hee!!!hee!hee!hee!hee!hee!hee!hee!hee!hee!hee!!!hee!hee!!!hee!hee!hee!hee!hee!hee!hee!hee!hee!hee!!!hee!hee!!!hee!hee!hee!hee!hee!hee!hee!hee!hee!hee!!!hee!hee!!!hee!hee!hee!hee!hee!hee!hee!hee!hee!hee!!!hee!hee!!!hee!hee!hee!hee!hee!hee!hee!hee!hee!hee!!!hee!hee!!!hee!hee!hee!hee!hee!hee!hee!hee!", "\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170nullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!LNN!LNN!!!LNN!LNN!!!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!!!LNN!LNN!!!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!!!LNN!LNN!!!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!!!LNN!LNN!!!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!!!LNN!LNN!!!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!!!LNN!LNN!!!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!!!LNN!LNN!!!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!!!LNN!LNN!!!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!" + "'", str2, "!LNN!LNN!!!LNN!LNN!!!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!!!LNN!LNN!!!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!!!LNN!LNN!!!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!!!LNN!LNN!!!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!!!LNN!LNN!!!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!!!LNN!LNN!!!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!!!LNN!LNN!!!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!!!LNN!LNN!!!LNN!LNN!LNN!LNN!LNN!LNN!LNN!LNN!");
    }

    @Test
    public void test05799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05799");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\336~\300\300\336~\300\300!!\336~\300\300\336~\300\300!!\336~\300\300\336~\300\300\336~\300\300\336~\300\300!!\336~\300\300\336~\300\300!!\336~\300\300\336~\300\300!", "\253\254\256\256\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\253\254\256\256\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnullnull~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnull!" + "'", str2, "null~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnullnull~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnull!");
    }

    @Test
    public void test05800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05800");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230~}\200\200~}\200\200nullnull\230\230nullnull\230\230!", "\300!\276\276\300!\276\276\300!\276\276\300!\276\276\300!\276\276\300!\276\276\300!\276\276\300!\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230!" + "'", str2, "~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230~}\200\200~}\200\200nullnullnullnullnullnullnullnull\230\230nullnullnullnullnullnullnullnull\230\230!");
    }

    @Test
    public void test05801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05801");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~!", "hfhhhfhh!!hfhhhfhh!!hfhhhfhhhfhhhfhh!!hfhhhfhh!!hfhhhfhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~!" + "'", str2, "\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~!");
    }

    @Test
    public void test05802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05802");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("^```^```^```^```^```^```^```^```^```^```nullnull\225\225nullnull\225\225^```^```nullnull\225\225nullnull\225\225^```^```^```^```^```^```^```^```^```^```nullnull\225\225nullnull\225\225^```^```nullnull\225\225nullnull\225\225^```^```^```^```^```^```^```^```^```^```nullnull\225\225nullnull\225\225^```^```nullnull\225\225nullnull\225\225^```^```^```^```^```^```^```^```^```^```nullnull\225\225nullnull\225\225^```^```nullnull\225\225nullnull\225\225^```^```^```^```^```^```^```^```^```^```nullnull\225\225nullnull\225\225^```^```nullnull\225\225nullnull\225\225^```^```^```^```^```^```^```^```^```^```nullnull\225\225nullnull\225\225^```^```nullnull\225\225nullnull\225\225^```^```^```^```^```^```^```^```^```^```nullnull\225\225nullnull\225\225^```^```nullnull\225\225nullnull\225\225^```^```^```^```^```^```^```^```^```^```nullnull\225\225nullnull\225\225^```^```nullnull\225\225nullnull\225\225!", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```^```^```^```^```^```^```^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```^```^```^```^```^```^```^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```^```^```^```^```^```^```^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```^```^```^```^```^```^```^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```^```^```^```^```^```^```^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```^```^```^```^```^```^```^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```^```^```^```^```^```^```^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```^```^```^```^```^```^```^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```UUUUUUUU\225\225UUUUUUUU\225\225!" + "'", str2, "^```^```^```^```^```^```^```^```^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```^```^```^```^```^```^```^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```^```^```^```^```^```^```^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```^```^```^```^```^```^```^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```^```^```^```^```^```^```^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```^```^```^```^```^```^```^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```^```^```^```^```^```^```^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```^```^```^```^```^```^```^```^```UUUUUUUU\225\225UUUUUUUU\225\225^```^```UUUUUUUU\225\225UUUUUUUU\225\225!");
    }

    @Test
    public void test05803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05803");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254NL]]NL]]NL]]NL]]NL]]NL]]NL]]NL]]\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254NL]]NL]]NL]]NL]]NL]]NL]]NL]]NL]]!", "UULLUULL!!UULLUULL!!UULLUULLUULLUULL!!UULLUULL!!UULLUULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254nullx]]nullx]]nullx]]nullx]]nullx]]nullx]]nullx]]nullx]]\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254nullx]]nullx]]nullx]]nullx]]nullx]]nullx]]nullx]]nullx]]!" + "'", str2, "\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254nullx]]nullx]]nullx]]nullx]]nullx]]nullx]]nullx]]nullx]]\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254\254\275\254\254nullx]]nullx]]nullx]]nullx]]nullx]]nullx]]nullx]]nullx]]!");
    }

    @Test
    public void test05804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05804");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUU!", "\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UU\214\214UUUNNNUNNNUNNNUNNNUNNNUNNNUNNNUNNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214!" + "'", str2, "\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214\214\214!!\214\214!!\214\214\214\214\214\214\214\214!");
    }

    @Test
    public void test05805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05805");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!nullnull!!nullnull!", "\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL\226L\230\230LLL\226L\230\230LLLLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!" + "'", str2, "!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!");
    }

    @Test
    public void test05806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05806");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL\200}}`LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL]]!", "UZLLUZLL!!UZLLUZLL!!!!UZLLUZLL!!UZLLUZLL!!!!!!UZLLUZLL!!UZLLUZLL!!!!UZLLUZLL!!UZLLUZLL!!!!!!UZLLUZLL!!UZLLUZLL!!!!UZLLUZLL!!UZLLUZLL!!!!!!UZLLUZLL!!UZLLUZLL!!!!UZLLUZLL!!UZLLUZLL!!!!!!UZLLUZLL!!UZLLUZLL!!!!UZLLUZLL!!UZLLUZLL!!!!!!UZLLUZLL!!UZLLUZLL!!!!UZLLUZLL!!UZLLUZLL!!!!!!UZLLUZLL!!UZLLUZLL!!!!UZLLUZLL!!UZLLUZLL!!!!!!UZLLUZLL!!UZLLUZLL!!!!UZLLUZLL!!UZLLUZLL!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ\200}}`ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ]]!" + "'", str2, "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ\200}}`ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ]]!");
    }

    @Test
    public void test05807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05807");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220!!\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220!!!", "}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220!!\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220!!!" + "'", str2, "\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220!!\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220\216!\220\220!!!");
    }

    @Test
    public void test05808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05808");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!", "\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL\215\216\230\230UNLLUNLLUNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!" + "'", str2, "\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!\201\201!!\201!!!");
    }

    @Test
    public void test05809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05809");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("v!nullnullv!nullnullv!nullnullv!nullnullv!nullnullv!nullnullv!nullnullv!nullnull!", "\u0128\u0126\u0126\u0108\u0106\u0106!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!ijllijllnull!ijllijllnull!ijllijllnull!ijllijllnull!ijllijllnull!ijllijllnull!ijllijllnull!ijllijll!" + "'", str2, "null!ijllijllnull!ijllijllnull!ijllijllnull!ijllijllnull!ijllijllnull!ijllijllnull!ijllijllnull!ijllijll!");
    }

    @Test
    public void test05810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05810");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!NN!!!", "\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test05811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05811");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05812");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("ab!", "\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!\275NNNNNNNNNNN!!!!\275NNNNNNNNNNN!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!" + "'", str2, "nullnull!");
    }

    @Test
    public void test05813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05813");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!", "nullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!" + "'", str2, "!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!!\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]\230\226]]!");
    }

    @Test
    public void test05814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05814");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!\275\275!!!\275\275!!!!!\275\275!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05815");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!", "\253\254\256\256null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!\253\254\256\256null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test05816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05816");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!", "!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!\254\u02be\u02be!\254\u02be\u02be!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!" + "'", str2, "\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!!\260]\260\260\260]\260\260!");
    }

    @Test
    public void test05817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05817");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("fehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehhfehh!", "~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull~}\200\200~}\200\200nullxnullnullnullxnullnullnullnullnullxnullnullnullxnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!" + "'", str2, "LLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUU!");
    }

    @Test
    public void test05818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05818");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "URRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRR\200}}`URRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRRURRR]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test05819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05819");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullnullnullnullnullnullnull\340\340nullnull\340\340nullnullnullnullnullnullnullnullnullnull\340\340nullnull\340\340nullnullnullnullnullnullnullnullnullnull\340\340nullnull\340\340nullnullnullnullnullnullnullnullnullnull\340\340nullnull\340\340nullnullnullnullnullnullnullnullnullnull\340\340nullnull\340\340nullnullnullnullnullnullnullnullnullnull\340\340nullnull\340\340nullnullnullnullnullnullnullnullnullnull\340\340nullnull\340\340nullnullnullnullnullnullnullnullnullnull\340\340nullnull\340\340!", "}null\200\200}null\200\200}null\200\200}null\200\200L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~}null\200\200}null\200\200}null\200\200}null\200\200L!~~L!~~L!~~L!~~L!~~L!~~L!~~L!~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!" + "'", str2, "!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~!L~~~~!L~~!L~~~~!");
    }

    @Test
    public void test05820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05820");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!!!\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!!!]]!", "nullnullnullnullnullnullnullnullXXXXXXXXnullnullnullnullnullnullnullnullXXXXXXXXnullnullnullnullnullnullnullnullXXXXXXXXnullnullnullnullnullnullnullnullXXXXXXXXnullnullnullnullnullnullnullnullXXXXXXXXnullnullnullnullnullnullnullnullXXXXXXXXnullnullnullnullnullnullnullnullXXXXXXXXnullnullnullnullnullnullnullnullXXXXXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!!!\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!!!]]!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!!!\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~!!!]]!");
    }

    @Test
    public void test05821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05821");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\230\226u!llu!ll\236\276\276\230\226u!llu!ll\236\276\276!!\230\226u!llu!ll\236\276\276\230\226u!llu!ll\236\276\276!!\230\226u!llu!ll\236\276\276\230\226u!llu!ll\236\276\276\230\226u!llu!ll\236\276\276\230\226u!llu!ll\236\276\276!!\230\226u!llu!ll\236\276\276\230\226u!llu!ll\236\276\276!!\230\226u!llu!ll\236\276\276\230\226u!llu!ll\236\276\276!", "nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230\200}}`nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230nullnullnullnull\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\226L!UUL!UU\236\276\276\230\226L!UUL!UU\236\276\276!!\230\226L!UUL!UU\236\276\276\230\226L!UUL!UU\236\276\276!!\230\226L!UUL!UU\236\276\276\230\226L!UUL!UU\236\276\276\230\226L!UUL!UU\236\276\276\230\226L!UUL!UU\236\276\276!!\230\226L!UUL!UU\236\276\276\230\226L!UUL!UU\236\276\276!!\230\226L!UUL!UU\236\276\276\230\226L!UUL!UU\236\276\276!" + "'", str2, "\230\226L!UUL!UU\236\276\276\230\226L!UUL!UU\236\276\276!!\230\226L!UUL!UU\236\276\276\230\226L!UUL!UU\236\276\276!!\230\226L!UUL!UU\236\276\276\230\226L!UUL!UU\236\276\276\230\226L!UUL!UU\236\276\276\230\226L!UUL!UU\236\276\276!!\230\226L!UUL!UU\236\276\276\230\226L!UUL!UU\236\276\276!!\230\226L!UUL!UU\236\276\276\230\226L!UUL!UU\236\276\276!");
    }

    @Test
    public void test05822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05822");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0\u01dd\u01de\u01e0\u01e0!", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!!!nullnullnullnullnullnullnullnullnullnullnullnull!nullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05823");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104~}\200\200~}\200\200\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104\u0101\u0102\u0104\u0104!", "W!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XXW!XX!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX~}\200\200~}\200\200!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX~}\200\200~}\200\200!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX~}\200\200~}\200\200!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX~}\200\200~}\200\200!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX~}\200\200~}\200\200!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX~}\200\200~}\200\200!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX~}\200\200~}\200\200!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX!" + "'", str2, "~}\200\200~}\200\200!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX~}\200\200~}\200\200!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX~}\200\200~}\200\200!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX~}\200\200~}\200\200!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX~}\200\200~}\200\200!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX~}\200\200~}\200\200!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX~}\200\200~}\200\200!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX~}\200\200~}\200\200!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX!WXX!!WXX!WXX!WXX!!WXX!WXXW!XXW!XX!");
    }

    @Test
    public void test05824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05824");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!!HH!!HH!!!", "\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL\275LLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!" + "'", str2, "!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!!LL!!LL!!!");
    }

    @Test
    public void test05825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05825");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UNLLUNLL\253\253UNLLUNLL\253\253UNLLUNLL\253\253UNLLUNLL\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253UNLLUNLL\253\253UNLLUNLL\253\253!", "EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253EEEEEEEE\253\253EEEEEEEE\253\253EEEEEEEE\253\253EEEEEEEE\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253EEEEEEEE\253\253EEEEEEEE\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253EEEEEEEE\253\253EEEEEEEE\253\253EEEEEEEE\253\253EEEEEEEE\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253EEEEEEEE\253\253EEEEEEEE\253\253!");
    }

    @Test
    public void test05826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05826");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!", "!\253\256\256\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271\266\214!\214\214\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\271\271\214\214\271\271\214\214\271\271\214\214!\271\271\214\214\271\271\214\214\271\271\214\214!\271\271\214\214\271\271\214\214\271\271\214\214!\271\271\214\214\271\271\214\214\271\271\214\214!\271\271\214\214\271\271\214\214\271\271\214\214!" + "'", str2, "!\271\271\214\214\271\271\214\214\271\271\214\214!\271\271\214\214\271\271\214\214\271\271\214\214!\271\271\214\214\271\271\214\214\271\271\214\214!\271\271\214\214\271\271\214\214\271\271\214\214!\271\271\214\214\271\271\214\214\271\271\214\214!");
    }

    @Test
    public void test05827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05827");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!!!XXX!XXX!XXX!XXX!XXX!XXX!XXX!XXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test05828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05828");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226!!null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226!!!", "!!~~!!~~!!!!~~!!~~!!!!~~!!~~!!~~!!~~!!!!~~!!~~!!!!~~!!~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226!!~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226!!!" + "'", str2, "~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226!!~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226~!!!\230\226\226!!!");
    }

    @Test
    public void test05829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05829");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("fehhfehhnullnullfehhfehhnullnull!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05830");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test05831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05831");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366]]!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366]]!" + "'", str2, "\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366]]!");
    }

    @Test
    public void test05832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05832");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242\u0242!!!", "nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256nullnullnullnullnullnullnullnull\253\254\256\256\253\254\256\256!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test05833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05833");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF~}\200\200~}\200\200HHFFHHFF!", "!LUU!LUU!LUU!LUU!UUU!UUU!UUU!UUU!LUU!LUU!LUU!LUU!UUU!UUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull!" + "'", str2, "~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull~}\200\200~}\200\200nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05834");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214!", "!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!!LLNNLLNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214!" + "'", str2, "\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\201\201~~\214\214!");
    }

    @Test
    public void test05835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05835");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348ll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05836");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("EEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EE!!EEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EE!!EEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EE!!EEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EE!!EEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EEEEEE!EE!", "`R!RRRRRR!RRRRRR!RRRRR`R!RRRRRR!RRRRRR!RRRRR!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!!RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!!RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!!RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!!RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!" + "'", str2, "RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!!RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!!RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!!RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!!RRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RRRRRR!RR!");
    }

    @Test
    public void test05837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05837");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!" + "'", str2, "LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!!LLLLLLLLLLLLLLLLLLLL!");
    }

    @Test
    public void test05838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05838");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!", "\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e\u029b\u029e\u029e\u029e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05839");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("RRPPRRPPRRPPRRPPRRPPRRPPRRPPRRPP!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05840");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}~\200\200}~\200\200L^NNL^NN}~\200\200}~\200\200L^NNL^NN!", "L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]L]^^L]^^L]^^L]^^L]^^L]^^L]^^L]^^!L]]!L]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200^^]]^^]]}~\200\200}~\200\200^^]]^^]]!" + "'", str2, "}~\200\200}~\200\200^^]]^^]]}~\200\200}~\200\200^^]]^^]]!");
    }

    @Test
    public void test05841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05841");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\367!\372\372\367!\372\372!", "\275\u0174\u0174\u0174\275\u0174\u0174\u0174!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\367!nullnull\367!nullnull!" + "'", str2, "\367!nullnull\367!nullnull!");
    }

    @Test
    public void test05842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05842");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0346\u0346!!!!", "]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346!!!!" + "'", str2, "\u0346\u0346!!!!");
    }

    @Test
    public void test05843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05843");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\260\260NN\260\260NN}}\260\260NN\260\260NN}}!", "\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!!\275!!!\275!!\275\275!\275!!!\275!!\275\275!\275!!!\275!!\275\275!\275!!!\275!!\275\275\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!!\275!!!\275!!\275\275!\275!!!\275!!\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\260nullnull\260\260nullnull}}\260\260nullnull\260\260nullnull}}!" + "'", str2, "\260\260nullnull\260\260nullnull}}\260\260nullnull\260\260nullnull}}!");
    }

    @Test
    public void test05844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05844");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108\u0106\u0105\u0108\u0108!", "!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!!]LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test05845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05845");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("]AAAAA]]AA]]AA]]AA]]]AAAAA]]AA]]!", "!!~LL!!!!~LL!!!!!!~LL!!!!~LL!!!!!!~LL!!!!~LL!!!!~LL!!!!~LL!!!!!!~LL!!!!~LL!!!!!!~LL!!!!~LL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!!!!!]]!!]]!!]]!!]]]!!!!!]]!!]]!" + "'", str2, "]!!!!!]]!!]]!!]]!!]]]!!!!!]]!!]]!");
    }

    @Test
    public void test05846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05846");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullllnullnullnullnullinullllinullllinullll!", "LLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULLLLUULLUULLUULLUULLUULLUULLUULLUULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLL!" + "'", str2, "UULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLLUULLUULLUULLUULLUUULLLLUUULLLLUUULLLL!");
    }

    @Test
    public void test05847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05847");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LLLLLUUULUUULUUULUUULLLLLUUULUUU!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!!!nullnullnull!nullnullnull!" + "'", str2, "!!!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!!!nullnullnull!nullnullnull!");
    }

    @Test
    public void test05848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05848");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170\u016d\u016e\u0170\u0170!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05849");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!" + "'", str2, "!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!!\256\276\275!!\254\254\256\276\275!!\254\254!");
    }

    @Test
    public void test05850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05850");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254!", "\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366\u0366]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254!" + "'", str2, "\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254\256\256\254\254!");
    }

    @Test
    public void test05851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05851");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("bnullnullnullbnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullbnullnullnullbnullnullnullbnullnullnullbnullnullnullnullnullnullnullnullnullnullnull!", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\273\272\275\275\273\272\275\275\253\253\273\272\275\275\273\272\275\275\253\253\273\272\275\275\273\272\275\275\253\253\273\272\275\275\273\272\275\275\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253\273\272\275\275\273\272\275\275\253\253\273\272\275\275\273\272\275\275\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05852");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!" + "'", str2, "!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!!!}}}!}}}!}}}!}}}!}}}!}}}!}}}!}}}!");
    }

    @Test
    public void test05853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05853");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016enullnullnullnullnullnullnullnull!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05854");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246\u0244\u0248\u0246\u0246!", "u!!!u!!!nullnullu!!!u!!!nullnull\225\225u!!!u!!!nullnullu!!!u!!!nullnull\225\225u!!!u!!!nullnullu!!!u!!!nullnull\225\225u!!!u!!!nullnullu!!!u!!!nullnull\225\225u!!!u!!!nullnullu!!!u!!!nullnull\225\225u!!!u!!!nullnullu!!!u!!!nullnull\225\225u!!!u!!!nullnullu!!!u!!!nullnull\225\225u!!!u!!!nullnullu!!!u!!!nullnull\225\225!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016enullnullnullnullnullnullnullnull!" + "'", str2, "\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016enullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05855");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\u0317\u0318\u031a\u031a\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!\276\276!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u031a\u031a\u0318\u0318\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u031a\u031a\u0318\u0318\u0348\u0346\u0346!");
    }

    @Test
    public void test05856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05856");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275``\230\230\230\230\230\230\230\230``\230\230\230\230\230\230\230\230``\230\230\230\230\230\230\230\230\276``\230\230\230\230\230\230\230\230\275\275!", "FH!!FH!!FH!!FH!!FH!!FH!!FH!!FH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275``\230\230\230\230\230\230\230\230``\230\230\230\230\230\230\230\230``\230\230\230\230\230\230\230\230\276``\230\230\230\230\230\230\230\230\275\275!" + "'", str2, "\275``\230\230\230\230\230\230\230\230``\230\230\230\230\230\230\230\230``\230\230\230\230\230\230\230\230\276``\230\230\230\230\230\230\230\230\275\275!");
    }

    @Test
    public void test05857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05857");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200\204\204}~\200\200}~\200\200\204\204}~\200\200}~\200\200\204\204}~\200\200}~\200\200\204\204}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200\204\204}~\200\200}~\200\200\204\204!", "\275\276N\225\225\276N\225\225\200\200\276N\225\225\276N\225\225\200\200\276N\225\225\276N\225\225\200\200\276\276N\225\225\276N\225\225\200\200\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200\204\204}~\200\200}~\200\200\204\204}~\200\200}~\200\200\204\204}~\200\200}~\200\200\204\204}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200\204\204}~\200\200}~\200\200\204\204!" + "'", str2, "}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200\204\204}~\200\200}~\200\200\204\204}~\200\200}~\200\200\204\204}~\200\200}~\200\200\204\204}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200\204\204}~\200\200}~\200\200\204\204!");
    }

    @Test
    public void test05858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05858");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~NNN\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~NNN]]!", "\u0420\u0420\u0420\u0420!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~nullnullnull\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~nullnullnull]]!" + "'", str2, "\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~nullnullnull\200\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348~~nullnullnull]]!");
    }

    @Test
    public void test05859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05859");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!~\223\223!~\223\223!!!~\223\223!~\223\223!!!~\223\223!~\223\223!~\223\223!~\223\223!!!~\223\223!~\223\223!!!~\223\223!~\223\223!", "HHFFH~~HHFFH~~HHFFH~~HHFFH~~HHFFH~~HHFFH~~HHFFH~~HHFFH~~!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~\223\223!~\223\223!!!~\223\223!~\223\223!!!~\223\223!~\223\223!~\223\223!~\223\223!!!~\223\223!~\223\223!!!~\223\223!~\223\223!" + "'", str2, "!~\223\223!~\223\223!!!~\223\223!~\223\223!!!~\223\223!~\223\223!~\223\223!~\223\223!!!~\223\223!~\223\223!!!~\223\223!~\223\223!");
    }

    @Test
    public void test05860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05860");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ\200}}`ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ]]!", "}~\200\200}~\200\200NNUUNNUUNNUUNNUU^NNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUU^NNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUU}~\200\200}~\200\200NNUUNNUUNNUUNNUU^NNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUU^NNUUNNUUNNUUNNUUNNUUNNUUNNUUNNUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\200}}`NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN]]!" + "'", str2, "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\200}}`NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN]]!");
    }

    @Test
    public void test05861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05861");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253nullnullnullnullnullnullnullnull\253\253nullnullnullnullnullnullnullnull\253\253!", "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fanullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253LUNNLUNNLUNNLUNNLUNNLUNNLUNNLUNN\253\253!");
    }

    @Test
    public void test05862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05862");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("eeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeffeeff!", "!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!!!NNN!NNN!NNN!NNN!NNN!NNN!NNN!NNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05863");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!", "\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014f\u014f\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!" + "'", str2, "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!");
    }

    @Test
    public void test05864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05864");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230~}\200\200~}\200\200EE~~}\200\200EE~~}\200\200\230\230EE~~}\200\200EE~~}\200\200\230\230!", "\275nullnullnullnullnullnullnullnullnullnullnullnull\276nullnullnullnull\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "~}\200\200~}\200\200LL~~}\200\200LL~~}\200\200\230\230LL~~}\200\200LL~~}\200\200\230\230~}\200\200~}\200\200LL~~}\200\200LL~~}\200\200\230\230LL~~}\200\200LL~~}\200\200\230\230~}\200\200~}\200\200LL~~}\200\200LL~~}\200\200\230\230LL~~}\200\200LL~~}\200\200\230\230~}\200\200~}\200\200LL~~}\200\200LL~~}\200\200\230\230LL~~}\200\200LL~~}\200\200\230\230~}\200\200~}\200\200LL~~}\200\200LL~~}\200\200\230\230LL~~}\200\200LL~~}\200\200\230\230~}\200\200~}\200\200LL~~}\200\200LL~~}\200\200\230\230LL~~}\200\200LL~~}\200\200\230\230~}\200\200~}\200\200LL~~}\200\200LL~~}\200\200\230\230LL~~}\200\200LL~~}\200\200\230\230~}\200\200~}\200\200LL~~}\200\200LL~~}\200\200\230\230LL~~}\200\200LL~~}\200\200\230\230!" + "'", str2, "~}\200\200~}\200\200LL~~}\200\200LL~~}\200\200\230\230LL~~}\200\200LL~~}\200\200\230\230~}\200\200~}\200\200LL~~}\200\200LL~~}\200\200\230\230LL~~}\200\200LL~~}\200\200\230\230~}\200\200~}\200\200LL~~}\200\200LL~~}\200\200\230\230LL~~}\200\200LL~~}\200\200\230\230~}\200\200~}\200\200LL~~}\200\200LL~~}\200\200\230\230LL~~}\200\200LL~~}\200\200\230\230~}\200\200~}\200\200LL~~}\200\200LL~~}\200\200\230\230LL~~}\200\200LL~~}\200\200\230\230~}\200\200~}\200\200LL~~}\200\200LL~~}\200\200\230\230LL~~}\200\200LL~~}\200\200\230\230~}\200\200~}\200\200LL~~}\200\200LL~~}\200\200\230\230LL~~}\200\200LL~~}\200\200\230\230~}\200\200~}\200\200LL~~}\200\200LL~~}\200\200\230\230LL~~}\200\200LL~~}\200\200\230\230!");
    }

    @Test
    public void test05865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05865");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250!", "!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!!\256NN\200\200\254\254\256NN\200\200\254\254!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250!" + "'", str2, "\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250\250\246\250\250!");
    }

    @Test
    public void test05866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05866");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253\256!\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test05867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05867");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("ss!!ss!!!", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hh!!hh!!!" + "'", str2, "hh!!hh!!!");
    }

    @Test
    public void test05868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05868");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271~}}^\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271]]!", "\u014f\u014f\u014f\u014f!uu!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271~}}^\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271]]!" + "'", str2, "\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271~}}^\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271\266\267\271\271]]!");
    }

    @Test
    public void test05869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05869");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u017e\u0346\u0348\u0348!", "nullnull!!!!nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test05870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05870");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}\200null}}``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!", "}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!!}~\200\200}~\200\200!!]}~\200\200}~\200\200}~\200\200]}~\200\200}~\200\200}~\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!" + "'", str2, "\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}\200nullnullnullnull}}``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!``!!!");
    }

    @Test
    public void test05871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05871");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!!ll\340\340ll\340\340!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05872");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!!!!]!!!!!!", "~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\230\230\u0106\u0106\u0106\u0106\u0106\u0106\230\230~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\230\230\u0106\u0106\u0106\u0106\u0106\u0106\230\230~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\230\230\u0106\u0106\u0106\u0106\u0106\u0106\230\230~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\230\230\u0106\u0106\u0106\u0106\u0106\u0106\230\230~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\230\230\u0106\u0106\u0106\u0106\u0106\u0106\230\230~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\230\230\u0106\u0106\u0106\u0106\u0106\u0106\230\230~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\230\230\u0106\u0106\u0106\u0106\u0106\u0106\230\230~}\200\200~}\200\200\u0106\u0106\u0106\u0106\u0106\u0106\230\230\u0106\u0106\u0106\u0106\u0106\u0106\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!!!!]!!!!!!" + "'", str2, "!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!]!!!!!]!!!!!!]!!!!!!");
    }

    @Test
    public void test05873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05873");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348\u0348!", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LNLLLNLL\253\253LNLLLNLL\253\253LNLLLNLL\253\253LNLLLNLL\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253LNLLLNLL\253\253LNLLLNLL\253\253!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!" + "'", str2, "\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!!\253\u0348\u0348\253\u0348\u0348!");
    }

    @Test
    public void test05874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05874");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!nullnullllnullnullll!!!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!!" + "'", str2, "\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346\u0346!!!!!!!");
    }

    @Test
    public void test05875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05875");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("NN!!NN!!!", "null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226!!null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226null\230\226\226!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\254\254!!\254\254!!!" + "'", str2, "\254\254!!\254\254!!!");
    }

    @Test
    public void test05876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05876");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLL!!!LLLL!!!LLLL!!!LLLL!!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLL!!!LLLL!!!!", "{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "||||||||!!||||||||!!||||||||!!||||||||!!||||!!!||||!!!||||!!!||||!!!||||||||!!||||||||!!||||||||!!||||||||!!||||!!!||||!!!!" + "'", str2, "||||||||!!||||||||!!||||||||!!||||||||!!||||!!!||||!!!||||!!!||||!!!||||||||!!||||||||!!||||||||!!||||||||!!||||!!!||||!!!!");
    }

    @Test
    public void test05877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05877");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!\306\306!!!", "FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!FFFFFFFF!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test05878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05878");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!NLUUNLUUNLUUNLUUNLUUNLUUNLUUNLUU!!!", "]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]!!}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]!!}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]!!}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]!!}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]!!}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]!!}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]!!}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]!!!" + "'", str2, "}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]!!}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]!!}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]!!}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]!!}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]!!}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]!!}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]!!}]]]}]]]}]]]}]]]}]]]}]]]}]]]}]]]!!!");
    }

    @Test
    public void test05879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05879");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\276LL!!\275\275\276LL!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!!", "\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!\335\335!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\276!!!!\275\275\276!!!!\275\275!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test05880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05880");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230\200}}`NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230NNNNNNNNNNNNNNNN\225\230\230]]!", "UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``UL```UL``UL``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230]]!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230\200}}`nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\225\230\230]]!");
    }

    @Test
    public void test05881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05881");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LLUULLUU}}LLUULLUU}}!", "UULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULLUULL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\300\300\276\276\300\300\276\276}}\300\300\276\276\300\300\276\276}}!" + "'", str2, "\300\300\276\276\300\300\276\276}}\300\300\276\276\300\300\276\276}}!");
    }

    @Test
    public void test05882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05882");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!!!\220\220!!\220\220!!\220\220!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\220\220!!\220\220!!\220\220!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "hhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHHhhhhhhhhHHHHHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!\220\220!!\220\220!!\220\220!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\220\220!!\220\220!!\220\220!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!\220\220!!\220\220!!\220\220!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\220\220!!\220\220!!\220\220!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test05883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05883");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!LL!!LL!!LL!!LL!!LL!!LL!!LL!!LL!", "nullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnullnullnullbbnullnullbbnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0!" + "'", str2, "\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0\u03c0!");
    }

    @Test
    public void test05884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05884");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv\275\276vv!", "~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull~}\200\200~}\200\200nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull!" + "'", str2, "\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull\275\276nullnull!");
    }

    @Test
    public void test05885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05885");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!\200}}`!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!]]!", "null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!null!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!\200}}`!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!]]!" + "'", str2, "!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!\200}}`!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!!!!``!!]]!");
    }

    @Test
    public void test05886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05886");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!h!!!h!!!!!", "!\226!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!" + "'", str2, "!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!null!!!null!!!!!");
    }

    @Test
    public void test05887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05887");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!t!!!!!!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!!" + "'", str2, "null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!null!!!!!!!!");
    }

    @Test
    public void test05888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05888");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\340null\335\335\340null\335\335!!\340null\335\335\340null\335\335!!\340null\335\335\340null\335\335\340null\335\335\340null\335\335!!\340null\335\335\340null\335\335!!\340null\335\335\340null\335\335!", "\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275\u026c\u026b\u026e\u026e\u026c\u026b\u026e\u026e\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05889");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("n]nnn]nn!!n]nnn]nn!!n]nnn]nnn]nnn]nn!!n]nnn]nn!!n]nnn]nn!", "efhhefhh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!" + "'", str2, "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!");
    }

    @Test
    public void test05890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05890");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368!", "\u0366\u0365\u0368\u0368\254\254\254\254\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368!" + "'", str2, "\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368\u0365\u0366\u0368\u0368!");
    }

    @Test
    public void test05891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05891");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]\220\220\216\216\220\220\216\216vv]]vv]]vv]]vv]]vv]]vv]]vv]]vv]]!", "HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!HH!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]!" + "'", str2, "\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]\220\220\216\216\220\220\216\216nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]nullnull]]!");
    }

    @Test
    public void test05892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05892");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368NULLNULL!", "UU]]UU]]UU]]UU]]~}}^UU]]UU]]UU]]UU]]]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368UU]]UU]]!" + "'", str2, "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368UU]]UU]]!");
    }

    @Test
    public void test05893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05893");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200\u0108\200\200nullnullnullnullnullnullnullnull!", "\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU\215\216\230\230\276U!UUU!UUU!UU\276U!UUU!UUU!UU\276U!UUU!UUU!UU!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}!\200\200}!\200\200}!\200\200}!\200\200\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215}!\200\200}!\200\200}!\200\200}!\200\200\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215!" + "'", str2, "}!\200\200}!\200\200}!\200\200}!\200\200\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215}!\200\200}!\200\200}!\200\200}!\200\200\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215\230U\215\215!");
    }

    @Test
    public void test05894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05894");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014e\u014enullnull!", "");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05895");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230^```^```^```^```^```^```^```^```^```^```\226null\230\230\226null\230\230^```^```\226null\230\230\226null\230\230!", "LL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!LL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLLLL]NNLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230!" + "'", str2, "^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230^```^```^```^```^```^```^```^```^```^```\226]]LL\230\230\226]]LL\230\230^```^```\226]]LL\230\230\226]]LL\230\230!");
    }

    @Test
    public void test05896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05896");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!", "EHHHEHHHEHHHEHHHEHHHEHHHEHHHEHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!!" + "'", str2, "hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!hehhhehh!!!");
    }

    @Test
    public void test05897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05897");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\215}\215\215\215}\215\215\u014b\u014e\u014e\u014e\u014b\u014e\u014e\u014e\u014b\u014e\u014e\u014e\u014b\u014e\u014e\u014e\215}\215\215\215}\215\215!", "\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220\200nullnullnullnull\220\220!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull\215}\215\215\215}\215\215!");
    }

    @Test
    public void test05898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05898");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!", "\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!!\200\u0348\u0348\200\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL!" + "'", str2, "LNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLLLNLL!");
    }

    @Test
    public void test05899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05899");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016d\u0170\u016d\u016dnullnullnullnullnullnullnullnull!", "\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126ULL!" + "'", str2, "\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126\u0126ULL!");
    }

    @Test
    public void test05900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05900");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!\216\216\216!\216\216\216!", "llLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLLllLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\216\216\216!\216\216\216!" + "'", str2, "!\216\216\216!\216\216\216!");
    }

    @Test
    public void test05901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05901");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "\275\276null\225\225\276null\225\225\200\200\276null\225\225\276null\225\225\200\200\276null\225\225\276null\225\225\200\200\276\276null\225\225\276null\225\225\200\200\275\275!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05902");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0175\u0175\u0175\u0175!!!", "!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!!!~nullnullnullnullnullnullnullnull!~nullnullnullnullnullnullnullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NN!!NN!!!" + "'", str2, "NN!!NN!!!");
    }

    @Test
    public void test05903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05903");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "\u0346\u0348\u0348\u0348\u0345\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test05904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05904");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!nullnullnull!!!!nullnullnull!!!", "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!nullnull!!!!!" + "'", str2, "!!nullnull!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!nullnull!!!!!");
    }

    @Test
    public void test05905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05905");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\230\226u!llu!ll\236\276\276\230\226u!llu!ll\236\276\276!!\230\226u!llu!ll\236\276\276\230\226u!llu!ll\236\276\276!!\230\226u!llu!ll\236\276\276\230\226u!llu!ll\236\276\276\230\226u!llu!ll\236\276\276\230\226u!llu!ll\236\276\276!!\230\226u!llu!ll\236\276\276\230\226u!llu!ll\236\276\276!!\230\226u!llu!ll\236\276\276\230\226u!llu!ll\236\276\276!", "!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230\226\256!nullnull\256!nullnull\236\276\276\230\226\256!nullnull\256!nullnull\236\276\276!!\230\226\256!nullnull\256!nullnull\236\276\276\230\226\256!nullnull\256!nullnull\236\276\276!!\230\226\256!nullnull\256!nullnull\236\276\276\230\226\256!nullnull\256!nullnull\236\276\276\230\226\256!nullnull\256!nullnull\236\276\276\230\226\256!nullnull\256!nullnull\236\276\276!!\230\226\256!nullnull\256!nullnull\236\276\276\230\226\256!nullnull\256!nullnull\236\276\276!!\230\226\256!nullnull\256!nullnull\236\276\276\230\226\256!nullnull\256!nullnull\236\276\276!" + "'", str2, "\230\226\256!nullnull\256!nullnull\236\276\276\230\226\256!nullnull\256!nullnull\236\276\276!!\230\226\256!nullnull\256!nullnull\236\276\276\230\226\256!nullnull\256!nullnull\236\276\276!!\230\226\256!nullnull\256!nullnull\236\276\276\230\226\256!nullnull\256!nullnull\236\276\276\230\226\256!nullnull\256!nullnull\236\276\276\230\226\256!nullnull\256!nullnull\236\276\276!!\230\226\256!nullnull\256!nullnull\236\276\276\230\226\256!nullnull\256!nullnull\236\276\276!!\230\226\256!nullnull\256!nullnull\236\276\276\230\226\256!nullnull\256!nullnull\236\276\276!");
    }

    @Test
    public void test05906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05906");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275LLL\275LLL!", "\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d\275\200\u017d\u017d!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275nullnullnull\275nullnullnull!" + "'", str2, "\275nullnullnull\275nullnullnull!");
    }

    @Test
    public void test05907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05907");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("xxxxxxxxxxxxxxxxnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullxxxxxxxxxxxxxxxxnullnullnullnullnullnullnullnull!", "!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\200}}`!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UUUUUUUUUUUUUUUUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUUUUUUUUUUUUUUUUUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU!" + "'", str2, "UUUUUUUUUUUUUUUUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUUUUUUUUUUUUUUUUUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU!");
    }

    @Test
    public void test05908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05908");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!", "]]null{|~~nullnullnull{|~~nullnull]]null{|~~nullnullnull{|~~nullnull!!]]null{|~~nullnullnull{|~~nullnull]]null{|~~nullnullnull{|~~nullnull!!]]null{|~~nullnullnull{|~~nullnull]]null{|~~nullnullnull{|~~nullnull]]null{|~~nullnullnull{|~~nullnull]]null{|~~nullnullnull{|~~nullnull!!]]null{|~~nullnullnull{|~~nullnull]]null{|~~nullnullnull{|~~nullnull!!]]null{|~~nullnullnull{|~~nullnull]]null{|~~nullnullnull{|~~nullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!" + "'", str2, "!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!!!~}}\200\200}}\200\200!~}}\200\200}}\200\200!");
    }

    @Test
    public void test05909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05909");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad\ua7ad!!!", "]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull]]nullnull]]nullnull!!]]nullnull]]nullnull!!]]nullnull]]nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!" + "'", str2, "!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!nullnull!!nullnull!!nullnull!!!");
    }

    @Test
    public void test05910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05910");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214JJLLJJLLJJLLJJLLJJLLJJLLJJLLJJLL\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\u0348\u0346\u0346!");
    }

    @Test
    public void test05911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05911");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253EEEEEEEE\253\253EEEEEEEE\253\253EEEEEEEE\253\253EEEEEEEE\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253EEEEEEEE\253\253EEEEEEEE\253\253!", "!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!!UU!!UU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253!!!!!!!!\253\253!!!!!!!!\253\253!!!!!!!!\253\253!!!!!!!!\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253!!!!!!!!\253\253!!!!!!!!\253\253!" + "'", str2, "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253!!!!!!!!\253\253!!!!!!!!\253\253!!!!!!!!\253\253!!!!!!!!\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253!!!!!!!!\253\253!!!!!!!!\253\253!");
    }

    @Test
    public void test05912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05912");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!!!!!!!!!!!!!!!!!", "nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!!nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!!nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!!nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!!nullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHHnullnullHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test05913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05913");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~!", "\253\254\256\256N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!\253\254\256\256N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!N!!!nullN!!!N!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~!" + "'", str2, "\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~\215\216\230\230U!~~U!~~U!~~!");
    }

    @Test
    public void test05914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05914");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LLLL\276LLLLLLL\276\276LLLLL\276\276LLLLL\276\276LLLLL\276\276LLLL\276LLLLLLL\276\276LLLLL\276\276!", "UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!UULLUULL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\216\216\216\216\276\216\216\216\216\216\216\216\276\276\216\216\216\216\216\276\276\216\216\216\216\216\276\276\216\216\216\216\216\276\276\216\216\216\216\276\216\216\216\216\216\216\216\276\276\216\216\216\216\216\276\276!" + "'", str2, "\216\216\216\216\276\216\216\216\216\216\216\216\276\276\216\216\216\216\216\276\276\216\216\216\216\216\276\276\216\216\216\216\216\276\276\216\216\216\216\276\216\216\216\216\216\216\216\276\276\216\216\216\216\216\276\276!");
    }

    @Test
    public void test05915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05915");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``!", "\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``!" + "'", str2, "^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``!!^!``^!``^!``^!``^!``^!``^!``^!``!");
    }

    @Test
    public void test05916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05916");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL!", "UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05917");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull^```^```^```^```^```^```^```^```^```^```nullnullnullnullnullnullnullnull^```^```nullnullnullnullnullnullnullnull!", "`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!`~~~~```~~~~`````~~~~```~~~~````!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!" + "'", str2, "^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```^```^```^```^```^```^```^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^```^```~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~!");
    }

    @Test
    public void test05918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05918");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!LLUULLUU!!!", "\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0\u01a0nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!" + "'", str2, "LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!LLLLLLLL!!!");
    }

    @Test
    public void test05919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05919");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN\276LLNN\275\275\276LLNN\275\275L!NNL!NNL!NNL!NNL!NNL!NNL!NNL!NN!", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276HHHH\275\275\276HHHH\275\275H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH\276HHHH\275\275\276HHHH\275\275H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH\276HHHH\275\275\276HHHH\275\275H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH\276HHHH\275\275\276HHHH\275\275H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH\276HHHH\275\275\276HHHH\275\275H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH\276HHHH\275\275\276HHHH\275\275H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH\276HHHH\275\275\276HHHH\275\275H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH\276HHHH\275\275\276HHHH\275\275H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH!" + "'", str2, "\276HHHH\275\275\276HHHH\275\275H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH\276HHHH\275\275\276HHHH\275\275H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH\276HHHH\275\275\276HHHH\275\275H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH\276HHHH\275\275\276HHHH\275\275H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH\276HHHH\275\275\276HHHH\275\275H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH\276HHHH\275\275\276HHHH\275\275H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH\276HHHH\275\275\276HHHH\275\275H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH\276HHHH\275\275\276HHHH\275\275H!HHH!HHH!HHH!HHH!HHH!HHH!HHH!HH!");
    }

    @Test
    public void test05920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05920");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("]^``]^``!!]^``]^``!!]^``]^``]^``]^``!!]^``]^``!!]^``]^``!", "\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull\260nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]^``]^``!!]^``]^``!!]^``]^``]^``]^``!!]^``]^``!!]^``]^``!" + "'", str2, "]^``]^``!!]^``]^``!!]^``]^``]^``]^``!!]^``]^``!!]^``]^``!");
    }

    @Test
    public void test05921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05921");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!ULL!ULL!ULL!ULL!ULL!", "\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f\u014f!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0236\u0238\u0238\u0236\u0238\u0238\u0236\u0238\u0238\u0236\u0238\u0238\u0236\u0238\u0238!" + "'", str2, "\u0236\u0238\u0238\u0236\u0238\u0238\u0236\u0238\u0238\u0236\u0238\u0238\u0236\u0238\u0238!");
    }

    @Test
    public void test05922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05922");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0366\u0365\u0368\u0368\u0346\u0348\u0348!", "^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225^```^```^```^```^```^```^```^```^```^```U\331\225\225U\331\225\225^```^```U\331\225\225U\331\225\225!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u0346\u0348\u0348!");
    }

    @Test
    public void test05923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05923");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnullZWXXZWXXZWXXZWXXnullnullnullnullZWXXZWXX!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNLLUNLLUNLLUNLLULLLULLLULLLULLLUNLLUNLLUNLLUNLLULLLULLL!" + "'", str2, "UNLLUNLLUNLLUNLLULLLULLLULLLULLLUNLLUNLLUNLLUNLLULLLULLL!");
    }

    @Test
    public void test05924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05924");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("u]uuu]uu!!u]uuu]uu!!u]uuu]uuu]uuu]uu!!u]uuu]uu!!u]uuu]uu!", "\u0346\u0348\u0348\u0348\210\205\206\206\u0348\u0346\u0346!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!" + "'", str2, "null]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnullnull]nullnullnull]nullnull!!null]nullnullnull]nullnull!!null]nullnullnull]nullnull!");
    }

    @Test
    public void test05925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05925");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0366\u0365\u0368\u0368\u0146\u0146\u0146\u0146\u0146\u0146\u0146\u0146\u0346\u0348\u0348!", "NLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNN\214\214NLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNN\214\214NLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNN\214\214NLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNN\214\214NLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNN\214\214NLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNN\214\214NLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNN\214\214NLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNNNLLLNLLLNN\214\214!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!" + "'", str2, "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
    }

    @Test
    public void test05926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05926");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("]!\253\253]!\253\253!!]!\253\253]!\253\253!!!", "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]!\253\253]!\253\253!!]!\253\253]!\253\253!!!" + "'", str2, "]!\253\253]!\253\253!!]!\253\253]!\253\253!!!");
    }

    @Test
    public void test05927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05927");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!!!!!!!!!!!!!!!\254~\256\256\254~\256\256\254~\256\256\254~\256\256!", "\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253````````\253\253````````\253\253````````\253\253````````\253\253\260\256\253\253\260\256\253\253\260\256\253\253\260\256\253\253````````\253\253````````\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!\254~\256\256\254~\256\256\254~\256\256\254~\256\256!" + "'", str2, "!!!!!!!!!!!!!!!!\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
    }

    @Test
    public void test05928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05928");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]]A]]!", "\u016e\u016d\u0170\u0170\u014d\u014e\u0150\u0150!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]!" + "'", str2, "]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]]null]]!");
    }

    @Test
    public void test05929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05929");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!nullnull!!nullnull!!!!nullnull!!nullnull!!!!!!!", "UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214UUNNUUNN\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UNNNUNNN!!UNNNUNNN!!!!UNNNUNNN!!UNNNUNNN!!!!!!UNNNUNNN!!UNNNUNNN!!!!UNNNUNNN!!UNNNUNNN!!!!!!UNNNUNNN!!UNNNUNNN!!!!UNNNUNNN!!UNNNUNNN!!!!!!UNNNUNNN!!UNNNUNNN!!!!UNNNUNNN!!UNNNUNNN!!!!!!UNNNUNNN!!UNNNUNNN!!!!UNNNUNNN!!UNNNUNNN!!!!!!UNNNUNNN!!UNNNUNNN!!!!UNNNUNNN!!UNNNUNNN!!!!!!UNNNUNNN!!UNNNUNNN!!!!UNNNUNNN!!UNNNUNNN!!!!!!UNNNUNNN!!UNNNUNNN!!!!UNNNUNNN!!UNNNUNNN!!!!!!!" + "'", str2, "UNNNUNNN!!UNNNUNNN!!!!UNNNUNNN!!UNNNUNNN!!!!!!UNNNUNNN!!UNNNUNNN!!!!UNNNUNNN!!UNNNUNNN!!!!!!UNNNUNNN!!UNNNUNNN!!!!UNNNUNNN!!UNNNUNNN!!!!!!UNNNUNNN!!UNNNUNNN!!!!UNNNUNNN!!UNNNUNNN!!!!!!UNNNUNNN!!UNNNUNNN!!!!UNNNUNNN!!UNNNUNNN!!!!!!UNNNUNNN!!UNNNUNNN!!!!UNNNUNNN!!UNNNUNNN!!!!!!UNNNUNNN!!UNNNUNNN!!!!UNNNUNNN!!UNNNUNNN!!!!!!UNNNUNNN!!UNNNUNNN!!!!UNNNUNNN!!UNNNUNNN!!!!!!!");
    }

    @Test
    public void test05930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05930");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225nullnull\225\225!", "\u0236\u0238\u0238\u0236\u0238\u0238\u0236\u0238\u0238\u0236\u0238\u0238\u0236\u0238\u0238!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0236\u0238\u0238\u0236\u0238\u0238\225\225\u0236\u0238\u0238\u0236\u0238\u0238\225\225\u0236\u0238\u0238\u0236\u0238\u0238\225\225\u0236\u0238\u0238\u0236\u0238\u0238\225\225\u0236\u0238\u0238\u0236\u0238\u0238\225\225\u0236\u0238\u0238\u0236\u0238\u0238\225\225\u0236\u0238\u0238\u0236\u0238\u0238\225\225\u0236\u0238\u0238\u0236\u0238\u0238\225\225!" + "'", str2, "\u0236\u0238\u0238\u0236\u0238\u0238\225\225\u0236\u0238\u0238\u0236\u0238\u0238\225\225\u0236\u0238\u0238\u0236\u0238\u0238\225\225\u0236\u0238\u0238\u0236\u0238\u0238\225\225\u0236\u0238\u0238\u0236\u0238\u0238\225\225\u0236\u0238\u0238\u0236\u0238\u0238\225\225\u0236\u0238\u0238\u0236\u0238\u0238\225\225\u0236\u0238\u0238\u0236\u0238\u0238\225\225!");
    }

    @Test
    public void test05931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05931");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!UELLUELLUUUELLUELLUU!!!", "\253\254\256\256\366\367\371\371\366\367\371\371\366\367\371\371\366\367\371\371\253\254\256\256\366\367\371\371\366\367\371\371!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!!" + "'", str2, "\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!\253\326\331\331\253\326\331\331\253\253\253\326\331\331\253\326\331\331\253\253!!!");
    }

    @Test
    public void test05932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05932");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("HFFFHFFF!", "U!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LLU!LLU!LLLLU!LLU!LLLLU!LLU!LL!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L!!!L!!!!" + "'", str2, "L!!!L!!!!");
    }

    @Test
    public void test05933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05933");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUUUU!!UU!!NUUUNUUU!", "nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLL!" + "'", str2, "LL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLL!");
    }

    @Test
    public void test05934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05934");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\300\300\300\300\300\300\300\300\300\300\300\300\u02fa\300\300\300\300\300\300\300\300\300\300\300\300\u02fa\300\300\300\300\300\300\300\300\300\300\300\300\u02fa\300\300\300\300\300\300\300\300\300\300\300\300\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\300\300\300\300\300\300\300\300\300\300\300\300\u02fa\300\300\300\300\300\300\300\300\300\300\300\300!", "\u020c\u020b\u020e\u020e\u020c\u020b\u020e\u020e\u020c\u020b\u020e\u020e\u020c\u020b\u020e\u020e\u020c\u020b\u020e\u020e!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fanullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fa\u02fa\u02fa\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02f7\200\200\u02fa\u02fanullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05935");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "EFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHHEFHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05936");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!", "\275!\276\276\275!\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test05937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05937");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe!!\275\u03fe\u03fe\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e\u03fe\u03fe\u037e\u037e!", "U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU!!U!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UU!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e!" + "'", str2, "]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275]null!!]null!!]null!!\275\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e!");
    }

    @Test
    public void test05938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05938");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UNLLUNLLUNLLUNLLUNLLUNLLUNLLUNLL!", "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!" + "'", str2, "\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!!");
    }

    @Test
    public void test05939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05939");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!\253\256\256\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271\266UL!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!", "\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e\u020e!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253\256\256\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!" + "'", str2, "!\253\256\256\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271\266\u020e\u020e!!\271\271!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!\253\256\256!");
    }

    @Test
    public void test05940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05940");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275\275\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275\275J!!!J!!!J!!!J!!!J!!!J!!!J!!!J!!!\275\275!", "~}\200\200~}\200\200ULLLULLLULLLULLLULLLULLLULLLULLLJJULLLULLLULLLULLLULLLULLLULLLULLLJJ~}\200\200~}\200\200ULLLULLLULLLULLLULLLULLLULLLULLLJJULLLULLLULLLULLLULLLULLLULLLULLLJJ~}\200\200~}\200\200ULLLULLLULLLULLLULLLULLLULLLULLLJJULLLULLLULLLULLLULLLULLLULLLULLLJJ~}\200\200~}\200\200ULLLULLLULLLULLLULLLULLLULLLULLLJJULLLULLLULLLULLLULLLULLLULLLULLLJJ~}\200\200~}\200\200ULLLULLLULLLULLLULLLULLLULLLULLLJJULLLULLLULLLULLLULLLULLLULLLULLLJJ~}\200\200~}\200\200ULLLULLLULLLULLLULLLULLLULLLULLLJJULLLULLLULLLULLLULLLULLLULLLULLLJJ~}\200\200~}\200\200ULLLULLLULLLULLLULLLULLLULLLULLLJJULLLULLLULLLULLLULLLULLLULLLULLLJJ~}\200\200~}\200\200ULLLULLLULLLULLLULLLULLLULLLULLLJJULLLULLLULLLULLLULLLULLLULLLULLLJJ!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275\275!" + "'", str2, "\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275\275L!!!L!!!L!!!L!!!L!!!L!!!L!!!L!!!\275\275!");
    }

    @Test
    public void test05941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05941");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("`R!RRRRRR!RRRRRR!RRRRR`R!RRRRRR!RRRRRR!RRRRR!", "\u02a0\u0295\u0298\u0298\u02a0\u0295\u0298\u0298\u02a0\u0295\u0298\u0298\u02a0\u0295\u0298\u0298\u02a0\u0295\u0298\u0298\u02a0\u0295\u0298\u0298\u02a0\u0295\u0298\u0298\u02a0\u0295\u0298\u0298!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295!" + "'", str2, "\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295\u0295!");
    }

    @Test
    public void test05942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05942");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0346\u0348\u0348\u0348}~\200\200}~\200\200\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016enullnullnull}~\200\200}~\200\200\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016enullnullnull}~\200\200}~\200\200\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016enullnullnull}~\200\200}~\200\200\u016b\u016c\u016e\u016e\u016b\u016c\u016e\u016e\u0348\u0346\u0346!", "!ffFF!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}~\200\200}~\200\200\u0348\u0346\u0346!");
    }

    @Test
    public void test05943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05943");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!!", "\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!\276!!!!\276!!!\276!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!!" + "'", str2, "\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!\250\250!!!");
    }

    @Test
    public void test05944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05944");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```nullLLL```!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```!" + "'", str2, "nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```nullnullnullnullnullnullnull```!");
    }

    @Test
    public void test05945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05945");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!\336null\340\340null!nullnullnullnull\336null\340\340null!nullnullnullnull!!!", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHHhhHHHH!HHHHHHHHHHHHHHHHhHHHHhhHHHH!HHHHHHHHHHHHHHHH!!hHHHHhhHHHH!HHHHHHHHHHHHHHHHhHHHHhhHHHH!HHHHHHHHHHHHHHHH!!hHHHHhhHHHH!HHHHHHHHHHHHHHHHhHHHHhhHHHH!HHHHHHHHHHHHHHHH!!hHHHHhhHHHH!HHHHHHHHHHHHHHHHhHHHHhhHHHH!HHHHHHHHHHHHHHHH!!hHHHHhhHHHH!HHHHHHHHHHHHHHHHhHHHHhhHHHH!HHHHHHHHHHHHHHHH!!hHHHHhhHHHH!HHHHHHHHHHHHHHHHhHHHHhhHHHH!HHHHHHHHHHHHHHHH!!hHHHHhhHHHH!HHHHHHHHHHHHHHHHhHHHHhhHHHH!HHHHHHHHHHHHHHHH!!hHHHHhhHHHH!HHHHHHHHHHHHHHHHhHHHHhhHHHH!HHHHHHHHHHHHHHHH!!!" + "'", str2, "hHHHHhhHHHH!HHHHHHHHHHHHHHHHhHHHHhhHHHH!HHHHHHHHHHHHHHHH!!hHHHHhhHHHH!HHHHHHHHHHHHHHHHhHHHHhhHHHH!HHHHHHHHHHHHHHHH!!hHHHHhhHHHH!HHHHHHHHHHHHHHHHhHHHHhhHHHH!HHHHHHHHHHHHHHHH!!hHHHHhhHHHH!HHHHHHHHHHHHHHHHhHHHHhhHHHH!HHHHHHHHHHHHHHHH!!hHHHHhhHHHH!HHHHHHHHHHHHHHHHhHHHHhhHHHH!HHHHHHHHHHHHHHHH!!hHHHHhhHHHH!HHHHHHHHHHHHHHHHhHHHHhhHHHH!HHHHHHHHHHHHHHHH!!hHHHHhhHHHH!HHHHHHHHHHHHHHHHhHHHHhhHHHH!HHHHHHHHHHHHHHHH!!hHHHHhhHHHH!HHHHHHHHHHHHHHHHhHHHHhhHHHH!HHHHHHHHHHHHHHHH!!!");
    }

    @Test
    public void test05946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05946");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!!!UUU!UUU!UUU!UUU!UUU!UUU!UUU!UUU!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!" + "'", str2, "!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!!!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!nullnullnull!");
    }

    @Test
    public void test05947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05947");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\u016e\u016e\275\u016e\u016e\u016e\u016e\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!", "\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\276\220\220!!\275\275\276\220\220!!\275\275\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!\220!!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!" + "'", str2, "!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!!\275!!!\275!!!!\275!\275!!!\275!!!!!\275!!!\275!!!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!\276\275!!!");
    }

    @Test
    public void test05948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05948");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!ZWXXZWXXZWXXZWXXZWXXZWXX!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test05949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05949");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!!!!LLLLLLLL!!LLLLLLLL!", "\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!" + "'", str2, "!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05950");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6\u01e8\u01e6\u01e6nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05951");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnullnullnullEHHHEHHHEHHHnullnullnullnullEHHHEHHHEHHHnullnullnullnullEHHHEHHHEHHHnullnullnullnullEHHHEHHHEHHHnullnullnullnullEHHHEHHHEHHHnullnullnullnullEHHHEHHHEHHHnullnullnullnullEHHHEHHHEHHHnullnullnullnullEHHHEHHHEHHH!", "nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!nullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnull!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028enullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028e\u028b\u028c\u028e\u028enullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05952");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnull\200}}`nullnullnullnull]]!", "\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037e\u037enullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LNNNLNNNLNNNLNNN\200}}`LNNNLNNNLNNNLNNN]]!" + "'", str2, "LNNNLNNNLNNNLNNN\200}}`LNNNLNNNLNNNLNNN]]!");
    }

    @Test
    public void test05953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05953");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0346\u0348\u0348\u0348\u0348\u0346\u0346!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0346\u0348\u0348\u0348\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\u0348\u0346\u0346!" + "'", str2, "\u0346\u0348\u0348\u0348\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\377\u0100\u0102\u0102\u0348\u0346\u0346!");
    }

    @Test
    public void test05954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05954");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("JLLL\200}}`JLLL]]!", "~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!~!!!~!!!~!!!~!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnull\200}}`nullnullnullnull]]!" + "'", str2, "nullnullnullnull\200}}`nullnullnullnull]]!");
    }

    @Test
    public void test05955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05955");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254LNLLLNLLLNLLLNLLLNLLLNLL!!LNLLLNLL!!LNLLLNLL!!\256\254\254!!!", "\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!\276~!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!" + "'", str2, "!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!~!!!~!!!~!!!~!!!~!!!~!!!!!~!!!~!!!!!~!!!~!!!!\256\254\254!!!");
    }

    @Test
    public void test05956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05956");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!EE!!!", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!!XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!" + "'", str2, "XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!");
    }

    @Test
    public void test05957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05957");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("EE!!EE!!!", "\u0366\u0365\u0368\u0368\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u023d\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!!");
    }

    @Test
    public void test05958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05958");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!H!EEH!EE!!!", "nullnullnullnullnullnullnullnull}}nullnullnullnullnullnullnullnull}}!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!!" + "'", str2, "L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!L!NNL!NN!!!");
    }

    @Test
    public void test05959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05959");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("", "nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``!!nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``!!nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``!!nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``!!nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``nullnull``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05960");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("````````````````\200}}`````````````````]]!", "nullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnullnullnull!!nullnull!!\276nullnullnull\276nullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "````````````````\200}}`````````````````]]!" + "'", str2, "````````````````\200}}`````````````````]]!");
    }

    @Test
    public void test05961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05961");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nullnullnullnull\254~\256\256\254~\256\256\254~\256\256\254~\256\256!", "LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!!LLNNLLNNLLNNLLNNLLNNLLNNLLNNLLNN!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNLLNNLLNNLLNNLL\254~\256\256\254~\256\256\254~\256\256\254~\256\256!" + "'", str2, "NNLLNNLLNNLLNNLL\254~\256\256\254~\256\256\254~\256\256\254~\256\256!");
    }

    @Test
    public void test05962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05962");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("X!UUX!UUX!UUX!UUX!UUX!UUX!UUX!UU!", "\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368\u0368!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LL!" + "'", str2, "L!LLL!LLL!LLL!LLL!LLL!LLL!LLL!LL!");
    }

    @Test
    public void test05963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05963");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("NLLL\200}}`NLLL]]!", "\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226\u0226nullnull!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0225\u0228\u0228\u0228\200\u0225\u0228\u0228\u0228]]!" + "'", str2, "\u0225\u0228\u0228\u0228\200\u0225\u0228\u0228\u0228]]!");
    }

    @Test
    public void test05964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05964");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("}null\200\200}null\200\200}null\200\200}null\200\200\u029e\u029e\u029e\u029enullnullnull}null\200\200}null\200\200}null\200\200}null\200\200\u029e\u029enullnullnull!", "}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200}~\200\200!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}nullnullnullnull\200\200}nullnullnullnull\200\200}nullnullnullnull\200\200}nullnullnullnull\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}nullnullnullnull\200\200}nullnullnullnull\200\200}nullnullnullnull\200\200}nullnullnullnull\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "}nullnullnullnull\200\200}nullnullnullnull\200\200}nullnullnullnull\200\200}nullnullnullnull\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull}nullnullnullnull\200\200}nullnullnullnull\200\200}nullnullnullnull\200\200}nullnullnullnull\200\200nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05965");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~nullnull{|~~{|~~nullnull!", "UUUU!]UU!]UU!]UU!]UUUUUU!]UU!]UU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~null\200nullnullnull\200nullnull!" + "'", str2, "{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~\226\226{|~~{|~~\226\226{|~~{|~~null\200nullnullnull\200nullnull{|~~{|~~null\200nullnullnull\200nullnull!");
    }

    @Test
    public void test05966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05966");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```null!!!```!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05967");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!!", "U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230\200}}`U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230U!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LLU!LL\225\230\230]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!!" + "'", str2, "!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!\253!!!!");
    }

    @Test
    public void test05968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05968");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!", "NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!NULLNULLLLNULLNULLLL!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!" + "'", str2, "\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!!\226]\230\230~\226]\230\230\226]\230\230\226]\230\230~\226]\230\230\226]\230\230!");
    }

    @Test
    public void test05969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05969");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("}~\200\200}~\200\200^^]]^^]]}~\200\200}~\200\200^^]]^^]]!", "W!XXW!XXW!XXW!XX\200}}`W!XXW!XXW!XXW!XX]]!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "}~\200\200}~\200\200^^]]^^]]}~\200\200}~\200\200^^]]^^]]!" + "'", str2, "}~\200\200}~\200\200^^]]^^]]}~\200\200}~\200\200^^]]^^]]!");
    }

    @Test
    public void test05970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05970");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LLLLLLLL!!LLLLLLLL!!LLLLLLLLLLLLLLLL!!LLLLLLLL!!LLLLLLLL!", "!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!!JJ!!JJ!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test05971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05971");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!nullnull!!!!!nullnull!!!!!!!!", "\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200\275\276\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!!!!nullnullnullnullnullnullnullnull!!!!!!!nullnullnullnullnullnullnullnull!!!!!nullnullnullnullnullnullnullnull!!!!!!!nullnullnullnullnullnullnullnull!!!!!nullnullnullnullnullnullnullnull!!!!!!!nullnullnullnullnullnullnullnull!!!!!nullnullnullnullnullnullnullnull!!!!!!!nullnullnullnullnullnullnullnull!!!!!nullnullnullnullnullnullnullnull!!!!!!!nullnullnullnullnullnullnullnull!!!!!nullnullnullnullnullnullnullnull!!!!!!!nullnullnullnullnullnullnullnull!!!!!nullnullnullnullnullnullnullnull!!!!!!!nullnullnullnullnullnullnullnull!!!!!nullnullnullnullnullnullnullnull!!!!!!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!!!!nullnullnullnullnullnullnullnull!!!!!!!nullnullnullnullnullnullnullnull!!!!!nullnullnullnullnullnullnullnull!!!!!!!nullnullnullnullnullnullnullnull!!!!!nullnullnullnullnullnullnullnull!!!!!!!nullnullnullnullnullnullnullnull!!!!!nullnullnullnullnullnullnullnull!!!!!!!nullnullnullnullnullnullnullnull!!!!!nullnullnullnullnullnullnullnull!!!!!!!nullnullnullnullnullnullnullnull!!!!!nullnullnullnullnullnullnullnull!!!!!!!nullnullnullnullnullnullnullnull!!!!!nullnullnullnullnullnullnullnull!!!!!!!nullnullnullnullnullnullnullnull!!!!!nullnullnullnullnullnullnullnull!!!!!!!!");
    }

    @Test
    public void test05972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05972");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!", "!l!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05973");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!" + "'", str2, "\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266\266!");
    }

    @Test
    public void test05974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05974");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\336~\300\300\336~\300\300!!\336~\300\300\336~\300\300!!\336~\300\300\336~\300\300\336~\300\300\336~\300\300!!\336~\300\300\336~\300\300!!\336~\300\300\336~\300\300!", "\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!!\240\236\240\240\240\236\240\240!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnullnull~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnull!" + "'", str2, "null~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnullnull~nullnullnull~nullnull!!null~nullnullnull~nullnull!!null~nullnullnull~nullnull!");
    }

    @Test
    public void test05975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05975");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!", "XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!" + "'", str2, "\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!!\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246\250\250\246\246!");
    }

    @Test
    public void test05976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05976");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("FF!!FF!!!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull!!nullnull!!!" + "'", str2, "nullnull!!nullnull!!!");
    }

    @Test
    public void test05977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05977");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~!", "!III!III!!!III!III!!!III!III!III!III!III!III!III!III!III!III!!!III!III!!!III!III!III!III!III!III!III!III!III!III!!!III!III!!!III!III!III!III!III!III!III!III!III!III!!!III!III!!!III!III!III!III!III!III!III!III!III!III!!!III!III!!!III!III!III!III!III!III!III!III!III!III!!!III!III!!!III!III!III!III!III!III!III!III!III!III!!!III!III!!!III!III!III!III!III!III!III!III!III!III!!!III!III!!!III!III!III!III!III!III!III!III!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~!" + "'", str2, "\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~\275\276\276\276\275\276\276\276!!\275\276\276\276~~!");
    }

    @Test
    public void test05978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05978");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!!]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!!]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!!]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!!]]\200null\200\200\200null\200\200]]\200null\200\200\200null\200\200!", "`UU!!UU!!UU!!`UU!!UU!!UU!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "]]\200nullxnullnull\200\200\200nullxnullnull\200\200]]\200nullxnullnull\200\200\200nullxnullnull\200\200!!]]\200nullxnullnull\200\200\200nullxnullnull\200\200]]\200nullxnullnull\200\200\200nullxnullnull\200\200!!]]\200nullxnullnull\200\200\200nullxnullnull\200\200]]\200nullxnullnull\200\200\200nullxnullnull\200\200]]\200nullxnullnull\200\200\200nullxnullnull\200\200]]\200nullxnullnull\200\200\200nullxnullnull\200\200!!]]\200nullxnullnull\200\200\200nullxnullnull\200\200]]\200nullxnullnull\200\200\200nullxnullnull\200\200!!]]\200nullxnullnull\200\200\200nullxnullnull\200\200]]\200nullxnullnull\200\200\200nullxnullnull\200\200!" + "'", str2, "]]\200nullxnullnull\200\200\200nullxnullnull\200\200]]\200nullxnullnull\200\200\200nullxnullnull\200\200!!]]\200nullxnullnull\200\200\200nullxnullnull\200\200]]\200nullxnullnull\200\200\200nullxnullnull\200\200!!]]\200nullxnullnull\200\200\200nullxnullnull\200\200]]\200nullxnullnull\200\200\200nullxnullnull\200\200]]\200nullxnullnull\200\200\200nullxnullnull\200\200]]\200nullxnullnull\200\200\200nullxnullnull\200\200!!]]\200nullxnullnull\200\200\200nullxnullnull\200\200]]\200nullxnullnull\200\200\200nullxnullnull\200\200!!]]\200nullxnullnull\200\200\200nullxnullnull\200\200]]\200nullxnullnull\200\200\200nullxnullnull\200\200!");
    }

    @Test
    public void test05979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05979");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a\u0117\u0118\u011a\u011a!!!", "XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!XX!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!!!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!!!" + "'", str2, "!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!!!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!~X!XXX!XX!!!");
    }

    @Test
    public void test05980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05980");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!!\275!!!\275!!\275\275!\275!!!\275!!\275\275!\275!!!\275!!\275\275!\275!!!\275!!\275\275\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!!\275!!!\275!!\275\275!\275!!!\275!!\275\275!", "~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230~}\200\200~}\200\200LNUU}\200\200LNUU}\200\200\230\230LNUU}\200\200LNUU}\200\200\230\230!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!!\275!!!\275!!\275\275!\275!!!\275!!\275\275!\275!!!\275!!\275\275!\275!!!\275!!\275\275\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!!\275!!!\275!!\275\275!\275!!!\275!!\275\275!" + "'", str2, "\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!!\275!!!\275!!\275\275!\275!!!\275!!\275\275!\275!!!\275!!\275\275!\275!!!\275!!\275\275\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!\275!\275!!!\275!!!\275!!!\275!!!\275!!\275\275!\275!!!\275!!\275\275!");
    }

    @Test
    public void test05981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05981");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "LNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUULNUU!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test05982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05982");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("NLLLNULLNULLNULLNULLNLLLNULLNULL!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05983");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("LL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLLLL!!LL!!LLLLLLLL!", "``nullnull\200\200nullnull\200\200``nullnull\200\200nullnull\200\200``nullnull\200\200nullnull\200\200``nullnull\200\200nullnull\200\200``nullnull\200\200nullnull\200\200``nullnull\200\200nullnull\200\200``nullnull\200\200nullnull\200\200``nullnull\200\200nullnull\200\200!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356!" + "'", str2, "\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356\356\356!!\356\356!!\356\356\356\356\356\356\356\356!");
    }

    @Test
    public void test05984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05984");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!", "\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!\376\340\340\340\376\340\340\340!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!" + "'", str2, "\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!!\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245\250\250\245\245!");
    }

    @Test
    public void test05985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05985");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~\215\216\230\230\u014e\u014c\u014e\u014c\u014e\u014c~~!", "UULLUULL!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~!" + "'", str2, "\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~\215\216\230\230nullnull~~nullnull~~nullnull~~!");
    }

    @Test
    public void test05986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05986");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnullnull\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!!null\200~~null\200~~nullnullnull\200~~null\200~~nullnull!", "null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276null\276\276\276null\276\276\276\276\276!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\330\331\333\333\200~~\330\331\333\333\200~~\330\331\333\333\330\331\333\333\330\331\333\333\200~~\330\331\333\333\200~~\330\331\333\333\330\331\333\333!!\330\331\333\333\200~~\330\331\333\333\200~~\330\331\333\333\330\331\333\333\330\331\333\333\200~~\330\331\333\333\200~~\330\331\333\333\330\331\333\333!!\330\331\333\333\200~~\330\331\333\333\200~~\330\331\333\333\330\331\333\333\330\331\333\333\200~~\330\331\333\333\200~~\330\331\333\333\330\331\333\333\330\331\333\333\200~~\330\331\333\333\200~~\330\331\333\333\330\331\333\333\330\331\333\333\200~~\330\331\333\333\200~~\330\331\333\333\330\331\333\333!!\330\331\333\333\200~~\330\331\333\333\200~~\330\331\333\333\330\331\333\333\330\331\333\333\200~~\330\331\333\333\200~~\330\331\333\333\330\331\333\333!!\330\331\333\333\200~~\330\331\333\333\200~~\330\331\333\333\330\331\333\333\330\331\333\333\200~~\330\331\333\333\200~~\330\331\333\333\330\331\333\333!" + "'", str2, "\330\331\333\333\200~~\330\331\333\333\200~~\330\331\333\333\330\331\333\333\330\331\333\333\200~~\330\331\333\333\200~~\330\331\333\333\330\331\333\333!!\330\331\333\333\200~~\330\331\333\333\200~~\330\331\333\333\330\331\333\333\330\331\333\333\200~~\330\331\333\333\200~~\330\331\333\333\330\331\333\333!!\330\331\333\333\200~~\330\331\333\333\200~~\330\331\333\333\330\331\333\333\330\331\333\333\200~~\330\331\333\333\200~~\330\331\333\333\330\331\333\333\330\331\333\333\200~~\330\331\333\333\200~~\330\331\333\333\330\331\333\333\330\331\333\333\200~~\330\331\333\333\200~~\330\331\333\333\330\331\333\333!!\330\331\333\333\200~~\330\331\333\333\200~~\330\331\333\333\330\331\333\333\330\331\333\333\200~~\330\331\333\333\200~~\330\331\333\333\330\331\333\333!!\330\331\333\333\200~~\330\331\333\333\200~~\330\331\333\333\330\331\333\333\330\331\333\333\200~~\330\331\333\333\200~~\330\331\333\333\330\331\333\333!");
    }

    @Test
    public void test05987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05987");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!~~!!~~!!!!~~!!~~!!!!~~!!~~!!~~!!~~!!!!~~!!~~!!!!~~!!~~!", "~~!!null~~~null~~~null~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!null~~~null~~~null~~~~~!!~~!!~~!!~~!!~~!!~~!!~~!!~~!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~~!!~~!!!!~~!!~~!!!!~~!!~~!!~~!!~~!!!!~~!!~~!!!!~~!!~~!" + "'", str2, "!!~~!!~~!!!!~~!!~~!!!!~~!!~~!!~~!!~~!!!!~~!!~~!!!!~~!!~~!");
    }

    @Test
    public void test05988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05988");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\276\276nullnullnullnull\276nullnullnullnullnullnull\276nullnull\276\276nullnullnullnull\276nullnullnullnullnullnull\276nullnull\276\276nullnullnullnull\276nullnullnullnullnullnull\276nullnull\276\276nullnullnullnull\276nullnullnullnullnullnull\276nullnull\276\276nullnullnullnull\276nullnullnullnullnullnull\276nullnull\276\276nullnullnullnull\276nullnullnullnullnullnull\276nullnull\276\276nullnullnullnull\276nullnullnullnullnullnull\276nullnull\276\276nullnullnullnull\276nullnullnullnullnullnull\276nullnull!", "mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!mnppmnppmnppmnppmnppmnppmnppmnpp!!mnppmnppmnppmnppmnppmnppmnppmnpp!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\276\276PPNNPPNNPPNNPPNN\276PPNNPPNNPPNNPPNNPPNNPPNN\276PPNNPPNN\276\276PPNNPPNNPPNNPPNN\276PPNNPPNNPPNNPPNNPPNNPPNN\276PPNNPPNN\276\276PPNNPPNNPPNNPPNN\276PPNNPPNNPPNNPPNNPPNNPPNN\276PPNNPPNN\276\276PPNNPPNNPPNNPPNN\276PPNNPPNNPPNNPPNNPPNNPPNN\276PPNNPPNN\276\276PPNNPPNNPPNNPPNN\276PPNNPPNNPPNNPPNNPPNNPPNN\276PPNNPPNN\276\276PPNNPPNNPPNNPPNN\276PPNNPPNNPPNNPPNNPPNNPPNN\276PPNNPPNN\276\276PPNNPPNNPPNNPPNN\276PPNNPPNNPPNNPPNNPPNNPPNN\276PPNNPPNN\276\276PPNNPPNNPPNNPPNN\276PPNNPPNNPPNNPPNNPPNNPPNN\276PPNNPPNN!" + "'", str2, "\276\276PPNNPPNNPPNNPPNN\276PPNNPPNNPPNNPPNNPPNNPPNN\276PPNNPPNN\276\276PPNNPPNNPPNNPPNN\276PPNNPPNNPPNNPPNNPPNNPPNN\276PPNNPPNN\276\276PPNNPPNNPPNNPPNN\276PPNNPPNNPPNNPPNNPPNNPPNN\276PPNNPPNN\276\276PPNNPPNNPPNNPPNN\276PPNNPPNNPPNNPPNNPPNNPPNN\276PPNNPPNN\276\276PPNNPPNNPPNNPPNN\276PPNNPPNNPPNNPPNNPPNNPPNN\276PPNNPPNN\276\276PPNNPPNNPPNNPPNN\276PPNNPPNNPPNNPPNNPPNNPPNN\276PPNNPPNN\276\276PPNNPPNNPPNNPPNN\276PPNNPPNNPPNNPPNNPPNNPPNN\276PPNNPPNN\276\276PPNNPPNNPPNNPPNN\276PPNNPPNNPPNNPPNNPPNNPPNN\276PPNNPPNN!");
    }

    @Test
    public void test05989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05989");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("llLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLLllLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLL!!llLL~llLLllLLllLL~llLLllLL!", "nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!nullnullnullnull\256\254\254nullnullnullnull\256\254\254!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b!" + "'", str2, "\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b\u019b\u019b\u017b\u017b!");
    }

    @Test
    public void test05990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05990");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!!JJ!", "!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!!!]\253\253!]\253\253!!!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!]\253\253!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!" + "'", str2, "!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!!nullnull!");
    }

    @Test
    public void test05991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05991");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300\335\300\300\300!", "\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d\u019d!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05992");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!\300\300\336\336\300\300\336\336!!!", "nullnullnullnullijllijllijllijllnullnullnullnullijllijll!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!" + "'", str2, "nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!nullnullnullnullnullnullnullnull!!!");
    }

    @Test
    public void test05993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05993");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("!!~nullnull!!!!~nullnull!!!!!!~nullnull!!!!~nullnull!!!!!!~nullnull!!!!~nullnull!!!!~nullnull!!!!~nullnull!!!!!!~nullnull!!!!~nullnull!!!!!!~nullnull!!!!~nullnull!!!", "nullnull``!nullnull``nullnull``nullnull``!nullnull``nullnull``nullnull``!nullnull``nullnull``nullnull``!nullnull``nullnull``nullnull``!nullnull``nullnull``nullnull``!nullnull``nullnull``nullnull``!nullnull``nullnull``nullnull``!nullnull``nullnull``!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!~LNUULNUU!!!!~LNUULNUU!!!!!!~LNUULNUU!!!!~LNUULNUU!!!!!!~LNUULNUU!!!!~LNUULNUU!!!!~LNUULNUU!!!!~LNUULNUU!!!!!!~LNUULNUU!!!!~LNUULNUU!!!!!!~LNUULNUU!!!!~LNUULNUU!!!" + "'", str2, "!!~LNUULNUU!!!!~LNUULNUU!!!!!!~LNUULNUU!!!!~LNUULNUU!!!!!!~LNUULNUU!!!!~LNUULNUU!!!!~LNUULNUU!!!!~LNUULNUU!!!!!!~LNUULNUU!!!!~LNUULNUU!!!!!!~LNUULNUU!!!!~LNUULNUU!!!");
    }

    @Test
    public void test05994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05994");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("nulloprr!", "!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!!\214\214!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!\214\214\214\214!!!" + "'", str2, "!!\214\214\214\214!!!");
    }

    @Test
    public void test05995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05995");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214\u0180\u0180\u0180\u0180nullnull\214\214!", "LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!LNNN\256\254\254LNNN\256\254\254!!!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnull\333null\330\330\333null\330\330nullnull\333null\330\330\333null\330\330\214\214nullnull\333null\330\330\333null\330\330nullnull\333null\330\330\333null\330\330\214\214nullnull\333null\330\330\333null\330\330nullnull\333null\330\330\333null\330\330\214\214nullnull\333null\330\330\333null\330\330nullnull\333null\330\330\333null\330\330\214\214nullnull\333null\330\330\333null\330\330nullnull\333null\330\330\333null\330\330\214\214nullnull\333null\330\330\333null\330\330nullnull\333null\330\330\333null\330\330\214\214nullnull\333null\330\330\333null\330\330nullnull\333null\330\330\333null\330\330\214\214nullnull\333null\330\330\333null\330\330nullnull\333null\330\330\333null\330\330\214\214!" + "'", str2, "nullnull\333null\330\330\333null\330\330nullnull\333null\330\330\333null\330\330\214\214nullnull\333null\330\330\333null\330\330nullnull\333null\330\330\333null\330\330\214\214nullnull\333null\330\330\333null\330\330nullnull\333null\330\330\333null\330\330\214\214nullnull\333null\330\330\333null\330\330nullnull\333null\330\330\333null\330\330\214\214nullnull\333null\330\330\333null\330\330nullnull\333null\330\330\333null\330\330\214\214nullnull\333null\330\330\333null\330\330nullnull\333null\330\330\333null\330\330\214\214nullnull\333null\330\330\333null\330\330nullnull\333null\330\330\333null\330\330\214\214nullnull\333null\330\330\333null\330\330nullnull\333null\330\330\333null\330\330\214\214!");
    }

    @Test
    public void test05996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05996");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("\215}\215\215\215}\215\215NLLLNLLLNLLLNLLL\215}\215\215\215}\215\215!", "\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull\276\340\275\275\276\340\275\275nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\215}\215\215\215}\215\215\u017d\u0180\u0180\u0180\u017d\u0180\u0180\u0180\u017d\u0180\u0180\u0180\u017d\u0180\u0180\u0180\215}\215\215\215}\215\215!" + "'", str2, "\215}\215\215\215}\215\215\u017d\u0180\u0180\u0180\u017d\u0180\u0180\u0180\u017d\u0180\u0180\u0180\u017d\u0180\u0180\u0180\215}\215\215\215}\215\215!");
    }

    @Test
    public void test05997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05997");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("nullnullnullnullnullnullnullnullnullnullnullnullnullnull!", "!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!!\300\300!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05998");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300\300!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!" + "'", str2, "nullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnullnull!");
    }

    @Test
    public void test05999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05999");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.decode("", "nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!!nullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnullnullnullnullnull\200~~nullnullnullnull\200~~nullnullnullnullnullnullnullnull!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test06000");
        java.lang.String str2 = com.thealgorithms.ciphers.SimpleSubstitutionCipher.encode("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUnullUUUUUUUUUUUUnullUUUUUUUU!", "\u0366\u0365\u0368\u0368\u0346\u0348\u0348!");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNUNLLNNNNNNNNNNNNUNLLNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNUNLLNNNNNNNNNNNNUNLLNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNUNLLNNNNNNNNNNNNUNLLNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNUNLLNNNNNNNNNNNNUNLLNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNUNLLNNNNNNNNNNNNUNLLNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNUNLLNNNNNNNNNNNNUNLLNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNUNLLNNNNNNNNNNNNUNLLNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNUNLLNNNNNNNNNNNNUNLLNNNNNNNN!" + "'", str2, "NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNUNLLNNNNNNNNNNNNUNLLNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNUNLLNNNNNNNNNNNNUNLLNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNUNLLNNNNNNNNNNNNUNLLNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNUNLLNNNNNNNNNNNNUNLLNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNUNLLNNNNNNNNNNNNUNLLNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNUNLLNNNNNNNNNNNNUNLLNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNUNLLNNNNNNNNNNNNUNLLNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNUNLLNNNNNNNNNNNNUNLLNNNNNNNN!");
    }
}
